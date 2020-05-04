package com.github.alexthe666.iceandfire.entity;

import com.github.alexthe666.citadel.server.entity.EntityPropertiesHandler;
import com.github.alexthe666.iceandfire.IceAndFire;
import com.github.alexthe666.iceandfire.entity.*;
import com.github.alexthe666.iceandfire.enums.EnumHippogryphTypes;
import com.github.alexthe666.iceandfire.enums.EnumTroll;
import net.ilexiconn.llibrary.server.entity.EntityPropertiesHandler;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;

import java.util.List;

public class IafEntityRegistry {

    public static final EntityType<EntityDragonEgg> DRAGON_EGG = registerEntity(EntityType.Builder.create(EntityDragonEgg::new, EntityClassification.MISC).size(0.45F, 0.55F), "dragon_egg");
    public static final EntityType<EntityDragonArrow> DRAGON_ARROW = registerEntity(EntityType.Builder.create(EntityDragonArrow::new, EntityClassification.MISC).size(0.5F, 0.5F), "dragon_arrow");
    public static final EntityType<EntityDragonSkull> DRAGON_ARROW = registerEntity(EntityType.Builder.create(EntityDragonSkull::new, EntityClassification.MISC).size(0.9F, 0.65F), "dragon_skull");
    public static final EntityType<EntityFireDragon> FIRE_DRAGON = registerEntity(EntityType.Builder.create(EntityFireDragon::new, EntityClassification.CREATURE).size(0.78F, 1.2F), "fire_dragon");
    public static final EntityType<EntityIceDragon> ICE_DRAGON = registerEntity(EntityType.Builder.create(EntityIceDragon::new, EntityClassification.CREATURE).size(0.78F, 1.2F), "ice_dragon");
    public static final EntityType<EntityDragonFireCharge> FIRE_DRAGON_CHARGE = registerEntity(EntityType.Builder.create(EntityDragonFireCharge::new, EntityClassification.MISC).size(0.9F, 0.9F), "fire_dragon_charge");
    public static final EntityType<EntityDragonIceCharge> ICE_DRAGON_CHARGE = registerEntity(EntityType.Builder.create(EntityDragonIceCharge::new, EntityClassification.MISC).size(0.9F, 0.9F), "ice_dragon_charge");
    public static final EntityType<EntityHippogryphEgg> HIPPOGRYPH_EGG = registerEntity(EntityType.Builder.create(EntityHippogryphEgg::new, EntityClassification.MISC).size(0.5F, 0.5F), "hippogryph_egg");
    public static final EntityType<EntityHippogryph> HIPPOGRYPH = registerEntity(EntityType.Builder.create(EntityHippogryph::new, EntityClassification.CREATURE).size(1.7F, 1.6F), "hippogryph");
    public static final EntityType<EntityStoneStatue> STONE_STATUE = registerEntity(EntityType.Builder.create(EntityStoneStatue::new, EntityClassification.CREATURE).size(0.8F, 1.9F), "stone_statue");
    public static final EntityType<EntityGorgon> GORGON = registerEntity(EntityType.Builder.create(EntityGorgon::new, EntityClassification.CREATURE).size(0.8F, 1.99F), "gorgon");
    public static final EntityType<EntityPixie> PIXIE = registerEntity(EntityType.Builder.create(EntityPixie::new, EntityClassification.CREATURE).size(0.4F, 0.8F), "pixie");
    public static final EntityType<EntityCyclops> CYCLOPS = registerEntity(EntityType.Builder.create(EntityCyclops::new, EntityClassification.CREATURE).size(1.95F, 7.4F), "cyclops");
    public static final EntityType<EntitySiren> SIREN = registerEntity(EntityType.Builder.create(EntitySiren::new, EntityClassification.CREATURE).size(1.6F, 0.9F), "siren");
    public static final EntityType<EntityHippocampus> HIPPOCAMPUS = registerEntity(EntityType.Builder.create(EntityHippocampus::new, EntityClassification.CREATURE).size(1.95F, 0.95F), "hippocampus");
    public static final EntityType<EntityDeathWorm> DEATH_WORM = registerEntity(EntityType.Builder.create(EntityDeathWorm::new, EntityClassification.CREATURE).size(0.8F, 0.8F), "deathworm");
    public static final EntityType<EntityDeathWormEgg> DEATH_WORM_EGG = registerEntity(EntityType.Builder.create(EntityDeathWormEgg::new, EntityClassification.MISC).size(0.5F, 0.5F), "deathworm_egg");
    public static final EntityType<EntityCockatrice> COCKATRICE = registerEntity(EntityType.Builder.create(EntityCockatrice::new, EntityClassification.CREATURE).size(0.95F, 0.95F), "cockatrice");
    public static final EntityType<EntityCockatriceEgg> COCKATRICE_EGG = registerEntity(EntityType.Builder.create(EntityCockatriceEgg::new, EntityClassification.MISC).size(0.5F, 0.5F), "cockatrice_egg");
    public static final EntityType<EntityStymphalianBird> STYMPHALIAN_BIRD = registerEntity(EntityType.Builder.create(EntityStymphalianBird::new, EntityClassification.CREATURE).size(1.3F, 1.2F), "stymhpalian_bird");
    public static final EntityType<EntityStymphalianFeather> STYMPHALIAN_FEATHER = registerEntity(EntityType.Builder.create(EntityStymphalianFeather::new, EntityClassification.MISC).size(0.5F, 0.5F), "stymphalian_feather");
    public static final EntityType<EntityStymphalianArrow> STYMPHALIAN_ARROW = registerEntity(EntityType.Builder.create(EntityStymphalianArrow::new, EntityClassification.MISC).size(0.5F, 0.5F), "stymphalian_arrow");
    public static final EntityType<EntityTroll> TROLL = registerEntity(EntityType.Builder.create(EntityTroll::new, EntityClassification.CREATURE).size(1.2F, 3.5F), "troll");
    public static final EntityType<EntityMyrmexWorker> MYRMEX_WORKER = registerEntity(EntityType.Builder.create(EntityMyrmexWorker::new, EntityClassification.CREATURE).size(0.99F, 0.95F), "myrmex_worker");
    public static final EntityType<EntityMyrmexSoldier> MYRMEX_SOLDIER = registerEntity(EntityType.Builder.create(EntityMyrmexSoldier::new, EntityClassification.CREATURE).size(0.99F, 0.95F), "myrmex_solider");
    public static final EntityType<EntityMyrmexSentinel> MYRMEX_SENTINEL = registerEntity(EntityType.Builder.create(EntityMyrmexSentinel::new, EntityClassification.CREATURE).size(1.3F, 1.95F), "myrmex_sentinel");
    public static final EntityType<EntityMyrmexRoyal> MYRMEX_ROYAL = registerEntity(EntityType.Builder.create(EntityMyrmexRoyal::new, EntityClassification.CREATURE).size(1.9F, 1.86F), "myrmex_royal");
    public static final EntityType<EntityMyrmexQueen> MYRMEX_QUEEN = registerEntity(EntityType.Builder.create(EntityMyrmexQueen::new, EntityClassification.CREATURE).size(2.9F, 1.86F), "myrmex_queen");
    public static final EntityType<EntityMyrmexEgg> MYRMEX_EGG = registerEntity(EntityType.Builder.create(EntityMyrmexEgg::new, EntityClassification.MISC).size(0.45F, 0.55F), "myrmex_egg");
    public static final EntityType<EntityAmphithere> AMPHITHERE = registerEntity(EntityType.Builder.create(EntityAmphithere::new, EntityClassification.CREATURE).size(2.5F, 1.25F), "amphithere");
    public static final EntityType<EntityAmphithereArrow> AMPHITHERE_ARROW = registerEntity(EntityType.Builder.create(EntityAmphithereArrow::new, EntityClassification.MISC).size(0.5F, 0.5F), "amphithere_arrow");
    public static final EntityType<EntitySeaSerpent> SEA_SERPENT = registerEntity(EntityType.Builder.create(EntitySeaSerpent::new, EntityClassification.CREATURE).size(0.5F, 0.5F), "sea_serpent");
    public static final EntityType<EntitySeaSerpentBubbles> SEA_SERPENT_BUBBLES = registerEntity(EntityType.Builder.create(EntitySeaSerpentBubbles::new, EntityClassification.MISC).size(0.5F, 0.5F), "sea_serpent_bubbles");
    public static final EntityType<EntitySeaSerpentArrow> SEA_SERPENT_ARROW = registerEntity(EntityType.Builder.create(EntitySeaSerpentArrow::new, EntityClassification.MISC).size(0.5F, 0.5F), "sea_serpent_arrow");
    public static final EntityType<EntityChainTie> CHAIN_TIE = registerEntity(EntityType.Builder.create(EntityChainTie::new, EntityClassification.MISC).size(0.8F, 0.9F), "chain_tie");
    public static final EntityType<EntityPixieCharge> PIXIE_CHARGE = registerEntity(EntityType.Builder.create(EntityPixieCharge::new, EntityClassification.MISC).size(0.5F, 0.5F), "pixie_charge");
    public static final EntityType<EntityMyrmexSwarmer> MYRMEX_SWARMER = registerEntity(EntityType.Builder.create(EntityMyrmexSwarmer::new, EntityClassification.CREATURE).size(0.5F, 0.5F), "myrmex_swarmer");
    public static final EntityType<EntityTideTrident> TIDE_TRIDENT = registerEntity(EntityType.Builder.create(EntityTideTrident::new, EntityClassification.MISC).size(0.85F, 0.5F), "tide_trident");
    public static final EntityType<EntityMobSkull> MOB_SKULL = registerEntity(EntityType.Builder.create(EntityMobSkull::new, EntityClassification.MISC).size(0.85F, 0.85F), "mob_skull");
    public static final EntityType<EntityDreadThrall> DREAD_THRALL = registerEntity(EntityType.Builder.create(EntityDreadThrall::new, EntityClassification.CREATURE).size(0.6F, 1.8F), "dread_thrall");
    public static final EntityType<EntityDreadGhoul> DREAD_GHOUL = registerEntity(EntityType.Builder.create(EntityDreadGhoul::new, EntityClassification.CREATURE).size(0.6F, 1.8F), "dread_ghoul");
    public static final EntityType<EntityDreadBeast> DREAD_BEAST = registerEntity(EntityType.Builder.create(EntityDreadBeast::new, EntityClassification.CREATURE).size(1.2F, 0.9F), "dread_beast");
    public static final EntityType<EntityDreadScuttler> DREAD_SCUTTLER = registerEntity(EntityType.Builder.create(EntityDreadScuttler::new, EntityClassification.CREATURE).size(1.5F, 1.3F), "dread_scuttler");
    public static final EntityType<EntityDreadLich> DREAD_LICH = registerEntity(EntityType.Builder.create(EntityDreadLich::new, EntityClassification.CREATURE).size(0.6F, 1.8F), "dread_lich");
    public static final EntityType<EntityDreadLichSkull> DREAD_LICH_SKULL = registerEntity(EntityType.Builder.create(EntityDreadLichSkull::new, EntityClassification.MISC).size(0.5F, 0.5F), "dread_lich_skull");
    public static final EntityType<EntityDreadKnight> DREAD_KNIGHT = registerEntity(EntityType.Builder.create(EntityDreadKnight::new, EntityClassification.CREATURE).size(0.6F, 1.8F), "dread_knight");
    public static final EntityType<EntityDreadHorse> DREAD_HORSE = registerEntity(EntityType.Builder.create(EntityDreadHorse::new, EntityClassification.CREATURE).size(1.3964844F, 1.6F), "dread_horse");
    public static final EntityType<EntityHydra> HYDRA = registerEntity(EntityType.Builder.create(EntityHydra::new, EntityClassification.CREATURE).size(2.8F, 1.39F), "hydra");
    public static final EntityType<EntityHydraBreath> HYDRA_BREATH = registerEntity(EntityType.Builder.create(EntityHydraBreath::new, EntityClassification.MISC).size(0.9F, 0.9F), "hydra_breath");
    public static final EntityType<EntityHydraArrow> HYDRA_ARROW = registerEntity(EntityType.Builder.create(EntityHydraArrow::new, EntityClassification.MISC).size(0.5F, 0.5F), "hydra_arrow");



    private static final EntityType registerEntity(EntityType.Builder builder, String entityName){
        ResourceLocation nameLoc = new ResourceLocation(IceAndFire.MODID, entityName);
        return (EntityType) builder.build(entityName).setRegistryName(nameLoc);
    }

    public static void init() {
        EntityPropertiesHandler.INSTANCE.registerProperties(StoneEntityProperties.class);
        EntityPropertiesHandler.INSTANCE.registerProperties(MiscEntityProperties.class);
        EntityPropertiesHandler.INSTANCE.registerProperties(FrozenEntityProperties.class);
        EntityPropertiesHandler.INSTANCE.registerProperties(SirenEntityProperties.class);
        EntityPropertiesHandler.INSTANCE.registerProperties(ChickenEntityProperties.class);
        EntityPropertiesHandler.INSTANCE.registerProperties(ChainEntityProperties.class);
    }
}
