package ru.littleligr;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;

public class ExtendedStatusEffect extends StatusEffect {

    public final Identifier texture;

    protected ExtendedStatusEffect(Identifier texture, StatusEffectCategory category, int color) {
        super(category, color);
        this.texture = texture;
    }

}
