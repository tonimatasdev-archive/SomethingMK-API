package dev.tonimatas.discordmk.blocks;

import dev.tonimatas.discordmk.workspaces.Workspace;

import java.util.UUID;

public interface Block {
    UUID getId();
    
    void run(Workspace workspace) throws Exception;
    
    BlockType getType();
}
