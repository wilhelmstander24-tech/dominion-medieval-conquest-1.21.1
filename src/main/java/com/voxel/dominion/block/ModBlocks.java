package com.voxel.dominion.block;

import com.voxel.dominion.DominionMedievalConquest;
import com.voxel.dominion.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block RAW_STEEL_BLOCK = registerBlock("raw_steel_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.ANCIENT_DEBRIS)));


    private static Block registerBlock(String name, Block block) {
        registerBlock(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(DominionMedievalConquest.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(DominionMedievalConquest.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        DominionMedievalConquest.LOGGER.info("Registering mod ModBlocks for" + DominionMedievalConquest.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries ->{
            fabricItemGroupEntries.add(ModBlocks.RAW_STEEL_BLOCK);
        });
    }
}
