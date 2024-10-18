package integration;

/**
 * Immutable Data Transfer Object representing a blip on a 2D map, of a particular type.
 *
 */
public class BlipDTO {
	private long id;
	private int xCoordinate;
	private int yCoordinate;
	private int type;
	
	/**
	 * TODO JavaDocs
	 * @param id The unique identifier of the object to represent as a {@Code} blip.
	 * @param xCoordinate 
	 * @param yCoordinate
	 * @param type
	 */
	public BlipDTO(long id, int xCoordinate, int yCoordinate, int type) {
		this.id = id;
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		this.type = type;
	}

	public long getId() {
		return id;
	}

	public int getXCoordinate() {
		return xCoordinate;
	}

	public int getYCoordinate() {
		return yCoordinate;
	}

	public int getType() {
		return type;
	}
}
