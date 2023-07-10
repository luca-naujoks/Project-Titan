package net.bobby68.titan.item.client;

import net.bobby68.titan.TutorialMod;
import net.bobby68.titan.item.custom.AnimatedItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class AnimatedItemModel extends GeoModel<AnimatedItem> {
    @Override
    public Identifier getModelResource(AnimatedItem animatable) {
        return new Identifier(TutorialMod.MOD_ID, "geo/animated_item.geo.json");
    }

    @Override
    public Identifier getTextureResource(AnimatedItem animatable) {
        return new Identifier(TutorialMod.MOD_ID, "textures/item/animated_item.png");
    }

    @Override
    public Identifier getAnimationResource(AnimatedItem animatable) {
        return new Identifier(TutorialMod.MOD_ID, "animations/animated_item.animation.json");
    }
}
