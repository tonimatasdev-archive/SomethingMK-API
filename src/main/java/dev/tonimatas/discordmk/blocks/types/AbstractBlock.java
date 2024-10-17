package dev.tonimatas.discordmk.blocks.types;

import dev.tonimatas.discordmk.Action;
import dev.tonimatas.discordmk.blocks.Block;

import java.util.UUID;

public abstract class AbstractBlock implements Block {
    public UUID id;
    public Action action;
    
    public AbstractBlock(Action action) {
        this.id = UUID.randomUUID();
        this.action = action;
    }
    
    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public Action getAction() {
        return action;
    }
}
