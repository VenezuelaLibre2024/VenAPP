package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.s;
import ea.c;
import ua.f0;

/* loaded from: classes2.dex */
public final class CameraPosition extends ea.a implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new f0();

    /* renamed from: a, reason: collision with root package name */
    public final LatLng f9905a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9906b;

    /* renamed from: c, reason: collision with root package name */
    public final float f9907c;

    /* renamed from: d, reason: collision with root package name */
    public final float f9908d;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private LatLng f9909a;

        /* renamed from: b, reason: collision with root package name */
        private float f9910b;

        /* renamed from: c, reason: collision with root package name */
        private float f9911c;

        /* renamed from: d, reason: collision with root package name */
        private float f9912d;

        public a a(float f10) {
            this.f9912d = f10;
            return this;
        }

        public CameraPosition b() {
            return new CameraPosition(this.f9909a, this.f9910b, this.f9911c, this.f9912d);
        }

        public a c(LatLng latLng) {
            this.f9909a = (LatLng) s.k(latLng, "location must not be null.");
            return this;
        }

        public a d(float f10) {
            this.f9911c = f10;
            return this;
        }

        public a e(float f10) {
            this.f9910b = f10;
            return this;
        }
    }

    public CameraPosition(LatLng latLng, float f10, float f11, float f12) {
        s.k(latLng, "camera target must not be null.");
        s.c(f11 >= 0.0f && f11 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f11));
        this.f9905a = latLng;
        this.f9906b = f10;
        this.f9907c = f11 + 0.0f;
        this.f9908d = (((double) f12) <= 0.0d ? (f12 % 360.0f) + 360.0f : f12) % 360.0f;
    }

    public static a u1() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f9905a.equals(cameraPosition.f9905a) && Float.floatToIntBits(this.f9906b) == Float.floatToIntBits(cameraPosition.f9906b) && Float.floatToIntBits(this.f9907c) == Float.floatToIntBits(cameraPosition.f9907c) && Float.floatToIntBits(this.f9908d) == Float.floatToIntBits(cameraPosition.f9908d);
    }

    public int hashCode() {
        return q.c(this.f9905a, Float.valueOf(this.f9906b), Float.valueOf(this.f9907c), Float.valueOf(this.f9908d));
    }

    public String toString() {
        return q.d(this).a("target", this.f9905a).a("zoom", Float.valueOf(this.f9906b)).a("tilt", Float.valueOf(this.f9907c)).a("bearing", Float.valueOf(this.f9908d)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f9905a;
        int a10 = c.a(parcel);
        c.E(parcel, 2, latLng, i10, false);
        c.q(parcel, 3, this.f9906b);
        c.q(parcel, 4, this.f9907c);
        c.q(parcel, 5, this.f9908d);
        c.b(parcel, a10);
    }
}
