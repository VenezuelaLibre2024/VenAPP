package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import ea.a;
import ea.c;

/* loaded from: classes2.dex */
public final class zzas extends a {
    public static final Parcelable.Creator<zzas> CREATOR = new zzbh();
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private final String zzi;
    private final String zzj;
    private final String zzk;
    private final String zzl;
    private final String zzm;
    private final String zzn;

    public zzas(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = str9;
        this.zzj = str10;
        this.zzk = str11;
        this.zzl = str12;
        this.zzm = str13;
        this.zzn = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.G(parcel, 1, this.zza, false);
        c.G(parcel, 2, this.zzb, false);
        c.G(parcel, 3, this.zzc, false);
        c.G(parcel, 4, this.zzd, false);
        c.G(parcel, 5, this.zze, false);
        c.G(parcel, 6, this.zzf, false);
        c.G(parcel, 7, this.zzg, false);
        c.G(parcel, 8, this.zzh, false);
        c.G(parcel, 9, this.zzi, false);
        c.G(parcel, 10, this.zzj, false);
        c.G(parcel, 11, this.zzk, false);
        c.G(parcel, 12, this.zzl, false);
        c.G(parcel, 13, this.zzm, false);
        c.G(parcel, 14, this.zzn, false);
        c.b(parcel, a10);
    }
}
