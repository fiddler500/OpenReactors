/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2015
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ReactorCraft.Items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import Reika.ReactorCraft.Auxiliary.RadiationEffects;
import Reika.ReactorCraft.Base.ItemReactorMulti;
import Reika.ReactorCraft.Registry.ReactorAchievements;

public class ItemPlutonium extends ItemReactorMulti {

	public ItemPlutonium(int tex) {
		super(tex);
	}

	@Override
	public void onUpdate(ItemStack is, World world, Entity e, int slot, boolean flag) {
		if (e instanceof EntityPlayer) {
			EntityPlayer ep = (EntityPlayer)e;
			if (!ep.capabilities.isCreativeMode) {
				if (!RadiationEffects.instance.hasHazmatSuit(ep)) {
					ep.addPotionEffect(RadiationEffects.instance.getRadiationEffect(1200));
					ReactorAchievements.PUPOISON.triggerAchievement(ep);
				}
			}
		}
	}
}
