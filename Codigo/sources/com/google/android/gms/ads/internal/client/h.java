package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzceg;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h extends w {

    /* renamed from: b */
    final /* synthetic */ Context f8669b;

    /* renamed from: c */
    final /* synthetic */ zzbsv f8670c;

    public h(v vVar, Context context, zzbsv zzbsvVar) {
        this.f8669b = context;
        this.f8670c = zzbsvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.w
    protected final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object b(f1 f1Var) {
        return f1Var.R1(com.google.android.gms.dynamic.d.h2(this.f8669b), this.f8670c, 240304000);
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object c() {
        try {
            return ((zzbwp) zzceg.zzb(this.f8669b, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", g.f8665a)).zze(com.google.android.gms.dynamic.d.h2(this.f8669b), this.f8670c, 240304000);
        } catch (RemoteException | zzcef | NullPointerException unused) {
            return null;
        }
    }
}
