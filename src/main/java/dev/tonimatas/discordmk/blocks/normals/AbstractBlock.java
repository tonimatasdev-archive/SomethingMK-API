package dev.tonimatas.discordmk.blocks.normals;

import dev.tonimatas.discordmk.blocks.NormalBlock;

import java.util.UUID;

public abstract class AbstractBlock implements NormalBlock {
    protected final UUID id = UUID.randomUUID();
    public final String actionTo;
    
    public AbstractBlock(String actionTo) {
        this.actionTo = actionTo;
    }

    @Override
    public String actionTo() {
        return actionTo;
    }

    @Override
    public UUID getId() {
        return id;
    }
}
