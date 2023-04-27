package com.example.appmvvm.di

import com.example.appmvvm.data.remote.services.MovieService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
object RetrofitServiceModule {

    @Provides
    fun providesApiService(
        @AppRetrofitClient retrofit: Retrofit
    ): MovieService = retrofit.create(MovieService::class.java)

}