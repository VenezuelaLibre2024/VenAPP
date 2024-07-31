package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import x8.b0;

/* loaded from: classes2.dex */
public final class zzbkh {
    private final zzbkg zza;
    private final a9.b zzb;
    private final b0 zzc = new b0();

    public zzbkh(zzbkg zzbkgVar) {
        Context context;
        this.zza = zzbkgVar;
        a9.b bVar = null;
        try {
            context = (Context) com.google.android.gms.dynamic.d.g2(zzbkgVar.zzh());
        } catch (RemoteException | NullPointerException e10) {
            zzcec.zzh("", e10);
            context = null;
        }
        if (context != null) {
            a9.b bVar2 = new a9.b(context);
            try {
                if (true == this.zza.zzs(com.google.android.gms.dynamic.d.h2(bVar2))) {
                    bVar = bVar2;
                }
            } catch (RemoteException e11) {
                zzcec.zzh("", e11);
            }
        }
        this.zzb = bVar;
    }

    public final zzbkg zza() {
        return this.zza;
    }

    public final String zzb() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e10) {
            zzcec.zzh("", e10);
            return null;
        }
    }
}
