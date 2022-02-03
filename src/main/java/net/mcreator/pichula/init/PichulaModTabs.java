
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pichula.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PichulaModTabs {
	public static CreativeModeTab TAB_ANTIMATERI;

	public static void load() {
		TAB_ANTIMATERI = new CreativeModeTab("tabantimateri") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PichulaModBlocks.ANTIMATERIA);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
