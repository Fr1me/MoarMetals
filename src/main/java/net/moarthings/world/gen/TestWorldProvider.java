//package net.moarthings.world.gen;
//
//import net.minecraft.world.DimensionType;
//import net.minecraft.world.WorldProvider;
//import net.minecraft.world.chunk.IChunkGenerator;
//
//public class TestWorldProvider extends WorldProvider {
//
//    @Override
//    public DimensionType getDimensionType() {
//        return ModDimensions.testDimensionType;
//    }
//
//    @Override
//    public String getSaveFolder() {
//        return "TEST";
//    }
//
//    @Override
//    public IChunkGenerator createChunkGenerator() {
//        return new TestChunkGenerator(world);
//    }
//}
