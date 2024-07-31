package ua;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

/* loaded from: classes2.dex */
public final class g extends ea.a {
    public static final Parcelable.Creator<g> CREATOR = new o0();

    /* renamed from: a, reason: collision with root package name */
    private LatLng f27508a;

    /* renamed from: b, reason: collision with root package name */
    private double f27509b;

    /* renamed from: c, reason: collision with root package name */
    private float f27510c;

    /* renamed from: d, reason: collision with root package name */
    private int f27511d;

    /* renamed from: e, reason: collision with root package name */
    private int f27512e;

    /* renamed from: f, reason: collision with root package name */
    private float f27513f;

    /* renamed from: r, reason: collision with root package name */
    private boolean f27514r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f27515s;

    /* renamed from: t, reason: collision with root package name */
    private List f27516t;

    public g() {
        this.f27508a = null;
        this.f27509b = 0.0d;
        this.f27510c = 10.0f;
        this.f27511d = -16777216;
        this.f27512e = 0;
        this.f27513f = 0.0f;
        this.f27514r = true;
        this.f27515s = false;
        this.f27516t = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(LatLng latLng, double d10, float f10, int i10, int i11, float f11, boolean z10, boolean z11, List list) {
        this.f27508a = latLng;
        this.f27509b = d10;
        this.f27510c = f10;
        this.f27511d = i10;
        this.f27512e = i11;
        this.f27513f = f11;
        this.f27514r = z10;
        this.f27515s = z11;
        this.f27516t = list;
    }

    public int A1() {
        return this.f27511d;
    }

    public List<o> B1() {
        return this.f27516t;
    }

    public float C1() {
        return this.f27510c;
    }

    public float D1() {
        return this.f27513f;
    }

    public boolean E1() {
        return this.f27515s;
    }

    public boolean F1() {
        return this.f27514r;
    }

    public g G1(double d10) {
        this.f27509b = d10;
        return this;
    }

    public g H1(int i10) {
        this.f27511d = i10;
        return this;
    }

    public g I1(float f10) {
        this.f27510c = f10;
        return this;
    }

    public g J1(boolean z10) {
        this.f27514r = z10;
        return this;
    }

    public g K1(float f10) {
        this.f27513f = f10;
        return this;
    }

    public g u1(LatLng latLng) {
        com.google.android.gms.common.internal.s.k(latLng, "center must not be null.");
        this.f27508a = latLng;
        return this;
    }

    public g v1(boolean z10) {
        this.f27515s = z10;
        return this;
    }

    public g w1(int i10) {
        this.f27512e = i10;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.E(parcel, 2, x1(), i10, false);
        ea.c.n(parcel, 3, z1());
        ea.c.q(parcel, 4, C1());
        ea.c.u(parcel, 5, A1());
        ea.c.u(parcel, 6, y1());
        ea.c.q(parcel, 7, D1());
        ea.c.g(parcel, 8, F1());
        ea.c.g(parcel, 9, E1());
        ea.c.K(parcel, 10, B1(), false);
        ea.c.b(parcel, a10);
    }

    public LatLng x1() {
        return this.f27508a;
    }

    public int y1() {
        return this.f27512e;
    }

    public double z1() {
        return this.f27509b;
    }
}
