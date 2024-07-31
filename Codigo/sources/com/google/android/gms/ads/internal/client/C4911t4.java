package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.AbstractC5316f;
import com.google.android.gms.dynamic.BinderC5314d;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzbxy;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzceg;

/* renamed from: com.google.android.gms.ads.internal.client.t4 */
/* loaded from: classes.dex */
public final class C4911t4 extends AbstractC5316f {

    /* renamed from: a */
    private zzbxy f9820a;

    public C4911t4() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* renamed from: a */
    public final InterfaceC4913u0 m12441a(Context context, C4947z4 c4947z4, String str, zzbsv zzbsvVar, int i10) {
        zzbgc.zza(context);
        if (!((Boolean) C4784a0.m12365c().zza(zzbgc.zzki)).booleanValue()) {
            try {
                IBinder m12460f2 = ((C4919v0) getRemoteCreatorInstance(context)).m12460f2(BinderC5314d.m13412h2(context), c4947z4, str, zzbsvVar, 240304000, i10);
                if (m12460f2 == null) {
                    return null;
                }
                IInterface queryLocalInterface = m12460f2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof InterfaceC4913u0 ? (InterfaceC4913u0) queryLocalInterface : new C4901s0(m12460f2);
            } catch (RemoteException | AbstractC5316f.a e10) {
                zzcec.zzf("Could not create remote AdManager.", e10);
                return null;
            }
        }
        try {
            IBinder m12460f22 = ((C4919v0) zzceg.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new zzcee() { // from class: com.google.android.gms.ads.internal.client.s4
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.zzcee
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface2 = obj.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return queryLocalInterface2 instanceof C4919v0 ? (C4919v0) queryLocalInterface2 : new C4919v0(obj);
                }
            })).m12460f2(BinderC5314d.m13412h2(context), c4947z4, str, zzbsvVar, 240304000, i10);
            if (m12460f22 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = m12460f22.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface2 instanceof InterfaceC4913u0 ? (InterfaceC4913u0) queryLocalInterface2 : new C4901s0(m12460f22);
        } catch (RemoteException | zzcef | NullPointerException e11) {
            zzbxy zza = zzbxw.zza(context);
            this.f9820a = zza;
            zza.zzg(e11, "AdManagerCreator.newAdManagerByDynamiteLoader");
            zzcec.zzl("#007 Could not call remote method.", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.AbstractC5316f
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof C4919v0 ? (C4919v0) queryLocalInterface : new C4919v0(iBinder);
    }
}
