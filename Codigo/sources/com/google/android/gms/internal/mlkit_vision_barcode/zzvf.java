package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import ea.a;
import ea.c;

/* loaded from: classes2.dex */
public final class zzvf extends a {
    public static final Parcelable.Creator<zzvf> CREATOR = new zzvy();
    private final int zza;
    private final String zzb;

    public zzvf(int i10, String str) {
        this.zza = i10;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, this.zza);
        c.G(parcel, 2, this.zzb, false);
        c.b(parcel, a10);
    }

    public final int zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
