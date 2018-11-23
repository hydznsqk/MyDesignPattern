package com.yadong.pattern.creational.factory_simple;

/**
 * PythonVideo,继承于BaseVideo
 */
public class PythonVideo extends BaseVideo {

    @Override
    public void produce() {
        System.out.println("生产PythonVideo");
    }

}