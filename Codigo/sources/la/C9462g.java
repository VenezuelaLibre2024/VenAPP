package la;

import androidx.collection.C0731a;
import androidx.collection.C0732b;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: la.g */
/* loaded from: classes.dex */
public final class C9462g {
    @Deprecated
    /* renamed from: a */
    public static <T> List<T> m28133a(T t10) {
        return Collections.singletonList(t10);
    }

    @Deprecated
    /* renamed from: b */
    public static <T> List<T> m28134b(T... tArr) {
        int length = tArr.length;
        return length != 0 ? length != 1 ? Collections.unmodifiableList(Arrays.asList(tArr)) : Collections.singletonList(tArr[0]) : Collections.emptyList();
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m28135c(K k10, V v10, K k11, V v11, K k12, V v12) {
        Map m28139g = m28139g(3, false);
        m28139g.put(k10, v10);
        m28139g.put(k11, v11);
        m28139g.put(k12, v12);
        return Collections.unmodifiableMap(m28139g);
    }

    /* renamed from: d */
    public static <K, V> Map<K, V> m28136d(K[] kArr, V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException("Key and values array lengths not equal: " + length + " != " + length2);
        }
        if (length == 0) {
            return Collections.emptyMap();
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map m28139g = m28139g(length, false);
        for (int i10 = 0; i10 < kArr.length; i10++) {
            m28139g.put(kArr[i10], vArr[i10]);
        }
        return Collections.unmodifiableMap(m28139g);
    }

    @Deprecated
    /* renamed from: e */
    public static <T> Set<T> m28137e(T t10, T t11, T t12) {
        Set m28140h = m28140h(3, false);
        m28140h.add(t10);
        m28140h.add(t11);
        m28140h.add(t12);
        return Collections.unmodifiableSet(m28140h);
    }

    @Deprecated
    /* renamed from: f */
    public static <T> Set<T> m28138f(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t10 = tArr[0];
            T t11 = tArr[1];
            Set m28140h = m28140h(2, false);
            m28140h.add(t10);
            m28140h.add(t11);
            return Collections.unmodifiableSet(m28140h);
        }
        if (length == 3) {
            return m28137e(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set m28140h2 = m28140h(length, false);
            Collections.addAll(m28140h2, tArr);
            return Collections.unmodifiableSet(m28140h2);
        }
        T t12 = tArr[0];
        T t13 = tArr[1];
        T t14 = tArr[2];
        T t15 = tArr[3];
        Set m28140h3 = m28140h(4, false);
        m28140h3.add(t12);
        m28140h3.add(t13);
        m28140h3.add(t14);
        m28140h3.add(t15);
        return Collections.unmodifiableSet(m28140h3);
    }

    /* renamed from: g */
    private static Map m28139g(int i10, boolean z10) {
        return i10 <= 256 ? new C0731a(i10) : new HashMap(i10, 1.0f);
    }

    /* renamed from: h */
    private static Set m28140h(int i10, boolean z10) {
        if (i10 <= (true != z10 ? RecognitionOptions.QR_CODE : RecognitionOptions.ITF)) {
            return new C0732b(i10);
        }
        return new HashSet(i10, true != z10 ? 1.0f : 0.75f);
    }
}
