package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a1 extends ea.a {
    public static final Parcelable.Creator<a1> CREATOR = new b2();

    /* renamed from: a, reason: collision with root package name */
    public final String f8611a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8612b;

    public a1(String str, String str2) {
        this.f8611a = str;
        this.f8612b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f8611a;
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 1, str, false);
        ea.c.G(parcel, 2, this.f8612b, false);
        ea.c.b(parcel, a10);
    }
}
