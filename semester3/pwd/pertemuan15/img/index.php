<?php
$conn = mysqli_connect("localhost","root","","phpdatabase");

$result = mysqli_query($conn, "SELECT * FROM mahasiswa");

/*while($mhs=mysqli_fetch_assoc($result)){
    var_dump($mhs);
    die();
}*/
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Daftar Mahasiwa</h1>
    <table border="1" cellpadding = "10" cellspacing = "0">
        <tr>
            <th>No.</th>
            <th>Nama</th>
            <th>Nim</th>
            <th>Email</th>
            <th>Jurusan</th>
            <th>Gambar</th>
            <th>Aksi</th>
        </tr>

        <?php $i=1 ?>
        <?php while($row = mysqli_fetch_assoc($result)):?>
         <tr>
            <td><?=  $i; ?></td>
            <td><?= $row["Nama"]; ?></td>
            <td><?= $row["Nim"]; ?></td>
            <td><?= $row["Email"]; ?></td>
            <td><?= $row["Jurusan"]; ?></td>
            <td> <img src="image/<?php echo $row["Gambar"]; ?>"alt="" height="100" width="100" srcset=""> </td>
            <td>
                <a href="">Edit</a>
                <a href="">Hapus</a>
            </td>
         </tr>
         <?php $i++ ?>
         <?php endwhile?>   

    </table>
</body>
</html>