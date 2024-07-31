package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.v4;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.client.y4;
import com.google.android.gms.ads.internal.client.z2;

/* loaded from: classes2.dex */
public final class zzbxk {
    private static zzcct zza;
    private final Context zzb;
    private final x8.c zzc;
    private final z2 zzd;
    private final String zze;

    public zzbxk(Context context, x8.c cVar, z2 z2Var, String str) {
        this.zzb = context;
        this.zzc = cVar;
        this.zzd = z2Var;
        this.zze = str;
    }

    public static zzcct zza(Context context) {
        zzcct zzcctVar;
        synchronized (zzbxk.class) {
            if (zza == null) {
                zza = x.a().p(context, new zzbsr());
            }
            zzcctVar = zza;
        }
        return zzcctVar;
    }

    public final void zzb(m9.b bVar) {
        u4 a10;
        String str;
        zzcct zza2 = zza(this.zzb);
        if (zza2 == null) {
            str = "Internal Error, query info generator is null.";
        } else {
            Context context = this.zzb;
            z2 z2Var = this.zzd;
            com.google.android.gms.dynamic.b h22 = com.google.android.gms.dynamic.d.h2(context);
            if (z2Var == null) {
                a10 = new v4().a();
            } else {
                a10 = y4.f8814a.a(this.zzb, z2Var);
            }
            try {
                zza2.zzf(h22, new zzccx(this.zze, this.zzc.name(), null, a10), new zzbxj(this, bVar));
                return;
            } catch (RemoteException unused) {
                str = "Internal Error.";
            }
        }
        bVar.onFailure(str);
    }
}
