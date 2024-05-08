import org.example.Quiz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuizTest {
    @Test
    public void testRespuestaRecibida_DeberiaRetornarRespuesta(){
        //Arrange
        Quiz quiz = new Quiz();
        String respuesta_esperada = "Cuzco";
        //Act
        quiz.RecibirRespuesta();
        String resultado = quiz.respuesta;
        //Assert
        assertEquals(respuesta_esperada,resultado,"Deberia ser Cuzco");
    }
    @Test
    public void testRespuestaCorrecta_DeberiaRetornarRespuestaCorrecta(){
        //Arrange
        Quiz quiz = new Quiz();
        String respuesta_correcta_esperada = "Lima";
        //Act
        quiz.CargarPregunta();
        String resultado = quiz.question.respuesta_correcta;
        //Assert
        assertEquals(respuesta_correcta_esperada,resultado,"Deberia ser Lima");
    }
}
