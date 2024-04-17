package lobster.moe.anvilcraft_delight.events.effects;

import lobster.moe.anvilcraft_delight.tag.ModFoodTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Fruit {
    public static void fruitEffect(ItemStack itemStack,Level level, ServerPlayer serverPlayer, ResourceLocation resourceLocation){
        if (itemStack.is(ModFoodTags.FRUIT)){
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,resourceLocation)==1){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.REGENERATION,5,1));
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION,10,1));
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,resourceLocation)==2){
                float currentHealth = serverPlayer.getHealth();
                float newHealth = currentHealth - 1.0f;
                serverPlayer.setHealth(newHealth);
            }
        }
    }
}
