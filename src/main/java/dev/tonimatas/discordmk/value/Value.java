package dev.tonimatas.discordmk.value;

import dev.tonimatas.discordmk.Action;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;

public record Value(ValueType type, Object value) {
    public Action getAction() throws RuntimeException {
        return (Action) getOrNull(ValueType.ACTION);
    }
    
    public String getString() throws RuntimeException {
        return (String) getOrNull(ValueType.STRING);
    }

    public TextChannel getTextChannel() throws RuntimeException {
        return (TextChannel) getOrNull(ValueType.TEXT_CHANNEL);
    }
    
    private Object getOrNull(ValueType type) throws RuntimeException {
        if (this.type != type || this.value == null) {
            throw new RuntimeException("Error getting the type of Value.");
        }
        
        return this.value;
    }
}
