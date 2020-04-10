
package net.mcreator.test.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.test.itemgroup.IrcaniumtoolItemGroup;
import net.mcreator.test.TestElements;

@TestElements.ModElement.Tag
public class IrcaniumswordItem extends TestElements.ModElement {
	@ObjectHolder("test:ircaniumsword")
	public static final Item block = null;
	public IrcaniumswordItem(TestElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1900;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().group(IrcaniumtoolItemGroup.tab)) {
		}.setRegistryName("ircaniumsword"));
	}
}
