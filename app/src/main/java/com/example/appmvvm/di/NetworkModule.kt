package com.example.appmvvm.di

import com.example.appmvvm.BuildConfig
import com.example.appmvvm.data.remote.HttpClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    fun getRetrofitClient(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3")
            .addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient())
            .build()

    }

    @Provides
    fun getHttpClient(): HttpClient {
        return HttpClient()
    }
}