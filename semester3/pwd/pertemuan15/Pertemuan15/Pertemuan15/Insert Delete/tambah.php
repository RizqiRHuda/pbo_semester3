<?php
//buat koneksi
$conn=mysqli_connect("localhost","root","","phpdatabase");

// cek apakah button submit sudah di tekan atau belum
if(isset($_POST['submit'])){
    // ambil data dari tiap elemen dalam form yang disimpan di variabel baru
    $nama=$_POST["Nama"];
    $nim=$_POST["Nim"];
    $jurusan=$_POST["Jurusan"];
    $gambar=$_POST["Gambar"];

    //var_dump($nama);
    //die();

    //query insert data

    $query= " INSERT INTO mahasiswa
                VALUES
                ('','$nama','$nim','$email','$jurusan','$gambar')";
    mysqli_query($conn,$query);

    //cek sukses data ditambah menggunakan mysqli_affected_rows
    //jika kita var_dump maka akan muncul int(1) jika gagal maka akan muncul int(-1)
    //var_dump(mysqli_affected_rows($conn));
    //die();

    if(mysqli_affected_rows($conn) > 0){
        echo " data berhasil disimpan";
    }
    else{
        echo "gagal";
        echo "<br>";
        echo mysqli_error($conn);
    }
}
