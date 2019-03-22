package JavaBaseStudy;

import java.io.*;

public class IOFile {

//    字节输入输出流
    public void ioStudyByte(){
        File file = new File("./word.text");
        try {
            FileOutputStream outputStream = new FileOutputStream(file);
            byte buy[] = "i have a horse but don't rose for ever.".getBytes();
            outputStream.write(buy);
            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte [] byt = new byte[1024];
            int len = fileInputStream.read(byt);
            System.out.println("文件中的信息是" + new String(byt,0,len));
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //    字符输入输出流
    public void ioStudyString(){
        File file = new File("./word.text");
        try {
            FileWriter outputStream = new FileWriter(file);
            String buy = "i have a tiger but don't rose for ever.";
            outputStream.write(buy);
            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileReader fileInputStream = new FileReader(file);
            char [] byt = new char[1024];
            int len = fileInputStream.read(byt);
            System.out.println("文件中的信息是" + new String(byt,0,len));
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    带缓冲区的字符输入输出流
    public void ioStringBuffer(){
        File file = new File("./word.text");
        String[] strings = {"i'm jow","wofead","hello"};
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < strings.length; i++) {
                bufferedWriter.write(strings[i]);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String s = null;
            while((s = bufferedReader.readLine()) != null){
                System.out.println(s);
            }
            bufferedReader.close();
            fileReader.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

//    数据输入输出流
    public void dataInputTest(){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("./word.text");
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeUTF("use UTF write date");
            dataOutputStream.writeChars("use chars write data");
            dataOutputStream.writeBytes("use bytes write data");
            dataOutputStream.close();
            fileOutputStream.close();
            FileInputStream fileInputStream = new FileInputStream("./word.text");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            System.out.println( dataInputStream.readUTF());
//            每次只能读取出来一个字符
            System.out.println( dataInputStream.readChar());
            System.out.println( dataInputStream.readByte());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
