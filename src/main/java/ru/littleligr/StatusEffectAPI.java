package ru.littleligr;

import net.fabricmc.api.ModInitializer;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatusEffectAPI implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("status-effect-api");

	protected static final Map<Identifier, ExtendedStatusEffect> statusEffects = new HashMap<>();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

	}

	public static void register(Identifier identifier, ExtendedStatusEffect statusEffect) {
		statusEffects.put(identifier, statusEffect);
	}

}