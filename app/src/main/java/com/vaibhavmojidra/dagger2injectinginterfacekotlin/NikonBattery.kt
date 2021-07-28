package com.vaibhavmojidra.dagger2injectinginterfacekotlin

import android.util.Log
import javax.inject.Inject

class NikonBattery @Inject constructor():Battery {
    override fun getPower() {
        Log.i("MyInfo","Power is available")
    }
}