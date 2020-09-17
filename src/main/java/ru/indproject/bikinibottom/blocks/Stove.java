package ru.indproject.bikinibottom.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

import java.util.stream.Stream;

public class Stove extends Block {

    private static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.makeCuboidShape(7, 9.30109, 1, 9, 9.69891, 2), Block.makeCuboidShape(0, 0, 1.5, 16, 11.5, 16),
            Block.makeCuboidShape(0, 13, 14, 16, 16, 16), Block.makeCuboidShape(0, 11.5, 0, 16, 13, 16),
            Block.makeCuboidShape(3.30109, 8.5, 1, 3.69891, 10.5, 1.5), Block.makeCuboidShape(3.30109, 8.5, 1, 3.69891, 10.5, 1.5),
            Block.makeCuboidShape(3.30109, 8.5, 1, 3.69891, 10.5, 1.5), Block.makeCuboidShape(2.5, 9.30109, 1, 4.5, 9.69891, 1.5),
            Block.makeCuboidShape(2.5, 9.30109, 1, 4.5, 9.69891, 1.5), Block.makeCuboidShape(2.5, 9.30109, 1, 4.5, 9.69891, 1.5),
            Block.makeCuboidShape(3.30109, 8.5, 0.8000000000000007, 3.69891, 10.5, 1), Block.makeCuboidShape(3.30109, 8.5, 1, 3.69891, 10.5, 1.5),
            Block.makeCuboidShape(3.30109, 8.5, 1, 3.69891, 10.5, 1.5), Block.makeCuboidShape(12.30109, 8.5, 1, 12.69891, 10.5, 1.5),
            Block.makeCuboidShape(12.30109, 8.5, 1, 12.69891, 10.5, 1.5), Block.makeCuboidShape(12.30109, 8.5, 1, 12.69891, 10.5, 1.5),
            Block.makeCuboidShape(12.30109, 8.5, 1, 12.69891, 10.5, 1.5), Block.makeCuboidShape(11.5, 9.30109, 1, 13.5, 9.69891, 1.5),
            Block.makeCuboidShape(11.5, 9.30109, 1, 13.5, 9.69891, 1.5), Block.makeCuboidShape(11.5, 9.30109, 1, 13.5, 9.69891, 1.5),
            Block.makeCuboidShape(12.30109, 8.5, 0.8000000000000007, 12.69891, 10.5, 1), Block.makeCuboidShape(12.30109, 8.5, 1, 12.69891, 10.5, 1.5),
            Block.makeCuboidShape(7.80109, 8.5, 1, 8.19891, 10.5, 2), Block.makeCuboidShape(7.80109, 8.5, 1, 8.19891, 10.5, 2),
            Block.makeCuboidShape(7.80109, 8.5, 1, 8.19891, 10.5, 2), Block.makeCuboidShape(7.80109, 8.5, 0.8000000000000007, 8.19891, 10.5, 1),
            Block.makeCuboidShape(7.80109, 8.5, 1, 8.19891, 10.5, 2), Block.makeCuboidShape(7.80109, 8.5, 1, 8.19891, 10.5, 2),
            Block.makeCuboidShape(7, 9.30109, 1, 9, 9.69891, 2), Block.makeCuboidShape(7, 9.30109, 1, 9, 9.69891, 2)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.makeCuboidShape(14, 8.5, 7.80109, 15, 10.5, 8.19891), Block.makeCuboidShape(0, 0, 0, 14.5, 11.5, 16),
            Block.makeCuboidShape(0, 13, 0, 2, 16, 16), Block.makeCuboidShape(0, 11.5, 0, 16, 13, 16),
            Block.makeCuboidShape(14.5, 8.5, 3.3010900000000003, 15, 10.5, 3.6989099999999997), Block.makeCuboidShape(15, 8.5, 3.3010900000000003, 15.2, 10.5, 3.6989099999999997),
            Block.makeCuboidShape(14.5, 9.30109, 2.5, 15, 9.69891, 4.5), Block.makeCuboidShape(14.5, 9.30109, 2.5, 15, 9.69891, 4.5),
            Block.makeCuboidShape(14.5, 9.30109, 2.5, 15, 9.69891, 4.5), Block.makeCuboidShape(14.5, 8.5, 3.3010900000000003, 15, 10.5, 3.6989099999999997),
            Block.makeCuboidShape(14.5, 8.5, 3.3010900000000003, 15, 10.5, 3.6989099999999997), Block.makeCuboidShape(14.5, 8.5, 3.3010900000000003, 15, 10.5, 3.6989099999999997),
            Block.makeCuboidShape(14.5, 8.5, 3.3010900000000003, 15, 10.5, 3.6989099999999997), Block.makeCuboidShape(14.5, 8.5, 12.30109, 15, 10.5, 12.69891),
            Block.makeCuboidShape(14.5, 8.5, 12.30109, 15, 10.5, 12.69891), Block.makeCuboidShape(14.5, 8.5, 12.30109, 15, 10.5, 12.69891),
            Block.makeCuboidShape(14.5, 8.5, 12.30109, 15, 10.5, 12.69891), Block.makeCuboidShape(14.5, 9.30109, 11.5, 15, 9.69891, 13.5),
            Block.makeCuboidShape(14.5, 9.30109, 11.5, 15, 9.69891, 13.5), Block.makeCuboidShape(14.5, 9.30109, 11.5, 15, 9.69891, 13.5),
            Block.makeCuboidShape(15, 8.5, 12.30109, 15.2, 10.5, 12.69891), Block.makeCuboidShape(14.5, 8.5, 12.30109, 15, 10.5, 12.69891),
            Block.makeCuboidShape(14, 9.30109, 7, 15, 9.69891, 9), Block.makeCuboidShape(14, 9.30109, 7, 15, 9.69891, 9),
            Block.makeCuboidShape(14, 9.30109, 7, 15, 9.69891, 9), Block.makeCuboidShape(14, 8.5, 7.80109, 15, 10.5, 8.19891),
            Block.makeCuboidShape(14, 8.5, 7.80109, 15, 10.5, 8.19891), Block.makeCuboidShape(15, 8.5, 7.80109, 15.2, 10.5, 8.19891),
            Block.makeCuboidShape(14, 8.5, 7.80109, 15, 10.5, 8.19891), Block.makeCuboidShape(14, 8.5, 7.80109, 15, 10.5, 8.19891)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_S =Stream.of(
            Block.makeCuboidShape(7.80109, 8.5, 14, 8.19891, 10.5, 15), Block.makeCuboidShape(0, 0, 0, 16, 11.5, 14.5),
            Block.makeCuboidShape(0, 13, 0, 16, 16, 2), Block.makeCuboidShape(0, 11.5, 0, 16, 13, 16),
            Block.makeCuboidShape(12.30109, 8.5, 14.5, 12.69891, 10.5, 15), Block.makeCuboidShape(12.30109, 8.5, 15, 12.69891, 10.5, 15.2),
            Block.makeCuboidShape(11.5, 9.30109, 14.5, 13.5, 9.69891, 15), Block.makeCuboidShape(11.5, 9.30109, 14.5, 13.5, 9.69891, 15),
            Block.makeCuboidShape(11.5, 9.30109, 14.5, 13.5, 9.69891, 15), Block.makeCuboidShape(12.30109, 8.5, 14.5, 12.69891, 10.5, 15),
            Block.makeCuboidShape(12.30109, 8.5, 14.5, 12.69891, 10.5, 15), Block.makeCuboidShape(12.30109, 8.5, 14.5, 12.69891, 10.5, 15),
            Block.makeCuboidShape(12.30109, 8.5, 14.5, 12.69891, 10.5, 15), Block.makeCuboidShape(3.3010900000000003, 8.5, 14.5, 3.6989099999999997, 10.5, 15),
            Block.makeCuboidShape(3.3010900000000003, 8.5, 14.5, 3.6989099999999997, 10.5, 15), Block.makeCuboidShape(3.3010900000000003, 8.5, 14.5, 3.6989099999999997, 10.5, 15),
            Block.makeCuboidShape(3.3010900000000003, 8.5, 14.5, 3.6989099999999997, 10.5, 15), Block.makeCuboidShape(2.5, 9.30109, 14.5, 4.5, 9.69891, 15),
            Block.makeCuboidShape(2.5, 9.30109, 14.5, 4.5, 9.69891, 15), Block.makeCuboidShape(2.5, 9.30109, 14.5, 4.5, 9.69891, 15),
            Block.makeCuboidShape(3.3010900000000003, 8.5, 15, 3.6989099999999997, 10.5, 15.2), Block.makeCuboidShape(3.3010900000000003, 8.5, 14.5, 3.6989099999999997, 10.5, 15),
            Block.makeCuboidShape(7, 9.30109, 14, 9, 9.69891, 15), Block.makeCuboidShape(7, 9.30109, 14, 9, 9.69891, 15),
            Block.makeCuboidShape(7, 9.30109, 14, 9, 9.69891, 15), Block.makeCuboidShape(7.80109, 8.5, 14, 8.19891, 10.5, 15),
            Block.makeCuboidShape(7.80109, 8.5, 14, 8.19891, 10.5, 15), Block.makeCuboidShape(7.80109, 8.5, 15, 8.19891, 10.5, 15.2),
            Block.makeCuboidShape(7.80109, 8.5, 14, 8.19891, 10.5, 15), Block.makeCuboidShape(7.80109, 8.5, 14, 8.19891, 10.5, 15)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();

    private static final VoxelShape SHAPE_W =Stream.of(
            Block.makeCuboidShape(1, 9.30109, 7, 2, 9.69891, 9), Block.makeCuboidShape(1.5, 0, 0, 16, 11.5, 16),
            Block.makeCuboidShape(14, 13, 0, 16, 16, 16), Block.makeCuboidShape(0, 11.5, 0, 16, 13, 16),
            Block.makeCuboidShape(1, 8.5, 12.301090000000002, 1.5, 10.5, 12.698909999999998), Block.makeCuboidShape(1, 8.5, 12.301090000000002, 1.5, 10.5, 12.698909999999998),
            Block.makeCuboidShape(1, 8.5, 12.301090000000002, 1.5, 10.5, 12.698909999999998), Block.makeCuboidShape(1, 9.30109, 11.5, 1.5, 9.69891, 13.5),
            Block.makeCuboidShape(1, 9.30109, 11.5, 1.5, 9.69891, 13.5), Block.makeCuboidShape(1, 9.30109, 11.5, 1.5, 9.69891, 13.5),
            Block.makeCuboidShape(0.8000000000000007, 8.5, 12.301090000000002, 1, 10.5, 12.698909999999998), Block.makeCuboidShape(1, 8.5, 12.301090000000002, 1.5, 10.5, 12.698909999999998),
            Block.makeCuboidShape(1, 8.5, 12.301090000000002, 1.5, 10.5, 12.698909999999998), Block.makeCuboidShape(1, 8.5, 3.3010900000000003, 1.5, 10.5, 3.6989099999999997),
            Block.makeCuboidShape(1, 8.5, 3.3010900000000003, 1.5, 10.5, 3.6989099999999997), Block.makeCuboidShape(1, 8.5, 3.3010900000000003, 1.5, 10.5, 3.6989099999999997),
            Block.makeCuboidShape(1, 8.5, 3.3010900000000003, 1.5, 10.5, 3.6989099999999997), Block.makeCuboidShape(1, 9.30109, 2.5, 1.5, 9.69891, 4.5),
            Block.makeCuboidShape(1, 9.30109, 2.5, 1.5, 9.69891, 4.5), Block.makeCuboidShape(1, 9.30109, 2.5, 1.5, 9.69891, 4.5),
            Block.makeCuboidShape(0.8000000000000007, 8.5, 3.3010900000000003, 1, 10.5, 3.6989099999999997), Block.makeCuboidShape(1, 8.5, 3.3010900000000003, 1.5, 10.5, 3.6989099999999997),
            Block.makeCuboidShape(1, 8.5, 7.801090000000002, 2, 10.5, 8.198909999999998), Block.makeCuboidShape(1, 8.5, 7.801090000000002, 2, 10.5, 8.198909999999998),
            Block.makeCuboidShape(1, 8.5, 7.801090000000002, 2, 10.5, 8.198909999999998), Block.makeCuboidShape(0.8000000000000007, 8.5, 7.801090000000002, 1, 10.5, 8.198909999999998),
            Block.makeCuboidShape(1, 8.5, 7.801090000000002, 2, 10.5, 8.198909999999998), Block.makeCuboidShape(1, 8.5, 7.801090000000002, 2, 10.5, 8.198909999999998),
            Block.makeCuboidShape(1, 9.30109, 7, 2, 9.69891, 9), Block.makeCuboidShape(1, 9.30109, 7, 2, 9.69891, 9)
    ).reduce((v1, v2) -> {return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();



    public Stove() {
        super(AbstractBlock.Properties.create(Material.IRON)
        .hardnessAndResistance(3.5f,4.0f)
        .sound(SoundType.ANVIL)
        .harvestTool(ToolType.PICKAXE)
        .harvestLevel(2)
        );
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch(state.get(FACING)){
            case NORTH:
                return SHAPE_N;
            case EAST:
                return SHAPE_E;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_W;
            default:
                return SHAPE_N;
        }
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACING, rot.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACING)));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public float getAmbientOcclusionLightValue(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return 0.6f;
    }
}
