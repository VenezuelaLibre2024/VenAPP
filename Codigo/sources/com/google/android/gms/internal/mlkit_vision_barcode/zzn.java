package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import ea.a;
import ea.c;

/* loaded from: classes2.dex */
public final class zzn extends a {
    public static final Parcelable.Creator<zzn> CREATOR = new zzaa();
    public int zza;
    public String zzb;
    public String zzc;
    public String zzd;

    public zzn() {
    }

    public zzn(int i10, String str, String str2, String str3) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 2, this.zza);
        c.G(parcel, 3, this.zzb, false);
        c.G(parcel, 4, this.zzc, false);
        c.G(parcel, 5, this.zzd, false);
        c.b(parcel, a10);
    }
}
