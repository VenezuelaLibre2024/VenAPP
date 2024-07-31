package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzboq extends ea.a {
    public static final Parcelable.Creator<zzboq> CREATOR = new zzbor();
    public final String zza;
    public final String[] zzb;
    public final String[] zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzboq(String str, String[] strArr, String[] strArr2) {
        this.zza = str;
        this.zzb = strArr;
        this.zzc = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, str, false);
        ea.c.H(parcel, 2, this.zzb, false);
        ea.c.H(parcel, 3, this.zzc, false);
        ea.c.b(parcel, a10);
    }
}
