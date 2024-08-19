package com.itsz.dubbo.provider

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class DubboProviderApplication

fun main(args: Array<String>) {
    runApplication<DubboProviderApplication>(*args)
}
