package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.AdError;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class LocationAvailability extends ea.a implements ReflectedParcelable {

    /* renamed from: a */
    private final int f9759a;

    /* renamed from: b */
    private final int f9760b;

    /* renamed from: c */
    private final long f9761c;

    /* renamed from: d */
    int f9762d;

    /* renamed from: e */
    private final z[] f9763e;

    /* renamed from: f */
    public static final LocationAvailability f9757f = new LocationAvailability(0, 1, 1, 0, null, true);

    /* renamed from: r */
    public static final LocationAvailability f9758r = new LocationAvailability(AdError.NETWORK_ERROR_CODE, 1, 1, 0, null, false);
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new w0();

    public LocationAvailability(int i10, int i11, int i12, long j10, z[] zVarArr, boolean z10) {
        this.f9762d = i10 < 1000 ? 0 : AdError.NETWORK_ERROR_CODE;
        this.f9759a = i11;
        this.f9760b = i12;
        this.f9761c = j10;
        this.f9763e = zVarArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f9759a == locationAvailability.f9759a && this.f9760b == locationAvailability.f9760b && this.f9761c == locationAvailability.f9761c && this.f9762d == locationAvailability.f9762d && Arrays.equals(this.f9763e, locationAvailability.f9763e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(Integer.valueOf(this.f9762d));
    }

    public String toString() {
        return "LocationAvailability[" + u1() + "]";
    }

    public boolean u1() {
        return this.f9762d < 1000;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.u(parcel, 1, this.f9759a);
        ea.c.u(parcel, 2, this.f9760b);
        ea.c.z(parcel, 3, this.f9761c);
        ea.c.u(parcel, 4, this.f9762d);
        ea.c.J(parcel, 5, this.f9763e, i10, false);
        ea.c.g(parcel, 6, u1());
        ea.c.b(parcel, a10);
    }
}
