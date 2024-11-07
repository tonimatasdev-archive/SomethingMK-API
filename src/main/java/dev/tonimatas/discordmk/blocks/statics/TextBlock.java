package dev.tonimatas.discordmk.blocks.statics;

import dev.tonimatas.discordmk.blocks.BlockType;
import dev.tonimatas.discordmk.value.Value;
import dev.tonimatas.discordmk.value.ValueType;
import dev.tonimatas.discordmk.workspaces.Workspace;

public class TextBlock extends AbstractStaticBlock {
    public String text; 
    
    public TextBlock(String text) {
        super();
        this.text = text;
    }

    @Override
    public void run(Workspace workspace) {
        workspace.values.put(id + "-0", new Value(ValueType.STRING, text));
    }

    @Override
    public BlockType getType() {
        return BlockType.TEXT;
    }

    @Override
    public ValueType output() {
        return ValueType.STRING;
    }
}
