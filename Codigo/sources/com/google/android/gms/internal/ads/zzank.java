package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzank implements zzamy {
    private zzaea zzb;
    private boolean zzc;
    private int zze;
    private int zzf;
    private final zzfp zza = new zzfp(10);
    private long zzd = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zza(zzfp zzfpVar) {
        zzek.zzb(this.zzb);
        if (this.zzc) {
            int zzb = zzfpVar.zzb();
            int i10 = this.zzf;
            if (i10 < 10) {
                int min = Math.min(zzb, 10 - i10);
                System.arraycopy(zzfpVar.zzM(), zzfpVar.zzd(), this.zza.zzM(), this.zzf, min);
                if (this.zzf + min == 10) {
                    this.zza.zzK(0);
                    if (this.zza.zzm() != 73 || this.zza.zzm() != 68 || this.zza.zzm() != 51) {
                        zzff.zzf("Id3Reader", "Discarding invalid ID3 tag");
                        this.zzc = false;
                        return;
                    } else {
                        this.zza.zzL(3);
                        this.zze = this.zza.zzl() + 10;
                    }
                }
            }
            int min2 = Math.min(zzb, this.zze - this.zzf);
            this.zzb.zzr(zzfpVar, min2);
            this.zzf += min2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzb(zzacx zzacxVar, zzaok zzaokVar) {
        zzaokVar.zzc();
        zzaea zzw = zzacxVar.zzw(zzaokVar.zza(), 5);
        this.zzb = zzw;
        zzak zzakVar = new zzak();
        zzakVar.zzK(zzaokVar.zzb());
        zzakVar.zzW("application/id3");
        zzw.zzl(zzakVar.zzac());
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzc(boolean z10) {
        int i10;
        zzek.zzb(this.zzb);
        if (this.zzc && (i10 = this.zze) != 0 && this.zzf == i10) {
            zzek.zzf(this.zzd != -9223372036854775807L);
            this.zzb.zzt(this.zzd, 1, this.zze, 0, null);
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zzd(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzd = j10;
        this.zze = 0;
        this.zzf = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzamy
    public final void zze() {
        this.zzc = false;
        this.zzd = -9223372036854775807L;
    }
}
