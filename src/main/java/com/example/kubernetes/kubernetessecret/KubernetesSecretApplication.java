package com.example.kubernetes.kubernetessecret;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("api/kubernetes/secret")
public class KubernetesSecretApplication {

	@Value("${my-secret.data}")
	String secret_data;

	public static void main(String[] args) {
		SpringApplication.run(KubernetesSecretApplication.class, args);
	}

	@GetMapping("")
	public String secret () {
		return "Kubernetes secret data is: " + secret_data;
	}

}
