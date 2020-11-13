package id.ac.politeknikharber.mobile_rama.pendidikan

import id.ac.politeknikharber.mobile_rama.R

object IsiPendidikan {
    private val namaJenjang = arrayOf(
        "Sepi Peminat, 2 SD Negeri di Pelosok Jember Ditutup",
        "RuangGuru: Butuh 128 tahun kejar ketertinggalan pendidikan indonesia",
        "Kemendikbud Perpanjang Pendaftaran Guru Penggerak 2",
        "Contoh Teks Eksemplum tentang Pendidikan dan Lingkungan Sekolah",
        "Perkuat Pendidikan Karakter Anak Usia Dini dengan Pembelajaran Berbasis Bimbingan"
    )

    private val des = arrayOf(
        "Sekolah itu adalah SDN Sidomulyo 08 dan SDN Curahtakir 05. Penutupan dilakukan karena dua sekolah itu sepi peminat",
        "Demi mengejar ketertinggalan, kita hitung setiap tahun naik berapa banyak? Nah untuk mengejar ketinggalan itu, kita butuh waktu sampai 128 tahun,\" ucap Pendiri dan Direktur Utama Ruangguru, Belva Devara dalam launching Ruangpeduli secara online, Selasa (10/11/2020). ",
        "Hal ini dikarenakan banyaknya permintaan dari Dinas Pendidikan yang meminta perpanjangan waktu pendaftaran karena masih ingin mendorong guru, kepala sekolah, pengawas sekolah terbaiknya untuk mendaftar,” jelas Ditjen GTK Kemendikbud.. ",
        "Berikut contoh teks eksemplum tentang pendidikan dan lingkungan sekolah: Contoh I Minggu malam harusnya aku segera tidur setelah mengerjakan tugas. Namun, malam itu kuhabisakan dengan menonton siaran langsung konser grup boyband favoritku. Aku menonton sampai menjelang dini hari.\n ",
        "“Pendidikan karakter haru   memberikan pengalaman yang kaya dan nyata kepada anak serta anak dapat melihat akibat dari perilakunya tersebut,” ujarnya dalam pidato pengukuhan guru besar UPI tahun 2020 (11/11/2020) ",
    )

    private val foto = intArrayOf(
        R.drawable.tutup,
        R.drawable.ruang,
        R.drawable.kemendik,
        R.drawable.contoh ,
        R.drawable.kuliah
    )


    val dataPendidikan:ArrayList<DataPendidikan>
     get() {
         val listPendidikan:ArrayList<DataPendidikan> = arrayListOf()
         for(i in namaJenjang.indices){
            val data = DataPendidikan()
             data.judul = namaJenjang[i]
             data.des = des[i]
             data.foto = foto[i]
             listPendidikan.add(data)
         }
         return listPendidikan
     }
}