package oc;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class l0 extends ea.a {
    public static final Parcelable.Creator<l0> CREATOR = new k0();

    /* renamed from: a, reason: collision with root package name */
    private final List<com.google.firebase.auth.t0> f22406a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.google.firebase.auth.y0> f22407b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(List<com.google.firebase.auth.t0> list, List<com.google.firebase.auth.y0> list2) {
        this.f22406a = list == null ? new ArrayList<>() : list;
        this.f22407b = list2 == null ? new ArrayList<>() : list2;
    }

    public static l0 v1(List<com.google.firebase.auth.j0> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.google.firebase.auth.j0 j0Var : list) {
            if (j0Var instanceof com.google.firebase.auth.t0) {
                arrayList.add((com.google.firebase.auth.t0) j0Var);
            } else if (j0Var instanceof com.google.firebase.auth.y0) {
                arrayList2.add((com.google.firebase.auth.y0) j0Var);
            }
        }
        return new l0(arrayList, arrayList2);
    }

    public final List<com.google.firebase.auth.j0> u1() {
        ArrayList arrayList = new ArrayList();
        Iterator<com.google.firebase.auth.t0> it = this.f22406a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        Iterator<com.google.firebase.auth.y0> it2 = this.f22407b.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = ea.c.a(parcel);
        ea.c.K(parcel, 1, this.f22406a, false);
        ea.c.K(parcel, 2, this.f22407b, false);
        ea.c.b(parcel, a10);
    }
}
