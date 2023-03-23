package com.exterro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Path("/go")
public class Controller {
    @Path("/file")
    @POST
    // @Consumes(MediaType.APPLICATION_JSON)
    @Produces("text/html")
    public void getData(@FormParam("upload") String data) throws IOException {

        try {
        	
            String sourceFile = data;
            FileOutputStream FoS = new FileOutputStream(data + ".zip");
            ZipOutputStream zipOut = new ZipOutputStream(FoS);
            File fileToZip = new File(sourceFile);

            zipFile(fileToZip, fileToZip.getName(), zipOut);
            zipOut.close();
            FoS.close();

            JedisPool pool = new JedisPool("localhost", 6379);
            Jedis jedis = pool.getResource();
            jedis.sadd("FilePath", data + ".zip");
            pool.close();
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

    }

    private static void zipFile(File fileToZip, String fileName, ZipOutputStream zipOut) throws IOException {
        if (fileToZip.isHidden()) {
            return;
        }
        if (fileToZip.isDirectory()) {
            if (fileName.endsWith(" / ")) 
            {
                zipOut.putNextEntry(new ZipEntry(fileName));
                zipOut.closeEntry();
            } 
            else 
            {
                zipOut.putNextEntry(new ZipEntry(fileName + " / "));
                zipOut.closeEntry();
            }
            File[] children = fileToZip.listFiles();
            for (File childFile : children) {
                zipFile(childFile, fileName + " / " + childFile.getName(), zipOut);
            }
            return;
        }
        FileInputStream FiS = new FileInputStream(fileToZip);
        ZipEntry zipEntry = new ZipEntry(fileName);
        zipOut.putNextEntry(zipEntry);
        byte[] bytes = new byte[1024];
        int length;
        while ((length = FiS.read(bytes)) >= 0) {
            zipOut.write(bytes, 0, length);
        }
        FiS.close();
    }

}