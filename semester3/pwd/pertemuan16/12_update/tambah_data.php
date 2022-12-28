<?php
require 'functions.php';
// cek apakah button submit sudah ditekan atau belum
if(isset($_POST['submit'])){
    // cek status data ditambah menggunakan function tambah pada functions.php
    if(tambah($_POST)>0){
        echo "
        <script>
            alert('data berhasil disimpan');
            document.location.href='index.php';
        </script>
        ";
    }
    else{
        echo "
        <script>
            alert('data gagal disimpan');
            document.location.href='index.php';
        </script>
        "; 
        echo "<br>";
        echo mysqli_error($conn);    
    }
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tambah data</title>
</head>
<body>
    <h1>Tambah Data Mahasiswa</h1>
    <form action="" method="POST">
        <ul>
           <li>
             <!-- for pada label terhubung dengan id jika label nama diklik maka textfield nama akan aktif -->
             <label for="Nama">Nama :</label>
            <!-- untuk pengisian nama besar kecilnya harus sesuai dengan fieldnya -->
            <input type="text" name="Nama" id="Nama">
           </li>
           <li>
            <label for="Nim">Nim :</label>
            <input type="text" name="Nim" id="Nim">
           </li>
           <li>
            <label for="Email">Email :</label>
            <input type="text" name="Email" id="Email" required>
           </li>
           <li>
            <label for="Jurusan">Jurusan :</label>
            <input type="text" name="Jurusan" id="Jurusan" required>
           </li>
           <li>
            <label for="Gambar">Gambar :</label>
            <input type="text" name="Gambar" id="Gambar" required>
           </li>
           <li>
            <button type="submit" name="submit"> Tambah </button>
           </li>
        </ul>
        
    </form>
    
</body>
</html>