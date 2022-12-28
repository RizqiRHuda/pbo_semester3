<?php
//membuat koneksi
$conn=mysqli_connect("localhost", "root", "", "phpdatabase");
// cek koneksi jika error

if(!$conn)
{
    die('Koneksi Error : '.mysqli_connect_errno()
    .' - '.mysqli_connect_errno());
}
//ambil data dari tabel mahasiswa/query data mahasiswa
$result=mysqli_query($conn,"SELECT * FROM mahasiswa");

// function query akan menerima isi paramater dari string query yang ada pada index2.php (line 3)
function query($query_kedua){

    // dikarenakan $conn diluar function query maka dibutuhkan scope global $conn
    global $conn;
    $result = mysqli_query($conn,$query_kedua);

    // wadah kosong untuk menampung isi array pada saat looping line 16
    $rows = [];
   
    while( $row = mysqli_fetch_assoc($result)){
        $rows[] = $row;
       // var_dump($rows);
    }
    return $rows;
}

function tambah ($data){
    global $conn;

    $nama=htmlspecialchars($data["Nama"]);
    $nim=htmlspecialchars($data["Nim"]);
    $email=htmlspecialchars($data["Email"]);
    $jurusan=htmlspecialchars($data["Jurusan"]);
    $gambar=htmlspecialchars($data["Gambar"]);

    $query = " INSERT INTO mahasiswa VALUES ('', '$nama', '$nim','$email','$jurusan','$gambar')";

    mysqli_query($conn,$query);

    return mysqli_affected_rows($conn);
}

function hapus ($id){
    global $conn;
    mysqli_query($conn, "DELETE FROM mahasiswa WHERE id = $id");
    return mysqli_affected_rows($conn);
}

function edit ($data){
    global $conn;

    $id = $data["id"];
    $nama=htmlspecialchars($data["nama"]);
    $nim=htmlspecialchars($data["nim"]);
    $email=htmlspecialchars($data["email"]);
    $jurusan=htmlspecialchars($data["jurusan"]);
    $gambar=htmlspecialchars($data["gambar"]);

    $query = " UPDATE  mahasiswa SET
                NAMA = '$nama' ,
                Nim = '$nim' ,
                Email = '$email',
                Jurusan = '$jurusan' ,
                Gambar = '$gambar'   
                WHERE id= $id ";

    mysqli_query($conn,$query);

    return mysqli_affected_rows($conn);
}


?>