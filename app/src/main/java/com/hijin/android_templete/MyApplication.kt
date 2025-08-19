package com.hijin.android_templete

import android.app.Application
import android.util.Log

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // 애플리케이션 시작 시 필요한 초기화 코드를 여기에 작성합니다.
        // 예: Timber, Dagger/Hilt, Koin과 같은 라이브러리 초기화
        Log.d("MyApplication", "Application started and initialized.")
    }
}