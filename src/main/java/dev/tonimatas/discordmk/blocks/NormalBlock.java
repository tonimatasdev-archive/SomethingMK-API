package dev.tonimatas.discordmk.blocks;

import dev.tonimatas.discordmk.Action;
import dev.tonimatas.discordmk.value.ValueType;

import java.util.List;

public interface NormalBlock extends Block {
    Action getAction();

    List<ValueType> inputs();

    List<ValueType> outputs();
}
