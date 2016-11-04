
/**
 * Write a description of class CalendarioBasico1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasico1
{
    // se crea atributo dia entero
    private int dia;
    //se crea atributo mes entero
    private int mes;
    //se crea atributo año entero
    private int anno;

    /**
     * Constructor for objects of class CalendarioBasico1
     */
    public CalendarioBasico1()
    {
        // incializo las variables
        dia = 1;
        mes = 1;
        anno = 1;
    }

    /**
     * ahora voy a crear los metodos.
     * metodo fijarFecha y se le da tres parametros para dia mes y año
     */
    public void fijarFecha(int fijarDia, int fijarMes, int fijarAnno)
    {
            
        dia = fijarDia;
            
        mes = fijarMes;
        
        anno = fijarAnno;
        
    }
    
    
}
