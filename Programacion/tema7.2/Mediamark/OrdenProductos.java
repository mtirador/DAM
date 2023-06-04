package Mediamark;

import java.util.Comparator;

public class OrdenProductos implements Comparator<Productos>{


	public int compare(Productos o1, Productos o2) {

		return  Float.compare(o1.getPrecio(),o2.getPrecio());
	}

}
