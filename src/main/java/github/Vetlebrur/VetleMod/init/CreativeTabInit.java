package github.Vetlebrur.VetleMod.init;


import github.Vetlebrur.VetleMod.VetleMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = VetleMod.MODID,bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VetleMod.MODID);

    public static final List<Supplier<? extends ItemLike>> VETLE_TAB_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> VETLE_TAB = TABS.register("vetle_tab",
            ()->CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.vetle_mod"))
                    .icon(ItemInit.OBAMA_PRISM.get()::getDefaultInstance)
                    .displayItems((displayParameters,output)->
                        VETLE_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get())))
                    .withSearchBar()
                    .build()
    );

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike){
        VETLE_TAB_ITEMS.add(itemLike);
        return itemLike;
    }
    @SubscribeEvent
    public static void buildContents(BuildCreativeModeTabContentsEvent event){
        /*
        if(event.getTabKey()== CreativeModeTabs.BUILDING_BLOCKS){
            event.accept(ItemInit.OBAMA_PRISM);
        }

        if (event.getTab() == VETLE_TAB.get()){
            event.accept(Items.ITEM_FRAME);
        }
         */

    }
}
