package github.Vetlebrur.VetleMod.init;

import github.Vetlebrur.VetleMod.VetleMod;
import github.Vetlebrur.VetleMod.init.tiers.TierInit;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static github.Vetlebrur.VetleMod.init.CreativeTabInit.addToTab;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, VetleMod.MODID);

    public static final RegistryObject<Item> OBAMA_PRISM = addToTab(ITEMS.register("obama_prism",
        () -> new Item(new Item.Properties()
                .stacksTo(16)
                .food(new FoodProperties.Builder()
                        .nutrition(5)
                        .saturationModifier(0.2f)
                        //Absorption: 10 hearts for 10 seconds
                        //.effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 200,2), 1f)

                        .build())
                .rarity(Rarity.EPIC)
        )));

    public static final RegistryObject<BlockItem> Prism_BLOCK_ITEM = addToTab(ITEMS.register("prism_block",
            ()->new BlockItem(BlockInit.PRISM_BLOCK.get(),
                    new Item.Properties()
                            .rarity(Rarity.UNCOMMON)
            )));


    public static final RegistryObject<SwordItem> OBAMA_SWORD = addToTab(ITEMS.register("obama_sword",
            ()->new SwordItem(
                    TierInit.OBAMIUM,
                    20,
                    4f,
                    new Item.Properties()
            )));

    public static final RegistryObject<PickaxeItem> OBAMA_PICKAXE = addToTab(ITEMS.register("obama_pickaxe",
            ()->new PickaxeItem(
                    TierInit.OBAMIUM,
                    new Item.Properties()
            )));

    public static final RegistryObject<AxeItem> OBAMA_AXE = addToTab(ITEMS.register("obama_axe",
            ()->new AxeItem(
                    TierInit.OBAMIUM,
                    new Item.Properties()
            )));

    public static final RegistryObject<ShovelItem> OBAMA_SHOVEL = addToTab(ITEMS.register("obama_shovel",
            ()->new ShovelItem(
                    TierInit.OBAMIUM,
                    new Item.Properties()
            )));

    public static final RegistryObject<HoeItem> OBAMA_HOE = addToTab(ITEMS.register("obama_hoe",
            ()->new HoeItem(
                    TierInit.OBAMIUM,
                    new Item.Properties()
            )));

    public static final RegistryObject<ArmorItem> OBAMA_HELMET = addToTab(ITEMS.register("obama_helmet",
            ()->new ArmorItem(
                    ArmorMaterialInit.OBAMIUM,
                    ArmorItem.Type.HELMET,
                    new Item.Properties()
            )));
    public static final RegistryObject<ArmorItem> OBAMA_CHESTPLATE = addToTab(ITEMS.register("obama_chestplate",
            ()->new ArmorItem(
                    ArmorMaterialInit.OBAMIUM,
                    ArmorItem.Type.CHESTPLATE,
                    new Item.Properties()
            )));
    public static final RegistryObject<ArmorItem> OBAMA_LEGGINGS = addToTab(ITEMS.register("obama_leggings",
            ()->new ArmorItem(
                    ArmorMaterialInit.OBAMIUM,
                    ArmorItem.Type.LEGGINGS,
                    new Item.Properties()
            )));
    public static final RegistryObject<ArmorItem> OBAMA_BOOTS = addToTab(ITEMS.register("obama_boots",
            ()->new ArmorItem(
                    ArmorMaterialInit.OBAMIUM,
                    ArmorItem.Type.BOOTS,
                    new Item.Properties()
            )));
}
