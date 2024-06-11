package github.Vetlebrur.VetleMod;

import github.Vetlebrur.VetleMod.init.BlockInit;
import github.Vetlebrur.VetleMod.init.CreativeTabInit;
import github.Vetlebrur.VetleMod.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("vetlemod")
public class VetleMod {
    public static final String MODID = "vetlemod";

    public VetleMod(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        CreativeTabInit.TABS.register(bus);
    }
}
