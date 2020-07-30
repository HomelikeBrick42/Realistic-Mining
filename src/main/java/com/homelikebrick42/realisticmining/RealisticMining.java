package com.homelikebrick42.realisticmining;

import net.fabricmc.api.ModInitializer;

public class RealisticMining implements ModInitializer {

    public static final String MOD_ID = "realisticmining";

    @Override
    public void onInitialize() {
        FabricItem.Register();
        FabricBlock.Register();
    }

}
