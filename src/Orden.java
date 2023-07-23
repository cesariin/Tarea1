import java.util.ArrayList;
import java.util.List;
public class Orden {
    private List<Producto> productos;

    public Orden(){
        productos = new ArrayList<>();
    }

    public void Agregar(Producto producto){
        productos.add(producto);
    }

    public double Total(){
        double calcular = 0;
        for(Producto producto : productos){
            calcular += producto.getPrecio() * producto.getCantidad();
        }
        return calcular;
    }

    public void Mostrar(){
        for(Producto producto : productos){
            System.out.println("Productos: "+producto.getNombre()+", Precio: "+"Q"+producto.getPrecio()+", Cantidad: "+producto.getCantidad());
        }
        System.out.println("Total de la compra es: "+"Q"+Total());
    }
}