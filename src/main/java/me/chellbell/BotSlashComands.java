package me.chellbell;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.jetbrains.annotations.NotNull;

import net.dv8tion.jda.api.events.guild.GuildReadyEvent;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.Commands;

public class BotSlashComands extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        // Array dla komendy '/quote'
        ArrayList<String> quotes = new ArrayList<String>();
        quotes.add("```Okay. I wanted to become an aerostatic pilot. Then I turned ten and realized we no longer have an air force.```");
        quotes.add("```Got any dope? We need some dope bad. I got the *Boogie Street* shakes.```");
        quotes.add("```I have a cigarette every night when I go over my notes. It's something of a ritual.```");
        quotes.add("```Oh yeah? I did 15 years in the Juvenile Crime Unit. I can *do* age-inappropriate. Now check *this* shit out!```");
        quotes.add("```Thank you for your advice, Eugene. And you too, Alain. I do always appreciate a good use of the expression 'milkers'.```");
        quotes.add("```Every school of thought and government has failed in this city -- but I love it nonetheless. It belongs to me as much as it belongs to you.```");
        quotes.add("```Sunrise, Parabellum. Sunrise, Prepare-for-War. It's an old revolutionary saying.```");
        quotes.add("```Daba-doop-doop-dead.```");
        quotes.add("```Hello, I'm Kim Kitsuragi. His grip is firm. Lieutenant, Precinct 57. You must be from the 41st...```");
        quotes.add("```You're barking up the wrong tree. I don't speak a word of Seolite, I've never met either one of my grandparents. And I've never *been* to Seol. He seems almost proud of these things. I'm a regular Revacholiere.```");
        quotes.add("```Don't you *Welcome to Revachol* me, the lieutenant fires back. My grandfather came to here from a three-thousand-year-old racist-isolationist culture, while your ancestors came to this island a mere three hundred years ago...```");
        quotes.add("```For real detective work, nothing beats a good notebook by your side...```");
        // koniec Array

        String command = event.getName();
        switch (command) {
            case "welcome":
                String userTag = event.getUser().getAsMention();
                event.reply("Hello detective " + userTag +".").queue();
                break;
        
            case "quote":
                Random random = new Random();
                int randItem = random.nextInt(quotes.size());

                event.reply(quotes.get(randItem)).queue();
                break;

            default:
                break;
        }
    }

    //Giuld commands -- instant uptade (limit 100)
    @Override
    public void onGuildReady(GuildReadyEvent event) {
        List<CommandData> commandData = new ArrayList<>();
        // /welcome
        commandData.add(Commands.slash("welcome", "Get welcomed by the bot."));
        event.getGuild().updateCommands().addCommands(commandData).queue();
        // /quotes
        commandData.add(Commands.slash("quote", "Random Kim wisdom."));
        event.getGuild().updateCommands().addCommands(commandData).queue();
    }
    
}
