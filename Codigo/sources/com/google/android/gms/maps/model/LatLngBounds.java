package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s;
import ea.a;
import ea.c;
import ua.q0;

/* loaded from: classes2.dex */
public final class LatLngBounds extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new q0();

    /* renamed from: a, reason: collision with root package name */
    public final LatLng f9915a;

    /* renamed from: b, reason: collision with root package name */
    public final LatLng f9916b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        s.k(latLng, "southwest must not be null.");
        s.k(latLng2, "northeast must not be null.");
        double d10 = latLng2.f9913a;
        double d11 = latLng.f9913a;
        s.c(d10 >= d11, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d11), Double.valueOf(latLng2.f9913a));
        this.f9915a = latLng;
        this.f9916b = latLng2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f9915a.equals(latLngBounds.f9915a) && this.f9916b.equals(latLngBounds.f9916b);
    }

    public int hashCode() {
        return q.c(this.f9915a, this.f9916b);
    }

    public String toString() {
        return q.d(this).a("southwest", this.f9915a).a("northeast", this.f9916b).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f9915a;
        int a10 = c.a(parcel);
        c.E(parcel, 2, latLng, i10, false);
        c.E(parcel, 3, this.f9916b, i10, false);
        c.b(parcel, a10);
    }
}
