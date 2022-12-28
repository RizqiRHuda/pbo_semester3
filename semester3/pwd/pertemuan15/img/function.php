<?php
$conn = mysqli_connect("localhost", "root", "", "phpdatabase");
if(!$conn){
    die('Koneksi Error : '.mysqli_connect_errno()
    .' - '.mysqli_connect_error());
}
$result = mysqli_query($conn, "SELECT * FROM mahasiswa");

function query($query_kedua)
{
    global $conn;
    $result = mysqli_query($conn, $query_kedua);

    $rows = [];

    while ($row = mysqli_fetch_assoc($result)) {
        $rows[] = $row;
        // var_dump($rows);
    }
    return $rows;
}

function tambah ($data)
{
    global $conn;

    $nama=htmlspecialchars($data["Nama"]);
    $nim=htmlspecialchars($data["Nim"]);
    $email=htmlspecialchars($data["Email"]);
    $jurusan=htmlspecialchars($data["Jurusan"]);
    $gambar=htmlspecialchars($data["Gambar"]);

    // $nama=$data["Nama"];
    // $nnim=$data["Nim"];
    // $email=$data["Email"];
    // $jurusan=$data["Jurusan"];
    // $gambar=$data["Gambar"];

    $query = "INSERT INTO mahasiswa
                VALUES
                ('', '$nama', '$nim', '$email', '$jurusan', '$gambar')";
    mysqli_query($conn, $query);

    return mysqli_affected_rows($conn);

}

function hapus ($id){
    global $conn;
    mysqli_query($conn, "DELETE FROM mahasiswa WHERE id = $id");
    return mysqli_affected_rows($conn);
}
?>
