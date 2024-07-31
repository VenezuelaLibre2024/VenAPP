package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c3 extends ea.a {
    public static final Parcelable.Creator<c3> CREATOR = new d4();

    /* renamed from: a */
    public final int f8626a;

    /* renamed from: b */
    public final String f8627b;

    /* renamed from: c */
    public final String f8628c;

    /* renamed from: d */
    public c3 f8629d;

    /* renamed from: e */
    public IBinder f8630e;

    public c3(int i10, String str, String str2, c3 c3Var, IBinder iBinder) {
        this.f8626a = i10;
        this.f8627b = str;
        this.f8628c = str2;
        this.f8629d = c3Var;
        this.f8630e = iBinder;
    }

    public final x8.b u1() {
        x8.b bVar;
        c3 c3Var = this.f8629d;
        if (c3Var == null) {
            bVar = null;
        } else {
            String str = c3Var.f8628c;
            bVar = new x8.b(c3Var.f8626a, c3Var.f8627b, str);
        }
        return new x8.b(this.f8626a, this.f8627b, this.f8628c, bVar);
    }

    public final x8.o v1() {
        x8.b bVar;
        c3 c3Var = this.f8629d;
        p2 p2Var = null;
        if (c3Var == null) {
            bVar = null;
        } else {
            bVar = new x8.b(c3Var.f8626a, c3Var.f8627b, c3Var.f8628c);
        }
        int i10 = this.f8626a;
        String str = this.f8627b;
        String str2 = this.f8628c;
        IBinder iBinder = this.f8630e;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            p2Var = queryLocalInterface instanceof p2 ? (p2) queryLocalInterface : new n2(iBinder);
        }
        return new x8.o(i10, str, str2, bVar, x8.z.f(p2Var));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f8626a;
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, i11);
        ea.c.G(parcel, 2, this.f8627b, false);
        ea.c.G(parcel, 3, this.f8628c, false);
        ea.c.E(parcel, 4, this.f8629d, i10, false);
        ea.c.t(parcel, 5, this.f8630e, false);
        ea.c.b(parcel, a10);
    }
}
