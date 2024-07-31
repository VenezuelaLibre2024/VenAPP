package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzamq implements zzacu {
    public static final zzadb zza = new zzadb() { // from class: com.google.android.gms.internal.ads.zzamp
        @Override // com.google.android.gms.internal.ads.zzadb
        public final /* synthetic */ zzacu[] zza(Uri uri, Map map) {
            int i10 = zzada.zza;
            return new zzacu[]{new zzamq()};
        }
    };
    private final zzamr zzb = new zzamr(null);
    private final zzfp zzc = new zzfp(16384);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzb(zzacv zzacvVar, zzadr zzadrVar) {
        int zza2 = zzacvVar.zza(this.zzc.zzM(), 0, 16384);
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
        int i10;
        zzfp zzfpVar = new zzfp(10);
        int i11 = 0;
        while (true) {
            zzack zzackVar = (zzack) zzacvVar;
            zzackVar.zzm(zzfpVar.zzM(), 0, 10, false);
            zzfpVar.zzK(0);
            if (zzfpVar.zzo() != 4801587) {
                break;
            }
            zzfpVar.zzL(3);
            int zzl = zzfpVar.zzl();
            i11 += zzl + 10;
            zzackVar.zzl(zzl, false);
        }
        zzacvVar.zzj();
        zzack zzackVar2 = (zzack) zzacvVar;
        zzackVar2.zzl(i11, false);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            zzackVar2.zzm(zzfpVar.zzM(), 0, 7, false);
            zzfpVar.zzK(0);
            int zzq = zzfpVar.zzq();
            if (zzq == 44096 || zzq == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] zzM = zzfpVar.zzM();
                int i15 = zzaby.zza;
                if (zzM.length < 7) {
                    i10 = -1;
                } else {
                    int i16 = ((zzM[2] & 255) << 8) | (zzM[3] & 255);
                    if (i16 == 65535) {
                        i16 = ((zzM[4] & 255) << 16) | ((zzM[5] & 255) << 8) | (zzM[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (zzq == 44097) {
                        i14 += 2;
                    }
                    i10 = i16 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                zzackVar2.zzl(i10 - 7, false);
            } else {
                zzacvVar.zzj();
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                zzackVar2.zzl(i13, false);
                i12 = 0;
            }
        }
    }
}
