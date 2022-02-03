
package net.mcreator.pichula.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;

import net.mcreator.pichula.init.PichulaModTabs;

public class TitiItem extends PickaxeItem {
	public TitiItem() {
		super(new Tier() {
			public int getUses() {
				return 100000;
			}

			public float getSpeed() {
				return 30000f;
			}

			public float getAttackDamageBonus() {
				return 15f;
			}

			public int getLevel() {
				return 100;
			}

			public int getEnchantmentValue() {
				return 5000;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, 76f, new Item.Properties().tab(PichulaModTabs.TAB_ANTIMATERI).fireResistant());
		setRegistryName("titi");
	}
}
