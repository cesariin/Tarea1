public class Main {
    public static void main(String[] args) {
        Producto producto_1 = new Producto(1, "Mesa",2300 , 2);
        Electronico producto_2 = new Electronico(2, "Televisión", 6395,4, "LG");

        System.out.println("El descuento que tendras en el Televisión es: "+"Q"+producto_2.Calculardescuento(25));

        Orden orden = new Orden();
        orden.Agregar(producto_1);
        orden.Agregar(producto_2);

        orden.Mostrar();
    }
}
