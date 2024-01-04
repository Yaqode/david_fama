package com.market.fama.domain;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class UtilService {

    public static String leerImagenComoBase64(String rutaImagen) throws IOException {
        File archivoImagen = new File(obtenerRutaBaseDelProyecto() + rutaImagen);
        BufferedImage imagen = ImageIO.read(archivoImagen);

        if (imagen != null) {
            // Convertir BufferedImage a Base64
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(imagen, "jpg", baos);
            byte[] bytes = baos.toByteArray();
            return Base64.getEncoder().encodeToString(bytes);
        }

        return null;
    }

    public static void guardarImagenComoBase64(Image image, String urlImage) throws IOException {
        String rutaCompleta = obtenerRutaBaseDelProyecto() + "\\img\\productos" + urlImage;

        try (FileOutputStream fos = new FileOutputStream(new File(rutaCompleta))) {
            String imagenBase64 = image.getImageRoute();
            // Verificar y quitar el prefijo "data:image/jpeg;base64,"
            if (imagenBase64.startsWith("data:image/jpeg;base64,")) {
                imagenBase64 = imagenBase64.substring("data:image/jpeg;base64,".length());
            }
            byte[] imagenBytes = Base64.getDecoder().decode(imagenBase64);
            fos.write(imagenBytes);
        }
    }

    private static String obtenerRutaBaseDelProyecto() {
        Path currentRelativePath = Paths.get("");
        return currentRelativePath.toAbsolutePath().toString();
    }

    public static String crearCarpeta(String nombreCarpeta) {
        // Crear un objeto File que represente la carpeta
        File carpeta = new File(obtenerRutaBaseDelProyecto() + "\\img\\productos\\" + nombreCarpeta);

        // Verificar si la carpeta no existe y luego intentar crearla
        if (!carpeta.exists()) {
            if (carpeta.mkdirs()) {
                return nombreCarpeta;
            } else {
                System.err.println("No se pudo crear la carpeta.");
                return "Error";
            }
        } else {
            System.out.println("La carpeta ya existe.");
            return nombreCarpeta;
        }
    }

}
