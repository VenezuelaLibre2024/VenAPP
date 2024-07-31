package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.measurement.zzpg;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.t6 */
/* loaded from: classes2.dex */
final class CallableC5675t6 implements Callable<List<C5601na>> {

    /* renamed from: a */
    private final /* synthetic */ C5576lb f11846a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f11847b;

    /* renamed from: c */
    private final /* synthetic */ BinderC5428a6 f11848c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC5675t6(BinderC5428a6 binderC5428a6, C5576lb c5576lb, Bundle bundle) {
        this.f11848c = binderC5428a6;
        this.f11846a = c5576lb;
        this.f11847b = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<C5601na> call() {
        C5705va c5705va;
        C5705va c5705va2;
        c5705va = this.f11848c.f11073a;
        c5705va.m14464j0();
        c5705va2 = this.f11848c.f11073a;
        C5576lb c5576lb = this.f11846a;
        Bundle bundle = this.f11847b;
        c5705va2.zzl().mo13687i();
        if (!zzpg.zza() || !c5705va2.m14451X().m13909w(c5576lb.f11553a, C5474e0.f11230L0) || c5576lb.f11553a == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    c5705va2.zzj().m14182B().m14218a("Uri sources and timestamps do not match");
                } else {
                    for (int i10 = 0; i10 < intArray.length; i10++) {
                        C5577m m14452Z = c5705va2.m14452Z();
                        String str = c5576lb.f11553a;
                        int i11 = intArray[i10];
                        long j10 = longArray[i10];
                        C5276s.m13320f(str);
                        m14452Z.mo13687i();
                        m14452Z.m14360p();
                        try {
                            int delete = m14452Z.m14155w().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i11), String.valueOf(j10)});
                            m14452Z.zzj().m14186F().m14221d("Pruned " + delete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i11), Long.valueOf(j10));
                        } catch (SQLiteException e10) {
                            m14452Z.zzj().m14182B().m14220c("Error pruning trigger URIs. appId", C5595n4.m14174q(str), e10);
                        }
                    }
                }
            }
        }
        return c5705va2.m14452Z().m14118F0(c5576lb.f11553a);
    }
}
