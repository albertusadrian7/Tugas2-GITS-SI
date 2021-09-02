// Nama: Albertus Adrian Susanto

import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    // Input Pendapatan
    print("Masukkan pendapatan Anda: ")
    var pendapatan:Double = reader.nextDouble()
    // Input Pengeluaran
    print("Masukkan pengeluaran Anda: ")
    // Kalkulator Money Management
    val kebutuhanHobi = 0.5 * pendapatan
    val tabungan = 0.3 * pendapatan
    val investasi = 0.2 * pendapatan
    var pengeluaran:Double = reader.nextDouble()
    println()
    // Pengecekan Kondisi Keuangan
    if (pengeluaran < pendapatan) {
        var sisaUang = pendapatan - pengeluaran
        println("Sisa uang Anda: Rp $sisaUang")
        println()
        if (pengeluaran <= kebutuhanHobi) {
            println("Selamat, Anda berhasil mengatur keuangan Anda dengan baik!")
            println("1. Anda dapat memasukkan Rp $investasi ke dalam Reksadana")
            println("2. Anda dapat memasukkan Rp $tabungan ke Bank")
        } else {
            println("Yah, Anda telah gagal mengatur keuangan Anda!")
            println("Saran: sisa uang yang ada sebaiknya Anda simpan terlebih dahulu di Bank")
        }
    } else if (pengeluaran == pendapatan) {
        println("Anda sudah tidak memiliki sisa uang!")
    } else {
        val hutang = pengeluaran - pendapatan
        println("Anda memiliki hutang sebesar: Rp $hutang")
    }
}