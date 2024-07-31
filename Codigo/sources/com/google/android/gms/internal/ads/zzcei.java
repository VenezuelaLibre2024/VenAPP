package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzcei extends ea.a {
    public static final Parcelable.Creator<zzcei> CREATOR = new zzcej();
    public String zza;
    public int zzb;
    public int zzc;
    public boolean zzd;
    public boolean zze;

    public zzcei(int i10, int i11, boolean z10, boolean z11) {
        this(240304000, i11, true, false, z11);
    }

    public zzcei(int i10, int i11, boolean z10, boolean z11, boolean z12) {
        this("afma-sdk-a-v" + i10 + "." + i11 + "." + (z10 ? "0" : "1"), i10, i11, z10, z12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcei(String str, int i10, int i11, boolean z10, boolean z11) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = z10;
        this.zze = z11;
    }

    public static zzcei zza() {
        return new zzcei(ca.k.f6983a, ca.k.f6983a, true, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 2, this.zza, false);
        ea.c.u(parcel, 3, this.zzb);
        ea.c.u(parcel, 4, this.zzc);
        ea.c.g(parcel, 5, this.zzd);
        ea.c.g(parcel, 6, this.zze);
        ea.c.b(parcel, a10);
    }
}
