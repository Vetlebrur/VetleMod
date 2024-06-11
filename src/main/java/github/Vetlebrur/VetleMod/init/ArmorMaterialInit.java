package github.Vetlebrur.VetleMod.init;

import github.Vetlebrur.VetleMod.init.tiers.ModArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorMaterialInit {
    public static final ModArmorMaterial OBAMIUM = new ModArmorMaterial(
            new int[] {500,1200,600,400},
            new int[] {11,16,15,13},
            30,
            SoundEvents.ARMOR_UNEQUIP_WOLF,
            ()-> Ingredient.of(ItemInit.OBAMA_PRISM::get),
            "obamium",
            1.5f,
            1.5f
    );
}
