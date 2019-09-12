package com.mywind;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 * Created by A03742 on 2019/9/11.
 */
public class Browse  {

    public static void main(String args[]) {
        String url = "http://jk.mywind.com.cn:8795";

        JFrame frame = new JFrame();

        // 谷歌内核浏览器
        Browser browser = new Browser();
        BrowserView view = new BrowserView(browser);
        //禁用close功能
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //标题
        frame.setTitle("DMS（明阳智能 Deep Matrix Space） ");
        //隐藏任务栏图标
         //frame.setType(JFrame.Type.UTILITY);
//        //不显示标题栏,最大化,最小化,退出按钮
        frame.setUndecorated(false);
        //尺寸
        frame.setSize(1920, 1080);
        //坐标
        frame.setLocation(0, 0);
        frame.add(view);
        //全屏显示
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // 是否显示
        frame.setVisible(true);
        //是否在屏幕最上层显示
        frame.setAlwaysOnTop(true);
        //加载地址
        //browser.loadURL(url);
        browser.loadHTML("你的许可证已经过期");

//        System.out.println(frame.getX());
//        System.out.println(frame.getY());
//        list.add(frame);
        frame.addWindowListener(new WindowAdapter() {
            // 窗口关闭时间监听
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("窗口关闭...");
            }
        });
    }

}
