package com.example.api.config;

import com.example.api.model.Pedido;
import com.example.api.repository.PedidoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner carregarBanco(PedidoRepository pedidoRepository) {
        return args -> {
            // Limpa o banco antes de inserir os pedidos
            pedidoRepository.deleteAll();

            List<Pedido> pedidos = List.of(
                new Pedido(null, "Pedido 1", 250.0)
            );

            pedidoRepository.saveAll(pedidos);

            // Confirmação no console
            long total = pedidoRepository.count();
            System.out.println("Total de pedidos: " + total);
        };
    }
}
