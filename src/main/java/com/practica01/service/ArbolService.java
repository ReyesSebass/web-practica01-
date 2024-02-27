package com.practica01.service;

import com.practica01.domain.Arbol;
import java.util.List;

public interface ArbolService {

    /* Se define la firma del metodo que recupera la lista 
    de objetos tipo Arbol que son los registros de la tabla arbol */
    public List<Arbol> getArboles(boolean sanos);

    /* Se define  la firma del metodo para recuperar un registro de 
    la tabla arbol, recuperando el registro que tiene el 
    idArbol, sino lo encuentra retorna null*/
    public Arbol getArbol(Arbol arbol);

    /* Se define la firma del metodo para crear o actualizar un registro de 
    la tabla arbol, Si el idArbol no tiene valor, se crea
    el registro, si tiene valor, entonces modifica ese registro */
    public void save(Arbol arbol);

    /* Se define la firma del metodo para eliminar un registro de 
    la tabla arbol, considerando idArbol */
    public void delete(Arbol arbol);

}
