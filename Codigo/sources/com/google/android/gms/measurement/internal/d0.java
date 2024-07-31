package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class d0 extends ea.a {
    public static final Parcelable.Creator<d0> CREATOR = new wa.e();

    /* renamed from: a, reason: collision with root package name */
    public final String f10054a;

    /* renamed from: b, reason: collision with root package name */
    public final z f10055b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10056c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10057d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(d0 d0Var, long j10) {
        com.google.android.gms.common.internal.s.j(d0Var);
        this.f10054a = d0Var.f10054a;
        this.f10055b = d0Var.f10055b;
        this.f10056c = d0Var.f10056c;
        this.f10057d = j10;
    }

    public d0(String str, z zVar, String str2, long j10) {
        this.f10054a = str;
        this.f10055b = zVar;
        this.f10056c = str2;
        this.f10057d = j10;
    }

    public final String toString() {
        return "origin=" + this.f10056c + ",name=" + this.f10054a + ",params=" + String.valueOf(this.f10055b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.G(parcel, 2, this.f10054a, false);
        ea.c.E(parcel, 3, this.f10055b, i10, false);
        ea.c.G(parcel, 4, this.f10056c, false);
        ea.c.z(parcel, 5, this.f10057d);
        ea.c.b(parcel, a10);
    }
}
