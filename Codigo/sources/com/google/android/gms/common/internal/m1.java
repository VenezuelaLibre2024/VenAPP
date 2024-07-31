package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m1 extends ea.a {
    public static final Parcelable.Creator<m1> CREATOR = new n1();

    /* renamed from: a, reason: collision with root package name */
    Bundle f9602a;

    /* renamed from: b, reason: collision with root package name */
    ca.d[] f9603b;

    /* renamed from: c, reason: collision with root package name */
    int f9604c;

    /* renamed from: d, reason: collision with root package name */
    f f9605d;

    public m1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m1(Bundle bundle, ca.d[] dVarArr, int i10, f fVar) {
        this.f9602a = bundle;
        this.f9603b = dVarArr;
        this.f9604c = i10;
        this.f9605d = fVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.j(parcel, 1, this.f9602a, false);
        ea.c.J(parcel, 2, this.f9603b, i10, false);
        ea.c.u(parcel, 3, this.f9604c);
        ea.c.E(parcel, 4, this.f9605d, i10, false);
        ea.c.b(parcel, a10);
    }
}
