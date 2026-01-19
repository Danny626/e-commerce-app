package com.ainur.ecommerce.config;

import com.ainur.ecommerce.kafka.OrderConfirmation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.boot.kafka.autoconfigure.KafkaProperties;

import java.util.Map;

@Configuration
public class KafkaConfig {

    @Bean
    public ProducerFactory<String, OrderConfirmation> producerFactory(KafkaProperties kafkaProperties) {
        // En Boot 4.x, buildProducerProperties() puede requerir un parámetro SslBundles
        // o simplemente llamar al método sin argumentos si no usas SSL avanzado.
        Map<String, Object> props = kafkaProperties.buildProducerProperties();

        return new DefaultKafkaProducerFactory<>(props);
    }

    @Bean
    public KafkaTemplate<String, OrderConfirmation> kafkaTemplate(
            ProducerFactory<String, OrderConfirmation> producerFactory) {
        return new KafkaTemplate<>(producerFactory);
    }
}
