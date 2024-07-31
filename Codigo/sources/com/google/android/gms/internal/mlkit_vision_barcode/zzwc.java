package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import ea.a;
import ea.c;

/* loaded from: classes2.dex */
public final class zzwc extends a {
    public static final Parcelable.Creator<zzwc> CREATOR = new zzwd();
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;

    public zzwc(int i10, int i11, int i12, int i13, long j10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, this.zza);
        c.u(parcel, 2, this.zzb);
        c.u(parcel, 3, this.zzc);
        c.u(parcel, 4, this.zzd);
        c.z(parcel, 5, this.zze);
        c.b(parcel, a10);
    }
}
