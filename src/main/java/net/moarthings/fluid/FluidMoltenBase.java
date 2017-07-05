package net.moarthings.fluid;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;

public class FluidMoltenBase extends FluidBase {

  public FluidMoltenBase(Fluid fluid) {
    super(fluid, Material.LAVA);
  }
}
