package com.example.appmvvm.data.remote

import com.example.appmvvm.data.remote.model.ErrorResponse
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import retrofit2.Response

class HttpClient {

    suspend fun <T> safeApiCall(
        dispatcher: CoroutineDispatcher,
        apiCall: suspend () -> T?
    ): RequestResult<T?> {
        return withContext(dispatcher) {
            setResult(apiCall.invoke())

        }
    }

    private fun <T> setResult(apiCallResult: T?): RequestResult<T?> {
        return if (apiCallResult is Response<*>) {
            if (apiCallResult.isSuccessful) {
                RequestResult.Success(apiCallResult.body() as T?)
            } else {
                apiCallResult.errorBody()?.let {
                    RequestResult.RequestError(ErrorResponse())
                } ?: RequestResult.UndefinedError
            }
        } else {
            RequestResult.Success(apiCallResult)
        }

    }

}