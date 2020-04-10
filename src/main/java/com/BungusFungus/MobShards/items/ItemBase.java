package com.BungusFungus.MobShards.items;

import com.BungusFungus.MobShards.MobShards.Main;
import com.BungusFungus.MobShards.init.ModItems;
import com.BungusFungus.MobShards.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{	
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
