
package net.mcreator.pichula.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class AntiEspadaItem extends PickaxeItem {
	public AntiEspadaItem() {
		super(new Tier() {
			public int getUses() {
				return 3500;
			}

			public float getSpeed() {
				return 17f;
			}

			public float getAttackDamageBonus() {
				return 15f;
			}

			public int getLevel() {
				return 5;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PichulaModItems.ANTI_ESPADA));
			}
		},

				1, 1f,

				new Item.Properties().tab(PichulaModTabs.TAB_DELETED_MOD_ELEMENT));

		setRegistryName("anti_espada");
	}

}
