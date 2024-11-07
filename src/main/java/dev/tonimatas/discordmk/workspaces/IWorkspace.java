package dev.tonimatas.discordmk.workspaces;

import dev.tonimatas.discordmk.value.ValueType;

import java.util.List;

public interface IWorkspace {
    String getName();
    
    WorkspaceType getType();
    
    void run();
    
    List<ValueType> outputs();
}
