package srangeldev

import srangeldev.validator.ValidatorDNI

fun main() {
    val validador = ValidatorDNI()
    println(validador.validarDniRegex("53905155D"))
}