package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzle {
    private long zza;
    private float zzb;
    private long zzc;

    public zzle() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    public /* synthetic */ zzle(zzlg zzlgVar, zzld zzldVar) {
        this.zza = zzlgVar.zza;
        this.zzb = zzlgVar.zzb;
        this.zzc = zzlgVar.zzc;
    }

    public final zzle zzd(long j10) {
        boolean z10 = true;
        if (j10 < 0) {
            if (j10 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                z10 = false;
            }
        }
        zzek.zzd(z10);
        this.zzc = j10;
        return this;
    }

    public final zzle zze(long j10) {
        this.zza = j10;
        return this;
    }

    public final zzle zzf(float f10) {
        boolean z10 = true;
        if (f10 <= 0.0f && f10 != -3.4028235E38f) {
            z10 = false;
        }
        zzek.zzd(z10);
        this.zzb = f10;
        return this;
    }

    public final zzlg zzg() {
        return new zzlg(this, null);
    }
}
