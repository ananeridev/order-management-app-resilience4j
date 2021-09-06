package com.anabneri.microsservices.productcatalog.service;

import com.anabneri.microsservices.productcatalog.model.SellerProductDto;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeoutException;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

public interface UserCatalogService {

    String userCatalogSeller(SellerProductDto sellerDto);

    List<SellerProductDto> getSellersList();

}
