# 🅿🅱🅾🄴🄽🄲🄰🄿🅂🅄🄻🄰🅃🄸🄾🄽
# 𝕃𝕒𝕥𝕚𝕙𝕒𝕟 𝟙
![Alt Text](https://github.com/rendiwibawa/PBO-Encapsulation/blob/master/Latihan%201.PNG)
# Perhatikan jumlah penumpang Bus terakhir dengan jumlah penumpang maksimum. Mengapa bisa demikian? 
> Nilai nya dapat melebi jumlah penumpang maksimum karena tidak ada perintah batasan dalam code tersebut 
Jadi..Output Maxpenumpang hanya dapat mengingatkan saja, walaupun angkanya sudah melewati batas tetap saja bisa di isi dan tetap keluar outputnya
Oh iya.. output ini akan terus keluar walapun penumpang bus melewati/tidak melewati batas penumpang maksimum karena dia hanya memberi tahu!!

# 𝕃𝕒𝕥𝕚𝕙𝕒𝕟 𝟚
![Alt Text](https://github.com/rendiwibawa/PBO-Encapsulation/blob/master/Latihan%202.PNG)
# Berikan penjelasan point b! 
> Di karenakan jumlah penumpang yang di tambahkan ini telah melebihi batas dari kuota, Hal ini akan membuat nilai angka
terakhir tetap dan tidak berubah walaupun sudah di tambah angka.
jadi logikanya ini penyimpananya udah penuh dan tidak dapat menyimpan jumlah yang melebihi kuota tersebut, Jadi nilai tambah penumpang terakhirnya tidak di keluarkan/di proses :)

# 𝕃𝕒𝕥𝕚𝕙𝕒𝕟 𝟛
![Alt Text](https://github.com/rendiwibawa/PBO-Encapsulation/blob/master/Latihan%203.PNG)
> yaa...Program di atas ini adalah contoh hasil "Encapsulation" Dari biodata seseorang  

# 𝕃𝕒𝕥𝕚𝕙𝕒𝕟 𝟜
![Alt Text](https://github.com/rendiwibawa/PBO-Encapsulation/blob/master/Latihan%204.PNG)
# Penjelasan Program tersebut adalah
> Jadi program di atas hampir sama dengan program2 di atas lainya cuma..
Program ini ada tambahan password (Benar // Salah) Lah..di sini program passwordnya sudah berfungsi 
password yang benar adalah nilai 24 maka akan mencetak output password benar tapi jika angka lain yang di masukan maka akan mencetak password salah.
> Lalu untuk penambahan penumpang hampir sama dengan yang di atas tapi di sini jumlah penumpang maksimal penumpang akan membatasi jumlah penumpang yang sudah melewati batas maksimal dan akan tetap menampilkan jumlah penumpang maksimal.
Jadi..walaupun jumlah penumpang di tambah berapapun kalau sudah maksimal maka akan keluar output angka 5
karena nilai maksimal penumpang bus di program itu adalah 5
jumlah penumpang yang melebihi kuota tidak di tampilkan hasilnya tetapi cuma di tampilkan nilai maksimal

# ℙ𝕒𝕣𝕒𝕜𝕥𝕚𝕜𝕦𝕞 𝔹𝕖𝕒𝕣𝕥 𝕡𝕖𝕟𝕦𝕞𝕡𝕒𝕟𝕘
![Alt Text](https://github.com/rendiwibawa/PBO-Encapsulation/blob/master/Praktikum%201.PNG)
> ini adalah gabungan dari program-program di atas tapi program bus ini menampilan berat penumpang dan rata-rata penumpang serta ada tambahan password.
> Jadi Cara kerja program ini adalah berat penumpang dan jumlah penumpang akan bertambah jika Password yang di masukkan benar.
dan jika password benar maka akan menambah jumlah penumpang dan berat penumpang itu tetapi kalau salah tidak akan mengubah apapun atau tetap sama hal ini karena method getPenumpang terdapat autentikasi berupa parameter password, dan akan memanggil method add penumpang untuk menambah nilai variable penumpang, Sehingga jumlah penumpang bertambah.
Kemudian Jika berat penumpang telah melebihi batas maka berat penumpang tambahan terakhir tidak di hitung
Jadi logikanya...Kan bus sudah terlalu berat dan misal akan di tambahi penumpang lagi. Kan otomatis penumpang itu tidak jadi naik bus karena Berat penumpang sudah maksimal maka hanya di tampilkan berat jumlah penumpang terakhir
Dan jika sudah maksimal berat penumpangnya maka akan di hitung rata-rata berat penumpang yang naik di bus itu dangan Jumlah berat/Banyaknya penumpang di program itu menggunakan Counter(jumlah Berhenti).

# ℙ𝕣𝕒𝕜𝕥𝕚𝕜𝕦𝕞 𝔹𝕠𝕝𝕒
![Alt Text](https://github.com/rendiwibawa/PBO-Encapsulation/blob/master/praktikum%20Bola.PNG)
> Program di atas juga merupakan implementasi dari konsep encapsulation pada perhitungan luas dan volum bola. Diama kelas main bola akan memanggil method-method untuk menampilkan nilai luas dan volumnya.
Juga...Di sini nilai jari-jari Di ubah menjadi 14 (Pada syntax objekbola.setjarijari(Jarijari);) sehingga nilai luas dan volumnya berubah karena variablenya di ganti.

#[̲̅K][̲̅E][̲̅S][̲̅I][̲̅M][̲̅P][̲̅U][̲̅L][̲̅A][̲̅N]
> ### ENKAPSULASI adalah metode pengkapsulan yang di gunakan untuk melindungi data pada suatu class sehingga data lebih aman.
Dan ada hal yang mendasar dalam enkapsulasi yakni:
1. ### information Hidding : menyembunyikan informasi dalam suatu class sehingga tidak dapat di akses dari luar
2. ### interface to Acces : merubah atribut yang berada dalam information hidding

