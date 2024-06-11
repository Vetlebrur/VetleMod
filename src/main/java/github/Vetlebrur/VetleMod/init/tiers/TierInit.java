package github.Vetlebrur.VetleMod.init.tiers;

import github.Vetlebrur.VetleMod.init.ItemInit;
import github.Vetlebrur.VetleMod.init.TagInit;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class TierInit {
    public static final ForgeTier OBAMIUM = new ForgeTier(
            4,
            1500,
            1.5f,
            7f,
            30,
            TagInit.NEEDS_OBAMIUM_TOOL,
            ()->Ingredient.of(ItemInit.OBAMA_PRISM::get)
    );
}
