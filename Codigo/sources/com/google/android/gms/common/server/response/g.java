package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;

/* loaded from: classes.dex */
public final class g extends ea.a {
    public static final Parcelable.Creator<g> CREATOR = new e();

    /* renamed from: a, reason: collision with root package name */
    final int f9700a;

    /* renamed from: b, reason: collision with root package name */
    final String f9701b;

    /* renamed from: c, reason: collision with root package name */
    final a.C0150a f9702c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(int i10, String str, a.C0150a c0150a) {
        this.f9700a = i10;
        this.f9701b = str;
        this.f9702c = c0150a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(String str, a.C0150a c0150a) {
        this.f9700a = 1;
        this.f9701b = str;
        this.f9702c = c0150a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f9700a);
        ea.c.G(parcel, 2, this.f9701b, false);
        ea.c.E(parcel, 3, this.f9702c, i10, false);
        ea.c.b(parcel, a10);
    }
}
