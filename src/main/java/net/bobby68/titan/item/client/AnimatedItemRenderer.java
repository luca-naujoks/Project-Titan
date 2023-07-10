package net.bobby68.titan.item.client;

import net.bobby68.titan.item.custom.AnimatedItem;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class AnimatedItemRenderer extends GeoItemRenderer<AnimatedItem> {
    public AnimatedItemRenderer() {
        super(new AnimatedItemModel());
    }
}
