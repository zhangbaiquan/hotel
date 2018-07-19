package com.zhangbaiquan.pro.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

/**
 * 生成验证码图片类 
 */

public class ValidateImage {
    private ByteArrayInputStream inputStream;
    
    private BufferedImage image;
    private String randomCode;

    /**
     * 生成验证码
     * @param width 宽度
     * @param height 高度
     * @param size  验证码长度
     * @param fontSize 字体大小
     * @throws Exception
     */
    public ValidateImage(int width, int height, int size, int fontSize) throws Exception {
        init(width, height, size, fontSize);
    }

    public void init(int width, int height, int size, int fontSize) throws Exception {
          image = new BufferedImage(width, height, BufferedImage.TYPE_INT_BGR);
        Graphics g = image.getGraphics();
        Random random = new Random();
        g.setColor(new Color(252, 252, 184));
        g.fillRect(0, 0, width, height);
        g.setFont(new Font("Times New Roman", Font.BOLD, fontSize));
        g.setColor(getRandColor(200, 250));
        g.drawRect(0, 0, width - 1, height - 1);
        g.setColor(getRandColor(160, 200));

        for (int i = 0; i < 120; i++) {
            int x = random.nextInt(width - 1);
            int y = random.nextInt(height - 1);
            int x1 = random.nextInt(2) + 1;
            int y1 = random.nextInt(4) + 1;
            g.drawLine(x, y, x + x1, y + y1);
        }
        this.randomCode = this.getRandCode(g, size, width, height);
        g.dispose();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        ImageOutputStream imageOut = ImageIO.createImageOutputStream(output);
        ImageIO.write(image, "JPEG", imageOut);
        imageOut.close();

        ByteArrayInputStream input = new ByteArrayInputStream(output.toByteArray());
        this.setInputStream(input);
        
        System.out.println("生成验证码成功！");
    }

    private String getRandCode(Graphics g, int size, int width, int height) {
        Random random = new Random();
        int l = 56;
        char[] c = new char[l];

        for (int i = 97, j = 0; i < 123; i++, j++) {
            if (i == 111 || i == 105 || i == 108) j--;
            else c[j] = (char) i;
        }
        for (int o = 65, p = 23; o < 91; o++, p++) {
            if (o == 79 || o == 73 || o == 76) p--;
            else c[p] = (char) o;
        }
        for (int m = 48, n = 46; m < 58; m++, n++) {
            c[n] = (char) m;
        }

        String sRand = "";
        for (int i = 0; i < size; i++) {
            int x = random.nextInt(l);
            String rand = String.valueOf(c[x]);
            sRand += rand;
            g.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random.nextInt(110)));
            g.drawString(rand, 30 * i + width / 10, height-5 );
        }
        return sRand;
    }

    private Color getRandColor(int fc, int bc) {
        Random random = new Random();
        if (fc > 255) fc = 255;
        if (bc > 255) bc = 255;
        int r = fc + random.nextInt(bc - fc);
        int g = fc + random.nextInt(bc - fc);
        int b = fc + random.nextInt(bc - fc);
        return new Color(r, g, b);
    }

    public ByteArrayInputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(ByteArrayInputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String getRandomCode() {
        return randomCode;
    }

    public void setRandomCode(String randomCode) {
        this.randomCode = randomCode;
    }

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}
    
    

}