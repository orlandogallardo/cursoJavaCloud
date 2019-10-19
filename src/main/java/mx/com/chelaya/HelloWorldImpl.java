
package mx.com.chelaya;

import javax.jws.WebService;

@WebService(endpointInterface = "mx.com.chelaya.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String nombre) {
        return "Hola " + nombre;
    }
}

