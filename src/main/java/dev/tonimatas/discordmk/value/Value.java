package dev.tonimatas.discordmk.value;

import dev.tonimatas.discordmk.Action;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public record Value(ValueType type, Object value) {
    private static final Logger LOGGER = LoggerFactory.getLogger(Value.class);
    
    public Action getAction() {
        return (Action) getOrNull(ValueType.ACTION);
    }
    
    public String getString() {
        return (String) getOrNull(ValueType.STRING);
    }

    public TextChannel getTextChannel() {
        return (TextChannel) getOrNull(ValueType.TEXT_CHANNEL);
    }
    
    private Object getOrNull(ValueType type) {
        if (this.type != type) {
            LOGGER.error("Invalid value type: {}", this.type);
            return null;
        }
        
        return this.value;
    }
}
