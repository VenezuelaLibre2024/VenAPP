package ua;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ua.y;

/* loaded from: classes2.dex */
public final class t extends ea.a {
    public static final Parcelable.Creator<t> CREATOR = new y0();

    /* renamed from: a, reason: collision with root package name */
    private final List f27563a;

    /* renamed from: b, reason: collision with root package name */
    private float f27564b;

    /* renamed from: c, reason: collision with root package name */
    private int f27565c;

    /* renamed from: d, reason: collision with root package name */
    private float f27566d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f27567e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f27568f;

    /* renamed from: r, reason: collision with root package name */
    private boolean f27569r;

    /* renamed from: s, reason: collision with root package name */
    private e f27570s;

    /* renamed from: t, reason: collision with root package name */
    private e f27571t;

    /* renamed from: u, reason: collision with root package name */
    private int f27572u;

    /* renamed from: v, reason: collision with root package name */
    private List f27573v;

    /* renamed from: w, reason: collision with root package name */
    private List f27574w;

    public t() {
        this.f27564b = 10.0f;
        this.f27565c = -16777216;
        this.f27566d = 0.0f;
        this.f27567e = true;
        this.f27568f = false;
        this.f27569r = false;
        this.f27570s = new d();
        this.f27571t = new d();
        this.f27572u = 0;
        this.f27573v = null;
        this.f27574w = new ArrayList();
        this.f27563a = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(List list, float f10, int i10, float f11, boolean z10, boolean z11, boolean z12, e eVar, e eVar2, int i11, List list2, List list3) {
        this.f27564b = 10.0f;
        this.f27565c = -16777216;
        this.f27566d = 0.0f;
        this.f27567e = true;
        this.f27568f = false;
        this.f27569r = false;
        this.f27570s = new d();
        this.f27571t = new d();
        this.f27572u = 0;
        this.f27573v = null;
        this.f27574w = new ArrayList();
        this.f27563a = list;
        this.f27564b = f10;
        this.f27565c = i10;
        this.f27566d = f11;
        this.f27567e = z10;
        this.f27568f = z11;
        this.f27569r = z12;
        if (eVar != null) {
            this.f27570s = eVar;
        }
        if (eVar2 != null) {
            this.f27571t = eVar2;
        }
        this.f27572u = i11;
        this.f27573v = list2;
        if (list3 != null) {
            this.f27574w = list3;
        }
    }

    public e A1() {
        return this.f27571t.u1();
    }

    public int B1() {
        return this.f27572u;
    }

    public List<o> C1() {
        return this.f27573v;
    }

    public List<LatLng> D1() {
        return this.f27563a;
    }

    public e E1() {
        return this.f27570s.u1();
    }

    public float F1() {
        return this.f27564b;
    }

    public float G1() {
        return this.f27566d;
    }

    public boolean H1() {
        return this.f27569r;
    }

    public boolean I1() {
        return this.f27568f;
    }

    public boolean J1() {
        return this.f27567e;
    }

    public t K1(int i10) {
        this.f27572u = i10;
        return this;
    }

    public t L1(List<o> list) {
        this.f27573v = list;
        return this;
    }

    public t M1(e eVar) {
        this.f27570s = (e) com.google.android.gms.common.internal.s.k(eVar, "startCap must not be null");
        return this;
    }

    public t N1(boolean z10) {
        this.f27567e = z10;
        return this;
    }

    public t O1(float f10) {
        this.f27564b = f10;
        return this;
    }

    public t P1(float f10) {
        this.f27566d = f10;
        return this;
    }

    public t u1(Iterable<LatLng> iterable) {
        com.google.android.gms.common.internal.s.k(iterable, "points must not be null.");
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.f27563a.add(it.next());
        }
        return this;
    }

    public t v1(boolean z10) {
        this.f27569r = z10;
        return this;
    }

    public t w1(int i10) {
        this.f27565c = i10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.K(parcel, 2, D1(), false);
        ea.c.q(parcel, 3, F1());
        ea.c.u(parcel, 4, z1());
        ea.c.q(parcel, 5, G1());
        ea.c.g(parcel, 6, J1());
        ea.c.g(parcel, 7, I1());
        ea.c.g(parcel, 8, H1());
        ea.c.E(parcel, 9, E1(), i10, false);
        ea.c.E(parcel, 10, A1(), i10, false);
        ea.c.u(parcel, 11, B1());
        ea.c.K(parcel, 12, C1(), false);
        ArrayList arrayList = new ArrayList(this.f27574w.size());
        for (z zVar : this.f27574w) {
            y.a aVar = new y.a(zVar.v1());
            aVar.c(this.f27564b);
            aVar.b(this.f27567e);
            arrayList.add(new z(aVar.a(), zVar.u1()));
        }
        ea.c.K(parcel, 13, arrayList, false);
        ea.c.b(parcel, a10);
    }

    public t x1(e eVar) {
        this.f27571t = (e) com.google.android.gms.common.internal.s.k(eVar, "endCap must not be null");
        return this;
    }

    public t y1(boolean z10) {
        this.f27568f = z10;
        return this;
    }

    public int z1() {
        return this.f27565c;
    }
}
