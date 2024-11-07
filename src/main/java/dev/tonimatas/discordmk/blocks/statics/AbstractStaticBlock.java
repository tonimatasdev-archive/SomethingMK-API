package dev.tonimatas.discordmk.blocks.statics;

import dev.tonimatas.discordmk.blocks.StaticBlock;

import java.util.UUID;

public abstract class AbstractStaticBlock implements StaticBlock {
    protected final UUID id = UUID.randomUUID();

    @Override
    public UUID getId() {
        return id;
    }
}
