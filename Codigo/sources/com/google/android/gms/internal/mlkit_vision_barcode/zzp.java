package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import ea.a;
import ea.c;

/* loaded from: classes2.dex */
public final class zzp extends a {
    public static final Parcelable.Creator<zzp> CREATOR = new zzac();
    public String zza;
    public String zzb;
    public String zzc;
    public String zzd;
    public String zze;
    public String zzf;
    public String zzg;

    public zzp() {
    }

    public zzp(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
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
        c.b(parcel, a10);
    }
}
