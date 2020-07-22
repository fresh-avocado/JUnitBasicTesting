package testeando;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {

    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(CalculadoraTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println("Macarena te amo");
        System.out.println("2 + 2 = " + Calculadora.suma(2, 2));
    }

}
