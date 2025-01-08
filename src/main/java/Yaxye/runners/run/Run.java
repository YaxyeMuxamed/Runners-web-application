package Yaxye.runners.run;

import java.time.LocalDateTime;

public record Run(
        Integer id,
        String title,
        LocalDateTime startedOn,
        LocalDateTime completedON,
        Integer miles,
        Location location

                  )
{
}
