package p349s6;

import android.util.SparseArray;
import java.util.HashMap;
import p098f6.EnumC7300d;

/* renamed from: s6.a */
/* loaded from: classes.dex */
public final class C10801a {

    /* renamed from: a */
    private static SparseArray<EnumC7300d> f27264a = new SparseArray<>();

    /* renamed from: b */
    private static HashMap<EnumC7300d, Integer> f27265b;

    static {
        HashMap<EnumC7300d, Integer> hashMap = new HashMap<>();
        f27265b = hashMap;
        hashMap.put(EnumC7300d.DEFAULT, 0);
        f27265b.put(EnumC7300d.VERY_LOW, 1);
        f27265b.put(EnumC7300d.HIGHEST, 2);
        for (EnumC7300d enumC7300d : f27265b.keySet()) {
            f27264a.append(f27265b.get(enumC7300d).intValue(), enumC7300d);
        }
    }

    /* renamed from: a */
    public static int m32912a(EnumC7300d enumC7300d) {
        Integer num = f27265b.get(enumC7300d);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC7300d);
    }

    /* renamed from: b */
    public static EnumC7300d m32913b(int i10) {
        EnumC7300d enumC7300d = f27264a.get(i10);
        if (enumC7300d != null) {
            return enumC7300d;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i10);
    }
}
