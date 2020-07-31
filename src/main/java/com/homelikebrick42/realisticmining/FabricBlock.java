package com.homelikebrick42.realisticmining;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FabricBlock extends Block {

    public FabricBlock() {
        super(FabricBlockSettings
            .of(Material.WOOL)
            .breakByHand(false)
            .breakByTool(FabricToolTags.HOES)
            .sounds(BlockSoundGroup.WOOL)
            .strength(2.0F, 0.2F)
        );
    }

    public static void Register() {
        FabricBlock block = new FabricBlock();
        Registry.register(Registry.BLOCK, new Identifier(RealisticMining.MOD_ID, "fabric_block"), block);
        Registry.register(Registry.ITEM, new Identifier(RealisticMining.MOD_ID, "fabric_block"), new BlockItem(block, new Item.Settings().group(ItemGroup.MISC).maxCount(512)));
    }
    
}