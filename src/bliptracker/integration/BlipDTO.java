package bliptracker.integration;

/**
 * Immutable Data Transfer Object representing a blip on a 2D map, of a particular type.
 */
public class BlipDTO {
	private long id;
	private int xCoordinate;
	private int yCoordinate;
	private int type;
	
	/**
	 * Constructs an instance of a {@code BlipDTO}.
	 * @param id The unique identifier of the object to represent as a {@Code} blip.
	 * @param xCoordinate The position in the x-dimension of the object to represent.
	 * @param yCoordinate The position in the y-dimension of the object to represent.
	 * @param type A number representing the type the blip should be treated as.
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
