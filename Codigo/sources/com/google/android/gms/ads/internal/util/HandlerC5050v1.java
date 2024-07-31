package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.C4965t;
import com.google.android.gms.internal.ads.zzftt;

/* renamed from: com.google.android.gms.ads.internal.util.v1 */
/* loaded from: classes.dex */
public final class HandlerC5050v1 extends zzftt {
    public HandlerC5050v1(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e10) {
            C4965t.m12580q().zzw(e10, "AdMobHandler.handleMessage");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzftt
    public final void zza(Message message) {
        try {
            super.zza(message);
        } catch (Throwable th2) {
            C4965t.m12581r();
            C5005j2.m12673l(C4965t.m12580q().zzd(), th2);
            throw th2;
        }
    }
}
