package lobster.moe.anvilcook.events.effects;

import lobster.moe.anvilcook.events.tag.ModFoodTags;
import lobster.moe.anvilcook.init.ModPlayerStatistics;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class Hot implements FoodType{

    @Override
    public ResourceLocation getCunterResourceLocation() {
        return ModPlayerStatistics.HOTCOUNTER;
    }

    @Override
    public ResourceLocation getJudgeResourceLocation() {
        return ModPlayerStatistics.HOTJUDGE;
    }

    @Override
    public void effect(@NotNull ItemStack itemStack,Level level, ServerPlayer serverPlayer){
        if (itemStack.is(ModFoodTags.HOT)){
            int l = 0;
            int num=serverPlayer.getStats().getValue(Stats.CUSTOM,getCunterResourceLocation());
            for (;num>=1;num=num/ FoodType.judgeNum){
                l=l+1;
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,getJudgeResourceLocation())==1){
                serverPlayer.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED,15*l,1));
            }
            if (serverPlayer.getStats().getValue(Stats.CUSTOM,getJudgeResourceLocation())==2){
                MobEffectInstance fireEffect = new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 15*l, 0);
                serverPlayer.addEffect(fireEffect);
                float currentHealth = serverPlayer.getHealth();
                float newHealth = currentHealth - 2.0f*l;
                serverPlayer.setHealth(newHealth);
            }
        }
    }
}
