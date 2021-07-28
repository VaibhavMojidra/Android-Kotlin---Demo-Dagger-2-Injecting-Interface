package com.vaibhavmojidra.dagger2injectinginterfacekotlin

import dagger.Component

@Component(modules = [NikonBatteryModule::class])
interface SmartPhoneComponent {
    fun getSmartPhone():SmartPhone
}