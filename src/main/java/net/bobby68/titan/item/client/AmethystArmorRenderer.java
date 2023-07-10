package net.bobby68.titan.item.client;

import net.bobby68.titan.item.custom.AmethystArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AmethystArmorRenderer extends GeoArmorRenderer<AmethystArmorItem> {
    public AmethystArmorRenderer() {
        super(new AmethystArmorModel());
    }
}
