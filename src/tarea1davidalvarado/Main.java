/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1davidalvarado;

import java.io.IOException;
import tarea1davidalvarado.EchoMultiServer;
/**
 *
 * @author David
 */
public class Main {
    public static void main(String[] args) throws IOException {
        EchoMultiServer server=new EchoMultiServer();
        server.start(5555);
    }
}
