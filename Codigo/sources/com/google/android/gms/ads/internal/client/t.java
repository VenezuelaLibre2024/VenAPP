package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbjp;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzbjt;
import com.google.android.gms.internal.ads.zzbll;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzbxy;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzceg;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t extends w {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FrameLayout f8739b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ FrameLayout f8740c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f8741d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ v f8742e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(v vVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f8739b = frameLayout;
        this.f8740c = frameLayout2;
        this.f8741d = context;
        this.f8742e = vVar;
    }

    @Override // com.google.android.gms.ads.internal.client.w
    protected final /* bridge */ /* synthetic */ Object a() {
        v.r(this.f8741d, "native_ad_view_delegate");
        return new c4();
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object b(f1 f1Var) {
        return f1Var.R(com.google.android.gms.dynamic.d.h2(this.f8739b), com.google.android.gms.dynamic.d.h2(this.f8740c));
    }

    @Override // com.google.android.gms.ads.internal.client.w
    public final /* bridge */ /* synthetic */ Object c() {
        zzbxy zzbxyVar;
        zzbll zzbllVar;
        zzbgc.zza(this.f8741d);
        if (!((Boolean) a0.c().zza(zzbgc.zzki)).booleanValue()) {
            v vVar = this.f8742e;
            Context context = this.f8741d;
            FrameLayout frameLayout = this.f8739b;
            FrameLayout frameLayout2 = this.f8740c;
            zzbllVar = vVar.f8767d;
            return zzbllVar.zza(context, frameLayout, frameLayout2);
        }
        try {
            return zzbjp.zzbJ(((zzbjt) zzceg.zzb(this.f8741d, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new zzcee() { // from class: com.google.android.gms.ads.internal.client.s
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcee
                public final Object zza(Object obj) {
                    return zzbjs.zzb(obj);
                }
            })).zze(com.google.android.gms.dynamic.d.h2(this.f8741d), com.google.android.gms.dynamic.d.h2(this.f8739b), com.google.android.gms.dynamic.d.h2(this.f8740c), 240304000));
        } catch (RemoteException | zzcef | NullPointerException e10) {
            this.f8742e.f8771h = zzbxw.zza(this.f8741d);
            zzbxyVar = this.f8742e.f8771h;
            zzbxyVar.zzg(e10, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
