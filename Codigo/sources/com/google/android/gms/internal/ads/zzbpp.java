package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;

/* loaded from: classes2.dex */
public final class zzbpp extends ea.a {
    public static final Parcelable.Creator<zzbpp> CREATOR = new zzbpq();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final int zzd;

    public zzbpp(int i10, int i11, String str, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = str;
        this.zzd = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zzb;
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, i11);
        ea.c.G(parcel, 2, this.zzc, false);
        ea.c.u(parcel, 3, this.zzd);
        ea.c.u(parcel, AdError.NETWORK_ERROR_CODE, this.zza);
        ea.c.b(parcel, a10);
    }
}
