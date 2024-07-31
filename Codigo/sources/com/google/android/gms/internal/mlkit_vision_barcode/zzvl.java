package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import ea.a;
import ea.c;

/* loaded from: classes2.dex */
public final class zzvl extends a {
    public static final Parcelable.Creator<zzvl> CREATOR = new zzvm();
    private final int zza;
    private final boolean zzb;

    public zzvl(int i10, boolean z10) {
        this.zza = i10;
        this.zzb = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, this.zza);
        c.g(parcel, 2, this.zzb);
        c.b(parcel, a10);
    }
}
