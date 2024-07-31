package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzajw implements zzacu {
    public static final zzadb zza = new zzadb() { // from class: com.google.android.gms.internal.ads.zzajv
        @Override // com.google.android.gms.internal.ads.zzadb
        public final /* synthetic */ zzacu[] zza(Uri uri, Map map) {
            int i10 = zzada.zza;
            return new zzacu[]{new zzajw()};
        }
    };
    private zzacx zzb;
    private zzake zzc;
    private boolean zzd;

    private final boolean zza(zzacv zzacvVar) {
        zzake zzakaVar;
        zzajy zzajyVar = new zzajy();
        if (zzajyVar.zzb(zzacvVar, true) && (zzajyVar.zza & 2) == 2) {
            int min = Math.min(zzajyVar.zze, 8);
            zzfp zzfpVar = new zzfp(min);
            ((zzack) zzacvVar).zzm(zzfpVar.zzM(), 0, min, false);
            zzfpVar.zzK(0);
            if (zzfpVar.zzb() >= 5 && zzfpVar.zzm() == 127 && zzfpVar.zzu() == 1179402563) {
                zzakaVar = new zzaju();
            } else {
                zzfpVar.zzK(0);
                try {
                    if (zzaeg.zzd(1, zzfpVar, true)) {
                        zzakaVar = new zzakg();
                    }
                } catch (zzcc unused) {
                }
                zzfpVar.zzK(0);
                if (zzaka.zzd(zzfpVar)) {
                    zzakaVar = new zzaka();
                }
            }
            this.zzc = zzakaVar;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final int zzb(zzacv zzacvVar, zzadr zzadrVar) {
        zzek.zzb(this.zzb);
        if (this.zzc == null) {
            if (!zza(zzacvVar)) {
                throw zzcc.zza("Failed to determine bitstream type", null);
            }
            zzacvVar.zzj();
        }
        if (!this.zzd) {
            zzaea zzw = this.zzb.zzw(0, 1);
            this.zzb.zzD();
            this.zzc.zzh(this.zzb, zzw);
            this.zzd = true;
        }
        return this.zzc.zze(zzacvVar, zzadrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzc(zzacx zzacxVar) {
        this.zzb = zzacxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzd(long j10, long j11) {
        zzake zzakeVar = this.zzc;
        if (zzakeVar != null) {
            zzakeVar.zzj(j10, j11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zze(zzacv zzacvVar) {
        try {
            return zza(zzacvVar);
        } catch (zzcc unused) {
            return false;
        }
    }
}
