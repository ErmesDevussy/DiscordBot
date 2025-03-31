package me.chellbell;

// import java.util.Collection;
// import java.util.EnumSet;

// import javax.print.DocFlavor.STRING;
import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
// import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
// import net.dv8tion.jda.api.interactions.InteractionContextType;
// import net.dv8tion.jda.api.interactions.commands.Command;
// import net.dv8tion.jda.api.requests.GatewayIntent;
// import net.dv8tion.jda.api.requests.restaction.CommandListUpdateAction;

public class discordBot {
    public static void main(String[] args) throws LoginException {
        JDA jda = JDABuilder.createDefault("")
            .setActivity(Activity.playing("Balling"))
            // .addEventListeners(new SlahsBotExpample())
            .build();

    //     CommandListUpdateAction commands = jda.updateCommands();

    //     commands.addCommands(
    //         Commands.slash("say", "Dayum")
    //             .setContexts(InteractionContextType.ALL)
    //             .addOption(STRING, "content", "What the bot should say", true)
    //     );

    //     commands.queue();
    // }

    // public void say(SlashCommandInteractionEvent event, String content) {
    //     event.reply(content).queue();
    }
}
