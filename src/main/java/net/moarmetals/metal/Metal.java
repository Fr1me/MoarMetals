package net.moarmetals.metal;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.moarmetals.Reference;
import net.moarmetals.init.Tabs;
import xfireeyez.core.item.ItemFixedAxe;

public class Metal {
	
	public static MetalIngot ingot;
	public static MetalNugget nugget;
	public static MetalBlock block;
	public static MetalOre ore;
	
	public static ItemSword sword;
	public static ItemFixedAxe axe;
	public static ItemPickaxe pickaxe;
	public static ItemSpade spade;
	public static ItemHoe hoe;
	
	public static ItemArmor helmet;
	public static ItemArmor chestplate;
	public static ItemArmor leggings;
	public static ItemArmor boots;
	
	public static String name;
	
	public static int harvestLevel;
	public static int durability;
	public static int enchantability;
	public static int armorDurability;
	public static int[] reductionAmounts;
	
	public static float efficiency;
	public static float damage;
	public static float toughness;
	
	public static final ToolMaterial toolMaterial = EnumHelper.addToolMaterial(name, harvestLevel, durability, efficiency, damage, enchantability);
	
	public static ArmorMaterial armorMaterial = EnumHelper.addArmorMaterial(name, Reference.MODID + ":" + name, armorDurability, reductionAmounts, enchantability, SoundEvents.ITEM_ARMOR_EQUIP_IRON, toughness);

	public Metal(String name, int harvestLevel, int durability, float efficiency, float damage, int enchantability, int armorDurability, int[] reductionAmounts, float toughness) {
		ingot = new MetalIngot(name);
		nugget = new MetalNugget(name);
		block = new MetalBlock(name);
		ore = new MetalOre(name);
		
		sword = new MetalSword(toolMaterial, name);
		axe = new MetalAxe(toolMaterial, name);
		pickaxe = new MetalPickaxe(toolMaterial, name);
		spade = new MetalSpade(toolMaterial, name);
		hoe = new MetalHoe(toolMaterial, name);
		
		helmet = new MetalHelmet(armorMaterial, name);
		chestplate = new MetalChestplate(armorMaterial, name);
		leggings = new MetalLeggings(armorMaterial, name);
		boots = new MetalBoots(armorMaterial, name);
		
		this.name = name;
		
		this.harvestLevel = harvestLevel;
		this.durability = durability;
		this.enchantability = enchantability;
		this.armorDurability = armorDurability;
		this.reductionAmounts = reductionAmounts;
		
		this.efficiency = efficiency;
		this.damage = damage;
		this.toughness = toughness;
	}
	
	public static Item getIngot() {
		return ingot;
	}
	
	public static Item getNugget() {
		return nugget;
	}
	
	public static Block getBlock() {
		return block;
	}
	
	public static Block getOre() {
		return ore;
	}
	
	public static Item getSword() {
		return sword;
	}
	
	public static Item getAxe() {
		return axe;
	}
	
	public static Item getPickaxe() {
		return pickaxe;
	}
	
	public static Item getSpade() {
		return spade;
	}
	
	public static Item getHoe() {
		return hoe;
	}
	
	public static Item getHelmet() {
		return helmet;
	}
	
	public static Item getChestplate() {
		return chestplate;
	}
	
	public static Item getLeggings() {
		return leggings;
	}
	
	public static Item getBoots() {
		return boots;
	}
	
	public static class MetalIngot extends Item {
	
		public MetalIngot(String name) {
			super();
			setUnlocalizedName(name + "_ingot");
			setRegistryName(new ResourceLocation(Reference.MODID, name + "_ingot"));
			setCreativeTab(Tabs.mm);
		}
	}
	
	public static class MetalNugget extends Item {

		public MetalNugget(String name) {
			super();
			setUnlocalizedName(name + "_nugget");
			setRegistryName(new ResourceLocation(Reference.MODID, name + "_nugget"));
			setCreativeTab(Tabs.mm);
		}
		
	}
	
	public static class MetalBlock extends Block {

		public MetalBlock(String name) {
			super(Material.IRON);
			setUnlocalizedName(name + "_block");
			setRegistryName(new ResourceLocation(Reference.MODID, name + "_block"));
			setCreativeTab(Tabs.mm);
			setSoundType(SoundType.METAL);
		}
		
	}
	
	public static class MetalOre extends Block {

		public MetalOre(String name) {
			super(Material.ROCK);
			setUnlocalizedName(name + "_ore");
			setRegistryName(new ResourceLocation(Reference.MODID, name + "_ore"));
			setCreativeTab(Tabs.mm);
			setSoundType(SoundType.STONE);
		}
		
	}
	
	public static class MetalSword extends ItemSword {

		public MetalSword(ToolMaterial material, String name) {
			super(material);
			setUnlocalizedName(name + "_sword");
			setRegistryName(new ResourceLocation(Reference.MODID, name + "_sword"));
			setCreativeTab(Tabs.mm);
			
		}
		
	}
	
	public static class MetalAxe extends ItemFixedAxe {

		public MetalAxe(ToolMaterial material, String name) {
			super(material);
			setUnlocalizedName(name + "_axe");
			setRegistryName(new ResourceLocation(Reference.MODID, name + "_axe"));
			setCreativeTab(Tabs.mm);
			
		}
		
	}
	
	public static class MetalPickaxe extends ItemPickaxe {

		public MetalPickaxe(ToolMaterial material, String name) {
			super(material);
			setUnlocalizedName(name + "_pickaxe");
			setRegistryName(new ResourceLocation(Reference.MODID, name + "_pickaxe"));
			setCreativeTab(Tabs.mm);
			
		}
		
	}
	
	public static class MetalSpade extends ItemSpade {

		public MetalSpade(ToolMaterial material, String name) {
			super(material);
			setUnlocalizedName(name + "_shovel");
			setRegistryName(new ResourceLocation(Reference.MODID, name + "_shovel"));
			setCreativeTab(Tabs.mm);
			
		}
		
	}
	
	public static class MetalHoe extends ItemHoe {

		public MetalHoe(ToolMaterial material, String name) {
			super(material);
			setUnlocalizedName(name + "_hoe");
			setRegistryName(new ResourceLocation(Reference.MODID, name + "_hoe"));
			setCreativeTab(Tabs.mm);
			
		}
		
	}
	
	public static class MetalHelmet extends ItemArmor {

		public MetalHelmet(ArmorMaterial armorMaterial, String name) {
			super(armorMaterial, 1, EntityEquipmentSlot.HEAD);
			setUnlocalizedName(name + "_helmet");
			setRegistryName(new ResourceLocation(Reference.MODID, name + "_helmet"));
		}
		
	}
	
	public static class MetalChestplate extends ItemArmor {

		public MetalChestplate(ArmorMaterial armorMaterial, String name) {
			super(armorMaterial, 1, EntityEquipmentSlot.CHEST);
			setUnlocalizedName(name + "_chestplate");
			setRegistryName(new ResourceLocation(Reference.MODID, name + "_chestplate"));
		}
		
	}
	
	public static class MetalLeggings extends ItemArmor {

		public MetalLeggings(ArmorMaterial armorMaterial, String name) {
			super(armorMaterial, 2, EntityEquipmentSlot.LEGS);
			setUnlocalizedName(name + "_leggings");
			setRegistryName(new ResourceLocation(Reference.MODID, name + "_leggings"));
		}
		
	}
	
	public static class MetalBoots extends ItemArmor {

		public MetalBoots(ArmorMaterial armorMaterial, String name) {
			super(armorMaterial, 1, EntityEquipmentSlot.FEET);
			setUnlocalizedName(name + "_boots");
			setRegistryName(new ResourceLocation(Reference.MODID, name + "_boots"));
		}
		
	}

}
