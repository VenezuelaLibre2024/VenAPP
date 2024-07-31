package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import ea.a;
import ea.c;

/* loaded from: classes2.dex */
public final class zzap extends a {
    public static final Parcelable.Creator<zzap> CREATOR = new zzbe();
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;
    private final int zzf;
    private final boolean zzg;
    private final String zzh;

    public zzap(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = i14;
        this.zzf = i15;
        this.zzg = z10;
        this.zzh = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, this.zza);
        c.u(parcel, 2, this.zzb);
        c.u(parcel, 3, this.zzc);
        c.u(parcel, 4, this.zzd);
        c.u(parcel, 5, this.zze);
        c.u(parcel, 6, this.zzf);
        c.g(parcel, 7, this.zzg);
        c.G(parcel, 8, this.zzh, false);
        c.b(parcel, a10);
    }
}
