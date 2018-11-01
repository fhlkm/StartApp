package knox.samsung.com.servicestart

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import io.reactivex.Observable
import java.util.concurrent.TimeUnit



class OnRebootReceiver : BroadcastReceiver() {

    val TAG = OnRebootReceiver::class.java.name

    override fun onReceive(aContext: Context, aIntent: Intent) {
        Observable .interval(5, TimeUnit.SECONDS).flatMap( { along ->
            println("OnRebootReceiver")
            Observable.just("Abc")
        }).subscribe()
        val i = Intent(aContext, MainActivity::class.java)
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        aContext.startActivity(i)

    }

    fun println(info:String){
        Log.i(TAG,info)
    }
}