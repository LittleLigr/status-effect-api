package ru.littleligr.mixin;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(StatusEffects.class)
public class StatusEffectsMIxin {

    @Inject(method = "register", at = @At("HEAD"), cancellable = true)
    private static void register(int rawId, String id, StatusEffect entry, CallbackInfoReturnable<StatusEffect> cir) {

        cir.cancel();
    }
}
