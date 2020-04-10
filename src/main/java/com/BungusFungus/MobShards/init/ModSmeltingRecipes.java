package com.BungusFungus.MobShards.init;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModSmeltingRecipes {

	public static void init() {
		GameRegistry.addSmelting(ModItems.DIVORCIUM, new ItemStack(Blocks.DIAMOND_BLOCK, 2), 1.5F);
	}
}
