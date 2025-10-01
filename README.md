PERCOBAAN 1
1. Mengapa pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan operator relasional?
Jawaban : dalam Java, if tidak perlu melibatkan operator relasional jika kondisi yang diperiksa sudah berupa nilai boolean
2. Saat program dijalankan, kemudian Anda mengisikan nilai false, bagaimana hasilnya? 
Jawaban : jika diisi false, maka blok if tidak dijalankan sehingga pesan verifikasi ukt dan cetak KRS tidak muncul 
PERCOBAAN 2
1. Apa fungsi dari sintaks break?
Jawaban : untuk menghentikan proses perulangan atau keluar dari struktur switch secara langsung, meskipun kondisi perulangan belum selesai
2. Apa peran dari sintaks default pada struktur pemilihan SWITCH-CASE?
Jawaban : sintaks default pada struktur pemilihan SWITCH-CASE dipakai untuk menampung pilihan terakhir,yaitu ketika tidak ada satu pun case yang sesuai.
PERCOBAAN 3
1. Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen?
Jawaban : tidak terjadi apa apa karena bukan termasuk pernyataan 
2. Jelaskan maksud dari potongan kode berikut!
Jawaban : Mahasiswa dianggap lulus syarat log bimbingan jika log bimbingan P1 (28 kali) dan log bimbingan P2 (24 kali). Jika kedua syarat ini terpenuhi, maka mahasiswa "boleh mendaftar ujian skripsi
3. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara
runtut untuk semua kondisi!
-Jika mahasiswa belum bebas kompen keluar pesan:
Mahasiswa tidak boleh ujian skripsi karena belum bebas kompen.
-Jika mahasiswa sudah bebas kompen dan bimbingan P1 minimal 8 serta P2 minimal 4 keluar pesan:
Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi.
-Jika mahasiswa sudah bebas kompen tetapi bimbingan P1 kurang dari 8 dan P2 kurang dari 4 keluar pesan:
Gagal! log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali.
-Jika mahasiswa sudah bebas kompen tetapi hanya bimbingan P1 yang kurang dari
8 keluar pesan:
Gagal! log bimbingan P1 belum mencapai 8 kali.
-Jika mahasiswa sudah bebas kompen tetapi hanya bimbingan P2 yang kurang dari 4 keluar pesan:
Gagal! log bimbingan P2 belum mencapai 4 kali
