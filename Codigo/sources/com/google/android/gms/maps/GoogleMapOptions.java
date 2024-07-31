package com.google.android.gms.maps;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import ea.c;
import ta.f;

/* loaded from: classes2.dex */
public final class GoogleMapOptions extends ea.a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleMapOptions> CREATOR = new a();
    private static final Integer E = Integer.valueOf(Color.argb(255, 236, 233, 225));
    private LatLngBounds A;
    private Boolean B;
    private Integer C;
    private String D;

    /* renamed from: a, reason: collision with root package name */
    private Boolean f9890a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f9891b;

    /* renamed from: c, reason: collision with root package name */
    private int f9892c;

    /* renamed from: d, reason: collision with root package name */
    private CameraPosition f9893d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f9894e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f9895f;

    /* renamed from: r, reason: collision with root package name */
    private Boolean f9896r;

    /* renamed from: s, reason: collision with root package name */
    private Boolean f9897s;

    /* renamed from: t, reason: collision with root package name */
    private Boolean f9898t;

    /* renamed from: u, reason: collision with root package name */
    private Boolean f9899u;

    /* renamed from: v, reason: collision with root package name */
    private Boolean f9900v;

    /* renamed from: w, reason: collision with root package name */
    private Boolean f9901w;

    /* renamed from: x, reason: collision with root package name */
    private Boolean f9902x;

    /* renamed from: y, reason: collision with root package name */
    private Float f9903y;

    /* renamed from: z, reason: collision with root package name */
    private Float f9904z;

    public GoogleMapOptions() {
        this.f9892c = -1;
        this.f9903y = null;
        this.f9904z = null;
        this.A = null;
        this.C = null;
        this.D = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleMapOptions(byte b10, byte b11, int i10, CameraPosition cameraPosition, byte b12, byte b13, byte b14, byte b15, byte b16, byte b17, byte b18, byte b19, byte b20, Float f10, Float f11, LatLngBounds latLngBounds, byte b21, Integer num, String str) {
        this.f9892c = -1;
        this.f9903y = null;
        this.f9904z = null;
        this.A = null;
        this.C = null;
        this.D = null;
        this.f9890a = f.b(b10);
        this.f9891b = f.b(b11);
        this.f9892c = i10;
        this.f9893d = cameraPosition;
        this.f9894e = f.b(b12);
        this.f9895f = f.b(b13);
        this.f9896r = f.b(b14);
        this.f9897s = f.b(b15);
        this.f9898t = f.b(b16);
        this.f9899u = f.b(b17);
        this.f9900v = f.b(b18);
        this.f9901w = f.b(b19);
        this.f9902x = f.b(b20);
        this.f9903y = f10;
        this.f9904z = f11;
        this.A = latLngBounds;
        this.B = f.b(b21);
        this.C = num;
        this.D = str;
    }

    public String A1() {
        return this.D;
    }

    public int B1() {
        return this.f9892c;
    }

    public Float C1() {
        return this.f9904z;
    }

    public Float D1() {
        return this.f9903y;
    }

    public GoogleMapOptions E1(LatLngBounds latLngBounds) {
        this.A = latLngBounds;
        return this;
    }

    public GoogleMapOptions F1(boolean z10) {
        this.f9900v = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions G1(String str) {
        this.D = str;
        return this;
    }

    public GoogleMapOptions H1(boolean z10) {
        this.f9901w = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions I1(int i10) {
        this.f9892c = i10;
        return this;
    }

    public GoogleMapOptions J1(float f10) {
        this.f9904z = Float.valueOf(f10);
        return this;
    }

    public GoogleMapOptions K1(float f10) {
        this.f9903y = Float.valueOf(f10);
        return this;
    }

    public GoogleMapOptions L1(boolean z10) {
        this.f9899u = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions M1(boolean z10) {
        this.f9896r = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions N1(boolean z10) {
        this.f9898t = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions O1(boolean z10) {
        this.f9894e = Boolean.valueOf(z10);
        return this;
    }

    public GoogleMapOptions P1(boolean z10) {
        this.f9897s = Boolean.valueOf(z10);
        return this;
    }

    public String toString() {
        return q.d(this).a("MapType", Integer.valueOf(this.f9892c)).a("LiteMode", this.f9900v).a("Camera", this.f9893d).a("CompassEnabled", this.f9895f).a("ZoomControlsEnabled", this.f9894e).a("ScrollGesturesEnabled", this.f9896r).a("ZoomGesturesEnabled", this.f9897s).a("TiltGesturesEnabled", this.f9898t).a("RotateGesturesEnabled", this.f9899u).a("ScrollGesturesEnabledDuringRotateOrZoom", this.B).a("MapToolbarEnabled", this.f9901w).a("AmbientEnabled", this.f9902x).a("MinZoomPreference", this.f9903y).a("MaxZoomPreference", this.f9904z).a("BackgroundColor", this.C).a("LatLngBoundsForCameraTarget", this.A).a("ZOrderOnTop", this.f9890a).a("UseViewLifecycleInFragment", this.f9891b).toString();
    }

    public GoogleMapOptions u1(CameraPosition cameraPosition) {
        this.f9893d = cameraPosition;
        return this;
    }

    public GoogleMapOptions v1(boolean z10) {
        this.f9895f = Boolean.valueOf(z10);
        return this;
    }

    public Integer w1() {
        return this.C;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 2, f.a(this.f9890a));
        c.k(parcel, 3, f.a(this.f9891b));
        c.u(parcel, 4, B1());
        c.E(parcel, 5, x1(), i10, false);
        c.k(parcel, 6, f.a(this.f9894e));
        c.k(parcel, 7, f.a(this.f9895f));
        c.k(parcel, 8, f.a(this.f9896r));
        c.k(parcel, 9, f.a(this.f9897s));
        c.k(parcel, 10, f.a(this.f9898t));
        c.k(parcel, 11, f.a(this.f9899u));
        c.k(parcel, 12, f.a(this.f9900v));
        c.k(parcel, 14, f.a(this.f9901w));
        c.k(parcel, 15, f.a(this.f9902x));
        c.s(parcel, 16, D1(), false);
        c.s(parcel, 17, C1(), false);
        c.E(parcel, 18, y1(), i10, false);
        c.k(parcel, 19, f.a(this.B));
        c.x(parcel, 20, w1(), false);
        c.G(parcel, 21, A1(), false);
        c.b(parcel, a10);
    }

    public CameraPosition x1() {
        return this.f9893d;
    }

    public LatLngBounds y1() {
        return this.A;
    }

    public Boolean z1() {
        return this.f9900v;
    }
}
