package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzceg;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d extends w {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f8631b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ zzbsv f8632c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(v vVar, Context context, zzbsv zzbsvVar) {
        this.f8631b = context;
        this.f8632c = zzbsvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.w
    protected final /* bridge */ /* synthetic */ Object a() {
        v.r(this.f8631b, "out_of_context_tester");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object b(f1 f1Var) {
        Context context = this.f8631b;
        com.google.android.gms.dynamic.b h22 = com.google.android.gms.dynamic.d.h2(context);
        zzbgc.zza(context);
        if (((Boolean) a0.c().zza(zzbgc.zzjm)).booleanValue()) {
            return f1Var.D(h22, this.f8632c, 240304000);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object c() {
        Context context = this.f8631b;
        com.google.android.gms.dynamic.b h22 = com.google.android.gms.dynamic.d.h2(context);
        zzbgc.zza(context);
        if (!((Boolean) a0.c().zza(zzbgc.zzjm)).booleanValue()) {
            return null;
        }
        try {
            return ((m2) zzceg.zzb(this.f8631b, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new zzcee() { // from class: com.google.android.gms.ads.internal.client.c
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcee
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    return queryLocalInterface instanceof m2 ? (m2) queryLocalInterface : new m2(obj);
                }
            })).f2(h22, this.f8632c, 240304000);
        } catch (RemoteException | zzcef | NullPointerException e10) {
            zzbxw.zza(this.f8631b).zzg(e10, "ClientApiBroker.getOutOfContextTester");
            return null;
        }
    }
}
