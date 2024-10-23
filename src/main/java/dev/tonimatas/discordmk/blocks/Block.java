package dev.tonimatas.discordmk.blocks;

import dev.tonimatas.discordmk.Action;
import dev.tonimatas.discordmk.value.Value;

import java.util.Map;
import java.util.UUID;

public interface Block {
    UUID getId();
    
    Action getAction();

    Map<String, Value> run(Map<String, Value> values);
}
