package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import ea.a;
import ea.c;

/* loaded from: classes2.dex */
public final class zzar extends a {
    public static final Parcelable.Creator<zzar> CREATOR = new zzbg();
    private final zzav zza;
    private final String zzb;
    private final String zzc;
    private final zzaw[] zzd;
    private final zzat[] zze;
    private final String[] zzf;
    private final zzao[] zzg;

    public zzar(zzav zzavVar, String str, String str2, zzaw[] zzawVarArr, zzat[] zzatVarArr, String[] strArr, zzao[] zzaoVarArr) {
        this.zza = zzavVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzawVarArr;
        this.zze = zzatVarArr;
        this.zzf = strArr;
        this.zzg = zzaoVarArr;
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
}
