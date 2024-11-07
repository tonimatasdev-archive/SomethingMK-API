package dev.tonimatas.discordmk.workspaces;

import dev.tonimatas.discordmk.blocks.NormalBlock;
import dev.tonimatas.discordmk.blocks.StaticBlock;
import dev.tonimatas.discordmk.value.Value;
import dev.tonimatas.discordmk.value.ValueType;
import net.dv8tion.jda.api.events.Event;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.List;
import java.util.Map;

public class MessageReceivedWorkspace extends Workspace {
    public MessageReceivedWorkspace(String name, String actionTo, Map<String, NormalBlock> blocks, List<StaticBlock> staticBlocks) {
        super(name, actionTo, blocks, staticBlocks);
    }

    @Override
    public WorkspaceType getType() {
        return WorkspaceType.MESSAGE_RECEIVED;
    }

    @Override
    public void run(Event rawEvent) {
        if (rawEvent instanceof MessageReceivedEvent event) {
            values.put("workspace-0", new Value(ValueType.TEXT_CHANNEL, event.getChannel().asTextChannel()));
            values.put("workspace-1", new Value(ValueType.TEXT_CHANNEL, event.getMessage().getContentRaw()));
            run();
        }
    }

    @Override
    public List<ValueType> outputs() {
        return List.of(ValueType.TEXT_CHANNEL, ValueType.STRING);
    }
}
