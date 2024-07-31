package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzpg;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class t6 implements Callable<List<na>> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ lb f10648a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Bundle f10649b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ a6 f10650c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t6(a6 a6Var, lb lbVar, Bundle bundle) {
        this.f10650c = a6Var;
        this.f10648a = lbVar;
        this.f10649b = bundle;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<na> call() {
        va vaVar;
        va vaVar2;
        vaVar = this.f10650c.f9953a;
        vaVar.j0();
        vaVar2 = this.f10650c.f9953a;
        lb lbVar = this.f10648a;
        Bundle bundle = this.f10649b;
        vaVar2.zzl().i();
        if (!zzpg.zza() || !vaVar2.X().w(lbVar.f10366a, e0.L0) || lbVar.f10366a == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    vaVar2.zzj().B().a("Uri sources and timestamps do not match");
                } else {
                    for (int i10 = 0; i10 < intArray.length; i10++) {
                        m Z = vaVar2.Z();
                        String str = lbVar.f10366a;
                        int i11 = intArray[i10];
                        long j10 = longArray[i10];
                        com.google.android.gms.common.internal.s.f(str);
                        Z.i();
                        Z.p();
                        try {
                            int delete = Z.w().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i11), String.valueOf(j10)});
                            Z.zzj().F().d("Pruned " + delete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i11), Long.valueOf(j10));
                        } catch (SQLiteException e10) {
                            Z.zzj().B().c("Error pruning trigger URIs. appId", n4.q(str), e10);
                        }
                    }
                }
            }
        }
        return vaVar2.Z().F0(lbVar.f10366a);
    }
}
