package com.homelikebrick42.realisticmining;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RealisticMining implements ModInitializer {

    public static final String MOD_ID = "realisticmining";

    public static final Item FABRIC_ITEM = new Item(new Item.Settings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fabric_item"), FABRIC_ITEM);
    }

}
