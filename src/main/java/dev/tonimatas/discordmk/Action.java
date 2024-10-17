package dev.tonimatas.discordmk;

public record Action(String from, String to) {
    public String from() {
        return from;
    }
    
    public String to() {
        return to;
    }
}
