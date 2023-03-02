package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Person {
    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 20, 1.75),
                new Person("Bob", 25, 1.82),
                new Person("Charlie", 30, 1.68),
        };

        Optional<Person> tallest = Arrays.stream(people)
                .max((p1, p2) -> Double.compare(p1.getHeight(), p2.getHeight()));

        tallest.ifPresentOrElse(
                person -> System.out.println(person.getName() + " es la persona más alta con una altura de " + person.getHeight() + " metros"),
                () -> System.out.println("No hay datos disponibles")
        );
    }

    public static String findFirstString(List<String> strings, Predicate<String> predicate) {
        return strings.stream()
                .filter(predicate)
                .findFirst()
                .orElse(null);
    }

    public static void optional() {

        Optional<String> optional = Optional.ofNullable("Hola Mundo");
        String result = optional.orElse("Mensaje por defecto");
        System.out.println(result); // imprime "Hola Mundo"

        /*
        En este ejemplo, si el Optional contiene un valor, se devuelve ese valor. De lo contrario, se devuelve el valor proporcionado como argumento en orElse.
         */


        Optional<String> optional = Optional.empty();
        String result = optional.orElseGet(() -> "Mensaje por defecto");
        System.out.println(result); // imprime "Mensaje por defecto"

        /*
        En este ejemplo, si el Optional está vacío, se llama al proveedor de valores en orElseGet para obtener el valor predeterminado en su lugar.
         */

        Optional<String> optional = Optional.of("10");
        Optional<Integer> result = optional.map(Integer::parseInt);
        System.out.println(result.get()); // imprime 10

        /*
        En este ejemplo, se convierte el String contenido en el Optional en un entero utilizando el método parseInt de Integer.
         */

        Optional<String> optional = Optional.of("Hola Mundo");
        Optional<Character> result = optional.flatMap(s -> Optional.ofNullable(s.charAt(0)));
        System.out.println(result.get()); // imprime 'H'


        /**
         * En este ejemplo, se aplica la función lambda a la cadena contenida en el Optional, lo que devuelve otro Optional que contiene el primer carácter de la cadena. Luego, se utiliza flatMap para "aplanar" el Optional interno y devolver un Optional que contiene directamente el carácter.
         */

        Optional<String> optional = Optional.of("Hola Mundo");
        Optional<String> result = optional.filter(s -> s.contains("Mundo"));
        System.out.println(result.get()); // imprime "Hola Mundo"

        /**
         * En este ejemplo, se aplica el predicado a la cadena contenida en el Optional y se devuelve un Optional que contiene la cadena original si el predicado se cumple. Si el predicado no se cumple, se devuelve un Optional vacío.
         */

        Optional<String> optional = Optional.of("Hola Mundo");
        optional.ifPresent(s -> System.out.println(s)); // imprime "Hola Mundo"
        /**
         * En este ejemplo, se imprime la cadena contenida en el Optional si está presente. De lo contrario, no se hace nada.
         */

        Assert.assertEquals(cA1, bM1.getCuenta(cA1.getNumeroCuenta()).orElse(null));
//		Assert.assertEquals(cA2, bM1.getCuenta(cA2.getNumeroCuenta()).orElse(null));
//
//		Assert.assertEquals(cB1, bM2.getCuenta(cB1.getNumeroCuenta()).orElse(null));
//		Assert.assertEquals(cB2, bM2.getCuenta(cB2.getNumeroCuenta()).orElse(null));


        public static void main(String args[]) {

            BancoMalo bancoMalo = new BancoMalo("a");
            bancoMalo.agregarCuenta(new CuentaBancaria("a", 1000));

            try {


                Class<? extends BancoMalo> c1 = bancoMalo.getClass();
                //Hacedo al método getCunetas par5a tener acceso a las cuentas bancarías
                Method method = c1.getDeclaredMethod("getCuentas");
                //Obtengo el resultado del metodo getCuentas
                Object resultado = method.invoke(bancoMalo);
                //Muestro por pantalla el resultado
                System.out.println(resultado);
                //Ahora convierto el resultado en un ArrayList<CuentaBancaria>
                CuentaBancaria cuenta = ((ArrayList<CuentaBancaria>) resultado).get(0);
                //Muestro esl saldo de la cuenta bancaria
                System.out.println(cuenta.getSaldo());
                //Muestro el número de cuenta de la cuenta bancaria
                System.out.println(cuenta.getNumeroCuenta());

                Class<? extends CuentaBancaria> c2 = cuenta.getClass();

//			//Obtengo todos los atributos privados o públicos de la Cuenta Bancaría
//			Field[] variables = c2.getDeclaredFields();
//
//
//			for (int i = 0; i < variables.length; i++) {
//
//				if (variables[i].getName().compareTo("numeroCuenta") == 0) {
//
//					Field numeroCuenta = variables[i];
//
//					numeroCuenta.setAccessible(true);
//					// numeroCuenta.set(String.class, "aaaaaaaaaa");
//
//				}
//
//			}

                // cuenta.ingresar(20);

                //Guardo en una variable Field el numero de cuenta
                Field varibaleNumeroCuenta = c2.getDeclaredField("numeroCuenta");
                //Hago referencia
                Method method2 = c2.getDeclaredMethod("setNumeroCuenta", String.class);
                //Hago accesible el método
                method2.setAccessible(true);
                //Lo invoco y cambio el número de cuenta
                method2.invoke(cuenta, "prueba");

                //Muestro el saldo de la cuenta bancaria
                System.out.println(cuenta.getSaldo());

                //Muestro el número de cuenta
                System.out.println(cuenta.getNumeroCuenta());

            } catch (Exception e) {

                e.printStackTrace();

            }
        }
    }

}
