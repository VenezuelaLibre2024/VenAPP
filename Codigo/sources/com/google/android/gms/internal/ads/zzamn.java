package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzamn implements zzacu {
    public static final zzadb zza = new zzadb() { // from class: com.google.android.gms.internal.ads.zzamm
        @Override // com.google.android.gms.internal.ads.zzadb
        public final /* synthetic */ zzacu[] zza(Uri uri, Map map) {
            int i10 = zzada.zza;
            return new zzacu[]{new zzamn()};
        }
    };
    private final zzamo zzb = new zzamo(null);
    private final zzfp zzc = new zzfp(2786);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzb(zzacv zzacvVar, zzadr zzadrVar) {
        int zza2 = zzacvVar.zza(this.zzc.zzM(), 0, 2786);
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzK(0);
        this.zzc.zzJ(zza2);
        if (!this.zzd) {
            this.zzb.zzd(0L, 4);
            this.zzd = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzc(zzacx zzacxVar) {
        this.zzb.zzb(zzacxVar, new zzaok(Integer.MIN_VALUE, 0, 1));
        zzacxVar.zzD();
        zzacxVar.zzO(new zzadt(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzd(long j10, long j11) {
        this.zzd = false;
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zze(zzacv zzacvVar) {
        zzfp zzfpVar = new zzfp(10);
        int i10 = 0;
        while (true) {
            zzack zzackVar = (zzack) zzacvVar;
            zzackVar.zzm(zzfpVar.zzM(), 0, 10, false);
            zzfpVar.zzK(0);
            if (zzfpVar.zzo() != 4801587) {
                break;
            }
            zzfpVar.zzL(3);
            int zzl = zzfpVar.zzl();
            i10 += zzl + 10;
            zzackVar.zzl(zzl, false);
        }
        zzacvVar.zzj();
        zzack zzackVar2 = (zzack) zzacvVar;
        zzackVar2.zzl(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            zzackVar2.zzm(zzfpVar.zzM(), 0, 6, false);
            zzfpVar.zzK(0);
            if (zzfpVar.zzq() != 2935) {
                zzacvVar.zzj();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                zzackVar2.zzl(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int zzb = zzabv.zzb(zzfpVar.zzM());
                if (zzb == -1) {
                    return false;
                }
                zzackVar2.zzl(zzb - 6, false);
            }
        }
    }
}
