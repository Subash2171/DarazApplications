package com.subash.daraz.api;

import com.subash.daraz.model.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ProductAPI {
    @GET("products")
    Call<List<Product>> getProduct();
}
