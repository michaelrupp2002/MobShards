package com.BungusFungus.MobShards.init;

import java.util.ArrayList;
import java.util.List;

import com.BungusFungus.MobShards.blocks.BlockBase;
import com.BungusFungus.MobShards.blocks.DivorciumBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block DIVORCIUM_BLOCK = new DivorciumBlock("divorcium_block", Material.IRON);

}
