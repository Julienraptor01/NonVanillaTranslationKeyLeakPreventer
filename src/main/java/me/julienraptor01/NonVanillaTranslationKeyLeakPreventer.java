package me.julienraptor01;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NonVanillaTranslationKeyLeakPreventer implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Non-Vanilla Translation Key Leak Preventer");

    @Override
    public void onInitializeClient() {
        LOGGER.info("Hello world!");
    }
}