/**
 * 
 */
package com.someguyssoftware.gottschcore.world.gen.structure;

import com.someguyssoftware.gottschcore.positional.ICoords;

import net.minecraft.block.state.IBlockState;

/**
 * @author Mark Gottschling on Feb 12, 2020
 *
 */
public class BlockInfoContext {
	ICoords coords;
	GottschTemplate.BlockInfo blockInfo;
	IBlockState state;
	boolean postProcess;

	/**
	 * 
	 * @param blockInfo
	 * @param coords
	 * @param state
	 */
	public BlockInfoContext(GottschTemplate.BlockInfo blockInfo, ICoords coords, IBlockState state) {
		this.blockInfo = blockInfo;
		this.coords = coords;
		this.state = state;
		this.postProcess = false;
	}
	
	/**
	 * 
	 * @param blockInfo
	 * @param coords
	 * @param state
	 * @param postProcessCandidate
	 */
	public BlockInfoContext(GottschTemplate.BlockInfo blockInfo, ICoords coords, IBlockState state, boolean postProcess) {
		this(blockInfo, coords, state);
		this.postProcess = postProcess;
	}
	
	public GottschTemplate.BlockInfo getBlockInfo() {
		return blockInfo;
	}

	public void setBlockInfo(GottschTemplate.BlockInfo blockInfo) {
		this.blockInfo = blockInfo;
	}

	public IBlockState getState() {
		return state;
	}

	public void setState(IBlockState state) {
		this.state = state;
	}
	
	public ICoords getCoords() {
		return coords;
	}

	public void setCoords(ICoords coords) {
		this.coords = coords;
	}

	/** convenience methods for comparators */
	
	public int getX() {
		return getCoords().getX();
	}
	
	public int getY() {
		return getCoords().getY();
	}
	
	public int getZ() {
		return getCoords().getZ();
	}
	
	public boolean isPostProcess() {
		return postProcess;
	}

	public void setPostProcess(boolean postProcessCandidate) {
		this.postProcess = postProcessCandidate;
	}
}
