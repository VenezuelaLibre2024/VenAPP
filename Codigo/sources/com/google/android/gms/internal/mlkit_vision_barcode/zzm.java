package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import ea.a;
import ea.c;

/* loaded from: classes2.dex */
public final class zzm extends a {
    public static final Parcelable.Creator<zzm> CREATOR = new zzz();
    public String zza;
    public String zzb;
    public String zzc;
    public String zzd;
    public String zze;
    public String zzf;
    public String zzg;
    public String zzh;
    public String zzi;
    public String zzj;
    public String zzk;
    public String zzl;
    public String zzm;
    public String zzn;

    public zzm() {
    }

    public zzm(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
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
        c.G(parcel, 2, this.zza, false);
        c.G(parcel, 3, this.zzb, false);
        c.G(parcel, 4, this.zzc, false);
        c.G(parcel, 5, this.zzd, false);
        c.G(parcel, 6, this.zze, false);
        c.G(parcel, 7, this.zzf, false);
        c.G(parcel, 8, this.zzg, false);
        c.G(parcel, 9, this.zzh, false);
        c.G(parcel, 10, this.zzi, false);
        c.G(parcel, 11, this.zzj, false);
        c.G(parcel, 12, this.zzk, false);
        c.G(parcel, 13, this.zzl, false);
        c.G(parcel, 14, this.zzm, false);
        c.G(parcel, 15, this.zzn, false);
        c.b(parcel, a10);
    }
}
