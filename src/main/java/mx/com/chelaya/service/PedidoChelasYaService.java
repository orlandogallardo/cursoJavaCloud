package mx.com.chelaya.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import mx.com.chelaya.model.ClientePedido;

@WebService(endpointInterface = "mx.com.chelaya.service.PedidoChelasYa")
public class PedidoChelasYaService implements PedidoChelasYa{
	
	private static List<ClientePedido> pedidos = new ArrayList<>();

	@Override
	public String pedirChelas(ClientePedido clientePedido) {
		String mensajeRespuesta = "";
		
		if(clientePedido.getEdad()< 18) {
			mensajeRespuesta = "No se vende alcohol a menores de edad";
		}else {
			mensajeRespuesta = "Pedido Recibido " +
								"de: " + clientePedido.getNombre()+
								" Se enviara a: " + clientePedido.getDireccion();
			pedidos.add(clientePedido);
		}
		return mensajeRespuesta;
	}

	@Override
	public List<ClientePedido> obtenerPedidos() {
		return pedidos;
	}

}
