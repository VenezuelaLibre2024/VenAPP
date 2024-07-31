package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzbpd extends ea.a {
    public static final Parcelable.Creator<zzbpd> CREATOR = new zzbpe();
    public final String zza;
    public final boolean zzb;
    public final int zzc;
    public final String zzd;

    public zzbpd(String str, boolean z10, int i10, String str2) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = i10;
        this.zzd = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, str, false);
        ea.c.g(parcel, 2, this.zzb);
        ea.c.u(parcel, 3, this.zzc);
        ea.c.G(parcel, 4, this.zzd, false);
        ea.c.b(parcel, a10);
    }
}
