package dev.tonimatas.discordmk.blocks.types;

import dev.tonimatas.discordmk.Action;
import dev.tonimatas.discordmk.blocks.Block;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Getter
@RequiredArgsConstructor
public abstract class AbstractBlock implements Block {
    protected final UUID id = UUID.randomUUID();
    public final Action action;
}
