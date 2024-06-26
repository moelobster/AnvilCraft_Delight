package lobster.moe.anvilcook.block.grow;

import lobster.moe.anvilcook.features.ModTreeFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class LemonTreeGrower extends AbstractTreeGrower {
    public LemonTreeGrower(){

    }
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource randomSource, boolean bl) {
        return ModTreeFeatures.LEMONTREE;
    }
}
