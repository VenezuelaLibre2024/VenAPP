package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzfrz extends ea.a {
    public static final Parcelable.Creator<zzfrz> CREATOR = new zzfsa();
    public final int zza;
    public final String zzb;
    public final String zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfrz(int i10, String str, String str2) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
    }

    public zzfrz(String str, String str2) {
        this(1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, i11);
        ea.c.G(parcel, 2, this.zzb, false);
        ea.c.G(parcel, 3, this.zzc, false);
        ea.c.b(parcel, a10);
    }
}
