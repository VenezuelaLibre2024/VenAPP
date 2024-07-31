package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.z4;

/* loaded from: classes2.dex */
public final class zzccx extends ea.a {
    public static final Parcelable.Creator<zzccx> CREATOR = new zzccy();
    public final String zza;
    public final String zzb;

    @Deprecated
    public final z4 zzc;
    public final u4 zzd;

    public zzccx(String str, String str2, z4 z4Var, u4 u4Var) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = z4Var;
        this.zzd = u4Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, str, false);
        ea.c.G(parcel, 2, this.zzb, false);
        ea.c.E(parcel, 3, this.zzc, i10, false);
        ea.c.E(parcel, 4, this.zzd, i10, false);
        ea.c.b(parcel, a10);
    }
}
