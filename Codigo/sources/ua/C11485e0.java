package ua;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ua.e0 */
/* loaded from: classes2.dex */
public final class C11485e0 extends AbstractC7138a {
    public static final Parcelable.Creator<C11485e0> CREATOR = new C11501m0();

    /* renamed from: a */
    public final LatLng f29818a;

    /* renamed from: b */
    public final LatLng f29819b;

    /* renamed from: c */
    public final LatLng f29820c;

    /* renamed from: d */
    public final LatLng f29821d;

    /* renamed from: e */
    public final LatLngBounds f29822e;

    public C11485e0(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f29818a = latLng;
        this.f29819b = latLng2;
        this.f29820c = latLng3;
        this.f29821d = latLng4;
        this.f29822e = latLngBounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11485e0)) {
            return false;
        }
        C11485e0 c11485e0 = (C11485e0) obj;
        return this.f29818a.equals(c11485e0.f29818a) && this.f29819b.equals(c11485e0.f29819b) && this.f29820c.equals(c11485e0.f29820c) && this.f29821d.equals(c11485e0.f29821d) && this.f29822e.equals(c11485e0.f29822e);
    }

    public int hashCode() {
        return C5270q.m13305c(this.f29818a, this.f29819b, this.f29820c, this.f29821d, this.f29822e);
    }

    public String toString() {
        return C5270q.m13306d(this).m13307a("nearLeft", this.f29818a).m13307a("nearRight", this.f29819b).m13307a("farLeft", this.f29820c).m13307a("farRight", this.f29821d).m13307a("latLngBounds", this.f29822e).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f29818a;
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21198E(parcel, 2, latLng, i10, false);
        C7140c.m21198E(parcel, 3, this.f29819b, i10, false);
        C7140c.m21198E(parcel, 4, this.f29820c, i10, false);
        C7140c.m21198E(parcel, 5, this.f29821d, i10, false);
        C7140c.m21198E(parcel, 6, this.f29822e, i10, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
