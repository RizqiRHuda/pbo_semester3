<?php 
    $conn=mysqli_connect("localhost","root","","phpdatabase");

    if(isset($_POST["submit"])){
        $nama=$_POST["Nama"];
        $nim=$_POST["Nim"];
        $email=$_POST["Email"];
        $jurusan=$_POST["Jurusan"];
        $gambar=$_POST["Gambar"];

        $query = " INSERT INTO mahasiswa
                    VALUES 
                    ('', '$nama','$nim','$email','$jurusan','$gambar')";
        mysqli_query($conn,$query);

        if(mysqli_affected_rows($conn) > 0){
            echo " data berhasil disimpan";
        }
        else {
            echo "gagal!";
            echo "<br>";
            echo mysqli_error($conn);
        }
    }
?>