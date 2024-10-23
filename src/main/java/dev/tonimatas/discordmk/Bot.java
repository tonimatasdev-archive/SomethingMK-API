package dev.tonimatas.discordmk;

import dev.tonimatas.discordmk.blocks.Block;
import dev.tonimatas.discordmk.blocks.StaticBlock;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import java.util.Arrays;
import java.util.List;

public class Bot {
    public JDA jda;
    public final String id;
    public final String token;
    public final List<Block> blocks;
    public final List<StaticBlock> staticBlocks;
    
    public Bot(String id, String token, List<Block> blocks, List<StaticBlock> staticBlocks) {
        this.id = id;
        this.token = token;
        this.blocks = blocks;
        this.staticBlocks = staticBlocks;
    }
    
    public void start() {
        this.jda = JDABuilder.create(token, Arrays.asList(GatewayIntent.values())).build();
    }
}
