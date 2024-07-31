package p272oc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.AbstractC6084j0;
import com.google.firebase.auth.C6124t0;
import com.google.firebase.auth.C6143y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p081ea.AbstractC7138a;
import p081ea.C7140c;

/* renamed from: oc.l0 */
/* loaded from: classes.dex */
public final class C9867l0 extends AbstractC7138a {
    public static final Parcelable.Creator<C9867l0> CREATOR = new C9864k0();

    /* renamed from: a */
    private final List<C6124t0> f24339a;

    /* renamed from: b */
    private final List<C6143y0> f24340b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9867l0(List<C6124t0> list, List<C6143y0> list2) {
        this.f24339a = list == null ? new ArrayList<>() : list;
        this.f24340b = list2 == null ? new ArrayList<>() : list2;
    }

    /* renamed from: v1 */
    public static C9867l0 m29552v1(List<AbstractC6084j0> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (AbstractC6084j0 abstractC6084j0 : list) {
            if (abstractC6084j0 instanceof C6124t0) {
                arrayList.add((C6124t0) abstractC6084j0);
            } else if (abstractC6084j0 instanceof C6143y0) {
                arrayList2.add((C6143y0) abstractC6084j0);
            }
        }
        return new C9867l0(arrayList, arrayList2);
    }

    /* renamed from: u1 */
    public final List<AbstractC6084j0> m29553u1() {
        ArrayList arrayList = new ArrayList();
        Iterator<C6124t0> it = this.f24339a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        Iterator<C6143y0> it2 = this.f24340b.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m21209a = C7140c.m21209a(parcel);
        C7140c.m21204K(parcel, 1, this.f24339a, false);
        C7140c.m21204K(parcel, 2, this.f24340b, false);
        C7140c.m21210b(parcel, m21209a);
    }
}
