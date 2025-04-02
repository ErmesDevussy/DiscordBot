package me.chellbell;

import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.entities.channel.unions.MessageChannelUnion;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BotLogger extends ListenerAdapter {
    // Wypisywanie logów do konsoli
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        if (!event.getAuthor().isBot()) {
            User author = event.getAuthor();
            MessageChannelUnion channel = event.getChannel();
            String message = event.getMessage().getContentRaw();
            DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String zformatowanaData = LocalDateTime.now().format(dataFormat);

            System.out.printf("[%s] %s %#s: %s\n",
                    channel,
                    zformatowanaData,
                    author,
                    message);
        }
    }
}
