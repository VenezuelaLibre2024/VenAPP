package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzccw;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzceg;

/* loaded from: classes.dex */
public final class f extends w {

    /* renamed from: b */
    final /* synthetic */ Context f8660b;

    /* renamed from: c */
    final /* synthetic */ zzbsv f8661c;

    public f(v vVar, Context context, zzbsv zzbsvVar) {
        this.f8660b = context;
        this.f8661c = zzbsvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.w
    protected final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object b(f1 f1Var) {
        return f1Var.P0(com.google.android.gms.dynamic.d.h2(this.f8660b), this.f8661c, 240304000);
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object c() {
        try {
            return ((zzccw) zzceg.zzb(this.f8660b, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", e.f8657a)).zze(com.google.android.gms.dynamic.d.h2(this.f8660b), this.f8661c, 240304000);
        } catch (RemoteException | zzcef | NullPointerException unused) {
            return null;
        }
    }
}
