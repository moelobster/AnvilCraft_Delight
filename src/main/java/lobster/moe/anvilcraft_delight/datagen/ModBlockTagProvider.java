package lobster.moe.anvilcraft_delight.datagen;

import lobster.moe.anvilcraft_delight.init.ModBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    protected void addTags(HolderLookup.Provider arg) {
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlock.PEARLOG)
                .add(ModBlock.PEARWOOD)
                .add(ModBlock.LEMONLOG)
                .add(ModBlock.LEMONWOOD)
                .add(ModBlock.WALNUTLOG)
                .add(ModBlock.WALNUTWOOD)
                .add(ModBlock.BANANALOG)
                .add(ModBlock.BANANAWOOD)
                .add(ModBlock.PEACHLOG)
                .add(ModBlock.PEACHWOOD)
                .add(ModBlock.COCONUTLOG)
                .add(ModBlock.COCONUTWOOD)
                .add(ModBlock.CARAMBOLALOG)
                .add(ModBlock.CARAMBOLAWOOD)
                .add(ModBlock.TOONLOG)
                .add(ModBlock.TOONWOOD);


    }
}