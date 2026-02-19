package com.voxel.dominion.item;

import com.voxel.dominion.DominionMedievalConquest;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COPPER_COIN = registerItem("copper_coin", new Item(new Item.Settings()));
    public static final Item GOLD_COIN = registerItem("gold_coin", new Item(new Item.Settings()));
    public static final Item SILWER_COIN = registerItem("SILWER_coin", new Item(new Item.Settings()));
    public static final Item RAW_STEEL_INGOT = registerItem("raw_steel_ingot", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DominionMedievalConquest.MOD_ID, name), item);
    }

    public static void registerModItems(){
        DominionMedievalConquest.LOGGER.info("Registering mod items for " + DominionMedievalConquest.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(COPPER_COIN);
            fabricItemGroupEntries.add(GOLD_COIN);
            fabricItemGroupEntries.add(SILWER_COIN);
            fabricItemGroupEntries.add(RAW_STEEL_INGOT);
        });
    }
}
