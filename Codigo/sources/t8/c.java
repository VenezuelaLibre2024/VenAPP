package t8;

import android.os.Bundle;
import android.util.SparseArray;
import com.google.common.collect.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import t6.o;

/* loaded from: classes.dex */
public final class c {
    private c() {
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) r0.j(c.class.getClassLoader()));
        }
    }

    public static <T extends t6.o> com.google.common.collect.w<T> b(o.a<T> aVar, List<Bundle> list) {
        w.a p10 = com.google.common.collect.w.p();
        for (int i10 = 0; i10 < list.size(); i10++) {
            p10.a(aVar.a((Bundle) a.e(list.get(i10))));
        }
        return p10.k();
    }

    public static <T extends t6.o> SparseArray<T> c(o.a<T> aVar, SparseArray<Bundle> sparseArray) {
        SparseArray<T> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), aVar.a(sparseArray.valueAt(i10)));
        }
        return sparseArray2;
    }

    public static <T extends t6.o> ArrayList<Bundle> d(Collection<T> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        return arrayList;
    }

    public static <T extends t6.o> SparseArray<Bundle> e(SparseArray<T> sparseArray) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), sparseArray.valueAt(i10).a());
        }
        return sparseArray2;
    }
}
