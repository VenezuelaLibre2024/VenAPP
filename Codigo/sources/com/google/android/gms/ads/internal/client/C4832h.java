package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbwo;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzceg;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.client.h */
/* loaded from: classes.dex */
public final class C4832h extends AbstractC4924w {

    /* renamed from: b */
    final /* synthetic */ Context f9746b;

    /* renamed from: c */
    final /* synthetic */ zzbsv f9747c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4832h(C4918v c4918v, Context context, zzbsv zzbsvVar) {
        this.f9746b = context;
        this.f9747c = zzbsvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: a */
    protected final /* bridge */ /* synthetic */ Object mo12366a() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo12367b(InterfaceC4820f1 interfaceC4820f1) {
        return interfaceC4820f1.mo12348R1(BinderC5314d.m13412h2(this.f9746b), this.f9747c, 240304000);
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo12368c() {
        try {
            return ((zzbwp) zzceg.zzb(this.f9746b, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new zzcee() { // from class: com.google.android.gms.ads.internal.client.g
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcee
                public final Object zza(Object obj) {
                    return zzbwo.zzb(obj);
                }
            })).zze(BinderC5314d.m13412h2(this.f9746b), this.f9747c, 240304000);
        } catch (RemoteException | zzcef | NullPointerException unused) {
            return null;
        }
    }
}
