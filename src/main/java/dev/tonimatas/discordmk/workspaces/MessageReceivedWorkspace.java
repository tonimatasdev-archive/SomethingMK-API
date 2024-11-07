package dev.tonimatas.discordmk.workspaces;

import dev.tonimatas.discordmk.blocks.Block;
import dev.tonimatas.discordmk.blocks.StaticBlock;

import java.util.List;
import java.util.Map;

public class MessageReceivedWorkspace extends Workspace {
    public MessageReceivedWorkspace(String name, Map<String, Block> blocks, List<StaticBlock> staticBlocks) {
        super(name, blocks, staticBlocks);
    }

    @Override
    public WorkspaceType getType() {
        return WorkspaceType.MESSAGE_RECEIVED;
    }

    @Override
    public void run() {

    }
}
