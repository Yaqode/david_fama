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

    public static void guardarImagenComoBase64(String base64Image, String rutaGuardar) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File(obtenerRutaBaseDelProyecto() + rutaGuardar)))) {
            writer.write(base64Image);
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
