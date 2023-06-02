public class Videojuego {
    //Creamos los atributos que van a contar cada uno de los juegos en este caso nombre,categoria,año,pais de origen y la empresa que lo creo
    String nombre;
    String categoria;
    int anio;
    String pais;
    String empresa;

    //Generamos los constructores para nuestros atributos
    public Videojuego(String nombre, String categoria, int anio, String pais, String empresa) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.anio = anio;
        this.pais = pais;
        this.empresa = empresa;
    }

    //generamos los setters and getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

}
