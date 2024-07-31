package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.BinderC5314d;
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
/* renamed from: com.google.android.gms.ads.internal.client.t */
/* loaded from: classes.dex */
public final class C4906t extends AbstractC4924w {

    /* renamed from: b */
    final /* synthetic */ FrameLayout f9816b;

    /* renamed from: c */
    final /* synthetic */ FrameLayout f9817c;

    /* renamed from: d */
    final /* synthetic */ Context f9818d;

    /* renamed from: e */
    final /* synthetic */ C4918v f9819e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4906t(C4918v c4918v, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.f9816b = frameLayout;
        this.f9817c = frameLayout2;
        this.f9818d = context;
        this.f9819e = c4918v;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: a */
    protected final /* bridge */ /* synthetic */ Object mo12366a() {
        C4918v.m12449r(this.f9818d, "native_ad_view_delegate");
        return new BinderC4802c4();
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo12367b(InterfaceC4820f1 interfaceC4820f1) {
        return interfaceC4820f1.mo12347R(BinderC5314d.m13412h2(this.f9816b), BinderC5314d.m13412h2(this.f9817c));
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo12368c() {
        zzbxy zzbxyVar;
        zzbll zzbllVar;
        zzbgc.zza(this.f9818d);
        if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzki)).booleanValue()) {
            C4918v c4918v = this.f9819e;
            Context context = this.f9818d;
            FrameLayout frameLayout = this.f9816b;
            FrameLayout frameLayout2 = this.f9817c;
            zzbllVar = c4918v.f9854d;
            return zzbllVar.zza(context, frameLayout, frameLayout2);
        }
        try {
            return zzbjp.zzbJ(((zzbjt) zzceg.zzb(this.f9818d, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new zzcee() { // from class: com.google.android.gms.ads.internal.client.s
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcee
                public final Object zza(Object obj) {
                    return zzbjs.zzb(obj);
                }
            })).zze(BinderC5314d.m13412h2(this.f9818d), BinderC5314d.m13412h2(this.f9816b), BinderC5314d.m13412h2(this.f9817c), 240304000));
        } catch (RemoteException | zzcef | NullPointerException e10) {
            this.f9819e.f9858h = zzbxw.zza(this.f9818d);
            zzbxyVar = this.f9819e.f9858h;
            zzbxyVar.zzg(e10, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
