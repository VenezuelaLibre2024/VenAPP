package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzfsi extends ea.a {
    public static final Parcelable.Creator<zzfsi> CREATOR = new zzfsj();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfsi(int i10, int i11, int i12, String str, String str2) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = str;
        this.zzd = str2;
        this.zze = i12;
    }

    public zzfsi(int i10, int i11, String str, String str2) {
        this(1, 1, i11 - 1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, i11);
        ea.c.u(parcel, 2, this.zzb);
        ea.c.G(parcel, 3, this.zzc, false);
        ea.c.G(parcel, 4, this.zzd, false);
        ea.c.u(parcel, 5, this.zze);
        ea.c.b(parcel, a10);
    }
}
