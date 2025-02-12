package srangeldev.validator

class ValidatorDNI {
    fun validarDniRegex(dniString: String): Boolean {
        var res = false
        val regex = Regex("^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$")
        val tabla = "TRWAGMYFPDXBNJZSQVHLCKE"

        if (regex.matches(dniString)) {
            val dni = dniString.substring(0, 8).toInt()
            val letra = dniString.substring(8)
            val resto = dni % 23
            val letraCalculada = tabla[resto]
            res = letraCalculada == letra[0]
        }
        return res
    }
}