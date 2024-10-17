package model;

/**
 * TODO JavaDoc
 *
 */
public class Blip {
	private long id;
	private int xCoordinate;
	private int yCoordinate;
	private int type;
	
	/**
	 * TODO JavaDocs
	 * @param id
	 * @param xCoordinate
	 * @param yCoordinate
	 * @param type
	 */
	public Blip(long id, int xCoordinate, int yCoordinate, int type) {
		this.setId(id);
		this.setXCoordinate(xCoordinate);
		this.setYCoordinate(yCoordinate);
		this.setType(type);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getXCoordinate() {
		return xCoordinate;
	}

	public void setXCoordinate(int xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public int getYCoordinate() {
		return yCoordinate;
	}

	public void setYCoordinate(int yCoordinate) {
		this.yCoordinate = yCoordinate;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
