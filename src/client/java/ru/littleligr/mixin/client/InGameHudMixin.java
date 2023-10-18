package ru.littleligr.mixin.client;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameHud.class)
public class InGameHudMixin {

    @Final
    @Shadow
    private MinecraftClient client;

    @Inject(method = "renderStatusEffectOverlay", at = @At("HEAD"), cancellable = true)
    public void renderStatusEffectOverlay(DrawContext context, CallbackInfo ci) {
        client.player.getStatusEffects();
        ci.cancel();
    }

}
