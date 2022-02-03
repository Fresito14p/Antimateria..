
package net.mcreator.pichula.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.pichula.init.PichulaModTabs;
import net.mcreator.pichula.init.PichulaModItems;

public class AntiHachaItem extends AxeItem {
	public AntiHachaItem() {
		super(new Tier() {
			public int getUses() {
				return 3500;
			}

			public float getSpeed() {
				return 17f;
			}

			public float getAttackDamageBonus() {
				return 18f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PichulaModItems.ANTI_HACHA));
			}
		}, 1, 0f, new Item.Properties().tab(PichulaModTabs.TAB_ANTIMATERI).fireResistant());
		setRegistryName("anti_hacha");
	}
}
