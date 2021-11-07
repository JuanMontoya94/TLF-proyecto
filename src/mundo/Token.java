/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad del Quindío (Armenia - Colombia)
 * Programa de Ingeniería de Sistemas y Computación
 *
 * Asignatura: Teoría de Lenguajes Formales
 * Ejercicio: AnalizadorLexico
 * Diseño original por: Leonardo A. Hernández R. - Agosto 2008 - Marzo 2009
 * Modificado y usado por: Claudia E. Quiceno R- Julio 2021
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package mundo;

/**
 * Clase que modela un token
 */

public class Token {
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------
    /**
     * Constantes para modelar los posibles tipos de token que se van a analizar
     */
    final public static String ENTERO = "Entero";
    final public static String OPERADORADITIVO = "Operador aditivo";
    final public static String OPERADOR = "Operador";
    final public static String OPERADORASIGNACION = "Operador de asignación";
    final public static String IDENTIFICADOR = "Identificador";
    final public static String NORECONOCIDO = "No reconocido";
	final public static String OPERADORSEPARADORDESENTENCIA = "operador separador de sentencia";
	final public static String OPERADORTERMINALOINICIAL = "Operador terminal o inicial";
	final public static String OPERADORARITMETICO = "Operador aritmetico";
	final public static String OPERADORRELACIONAL = "Operador relacional";
	final public static String OPERADORLOGICO = "Operador Logico";
	final public static String OPERADORABRIROCERRAR = "Simbolo abrir o cerrar";

	final public static String ASIGNACIONCADENA = "Formato Cadena";
	final public static String ASIGNACIONCHAR= "Formato Character";
	final public static String ASIGNACIONENTERO= "Formato Entero";
	final public static String ASIGNACIONDOUBLE= "Formato Double";
	final public static String ASIGNACIONBOOLEAN= "Formato Boolean";
	final public static String IDENTIFICADORCLASE= "Identificador regla Clase";
	final public static String IDENTIFICADORMETODO= "Identificador regla Metodo";
	final public static String IDENTIFICADORVARIABLE= "Identificador regla Variable";
	
	final public static String PALABRARESERVADACICLO = "palabra reservada ciclo";
	final public static String PALABRARESERVADADESICION = "palabra reservada decision";
	final public static String PALABRARESERVADACLASE = "palabra reservada clase";
	final public static String PALABRARESERVADATIPODATOE = "palabra reservada enteros ";
	final public static String PALABRARESERVADATIPODATOD = "palabra reservada double ";
	final public static String PALABRARESERVADATIPODATOS = "palabra reservada string ";
	final public static String PALABRARESERVADATIPODATOC = "palabra reservada character ";
	final public static String PALABRARESERVADATIPODATOB = "palabra reservada boolean ";
	

 
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
    /**
     * Lexema
     */
    private String lexema;

    /**
     * tipo
     */
    private String tipo;

    /**
     * posición del siguiente lexema
     */
    private int indiceSiguiente;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------
    /**
     * Constructor de un token
     * @param elLexema - cadena - laCadena != null
     * @param elTipo - tipo del token - elTipo != null
     * @param elIndiceSiguiente - posición del siguiente token - laPosicionSiguiente > 0
     */
    public Token( String elLexema, String elTipo, int elIndiceSiguiente )
    {
        lexema = elLexema;
        tipo = elTipo;
        indiceSiguiente = elIndiceSiguiente;
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Entrega la información del token
     * @return Descripción del token
     */
    public String darDescripcion( )
    {
        return "Token: " + lexema + "     Tipo: " + tipo + "     Índice del siguiente: " + indiceSiguiente;
    }

    /**
     * Método que retorna el lexema del token
     * @return el lexema del token
     */
    public String darLexema( )
    {
        return lexema;
    }

    /**
     * Método que retorna la posición del siguiente lexema
     * @return posición del siguiente token
     */
    public int darIndiceSiguiente( )
    {
        return indiceSiguiente;
    }

    /**
     * Método que retorna el tipo del token
     * @return el tipo del token
     */
    public String darTipo( )
    {
        return tipo;
    }




}
