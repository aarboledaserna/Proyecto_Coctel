package org.example.helpers.validaciones;

import org.example.helpers.generals.RegexValidator;
import org.example.helpers.mensajes.RegexExpresiones;

public class CoctelValidacion {

    RegexValidator regexValidator= new RegexValidator();

    public boolean validarPrecio(Double precio)throws Exception{

        if(precio < 0){
            throw new Exception("Solo se permiten numeros positivos");
        }
        return true;
    }

    public boolean validarNombre(String nombre)throws Exception{
        if(!regexValidator.validarRegex(nombre, RegexExpresiones.VALIDAR_SOLO_LETRAS_Y_ESPACIOS.getExpresionRegular())){
            throw new Exception("error en el formato del nombre del coctel");
        }
        return true;

    }

    public boolean validarCantidad(Double cantidad)throws Exception{

        if(cantidad < 0){
            throw new Exception("Solo se permiten numeros positivos");
        }
        return true;
    }

    public boolean validarDescripcion(String descripcion)throws Exception{
        if(!regexValidator.validarRegex(descripcion, RegexExpresiones.VALIDAR_SOLO_LETRAS_Y_ESPACIOS.getExpresionRegular())){
            throw new Exception("error en el formato del nombre del coctel");
        }
        return true;

    }

    public boolean validarCategoria(String categoria) throws Exception {
        if (!regexValidator.validarRegex(categoria, RegexExpresiones.VALIDAR_SOLO_LETRAS_SIN_ESPACIOS.getExpresionRegular())) {
            throw new Exception("Solo se permiten letras sin espacios");
        }
        return true;
    }

    public boolean validarPaisOrigen(String paisOrigen) throws Exception {
        if (!regexValidator.validarRegex(paisOrigen, RegexExpresiones.VALIDAR_SOLO_LETRAS_SIN_ESPACIOS.getExpresionRegular())) {
            throw new Exception("Solo se permiten letras sin espacios");
        }
        return true;
    }

    public boolean validargradoAlcohol(Double gradoAlcohol)throws Exception{

        if(gradoAlcohol < 0 || gradoAlcohol > 70){
            throw new Exception("Solo se permiten numeros entre 0 y 100");
        }
        return true;
    }


}
