package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import ea.a;
import ea.c;
import ua.r0;

/* loaded from: classes2.dex */
public final class LatLng extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new r0();

    /* renamed from: a */
    public final double f9913a;

    /* renamed from: b */
    public final double f9914b;

    public LatLng(double d10, double d11) {
        this.f9914b = (d11 < -180.0d || d11 >= 180.0d) ? ((((d11 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d : d11;
        this.f9913a = Math.max(-90.0d, Math.min(90.0d, d10));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f9913a) == Double.doubleToLongBits(latLng.f9913a) && Double.doubleToLongBits(this.f9914b) == Double.doubleToLongBits(latLng.f9914b);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f9913a);
        long j10 = doubleToLongBits ^ (doubleToLongBits >>> 32);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f9914b);
        return ((((int) j10) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return "lat/lng: (" + this.f9913a + "," + this.f9914b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        double d10 = this.f9913a;
        int a10 = c.a(parcel);
        c.n(parcel, 2, d10);
        c.n(parcel, 3, this.f9914b);
        c.b(parcel, a10);
    }
}
