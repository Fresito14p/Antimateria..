
package net.mcreator.pichula.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.pichula.init.PichulaModFluids;

public class PetroleoBlock extends LiquidBlock {
	public PetroleoBlock() {
		super(PichulaModFluids.PETROLEO, BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
		setRegistryName("petroleo");
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}
