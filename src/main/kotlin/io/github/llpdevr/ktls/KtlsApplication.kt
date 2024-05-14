package io.github.llpdevr.ktls

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KtlsApplication

fun main(args: Array<String>) {
	runApplication<KtlsApplication>(*args)
}
