package net.bobby68.titan;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.bobby68.titan.block.ModBlocks;
import net.bobby68.titan.block.ModFlammableBlockRegistry;
import net.bobby68.titan.entity.ModEntities;
import net.bobby68.titan.entity.custom.TigerEntity;
import net.bobby68.titan.item.ModItemGroup;
import net.bobby68.titan.item.ModItems;
import net.bobby68.titan.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.GeckoLib;

// Very important comment
public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("tutorialmod");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();

		GeckoLib.initialize();

		ModFlammableBlockRegistry.registerFlammableBlocks();
		StrippableBlockRegistry.register(ModBlocks.RED_MAPLE_LOG, ModBlocks.STRIPPED_RED_MAPLE_LOG);
		StrippableBlockRegistry.register(ModBlocks.RED_MAPLE_WOOD, ModBlocks.STRIPPED_RED_MAPLE_WOOD);

		FabricDefaultAttributeRegistry.register(ModEntities.TIGER, TigerEntity.setAttributes());
	}
}