/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nando.peminjamanservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author ACER
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class buku {
    private Long bukuId;
    private String judul;
    private String pengarang;
    private String penerbit;
    private String tahun;
}

