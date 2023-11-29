package com.example.demo.controller;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AnnoyingLove {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            // JFrameのインスタンスを作成
            JFrame frame = new JFrame("愛してるウィンドウ");

            // ラベルのインスタンスを作成
            JLabel label = new JLabel("あいしてる");

            // ラベルをフレームに追加
            frame.add(label);

            // フレームのサイズを設定
            frame.setSize(i * 100, i * 100);

            // フレームを表示
            frame.setVisible(true);

            // プログラムが終了するときにフレームも閉じるように設定
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // 少し待機してから次のウィンドウを表示
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // ウィンドウを閉じる
            frame.dispose();

        }
    }
}
