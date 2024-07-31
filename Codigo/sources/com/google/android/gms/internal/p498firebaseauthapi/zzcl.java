package com.google.android.gms.internal.p498firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzcl<P> {
    private final P zza;
    private final P zzb;
    private final byte[] zzc;
    private final zzuz zzd;
    private final zzvs zze;
    private final int zzf;
    private final String zzg;
    private final zzbt zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcl(P p10, P p11, byte[] bArr, zzuz zzuzVar, zzvs zzvsVar, int i10, String str, zzbt zzbtVar) {
        this.zza = p10;
        this.zzb = p11;
        this.zzc = Arrays.copyOf(bArr, bArr.length);
        this.zzd = zzuzVar;
        this.zze = zzvsVar;
        this.zzf = i10;
        this.zzg = str;
        this.zzh = zzbtVar;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzbt zzb() {
        return this.zzh;
    }

    public final zzuz zzc() {
        return this.zzd;
    }

    public final zzvs zzd() {
        return this.zze;
    }

    public final P zze() {
        return this.zza;
    }

    public final P zzf() {
        return this.zzb;
    }

    public final String zzg() {
        return this.zzg;
    }

    public final byte[] zzh() {
        byte[] bArr = this.zzc;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
