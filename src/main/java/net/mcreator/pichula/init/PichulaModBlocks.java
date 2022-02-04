
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pichula.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.pichula.block.PetroleoBlock;
import net.mcreator.pichula.block.EstrellaBLBlock;
import net.mcreator.pichula.block.EarthbeginBlock;
import net.mcreator.pichula.block.BeginningPortalBlock;
import net.mcreator.pichula.block.AntimateriaBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PichulaModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block ANTIMATERIA = register(new AntimateriaBlock());
	public static final Block ESTRELLA_BL = register(new EstrellaBLBlock());
	public static final Block EARTHBEGIN = register(new EarthbeginBlock());
	public static final Block BEGINNING_PORTAL = register(new BeginningPortalBlock());
	public static final Block PETROLEO = register(new PetroleoBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
		}

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			EstrellaBLBlock.blockColorLoad(event);
		}
	}
}
