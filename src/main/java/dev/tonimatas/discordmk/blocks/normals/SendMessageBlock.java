package dev.tonimatas.discordmk.blocks.normals;

import dev.tonimatas.discordmk.blocks.BlockType;
import dev.tonimatas.discordmk.value.ValueType;
import dev.tonimatas.discordmk.workspaces.Workspace;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;

import java.util.List;

public class SendMessageBlock extends AbstractBlock {
    public String channelValueId;
    public String messageValueId;
    
    public SendMessageBlock(String actionTo, String channelValueId, String messageValueId) {
        super(actionTo);
        this.channelValueId = channelValueId;
        this.messageValueId = messageValueId;
    }

    @Override
    public void run(Workspace workspace) throws RuntimeException {
        TextChannel textChannel = workspace.values.get(channelValueId).getTextChannel();
        String message = workspace.values.get(messageValueId).getString();
        
        textChannel.sendMessage(message).queue();
    }

    @Override
    public BlockType getType() {
        return BlockType.SEND_MESSAGE;
    }

    @Override
    public List<ValueType> inputs() {
        return List.of(ValueType.TEXT_CHANNEL, ValueType.STRING);
    }

    @Override
    public List<ValueType> outputs() {
        return List.of();
    }
}
