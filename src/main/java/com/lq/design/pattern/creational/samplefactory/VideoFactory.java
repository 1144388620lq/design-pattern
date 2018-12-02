package com.lq.design.pattern.creational.samplefactory;

/**
 * @Auther: LQ
 * @Date: 2018/12/2 20:16
 * @Description:简单工厂模式
 */
public class VideoFactory {

    public static Video getVideo(final String type) {
        if (type == null || "".equals(type)) {
            return null;
        }
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        } else {
            return null;
        }
    }

    public static Video getVideo(final Class clazz) {
        if (clazz == null) {
            return null;
        }
        Video video = null;
        try {
            video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return video;
    }

}
