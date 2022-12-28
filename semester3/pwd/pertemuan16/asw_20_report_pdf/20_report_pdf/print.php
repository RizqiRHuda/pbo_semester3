<?php
require_once __DIR__ . '/vendor/autoload.php';
require 'functions.php';
$mahasiswa = query(" SELECT * FROM mahasiswa ");
$mpdf = new \mPDF('utf-8', 'A4', '');

$html='
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Daftar Mahasiswa</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/print.css"
    </head>
    <body>
        <h1> Daftar Mahasiswa </h1>
        <table border="1" cellpadding="10 cellspacing="0">
        <tr>
            <th>No.</th>
            <th>Nama</th>
            <th>Nim</th>
            <th>Email</th>
            <th>Jurusan</th>
            <th>Gambar</th>
        </tr>';
        $i=1;
        foreach($mahasiswa as $row)
        {
            $html .='<tr>
            <td>'.$i++.'</td>
            <td>'.$row["Nama"].'</td>
            <td>'.$row["Nim"].'</td>
            <td>'.$row["Email"].'</td>
            <td>'.$row["Jurusan"].'</td>
            <td> <img src="image/' .$row["Gambar"]. '" height="100" width="100" /></td>
            </tr>';
        }

$html .= '</table>
    </body>
</html>
';
$mpdf->WriteHTML($html);
$mpdf->Output();

?>