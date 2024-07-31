package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzfrw extends ea.a {
    public static final Parcelable.Creator<zzfrw> CREATOR = new zzfrx();
    public final int zza;
    public final byte[] zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfrw(int i10, byte[] bArr) {
        this.zza = i10;
        this.zzb = bArr;
    }

    public zzfrw(byte[] bArr) {
        this(1, bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, i11);
        ea.c.l(parcel, 2, this.zzb, false);
        ea.c.b(parcel, a10);
    }
}
