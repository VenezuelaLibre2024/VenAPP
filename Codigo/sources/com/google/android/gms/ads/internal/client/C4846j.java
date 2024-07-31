package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.internal.ads.zzbob;
import com.google.android.gms.internal.ads.zzboj;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzboo;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzceg;
import p027b9.InterfaceC1684b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.client.j */
/* loaded from: classes.dex */
public final class C4846j extends AbstractC4924w {

    /* renamed from: b */
    final /* synthetic */ Context f9755b;

    /* renamed from: c */
    final /* synthetic */ zzbsv f9756c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC1684b f9757d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4846j(C4918v c4918v, Context context, zzbsv zzbsvVar, InterfaceC1684b interfaceC1684b) {
        this.f9755b = context;
        this.f9756c = zzbsvVar;
        this.f9757d = interfaceC1684b;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: a */
    protected final /* synthetic */ Object mo12366a() {
        return new zzboo();
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo12367b(InterfaceC4820f1 interfaceC4820f1) {
        return interfaceC4820f1.mo12350e0(BinderC5314d.m13412h2(this.f9755b), this.f9756c, 240304000, new zzbob(this.f9757d));
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo12368c() {
        try {
            return ((zzbok) zzceg.zzb(this.f9755b, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", new zzcee() { // from class: com.google.android.gms.ads.internal.client.i
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcee
                public final Object zza(Object obj) {
                    return zzboj.zzb(obj);
                }
            })).zze(BinderC5314d.m13412h2(this.f9755b), this.f9756c, 240304000, new zzbob(this.f9757d));
        } catch (RemoteException | zzcef | NullPointerException unused) {
            return null;
        }
    }
}
