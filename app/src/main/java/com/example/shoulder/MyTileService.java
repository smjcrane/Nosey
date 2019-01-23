package com.example.shoulder;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.service.quicksettings.TileService;

public class MyTileService extends TileService {
    public MyTileService() {
    }

    @Override
    public void onClick(){
        super.onClick();

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
