package com.BungusFungus.MobShards.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class DivorciumBlock extends BlockBase 
{

	public DivorciumBlock(String name, Material material) 
	{
		super(name, material);	
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(30.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(1.0F);
		//setLightOpacicty(1);
		//setBlockUnbreakable(1);
		
	}

}
