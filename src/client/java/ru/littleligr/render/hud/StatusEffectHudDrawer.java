package ru.littleligr.render.hud;

import net.minecraft.client.gui.DrawContext;
import ru.littleligr.ExtendedStatusEffect;

import java.util.List;

public interface StatusEffectHudDrawer {
    void draw(DrawContext context, List<ExtendedStatusEffect> effects);
}
