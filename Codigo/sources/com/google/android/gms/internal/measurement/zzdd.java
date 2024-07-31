package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ea.a;
import ea.c;

/* loaded from: classes2.dex */
public final class zzdd extends a {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzdg();
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final Bundle zzg;
    public final String zzh;

    public zzdd(long j10, long j11, boolean z10, String str, String str2, String str3, Bundle bundle, String str4) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = z10;
        this.zzd = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = bundle;
        this.zzh = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.z(parcel, 1, this.zza);
        c.z(parcel, 2, this.zzb);
        c.g(parcel, 3, this.zzc);
        c.G(parcel, 4, this.zzd, false);
        c.G(parcel, 5, this.zze, false);
        c.G(parcel, 6, this.zzf, false);
        c.j(parcel, 7, this.zzg, false);
        c.G(parcel, 8, this.zzh, false);
        c.b(parcel, a10);
    }
}
