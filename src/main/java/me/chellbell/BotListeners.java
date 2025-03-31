package me.chellbell;

import net.dv8tion.jda.api.events.channel.ChannelDeleteEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class BotListeners extends ListenerAdapter {
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        if (!event.getAuthor().isBot()) {
            String msgSend = event.getMessage().getContentRaw();
            event.getChannel ().sendMessage("This was sent: " + msgSend).queue();
            //System.out.println(msgSend);
        }
    }

    @Override
    public void onChannelDelete(@NotNull ChannelDeleteEvent event) {
        String channelName = event.getChannel().getName();

    }
}
