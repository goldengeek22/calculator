package learn.systempanic22.continuousdelivery.restservice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FootBallCompetitionServiceTest {

    private FootBallCompetitionService footBallCompetitionService = new FootBallCompetitionService();
    @Test
    void getWorldCupHostCountry() {
        assertEquals("Brazil",footBallCompetitionService.getWorldCupHostCountry(2022));
    }
}