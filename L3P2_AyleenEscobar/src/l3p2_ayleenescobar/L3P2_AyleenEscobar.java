
package l3p2_ayleenescobar;

import java.util.ArrayList;
import java.util.Scanner;

public class L3P2_AyleenEscobar {

    public static void main(String[] args) {
        
        ArrayList<AppsUtilidad> AppsU= new ArrayList<>();
        ArrayList<Juegos> Juego = new ArrayList<>();
        ArrayList desca = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true){
           System.out.println("¿Desea entrar como?");
           System.out.println("1. Administrador");
           System.out.println("2. Usuario ");
           System.out.println("3. Salir ");
           System.out.print("Ingrese su opcion: ");

           int opcion=sc.nextInt();
           System.out.println("");

           if (opcion==1) {
              int op=0;
               while(op!=6){
              System.out.println("1.Agregar Aplicación\n" +
                  "2.Biblioteca \n" +
                  "3.Actualización \n" +
                  "4.Eliminar Aplicación\n" +
                  "5.Estadísticas de Desarrollador\n" +
                  "6.Regresar");
              System.out.print("Ingrese su opcion: ");

              op=sc.nextInt();
              System.out.println("");

                  switch (op) {
                      case 1:
                           Agregar(AppsU,Juego);
                          break;

                      case 2:
                          Biblioteca(AppsU,Juego);
                          break;

                      case 3:
                          Actualización(AppsU,Juego);
                          break;

                      case 4:
                          Eliminar(AppsU,Juego);
                          break;

                      case 5:
                          Estadisticas(AppsU,Juego);
                          break;

                      default:
                          System.out.println("Opcion no válida.");
                          break;
                   }
               }
           } else if(opcion==2){
              int op=0;
              while(op!=7){
              System.out.println("1.Buscar por Nombre\n" +
                  "2.Buscar por Categoría \n" +
                  "3.Biblioteca \n" +
                  "4.Mostrar Descargas\n" +
                  "5.Eliminar Descargar\n" +
                  "6.Calificar Aplicación\n" +
                  "7.Regresar");
              System.out.print("Ingrese su opcion: ");

              op=sc.nextInt();
              System.out.println("");

                  switch (op) {
                      case 1:
                          BuscarNombre(AppsU,Juego);
                          break;

                      case 2:
                          //aqui te permite descargar
                          BuscarCategoría(AppsU,Juego);
                          break;

                      case 3:
                          BibliotecaU(AppsU,Juego);
                          break;

                      case 4:
                          //las descargas permiten 
                          MostrarDescargas(AppsU,Juego);
                          break;

                      case 5:
                          EliminarDescargas(AppsU,Juego);
                          break;

                      case 6:
                          Calificar(AppsU,Juego);
                          break;

                      default:
                          System.out.println("Opcion no válida.");
                          break;
                   }
               }
           }else if (opcion==3) {
               System.exit(0);
           } else {
               System.out.println("Opcion no válida.");
               break;
           }
        }
    }
    
    public static void Agregar(ArrayList<AppsUtilidad> AppsU,ArrayList<Juegos> Juego ){
        Scanner sc = new Scanner(System.in);
        Scanner sc_s = new Scanner(System.in);
        System.out.println("¿Que tipo de aplicación agregará?");
        System.out.println("1.App de Utilidad");
        System.out.println("2.Juegos");
        System.out.print("Ingrese su opcion: ");

        int option =sc.nextInt();
        System.out.println("");

        if (option==1) {
            System.out.print("Ingrese el nombre de la aplicacion: ");
            String nombre= sc_s.nextLine();
            System.out.print("Ingrese el nombre del desarrollador de la aplicacion: ");
            String desarrollador= sc_s.nextLine();
            System.out.print("Ingrese el precio de la aplicacion: ");
            double precio= sc.nextDouble();
            
            boolean estado= false;
            while (true) {                
                System.out.println("¿Qué estado tiene la aplicación?");
                System.out.println("1.Activo/ 2.Desactivo");
                int est=sc.nextInt();
                if (est==1) {
                    estado= true;
                    break;
                } else if (est==2) {
                    estado= false;
                    break;
                } else {
                    System.out.println("Opcion no válida.");
                }
            }
            
            /*System.out.print("Ingrese el rating de la aplicacion: ");
            double rating= sc.nextDouble();
            System.out.print("Ingrese las descargas de la aplicacion: ");
            int descargas= sc.nextInt();*/
            System.out.print("Ingrese la categoria de la aplicacion: ");
            String Categoria= sc_s.nextLine();
            AppsUtilidad AppsUtilidad=new AppsUtilidad(Categoria, nombre, desarrollador, precio, estado, 0, 0);
            AppsU.add(AppsUtilidad);
            System.out.println("¡Aplicación agregada exitosamente!");
            
        } else if (option==2) {
            System.out.print("Ingrese el nombre de la aplicacion: ");
            String nombre= sc_s.nextLine();
            System.out.print("Ingrese el nombre del desarrollador de la aplicacion: ");
            String desarrollador= sc_s.nextLine();
            System.out.print("Ingrese el precio de la aplicacion: ");
            double precio= sc.nextDouble();
            
            boolean estado= false;
            while (true) {                
                System.out.println("¿Qué estado tiene la aplicación?");
                System.out.println("1.Activo/ 2.Desactivo");
                int est=sc.nextInt();
                if (est==1) {
                    estado= true;
                    break;
                } else if (est==2) {
                    estado= false;
                    break;
                } else {
                    System.out.println("Opcion no válida.");
                }
            }
            
            /*System.out.print("Ingrese el rating de la aplicacion: ");
            double rating= sc.nextDouble();
            System.out.print("Ingrese las descargas de la aplicacion: ");
            int descargas= sc.nextInt();*/
            System.out.print("Ingrese el maximo de edad de la aplicacion: ");
            int edad= sc.nextInt();
            Juegos Juegos= new Juegos(edad, nombre, desarrollador, precio, estado, 0, 0);
            Juego.add(Juegos);
            System.out.println("¡Aplicación agregada exitosamente!");
        } else {
           System.out.println("Opcion no válida.");
        }
        System.out.println("");
    }
    
    public static void Biblioteca(ArrayList<AppsUtilidad> AppsU,ArrayList<Juegos> Juego){
        System.out.println("---Apps de Utilidad---");
        for (int i = 0; i < AppsU.size(); i++) {
            AppsUtilidad appsUtilidad = AppsU.get(i);
            System.out.println((i + 1) + ". " + appsUtilidad.getNombre());
        }
        
        System.out.println("");
        System.out.println("---Juegos--");
       for (int i = 0; i < Juego.size(); i++) {
            Juegos juego = Juego.get(i);
            System.out.println((i + 1) + ". " + juego.getNombre());
        }
    }
    
    public static void Actualización(ArrayList<AppsUtilidad> AppsU,ArrayList<Juegos> Juego){
        Scanner sc = new Scanner(System.in);
        Scanner sc_s = new Scanner(System.in);
        System.out.println("Aplicaciones existentes");
        Biblioteca(AppsU,Juego);
        System.out.println("");
        System.out.print("Ingrese el nombre de la aplicacion a modificar: ");
        String modNombre= sc_s.nextLine();
        for (AppsUtilidad appsUtilidad : AppsU) {
            if (appsUtilidad.getNombre()==modNombre) {
                System.out.print("Ingrese el nuevo nombre de la aplicacion: ");
                String nombre= sc_s.nextLine();
                appsUtilidad.setNombre(nombre);
                
                System.out.print("Ingrese el nombre nuevo del desarrollador de la aplicacion: ");
                String desarrollador= sc_s.nextLine();
                appsUtilidad.setDesarrollador(desarrollador);
                
                System.out.print("Ingrese el nuevo precio de la aplicacion: ");
                double precio= sc.nextDouble();
                appsUtilidad.setPrecio(precio);

                boolean estado= false;
                while (true) {                
                    System.out.println("¿Qué nuevo estado tiene la aplicación?");
                    System.out.println("1.Activo/ 2.Desactivo");
                    int est=sc.nextInt();
                    if (est==1) {
                        estado= true;
                        break;
                    } else if (est==2) {
                        estado= false;
                        break;
                    } else {
                        System.out.println("Opcion no válida.");
                    }
                }
                appsUtilidad.setEstado(estado);
                System.out.print("Ingrese la nueva categoria de la aplicacion: ");
                String Categoria= sc_s.nextLine();
                appsUtilidad.setCategoria(Categoria);System.out.println("¡Aplicacion modificado exitosamente!");
                return;
            }
        }
        for (Juegos juegos : Juego) {
            if (juegos.getNombre()==modNombre) {
                System.out.print("Ingrese el nuevo nombre de la aplicacion: ");
                String nombre= sc_s.nextLine();
                juegos.setNombre(nombre);
                
                System.out.print("Ingrese el nombre nuevo del desarrollador de la aplicacion: ");
                String desarrollador= sc_s.nextLine();
                juegos.setDesarrollador(desarrollador);
                
                System.out.print("Ingrese el nuevo precio de la aplicacion: ");
                double precio= sc.nextDouble();
                juegos.setPrecio(precio);

                boolean estado= false;
                while (true) {                
                    System.out.println("¿Qué nuevo estado tiene la aplicación?");
                    System.out.println("1.Activo/ 2.Desactivo");
                    int est=sc.nextInt();
                    if (est==1) {
                        estado= true;
                        break;
                    } else if (est==2) {
                        estado= false;
                        break;
                    } else {
                        System.out.println("Opcion no válida.");
                    }
                }
                juegos.setEstado(estado);
                System.out.print("Ingrese la nueva edad de la aplicacion: ");
                int edad= sc.nextInt();
                juegos.setEdad(edad);
                System.out.println("¡Aplicacion modificado exitosamente!");
                return;
            }
        }
        System.out.println("Error, aplicacion no encontrada.");
    }
    
    public static void Eliminar(ArrayList<AppsUtilidad> AppsU,ArrayList<Juegos> Juego){
        Scanner sc = new Scanner(System.in);
        Scanner sc_s = new Scanner(System.in);
        System.out.println("Aplicaciones existentes");
        Biblioteca(AppsU,Juego);
        System.out.println("");
        System.out.print("Ingrese el nombre de la aplicacion a eliminar: ");
        String modNombre= sc_s.nextLine();
        
        for (int i = 0; i < AppsU.size(); i++) {
            AppsUtilidad appsUtilidad = AppsU.get(i);
            if (appsUtilidad.getNombre()==modNombre) {
                AppsU.remove(i);
                return;
            }
        }
        
        for (int i = 0; i < Juego.size(); i++) {
            Juegos juego = Juego.get(i);
            if (juego.getNombre()==modNombre) {
                Juego.remove(i);
                return;
            }
        }
        
        System.out.println("Error, aplicacion no encontrada.");
    }
    
    public static void Estadisticas(ArrayList<AppsUtilidad> AppsU,ArrayList<Juegos> Juego){
        System.out.println("---Apps de Utilidad---");
        for (int i = 0; i < AppsU.size(); i++) {
            AppsUtilidad appsUtilidad = AppsU.get(i);
            System.out.println((i + 1) + ". Nombre: " + appsUtilidad.getNombre()+"\n"
                    +"Descargas: "+appsUtilidad.getDescargas()+"\n"
                    +"Rating"+appsUtilidad.getRating());
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("---Juegos--");
        for (int i = 0; i < Juego.size(); i++) {
            Juegos juego = Juego.get(i);
            System.out.println((i + 1) + ". Nombre: " + juego.getNombre());
            System.out.println("Descargas: " + juego.getDescargas());
            System.out.println("Rating: " + juego.getRating());
            System.out.println();
        }
    }
    
    public static void BuscarNombre(ArrayList<AppsUtilidad> AppsU,ArrayList<Juegos> Juego){
        ArrayList desca = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner sc_s = new Scanner(System.in);
        System.out.println("Aplicaciones existentes");
        Biblioteca(AppsU,Juego);
        System.out.println("");
        System.out.print("Ingrese el nombre de la aplicacion a buscar: ");
        String modNombre= sc_s.nextLine();
        for (int i = 0; i < AppsU.size(); i++) {
            AppsUtilidad appsUtilidad = AppsU.get(i);
            if (appsUtilidad.getNombre()==modNombre) {
                System.out.println((i + 1) + ". " + appsUtilidad.getNombre());
                while (true) {                
                    System.out.println("Quiere descargar la app?");
                    System.out.println("1.Si/ 2.No");
                    int est=sc.nextInt();
                    if (est==1) {
                        int descargas=+ appsUtilidad.getDescargas();
                        appsUtilidad.setDescargas(descargas);
                        desca.add(appsUtilidad.getNombre());
                        break;
                    } else if (est==2) {
                        break;
                    } else {
                        System.out.println("Opcion no válida.");
                    }
                }
                return;
            }
        }
        
        for (int i = 0; i < Juego.size(); i++) {
            Juegos juego = Juego.get(i);
            if (juego.getNombre()==modNombre) {
                System.out.println((i + 1) + ". " + juego.getNombre());
                while (true) {                
                    System.out.println("Quiere descargar el juego?");
                    System.out.println("1.Si/ 2.No");
                    int est=sc.nextInt();
                    if (est==1) {
                        int descargas=+ juego.getDescargas();
                        juego.setDescargas(descargas);
                        desca.add(juego.getNombre());
                        break;
                    } else if (est==2) {
                        break;
                    } else {
                        System.out.println("Opcion no válida.");
                    }
            }
                return;
            }
        }
    }
    
    public static void BuscarCategoría(ArrayList<AppsUtilidad> AppsU,ArrayList<Juegos> Juego){
        ArrayList desca = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Scanner sc_s = new Scanner(System.in);
        System.out.println("Categorias existentes");
        
        System.out.println("");
        System.out.print("Ingrese el nombre de la categoria aplicacion a buscar: ");
        String cat= sc_s.nextLine();
        boolean encontrada = false;
        
        for (int i = 0; i < AppsU.size(); i++) {
            AppsUtilidad appsUtilidad = AppsU.get(i);
            if (appsUtilidad.getCategoria().equals(cat)) {
                encontrada = true;
                System.out.println((i + 1) + ". " + appsUtilidad.getNombre());
                while (true) {
                    System.out.println("¿Quiere descargar la app?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    int est = sc.nextInt();
                    if (est == 1) {
                        int descargas = appsUtilidad.getDescargas() + 1;
                        appsUtilidad.setDescargas(descargas);
                        System.out.println("La aplicación ha sido descargada.");
                    } else if (est == 2) {
                        System.out.println("No se ha descargado la aplicación.");
                    } else {
                        System.out.println("Opción no válida.");
                    }
                    desca.add(appsUtilidad.getNombre());
                    break;
                }
            }
        }
        if (!encontrada) {
        System.out.println("No se encontraron aplicaciones en la categoría seleccionada.");
    }
    }
    
    public static void BibliotecaU(ArrayList<AppsUtilidad> AppsU,ArrayList<Juegos> Juego){
        System.out.println("Aplicaciones dispobibles: ");
        System.out.println("---Apps de Utilidad---");
        for (int i = 0; i < AppsU.size(); i++) {
            AppsUtilidad appsUtilidad = AppsU.get(i);
            System.out.println((i + 1) + ". " + appsUtilidad.getNombre());
        }
        
        System.out.println("");
        System.out.println("---Juegos--");
       for (int i = 0; i < Juego.size(); i++) {
            Juegos juego = Juego.get(i);
            System.out.println((i + 1) + ". " + juego.getNombre());
        }
    }
    
    public static void MostrarDescargas(ArrayList<AppsUtilidad> AppsU,ArrayList<Juegos> Juego){
        ArrayList desca = new ArrayList<>();
        System.out.println("Aplicaciones descargadas: ");
        for (int i = 0; i < desca.size(); i++) {
            System.out.println((i + 1) + ". " + desca);
        }
        
    }
    
    public static void EliminarDescargas(ArrayList<AppsUtilidad> AppsU,ArrayList<Juegos> Juego){
        Scanner sc = new Scanner(System.in);
        Scanner sc_s = new Scanner(System.in);
        ArrayList desca = new ArrayList<>();
        System.out.println("Aplicaciones descargadas: ");
        for (int i = 0; i < desca.size(); i++) {
            System.out.println((i + 1) + ". " + desca);
        }
        System.out.print("Ingrese el nombre de la aplicación a eliminar: ");
        String nom = sc.nextLine();

        for (int i = 0; i < desca.size(); i++) {
            if (desca.get(i).equals(nom)) {
                desca.remove(i);
                System.out.println("La aplicación ha sido eliminada.");
                break;
            }
        }
    }
    
    public static void Calificar(ArrayList<AppsUtilidad> AppsU,ArrayList<Juegos> Juego){
        Scanner sc = new Scanner(System.in);
        Scanner sc_s = new Scanner(System.in);
        BibliotecaU(AppsU,Juego);
        
        System.out.print("Ingrese el nombre la aplicacion a calificar: ");
        String modNombre= sc_s.nextLine();
        
        for (int i = 0; i < AppsU.size(); i++) {
            AppsUtilidad appsUtilidad = AppsU.get(i);
            if (appsUtilidad.getNombre()==modNombre) {
                System.out.print("Ingrese el rating de la aplicacion: ");
                double rating= sc.nextDouble();
                appsUtilidad.setRating(rating);
                return;
            }
        }
        
        for (int i = 0; i < Juego.size(); i++) {
            Juegos juego = Juego.get(i);
            if (juego.getNombre()==modNombre) {
                System.out.print("Ingrese el rating de la aplicacion: ");
                double rating= sc.nextDouble();
                juego.setRating(rating);
                return;
            }
        }
        
        System.out.println("Error, aplicacion no encontrada.");
    }
    
}
