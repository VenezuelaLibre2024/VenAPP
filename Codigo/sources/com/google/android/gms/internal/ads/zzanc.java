package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzanc {
    private final zzaea zza;
    private boolean zzb;
    private boolean zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;

    public zzanc(zzaea zzaeaVar) {
        this.zza = zzaeaVar;
    }

    public final void zza(byte[] bArr, int i10, int i11) {
        if (this.zzc) {
            int i12 = this.zzf;
            int i13 = (i10 + 1) - i12;
            if (i13 >= i11) {
                this.zzf = i12 + (i11 - i10);
            } else {
                this.zzd = ((bArr[i13] & 192) >> 6) == 0;
                this.zzc = false;
            }
        }
    }

    public final void zzb(long j10, int i10, boolean z10) {
        zzek.zzf(this.zzh != -9223372036854775807L);
        if (this.zze == 182 && z10 && this.zzb) {
            this.zza.zzt(this.zzh, this.zzd ? 1 : 0, (int) (j10 - this.zzg), i10, null);
        }
        if (this.zze != 179) {
            this.zzg = j10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzc(int r5, long r6) {
        /*
            r4 = this;
            r4.zze = r5
            r0 = 0
            r4.zzd = r0
            r1 = 1
            r2 = 182(0xb6, float:2.55E-43)
            if (r5 == r2) goto L12
            r3 = 179(0xb3, float:2.51E-43)
            if (r5 != r3) goto L10
            r5 = r3
            goto L12
        L10:
            r3 = r0
            goto L13
        L12:
            r3 = r1
        L13:
            r4.zzb = r3
            if (r5 != r2) goto L18
            goto L19
        L18:
            r1 = r0
        L19:
            r4.zzc = r1
            r4.zzf = r0
            r4.zzh = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanc.zzc(int, long):void");
    }

    public final void zzd() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = false;
        this.zze = -1;
    }
}