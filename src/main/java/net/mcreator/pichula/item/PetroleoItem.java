
package net.mcreator.pichula.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.pichula.init.PichulaModTabs;
import net.mcreator.pichula.init.PichulaModFluids;

public class PetroleoItem extends BucketItem {
	public PetroleoItem() {
		super(() -> PichulaModFluids.PETROLEO,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(PichulaModTabs.TAB_ANTIMATERI));
		setRegistryName("petroleo_bucket");
	}
}
