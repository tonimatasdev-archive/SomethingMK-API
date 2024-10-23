package dev.tonimatas.discordmk.blocks.types;

import dev.tonimatas.discordmk.Action;
import dev.tonimatas.discordmk.value.Value;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;

import java.util.Map;

public class SendMessage extends AbstractBlock {
    public String channelValueId;
    public String messageValueId;
    
    public SendMessage(Action action, String channelValueId, String messageValueId) {
        super(action);
        this.channelValueId = channelValueId;
        this.messageValueId = messageValueId;
    }

    @Override
    public Map<String, Value> run(Map<String, Value> values) {
        TextChannel textChannel = values.get(channelValueId).getTextChannel();
        String message = values.get(messageValueId).getString();
        
        textChannel.sendMessage(message).queue();
        return null;
    }
}
