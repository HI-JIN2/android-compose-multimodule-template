package com.android.domain

//sealed class ApiResult<out T> {
//    data object Loading : ApiResult<Nothing>()
//
//    data class Success<T>(val data: T) : ApiResult<T>()
//
//    sealed class Fail : ApiResult<Nothing>() {
//        data class Error(val errorCode: ErrorCode) : Fail()
//        data class Exception(val e: Throwable) : Fail()
//    }
//}
//
//
//inline fun <reified T : Any> ApiResult<T>.onLoading(action: () -> Unit) {
//    if (this is ApiResult.Loading) action()
//}
//
//inline fun <reified T : Any> ApiResult<T>.onSuccess(action: (data: T) -> Unit) {
//    if (this is ApiResult.Success) action(data)
//}
//
//inline fun <reified T : Any> ApiResult<T>.onError(action: (errorCode: ErrorCode) -> Unit) {
//    if (this is ApiResult.Fail.Error) action(errorCode)
//}
//
//inline fun <reified T : Any> ApiResult<T>.onNetworkError(action: (errorCode: ErrorCode) -> Unit) {
//    if (this is ApiResult.Fail.Error && errorCode == ErrorCode.NETWORK_ERROR) {
//        action(errorCode)
//    }
//}
//
//inline fun <reified T : Any> ApiResult<T>.onException(action: (e: Throwable) -> Unit) {
//    if (this is ApiResult.Fail.Exception) action(e)
//}
