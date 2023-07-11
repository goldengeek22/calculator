package learn.systempanic22.continuousdelivery.restservice;

import org.springframework.stereotype.Service;

/**
 * @author Alexandre AMEVOR
 */

@Service
public class FootBallCompetitionService {

    public String getWorldCupHostCountry(int year){
        return "Brazil";
    }
}
