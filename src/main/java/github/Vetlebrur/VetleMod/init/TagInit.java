package github.Vetlebrur.VetleMod.init;

import net.minecraft.world.level.block.Block;
import github.Vetlebrur.VetleMod.VetleMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;

public class TagInit {
    public static final TagKey<Block> NEEDS_OBAMIUM_TOOL = tag("needs_obamium_tool");

    public static TagKey<Block> tag(String name){
        return BlockTags.create(new ResourceLocation(VetleMod.MODID,name));
    }
}
