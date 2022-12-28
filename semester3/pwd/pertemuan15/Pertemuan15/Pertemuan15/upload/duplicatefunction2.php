<?php
// Membuat koneksi
$conn = mysqli_connect("localhost", "root", "", "phpdatabase");

// cek koneksi jika error
if (!$conn) {
    die('Koneksi Error : ' . mysqli_connect_errno()
        . ' - ' . mysqli_connect_error());
}

// Ambil data dari tabel mahasiswa/query data mahasiswa
$result = mysqli_query($conn, "SELECT * FROM mahasiswa");
// var_dump($result);
// die();

// function query akan menerima isi parameter dari string query yang ada pada index2.php (line 3)
function query($query_kedua)
{
    // dikarenakan $conn diluar function query maka dibutuhkan scope global $conn
    global $conn;
    $result = mysqli_query($conn, $query_kedua);

    // wadah kosong untuk menampung isi array pada saat looping 16
    $rows = [];
    // var_dump($row);
    // die();

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
    // $gambar = htmlspecialchars($data["Gambar"]);

    // $nama = $data["nama"];
    // $nim = $data["nim"];
    // $email = $data["email"];
    // $jurusan = $data["jurusan"];
    // $gambar = $data["gambar"];
    $gambar = upload();
    if (!$gambar) {
        return false;
    }

    $query = "INSERT INTO mahasiswa VALUES('','$nama','$nim','$email','$jurusan','$gambar')";
    mysqli_query($conn, $query);

    return mysqli_affected_rows($conn);
}

function upload()
{
    //return false
    $nama_file = $_FILES['Gambar']['name'];
    $ukuran_file = $_FILES['Gambar']['size'];
    $error = $_FILES['Gambar']['error'];
    $tmpfile = $_FILES['Gambar']['tmp_name'];

    //cek kondisi apakah user sudah melakuak proses upload
    //     if ($error == 4) {
    //         echo "
    //        <script>
    //            alert('Tidak ada gambar yang diupload');
    //        </script>
    //    ";
    //         return false;
    //     }
    //     $jenis_gambar = ['jpg', 'jpeg', 'gif'];

    //     //function explode(delimiter, string)
    //     //delimiter disini digunakan untuk memecah string ke array
    //     //contoh andi.jpeeg maka delimiter akan memecah menjadi array ['andi','jpeg']
    //     $pecah_gambar = explode('.', $nama_file);

    //     $pecah_gambar = strtolower(end($pecah_gambar));

    //     if (!in_array($pecah_gambar, $jenis_gambar)) {
    //         echo "
    //        <script>
    //            alert('yang anda upload bukan file gambar');
    //        </script>
    //    ";
    //         return false;
    //     }

    //     if ($ukuran_file > 10000000) {
    //         echo "
    //    <script>
    //        alert('ukuran gambar terlalu besar');
    //    </script
    //    ";
    //         return false;
    //     }


    move_uploaded_file($tmp_name, 'image/' . $nama_file);

    return $nama_file;
}

function hapus($id)
{
    global $conn;
    mysqli_query($conn, "DELETE FROM mahasiswa WHERE id = $id");
    return mysqli_affected_rows($conn);
}

function edit($data)
{
    global $conn;

    $id = $data["id"];
    $nama = htmlspecialchars($data["Nama"]);
    $nim = htmlspecialchars($data["Nim"]);
    $email = htmlspecialchars($data["Email"]);
    $jurusan = htmlspecialchars($data["Jurusan"]);
    $gambar = htmlspecialchars($data["Gambar"]);

    $query = " UPDATE mahasiswa SET 
                Nama = '$nama',
                Nim = '$nim',
                Email = '$email',
                Jurusan = '$jurusan',
                Gambar = '$gambar'
                WHERE id = $id ";
    mysqli_query($conn, $query);

    return mysqli_affected_rows($conn);
}


function cari($keyword)
{
    $sql = "SELECT * FROM mahasiswa
        WHERE
        Nama LIKE '%$keyword%' OR
        Nim LIKE '%$keyword%' OR
        Email LIKE '%$keyword%' OR
        Jurusan LIKE '%$keyword%'";

    return query($sql);
}
