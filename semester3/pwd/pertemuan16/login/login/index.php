<?php
require 'functions.php';
$mahasiswa = query("SELECT * FROM mahasiswa");

if (isset($_POST["cari"])) {
    $mahasiswa = cari($_POST["keyword"]);
}
?>

<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Daftar Mahasiswa</title>
</head>

<body>
    <h1> Daftar Mahasiswa</h1>
    <a href="tambah_data.php">Tambah Data Mahasiswa</a>
    <br><br>

    <form action="" method="post">
        <input type="text" name="keyword" size="40" autofocus placeholder="masukkan keyword pencarian" autocomplete="off">
        <button type="submit" name="cari"> cari </button>
    </form>
    <br>

    <table border="1" cellpadding="10" cellspacing="0">
        <tr>
            <th>No.</th>
            <th>Nama</th>
            <th>Nim</th>
            <th>Email</th>
            <th>Jurusan</th>
            <th>Gambar</th>
            <th>Aksi</th>
        </tr>
        <?php $i = 1 ?>
        <?php foreach ($mahasiswa as $row) : ?>
            <tr>
                <td><?= $i; ?></td>
                <td><?= $row["Nama"]; ?></td>
                <td><?= $row["Nim"]; ?></td>
                <td><?= $row["Email"]; ?></td>
                <td><?= $row["Jurusan"]; ?></td>
                <td> <img src="image/<?php echo $row["Gambar"]; ?>" alt="" heigth="100" width="100" srcset=""></td>
                <td>
                    <a href="edit.php?id=<?php echo $row["id"]; ?>">Edit</a>
                    <a href="hapus.php?id=<?php echo $row["id"]; ?>" onclick="return confirm('apakah anda ingin menghapus data?')"> Hapus</a>
                </td>
            </tr>
            <?php $i++ ?>
        <?php endforeach; ?>
    </table>
</body>

</html>