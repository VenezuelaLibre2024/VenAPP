package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzbxy;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzceg;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r extends w {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f8732b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ v f8733c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(v vVar, Context context) {
        this.f8732b = context;
        this.f8733c = vVar;
    }

    @Override // com.google.android.gms.ads.internal.client.w
    protected final /* bridge */ /* synthetic */ Object a() {
        v.r(this.f8732b, "mobile_ads_settings");
        return new b4();
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object b(f1 f1Var) {
        return f1Var.zzg(com.google.android.gms.dynamic.d.h2(this.f8732b), 240304000);
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object c() {
        t3 t3Var;
        zzbxy zzbxyVar;
        zzbgc.zza(this.f8732b);
        if (!((Boolean) a0.c().zza(zzbgc.zzki)).booleanValue()) {
            v vVar = this.f8733c;
            Context context = this.f8732b;
            t3Var = vVar.f8766c;
            return t3Var.a(context);
        }
        try {
            IBinder f22 = ((q1) zzceg.zzb(this.f8732b, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new zzcee() { // from class: com.google.android.gms.ads.internal.client.q
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcee
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return queryLocalInterface instanceof q1 ? (q1) queryLocalInterface : new q1(obj);
                }
            })).f2(com.google.android.gms.dynamic.d.h2(this.f8732b), 240304000);
            if (f22 == null) {
                return null;
            }
            IInterface queryLocalInterface = f22.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof p1 ? (p1) queryLocalInterface : new n1(f22);
        } catch (RemoteException | zzcef | NullPointerException e10) {
            this.f8733c.f8771h = zzbxw.zza(this.f8732b);
            zzbxyVar = this.f8733c.f8771h;
            zzbxyVar.zzg(e10, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
