package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzcbb extends ea.a {
    public static final Parcelable.Creator<zzcbb> CREATOR = new zzcbc();
    public final String zza;
    public final String zzb;

    public zzcbb(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public zzcbb(n9.e eVar) {
        this(eVar.b(), eVar.a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, str, false);
        ea.c.G(parcel, 2, this.zzb, false);
        ea.c.b(parcel, a10);
    }
}
