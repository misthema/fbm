package mist2meat.fbm.tilemap;

import java.util.ArrayList;

public class Tilemap {
	
	private ArrayList<Tile> tiles;
	
	private String mapName; // Name of the map
	private int    mapWidth;
	private int    mapHeight;
	private int    tileWidth;
	private int    tileHeight;
	
	public String getMapName()    { return mapName; }
	public int    getMapWidth()   { return mapWidth; }
	public int    getMapHeight()  { return mapHeight; }
	public int    getTileWidth()  { return tileWidth; }
	public int    getTileHiehgt() { return tileHeight; }
	
	public Tilemap() {
		mapName = "";
		mapWidth = 0;
		mapHeight = 0;
		tileWidth = 0;
		tileHeight = 0;
		tiles = new ArrayList<Tile>();
	}
	
	public void loadMap(String path, String tileset) {
		// TODO: CB-karttaformaatin lataus
		
		
	}
	
	public void unloadMap() {
		// TODO: Kartan poistaminen (v‰liaikanen toteutus tehty)
		// Mik‰li pit‰‰ paikkaansa, ett‰ ilman referenssi‰ tieto
		//  poistetaan muuttujista, niin t‰m‰n pit‰isi toimia.
		
		mapName = null;
		mapWidth = 0;
		mapHeight = 0;
		tileWidth = 0;
		tileHeight = 0;
		tiles = null;
	}
	
	public void editMap(int newID, int x, int y, int layer) {
		// TODO: Kartan muokkaus tilekohtaisesti 
	}
	
	public void setMap(int layer, boolean isActive) {
		// TODO: Kartan kerroksien piirt‰minen ja/tai p‰ivitt‰minen p‰‰lle ja pois
	}
	
	public int getMap(double x, double y, int layer) {
		// TODO: Tilen etsint‰ kartasta pikseli-koordinaateilla halutusta kerroksesta
		return 0;
	}
	
	public int getMap(int x, int y, int layer) {
		// TODO: Tilen etsint‰ kartasta tile-koordinaateilla halutusta kerroksesta
		return 0;
	}
	
	
}
