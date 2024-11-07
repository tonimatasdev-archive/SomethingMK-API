package dev.tonimatas.discordmk.workspaces;

public interface IWorkspace {
    String getName();
    
    WorkspaceType getType();
    
    void run();
}
