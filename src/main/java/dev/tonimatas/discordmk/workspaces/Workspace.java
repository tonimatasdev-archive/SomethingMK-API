package dev.tonimatas.discordmk.workspaces;

import dev.tonimatas.discordmk.blocks.Block;
import dev.tonimatas.discordmk.blocks.StaticBlock;
import dev.tonimatas.discordmk.value.Value;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Workspace implements IWorkspace {
    public String name;
    public Map<String, Value> values = new HashMap<>();
    public Map<String, Block> blocks;
    public List<StaticBlock> staticBlocks;
    
    public Workspace(String name, Map<String, Block> blocks, List<StaticBlock> staticBlocks) {
        this.name = name;
        this.blocks = blocks;
        this.staticBlocks = staticBlocks;
    } 
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void run() {
        for (StaticBlock staticBlock : staticBlocks) {
            try {
                staticBlock.run(this);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
