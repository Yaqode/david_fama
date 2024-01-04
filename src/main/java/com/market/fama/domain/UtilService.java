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

        if (image instanceof BufferedImage) {
            // Si la imagen ya es BufferedImage, simplemente guárdala como JPEG
            guardarImagenComoJPEG((BufferedImage) image, rutaCompleta);
        } else {
            // Si no es BufferedImage, conviértela a BufferedImage antes de guardarla
            BufferedImage bufferedImage = convertirAImageBuffered(image);
            guardarImagenComoJPEG(bufferedImage, rutaCompleta);
        }
    }

    private static void guardarImagenComoJPEG(BufferedImage bufferedImage, String rutaCompleta) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(new File(rutaCompleta))) {
            // Guardar la imagen en formato JPEG
            ImageIO.write(bufferedImage, "jpg", fos);
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
