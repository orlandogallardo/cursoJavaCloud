package mx.com.chelaya.service;

import java.util.List;

import javax.jws.WebService;

import mx.com.chelaya.model.ClientePedido;

@WebService
public interface PedidoChelasYa {
	/**
	 * funcion para realizar un pedido de chelas
	 * con los datos del pedido y del cliente.
	 * 
	 * @param clientepedido datos del cliente y del pedido.
	 * @return respuesta si se recibio el pedido.
	 */
	String pedirChelas(ClientePedido clientepedido); 
	
	
	/**
	 * Funcion para consultar la cantidad de pedidos.
	 * @return una lista de pedidos.
	 */
	List<ClientePedido>obtenerPedidos();
}
