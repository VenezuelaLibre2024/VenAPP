package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzbxy;
import com.google.android.gms.internal.ads.zzcec;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzceg;

/* loaded from: classes.dex */
public final class t4 extends com.google.android.gms.dynamic.f {

    /* renamed from: a */
    private zzbxy f8743a;

    public t4() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final u0 a(Context context, z4 z4Var, String str, zzbsv zzbsvVar, int i10) {
        zzbgc.zza(context);
        if (!((Boolean) a0.c().zza(zzbgc.zzki)).booleanValue()) {
            try {
                IBinder f22 = ((v0) getRemoteCreatorInstance(context)).f2(com.google.android.gms.dynamic.d.h2(context), z4Var, str, zzbsvVar, 240304000, i10);
                if (f22 == null) {
                    return null;
                }
                IInterface queryLocalInterface = f22.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof u0 ? (u0) queryLocalInterface : new s0(f22);
            } catch (RemoteException | f.a e10) {
                zzcec.zzf("Could not create remote AdManager.", e10);
                return null;
            }
        }
        try {
            IBinder f23 = ((v0) zzceg.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", s4.f8738a)).f2(com.google.android.gms.dynamic.d.h2(context), z4Var, str, zzbsvVar, 240304000, i10);
            if (f23 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = f23.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface2 instanceof u0 ? (u0) queryLocalInterface2 : new s0(f23);
        } catch (RemoteException | zzcef | NullPointerException e11) {
            zzbxy zza = zzbxw.zza(context);
            this.f8743a = zza;
            zza.zzg(e11, "AdManagerCreator.newAdManagerByDynamiteLoader");
            zzcec.zzl("#007 Could not call remote method.", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.f
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof v0 ? (v0) queryLocalInterface : new v0(iBinder);
    }
}
