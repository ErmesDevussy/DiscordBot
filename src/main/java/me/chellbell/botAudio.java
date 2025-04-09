package me.chellbell;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.managers.AudioManager;

public class botAudio extends ListenerAdapter {
    public void onMessageReceived(MessageReceivedEvent event) {
        if (!event.isFromGuild()) return;
        if (!event.getMessage().getContentRaw().startsWith("!play")) return;
        if (event.getAuthor().isBot()) return;

//        Guild guild = event.getGuild();
//        VoiceChannel channel = guild.getVoiceChannelsByName("General", true).get(0);
//        AudioManager manager = guild.getAudioManager();
//
//        manager.setSendingHandler(new MySendHandler);
//        manager.openAudioConnection(channel);
    }
}
