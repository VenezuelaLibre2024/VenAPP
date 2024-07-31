package p363t8;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.common.collect.AbstractC5907w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p361t6.InterfaceC11076o;

/* renamed from: t8.c */
/* loaded from: classes.dex */
public final class C11141c {
    private C11141c() {
    }

    /* renamed from: a */
    public static void m34615a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) C11172r0.m34928j(C11141c.class.getClassLoader()));
        }
    }

    /* renamed from: b */
    public static <T extends InterfaceC11076o> AbstractC5907w<T> m34616b(InterfaceC11076o.a<T> aVar, List<Bundle> list) {
        AbstractC5907w.a m15077p = AbstractC5907w.m15077p();
        for (int i10 = 0; i10 < list.size(); i10++) {
            m15077p.mo14724a(aVar.mo22759a((Bundle) C11137a.m34603e(list.get(i10))));
        }
        return m15077p.m15094k();
    }

    /* renamed from: c */
    public static <T extends InterfaceC11076o> SparseArray<T> m34617c(InterfaceC11076o.a<T> aVar, SparseArray<Bundle> sparseArray) {
        SparseArray<T> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), aVar.mo22759a(sparseArray.valueAt(i10)));
        }
        return sparseArray2;
    }

    /* renamed from: d */
    public static <T extends InterfaceC11076o> ArrayList<Bundle> m34618d(Collection<T> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo22762a());
        }
        return arrayList;
    }

    /* renamed from: e */
    public static <T extends InterfaceC11076o> SparseArray<Bundle> m34619e(SparseArray<T> sparseArray) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10).mo22762a());
        }
        return sparseArray2;
    }
}
