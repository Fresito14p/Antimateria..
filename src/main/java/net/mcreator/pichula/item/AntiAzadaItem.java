
package net.mcreator.pichula.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class AntiAzadaItem extends HoeItem {
	public AntiAzadaItem() {
		super(new Tier() {
			public int getUses() {
				return 3500;
			}

			public float getSpeed() {
				return 17f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PichulaModItems.ANTI_AZADA));
			}
		},

				0, -2f,

				new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant());

		setRegistryName("anti_azada");
	}

}
