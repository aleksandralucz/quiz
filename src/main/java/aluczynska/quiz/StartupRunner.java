package aluczynska.quiz;

import aluczynska.quiz.database.entities.PlayerEntity;
import aluczynska.quiz.dto.CategoriesDto;
import aluczynska.quiz.repository.PlayerRepository;
import aluczynska.quiz.service.QuizDataService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@Component
@Log
public class StartupRunner implements CommandLineRunner {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private QuizDataService quizDataService;

    @Override
    public void run(String...args){
        log.info("Executing startup actions...");
        playerRepository.save(new PlayerEntity("John"));
        playerRepository.save(new PlayerEntity("Harry"));
        playerRepository.save(new PlayerEntity("George"));

        log.info("List of players from database:");
        List<PlayerEntity> playersFromDatabase = playerRepository.findAll();
        for (PlayerEntity player : playersFromDatabase) {
            log.info("Retrieved player: " + player);
        }
    }





}