<?php

namespace App\Models;

use CodeIgniter\Model;

class MKost extends Model
{
    protected $table = 'tb_kost';
    protected $primaryKey = 'id_kost';
    protected $allowedFields = ['nama_kost', 'keterangan', 'type_kost', 'harga', 'stok', 'gambar'];
}
