package factory;

class ProductoFactory {
    public static Producto getProducto(String tipo) {
        if (tipo.equalsIgnoreCase("A")) {
            return new Ciudad1();
        } else if (tipo.equalsIgnoreCase("B")) {
            return new Ciudad2();
        }
        return null;
    }
}