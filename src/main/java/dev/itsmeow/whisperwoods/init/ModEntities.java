package dev.itsmeow.whisperwoods.init;

import java.util.LinkedHashMap;
import java.util.function.Function;

import dev.itsmeow.imdlib.IMDLib;
import dev.itsmeow.imdlib.entity.EntityRegistrarHandler;
import dev.itsmeow.imdlib.entity.util.EntityTypeContainer;
import dev.itsmeow.imdlib.entity.util.EntityTypeContainer.Builder;
import dev.itsmeow.imdlib.entity.util.EntityTypeContainer.CustomConfigurationHolder;
import dev.itsmeow.whisperwoods.WhisperwoodsMod;
import dev.itsmeow.whisperwoods.entity.EntityHidebehind;
import dev.itsmeow.whisperwoods.entity.EntityMoth;
import dev.itsmeow.whisperwoods.entity.EntityWisp;
import dev.itsmeow.whisperwoods.entity.EntityHidebehind.HidebehindVariant;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.MobEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.ForgeConfigSpec;

public class ModEntities {

    public static final EntityRegistrarHandler H = IMDLib.entityHandler(WhisperwoodsMod.MODID);

    public static final EntityTypeContainer<EntityMoth> MOTH = H.add(entity(EntityMoth.class, EntityMoth::new, "moth").spawn(EntityClassification.AMBIENT, 10, 1, 3).egg(0x442516, 0xc66121).size(0.35F, 0.35F).despawn().config(new CustomConfigurationHolder() {
        private ForgeConfigSpec.IntValue requiredMoths;

        @Override
        public void customConfigurationInit(ForgeConfigSpec.Builder builder) {
            this.requiredMoths = builder.comment("How many moths required to destroy a torch - Disabled if set to 0").worldRestart().defineInRange("moths_to_destroy_torch", 5, 0, Integer.MAX_VALUE);
        }

        @Override
        public void customConfigurationLoad() {
            EntityMoth.MOTHS_REQUIRED_TO_DESTROY = requiredMoths.get();
        }
    }).variants(
    "garden_tiger",
    "luna",
    "creeper_sphinx",
    "grey_spotted_hawk",
    "brown_spotted_hawk",
    "black_white_deaths_head",
    "brown_grey_deaths_head",
    "brown_orange_deaths_head"
    ).biomes(Type.FOREST, Type.SWAMP));

    public static final EntityTypeContainer<EntityHidebehind> HIDEBEHIND = H.add(entity(EntityHidebehind.class, EntityHidebehind::new, "hidebehind").spawn(EntityClassification.MONSTER, 5, 1, 1).egg(0x473123, 0xfff494).size(1F, 5.2F).despawn()
    .variants(
    new HidebehindVariant("black"),
    new HidebehindVariant("coniferous"),
    new HidebehindVariant("darkforest"),
    new HidebehindVariant("forest"),
    new HidebehindVariant("mega_taiga"))
    .biomes(Type.FOREST));

    public static final EntityTypeContainer<EntityWisp> WISP = H.add(entity(EntityWisp.class, EntityWisp::new, "wisp").spawn(EntityClassification.CREATURE, 13, 1, 3).egg(0xc36406, 0xffc008).size(0.75F, 0.9F).config(new CustomConfigurationHolder() {
        private ForgeConfigSpec.IntValue hostileChance;

        @Override
        public void customConfigurationInit(ForgeConfigSpec.Builder builder) {
            this.hostileChance = builder.comment("Chance of wisp being hostile (soul stealer). Chance is 1/x, where x is the value specified. 0 is no chance, 1 is 100% chance, 2 is 50% chance, etc").worldRestart().defineInRange("hostile_chance", 8, 0, Integer.MAX_VALUE);
        }

        @Override
        public void customConfigurationLoad() {
            EntityWisp.HOSTILE_CHANCE = hostileChance.get();
        }
    }).biomes(Type.FOREST, Type.SWAMP));

    public static final LinkedHashMap<String, EntityTypeContainer<? extends MobEntity>> getEntities() {
        return H.ENTITIES;
    }

    private static <T extends MobEntity> Builder<T> entity(Class<T> entityClass, Function<World, T> func, String entityNameIn) {
        return EntityTypeContainer.Builder.create(entityClass, func, entityNameIn, WhisperwoodsMod.MODID);
    }

}
