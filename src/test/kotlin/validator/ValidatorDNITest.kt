package validator

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import srangeldev.validator.ValidatorDNI

class ValidatorDNITest {

    private val validator = ValidatorDNI()

    @Test
    @DisplayName("Test validar dni")
    fun validarDniRegex() {
        assertTrue(validator.validarDniRegex("12345678Z"))
    }

    @Test
    @DisplayName("Test validar dni vacio")
    fun validarDniVacio() {
        assertFalse(validator.validarDniRegex(""))
    }

    @Test
    @DisplayName("Test validar dni con letra incorrecta")
    fun validarDniLetraIncorrecta() {
        assertFalse(validator.validarDniRegex("12345678A"))
    }

    @Test
    @DisplayName("Test validar dni con letra al principio")
    fun validarDniLetraPrincipio() {
        assertFalse(validator.validarDniRegex("A12345678"))
    }

    @Test
    @DisplayName("Test validar dni con numero extra")
    fun validarDniConNumeroExtra() {
        assertFalse(validator.validarDniRegex("123456789Z"))
    }

    @Test
    @DisplayName("Test validar dni con numero menos")
    fun validarDniConNumeroMenos() {
        assertFalse(validator.validarDniRegex("1234567Z"))
    }

    @Test
    @DisplayName("Test validar dni con dos letras mayusculas al final")
    fun validarDniConDosLetrasFinal() {
        assertFalse(validator.validarDniRegex("1234567AB"))
    }

    @Test
    @DisplayName("Test validar dni con dos letras minusculas al final")
    fun validarDniConDosLetrasFinalMinus() {
        assertFalse(validator.validarDniRegex("1234567ab"))
    }

    @Test
    @DisplayName("Test validar dni con dos letras mayusculas al principio")
    fun validarDniConDosLetrasPrincipio() {
        assertFalse(validator.validarDniRegex("AB1234567"))
    }

    @Test
    @DisplayName("Test validar dni con dos letras minusculas al principio")
    fun validarDniConDosLetrasPrincipioMinus() {
        assertFalse(validator.validarDniRegex("ab1234567"))
    }

    @Test
    @DisplayName("Test validar dni con letra minuscula al final")
    fun validarDniLetraMinusculaFinal() {
        assertFalse(validator.validarDniRegex("12345678z"))
    }

    @Test
    @DisplayName("Test validar dni con letra minuscula al principio")
    fun validarDniLetraMinusculaPrincipio() {
        assertFalse(validator.validarDniRegex("z12345678"))
    }

    @Test
    @DisplayName("Test validar dni con caracteres especiales")

    fun validarDniCaracteresEspeciales() {
        assertFalse(validator.validarDniRegex("1234@678Z"))
        assertFalse(validator.validarDniRegex("1234#678Z"))
        assertFalse(validator.validarDniRegex("1234-678Z"))
    }

    @Test
    @DisplayName("Test validar dni con espacio en medio")
    fun validarDniEspacioEnMedio() {
        assertFalse(validator.validarDniRegex("1234 5678Z"))
    }

    @Test
    @DisplayName("Test validar dni con espacios al principio")
    fun validarDniEspaciosAlPrincipio() {
        assertFalse(validator.validarDniRegex(" 12345678Z"))
    }

    @Test
    @DisplayName("Test validar dni con espacios al final")
    fun validarDniEspaciosAlFinal() {
        assertFalse(validator.validarDniRegex("12345678Z "))
    }

    @Test
    @DisplayName("Test validar dni con varios ceros")
    fun validarDniVariosCeros() {
        assertFalse(validator.validarDniRegex("00001234T"))
    }

    @Test
    @DisplayName("Test validar dni con Ñ al final")
    fun validarDniConFinal() {
        assertFalse(validator.validarDniRegex("12345678Ñ"))
    }

    @Test
    @DisplayName("Test validar dni con Ç al final")
    fun validarDniConFinal2() {
        assertFalse(validator.validarDniRegex("12345678Ç"))
    }
}