package frime.moarmetals.init;

import java.util.ArrayList;
import java.util.List;

import frime.moarmetals.object.armor.ArmorBase;
import frime.moarmetals.object.item.ItemBase;
import frime.moarmetals.object.tool.ToolAxe;
import frime.moarmetals.object.tool.ToolHoe;
import frime.moarmetals.object.tool.ToolPickaxe;
import frime.moarmetals.object.tool.ToolShovel;
import frime.moarmetals.object.tool.ToolSword;
import frime.moarmetals.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class Items {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial COPPER_TOOL = EnumHelper.addToolMaterial("copper", 2, 180, 5.0F, 1.5F, 15);
	public static final ArmorMaterial COPPER_ARMOR = EnumHelper.addArmorMaterial("copper", Reference.MODID + ":copper", 12, new int[] {2, 3, 4, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
	
	//Items
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot", CreativeTabs.MATERIALS);
	
	//Tools
	public static final Item COPPER_AXE = new ToolAxe("copper_axe", COPPER_TOOL);
	public static final Item COPPER_HOE = new ToolHoe("copper_hoe", COPPER_TOOL);
	public static final Item COPPER_PICKAXE = new ToolPickaxe("copper_pickaxe", COPPER_TOOL);
	public static final Item COPPER_SHOVEL = new ToolShovel("copper_shovel", COPPER_TOOL);
	public static final Item COPPER_SWORD = new ToolSword("copper_sword", COPPER_TOOL);
	
	//Armor
	public static final Item COPPER_HELMET = new ArmorBase("copper_helmet", COPPER_ARMOR, 1, EntityEquipmentSlot.HEAD);
	public static final Item COPPER_CHESTPLATE = new ArmorBase("copper_chestplate", COPPER_ARMOR, 1, EntityEquipmentSlot.CHEST);
	public static final Item COPPER_LEGGINGS = new ArmorBase("copper_leggings", COPPER_ARMOR, 2, EntityEquipmentSlot.LEGS);
	public static final Item COPPER_BOOTS = new ArmorBase("copper_boots", COPPER_ARMOR, 1, EntityEquipmentSlot.FEET);

}
