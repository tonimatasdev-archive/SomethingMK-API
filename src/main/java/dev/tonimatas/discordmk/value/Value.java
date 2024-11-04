package dev.tonimatas.discordmk.value;

import dev.tonimatas.discordmk.Action;
import lombok.extern.slf4j.Slf4j;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;

@Slf4j
public record Value(ValueType type, Object value) {
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
            log.error("Invalid value type: {}", this.type);
            return null;
        }
        
        return this.value;
    }
}
