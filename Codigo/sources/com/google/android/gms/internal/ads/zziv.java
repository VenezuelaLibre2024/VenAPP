package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zziv implements zzlc {
    private final zzyx zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private int zzh;
    private boolean zzi;

    public zziv() {
        zzyx zzyxVar = new zzyx(true, 65536);
        zzj(2500, 0, "bufferForPlaybackMs", "0");
        zzj(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzj(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        zzj(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzj(50000, 50000, "maxBufferMs", "minBufferMs");
        zzj(0, 0, "backBufferDurationMs", "0");
        this.zzb = zzyxVar;
        this.zzc = zzfy.zzq(50000L);
        this.zzd = zzfy.zzq(50000L);
        this.zze = zzfy.zzq(2500L);
        this.zzf = zzfy.zzq(5000L);
        this.zzh = 13107200;
        this.zzg = zzfy.zzq(0L);
    }

    private static void zzj(int i10, int i11, String str, String str2) {
        zzek.zze(i10 >= i11, str + " cannot be less than " + str2);
    }

    private final void zzk(boolean z10) {
        this.zzh = 13107200;
        this.zzi = false;
        if (z10) {
            this.zzb.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final long zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final void zzb() {
        zzk(false);
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final void zzc() {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final void zzd() {
        zzk(true);
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final void zze(zzcx zzcxVar, zzur zzurVar, zzmf[] zzmfVarArr, zzws zzwsVar, zzyi[] zzyiVarArr) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = zzmfVarArr.length;
            if (i10 >= 2) {
                int max = Math.max(13107200, i11);
                this.zzh = max;
                this.zzb.zzf(max);
                return;
            } else {
                if (zzyiVarArr[i10] != null) {
                    i11 += zzmfVarArr[i10].zzbj() != 1 ? 131072000 : 13107200;
                }
                i10++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final boolean zzg(long j10, long j11, float f10) {
        int zza = this.zzb.zza();
        int i10 = this.zzh;
        long j12 = this.zzc;
        if (f10 > 1.0f) {
            j12 = Math.min(zzfy.zzo(j12, f10), this.zzd);
        }
        if (j11 < Math.max(j12, 500000L)) {
            boolean z10 = zza < i10;
            this.zzi = z10;
            if (!z10 && j11 < 500000) {
                zzff.zzf("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.zzd || zza >= i10) {
            this.zzi = false;
        }
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final boolean zzh(zzcx zzcxVar, zzur zzurVar, long j10, float f10, boolean z10, long j11) {
        long zzp = zzfy.zzp(j10, f10);
        long j12 = z10 ? this.zzf : this.zze;
        if (j11 != -9223372036854775807L) {
            j12 = Math.min(j11 / 2, j12);
        }
        return j12 <= 0 || zzp >= j12 || this.zzb.zza() >= this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzlc
    public final zzyx zzi() {
        return this.zzb;
    }
}
