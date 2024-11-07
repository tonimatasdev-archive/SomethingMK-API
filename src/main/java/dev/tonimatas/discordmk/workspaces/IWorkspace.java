package dev.tonimatas.discordmk.workspaces;

import dev.tonimatas.discordmk.value.ValueType;
import net.dv8tion.jda.api.events.Event;

import java.util.List;

public interface IWorkspace {
    String getName();
    
    WorkspaceType getType();
    
    void run(Event event);
    
    List<ValueType> outputs();
}
