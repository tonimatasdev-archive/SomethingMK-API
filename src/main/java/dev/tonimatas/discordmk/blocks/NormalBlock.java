package dev.tonimatas.discordmk.blocks;

import dev.tonimatas.discordmk.value.ValueType;

import java.util.List;

public interface NormalBlock extends Block {
    String actionTo();

    List<ValueType> inputs();

    List<ValueType> outputs();
}
