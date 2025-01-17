/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2015
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
package Reika.ReactorCraft.Auxiliary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import net.minecraft.item.ItemStack;
import Reika.DragonAPI.Instantiable.Data.WeightedRandom;
import Reika.DragonAPI.Libraries.MathSci.Isotopes;
import Reika.ReactorCraft.Registry.ReactorItems;

public class WasteManager {

	private static final ArrayList<Isotopes> wastes = new ArrayList<Isotopes>();
	private static final WeightedRandom<Isotopes> yields = new WeightedRandom();
	private static final Random r = new Random();

	private static void addWaste(Isotopes iso, double percent) {
		wastes.add(iso);
		yields.addEntry(iso, percent);
	}

	static {
		addWaste(Isotopes.Cs134, 6.79);
		addWaste(Isotopes.Xe135, 6.33);
		addWaste(Isotopes.Zr93, 6.30);
		addWaste(Isotopes.Mo99, 6.10);
		addWaste(Isotopes.Cs137, 6.09);
		addWaste(Isotopes.Tc99, 6.05);
		addWaste(Isotopes.Sr90, 5.75);
		addWaste(Isotopes.I131, 2.83);
		addWaste(Isotopes.Pm147, 2.27);
		addWaste(Isotopes.I129, 0.66);
		addWaste(Isotopes.Sm151, 0.42);
		addWaste(Isotopes.Ru106, 0.39);
		addWaste(Isotopes.Kr85, 0.27);
		addWaste(Isotopes.Pd107, 0.16);
		addWaste(Isotopes.Se79, 0.05);
		addWaste(Isotopes.Gd155, 0.03);
		addWaste(Isotopes.Sb125, 0.03);
		addWaste(Isotopes.Sn126, 0.02);
	}

	public static Isotopes getRandomWaste() {
		return yields.getRandomEntry();
	}

	public static int getFullyRandomWaste() {
		int i = r.nextInt(wastes.size());
		return i;
	}

	public static int getNumberWastes() {
		return wastes.size();
	}

	public static List<Isotopes> getWasteList() {
		return Collections.unmodifiableList(wastes);
	}

	public static ItemStack getRandomWasteItem() {
		Isotopes atom = getRandomWaste();
		ItemStack is = ReactorItems.WASTE.getStackOfMetadata(wastes.indexOf(atom));
		return is;
	}

	public static ItemStack getFullyRandomWasteItem() {
		int i = getFullyRandomWaste();
		Isotopes atom = wastes.get(i);
		ItemStack is = ReactorItems.WASTE.getStackOfMetadata(i);
		return is;
	}

}
