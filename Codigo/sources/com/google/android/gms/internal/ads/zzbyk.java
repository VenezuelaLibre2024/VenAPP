package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbyk extends ea.a {
    public static final Parcelable.Creator<zzbyk> CREATOR = new zzbyl();
    public final boolean zza;
    public final List zzb;

    public zzbyk() {
        this(false, Collections.emptyList());
    }

    public zzbyk(boolean z10, List list) {
        this.zza = z10;
        this.zzb = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.zza;
        int a10 = ea.c.a(parcel);
        ea.c.g(parcel, 2, z10);
        ea.c.I(parcel, 3, this.zzb, false);
        ea.c.b(parcel, a10);
    }
}
