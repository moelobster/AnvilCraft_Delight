package lobster.moe.anvilcraft_delight.events.effects;

import lobster.moe.anvilcraft_delight.init.ModPlayerStatistics;
import lobster.moe.anvilcraft_delight.tag.ModFoodTags;
import net.minecraft.client.gui.font.glyphs.BakedGlyph;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stat;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Sweet {
    public static void sweetEffect(ItemStack itemStack,Level level, ServerPlayer serverPlayer, ResourceLocation resourceLocation){
        if (itemStack.is(ModFoodTags.SWEET)){
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,resourceLocation)==1){
                float currentHealth = serverPlayer.getHealth();
                float newHealth = currentHealth + 1.0f;
                serverPlayer.setHealth(newHealth);
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,resourceLocation)==2){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.HUNGER,5,1));
            }
        }
    }
}
