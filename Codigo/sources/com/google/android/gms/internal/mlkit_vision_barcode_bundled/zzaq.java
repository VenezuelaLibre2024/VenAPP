package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import ea.a;
import ea.c;

/* loaded from: classes2.dex */
public final class zzaq extends a {
    public static final Parcelable.Creator<zzaq> CREATOR = new zzbf();
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final zzap zzf;
    private final zzap zzg;

    public zzaq(String str, String str2, String str3, String str4, String str5, zzap zzapVar, zzap zzapVar2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = zzapVar;
        this.zzg = zzapVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.G(parcel, 1, this.zza, false);
        c.G(parcel, 2, this.zzb, false);
        c.G(parcel, 3, this.zzc, false);
        c.G(parcel, 4, this.zzd, false);
        c.G(parcel, 5, this.zze, false);
        c.E(parcel, 6, this.zzf, i10, false);
        c.E(parcel, 7, this.zzg, i10, false);
        c.b(parcel, a10);
    }
}
