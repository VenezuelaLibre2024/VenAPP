package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzqa extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzam zzc;

    public zzqa(int i10, zzam zzamVar, boolean z10) {
        super("AudioTrack write failed: " + i10);
        this.zzb = z10;
        this.zza = i10;
        this.zzc = zzamVar;
    }
}
