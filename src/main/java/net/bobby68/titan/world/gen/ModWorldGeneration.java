package net.bobby68.titan.world.gen;

public class ModWorldGeneration {
    public static void generateModWorldGen() {
        ModOreGeneration.generateOres();

        ModTreeGeneration.generateTrees();

        ModEntityGeneration.addSpawns();
    }
}
