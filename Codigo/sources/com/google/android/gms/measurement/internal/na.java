package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class na extends ea.a {
    public static final Parcelable.Creator<na> CREATOR = new qa();

    /* renamed from: a, reason: collision with root package name */
    public final String f10447a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10448b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10449c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public na(String str, long j10, int i10) {
        this.f10447a = str;
        this.f10448b = j10;
        this.f10449c = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, this.f10447a, false);
        ea.c.z(parcel, 2, this.f10448b);
        ea.c.u(parcel, 3, this.f10449c);
        ea.c.b(parcel, a10);
    }
}
