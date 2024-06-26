package com.hijin.data.util

import android.content.Context
import android.widget.Toast

class ToastUtil {
    companion object {
        fun showToastMessageOnShort(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }

        fun showToastMessageOnLong(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
        }
    }
}
