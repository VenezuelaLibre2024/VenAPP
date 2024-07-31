package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.C4965t;
import com.google.android.gms.ads.internal.client.C4784a0;
import com.google.android.gms.ads.internal.client.C4930x;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzcdv;

/* renamed from: com.google.android.gms.ads.internal.util.l2 */
/* loaded from: classes.dex */
public class C5013l2 extends C5009k2 {
    /* renamed from: l */
    static final boolean m12699l(int i10, int i11, int i12) {
        return Math.abs(i10 - i11) <= i12;
    }

    @Override // com.google.android.gms.ads.internal.util.C4974c
    /* renamed from: d */
    public final boolean mo12608d(Activity activity, Configuration configuration) {
        if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzeJ)).booleanValue()) {
            return false;
        }
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzeL)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        C4930x.m12474b();
        int zzx = zzcdv.zzx(activity, configuration.screenHeightDp);
        int zzx2 = zzcdv.zzx(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        C4965t.m12581r();
        DisplayMetrics m12654U = C5005j2.m12654U(windowManager);
        int i10 = m12654U.heightPixels;
        int i11 = m12654U.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int round = ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d)) * ((Integer) C4784a0.m12365c().zza(zzbgc.zzeH)).intValue();
        return (m12699l(i10, zzx + dimensionPixelSize, round) && m12699l(i11, zzx2, round)) ? false : true;
    }
}
