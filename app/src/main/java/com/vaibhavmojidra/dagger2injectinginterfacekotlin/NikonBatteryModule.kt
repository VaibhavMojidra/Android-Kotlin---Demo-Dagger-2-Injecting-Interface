package com.vaibhavmojidra.dagger2injectinginterfacekotlin

import dagger.Module
import dagger.Provides

@Module
class NikonBatteryModule {

    @Provides
    fun provideNikonBattery(nikonBattery: NikonBattery):Battery{
        return nikonBattery
    }
}