package com.darkmili.bluetoothdemo;

import java.util.UUID;

public class DetailItem {
    private int type;
    private UUID uuid;
    private UUID SUuid;
    public static final int TYPE_SERVICE=1;
    public static final int TYPE_CHAR=2;

    public DetailItem(int type, UUID uuid, UUID SUuid) {
        this.type = type;
        this.uuid = uuid;
        this.SUuid = SUuid;
    }
}
