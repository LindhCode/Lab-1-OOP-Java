package org.example.lab1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.awt.Color.*;
import static org.junit.jupiter.api.Assertions.*;

class EngineTest {
    @Test
    @DisplayName("Test that the speedFactor method behaves properly based on turbo")
    public void speedFactorConsistency() {
        TurboEngine engineWithTurbo = new TurboEngine(100);
        RegularEngine engineWithoutTurbo = new RegularEngine(100);
        engineWithTurbo.setTurboOn();

        // Testa om speedFactor() är större för motor med turbo
        assertTrue(engineWithTurbo.speedFactor() > engineWithoutTurbo.speedFactor());

        // Testa om speedFactor är 30% större för motor med turbo
        // jämfört med utan turbo
        assertEquals(engineWithTurbo.speedFactor(), engineWithoutTurbo.speedFactor() * 1.3);
    }
}
