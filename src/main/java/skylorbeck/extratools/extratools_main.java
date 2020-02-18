package skylorbeck.extratools;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod("extratools")
public class extratools_main {
    public extratools_main(){
        {
            MinecraftForge.EVENT_BUS.register(this);
        }
    }
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegEvents{
        @SubscribeEvent
        public static void onItemRegistery(RegistryEvent.Register<Item> event){
            event.getRegistry().registerAll(
                    //granite
                    extratools_list.granitepick,
                    extratools_list.graniteaxe,
                    extratools_list.graniteshovel,
                    extratools_list.granitesword,
                    extratools_list.granitehoe,
                    //diorite
                    extratools_list.dioritepick,
                    extratools_list.dioriteaxe,
                    extratools_list.dioriteshovel,
                    extratools_list.dioritesword,
                    extratools_list.dioritehoe,
                    //andesite
                    extratools_list.andesitepick,
                    extratools_list.andesiteaxe,
                    extratools_list.andesiteshovel,
                    extratools_list.andesitesword,
                    extratools_list.andesitehoe,
                    //quartz
                    extratools_list.quartzpick,
                    extratools_list.quartzaxe,
                    extratools_list.quartzshovel,
                    extratools_list.quartzsword,
                    extratools_list.quartzhoe,
                    //netherrack
                    extratools_list.netherrackpick,
                    extratools_list.netherrackaxe,
                    extratools_list.netherrackshovel,
                    extratools_list.netherracksword,
                    extratools_list.netherrackhoe,
                    //netherbrick
                    extratools_list.netherbrickpick,
                    extratools_list.netherbrickaxe,
                    extratools_list.netherbrickshovel,
                    extratools_list.netherbricksword,
                    extratools_list.netherbrickhoe,
                    //red netherbrick
                    extratools_list.rednetherbrickpick,
                    extratools_list.rednetherbrickaxe,
                    extratools_list.rednetherbrickshovel,
                    extratools_list.rednetherbricksword,
                    extratools_list.rednetherbrickhoe,
                    //sandstone
                    extratools_list.sandstonepick,
                    extratools_list.sandstoneaxe,
                    extratools_list.sandstoneshovel,
                    extratools_list.sandstonesword,
                    extratools_list.sandstonehoe,
                    //redsandstone
                    extratools_list.redsandstonepick,
                    extratools_list.redsandstoneaxe,
                    extratools_list.redsandstoneshovel,
                    extratools_list.redsandstonesword,
                    extratools_list.redsandstonehoe,
                    //redstone
                    extratools_list.redstonepick,
                    extratools_list.redstoneaxe,
                    extratools_list.redstoneshovel,
                    extratools_list.redstonesword,
                    extratools_list.redstonehoe,
                    //lapis
                    extratools_list.lapispick,
                    extratools_list.lapisaxe,
                    extratools_list.lapisshovel,
                    extratools_list.lapissword,
                    extratools_list.lapishoe,
                    //emerald
                    extratools_list.emeraldpick,
                    extratools_list.emeraldaxe,
                    extratools_list.emeraldshovel,
                    extratools_list.emeraldsword,
                    extratools_list.emeraldhoe,
                    //flint
                    extratools_list.flintpick,
                    extratools_list.flintaxe,
                    extratools_list.flintshovel,
                    extratools_list.flintsword,
                    extratools_list.flinthoe
            );
        }
    }
}