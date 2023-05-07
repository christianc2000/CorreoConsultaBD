/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.correoconsultabd;

import Clientes.ClientePOP3;
import Clientes.ClienteSMTP;
import DBPostgresql.DPersona;
import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class CorreoConsultaBD {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        //DPersona dpersona=new DPersona();
        //  System.out.println("**********************PERSONA***************************");
        //dpersona.mostrarHashMap(dpersona.selectAll());
        CorreoConsultaBD app = new CorreoConsultaBD();
        app.iniciar();

    }

    public void iniciar() {
        
        System.out.println("INICIANDO CLIENTE POP3");
        ClientePOP3 cpop=new ClientePOP3("mail.tecnoweb.org.bo", 110);
        cpop.iniciar();
    }

}
