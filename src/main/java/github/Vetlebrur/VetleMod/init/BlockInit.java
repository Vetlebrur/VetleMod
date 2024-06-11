package github.Vetlebrur.VetleMod.init;

import github.Vetlebrur.VetleMod.VetleMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, VetleMod.MODID);

    public static final RegistryObject<Block> PRISM_BLOCK = BLOCKS.register("prism_block",
            ()->new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_GREEN)
                    .strength(5.0f,17f)
                    .instrument(NoteBlockInstrument.GUITAR)
                    //.lightLevel(state->state.getValue(ON)? 5:10)
                    .lightLevel(state->10)
                    .requiresCorrectToolForDrops()
                    .pushReaction(PushReaction.DESTROY)
            ));
}
