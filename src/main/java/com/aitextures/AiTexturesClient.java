package com.aitextures;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AiTexturesClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("aitextures");

    @Override
    public void onInitializeClient() {
        LOGGER.info("AI Textures mod initialized!");
    }
}
