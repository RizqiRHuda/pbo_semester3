<!DOCTYPE html>
<html>

<head>
    <style>
        .error {
            color: #FF0000
        }
    </style>
</head>

<body>
    <?php
    //ambil nilai variable error
    if (isset($_GET['error'])) {
        $error = $_GET['error'];
    } else {
        $error = "";
    }

    //siapkan pesan kesalahan
    $pesan = "";
    if ($error == "variable_belum_diset") {
        $pesan = "Anda harus mengakses halaman dari form_3.php";
    } else if ($error == "nama_kosong") {
        $pesan = "Nama harus diisi";
    }
    else if($error == "nama_invalid"){
        $pesan = "Nama diisi huruf dan spasi";
    }
     else if ($error == "email_kosong") {
        $pesan = "Email harus diisi";
    }
    else if($error == "email_invalid"){
        $pesan = "Email tidak sesuai";
    }

    //Siapkan isian form jika terjadi kesalahan
    if (isset($_GET['nama']) and isset($_GET['email']) and isset($_GET['komentar'])) {
        $nama = $_GET['nama'];
        $email = $_GET['email'];
        $komentar = $_GET['komentar'];
    } else {
        $nama = "";
        $email = "";
        $komentar = "";
    }
    ?>

    <span class="error"><?php echo $pesan; ?></span>

    <table>
        <form action="prosesForm_3.php" method="GET">
            <tr>
                <td>Nama : </td>
                <td><input type="text" name="nama" value="<?php echo $nama; ?>"></td>
            </tr>
            <tr>
                <td>E-mail : </td>
                <td><input type="text" name="email" value="<?php echo $email; ?>"></td>
            </tr>
            <tr>
                <td>komentar : </td>
                <td><textarea name="komentar" cols="40" rows="5"><?php echo $komentar; ?></textarea></td>
            </tr>
            <tr>
                <td><input type="submit" name="kirm" value="kirim"> </td>
            </tr>

        </form>
    </table>
</body>
</html>