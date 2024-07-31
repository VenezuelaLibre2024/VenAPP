package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbob;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzboo;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzceg;

/* loaded from: classes.dex */
public final class j extends w {

    /* renamed from: b */
    final /* synthetic */ Context f8678b;

    /* renamed from: c */
    final /* synthetic */ zzbsv f8679c;

    /* renamed from: d */
    final /* synthetic */ b9.b f8680d;

    public j(v vVar, Context context, zzbsv zzbsvVar, b9.b bVar) {
        this.f8678b = context;
        this.f8679c = zzbsvVar;
        this.f8680d = bVar;
    }

    @Override // com.google.android.gms.ads.internal.client.w
    protected final /* synthetic */ Object a() {
        return new zzboo();
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object b(f1 f1Var) {
        return f1Var.e0(com.google.android.gms.dynamic.d.h2(this.f8678b), this.f8679c, 240304000, new zzbob(this.f8680d));
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object c() {
        try {
            return ((zzbok) zzceg.zzb(this.f8678b, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", i.f8674a)).zze(com.google.android.gms.dynamic.d.h2(this.f8678b), this.f8679c, 240304000, new zzbob(this.f8680d));
        } catch (RemoteException | zzcef | NullPointerException unused) {
            return null;
        }
    }
}
