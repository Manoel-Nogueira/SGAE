package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class ExtensionFormsController {
	
	//Variável que pega o nome do SO em minúsculo
	private static String so = System.getProperty("os.name").toLowerCase();
	private static String folderForms;

	public static String getSo() {
		return so;
	}
	
	public static String getFolderForms () {
		return folderForms;
	}

	public static void setSo(String so) {
		ExtensionFormsController.so = so;
	}

	public static void setFolderForms (String folderForms) {
		ExtensionFormsController.folderForms = folderForms;
	}

	public static void createFolderForms (String name) {
		
		//Pega o caminho do diretório SGAE
		File sourceFile = new File(System.getProperty("user.dir"));
		
		//Pega a pasta onde o diretório SGAE está
		String sourceFolder = sourceFile.getParent();
		
		String so = getSo();
		
		//indexOf retorna a posição da primeira ocorrência dos caracteres
		//Criando a pasta formsFiles se o sistema operacional for Windows
		if(so.indexOf("win") >= 0) {
			
			Path directory = Paths.get(sourceFolder + "\\" + name);
					
			if(new File(directory.toString()).mkdir() || Files.isDirectory(directory)) {

				setFolderForms(directory + "\\");
			}				
		}
				
		//Criando a pasta formsFiles se o sistema operacional for linux
		if(so.indexOf("nix") >= 0 || so.indexOf("nux") >= 0 || so.indexOf("aix") >= 0) {
			
			Path directory = Paths.get(sourceFolder + "/" + name);
			
			if(new File(directory.toString()).mkdir() || Files.isDirectory(directory)) {
				
				setFolderForms(directory + "/");
				
			}
		}
	}

	public static boolean createNewForm(String nameFile, ArrayList<String> listChoices, String nameFolder) throws IOException {
		
		createFolderForms (nameFolder);
		
		Path directoryFileForm = Paths.get(getFolderForms() + nameFile + ".txt");
		
		if(Files.notExists(directoryFileForm)) {
			
			//Cria o arquivo
			Files.createFile(directoryFileForm);
			
			FileWriter toWrite = new FileWriter(directoryFileForm.toString());
			
			//Insere as escolhas feitas no formulário dentro do arquivo utilizando o for-each
			for(String choice : listChoices) {
			
				//Fecha o arquivo
				toWrite.write(choice);
				
			}
			
			toWrite.close();
				
		}else {
			
			return false;
		 
		}
		
		return true;
		
	}

	public static boolean deleteForm(String nameFile) throws IOException {
		
		Path directoryFileForm = Paths.get(getFolderForms() + nameFile + ".txt");
		
		if(Files.exists(directoryFileForm)) {
			
			Files.delete(directoryFileForm);
			
		}else {
			
			return false;
			
		}
		
		return true;
	}
	
	public static boolean editForm(String nameFile,  ArrayList<String> listChoices, String nameFolder) throws IOException {
		
		if(deleteForm(nameFile)) {
			
			if(createNewForm(nameFile, listChoices, nameFolder)) {
				
				return true;
				
			}
			
		}
	
		return false;
	}

	public static ArrayList<String> readForm(String nameFile) throws IOException{
		
		Path directoryFileForm = Paths.get(getFolderForms() + nameFile + ".txt");
		
		ArrayList<String> listChoices = new ArrayList<String>();
		
		if(Files.exists(directoryFileForm)) {;
			
			//Pega as escolhas feitas no formulário que estão dentro do arquivo e coloca dentro de um arraylist usando o for-each
			listChoices = (ArrayList<String>) Files.readAllLines(directoryFileForm);
			
		}else {
			
			return null;
			
		}
		
		return listChoices;
	}

	public static ArrayList<String> readFolder(String nameFolder) throws IOException{
		
		createFolderForms (nameFolder);
		
		Path directorySubmissionFileForm = Paths.get(getFolderForms());
		
		ArrayList<String> listChoices = new ArrayList<String>();
		
		//Se a pasta existir
		if(Files.exists(directorySubmissionFileForm)) {
			
			//Pega o nome de todos os arquivos que tem na pasta e coloca dentro de um arraylist
			for(File namefile:directorySubmissionFileForm.toFile().listFiles()) {
				
				listChoices.add(namefile.getName());
				
			}
			
		}else {
			
			return null;
			
		}
		
		return listChoices;
	}

}
