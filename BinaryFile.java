

import java.util.*;
import java.io.*;


	public class BinaryFile{
	
		
		public static void main(String[] args){
			 
			 String fileName1;
			 String fileName2;
			 
			 if(args.length > 0){
				// text
				fileName1 = args[0];
				// binary file.
				fileName2 = args[1];
			 }
			 
			try{
			
			Scanner scan = new Scanner( new File(fileName1));
			FileOutPutStream fout = new FileOutPutStream(fileName2);
			ObjectOutPutStream out = new ObjectOutPutStream(fout);
			String line= scan.nextLine();
				while(scan.hasNext()){
				line = scan.nextLine();
				line.UseDelimeter(",");
				int num = line.nextInt(); 
				String name = line.next();
				double score = line.nextDouble();
				Student student1 = new Student(num,name,score);
				out.writeObject(student1);
				}
			 
			}

			catch(FileNotFoundException e){
			
			}
			catch(ClassNotFoundException e){
			
			}
		 }
		 
	}
		 