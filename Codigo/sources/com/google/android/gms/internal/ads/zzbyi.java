package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbyi extends ea.a {
    public static final Parcelable.Creator<zzbyi> CREATOR = new zzbyj();
    public final ApplicationInfo zza;
    public final String zzb;
    public final PackageInfo zzc;
    public final String zzd;
    public final int zze;
    public final String zzf;
    public final List zzg;
    public final boolean zzh;
    public final boolean zzi;

    public zzbyi(ApplicationInfo applicationInfo, String str, PackageInfo packageInfo, String str2, int i10, String str3, List list, boolean z10, boolean z11) {
        this.zzb = str;
        this.zza = applicationInfo;
        this.zzc = packageInfo;
        this.zzd = str2;
        this.zze = i10;
        this.zzf = str3;
        this.zzg = list;
        this.zzh = z10;
        this.zzi = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        ApplicationInfo applicationInfo = this.zza;
        int a10 = ea.c.a(parcel);
        ea.c.E(parcel, 1, applicationInfo, i10, false);
        ea.c.G(parcel, 2, this.zzb, false);
        ea.c.E(parcel, 3, this.zzc, i10, false);
        ea.c.G(parcel, 4, this.zzd, false);
        ea.c.u(parcel, 5, this.zze);
        ea.c.G(parcel, 6, this.zzf, false);
        ea.c.I(parcel, 7, this.zzg, false);
        ea.c.g(parcel, 8, this.zzh);
        ea.c.g(parcel, 9, this.zzi);
        ea.c.b(parcel, a10);
    }
}
