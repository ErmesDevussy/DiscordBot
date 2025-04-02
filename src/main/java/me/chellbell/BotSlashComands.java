package me.chellbell;

import org.jetbrains.annotations.NotNull;

import net.dv8tion.jda.api.events.guild.GuildReadyEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class BotSlashComands extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        String command = event.getName();
        switch (command) {
            //run the '/welcome' command
            case "welcome":
                String userTag = event.getUser().getAsTag();
                event.reply("Hello detective " + userTag +".").queue();
                break;

            default:
                break;
        }
    }

    //Giuld commands -- instant uptade (limit 100)
    @Override
    public void onGuildReady(GuildReadyEvent event) {
        super.onGuildReady(event);
    }
    
}
