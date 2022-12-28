<?php
    session_start();
    
    if(!isset($_SESSION["login"]))
    {
        echo $_SESSION["login"];
        header("Location:login.php");
        exit;
    }
    require 'functions.php';


    $jumlahdataperhalaman = 2;

    $jumlahdata = count(query("SELECT * FROM mahasiswa"));

    $jumlahhalaman = ceil($jumlahdata / $jumlahdataperhalaman);

    $halamanaktif = (isset($_GET["halaman"]) ? $_GET["halaman"] : 1);

    $dataawal = ($jumlahdataperhalman * $halamanaktif) - $jumlahdataperhalaman;

    $mahasiswa = query("SELECT * FROM mahasiswa LIMIT $dataawal,$jumlahdataperhalaman");

    if(isset($_POST["cari"]))
    {
        $mahasiswa = cari($_POST["keyword"]);
    }
?>


<!DOCTYPE html>

<html>
    <style>
        @media print
        {
            .logout,.tambah,.form-cari{
                display:none;
            }
            .aksi,.halaman,.cari,.buttoncari
            {
                display:none;
            }
        }
    </style>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Daftar Mahasiswa</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="">
    </head>
    <body>
        <h1> Daftar  Mahasiswa</h1>
        <a href="logout.php" class ="logout">Logout</a>

        <a href="tambah_data.php" class="tambah">Tambah Data Mahasiswa</a>
        <br><br>
        
        <form action="" method="post" class="form-cari">
            <input type="text" name="keyword" size="40" autofocus placeholder="masukkan keyword pencarian" autocomplete="off" class="cari">
            <button type="submit" name="cari" class="buttoncari"> cari </button>
        </form>
        <br>
 
        //navigasi

        <?php for($i=0;$i<=$jumlahhalaman;$i++) : ?>
        <a href=""><?php echo $i; ?></a>
        <?php endfor; ?>
        
        <br>

        <table border="1" cellpadding="10" cellspacing="0">
            <tr>
                <th>No.</th>
                <th>Nama</th>
                <th>Nim</th>
                <th>Email</th>
                <th>Jurusan</th>
                <th>Gambar</th>
                <th class="aksi">Aksi</th>
            </tr>
            <?php $i=1 ?>

            <?php foreach ($mahasiswa as $row):?>
                <tr>
                    <td><?= $i; ?></td>
                    <td><?= $row["Nama"];?></td>
                    <td><?= $row["Nim"];?></td>
                    <td><?= $row["Email"];?></td>
                    <td><?= $row["Jurusan"];?></td>
                    <td> <img src="image/<?php echo $row["Gambar"]; ?>" alt="" height="100" width="100" srcset=""></td>
                    <td class="aksi">
                        <a href="edit.php?id=<?php echo $row["id"];?>">Edit</a>
                        <a href="hapus.php?id=<?php echo $row["id"];?>"onclick="return confirm('Apakah data ini akan dihapus')">Hapus</a>
                    </td>
                </tr>
            <?php $i++ ?>
            <?php endforeach;?>
        </table>
        <script src="" async defer></script>
    </body>
</html>