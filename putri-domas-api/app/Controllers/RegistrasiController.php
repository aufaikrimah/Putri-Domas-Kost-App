<?php

namespace App\Controllers;

use App\Models\Mregistrasi;

class RegistrasiController extends RestfulController
{
    public function registrasi()
    {
        $data = [
            'image' => "default.jpg",
            'name' => $this->request->getVar('nama'),
            'email' => $this->request->getVar('email'),
            'password' => password_hash($this->request->getVar('password'), PASSWORD_DEFAULT),
            'date_created' => date("dmyhis"),
            'role_id' => 1,
            'is_active' => 1,
        ];

        $model = new Mregistrasi();

        $model->save($data);

        return $this->responseHasil(200, true, "Registrasi Berhasil");
    }
}
