package lobster.moe.anvilcraft_delight.init;

import com.mojang.logging.LogUtils;
import lobster.moe.anvilcraft_delight.AnvilCraft_Delight;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class ModBlock {

    private static final Map<String,Block> BLOCK_MAP = new HashMap<>();
    public static final Block PEARLOG = registerBlock("pear_log", RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.OAK_LOG));
    public static final Block PEARWOOD = registerBlock("pear_wood", RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.OAK_WOOD));
    public static final Block PEARPLANKS = registerBlock("pear_planks", Block::new,BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));

    public static final Block LEMONLOG = registerBlock("lemon_log",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG));
    public static final Block LEMONWOOD = registerBlock("lemon_wood",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.BIRCH_WOOD));
    public static final Block LEMONPLANKS = registerBlock("lemon_planks",Block::new,BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));

    public static final Block WALNUTLOG = registerBlock("walnut_log",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG));
    public static final Block WALNUTWOOD = registerBlock("walnut_wood",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD));
    public static final Block WALNUTPLANKS = registerBlock("walnut_planks",Block::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));

    public static final Block BANANALOG = registerBlock("banana_log",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG));
    public static final Block BANANAWOOD = registerBlock("banana_wood",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD));
    public static final Block BANANAPLANKS = registerBlock("banana_planks",Block::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));

    public static final Block PEACHLOG = registerBlock("peach_log",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.OAK_LOG));
    public static final Block PEACHWOOD = registerBlock("peach_wood",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.OAK_WOOD));
    public static final Block PEACHPLANKS = registerBlock("peach_planks",Block::new,BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));

    public static final Block COCONUTLOG = registerBlock("coconut_log",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG));
    public static final Block COCONUTWOOD = registerBlock("coconut_wood",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD));
    public static final Block COCONUTPLANKS = registerBlock("coconut_planks",Block::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));

    public static final Block CARAMBOLALOG = registerBlock("carambola_log",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG));
    public static final Block CARAMBOLAWOOD = registerBlock("carambola_wood",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_WOOD));
    public static final Block CARAMBOLAPLANKS = registerBlock("carambola_planks",Block::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));

    public static final Block TOONLOG = registerBlock("toon_log",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG));
    public static final Block TOONWOOD = registerBlock("toon_wood",RotatedPillarBlock::new,BlockBehaviour.Properties.copy(Blocks.SPRUCE_WOOD));
    public static final Block TOONPLANKS = registerBlock("toon_planks",Block::new,BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));

    public static final Block PEARLEAVES = registerBlock("pear_leaves", LeavesBlock::new,BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES));
    public static final Block LEMONLEAVES = registerBlock("lemon_leaves",LeavesBlock::new,BlockBehaviour.Properties.copy(Blocks.BIRCH_LEAVES));
    public static final Block WALNUTLEAVES = registerBlock("walnut_leaves",LeavesBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_LEAVES));
    public static final Block BANANALEAVES = registerBlock("banana_leaves",LeavesBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_LEAVES));
    public static final Block PEACHLEAVES = registerBlock("peach_leaves",LeavesBlock::new,BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES));
    public static final Block COCONUTLEAVES = registerBlock("coconut_leaves",LeavesBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_LEAVES));
    public static final Block CARAMBOLALEAVES = registerBlock("carambola_leaves",LeavesBlock::new,BlockBehaviour.Properties.copy(Blocks.JUNGLE_LEAVES));
    public static final Block TOONLEAVES = registerBlock("toon_leaves",LeavesBlock::new,BlockBehaviour.Properties.copy(Blocks.SPRUCE_LEAVES));



    public static void register() {
        for (Map.Entry<String, Block> entry : ModBlock.BLOCK_MAP.entrySet()) {
            Registry.register(BuiltInRegistries.BLOCK, AnvilCraft_Delight.of(entry.getKey()), entry.getValue());
        }
    }

    private static Block registerBlock(String id, @NotNull Function<BlockBehaviour.Properties, Block> blockCreator, BlockBehaviour.Properties properties) {
        Block block = blockCreator.apply(properties);
        BLOCK_MAP.put(id, block);
        return block;
    }
}