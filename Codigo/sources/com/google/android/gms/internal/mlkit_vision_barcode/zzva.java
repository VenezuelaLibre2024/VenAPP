package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import ea.a;
import ea.c;

/* loaded from: classes2.dex */
public final class zzva extends a {
    public static final Parcelable.Creator<zzva> CREATOR = new zzvp();
    private final zzve zza;
    private final String zzb;
    private final String zzc;
    private final zzvf[] zzd;
    private final zzvc[] zze;
    private final String[] zzf;
    private final zzux[] zzg;

    public zzva(zzve zzveVar, String str, String str2, zzvf[] zzvfVarArr, zzvc[] zzvcVarArr, String[] strArr, zzux[] zzuxVarArr) {
        this.zza = zzveVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzvfVarArr;
        this.zze = zzvcVarArr;
        this.zzf = strArr;
        this.zzg = zzuxVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.E(parcel, 1, this.zza, i10, false);
        c.G(parcel, 2, this.zzb, false);
        c.G(parcel, 3, this.zzc, false);
        c.J(parcel, 4, this.zzd, i10, false);
        c.J(parcel, 5, this.zze, i10, false);
        c.H(parcel, 6, this.zzf, false);
        c.J(parcel, 7, this.zzg, i10, false);
        c.b(parcel, a10);
    }

    public final zzve zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final zzux[] zzd() {
        return this.zzg;
    }

    public final zzvc[] zze() {
        return this.zze;
    }

    public final zzvf[] zzf() {
        return this.zzd;
    }

    public final String[] zzg() {
        return this.zzf;
    }
}
