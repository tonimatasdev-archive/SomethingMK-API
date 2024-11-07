package dev.tonimatas.discordmk.blocks.normals;

import dev.tonimatas.discordmk.Action;
import dev.tonimatas.discordmk.blocks.NormalBlock;

import java.util.UUID;

public abstract class AbstractBlock implements NormalBlock {
    protected final UUID id = UUID.randomUUID();
    public final Action action;
    
    public AbstractBlock(Action action) {
        this.action = action;
    }

    @Override
    public Action getAction() {
        return action;
    }

    @Override
    public UUID getId() {
        return id;
    }
}
