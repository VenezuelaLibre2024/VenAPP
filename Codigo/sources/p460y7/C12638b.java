package p460y7;

import android.os.SystemClock;
import android.util.Pair;
import com.google.common.collect.C5867e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import p363t8.C11172r0;
import p482z7.C12810b;

/* renamed from: y7.b */
/* loaded from: classes.dex */
public final class C12638b {

    /* renamed from: a */
    private final Map<String, Long> f34336a;

    /* renamed from: b */
    private final Map<Integer, Long> f34337b;

    /* renamed from: c */
    private final Map<List<Pair<String, Integer>>, C12810b> f34338c;

    /* renamed from: d */
    private final Random f34339d;

    public C12638b() {
        this(new Random());
    }

    C12638b(Random random) {
        this.f34338c = new HashMap();
        this.f34339d = random;
        this.f34336a = new HashMap();
        this.f34337b = new HashMap();
    }

    /* renamed from: b */
    private static <T> void m41608b(T t10, long j10, Map<T, Long> map) {
        if (map.containsKey(t10)) {
            j10 = Math.max(j10, ((Long) C11172r0.m34928j(map.get(t10))).longValue());
        }
        map.put(t10, Long.valueOf(j10));
    }

    /* renamed from: c */
    private List<C12810b> m41609c(List<C12810b> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        m41612h(elapsedRealtime, this.f34336a);
        m41612h(elapsedRealtime, this.f34337b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C12810b c12810b = list.get(i10);
            if (!this.f34336a.containsKey(c12810b.f34907b) && !this.f34337b.containsKey(Integer.valueOf(c12810b.f34908c))) {
                arrayList.add(c12810b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static int m41610d(C12810b c12810b, C12810b c12810b2) {
        int compare = Integer.compare(c12810b.f34908c, c12810b2.f34908c);
        return compare != 0 ? compare : c12810b.f34907b.compareTo(c12810b2.f34907b);
    }

    /* renamed from: f */
    public static int m41611f(List<C12810b> list) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashSet.add(Integer.valueOf(list.get(i10).f34908c));
        }
        return hashSet.size();
    }

    /* renamed from: h */
    private static <T> void m41612h(long j10, Map<T, Long> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<T, Long> entry : map.entrySet()) {
            if (entry.getValue().longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    /* renamed from: k */
    private C12810b m41613k(List<C12810b> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += list.get(i11).f34909d;
        }
        int nextInt = this.f34339d.nextInt(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            C12810b c12810b = list.get(i13);
            i12 += c12810b.f34909d;
            if (nextInt < i12) {
                return c12810b;
            }
        }
        return (C12810b) C5867e0.m14838d(list);
    }

    /* renamed from: e */
    public void m41614e(C12810b c12810b, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        m41608b(c12810b.f34907b, elapsedRealtime, this.f34336a);
        int i10 = c12810b.f34908c;
        if (i10 != Integer.MIN_VALUE) {
            m41608b(Integer.valueOf(i10), elapsedRealtime, this.f34337b);
        }
    }

    /* renamed from: g */
    public int m41615g(List<C12810b> list) {
        HashSet hashSet = new HashSet();
        List<C12810b> m41609c = m41609c(list);
        for (int i10 = 0; i10 < m41609c.size(); i10++) {
            hashSet.add(Integer.valueOf(m41609c.get(i10).f34908c));
        }
        return hashSet.size();
    }

    /* renamed from: i */
    public void m41616i() {
        this.f34336a.clear();
        this.f34337b.clear();
        this.f34338c.clear();
    }

    /* renamed from: j */
    public C12810b m41617j(List<C12810b> list) {
        Object obj;
        List<C12810b> m41609c = m41609c(list);
        if (m41609c.size() >= 2) {
            Collections.sort(m41609c, new Comparator() { // from class: y7.a
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    int m41610d;
                    m41610d = C12638b.m41610d((C12810b) obj2, (C12810b) obj3);
                    return m41610d;
                }
            });
            ArrayList arrayList = new ArrayList();
            int i10 = m41609c.get(0).f34908c;
            int i11 = 0;
            while (true) {
                if (i11 >= m41609c.size()) {
                    break;
                }
                C12810b c12810b = m41609c.get(i11);
                if (i10 == c12810b.f34908c) {
                    arrayList.add(new Pair(c12810b.f34907b, Integer.valueOf(c12810b.f34909d)));
                    i11++;
                } else if (arrayList.size() == 1) {
                    obj = m41609c.get(0);
                }
            }
            C12810b c12810b2 = this.f34338c.get(arrayList);
            if (c12810b2 != null) {
                return c12810b2;
            }
            C12810b m41613k = m41613k(m41609c.subList(0, arrayList.size()));
            this.f34338c.put(arrayList, m41613k);
            return m41613k;
        }
        obj = C5867e0.m14837c(m41609c, null);
        return (C12810b) obj;
    }
}
