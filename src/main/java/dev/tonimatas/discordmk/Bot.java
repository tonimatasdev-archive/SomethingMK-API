package dev.tonimatas.discordmk;

import dev.tonimatas.discordmk.workspaces.IWorkspace;
import dev.tonimatas.discordmk.workspaces.WorkspaceType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.Event;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.GatewayIntent;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bot {
    public JDA jda;
    public List<IWorkspace> workspaces = new ArrayList<>();
    public final String id;
    public final String token;
    
    public Bot(String id, String token) {
        this.id = id;
        this.token = token;
        // TODO Workspaces
        start();
    }
    
    public void start() {
        this.jda = JDABuilder.create(token, Arrays.asList(GatewayIntent.values())).addEventListeners(getEvents()).build();
    }
    
    public void runWorkspace(WorkspaceType type, Event event) {
        for (IWorkspace workspace : workspaces) {
            if (workspace.getType() == type) {
                workspace.run(event);
            }
        }
    }
    
    private ListenerAdapter getEvents() {
        return new ListenerAdapter() {
            @Override
            public void onMessageReceived(@NotNull MessageReceivedEvent event) {
                if (!event.getAuthor().isBot()) {
                    Bot.this.runWorkspace(WorkspaceType.MESSAGE_RECEIVED, event);
                }
            }
        };
    }
}
