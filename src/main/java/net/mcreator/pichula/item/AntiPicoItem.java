
package net.mcreator.pichula.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;

import net.mcreator.pichula.init.PichulaModTabs;

public class AntiPicoItem extends PickaxeItem {
	public AntiPicoItem() {
		super(new Tier() {
			public int getUses() {
				return 3500;
			}

			public float getSpeed() {
				return 15f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -1f, new Item.Properties().tab(PichulaModTabs.TAB_ANTIMATERI).fireResistant());
		setRegistryName("anti_pico");
	}
}
