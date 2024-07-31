package ua;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class a0 extends ea.a {
    public static final Parcelable.Creator<a0> CREATOR = new i0();

    /* renamed from: a */
    public final int f27485a;

    /* renamed from: b */
    public final int f27486b;

    /* renamed from: c */
    public final byte[] f27487c;

    public a0(int i10, int i11, byte[] bArr) {
        this.f27485a = i10;
        this.f27486b = i11;
        this.f27487c = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f27485a;
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 2, i11);
        ea.c.u(parcel, 3, this.f27486b);
        ea.c.l(parcel, 4, this.f27487c, false);
        ea.c.b(parcel, a10);
    }
}
