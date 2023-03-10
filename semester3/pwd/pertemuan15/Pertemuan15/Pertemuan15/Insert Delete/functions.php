<?php
//membuat koneksi
$conn = mysqli_connect("localhost", "root", "", "phpdatabase");
//cek koneksi jika eror
if (!$conn) {
    die('Koneksi Error : ' . mysqli_connect_errno()
        . ' - ' . mysqli_connect_error());
}
// ambil data dari tabel mahasiswa/query data mahasiswa
$result = mysqli_query($conn, "SELECT * FROM mahasiswa");

//function query akan menerima isi parameter dari string query yg ada pada index2
function query($query_kedua)
{

    //dikarenakan $conn diluar function query maka dibutuhkan scope global $conn
    global $conn;
    $result = mysqli_query($conn, $query_kedua);
    //wadah kosong untuk menampung isi array pada saat looping
    $rows = [];
    while ($row = mysqli_fetch_assoc($result)) {
        $rows[] = $row;
    }
    return $rows;
}

function tambah($data)
{
    global $conn;

    $nama = htmlspecialchars($data["Nama"]);
    $nim = htmlspecialchars($data["Nim"]);
    $email = htmlspecialchars($data["Email"]);
    $jurusan = htmlspecialchars($data["Jurusan"]);
    $gambar = htmlspecialchars($data["Gambar"]);

    //$nama=$data["Nama];
    //$nim=$data["Nim"];
    //$email=$data["Email"];
    //$jurusan=$data["Jurusan"];
    //$gambar=$data["Gambar"];

    $query = " INSERT INTO mahasiswa
                VALUES
                ('', '$nama', '$nim', '$email', '$jurusan', '$gambar')";
    mysqli_query($conn, $query);

    return mysqli_affected_rows($conn);
}

function hapus($id)
{
    global $conn;
    mysqli_query($conn, "DELETE FROM mahasiswa WHERE id = $id");
    return mysqli_affected_rows($conn);
}
