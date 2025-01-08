package Yaxye.runners.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class RunRepository {
    private List<Run> runs= new ArrayList<Run>();


    List<Run> findAll() {
        return runs;
    }

   Optional<Run> findById(Integer id) {
        return runs.stream() .filter(run -> run.id()==id).findFirst();
    }

    void create(Run run) {
        runs.add(run);
    }

    @PostConstruct
    public void init() {
        runs.add(new Run(1,"Monday morning Run",
                LocalDateTime.now(),
                LocalDateTime.now().plus(30, ChronoUnit.MINUTES),
                3, Location.INDOOR));


        runs.add(new Run(2, "Wendneys Morning Run",
                LocalDateTime.now(),
                LocalDateTime.now().plus(60, ChronoUnit.MINUTES),
                6, Location.INDOOR));

        runs.add(new Run(3, "Tuesday Morining Run", LocalDateTime.now(),
                LocalDateTime.now().plus(15, ChronoUnit.MINUTES),
                2, Location.INDOOR));
    }
}
