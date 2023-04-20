package academy.prog.javaprobot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@Configuration
public class AppConfig {
    @Bean
    public TelegramBotsApi botsApi() {
        try {
            return new TelegramBotsApi(DefaultBotSession.class);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
