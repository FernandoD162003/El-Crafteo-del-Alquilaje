public class Test {

	public static void main(String[] args) {
		System.out.println("Bienvenido a la tienda de alquilaje de Videojuegos: El crafteo del alquilaje\n----------------------------------------------------------------------------\n"
						+ "El programa simula una tienda que alquila juegos\n"
						+ "Los articulos solo se pueden vender si estan disponibles en la tienda\n"
						+ "El usuario puede:\n"
						+ "\t alquilar productos de los existentes.\n"
						+ "\t Anadir nuevos productos a la cesta.\n"
						+ "\t Consultar el importe de la cuenta.\n"
						+ "\t Devolver un producto");

		boolean continuar = true;
		int lecturaProducto, lecturaCantidad; // Se declaran las variables para alquiler
												

		// Se instancian y cargan los productos
		Producto juego1 = new Videojuego("The Legend of Zelda: Breath of the Wild", 8, 10, true, "Accion-Aventura", "Nintendo Switch");
		Producto juego2 = new Videojuego("Mario Odyssey", 8, 10, true, "Aventura-Plataformas", "Nintendo Switch");
		Producto juego3 = new Videojuego("Detroit Become Human", 8, 10, true, "Accion-Aventura", "PlayStation 4");
		Producto juego4 = new Videojuego("Gos of War", 8, 10, true,"Accion-Aventura", "PlayStation 4");
		Producto juego5 = new Videojuego("Halo: The Master Chief Collection", 8, 10, true,"Disparos-Accion", "Xbox One");
		Producto juego6 = new Videojuego("State of Decay 2", 8, 10, true,"Supervivencia-Accion", "Xbox One");
		Producto juego7 = new Videojuego("Fall Guys", 8, 20, true,"Plataformas-Ultimo hombre en pie", "PC");
		Producto juego8 = new Videojuego("Minecraft: Java edition", 8, 30, true,"Aventura-Exploracion", "PC");

		// Se crea el array "catálogo" para contener los productos. Su dimensión viene del número de veces que se instancia el contructor de Producto
		Producto catalogo[] = new Producto[Producto.dimesionArray];
		// Se crea el objeto gestion para trabajar (mostrar y vender productos, y mostrar caja)
		Gestion gestion = new Gestion();

		// Se rellena el array catálogo
		catalogo[0] = juego1;
		catalogo[1] = juego2;
		catalogo[2] = juego3;
		catalogo[3] = juego4;
		catalogo[4] = juego5;
		catalogo[5] = juego6;
		catalogo[6] = juego7;
		catalogo[7] = juego8;

		do {
			System.out.println("\n\nIntroduzca la opcion que desea realizar:\n"
					+ "1. Mostrar productos\n" + "2. Alquilar productos\n"
					+ "3. Mostrar caja\n"
					+ "4. Devolver productos\n"
					+ "SALIR --> Pulse cualquier otro numero\n");
			switch (Leer.datoInt()) {
			case 1:
				gestion.mostrarProductos(catalogo);
				break;
			case 2:
				System.out.println("¿que producto desea alquilar?");
				gestion.mostrarNombreProductos(catalogo);
				lecturaProducto = Leer.datoInt();
				System.out.println("¿cuanta cantidad desea alquilar?");
				lecturaCantidad = Leer.datoInt();
				if (lecturaCantidad <= 0){
					System.out.println("Esta cantidad de copias no es valida");
				} else {
				// Se carga el producto y la cantidad solicitada por el usuario
				gestion.comprarProducto(catalogo, lecturaProducto,
						lecturaCantidad);
				}
				break;
			case 3:
				System.out.println("Q " + gestion.mostrarCaja());
				break;
			case 4:
				System.out.println("¿que producto desea devolver");
				gestion.mostrarNombreProductos(catalogo);
				lecturaProducto = Leer.datoInt();
				System.out.println("¿cuanta cantidad desea devolver?");
				lecturaCantidad = Leer.datoInt();
				gestion.devolverProducto(catalogo, lecturaProducto,
					lecturaCantidad);
				break;
			default:
				// Salir del programa
				continuar = false;
			}

		} while (continuar);

		System.out.println("---- Gracias por usar la aplicacion. ----");

	}

}
