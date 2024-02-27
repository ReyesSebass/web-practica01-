
package com.practica01.service;

import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "practica01-3af64.appspot.com";

    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "practica01";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";

    //El nombre del archivo Json
    final String archivoJsonFile = "practica01-3af64-firebase-adminsdk-ypdfn-a164364881.json";
}

