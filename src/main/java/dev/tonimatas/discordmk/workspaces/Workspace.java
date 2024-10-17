package dev.tonimatas.discordmk.workspaces;

import dev.tonimatas.discordmk.blocks.WorkspaceBlock;

public interface Workspace {
    String getName();
    
    WorkspaceType getType();
    
    WorkspaceBlock getMainBlock();
}
