package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC5314d;
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
/* renamed from: com.google.android.gms.ads.internal.client.b */
/* loaded from: classes.dex */
public final class C4790b extends AbstractC4924w {

    /* renamed from: b */
    final /* synthetic */ Activity f9693b;

    /* renamed from: c */
    final /* synthetic */ C4918v f9694c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4790b(C4918v c4918v, Activity activity) {
        this.f9693b = activity;
        this.f9694c = c4918v;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: a */
    protected final /* bridge */ /* synthetic */ Object mo12366a() {
        C4918v.m12449r(this.f9693b, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo12367b(InterfaceC4820f1 interfaceC4820f1) {
        return interfaceC4820f1.zzm(BinderC5314d.m13412h2(this.f9693b));
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo12368c() {
        zzbxy zzbxyVar;
        zzbwq zzbwqVar;
        zzbgc.zza(this.f9693b);
        if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzki)).booleanValue()) {
            C4918v c4918v = this.f9694c;
            Activity activity = this.f9693b;
            zzbwqVar = c4918v.f9856f;
            return zzbwqVar.zza(activity);
        }
        try {
            return zzbws.zzI(((zzbww) zzceg.zzb(this.f9693b, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new zzcee() { // from class: com.google.android.gms.ads.internal.client.i5
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcee
                public final Object zza(Object obj) {
                    return zzbwv.zzb(obj);
                }
            })).zze(BinderC5314d.m13412h2(this.f9693b)));
        } catch (RemoteException | zzcef | NullPointerException e10) {
            this.f9694c.f9858h = zzbxw.zza(this.f9693b.getApplicationContext());
            zzbxyVar = this.f9694c.f9858h;
            zzbxyVar.zzg(e10, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
