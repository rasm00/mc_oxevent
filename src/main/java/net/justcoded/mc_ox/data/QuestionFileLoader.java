package net.justcoded.mc_ox.data;

import net.justcoded.mc_core.components.configuration.YamlConfiguration;
import net.justcoded.mc_ox.OXEvent;
import net.justcoded.mc_ox.components.Question;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.*;

public class QuestionFileLoader {

    private static final YamlConfiguration QUESTION_DATA_FILE
            = new YamlConfiguration(OXEvent.getInstance(), "questions");

    public static Map<UUID, Question> getQuestionsFromFile() {
        Map<UUID, Question> map = new HashMap<>();
        Set<String> keys = new HashSet<>();

        try {
            ConfigurationSection questions = QUESTION_DATA_FILE.getConfig().getConfigurationSection("questions");
            if (questions == null) throw new NullPointerException("Check config, problably section 'questions' does not exist.");
            keys = questions.getKeys(false);

            keys.forEach(s -> {
                FileConfiguration config = QUESTION_DATA_FILE.getConfig();
                var question = config.getString("questions." + s + ".question");
                var answer = config.getBoolean("questions." + s + ".ANSWER");
                var id = UUID.fromString(config.getString("questions." + s + ".id"));

                map.put(id, new Question(question, answer, id));
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

        return map;
    }
}
