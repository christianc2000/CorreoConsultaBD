/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clientes;

/**
 *
 * @author Christian
 */
public class MainCliente {
    
     public static void main(String[] arg){
        System.out.println("INICIANDO CLIENTE SMTP");
        ClienteSMTP csmtp = new ClienteSMTP("mail.tecnoweb.org.bo", 25);//SMTP usa el puerto 25 en el servidor
        //csmtp.iniciar();
    }
}
