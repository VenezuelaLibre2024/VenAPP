package p158ia;

import android.os.Parcel;
import android.os.Parcelable;
import ca.C1898d;
import com.google.android.gms.common.api.InterfaceC5107g;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import p081ea.AbstractC7138a;
import p081ea.C7140c;
import p136ha.C7678f;

/* renamed from: ia.a */
/* loaded from: classes.dex */
public class C7932a extends AbstractC7138a {
    public static final Parcelable.Creator<C7932a> CREATOR = new C7937f();

    /* renamed from: e */
    private static final Comparator f19294e = new Comparator() { // from class: ia.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            C1898d c1898d = (C1898d) obj;
            C1898d c1898d2 = (C1898d) obj2;
            Parcelable.Creator<C7932a> creator = C7932a.CREATOR;
            return !c1898d.m10064u1().equals(c1898d2.m10064u1()) ? c1898d.m10064u1().compareTo(c1898d2.m10064u1()) : (c1898d.m10065v1() > c1898d2.m10065v1() ? 1 : (c1898d.m10065v1() == c1898d2.m10065v1() ? 0 : -1));
        }
    };

    /* renamed from: a */
    private final List f19295a;

    /* renamed from: b */
    private final boolean f19296b;

    /* renamed from: c */
    private final String f19297c;

    /* renamed from: d */
    private final String f19298d;

    public C7932a(List list, boolean z10, String str, String str2) {
        C5276s.m13324j(list);
        this.f19295a = list;
        this.f19296b = z10;
        this.f19297c = str;
        this.f19298d = str2;
    }

    /* renamed from: u1 */
    public static C7932a m24429u1(C7678f c7678f) {
        return m24430w1(c7678f.m23393a(), true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w1 */
    public static C7932a m24430w1(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(f19294e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((InterfaceC5107g) it.next()).mo12993a());
        }
        return new C7932a(new ArrayList(treeSet), z10, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C7932a)) {
            return false;
        }
        C7932a c7932a = (C7932a) obj;
        return this.f19296b == c7932a.f19296b && C5270q.m13304b(this.f19295a, c7932a.f19295a) && C5270q.m13304b(this.f19297c, c7932a.f19297c) && C5270q.m13304b(this.f19298d, c7932a.f19298d);
    }

    public final int hashCode() {
        return C5270q.m13305c(Boolean.valueOf(this.f19296b), this.f19295a, this.f19297c, this.f19298d);
    }

    /* renamed from: v1 */
    public List<C1898d> m24431v1() {
        return this.f19295a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21204K(parcel, 1, m24431v1(), false);
        C7140c.m21215g(parcel, 2, this.f19296b);
        C7140c.m21200G(parcel, 3, this.f19297c, false);
        C7140c.m21200G(parcel, 4, this.f19298d, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
