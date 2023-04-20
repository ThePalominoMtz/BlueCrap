package mesas;

public class GettersandSetters {
    String NombreProducto, Proveedor,Mesero;
      int Cantidad,NumMesa,Folio, Precio;

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    public String getMesero() {
        return Mesero;
    }

    public void setMesero(String Mesero) {
        this.Mesero = Mesero;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getNumMesa() {
        return NumMesa;
    }

    public void setNumMesa(int NumMesa) {
        this.NumMesa = NumMesa;
    }

    public int getFolio() {
        return Folio;
    }

    public void setFolio(int Folio) {
        this.Folio = Folio;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }
}