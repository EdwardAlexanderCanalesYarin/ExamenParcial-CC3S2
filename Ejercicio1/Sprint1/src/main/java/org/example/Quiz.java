package org.example;

import java.util.Scanner;

public class Quiz {
    public String respuesta;
    String opcion;
    public Question question = new Question();
    Scanner lector = new Scanner(System.in);
    public void CargarPregunta(){
        System.out.println("Ingresa la pregunta: ");
        question.descripcion_pregunta = lector.nextLine();
        for(int i=0; i<4; i++){
            System.out.println("Ingresa la opcion " + (i+1));
            opcion = lector.nextLine();
            question.opciones_disponibles.add(opcion);
        }
        System.out.println("Ingresa la respuesta correcta: ");
        question.respuesta_correcta = lector.nextLine();
    }
    public void MostrarPregunta(){
        int i=1;
        System.out.println("Pregunta: " + question.descripcion_pregunta);
        for(Object opc: question.opciones_disponibles){
            System.out.println(i + ") "+ opc);
            i++;
        }
        RecibirRespuesta();
    }
    public void RecibirRespuesta(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresa tu respuesta: ");
        String respuesta_recibida = lector.nextLine();
        respuesta = respuesta_recibida;
    }
}
