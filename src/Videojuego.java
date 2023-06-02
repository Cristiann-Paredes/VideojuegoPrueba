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

    //Creación  los setters and getters

    //getter para el nombre
    public String getNombre() {
        return nombre;
    }
    //setter para el valor de nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //getter para la categoria
    public String getCategoria() {
        return categoria;
    }
    //setter para el valor de categoria
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    //getter para el año
    public int getAnio() {
        return anio;
    }
    //setter para el valor de año
    public void setAnio(int anio) {
        this.anio = anio;
    }
    //getter para el pais
    public String getPais() {
        return pais;
    }
    //setter para el valor de pais
    public void setPais(String pais) {
        this.pais = pais;
    }
    //getter para la empresa
    public String getEmpresa() {
        return empresa;
    }
    //setter para el valor de empresa
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

}
