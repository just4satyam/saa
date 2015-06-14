package ja.saa.com;



import java.io.File;
import java.io.IOException;

public class FileRename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File folder = new File("F:\\MyLife\\BalmuriWF_30052015\\");
        File[] listOfFiles = folder.listFiles();
        System.out.println("total files   "+listOfFiles.length);
        String str="BalmuriWF_0515_";
        int j=0;
       for (int i = 0; i < listOfFiles.length; i++) {
    	   	System.out.println("------1st---");
            if (listOfFiles[i].isFile()) {
            	j++;
            	System.out.println("------before--file name-----"+listOfFiles[i].getName());
                File f = new File("F:\\MyLife\\BalmuriWF_30052015\\"+listOfFiles[i].getName()); 

              f.renameTo(new File("F:\\MyLife\\BalmuriWF_30052015\\"+ str + j+".jpg"));
  
            }
        }

        System.out.println("conversion is done");
    

	}

}
