package ua;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class z extends ea.a {
    public static final Parcelable.Creator<z> CREATOR = new h0();

    /* renamed from: a, reason: collision with root package name */
    private final y f27586a;

    /* renamed from: b, reason: collision with root package name */
    private final double f27587b;

    public z(y yVar, double d10) {
        if (d10 <= 0.0d) {
            throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
        }
        this.f27586a = yVar;
        this.f27587b = d10;
    }

    public double u1() {
        return this.f27587b;
    }

    public y v1() {
        return this.f27586a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.E(parcel, 2, v1(), i10, false);
        ea.c.n(parcel, 3, u1());
        ea.c.b(parcel, a10);
    }
}
