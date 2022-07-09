package co.com.choucair.certification.apirest.exceptions;

public class AssertionsServices extends AssertionError {

    private static final long serialVersionUID = 1L;

    public static final String NO_SE_ESPERA_LA_RESPUESTA_DE_LOS_SERVICIOS_DE_CÓDIGO_DE_ESTADO = "No se espera la respuesta de los servicios de código de estado";

    public static final String LA_CANTIDAD_DE_CAMPOS_REQUERIDOS_NO_LLEGARON_EN_LA_RESPUESTA = "La cantidad de campos requeridos no llegaron en la respuesta";

    public static final String EL_ESQUEMA_DE_LA_RESPUESTA_NO_ES_EL_CORRECTO  = "El esquema de la respuesta no es el correcto";

    public static final String LOS_CAMPOS_OBTENIDOS_EN_LA_RESPUESTA_NO_SON_CORRECTOS = "Los campos obtenidos en la respuesta no son correctos";

    public static final String LOS_DATOS_OBTENIDOS_EN_LA_RESPUESTA_NO_SON_IGUALES_A_LOS_PROPORCIONADOS = "Los datos obtenidos en la respuesta no son iguales a los proporcionados";

    public AssertionsServices(String message, Throwable cause){
        super(message, cause);
    }

    public AssertionsServices(String message){
        super(message);
    }

}
