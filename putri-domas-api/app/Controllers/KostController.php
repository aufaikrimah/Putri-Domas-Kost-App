<?php

namespace App\Controllers;

use App\Models\MKost;

class KostController extends RestfulController
{
    public function list()
    {
        $model = new MKost();
        $produk = $model->findAll();
        return $this->responseHasil(200, true, $produk);
    }

    public function detail($id)
    {
        $model = new MKost();
        $produk = $model->find($id);
        return $this->responseHasil(200, true, $produk);
    }
}
