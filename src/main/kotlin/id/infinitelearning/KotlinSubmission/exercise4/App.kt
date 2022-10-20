package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    try {
        val honey = 2050
        val money = "Gaada duit"
        money.toByte()
        honey.toString(12)
    } catch (e:Exception) {
        e.printStackTrace()
    } finally {
        println("Exception handling")
    }
}       /** MADE BY RAKHSASHA */