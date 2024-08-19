package com.itsz.dubbo.consumer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class DubboConsumerApplication

fun main(args: Array<String>) {
    runApplication<DubboConsumerApplication>(*args)
}