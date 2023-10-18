package ru.littleligr.render.drawer;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.math.Vec2f;
import ru.littleligr.ExtendedStatusEffect;

public interface ExtendedStatusEffectDrawer {

    void draw(DrawContext context, Vec2f pos, ExtendedStatusEffect statusEffect);

}
