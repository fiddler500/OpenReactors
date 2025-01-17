/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2015
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ReactorCraft.Registry;

import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public enum MatBlocks {

	CONCRETE("block.concrete"),
	SLAG("block.slag"),
	CALCITE("block.calcite"),
	SCRUBBER("block.scrubber");

	private String name;

	public static final MatBlocks[] matList = values();

	private MatBlocks(String n) {
		name = n;
	}

	public String getName() {
		return StatCollector.translateToLocal(name);
	}

	public boolean isMultiSidedTexture() {
		if (this == SCRUBBER)
			return true;
		return false;
	}

	public ItemStack getStackOf() {
		return new ItemStack(ReactorBlocks.MATS.getBlockInstance(), 1, this.ordinal());
	}

	public ItemStack getStackOf(int size) {
		return new ItemStack(ReactorBlocks.MATS.getBlockInstance(), size, this.ordinal());
	}

}
