package net.moarthings.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import xfireeyez.core.util.IMetaName;

public class MTPlanks extends Block implements IMetaName {
	public static final PropertyEnum<MTPlanks.EnumType> VARIANT = PropertyEnum.<MTPlanks.EnumType>create("variant", MTPlanks.EnumType.class);
	
	public MTPlanks(String name) {
		super(Material.WOOD);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.WOOD);
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, MTPlanks.EnumType.MAPLE));
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return ((MTPlanks.EnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
		for(MTPlanks.EnumType customblockplanks$enumtype : MTPlanks.EnumType.values())
		{
			items.add(new ItemStack(this, 1, customblockplanks$enumtype.getMeta()));
		}
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(VARIANT, MTPlanks.EnumType.byMetadata(meta));
	}
	@Override
	public int getMetaFromState(IBlockState state) {
		return ((MTPlanks.EnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {VARIANT});
	}
	
	public static enum EnumType implements IStringSerializable {
		MAPLE(0, "maple"),
		SAKURA(1, "sakura");
		
		private static final MTPlanks.EnumType[] META_LOOKUP = new MTPlanks.EnumType[values().length];
		private final int meta;
		private final String name, unlocializedName;
		
		private EnumType(int meta, String name) {
			this(meta, name, name);
		}
		
		private EnumType(int meta, String name, String unlocializedName) {
			this.meta = meta;
			this.name = name;
			this.unlocializedName = unlocializedName;
		}
		
		@Override
		public String getName() {
			return this.name;
		}
		
		public int getMeta() {
			return this.meta;
		}
		
		public String getUnlocializedName() {
			return this.unlocializedName;
		}
		
		@Override
		public String toString() {
			return this.name;
		}
		
		public static MTPlanks.EnumType byMetadata(int meta) {
			return META_LOOKUP[meta];
		}
		
		static {
			for(MTPlanks.EnumType customblockplanks$enumtype : values())
			{
				META_LOOKUP[customblockplanks$enumtype.getMeta()] = customblockplanks$enumtype;
			}
		}
		
	}

	@Override
	public String getSpecialName(ItemStack stack) {
		return MTPlanks.EnumType.values()[stack.getItemDamage()].getName();
	}
}
