package ua;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes2.dex */
public final class e0 extends ea.a {
    public static final Parcelable.Creator<e0> CREATOR = new m0();

    /* renamed from: a, reason: collision with root package name */
    public final LatLng f27502a;

    /* renamed from: b, reason: collision with root package name */
    public final LatLng f27503b;

    /* renamed from: c, reason: collision with root package name */
    public final LatLng f27504c;

    /* renamed from: d, reason: collision with root package name */
    public final LatLng f27505d;

    /* renamed from: e, reason: collision with root package name */
    public final LatLngBounds f27506e;

    public e0(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f27502a = latLng;
        this.f27503b = latLng2;
        this.f27504c = latLng3;
        this.f27505d = latLng4;
        this.f27506e = latLngBounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f27502a.equals(e0Var.f27502a) && this.f27503b.equals(e0Var.f27503b) && this.f27504c.equals(e0Var.f27504c) && this.f27505d.equals(e0Var.f27505d) && this.f27506e.equals(e0Var.f27506e);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f27502a, this.f27503b, this.f27504c, this.f27505d, this.f27506e);
    }

    public String toString() {
        return com.google.android.gms.common.internal.q.d(this).a("nearLeft", this.f27502a).a("nearRight", this.f27503b).a("farLeft", this.f27504c).a("farRight", this.f27505d).a("latLngBounds", this.f27506e).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f27502a;
        int a10 = ea.c.a(parcel);
        ea.c.E(parcel, 2, latLng, i10, false);
        ea.c.E(parcel, 3, this.f27503b, i10, false);
        ea.c.E(parcel, 4, this.f27504c, i10, false);
        ea.c.E(parcel, 5, this.f27505d, i10, false);
        ea.c.E(parcel, 6, this.f27506e, i10, false);
        ea.c.b(parcel, a10);
    }
}
