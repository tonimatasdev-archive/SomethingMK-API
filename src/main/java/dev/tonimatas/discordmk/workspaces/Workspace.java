package dev.tonimatas.discordmk.workspaces;

import dev.tonimatas.discordmk.blocks.Block;
import dev.tonimatas.discordmk.blocks.NormalBlock;
import dev.tonimatas.discordmk.blocks.StaticBlock;
import dev.tonimatas.discordmk.value.Value;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Workspace implements IWorkspace {
    public String name;
    public String actionTo;
    public Map<String, Value> values = new HashMap<>();
    public Map<String, NormalBlock> blocks;
    public List<StaticBlock> staticBlocks;
    
    public Workspace(String name, String actionTo, Map<String, NormalBlock> blocks, List<StaticBlock> staticBlocks) {
        this.name = name;
        this.actionTo = actionTo;
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
                throw new RuntimeException("Error executing static blocks of Workspace " + name + ": " + e);
            }
        }

        try {
            executeAndNext(actionTo);
        } catch (Exception e) {
            throw new RuntimeException("Error executing normal blocks of Workspace " + name + ": " + e);
        }
    }
    
    private void executeAndNext(String actionTo) throws Exception {
        NormalBlock block = blocks.get(actionTo);
        
        block.run(this);

        if (!block.actionTo().equals("none")) {
            executeAndNext(block.actionTo());
        }
    }
}
