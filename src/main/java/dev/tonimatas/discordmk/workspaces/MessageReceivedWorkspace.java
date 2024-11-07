package dev.tonimatas.discordmk.workspaces;

import dev.tonimatas.discordmk.blocks.Block;
import dev.tonimatas.discordmk.blocks.NormalBlock;
import dev.tonimatas.discordmk.blocks.StaticBlock;
import dev.tonimatas.discordmk.value.ValueType;

import java.util.List;
import java.util.Map;

public class MessageReceivedWorkspace extends Workspace {
    public MessageReceivedWorkspace(String name, String actionTo, Map<String, NormalBlock> blocks, List<StaticBlock> staticBlocks) {
        super(name, actionTo, blocks, staticBlocks);
    }

    @Override
    public WorkspaceType getType() {
        return WorkspaceType.MESSAGE_RECEIVED;
    }

    @Override
    public void run() {
        // TODO: Add variables
        
        super.run();
    }

    @Override
    public List<ValueType> outputs() {
        return List.of(ValueType.TEXT_CHANNEL, ValueType.STRING);
    }
}
