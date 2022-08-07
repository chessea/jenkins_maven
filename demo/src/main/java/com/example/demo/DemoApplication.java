package com.example.demo;
import java.util.Random;   
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Random random = new Random();   
		int x = random.nextInt(80); 
		List <Usuario> lista = new ArrayList<Usuario>();
		lista.add(new Usuario("Juan","Soto",x));
		lista.add(new Usuario("Pedro","Peres",x -2));
		lista.add(new Usuario("Raul","Gonzales", x + 6));
		lista.add(new Usuario("Samuel","dias",x + 1));
		lista.add(new Usuario("Juaquin","dinmas",x - 9));

		for (Usuario data : lista) {
			System.out.println(data);
		  }

	}

}
