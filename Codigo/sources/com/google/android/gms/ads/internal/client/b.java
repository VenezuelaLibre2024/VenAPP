package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbwq;
import com.google.android.gms.internal.ads.zzbws;
import com.google.android.gms.internal.ads.zzbwv;
import com.google.android.gms.internal.ads.zzbww;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzbxy;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzceg;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends w {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f8616b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ v f8617c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(v vVar, Activity activity) {
        this.f8616b = activity;
        this.f8617c = vVar;
    }

    @Override // com.google.android.gms.ads.internal.client.w
    protected final /* bridge */ /* synthetic */ Object a() {
        v.r(this.f8616b, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object b(f1 f1Var) {
        return f1Var.zzm(com.google.android.gms.dynamic.d.h2(this.f8616b));
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object c() {
        zzbxy zzbxyVar;
        zzbwq zzbwqVar;
        zzbgc.zza(this.f8616b);
        if (!((Boolean) a0.c().zza(zzbgc.zzki)).booleanValue()) {
            v vVar = this.f8617c;
            Activity activity = this.f8616b;
            zzbwqVar = vVar.f8769f;
            return zzbwqVar.zza(activity);
        }
        try {
            return zzbws.zzI(((zzbww) zzceg.zzb(this.f8616b, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new zzcee() { // from class: com.google.android.gms.ads.internal.client.i5
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcee
                public final Object zza(Object obj) {
                    return zzbwv.zzb(obj);
                }
            })).zze(com.google.android.gms.dynamic.d.h2(this.f8616b)));
        } catch (RemoteException | zzcef | NullPointerException e10) {
            this.f8617c.f8771h = zzbxw.zza(this.f8616b.getApplicationContext());
            zzbxyVar = this.f8617c.f8771h;
            zzbxyVar.zzg(e10, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
