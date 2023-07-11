package learn.systempanic22.continuousdelivery.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alexandre AMEVOR
 */

@RestController
public class FootBallCompetitionController {

    private final FootBallCompetitionService footBallCompetitionService;

    public FootBallCompetitionController(FootBallCompetitionService footBallCompetitionService) {
        this.footBallCompetitionService = footBallCompetitionService;
    }

    @GetMapping("/competition/world-cup/{year}/host")
    public String getWorldCupHostForYear(@PathVariable int year){
        return footBallCompetitionService.getWorldCupHostCountry(year);
    }
}
