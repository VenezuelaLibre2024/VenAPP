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
import ua.C11524y;

/* renamed from: ua.t */
/* loaded from: classes2.dex */
public final class C11514t extends AbstractC7138a {
    public static final Parcelable.Creator<C11514t> CREATOR = new C11525y0();

    /* renamed from: a */
    private final List f29883a;

    /* renamed from: b */
    private float f29884b;

    /* renamed from: c */
    private int f29885c;

    /* renamed from: d */
    private float f29886d;

    /* renamed from: e */
    private boolean f29887e;

    /* renamed from: f */
    private boolean f29888f;

    /* renamed from: r */
    private boolean f29889r;

    /* renamed from: s */
    private C11484e f29890s;

    /* renamed from: t */
    private C11484e f29891t;

    /* renamed from: u */
    private int f29892u;

    /* renamed from: v */
    private List f29893v;

    /* renamed from: w */
    private List f29894w;

    public C11514t() {
        this.f29884b = 10.0f;
        this.f29885c = -16777216;
        this.f29886d = 0.0f;
        this.f29887e = true;
        this.f29888f = false;
        this.f29889r = false;
        this.f29890s = new C11482d();
        this.f29891t = new C11482d();
        this.f29892u = 0;
        this.f29893v = null;
        this.f29894w = new ArrayList();
        this.f29883a = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11514t(List list, float f10, int i10, float f11, boolean z10, boolean z11, boolean z12, C11484e c11484e, C11484e c11484e2, int i11, List list2, List list3) {
        this.f29884b = 10.0f;
        this.f29885c = -16777216;
        this.f29886d = 0.0f;
        this.f29887e = true;
        this.f29888f = false;
        this.f29889r = false;
        this.f29890s = new C11482d();
        this.f29891t = new C11482d();
        this.f29892u = 0;
        this.f29893v = null;
        this.f29894w = new ArrayList();
        this.f29883a = list;
        this.f29884b = f10;
        this.f29885c = i10;
        this.f29886d = f11;
        this.f29887e = z10;
        this.f29888f = z11;
        this.f29889r = z12;
        if (c11484e != null) {
            this.f29890s = c11484e;
        }
        if (c11484e2 != null) {
            this.f29891t = c11484e2;
        }
        this.f29892u = i11;
        this.f29893v = list2;
        if (list3 != null) {
            this.f29894w = list3;
        }
    }

    /* renamed from: A1 */
    public C11484e m36056A1() {
        return this.f29891t.m35936u1();
    }

    /* renamed from: B1 */
    public int m36057B1() {
        return this.f29892u;
    }

    /* renamed from: C1 */
    public List<C11504o> m36058C1() {
        return this.f29893v;
    }

    /* renamed from: D1 */
    public List<LatLng> m36059D1() {
        return this.f29883a;
    }

    /* renamed from: E1 */
    public C11484e m36060E1() {
        return this.f29890s.m35936u1();
    }

    /* renamed from: F1 */
    public float m36061F1() {
        return this.f29884b;
    }

    /* renamed from: G1 */
    public float m36062G1() {
        return this.f29886d;
    }

    /* renamed from: H1 */
    public boolean m36063H1() {
        return this.f29889r;
    }

    /* renamed from: I1 */
    public boolean m36064I1() {
        return this.f29888f;
    }

    /* renamed from: J1 */
    public boolean m36065J1() {
        return this.f29887e;
    }

    /* renamed from: K1 */
    public C11514t m36066K1(int i10) {
        this.f29892u = i10;
        return this;
    }

    /* renamed from: L1 */
    public C11514t m36067L1(List<C11504o> list) {
        this.f29893v = list;
        return this;
    }

    /* renamed from: M1 */
    public C11514t m36068M1(C11484e c11484e) {
        this.f29890s = (C11484e) C5276s.m13325k(c11484e, "startCap must not be null");
        return this;
    }

    /* renamed from: N1 */
    public C11514t m36069N1(boolean z10) {
        this.f29887e = z10;
        return this;
    }

    /* renamed from: O1 */
    public C11514t m36070O1(float f10) {
        this.f29884b = f10;
        return this;
    }

    /* renamed from: P1 */
    public C11514t m36071P1(float f10) {
        this.f29886d = f10;
        return this;
    }

    /* renamed from: u1 */
    public C11514t m36072u1(Iterable<LatLng> iterable) {
        C5276s.m13325k(iterable, "points must not be null.");
        Iterator<LatLng> it = iterable.iterator();
        while (it.hasNext()) {
            this.f29883a.add(it.next());
        }
        return this;
    }

    /* renamed from: v1 */
    public C11514t m36073v1(boolean z10) {
        this.f29889r = z10;
        return this;
    }

    /* renamed from: w1 */
    public C11514t m36074w1(int i10) {
        this.f29885c = i10;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21204K(parcel, 2, m36059D1(), false);
        C7140c.m21225q(parcel, 3, m36061F1());
        C7140c.m21229u(parcel, 4, m36077z1());
        C7140c.m21225q(parcel, 5, m36062G1());
        C7140c.m21215g(parcel, 6, m36065J1());
        C7140c.m21215g(parcel, 7, m36064I1());
        C7140c.m21215g(parcel, 8, m36063H1());
        C7140c.m21198E(parcel, 9, m36060E1(), i10, false);
        C7140c.m21198E(parcel, 10, m36056A1(), i10, false);
        C7140c.m21229u(parcel, 11, m36057B1());
        C7140c.m21204K(parcel, 12, m36058C1(), false);
        ArrayList arrayList = new ArrayList(this.f29894w.size());
        for (C11526z c11526z : this.f29894w) {
            C11524y.a aVar = new C11524y.a(c11526z.m36087v1());
            aVar.m36085c(this.f29884b);
            aVar.m36084b(this.f29887e);
            arrayList.add(new C11526z(aVar.m36083a(), c11526z.m36086u1()));
        }
        C7140c.m21204K(parcel, 13, arrayList, false);
        C7140c.m21210b(parcel, m21209a);
    }

    /* renamed from: x1 */
    public C11514t m36075x1(C11484e c11484e) {
        this.f29891t = (C11484e) C5276s.m13325k(c11484e, "endCap must not be null");
        return this;
    }

    /* renamed from: y1 */
    public C11514t m36076y1(boolean z10) {
        this.f29888f = z10;
        return this;
    }

    /* renamed from: z1 */
    public int m36077z1() {
        return this.f29885c;
    }
}
