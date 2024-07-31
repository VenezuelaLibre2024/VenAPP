package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import ea.a;
import ea.c;

/* loaded from: classes2.dex */
public final class zzvh extends a {
    public static final Parcelable.Creator<zzvh> CREATOR = new zzwa();
    private final String zza;
    private final String zzb;

    public zzvh(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.G(parcel, 1, this.zza, false);
        c.G(parcel, 2, this.zzb, false);
        c.b(parcel, a10);
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
