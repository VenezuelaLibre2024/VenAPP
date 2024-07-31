package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.dynamic.InterfaceC5312b;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzceg;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.client.d */
/* loaded from: classes.dex */
public final class C4804d extends AbstractC4924w {

    /* renamed from: b */
    final /* synthetic */ Context f9708b;

    /* renamed from: c */
    final /* synthetic */ zzbsv f9709c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4804d(C4918v c4918v, Context context, zzbsv zzbsvVar) {
        this.f9708b = context;
        this.f9709c = zzbsvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: a */
    protected final /* bridge */ /* synthetic */ Object mo12366a() {
        C4918v.m12449r(this.f9708b, "out_of_context_tester");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo12367b(InterfaceC4820f1 interfaceC4820f1) {
        Context context = this.f9708b;
        InterfaceC5312b m13412h2 = BinderC5314d.m13412h2(context);
        zzbgc.zza(context);
        if (((Boolean) C4784a0.m12365c().zza(zzbgc.zzjm)).booleanValue()) {
            return interfaceC4820f1.mo12345D(m13412h2, this.f9709c, 240304000);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo12368c() {
        Context context = this.f9708b;
        InterfaceC5312b m13412h2 = BinderC5314d.m13412h2(context);
        zzbgc.zza(context);
        if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzjm)).booleanValue()) {
            return null;
        }
        try {
            return ((C4867m2) zzceg.zzb(this.f9708b, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new zzcee() { // from class: com.google.android.gms.ads.internal.client.c
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcee
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    return queryLocalInterface instanceof C4867m2 ? (C4867m2) queryLocalInterface : new C4867m2(obj);
                }
            })).m12407f2(m13412h2, this.f9709c, 240304000);
        } catch (RemoteException | zzcef | NullPointerException e10) {
            zzbxw.zza(this.f9708b).zzg(e10, "ClientApiBroker.getOutOfContextTester");
            return null;
        }
    }
}
