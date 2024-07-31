package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.f5;
import com.google.android.gms.ads.internal.client.u0;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.ads.internal.client.y4;
import com.google.android.gms.ads.internal.client.z2;
import com.google.android.gms.ads.internal.client.z4;
import z8.a;

/* loaded from: classes2.dex */
public final class zzbar {
    private u0 zza;
    private final Context zzb;
    private final String zzc;
    private final z2 zzd;
    private final int zze;
    private final a.AbstractC0543a zzf;
    private final zzbsr zzg = new zzbsr();
    private final y4 zzh = y4.f8814a;

    public zzbar(Context context, String str, z2 z2Var, int i10, a.AbstractC0543a abstractC0543a) {
        this.zzb = context;
        this.zzc = str;
        this.zzd = z2Var;
        this.zze = i10;
        this.zzf = abstractC0543a;
    }

    public final void zza() {
        try {
            u0 d10 = x.a().d(this.zzb, z4.v1(), this.zzc, this.zzg);
            this.zza = d10;
            if (d10 != null) {
                if (this.zze != 3) {
                    this.zza.zzI(new f5(this.zze));
                }
                this.zza.zzH(new zzbae(this.zzf, this.zzc));
                this.zza.zzaa(this.zzh.a(this.zzb, this.zzd));
            }
        } catch (RemoteException e10) {
            zzcec.zzl("#007 Could not call remote method.", e10);
        }
    }
}
