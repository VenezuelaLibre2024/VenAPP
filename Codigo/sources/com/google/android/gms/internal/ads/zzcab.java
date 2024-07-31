package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.u4;

/* loaded from: classes2.dex */
public final class zzcab extends ea.a {
    public static final Parcelable.Creator<zzcab> CREATOR = new zzcac();
    public final u4 zza;
    public final String zzb;

    public zzcab(u4 u4Var, String str) {
        this.zza = u4Var;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        u4 u4Var = this.zza;
        int a10 = ea.c.a(parcel);
        ea.c.E(parcel, 2, u4Var, i10, false);
        ea.c.G(parcel, 3, this.zzb, false);
        ea.c.b(parcel, a10);
    }
}
