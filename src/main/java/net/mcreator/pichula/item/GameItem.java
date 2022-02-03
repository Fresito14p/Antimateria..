
package net.mcreator.pichula.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.pichula.init.PichulaModTabs;
import net.mcreator.pichula.init.PichulaModItems;

public abstract class GameItem extends ArmorItem {
	public GameItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 901;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{30, 35, 50, 20}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 32;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PichulaModItems.GAME_HELMET), new ItemStack(PichulaModItems.GAME_CHESTPLATE),
						new ItemStack(PichulaModItems.GAME_LEGGINGS), new ItemStack(PichulaModItems.GAME_BOOTS),
						new ItemStack(PichulaModItems.ANTIMATER));
			}

			@Override
			public String getName() {
				return "game";
			}

			@Override
			public float getToughness() {
				return 10f;
			}

			@Override
			public float getKnockbackResistance() {
				return 5f;
			}
		}, slot, properties);
	}

	public static class Helmet extends GameItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(PichulaModTabs.TAB_ANTIMATERI));
			setRegistryName("game_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pichula:textures/models/armor/armadura_a_layer_1.png";
		}
	}

	public static class Chestplate extends GameItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(PichulaModTabs.TAB_ANTIMATERI));
			setRegistryName("game_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pichula:textures/models/armor/armadura_a_layer_1.png";
		}
	}

	public static class Leggings extends GameItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(PichulaModTabs.TAB_ANTIMATERI));
			setRegistryName("game_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pichula:textures/models/armor/armadura_a_layer_2.png";
		}
	}

	public static class Boots extends GameItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(PichulaModTabs.TAB_ANTIMATERI));
			setRegistryName("game_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "pichula:textures/models/armor/armadura_a_layer_1.png";
		}
	}
}
