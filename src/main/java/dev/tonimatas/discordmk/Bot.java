package dev.tonimatas.discordmk;

import dev.tonimatas.discordmk.blocks.Block;
import dev.tonimatas.discordmk.blocks.StaticBlock;

import java.util.List;

public class Bot {
    public String id;
    public String token;
    public List<Block> blocks;
    public List<StaticBlock> staticBlocks;
    
    public Bot(String id, String token, List<Block> blocks, List<StaticBlock> staticBlocks) {
        this.id = id;
        this.token = token;
        this.blocks = blocks;
        this.staticBlocks = staticBlocks;
    }
}
