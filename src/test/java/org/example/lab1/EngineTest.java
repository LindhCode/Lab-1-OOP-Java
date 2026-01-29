package org.example.lab1;

import org.junit.jupiter.api.Test;

import static java.awt.Color.*;
import static org.junit.jupiter.api.Assertions.*;

class EngineTest {
    @Test
    public void turboMethodsUseability() {
        Engine engineWithTurbo = new Engine(100, true);
        Engine engineWithoutTurbo = new Engine(100, false);

        // Testa om turbo kan sättas igång, resp stängas av
        // för motor med turbo.
        engineWithTurbo.setTurboOn();
        assertTrue(engineWithTurbo.isTurboOn());
        engineWithTurbo.setTurboOff();
        assertFalse(engineWithoutTurbo.isTurboOn());

        // Testa om turbo kan sättas igång för en motor
        // utan turbo
        engineWithoutTurbo.setTurboOn();
        assertFalse(engineWithoutTurbo.isTurboOn());
    }

    @Test
    public void speedFactorConsistency() {
        Engine engineWithTurbo = new Engine(100, true);
        Engine engineWithoutTurbo = new Engine(100, false);
        engineWithTurbo.setTurboOn();

        // Testa om speedFactor() är större för motor med turbo
        assertTrue(engineWithTurbo.speedFactor() > engineWithoutTurbo.speedFactor());

        // Testa om speedFactor är 30% större för motor med turbo
        // jämfört med utan turbo
        assertEquals(engineWithTurbo.speedFactor(), engineWithoutTurbo.speedFactor() * 1.3);
    }
}
