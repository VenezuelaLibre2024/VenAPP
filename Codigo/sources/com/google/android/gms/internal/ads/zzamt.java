package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzamt implements zzacu {
    public static final zzadb zza = new zzadb() { // from class: com.google.android.gms.internal.ads.zzams
        @Override // com.google.android.gms.internal.ads.zzadb
        public final /* synthetic */ zzacu[] zza(Uri uri, Map map) {
            int i10 = zzada.zza;
            return new zzacu[]{new zzamt(0)};
        }
    };
    private final zzamu zzb;
    private final zzfp zzc;
    private final zzfp zzd;
    private final zzfo zze;
    private zzacx zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;

    public zzamt() {
        this(0);
    }

    public zzamt(int i10) {
        this.zzb = new zzamu(true, null);
        this.zzc = new zzfp(RecognitionOptions.PDF417);
        this.zzh = -1L;
        zzfp zzfpVar = new zzfp(10);
        this.zzd = zzfpVar;
        byte[] zzM = zzfpVar.zzM();
        this.zze = new zzfo(zzM, zzM.length);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzb(zzacv zzacvVar, zzadr zzadrVar) {
        zzek.zzb(this.zzf);
        int zza2 = zzacvVar.zza(this.zzc.zzM(), 0, RecognitionOptions.PDF417);
        if (!this.zzj) {
            this.zzf.zzO(new zzadt(-9223372036854775807L, 0L));
            this.zzj = true;
        }
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzK(0);
        this.zzc.zzJ(zza2);
        if (!this.zzi) {
            this.zzb.zzd(this.zzg, 4);
            this.zzi = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzc(zzacx zzacxVar) {
        this.zzf = zzacxVar;
        this.zzb.zzb(zzacxVar, new zzaok(Integer.MIN_VALUE, 0, 1));
        zzacxVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzd(long j10, long j11) {
        this.zzi = false;
        this.zzb.zze();
        this.zzg = j11;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zze(zzacv zzacvVar) {
        int i10 = 0;
        while (true) {
            zzack zzackVar = (zzack) zzacvVar;
            zzackVar.zzm(this.zzd.zzM(), 0, 10, false);
            this.zzd.zzK(0);
            if (this.zzd.zzo() != 4801587) {
                break;
            }
            this.zzd.zzL(3);
            int zzl = this.zzd.zzl();
            i10 += zzl + 10;
            zzackVar.zzl(zzl, false);
        }
        zzacvVar.zzj();
        zzack zzackVar2 = (zzack) zzacvVar;
        zzackVar2.zzl(i10, false);
        if (this.zzh == -1) {
            this.zzh = i10;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = i10;
        do {
            zzackVar2.zzm(this.zzd.zzM(), 0, 2, false);
            this.zzd.zzK(0);
            if (zzamu.zzf(this.zzd.zzq())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                zzackVar2.zzm(this.zzd.zzM(), 0, 4, false);
                this.zze.zzk(14);
                int zzd = this.zze.zzd(13);
                if (zzd > 6) {
                    zzackVar2.zzl(zzd - 6, false);
                    i12 += zzd;
                }
            }
            i13++;
            zzacvVar.zzj();
            zzackVar2.zzl(i13, false);
            i11 = 0;
            i12 = 0;
        } while (i13 - i10 < 8192);
        return false;
    }
}
