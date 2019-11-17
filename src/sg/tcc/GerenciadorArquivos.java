/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.tcc;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author paulo
 */
class GerenciadorArquivos {
    private static File f = null;
    private static GerenciadorArquivos instancia;
    
    public static GerenciadorArquivos getInstance(String nomeArquivo){
        if (f == null) {
            instancia = new GerenciadorArquivos(nomeArquivo);
        }
        return instancia;
    }
    
    private GerenciadorArquivos(String nomeArquivo){
        f = new File(nomeArquivo);
    }
    
    public static boolean criarArquivo(){
        boolean status = false;
        try{
            //f = new File (nome);
            f.createNewFile();
            //status = true;
            return true;
        } catch(IOException ioe){
            System.out.println("Não é possível criar o arquivo");
        }
        return status;
    }
    
    public static boolean gravarArquivo(Object obj){
        boolean status = false;
        try{
            FileOutputStream os = new FileOutputStream(f);
            ObjectOutputStream oout = new ObjectOutputStream(os);
            oout.writeObject(obj);
            status = true;
        } catch(IOException ioe){
            System.out.println("Erro de io");
        } catch (SecurityException se){
            System.out.println("Erro de segurança");
        }
        return status;
    }
    
    public static Object lerArquivo(){
        Object obj = null;
        try{
            FileInputStream os = new FileInputStream(f);
            ObjectInputStream ooin = new ObjectInputStream(os);
            obj = ooin.readObject();
        } catch(IOException ioe){
            System.out.println("Erro de io");
        } catch (SecurityException se){
            System.out.println("Erro de segurança");
        } catch (ClassNotFoundException cnfe){
            System.out.println("Classe não encontrada");
        }
        return obj;
    }
 }
