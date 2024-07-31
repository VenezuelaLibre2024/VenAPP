package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzcdv;

/* loaded from: classes.dex */
public class l2 extends k2 {
    static final boolean l(int i10, int i11, int i12) {
        return Math.abs(i10 - i11) <= i12;
    }

    @Override // com.google.android.gms.ads.internal.util.c
    public final boolean d(Activity activity, Configuration configuration) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzeJ)).booleanValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzeL)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        com.google.android.gms.ads.internal.client.x.b();
        int zzx = zzcdv.zzx(activity, configuration.screenHeightDp);
        int zzx2 = zzcdv.zzx(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        com.google.android.gms.ads.internal.t.r();
        DisplayMetrics U = j2.U(windowManager);
        int i10 = U.heightPixels;
        int i11 = U.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int round = ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d)) * ((Integer) com.google.android.gms.ads.internal.client.a0.c().zza(zzbgc.zzeH)).intValue();
        return (l(i10, zzx + dimensionPixelSize, round) && l(i11, zzx2, round)) ? false : true;
    }
}
