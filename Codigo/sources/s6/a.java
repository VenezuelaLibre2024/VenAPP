package s6;

import android.util.SparseArray;
import f6.d;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static SparseArray<d> f25145a = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    private static HashMap<d, Integer> f25146b;

    static {
        HashMap<d, Integer> hashMap = new HashMap<>();
        f25146b = hashMap;
        hashMap.put(d.DEFAULT, 0);
        f25146b.put(d.VERY_LOW, 1);
        f25146b.put(d.HIGHEST, 2);
        for (d dVar : f25146b.keySet()) {
            f25145a.append(f25146b.get(dVar).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = f25146b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i10) {
        d dVar = f25145a.get(i10);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
