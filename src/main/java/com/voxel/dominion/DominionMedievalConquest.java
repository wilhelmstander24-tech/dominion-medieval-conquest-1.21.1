package com.voxel.dominion;

import com.voxel.dominion.block.ModBlocks;
import com.voxel.dominion.item.ModItemGroups;
import com.voxel.dominion.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DominionMedievalConquest implements ModInitializer {
	public static final String MOD_ID = "dominion";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}