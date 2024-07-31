package ia;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class a extends ea.a {
    public static final Parcelable.Creator<a> CREATOR = new f();

    /* renamed from: e, reason: collision with root package name */
    private static final Comparator f17633e = new Comparator() { // from class: ia.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            ca.d dVar = (ca.d) obj;
            ca.d dVar2 = (ca.d) obj2;
            Parcelable.Creator<a> creator = a.CREATOR;
            return !dVar.u1().equals(dVar2.u1()) ? dVar.u1().compareTo(dVar2.u1()) : (dVar.v1() > dVar2.v1() ? 1 : (dVar.v1() == dVar2.v1() ? 0 : -1));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final List f17634a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f17635b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17636c;

    /* renamed from: d, reason: collision with root package name */
    private final String f17637d;

    public a(List list, boolean z10, String str, String str2) {
        com.google.android.gms.common.internal.s.j(list);
        this.f17634a = list;
        this.f17635b = z10;
        this.f17636c = str;
        this.f17637d = str2;
    }

    public static a u1(ha.f fVar) {
        return w1(fVar.a(), true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a w1(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(f17633e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((com.google.android.gms.common.api.g) it.next()).a());
        }
        return new a(new ArrayList(treeSet), z10, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f17635b == aVar.f17635b && com.google.android.gms.common.internal.q.b(this.f17634a, aVar.f17634a) && com.google.android.gms.common.internal.q.b(this.f17636c, aVar.f17636c) && com.google.android.gms.common.internal.q.b(this.f17637d, aVar.f17637d);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.q.c(Boolean.valueOf(this.f17635b), this.f17634a, this.f17636c, this.f17637d);
    }

    public List<ca.d> v1() {
        return this.f17634a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.K(parcel, 1, v1(), false);
        ea.c.g(parcel, 2, this.f17635b);
        ea.c.G(parcel, 3, this.f17636c, false);
        ea.c.G(parcel, 4, this.f17637d, false);
        ea.c.b(parcel, a10);
    }
}
