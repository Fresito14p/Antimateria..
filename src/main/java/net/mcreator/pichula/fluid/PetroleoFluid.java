
package net.mcreator.pichula.fluid;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.pichula.init.PichulaModItems;
import net.mcreator.pichula.init.PichulaModFluids;
import net.mcreator.pichula.init.PichulaModBlocks;

public abstract class PetroleoFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> PichulaModFluids.PETROLEO,
			() -> PichulaModFluids.FLOWING_PETROLEO,
			FluidAttributes.builder(new ResourceLocation("pichula:blocks/petroleo"), new ResourceLocation("pichula:blocks/petroleo"))

					.sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.pointed_dripstone.drip_water"))))
							.explosionResistance(100f).canMultiply()

							.bucket(() -> PichulaModItems.PETROLEO_BUCKET).block(() -> (LiquidBlock) PichulaModBlocks.PETROLEO);

	private PetroleoFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EXPLOSION;
	}

	public static class Source extends PetroleoFluid {
		public Source() {
			super();
			setRegistryName("petroleo");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends PetroleoFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_petroleo");
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
