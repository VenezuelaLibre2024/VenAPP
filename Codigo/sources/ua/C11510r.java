package ua;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: ua.r */
/* loaded from: classes2.dex */
public final class C11510r extends AbstractC7138a {
    public static final Parcelable.Creator<C11510r> CREATOR = new C11523x0();

    /* renamed from: a */
    private final List f29871a;

    /* renamed from: b */
    private final List f29872b;

    /* renamed from: c */
    private float f29873c;

    /* renamed from: d */
    private int f29874d;

    /* renamed from: e */
    private int f29875e;

    /* renamed from: f */
    private float f29876f;

    /* renamed from: r */
    private boolean f29877r;

    /* renamed from: s */
    private boolean f29878s;

    /* renamed from: t */
    private boolean f29879t;

    /* renamed from: u */
    private int f29880u;

    /* renamed from: v */
    private List f29881v;

    public C11510r() {
        this.f29873c = 10.0f;
        this.f29874d = -16777216;
        this.f29875e = 0;
        this.f29876f = 0.0f;
        this.f29877r = true;
        this.f29878s = false;
        this.f29879t = false;
        this.f29880u = 0;
        this.f29881v = null;
        this.f29871a = new ArrayList();
        this.f29872b = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11510r(List list, List list2, float f10, int i10, int i11, float f11, boolean z10, boolean z11, boolean z12, int i12, List list3) {
        this.f29871a = list;
        this.f29872b = list2;
        this.f29873c = f10;
        this.f29874d = i10;
        this.f29875e = i11;
        this.f29876f = f11;
        this.f29877r = z10;
        this.f29878s = z11;
        this.f29879t = z12;
        this.f29880u = i12;
        this.f29881v = list3;
    }

    /* renamed from: A1 */
    public List<LatLng> m36024A1() {
        return this.f29871a;
    }

    /* renamed from: B1 */
    public int m36025B1() {
        return this.f29874d;
    }

    /* renamed from: C1 */
    public int m36026C1() {
        return this.f29880u;
    }

    /* renamed from: D1 */
    public List<C11504o> m36027D1() {
        return this.f29881v;
    }

    /* renamed from: E1 */
    public float m36028E1() {
        return this.f29873c;
    }

    /* renamed from: F1 */
    public float m36029F1() {
        return this.f29876f;
    }

    /* renamed from: G1 */
    public boolean m36030G1() {
        return this.f29879t;
    }

    /* renamed from: H1 */
    public boolean m36031H1() {
        return this.f29878s;
    }

    /* renamed from: I1 */
    public boolean m36032I1() {
        return this.f29877r;
    }

    /* renamed from: J1 */
    public C11510r m36033J1(int i10) {
        this.f29874d = i10;
        return this;
    }

    /* renamed from: K1 */
    public C11510r m36034K1(float f10) {
        this.f29873c = f10;
        return this;
    }

    /* renamed from: L1 */
    public C11510r m36035L1(boolean z10) {
        this.f29877r = z10;
        return this;
    }

    /* renamed from: M1 */
    public C11510r m36036M1(float f10) {
        this.f29876f = f10;
        return this;
    }

    /* renamed from: u1 */
    public C11510r m36037u1(Iterable<LatLng> iterable) {
        C5276s.m13325k(iterable, "points must not be null.");
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.f29871a.add(it.next());
        }
        return this;
    }

    /* renamed from: v1 */
    public C11510r m36038v1(Iterable<LatLng> iterable) {
        C5276s.m13325k(iterable, "points must not be null.");
        ArrayList arrayList = new ArrayList();
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        this.f29872b.add(arrayList);
        return this;
    }

    /* renamed from: w1 */
    public C11510r m36039w1(boolean z10) {
        this.f29879t = z10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21204K(parcel, 2, m36024A1(), false);
        C7140c.m21233y(parcel, 3, this.f29872b, false);
        C7140c.m21225q(parcel, 4, m36028E1());
        C7140c.m21229u(parcel, 5, m36025B1());
        C7140c.m21229u(parcel, 6, m36042z1());
        C7140c.m21225q(parcel, 7, m36029F1());
        C7140c.m21215g(parcel, 8, m36032I1());
        C7140c.m21215g(parcel, 9, m36031H1());
        C7140c.m21215g(parcel, 10, m36030G1());
        C7140c.m21229u(parcel, 11, m36026C1());
        C7140c.m21204K(parcel, 12, m36027D1(), false);
        C7140c.m21210b(parcel, m21209a);
    }

    /* renamed from: x1 */
    public C11510r m36040x1(int i10) {
        this.f29875e = i10;
        return this;
    }

    /* renamed from: y1 */
    public C11510r m36041y1(boolean z10) {
        this.f29878s = z10;
        return this;
    }

    /* renamed from: z1 */
    public int m36042z1() {
        return this.f29875e;
    }
}
