package com.voxel.dominion.item;

import com.voxel.dominion.DominionMedievalConquest;
import com.voxel.dominion.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {

    public static final ItemGroup DOMINION_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(DominionMedievalConquest.MOD_ID, "dominion_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.GOLD_COIN))
                    .displayName(Text.translatable("itemgroup.dominion.dominion_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.GOLD_COIN);
                        entries.add(ModItems.COPPER_COIN);
                        entries.add(ModItems.SILWER_COIN);
                        entries.add(ModItems.GOLD_COIN);
                    })
                    .build());



    public static final ItemGroup DOMINION_BLOCKS = Registry.register(Registries.ITEM_GROUP,
           Identifier.of(DominionMedievalConquest.MOD_ID, "dominion_blocks"),
           FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.RAW_STEEL_BLOCK))
                   .displayName(Text.translatable("itemgroup.dominion.dominion_blocks"))
                   .entries((displayContext, entries) -> {
                    entries.add(ModBlocks.RAW_STEEL_BLOCK);
                   })
                   .build());


    public static void registerItemGroups(){
        DominionMedievalConquest.LOGGER.info("Registering mod item groups for " + DominionMedievalConquest.MOD_ID);
    }
}
