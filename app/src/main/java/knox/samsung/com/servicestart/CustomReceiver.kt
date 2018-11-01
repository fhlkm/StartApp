package knox.samsung.com.servicestart

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import io.reactivex.Observable
import java.util.concurrent.TimeUnit

class CustomReceiver : BroadcastReceiver() {
    val TAG = OnRebootReceiver::class.java.name
    override fun onReceive(aContext: Context, aIntent: Intent) {
        Observable .interval(5, TimeUnit.SECONDS).flatMap( { along ->
            println("CustomReceiver")
            Observable.just("Abc")
        }).subscribe()
    }


    fun println(info:String){
        Log.i(TAG,info)
    }
}