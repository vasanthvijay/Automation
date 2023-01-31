package Reusability;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import org.testng.annotations.Test;

public class single_mail_id_generator {
	

		   

		
		public static String generate_name() throws Exception{
			BufferedReader br = new BufferedReader(new FileReader("../ai.neopat/File/num"));
			String st = "";
			int i=0;
			while((st=br.readLine())!=null) {
				i = Integer.parseInt(st);
			}
			 st = "superman" + i++ + "@examly.in"; 
			 
			 BufferedWriter bw = new BufferedWriter(new FileWriter("../ai.neopat/File/num"));
			 bw.write(Integer.toString(i));
			 bw.close();
			 return st;
		}
	}



