package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes2.dex */
final class zzmn {
    private final PowerManager zza;

    public zzmn(Context context) {
        this.zza = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}