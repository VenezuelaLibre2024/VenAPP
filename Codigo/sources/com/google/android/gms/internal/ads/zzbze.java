package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbze extends ea.a {
    public static final Parcelable.Creator<zzbze> CREATOR = new zzbzf();
    public final Bundle zza;
    public final zzcei zzb;
    public final ApplicationInfo zzc;
    public final String zzd;
    public final List zze;
    public final PackageInfo zzf;
    public final String zzg;
    public final String zzh;
    public zzfjc zzi;
    public String zzj;
    public final boolean zzk;
    public final boolean zzl;

    public zzbze(Bundle bundle, zzcei zzceiVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, zzfjc zzfjcVar, String str4, boolean z10, boolean z11) {
        this.zza = bundle;
        this.zzb = zzceiVar;
        this.zzd = str;
        this.zzc = applicationInfo;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzfjcVar;
        this.zzj = str4;
        this.zzk = z10;
        this.zzl = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Bundle bundle = this.zza;
        int a10 = ea.c.a(parcel);
        ea.c.j(parcel, 1, bundle, false);
        ea.c.E(parcel, 2, this.zzb, i10, false);
        ea.c.E(parcel, 3, this.zzc, i10, false);
        ea.c.G(parcel, 4, this.zzd, false);
        ea.c.I(parcel, 5, this.zze, false);
        ea.c.E(parcel, 6, this.zzf, i10, false);
        ea.c.G(parcel, 7, this.zzg, false);
        ea.c.G(parcel, 9, this.zzh, false);
        ea.c.E(parcel, 10, this.zzi, i10, false);
        ea.c.G(parcel, 11, this.zzj, false);
        ea.c.g(parcel, 12, this.zzk);
        ea.c.g(parcel, 13, this.zzl);
        ea.c.b(parcel, a10);
    }
}
