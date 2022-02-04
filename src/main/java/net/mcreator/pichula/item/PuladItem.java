
package net.mcreator.pichula.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.pichula.init.PichulaModTabs;

public class PuladItem extends Item {
	public PuladItem() {
		super(new Item.Properties().tab(PichulaModTabs.TAB_ANTIMATERI).stacksTo(64).fireResistant().rarity(Rarity.RARE));
		setRegistryName("pulad");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
