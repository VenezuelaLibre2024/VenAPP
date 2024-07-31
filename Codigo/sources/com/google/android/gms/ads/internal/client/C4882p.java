package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzbxy;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzceg;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.client.p */
/* loaded from: classes.dex */
public final class C4882p extends AbstractC4924w {

    /* renamed from: b */
    final /* synthetic */ Context f9795b;

    /* renamed from: c */
    final /* synthetic */ String f9796c;

    /* renamed from: d */
    final /* synthetic */ zzbsv f9797d;

    /* renamed from: e */
    final /* synthetic */ C4918v f9798e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4882p(C4918v c4918v, Context context, String str, zzbsv zzbsvVar) {
        this.f9795b = context;
        this.f9796c = str;
        this.f9797d = zzbsvVar;
        this.f9798e = c4918v;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: a */
    protected final /* bridge */ /* synthetic */ Object mo12366a() {
        C4918v.m12449r(this.f9795b, "native_ad");
        return new BinderC4934x3();
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo12367b(InterfaceC4820f1 interfaceC4820f1) {
        return interfaceC4820f1.mo12356v1(BinderC5314d.m13412h2(this.f9795b), this.f9796c, this.f9797d, 240304000);
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo12368c() {
        C4899r4 c4899r4;
        zzbxy zzbxyVar;
        zzbgc.zza(this.f9795b);
        if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzki)).booleanValue()) {
            C4918v c4918v = this.f9798e;
            Context context = this.f9795b;
            String str = this.f9796c;
            zzbsv zzbsvVar = this.f9797d;
            c4899r4 = c4918v.f9852b;
            return c4899r4.m12436a(context, str, zzbsvVar);
        }
        try {
            IBinder zze = ((C4895r0) zzceg.zzb(this.f9795b, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new zzcee() { // from class: com.google.android.gms.ads.internal.client.o
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcee
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return queryLocalInterface instanceof C4895r0 ? (C4895r0) queryLocalInterface : new C4895r0(obj);
                }
            })).zze(BinderC5314d.m13412h2(this.f9795b), this.f9796c, this.f9797d, 240304000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof InterfaceC4889q0 ? (InterfaceC4889q0) queryLocalInterface : new C4877o0(zze);
        } catch (RemoteException | zzcef | NullPointerException e10) {
            this.f9798e.f9858h = zzbxw.zza(this.f9795b);
            zzbxyVar = this.f9798e.f9858h;
            zzbxyVar.zzg(e10, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
