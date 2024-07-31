package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class k4 extends ea.a {
    public static final Parcelable.Creator<k4> CREATOR = new l4();

    /* renamed from: a, reason: collision with root package name */
    public final String f8686a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k4(String str) {
        this.f8686a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f8686a;
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 15, str, false);
        ea.c.b(parcel, a10);
    }
}
