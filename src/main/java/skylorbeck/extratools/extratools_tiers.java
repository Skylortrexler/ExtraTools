package skylorbeck.extratools;

import net.minecraft.block.Blocks;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyLoadBase;

import java.util.function.Supplier;

public enum extratools_tiers implements IItemTier {
    DIORITE(1, 131, 4.0F, 1.0F, 5, () -> {//stone
        return Ingredient.fromItems(Blocks.DIORITE,Blocks.POLISHED_DIORITE);
    }),
    ANDESITE(1, 131, 4.0F, 1.0F, 5, () -> {//stone
        return Ingredient.fromItems(Blocks.ANDESITE,Blocks.POLISHED_ANDESITE);
    }),
    GRANITE(1, 131, 4.0F, 1.0F, 5, () -> {//stone
        return Ingredient.fromItems(Blocks.GRANITE,Blocks.POLISHED_GRANITE);
    }),
    QUARTZ(2, 250, 6.0F, 3.0F, 14, () -> {//damage of diamond, else iron
        return Ingredient.fromItems(Blocks.QUARTZ_BLOCK,Blocks.QUARTZ_PILLAR,Blocks.CHISELED_QUARTZ_BLOCK,Blocks.SMOOTH_QUARTZ);
    }),
    NETHERRACK(0, 59, 2.0F, 0.0F, 5, () -> {//enchantability of stone, else wood
        return Ingredient.fromItems(Blocks.NETHERRACK);
    }),
    NETHERBRICK(1, 131, 4.0F, 1.0F, 5, () -> {//stone
        return Ingredient.fromItems(Blocks.NETHER_BRICKS);
    }),
    REDNETHERBRICK(1, 131, 4.0F, 1.0F, 5, () -> {//stone
        return Ingredient.fromItems(Blocks.RED_NETHER_BRICKS);
    }),
    SANDSTONE(1, 131, 4.0F, 1.0F, 5, () -> {//stone
        return Ingredient.fromItems(Blocks.SANDSTONE,Blocks.CHISELED_SANDSTONE,Blocks.CUT_SANDSTONE,Blocks.SMOOTH_SANDSTONE);
    }),
    REDSANDSTONE(1, 131, 4.0F, 1.0F, 5, () -> {//stone
        return Ingredient.fromItems(Blocks.RED_SANDSTONE,Blocks.CHISELED_RED_SANDSTONE,Blocks.CUT_RED_SANDSTONE,Blocks.SMOOTH_RED_SANDSTONE);
    }),
    REDSTONE(2,250,12.0F,2.0F,14,()->{//speed of gold, else iron
        return Ingredient.fromItems(Blocks.REDSTONE_BLOCK);
    }),
    LAPIS(2,250,6.0F,2.0F,22,()->{//enchantability of gold, else iron
        return Ingredient.fromItems(Blocks.LAPIS_BLOCK);
    }),
    EMERALD(2,1561,6.0F,2.0F,14,()->{//durability of diamond, else iron
        return Ingredient.fromItems(Items.EMERALD);
    }),
    FLINT(1,250,4.0F,1.0F,14,()->{//durability of iron, else stone
        return Ingredient.fromItems(Items.FLINT);
    })
    ;

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyLoadBase<Ingredient> repairMaterial;

    private extratools_tiers(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = new LazyLoadBase<>(repairMaterialIn);
    }

    @Override
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }
}
