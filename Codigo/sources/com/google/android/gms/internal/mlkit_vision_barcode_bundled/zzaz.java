package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import ea.a;
import ea.c;

/* loaded from: classes2.dex */
public final class zzaz extends a {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzbt();
    private final String zza;
    private final String zzb;
    private final int zzc;

    public zzaz(String str, String str2, int i10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.G(parcel, 1, this.zza, false);
        c.G(parcel, 2, this.zzb, false);
        c.u(parcel, 3, this.zzc);
        c.b(parcel, a10);
    }
}
