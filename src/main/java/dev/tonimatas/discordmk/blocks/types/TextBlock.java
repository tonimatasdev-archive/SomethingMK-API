package dev.tonimatas.discordmk.blocks.types;

import dev.tonimatas.discordmk.Action;
import dev.tonimatas.discordmk.value.Value;
import dev.tonimatas.discordmk.value.ValueType;

import java.util.Map;

public class TextBlock extends AbstractBlock {
    public String text; 
    
    public TextBlock(Action action, String text) {
        super(action);
        this.text = text;
    }

    @Override
    public Map<String, Value> run(Map<String, Value> values) {
        values.put(id + "-0", new Value(ValueType.STRING, text));
        return values;
    }
}
