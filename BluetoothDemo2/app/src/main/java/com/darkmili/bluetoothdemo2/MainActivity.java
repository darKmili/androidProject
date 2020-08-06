package com.darkmili.bluetoothdemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.inuker.bluetooth.library.BluetoothClient;

public class MainActivity extends AppCompatActivity {
        private final BluetoothClient bluetoothClient= new BluetoothClient(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}