public class menuPrincipal {
    public static void main (String[] args){
        // primero creamos el nombre en el cual grardaremos los atributos de los videojuegos
        Videojuego Mario= new Videojuego("Mario Bros","Aventura",1980,"China","Sega");
        Videojuego rev= new Videojuego("Residen Evil","Terror",2004,"EEUU","Camcom");
        Videojuego carre= new Videojuego("Asfalt","Carreras",2014,"Japon","ConamiGames");
        Videojuego fut= new Videojuego("Fifa","Soccer",2001,"China","EASPORT");
        Videojuego sodok= new Videojuego("Sodoku","Educativo",2005,"EEUU","Google");

//Datos llamados parta el videojuego en este caso Mario Bros
        System.out.println("El nombre del videojuego es: "+Mario.nombre);
        System.out.println("La categoria del videojuego es: "+Mario.categoria);
        System.out.println("El año del video uego es: "+Mario.anio);
        System.out.println("El pais del videojuego es: "+Mario.pais);
        System.out.println("La emprtesa del videojuego es: "+Mario.empresa);




    }



    }

