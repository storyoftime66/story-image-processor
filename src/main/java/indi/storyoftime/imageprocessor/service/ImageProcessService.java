package indi.storyoftime.imageprocessor.service;

public class ImageProcessService implements IImageProcessService{

    @Override
    public String echo(String message) {
        return "echo ->" + message;
    }
}
