package ua;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.maps.model.LatLng;

/* loaded from: classes2.dex */
public class n extends ea.a {
    public static final Parcelable.Creator<n> CREATOR = new t0();
    private View A;
    private int B;
    private String C;
    private float D;

    /* renamed from: a, reason: collision with root package name */
    private LatLng f27526a;

    /* renamed from: b, reason: collision with root package name */
    private String f27527b;

    /* renamed from: c, reason: collision with root package name */
    private String f27528c;

    /* renamed from: d, reason: collision with root package name */
    private b f27529d;

    /* renamed from: e, reason: collision with root package name */
    private float f27530e;

    /* renamed from: f, reason: collision with root package name */
    private float f27531f;

    /* renamed from: r, reason: collision with root package name */
    private boolean f27532r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f27533s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f27534t;

    /* renamed from: u, reason: collision with root package name */
    private float f27535u;

    /* renamed from: v, reason: collision with root package name */
    private float f27536v;

    /* renamed from: w, reason: collision with root package name */
    private float f27537w;

    /* renamed from: x, reason: collision with root package name */
    private float f27538x;

    /* renamed from: y, reason: collision with root package name */
    private float f27539y;

    /* renamed from: z, reason: collision with root package name */
    private int f27540z;

    public n() {
        this.f27530e = 0.5f;
        this.f27531f = 1.0f;
        this.f27533s = true;
        this.f27534t = false;
        this.f27535u = 0.0f;
        this.f27536v = 0.5f;
        this.f27537w = 0.0f;
        this.f27538x = 1.0f;
        this.f27540z = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(LatLng latLng, String str, String str2, IBinder iBinder, float f10, float f11, boolean z10, boolean z11, boolean z12, float f12, float f13, float f14, float f15, float f16, int i10, IBinder iBinder2, int i11, String str3, float f17) {
        this.f27530e = 0.5f;
        this.f27531f = 1.0f;
        this.f27533s = true;
        this.f27534t = false;
        this.f27535u = 0.0f;
        this.f27536v = 0.5f;
        this.f27537w = 0.0f;
        this.f27538x = 1.0f;
        this.f27540z = 0;
        this.f27526a = latLng;
        this.f27527b = str;
        this.f27528c = str2;
        if (iBinder == null) {
            this.f27529d = null;
        } else {
            this.f27529d = new b(b.a.f2(iBinder));
        }
        this.f27530e = f10;
        this.f27531f = f11;
        this.f27532r = z10;
        this.f27533s = z11;
        this.f27534t = z12;
        this.f27535u = f12;
        this.f27536v = f13;
        this.f27537w = f14;
        this.f27538x = f15;
        this.f27539y = f16;
        this.B = i11;
        this.f27540z = i10;
        com.google.android.gms.dynamic.b f22 = b.a.f2(iBinder2);
        this.A = f22 != null ? (View) com.google.android.gms.dynamic.d.g2(f22) : null;
        this.C = str3;
        this.D = f17;
    }

    public float A1() {
        return this.f27531f;
    }

    public float B1() {
        return this.f27536v;
    }

    public float C1() {
        return this.f27537w;
    }

    public LatLng D1() {
        return this.f27526a;
    }

    public float E1() {
        return this.f27535u;
    }

    public String F1() {
        return this.f27528c;
    }

    public String G1() {
        return this.f27527b;
    }

    public float H1() {
        return this.f27539y;
    }

    public n I1(b bVar) {
        this.f27529d = bVar;
        return this;
    }

    public n J1(float f10, float f11) {
        this.f27536v = f10;
        this.f27537w = f11;
        return this;
    }

    public boolean K1() {
        return this.f27532r;
    }

    public boolean L1() {
        return this.f27534t;
    }

    public boolean M1() {
        return this.f27533s;
    }

    public n N1(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.f27526a = latLng;
        return this;
    }

    public n O1(float f10) {
        this.f27535u = f10;
        return this;
    }

    public n P1(String str) {
        this.f27528c = str;
        return this;
    }

    public n Q1(String str) {
        this.f27527b = str;
        return this;
    }

    public n R1(boolean z10) {
        this.f27533s = z10;
        return this;
    }

    public n S1(float f10) {
        this.f27539y = f10;
        return this;
    }

    public n u1(float f10) {
        this.f27538x = f10;
        return this;
    }

    public n v1(float f10, float f11) {
        this.f27530e = f10;
        this.f27531f = f11;
        return this;
    }

    public n w1(boolean z10) {
        this.f27532r = z10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.E(parcel, 2, D1(), i10, false);
        ea.c.G(parcel, 3, G1(), false);
        ea.c.G(parcel, 4, F1(), false);
        b bVar = this.f27529d;
        ea.c.t(parcel, 5, bVar == null ? null : bVar.a().asBinder(), false);
        ea.c.q(parcel, 6, z1());
        ea.c.q(parcel, 7, A1());
        ea.c.g(parcel, 8, K1());
        ea.c.g(parcel, 9, M1());
        ea.c.g(parcel, 10, L1());
        ea.c.q(parcel, 11, E1());
        ea.c.q(parcel, 12, B1());
        ea.c.q(parcel, 13, C1());
        ea.c.q(parcel, 14, y1());
        ea.c.q(parcel, 15, H1());
        ea.c.u(parcel, 17, this.f27540z);
        ea.c.t(parcel, 18, com.google.android.gms.dynamic.d.h2(this.A).asBinder(), false);
        ea.c.u(parcel, 19, this.B);
        ea.c.G(parcel, 20, this.C, false);
        ea.c.q(parcel, 21, this.D);
        ea.c.b(parcel, a10);
    }

    public n x1(boolean z10) {
        this.f27534t = z10;
        return this;
    }

    public float y1() {
        return this.f27538x;
    }

    public float z1() {
        return this.f27530e;
    }

    public final int zzb() {
        return this.B;
    }
}
