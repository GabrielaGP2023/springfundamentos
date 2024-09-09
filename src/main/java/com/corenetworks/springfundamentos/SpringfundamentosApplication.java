package com.corenetworks.springfundamentos;

import com.corenetworks.springfundamentos.modelo.*;
import com.corenetworks.springfundamentos.modelo.ejemplo5.Empleado;
import com.corenetworks.springfundamentos.modelo.ejemplo6.Figura;
import com.corenetworks.springfundamentos.modelo.ejemplo7.Bicicleta;
import com.corenetworks.springfundamentos.modelo.ejemplo8.Cliente;
import com.corenetworks.springfundamentos.modelo.ejemplo8.ClienteDAO;
import com.corenetworks.springfundamentos.modelo.ejemplo9.Factura;
import com.corenetworks.springfundamentos.modelo.ejemplo9.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringfundamentosApplication implements CommandLineRunner {
	@Autowired
	private Saludo s1;

	@Autowired()
	private Campos c1;

	@Autowired
	private Tablas t1;

	@Autowired
	private Punto3D p1;

	@Autowired
	@Qualifier("empleado")
	private Empleado e1;

	@Autowired
	@Qualifier("gerente")
	private Empleado g1;

	@Autowired
	@Qualifier("vendedor")
	private Empleado v1;

	@Autowired
	@Qualifier("operador")
	private Empleado o1;

	@Autowired
	private Figura cu1;
	@Autowired
	@Qualifier("triangulo")
	private Figura xx;

	@Autowired
	private Bicicleta b1;

	@Autowired
	private ClienteDAO clienteDAO;

	@Autowired
	private Factura factura;


	public static void main(String[] args) {
		SpringApplication.run(SpringfundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(s1.saludar());
		c1.Incrementa();
		System.out.println(c1.muestra());
		System.out.println("---Tabla---");
		System.out.println(t1.muestraTabla());
		System.out.println("--Punto--");
		p1.setX(2);
		p1.setY(3);
		p1.setZ(5);
		System.out.println(p1.imprimir());

		System.out.println("---- Empleado ----");
		e1.setNombre("Ramiro");
		System.out.println("Sueldo ->" + e1.calcularNomina());
		System.out.println(e1.toString());

		System.out.println("----Gerente ---");
		g1.setNombre("David G");
		System.out.println("Sueldo -> " + g1.calcularNomina());
		System.out.println(g1.toString());
//
		System.out.println("---- Vendedor ----");
		v1.setNombre("Luis B.");
		System.out.println("Sueldo -> " + v1.calcularNomina());
		System.out.println(v1.toString());
//
		System.out.println("---- Operador ---");
		o1.setNombre("Ricardo G");
		System.out.println("Sueldo -> " + o1.calcularNomina());
		System.out.println(o1.toString());

		System.out.println("--cuadrado--");
		System.out.println(cu1.calcularArea());
		System.out.println("--xx--");
		System.out.println(xx.calcularArea());

		System.out.println("--Ejemplo de Bicicleta--");
		System.out.println(b1.avanzar());

		System.out.println("--Cliente DAO ---");
		Cliente c1 = new Cliente("1234567","Pedro A" );
		System.out.println(clienteDAO.insertar(c1));

		System.out.println("Ejemplo calculo de total de iva ");
		List<Producto> productos = List.of(
				new Producto("Leche",1.0),
				new Producto ("Pan",1.0),
				new Producto("Yogourt",1.0));
		factura.setProductos(productos);
		System.out.println("Calculo del total de la factura ->" + factura.calcularTotalFactura());

	}
}
