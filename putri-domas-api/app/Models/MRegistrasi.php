<?php

namespace App\Models;

use CodeIgniter\Model;

class MRegistrasi extends Model
{
    protected $table = 'user';
    protected $allowedFields = ['image', 'date_created', 'name', 'email', 'password', 'role_id', 'is_active'];
}
