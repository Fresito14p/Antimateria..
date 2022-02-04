
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pichula.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.pichula.item.VaritaItem;
import net.mcreator.pichula.item.TitiItem;
import net.mcreator.pichula.item.PuladItem;
import net.mcreator.pichula.item.PetroleoItem;
import net.mcreator.pichula.item.GameItem;
import net.mcreator.pichula.item.BeginningItem;
import net.mcreator.pichula.item.AntimaterItem;
import net.mcreator.pichula.item.AntiPicoItem;
import net.mcreator.pichula.item.AntiPalaItem;
import net.mcreator.pichula.item.AntiHachaItem;
import net.mcreator.pichula.item.AntiEspadaItem;
import net.mcreator.pichula.item.AntiAzadaItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PichulaModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item GAME_HELMET = register(new GameItem.Helmet());
	public static final Item GAME_CHESTPLATE = register(new GameItem.Chestplate());
	public static final Item GAME_LEGGINGS = register(new GameItem.Leggings());
	public static final Item GAME_BOOTS = register(new GameItem.Boots());
	public static final Item TITI = register(new TitiItem());
	public static final Item ANTIMATERIA = register(PichulaModBlocks.ANTIMATERIA, PichulaModTabs.TAB_ANTIMATERI);
	public static final Item ANTIMATER = register(new AntimaterItem());
	public static final Item ANTI_PICO = register(new AntiPicoItem());
	public static final Item ANTI_HACHA = register(new AntiHachaItem());
	public static final Item ANTI_PALA = register(new AntiPalaItem());
	public static final Item ANTI_AZADA = register(new AntiAzadaItem());
	public static final Item ANTI_ESPADA = register(new AntiEspadaItem());
	public static final Item ESTRELLA_BL = register(PichulaModBlocks.ESTRELLA_BL, PichulaModTabs.TAB_ANTIMATERI);
	public static final Item MAGO = register(
			new SpawnEggItem(PichulaModEntities.MAGO, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)).setRegistryName("mago_spawn_egg"));
	public static final Item VARITA = register(new VaritaItem());
	public static final Item PULAD = register(new PuladItem());
	public static final Item EARTHBEGIN = register(PichulaModBlocks.EARTHBEGIN, PichulaModTabs.TAB_ANTIMATERI);
	public static final Item BEGINNING = register(new BeginningItem());
	public static final Item PETROLEO_BUCKET = register(new PetroleoItem());
	public static final Item TRONCODE_JUNGLA = register(PichulaModBlocks.TRONCODE_JUNGLA, PichulaModTabs.TAB_ANTIMATERI);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
