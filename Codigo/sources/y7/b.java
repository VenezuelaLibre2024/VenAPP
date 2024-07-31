package y7;

import android.os.SystemClock;
import android.util.Pair;
import com.google.common.collect.e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import t8.r0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Long> f31800a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Integer, Long> f31801b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<List<Pair<String, Integer>>, z7.b> f31802c;

    /* renamed from: d, reason: collision with root package name */
    private final Random f31803d;

    public b() {
        this(new Random());
    }

    b(Random random) {
        this.f31802c = new HashMap();
        this.f31803d = random;
        this.f31800a = new HashMap();
        this.f31801b = new HashMap();
    }

    private static <T> void b(T t10, long j10, Map<T, Long> map) {
        if (map.containsKey(t10)) {
            j10 = Math.max(j10, ((Long) r0.j(map.get(t10))).longValue());
        }
        map.put(t10, Long.valueOf(j10));
    }

    private List<z7.b> c(List<z7.b> list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        h(elapsedRealtime, this.f31800a);
        h(elapsedRealtime, this.f31801b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            z7.b bVar = list.get(i10);
            if (!this.f31800a.containsKey(bVar.f32356b) && !this.f31801b.containsKey(Integer.valueOf(bVar.f32357c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(z7.b bVar, z7.b bVar2) {
        int compare = Integer.compare(bVar.f32357c, bVar2.f32357c);
        return compare != 0 ? compare : bVar.f32356b.compareTo(bVar2.f32356b);
    }

    public static int f(List<z7.b> list) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashSet.add(Integer.valueOf(list.get(i10).f32357c));
        }
        return hashSet.size();
    }

    private static <T> void h(long j10, Map<T, Long> map) {
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

    private z7.b k(List<z7.b> list) {
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            i10 += list.get(i11).f32358d;
        }
        int nextInt = this.f31803d.nextInt(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            z7.b bVar = list.get(i13);
            i12 += bVar.f32358d;
            if (nextInt < i12) {
                return bVar;
            }
        }
        return (z7.b) e0.d(list);
    }

    public void e(z7.b bVar, long j10) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j10;
        b(bVar.f32356b, elapsedRealtime, this.f31800a);
        int i10 = bVar.f32357c;
        if (i10 != Integer.MIN_VALUE) {
            b(Integer.valueOf(i10), elapsedRealtime, this.f31801b);
        }
    }

    public int g(List<z7.b> list) {
        HashSet hashSet = new HashSet();
        List<z7.b> c10 = c(list);
        for (int i10 = 0; i10 < c10.size(); i10++) {
            hashSet.add(Integer.valueOf(c10.get(i10).f32357c));
        }
        return hashSet.size();
    }

    public void i() {
        this.f31800a.clear();
        this.f31801b.clear();
        this.f31802c.clear();
    }

    public z7.b j(List<z7.b> list) {
        Object obj;
        List<z7.b> c10 = c(list);
        if (c10.size() >= 2) {
            Collections.sort(c10, new Comparator() { // from class: y7.a
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    int d10;
                    d10 = b.d((z7.b) obj2, (z7.b) obj3);
                    return d10;
                }
            });
            ArrayList arrayList = new ArrayList();
            int i10 = c10.get(0).f32357c;
            int i11 = 0;
            while (true) {
                if (i11 >= c10.size()) {
                    break;
                }
                z7.b bVar = c10.get(i11);
                if (i10 == bVar.f32357c) {
                    arrayList.add(new Pair(bVar.f32356b, Integer.valueOf(bVar.f32358d)));
                    i11++;
                } else if (arrayList.size() == 1) {
                    obj = c10.get(0);
                }
            }
            z7.b bVar2 = this.f31802c.get(arrayList);
            if (bVar2 != null) {
                return bVar2;
            }
            z7.b k10 = k(c10.subList(0, arrayList.size()));
            this.f31802c.put(arrayList, k10);
            return k10;
        }
        obj = e0.c(c10, null);
        return (z7.b) obj;
    }
}
