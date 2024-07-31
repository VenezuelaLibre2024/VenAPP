package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzbym extends ea.a {
    public static final Parcelable.Creator<zzbym> CREATOR = new zzbyn();
    public final String zza;
    public final int zzb;
    public final Bundle zzc;
    public final byte[] zzd;
    public final boolean zze;
    public final String zzf;
    public final String zzg;

    public zzbym(String str, int i10, Bundle bundle, byte[] bArr, boolean z10, String str2, String str3) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = bundle;
        this.zzd = bArr;
        this.zze = z10;
        this.zzf = str2;
        this.zzg = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, str, false);
        ea.c.u(parcel, 2, this.zzb);
        ea.c.j(parcel, 3, this.zzc, false);
        ea.c.l(parcel, 4, this.zzd, false);
        ea.c.g(parcel, 5, this.zze);
        ea.c.G(parcel, 6, this.zzf, false);
        ea.c.G(parcel, 7, this.zzg, false);
        ea.c.b(parcel, a10);
    }
}
