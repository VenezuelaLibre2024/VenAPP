package com.google.android.gms.location;

import android.location.Location;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class LocationResult extends ea.a implements ReflectedParcelable {

    /* renamed from: a */
    private final List f9795a;

    /* renamed from: b */
    static final List f9794b = Collections.emptyList();
    public static final Parcelable.Creator<LocationResult> CREATOR = new y0();

    public LocationResult(List list) {
        this.f9795a = list;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (Build.VERSION.SDK_INT >= 31) {
            return this.f9795a.equals(locationResult.f9795a);
        }
        if (this.f9795a.size() != locationResult.f9795a.size()) {
            return false;
        }
        Iterator it = locationResult.f9795a.iterator();
        for (Location location : this.f9795a) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !com.google.android.gms.common.internal.q.b(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f9795a);
    }

    public String toString() {
        return "LocationResult".concat(String.valueOf(this.f9795a));
    }

    public Location u1() {
        int size = this.f9795a.size();
        if (size == 0) {
            return null;
        }
        return (Location) this.f9795a.get(size - 1);
    }

    public List<Location> v1() {
        return this.f9795a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.K(parcel, 1, v1(), false);
        ea.c.b(parcel, a10);
    }
}
