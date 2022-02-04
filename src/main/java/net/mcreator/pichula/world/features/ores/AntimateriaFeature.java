
package net.mcreator.pichula.world.features.ores;

public class AntimateriaFeature extends OreFeature {

	public static final AntimateriaFeature FEATURE = (AntimateriaFeature) new AntimateriaFeature().setRegistryName("pichula:antimateria");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(AntimateriaFeatureRuleTest.INSTANCE, PichulaModBlocks.ANTIMATERIA.defaultBlockState(), 6))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(4), VerticalAnchor.absolute(13)))).squared().count(6);

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public AntimateriaFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;

		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;

		if (!dimensionCriteria)
			return false;

		return super.place(context);
	}

	private static class AntimateriaFeatureRuleTest extends RuleTest {

		static final AntimateriaFeatureRuleTest INSTANCE = new AntimateriaFeatureRuleTest();
		static final com.mojang.serialization.Codec<AntimateriaFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);

		static final RuleTestType<AntimateriaFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("pichula:antimateria_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;

			if (blockAt.getBlock() == Blocks.STONE)
				blockCriteria = true;

			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
