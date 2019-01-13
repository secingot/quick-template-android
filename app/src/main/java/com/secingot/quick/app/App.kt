package com.secingot.quick.app

import android.app.Application

/**
 * <p>Description  : App.</p>
 * <p>Author       : wangchao.</p>
 * <p>Date         : 2019/1/12.</p>
 * <p>Time         : 10:13 PM.</p>
 */
class App : Application() {

    companion object {
        private lateinit var app: App

        fun get(): App {
            return app
        }
    }

    override fun onCreate() {
        super.onCreate()
        app = this
    }
}