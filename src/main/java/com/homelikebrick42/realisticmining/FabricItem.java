package com.homelikebrick42.realisticmining;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class FabricItem extends Item {

    public FabricItem(Settings settings) {
        super(settings);
    }

    public static void Register() {
        FabricItem item = new FabricItem(new Item.Settings().group(ItemGroup.MISC));
        Registry.register(Registry.ITEM, new Identifier(RealisticMining.MOD_ID, "fabric_item"), item);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.playSound(SoundEvents.BLOCK_WOOL_BREAK, 1.0F, 1.0F);
        return new TypedActionResult<ItemStack>(ActionResult.SUCCESS, playerEntity.getStackInHand(hand));
    }
    
}