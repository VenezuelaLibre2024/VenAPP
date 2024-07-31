package ua;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class r extends ea.a {
    public static final Parcelable.Creator<r> CREATOR = new x0();

    /* renamed from: a, reason: collision with root package name */
    private final List f27551a;

    /* renamed from: b, reason: collision with root package name */
    private final List f27552b;

    /* renamed from: c, reason: collision with root package name */
    private float f27553c;

    /* renamed from: d, reason: collision with root package name */
    private int f27554d;

    /* renamed from: e, reason: collision with root package name */
    private int f27555e;

    /* renamed from: f, reason: collision with root package name */
    private float f27556f;

    /* renamed from: r, reason: collision with root package name */
    private boolean f27557r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f27558s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f27559t;

    /* renamed from: u, reason: collision with root package name */
    private int f27560u;

    /* renamed from: v, reason: collision with root package name */
    private List f27561v;

    public r() {
        this.f27553c = 10.0f;
        this.f27554d = -16777216;
        this.f27555e = 0;
        this.f27556f = 0.0f;
        this.f27557r = true;
        this.f27558s = false;
        this.f27559t = false;
        this.f27560u = 0;
        this.f27561v = null;
        this.f27551a = new ArrayList();
        this.f27552b = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(List list, List list2, float f10, int i10, int i11, float f11, boolean z10, boolean z11, boolean z12, int i12, List list3) {
        this.f27551a = list;
        this.f27552b = list2;
        this.f27553c = f10;
        this.f27554d = i10;
        this.f27555e = i11;
        this.f27556f = f11;
        this.f27557r = z10;
        this.f27558s = z11;
        this.f27559t = z12;
        this.f27560u = i12;
        this.f27561v = list3;
    }

    public List<LatLng> A1() {
        return this.f27551a;
    }

    public int B1() {
        return this.f27554d;
    }

    public int C1() {
        return this.f27560u;
    }

    public List<o> D1() {
        return this.f27561v;
    }

    public float E1() {
        return this.f27553c;
    }

    public float F1() {
        return this.f27556f;
    }

    public boolean G1() {
        return this.f27559t;
    }

    public boolean H1() {
        return this.f27558s;
    }

    public boolean I1() {
        return this.f27557r;
    }

    public r J1(int i10) {
        this.f27554d = i10;
        return this;
    }

    public r K1(float f10) {
        this.f27553c = f10;
        return this;
    }

    public r L1(boolean z10) {
        this.f27557r = z10;
        return this;
    }

    public r M1(float f10) {
        this.f27556f = f10;
        return this;
    }

    public r u1(Iterable<LatLng> iterable) {
        com.google.android.gms.common.internal.s.k(iterable, "points must not be null.");
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.f27551a.add(it.next());
        }
        return this;
    }

    public r v1(Iterable<LatLng> iterable) {
        com.google.android.gms.common.internal.s.k(iterable, "points must not be null.");
        ArrayList arrayList = new ArrayList();
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        this.f27552b.add(arrayList);
        return this;
    }

    public r w1(boolean z10) {
        this.f27559t = z10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.K(parcel, 2, A1(), false);
        ea.c.y(parcel, 3, this.f27552b, false);
        ea.c.q(parcel, 4, E1());
        ea.c.u(parcel, 5, B1());
        ea.c.u(parcel, 6, z1());
        ea.c.q(parcel, 7, F1());
        ea.c.g(parcel, 8, I1());
        ea.c.g(parcel, 9, H1());
        ea.c.g(parcel, 10, G1());
        ea.c.u(parcel, 11, C1());
        ea.c.K(parcel, 12, D1(), false);
        ea.c.b(parcel, a10);
    }

    public r x1(int i10) {
        this.f27555e = i10;
        return this;
    }

    public r y1(boolean z10) {
        this.f27558s = z10;
        return this;
    }

    public int z1() {
        return this.f27555e;
    }
}
