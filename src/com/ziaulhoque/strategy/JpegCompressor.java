package com.ziaulhoque.strategy;

public class JpegCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println("compressing with JPEG compression");
    }
}
