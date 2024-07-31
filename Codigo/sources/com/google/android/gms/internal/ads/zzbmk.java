package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.j2;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzbmk implements zzbng {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbng
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcjk zzcjkVar = (zzcjk) obj;
        WindowManager windowManager = (WindowManager) zzcjkVar.getContext().getSystemService("window");
        t.r();
        DisplayMetrics U = j2.U(windowManager);
        int i10 = U.widthPixels;
        int i11 = U.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) zzcjkVar).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i10));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i11));
        zzcjkVar.zzd("locationReady", hashMap);
        zzcec.zzj("GET LOCATION COMPILED");
    }
}
