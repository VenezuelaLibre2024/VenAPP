package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.w2;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.n0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class u2 {

    /* renamed from: a */
    public static final n0.a<Long> f2281a = n0.a.a("camera2.streamSpec.streamUseCase", Long.TYPE);

    /* renamed from: b */
    private static final Map<Long, Set<l2.b>> f2282b;

    /* renamed from: c */
    private static final Map<Long, Set<l2.b>> f2283c;

    static {
        HashMap hashMap = new HashMap();
        f2282b = hashMap;
        HashMap hashMap2 = new HashMap();
        f2283c = hashMap2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            l2.b bVar = l2.b.PREVIEW;
            hashSet.add(bVar);
            hashMap.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(bVar);
            hashSet2.add(l2.b.IMAGE_ANALYSIS);
            hashMap.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            l2.b bVar2 = l2.b.IMAGE_CAPTURE;
            hashSet3.add(bVar2);
            hashMap.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            l2.b bVar3 = l2.b.VIDEO_CAPTURE;
            hashSet4.add(bVar3);
            hashMap.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(bVar);
            hashSet5.add(bVar2);
            hashSet5.add(bVar3);
            hashMap2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(bVar);
            hashSet6.add(bVar3);
            hashMap2.put(3L, hashSet6);
        }
    }

    public static boolean a(Map<Integer, androidx.camera.core.impl.a> map, Map<Integer, androidx.camera.core.impl.k2<?>> map2, List<androidx.camera.core.impl.d2> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            long f10 = list.get(i10).f();
            if (map.containsKey(Integer.valueOf(i10))) {
                androidx.camera.core.impl.a aVar = map.get(Integer.valueOf(i10));
                if (!g(aVar.b().size() == 1 ? aVar.b().get(0) : l2.b.STREAM_SHARING, f10, aVar.b())) {
                    return false;
                }
            } else {
                if (!map2.containsKey(Integer.valueOf(i10))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                androidx.camera.core.impl.k2<?> k2Var = map2.get(Integer.valueOf(i10));
                if (!g(k2Var.N(), f10, k2Var.N() == l2.b.STREAM_SHARING ? ((i0.f) k2Var).W() : Collections.emptyList())) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean b(Set<Long> set, Set<Long> set2) {
        Iterator<Long> it = set2.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(androidx.camera.camera2.internal.compat.d0 d0Var, List<androidx.camera.core.impl.d2> list) {
        long[] jArr;
        if (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) d0Var.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (long j10 : jArr) {
            hashSet.add(Long.valueOf(j10));
        }
        Iterator<androidx.camera.core.impl.d2> it = list.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(Long.valueOf(it.next().f()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(List<androidx.camera.core.impl.a> list, List<androidx.camera.core.impl.k2<?>> list2) {
        for (androidx.camera.core.impl.a aVar : list) {
            if (j(aVar.e(), aVar.b().get(0))) {
                return true;
            }
        }
        for (androidx.camera.core.impl.k2<?> k2Var : list2) {
            if (j(k2Var, k2Var.N())) {
                return true;
            }
        }
        return false;
    }

    public static q.a e(androidx.camera.core.impl.k2<?> k2Var) {
        androidx.camera.core.impl.m1 a02 = androidx.camera.core.impl.m1.a0();
        n0.a<?> aVar = q.a.I;
        if (k2Var.b(aVar)) {
            a02.r(aVar, (Long) k2Var.a(aVar));
        }
        n0.a<?> aVar2 = androidx.camera.core.impl.k2.f2533y;
        if (k2Var.b(aVar2)) {
            a02.r(aVar2, (Boolean) k2Var.a(aVar2));
        }
        n0.a<?> aVar3 = androidx.camera.core.impl.d1.H;
        if (k2Var.b(aVar3)) {
            a02.r(aVar3, (Integer) k2Var.a(aVar3));
        }
        n0.a<?> aVar4 = androidx.camera.core.impl.e1.f2456f;
        if (k2Var.b(aVar4)) {
            a02.r(aVar4, (Integer) k2Var.a(aVar4));
        }
        return new q.a(a02);
    }

    private static androidx.camera.core.impl.n0 f(androidx.camera.core.impl.n0 n0Var, long j10) {
        n0.a<Long> aVar = f2281a;
        if (n0Var.b(aVar) && ((Long) n0Var.a(aVar)).longValue() == j10) {
            return null;
        }
        androidx.camera.core.impl.m1 b02 = androidx.camera.core.impl.m1.b0(n0Var);
        b02.r(aVar, Long.valueOf(j10));
        return new q.a(b02);
    }

    private static boolean g(l2.b bVar, long j10, List<l2.b> list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (bVar != l2.b.STREAM_SHARING) {
            Map<Long, Set<l2.b>> map = f2282b;
            return map.containsKey(Long.valueOf(j10)) && map.get(Long.valueOf(j10)).contains(bVar);
        }
        Map<Long, Set<l2.b>> map2 = f2283c;
        if (!map2.containsKey(Long.valueOf(j10))) {
            return false;
        }
        Set<l2.b> set = map2.get(Long.valueOf(j10));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator<l2.b> it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(androidx.camera.camera2.internal.compat.d0 d0Var) {
        long[] jArr;
        return (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) d0Var.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r9 != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r9 != false) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean i(java.util.List<androidx.camera.core.impl.a> r9, java.util.List<androidx.camera.core.impl.k2<?>> r10, java.util.Set<java.lang.Long> r11) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
            boolean r1 = r9.hasNext()
            r2 = 0
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L3e
            java.lang.Object r9 = r9.next()
            androidx.camera.core.impl.a r9 = (androidx.camera.core.impl.a) r9
            androidx.camera.core.impl.n0 r1 = r9.e()
            androidx.camera.core.impl.n0$a<java.lang.Long> r6 = q.a.I
            boolean r1 = r1.b(r6)
            if (r1 != 0) goto L28
        L25:
            r1 = r4
            r9 = r5
            goto L40
        L28:
            androidx.camera.core.impl.n0 r9 = r9.e()
            java.lang.Object r9 = r9.a(r6)
            java.lang.Long r9 = (java.lang.Long) r9
            long r6 = r9.longValue()
            int r9 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r9 != 0) goto L3b
            goto L25
        L3b:
            r9 = r4
            r1 = r5
            goto L40
        L3e:
            r9 = r5
            r1 = r9
        L40:
            java.util.Iterator r10 = r10.iterator()
        L44:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L7e
            java.lang.Object r6 = r10.next()
            androidx.camera.core.impl.k2 r6 = (androidx.camera.core.impl.k2) r6
            androidx.camera.core.impl.n0$a<java.lang.Long> r7 = q.a.I
            boolean r8 = r6.b(r7)
            if (r8 != 0) goto L5f
            if (r9 == 0) goto L5d
        L5a:
            o()
        L5d:
            r1 = r4
            goto L44
        L5f:
            java.lang.Object r6 = r6.a(r7)
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 != 0) goto L70
            if (r9 == 0) goto L5d
            goto L5a
        L70:
            if (r1 == 0) goto L75
            o()
        L75:
            java.lang.Long r9 = java.lang.Long.valueOf(r6)
            r0.add(r9)
            r9 = r4
            goto L44
        L7e:
            if (r1 != 0) goto L87
            boolean r9 = b(r11, r0)
            if (r9 == 0) goto L87
            goto L88
        L87:
            r4 = r5
        L88:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.u2.i(java.util.List, java.util.List, java.util.Set):boolean");
    }

    private static boolean j(androidx.camera.core.impl.n0 n0Var, l2.b bVar) {
        if (((Boolean) n0Var.g(androidx.camera.core.impl.k2.f2533y, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        n0.a<Integer> aVar = androidx.camera.core.impl.d1.H;
        return n0Var.b(aVar) && l3.b(bVar, ((Integer) n0Var.a(aVar)).intValue()) == 5;
    }

    public static boolean k(androidx.camera.camera2.internal.compat.d0 d0Var, List<androidx.camera.core.impl.a> list, Map<androidx.camera.core.impl.k2<?>, androidx.camera.core.impl.b2> map, Map<androidx.camera.core.impl.a, androidx.camera.core.impl.b2> map2) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        ArrayList<androidx.camera.core.impl.k2<?>> arrayList = new ArrayList(map.keySet());
        Iterator<androidx.camera.core.impl.a> it = list.iterator();
        while (it.hasNext()) {
            androidx.core.util.h.k(it.next().e());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            androidx.core.util.h.k(((androidx.camera.core.impl.b2) androidx.core.util.h.k(map.get((androidx.camera.core.impl.k2) it2.next()))).d());
        }
        long[] jArr = (long[]) d0Var.a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
        if (jArr != null && jArr.length != 0) {
            HashSet hashSet = new HashSet();
            for (long j10 : jArr) {
                hashSet.add(Long.valueOf(j10));
            }
            if (i(list, arrayList, hashSet)) {
                for (androidx.camera.core.impl.a aVar : list) {
                    androidx.camera.core.impl.n0 e10 = aVar.e();
                    androidx.camera.core.impl.n0 f10 = f(e10, ((Long) e10.a(q.a.I)).longValue());
                    if (f10 != null) {
                        map2.put(aVar, aVar.i(f10));
                    }
                }
                for (androidx.camera.core.impl.k2<?> k2Var : arrayList) {
                    androidx.camera.core.impl.b2 b2Var = map.get(k2Var);
                    androidx.camera.core.impl.n0 d10 = b2Var.d();
                    androidx.camera.core.impl.n0 f11 = f(d10, ((Long) d10.a(q.a.I)).longValue());
                    if (f11 != null) {
                        map.put(k2Var, b2Var.f().d(f11).a());
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static void l(Map<androidx.camera.core.impl.k2<?>, androidx.camera.core.impl.b2> map, Map<androidx.camera.core.impl.a, androidx.camera.core.impl.b2> map2, Map<Integer, androidx.camera.core.impl.a> map3, Map<Integer, androidx.camera.core.impl.k2<?>> map4, List<androidx.camera.core.impl.d2> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            long f10 = list.get(i10).f();
            if (map3.containsKey(Integer.valueOf(i10))) {
                androidx.camera.core.impl.a aVar = map3.get(Integer.valueOf(i10));
                androidx.camera.core.impl.n0 f11 = f(aVar.e(), f10);
                if (f11 != null) {
                    map2.put(aVar, aVar.i(f11));
                }
            } else {
                if (!map4.containsKey(Integer.valueOf(i10))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                androidx.camera.core.impl.k2<?> k2Var = map4.get(Integer.valueOf(i10));
                androidx.camera.core.impl.b2 b2Var = map.get(k2Var);
                androidx.camera.core.impl.n0 f12 = f(b2Var.d(), f10);
                if (f12 != null) {
                    map.put(k2Var, b2Var.f().d(f12).a());
                }
            }
        }
    }

    public static void m(Collection<androidx.camera.core.impl.y1> collection, Collection<androidx.camera.core.impl.k2<?>> collection2, Map<androidx.camera.core.impl.r0, Long> map) {
        boolean z10;
        ArrayList arrayList = new ArrayList(collection2);
        Iterator<androidx.camera.core.impl.y1> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            androidx.camera.core.impl.y1 next = it.next();
            androidx.camera.core.impl.n0 d10 = next.d();
            n0.a<Long> aVar = f2281a;
            z10 = true;
            if (!d10.b(aVar) || next.k().size() == 1) {
                if (next.d().b(aVar)) {
                    break;
                }
            } else {
                w.o0.c("Camera2CameraImpl", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(next.k().size())));
                return;
            }
        }
        if (z10) {
            int i10 = 0;
            for (androidx.camera.core.impl.y1 y1Var : collection) {
                if (((androidx.camera.core.impl.k2) arrayList.get(i10)).N() == l2.b.METERING_REPEATING) {
                    map.put(y1Var.k().get(0), 1L);
                } else {
                    androidx.camera.core.impl.n0 d11 = y1Var.d();
                    n0.a<Long> aVar2 = f2281a;
                    if (d11.b(aVar2)) {
                        map.put(y1Var.k().get(0), (Long) y1Var.d().a(aVar2));
                    }
                }
                i10++;
            }
        }
    }

    public static boolean n(w2.b bVar) {
        return bVar.a() == 0 && bVar.b() == 8;
    }

    private static void o() {
        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
    }
}
