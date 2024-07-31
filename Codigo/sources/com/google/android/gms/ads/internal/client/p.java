package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzbxy;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzceg;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p extends w {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f8718b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f8719c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ zzbsv f8720d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ v f8721e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(v vVar, Context context, String str, zzbsv zzbsvVar) {
        this.f8718b = context;
        this.f8719c = str;
        this.f8720d = zzbsvVar;
        this.f8721e = vVar;
    }

    @Override // com.google.android.gms.ads.internal.client.w
    protected final /* bridge */ /* synthetic */ Object a() {
        v.r(this.f8718b, "native_ad");
        return new x3();
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object b(f1 f1Var) {
        return f1Var.v1(com.google.android.gms.dynamic.d.h2(this.f8718b), this.f8719c, this.f8720d, 240304000);
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object c() {
        r4 r4Var;
        zzbxy zzbxyVar;
        zzbgc.zza(this.f8718b);
        if (!((Boolean) a0.c().zza(zzbgc.zzki)).booleanValue()) {
            v vVar = this.f8721e;
            Context context = this.f8718b;
            String str = this.f8719c;
            zzbsv zzbsvVar = this.f8720d;
            r4Var = vVar.f8765b;
            return r4Var.a(context, str, zzbsvVar);
        }
        try {
            IBinder zze = ((r0) zzceg.zzb(this.f8718b, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new zzcee() { // from class: com.google.android.gms.ads.internal.client.o
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcee
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return queryLocalInterface instanceof r0 ? (r0) queryLocalInterface : new r0(obj);
                }
            })).zze(com.google.android.gms.dynamic.d.h2(this.f8718b), this.f8719c, this.f8720d, 240304000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof q0 ? (q0) queryLocalInterface : new o0(zze);
        } catch (RemoteException | zzcef | NullPointerException e10) {
            this.f8721e.f8771h = zzbxw.zza(this.f8718b);
            zzbxyVar = this.f8721e.f8771h;
            zzbxyVar.zzg(e10, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
