
package net.mcreator.pichula.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class AntiPalaItem extends ShovelItem {
	public AntiPalaItem() {
		super(new Tier() {
			public int getUses() {
				return 3500;
			}

			public float getSpeed() {
				return 17f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PichulaModItems.ANTI_PALA));
			}
		},

				1, -3f,

				new Item.Properties().tab(PichulaModTabs.TAB_DELETED_MOD_ELEMENT).fireResistant());

		setRegistryName("anti_pala");
	}

}
