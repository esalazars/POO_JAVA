/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modules;

/**
 *
 * @author user Eladio Salazar Suarez
 */
import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.*;

public class Tiquet{
    private int code;
    private String /* Facture*/ facture; //Atributos de relacion
    private Flight flight;//Atributos de relacion
    private static int serial = 0;
    public static HashMap<Integer,Tiquet> tiquets = new HashMap<Integer,Tiquet>(); // Lista de tiquets creados
    public static final String DEST = "C:\\Users\\UNAL\\Documents\\GitHub\\POO_JAVA\\TravelWorld\\src\\java\\files";
     
    public Tiquet(Flight flight) throws IOException{
        Tiquet.more();
        this.setCode(Tiquet.serial);
        this.setFlight(flight);
        tiquets.put(this.getCode(), this);
        this.saveTiquet(Tiquet.DEST+"\\"+this.getCode()+".pdf");
    }
    
    //Definicion de set y get
    //Codigo
    public void setCode(int codigo){
        if(Tiquet.tiquets.containsKey(codigo)){
            Tiquet.more();
            this.setCode(Tiquet.serial);
        }else{
            this.code = codigo;
        }
    }
    public int getCode(){
	return this.code;
    }
    //Vuelo
    public void setFlight(Flight vuelo){
	this.flight = vuelo;
    }
    public Flight getFlight(){
	return this.flight;
    }
    //Factura en la cual fue pagada
    public void setFacture(String factura){
	this.facture = factura;
    }
    public String getFacture(){
	return this.facture;
    }
    
    //Metodo guardar, creara un pdf con el tiquete
    public void saveTiquet(String dest)throws IOException{
        //Escribe el pdf en la ruta dest que le pasamos
        PdfWriter writer = new PdfWriter(dest);
        //Para que PdfWriter escriba el documento hace uso de PdfDocument
        //la cual distribuye, gestiona y organiza el contenido a traves
        //de las paginas dentro del pdf, hace seguimiento de lo que 
        //le agreguemos al pdf
        PdfDocument pdf = new PdfDocument(writer);
        //Hace el diseño del pdf, por defecto el tamaño pagina es A4 y rotacion vertical
        //Con Page.size modifica el tamaño y .rotate rota la alineacion de la pagina
        Document document = new Document(pdf,PageSize.A5.rotate());
        //Agrega margenes, por defecto es de 26 unidades, o meda pulgada
        //.setMargins(superio, derecha, fondo, izquierda)
        document.setMargins(10,10,10,10);
        PdfFont titles = PdfFontFactory.createFont(FontConstants.COURIER_BOLD);
        PdfFont cont = PdfFontFactory.createFont(FontConstants.HELVETICA);
        
        //Crea la tabla donde metere los datos, enviandole el numero de columnas
        // con su ancho [](col1,col2,col3) y el valor de col es el ancho
        Table tabla = new Table(new float[]{3,3,3});
        //La tabla tendra el 100% el ancho de la pagina respetando margenes
        tabla.setWidthPercent(100);
        //tabla.setBorder(Border.NO_BORDER);
        tabla.addHeaderCell(new Cell().add(new Paragraph("Codigo:").setFont(titles)));      
        tabla.addCell(new Cell().add(new Paragraph("Hola que hace joven. Aqui durmiendome.").setFont(cont)));
        //process(tabla, lineas, titles,true);
        //process(tabla,lineas,cont,false);        
        document.add(tabla);
        //Cerramos el document cuando hemos terminado de agregar todo
        document.close();
        //new File(dest).delete();
    }
    
    //Metodo para leer el archivo y agregar las lineas a la tabla
    /*
    public void process(Table tabla, String linea, PdfFont fuente, boolean isHeader){
        //Leer la primera linea, crea una celda con de encabezado addHeaderCell
        //y le agrega un parrafo con la fuente que le colocamos
        StringTokenizer token = new StringTokenizer(linea,",");
        while(token.hasMoreTokens()){
            if(isHeader){
                tabla.addHeaderCell(new Cell().add(new Paragraph(token.nextToken()).setFont(fuente)).setBorder(Border.NO_BORDER));
            }else{
                //Cuando no es la primera linea agrega celdas normales y le agrega el parrafo
                tabla.addCell(new Cell().add(new Paragraph(token.nextToken()).setFont(fuente)));
            }
        }
    }
    */
    //Metodo imprimir, tomara el pdf creado y lo imprimira
    public void printTiquet(){
		
    }	//Metodos de clase
    //Define serial para cada tiquete generado, es un metodo auxiliar
    private static void more(){
        Tiquet.serial++;
        if(Tiquet.tiquets.containsKey(Tiquet.serial)){
            Tiquet.more();
        }
    }
    //Borrar tiquete
    public static Boolean delete(int codigo){
        if(Tiquet.tiquets.containsKey(codigo)){
            try{
                if(Tiquet.tiquets.remove(codigo) != null){
                    return true;
                }
                return false;
            }
            catch(Exception e){
                return false;
            }            
        }else{
            return false;
        }
    }
    /*Metodos por definir
    Guardar()
    Imprimir()
    */
    


}
