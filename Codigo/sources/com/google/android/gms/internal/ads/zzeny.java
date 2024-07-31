package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
final class zzeny implements zzdcg {
    boolean zza = false;
    final /* synthetic */ zzeiq zzb;
    final /* synthetic */ zzceu zzc;
    final /* synthetic */ zzenz zzd;

    public zzeny(zzenz zzenzVar, zzeiq zzeiqVar, zzceu zzceuVar) {
        this.zzb = zzeiqVar;
        this.zzc = zzceuVar;
        this.zzd = zzenzVar;
    }

    private final synchronized void zze(c3 c3Var) {
        int i10 = 1;
        if (true == ((Boolean) a0.c().zza(zzbgc.zzfs)).booleanValue()) {
            i10 = 3;
        }
        this.zzc.zzd(new zzeir(i10, c3Var));
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final synchronized void zza(int i10) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new c3(i10, zzenz.zze(this.zzb.zza, i10), "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final synchronized void zzb(c3 c3Var) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(c3Var);
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final synchronized void zzc(int i10, String str) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        if (str == null) {
            str = zzenz.zze(this.zzb.zza, i10);
        }
        zze(new c3(i10, str, "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final synchronized void zzd() {
        this.zzc.zzc(null);
    }
}
