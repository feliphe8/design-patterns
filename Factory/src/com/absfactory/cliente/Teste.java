package com.absfactory.cliente;

import com.absfactory.outros.Usuario;
import com.absfactory.outros.Papel;
import com.absfactory.outros.FabricaUsuario;

public class Teste {

	public static void main(String[] args) {
		Usuario u = FabricaUsuario.FABRICA_ADMIN.criarPF();
		u.informacao();
	}

}
