package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.internal.ads.zzfij;
import com.google.android.gms.internal.ads.zzfxt;

/* loaded from: classes.dex */
public final class d0 extends ea.a {
    public static final Parcelable.Creator<d0> CREATOR = new e0();

    /* renamed from: a, reason: collision with root package name */
    public final String f8954a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8955b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(String str, int i10) {
        this.f8954a = str == null ? "" : str;
        this.f8955b = i10;
    }

    public static d0 v1(Throwable th2) {
        c3 zza = zzfij.zza(th2);
        return new d0(zzfxt.zzd(th2.getMessage()) ? zza.f8627b : th2.getMessage(), zza.f8626a);
    }

    public final c0 u1() {
        return new c0(this.f8954a, this.f8955b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f8954a;
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, str, false);
        ea.c.u(parcel, 2, this.f8955b);
        ea.c.b(parcel, a10);
    }
}
