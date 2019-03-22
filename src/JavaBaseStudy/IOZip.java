package JavaBaseStudy;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class IOZip {
    public void zip(String zipName, File input) throws Exception{
        ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(zipName));



    }

    public void zip(ZipOutputStream zipOutputStream,File f,String base) throws Exception{
        if (f.isDirectory()){
            File[] fl = f.listFiles();
            if (base.length() != 0){
                zipOutputStream.putNextEntry(new ZipEntry(base + "/"));
                for (int i = 0; i < fl.length; i++) {
                    zip(zipOutputStream,f,base + fl[i]);
                }
            }else{
                zipOutputStream.putNextEntry((new ZipEntry(base)));
                FileInputStream in = new FileInputStream(f);
                int b;
                System.out.println(base);
                while ((b = in.read()) != -1){
                    zipOutputStream.write(b);
                }
                in.close();
            }
        }
    }

    public void decompression(){
        File file = new File("hello.zip");
        ZipInputStream zin;
        try {
            ZipFile zipFile = new ZipFile(file);
            zin = new ZipInputStream(new FileInputStream(file));
            ZipEntry zipEntry = zin.getNextEntry();
            while (((zipEntry = zin.getNextEntry()) != null) && !zipEntry.isDirectory()){
                File temp = new File("./" + zipEntry.getName());
                if (!temp.exists()){
                    temp.getParentFile().mkdirs();
                    OutputStream os = new FileOutputStream(temp);
                    InputStream in = zipFile.getInputStream(zipEntry);
                    int count = 0;
                    while ((count = in.read()) != -1){
                        os.write(count);
                    }
                    os.close();
                    in.close();
                }
                zin.closeEntry();
                System.out.println(zipEntry.getName() + "解压成功");
            }
            zin.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
