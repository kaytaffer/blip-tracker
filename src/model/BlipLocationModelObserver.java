package model;

import java.util.Map;

import integration.BlipDTO;

/**
 * Observer interface that informs classes that implements it that the {@code BlipLocationModel} has
 * updated its map of blip objects.
 */
public interface BlipLocationModelObserver {
	
	/**
     * Called by the observed {@code BlipLocationModel} when it has updated its map of blip objects.
     * @param A key-value map of Data Transfer Objects representing blips.
     */
	void notifyObserversBlipsHaveChanged(Map<Long, BlipDTO> blips);
}
