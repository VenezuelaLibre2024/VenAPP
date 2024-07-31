package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzbxy;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzceg;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.ads.internal.client.r */
/* loaded from: classes.dex */
public final class C4894r extends AbstractC4924w {

    /* renamed from: b */
    final /* synthetic */ Context f9809b;

    /* renamed from: c */
    final /* synthetic */ C4918v f9810c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4894r(C4918v c4918v, Context context) {
        this.f9809b = context;
        this.f9810c = c4918v;
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: a */
    protected final /* bridge */ /* synthetic */ Object mo12366a() {
        C4918v.m12449r(this.f9809b, "mobile_ads_settings");
        return new BinderC4795b4();
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo12367b(InterfaceC4820f1 interfaceC4820f1) {
        return interfaceC4820f1.zzg(BinderC5314d.m13412h2(this.f9809b), 240304000);
    }

    @Override // com.google.android.gms.ads.internal.client.AbstractC4924w
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo12368c() {
        C4910t3 c4910t3;
        zzbxy zzbxyVar;
        zzbgc.zza(this.f9809b);
        if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzki)).booleanValue()) {
            C4918v c4918v = this.f9810c;
            Context context = this.f9809b;
            c4910t3 = c4918v.f9853c;
            return c4910t3.m12440a(context);
        }
        try {
            IBinder m12435f2 = ((C4890q1) zzceg.zzb(this.f9809b, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new zzcee() { // from class: com.google.android.gms.ads.internal.client.q
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcee
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return queryLocalInterface instanceof C4890q1 ? (C4890q1) queryLocalInterface : new C4890q1(obj);
                }
            })).m12435f2(BinderC5314d.m13412h2(this.f9809b), 240304000);
            if (m12435f2 == null) {
                return null;
            }
            IInterface queryLocalInterface = m12435f2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof InterfaceC4884p1 ? (InterfaceC4884p1) queryLocalInterface : new C4872n1(m12435f2);
        } catch (RemoteException | zzcef | NullPointerException e10) {
            this.f9810c.f9858h = zzbxw.zza(this.f9809b);
            zzbxyVar = this.f9810c.f9858h;
            zzbxyVar.zzg(e10, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
