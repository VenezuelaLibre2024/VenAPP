package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.camera2.internal.C0570w2;
import androidx.camera.camera2.internal.compat.C0427d0;
import androidx.camera.core.impl.AbstractC0597a;
import androidx.camera.core.impl.AbstractC0604b2;
import androidx.camera.core.impl.AbstractC0612d2;
import androidx.camera.core.impl.AbstractC0661r0;
import androidx.camera.core.impl.C0611d1;
import androidx.camera.core.impl.C0647m1;
import androidx.camera.core.impl.C0701y1;
import androidx.camera.core.impl.InterfaceC0615e1;
import androidx.camera.core.impl.InterfaceC0640k2;
import androidx.camera.core.impl.InterfaceC0644l2;
import androidx.camera.core.impl.InterfaceC0649n0;
import androidx.core.util.C0984h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p148i0.C7764f;
import p298q.C10214a;
import p407w.C12029o0;

/* renamed from: androidx.camera.camera2.internal.u2 */
/* loaded from: classes.dex */
public final class C0560u2 {

    /* renamed from: a */
    public static final InterfaceC0649n0.a<Long> f2602a = InterfaceC0649n0.a.m3199a("camera2.streamSpec.streamUseCase", Long.TYPE);

    /* renamed from: b */
    private static final Map<Long, Set<InterfaceC0644l2.b>> f2603b;

    /* renamed from: c */
    private static final Map<Long, Set<InterfaceC0644l2.b>> f2604c;

    static {
        HashMap hashMap = new HashMap();
        f2603b = hashMap;
        HashMap hashMap2 = new HashMap();
        f2604c = hashMap2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            InterfaceC0644l2.b bVar = InterfaceC0644l2.b.PREVIEW;
            hashSet.add(bVar);
            hashMap.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(bVar);
            hashSet2.add(InterfaceC0644l2.b.IMAGE_ANALYSIS);
            hashMap.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            InterfaceC0644l2.b bVar2 = InterfaceC0644l2.b.IMAGE_CAPTURE;
            hashSet3.add(bVar2);
            hashMap.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            InterfaceC0644l2.b bVar3 = InterfaceC0644l2.b.VIDEO_CAPTURE;
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

    /* renamed from: a */
    public static boolean m2754a(Map<Integer, AbstractC0597a> map, Map<Integer, InterfaceC0640k2<?>> map2, List<AbstractC0612d2> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            long mo3032f = list.get(i10).mo3032f();
            if (map.containsKey(Integer.valueOf(i10))) {
                AbstractC0597a abstractC0597a = map.get(Integer.valueOf(i10));
                if (!m2760g(abstractC0597a.mo2972b().size() == 1 ? abstractC0597a.mo2972b().get(0) : InterfaceC0644l2.b.STREAM_SHARING, mo3032f, abstractC0597a.mo2972b())) {
                    return false;
                }
            } else {
                if (!map2.containsKey(Integer.valueOf(i10))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                InterfaceC0640k2<?> interfaceC0640k2 = map2.get(Integer.valueOf(i10));
                if (!m2760g(interfaceC0640k2.mo2588N(), mo3032f, interfaceC0640k2.mo2588N() == InterfaceC0644l2.b.STREAM_SHARING ? ((C7764f) interfaceC0640k2).m23696W() : Collections.emptyList())) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m2755b(Set<Long> set, Set<Long> set2) {
        Iterator<Long> it = set2.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m2756c(C0427d0 c0427d0, List<AbstractC0612d2> list) {
        long[] jArr;
        if (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) c0427d0.m2215a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (long j10 : jArr) {
            hashSet.add(Long.valueOf(j10));
        }
        Iterator<AbstractC0612d2> it = list.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(Long.valueOf(it.next().mo3032f()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m2757d(List<AbstractC0597a> list, List<InterfaceC0640k2<?>> list2) {
        for (AbstractC0597a abstractC0597a : list) {
            if (m2763j(abstractC0597a.mo2975e(), abstractC0597a.mo2972b().get(0))) {
                return true;
            }
        }
        for (InterfaceC0640k2<?> interfaceC0640k2 : list2) {
            if (m2763j(interfaceC0640k2, interfaceC0640k2.mo2588N())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static C10214a m2758e(InterfaceC0640k2<?> interfaceC0640k2) {
        C0647m1 m3184a0 = C0647m1.m3184a0();
        InterfaceC0649n0.a<?> aVar = C10214a.f25246I;
        if (interfaceC0640k2.mo3192b(aVar)) {
            m3184a0.mo3178r(aVar, (Long) interfaceC0640k2.mo3191a(aVar));
        }
        InterfaceC0649n0.a<?> aVar2 = InterfaceC0640k2.f2872y;
        if (interfaceC0640k2.mo3192b(aVar2)) {
            m3184a0.mo3178r(aVar2, (Boolean) interfaceC0640k2.mo3191a(aVar2));
        }
        InterfaceC0649n0.a<?> aVar3 = C0611d1.f2780H;
        if (interfaceC0640k2.mo3192b(aVar3)) {
            m3184a0.mo3178r(aVar3, (Integer) interfaceC0640k2.mo3191a(aVar3));
        }
        InterfaceC0649n0.a<?> aVar4 = InterfaceC0615e1.f2794f;
        if (interfaceC0640k2.mo3192b(aVar4)) {
            m3184a0.mo3178r(aVar4, (Integer) interfaceC0640k2.mo3191a(aVar4));
        }
        return new C10214a(m3184a0);
    }

    /* renamed from: f */
    private static InterfaceC0649n0 m2759f(InterfaceC0649n0 interfaceC0649n0, long j10) {
        InterfaceC0649n0.a<Long> aVar = f2602a;
        if (interfaceC0649n0.mo3192b(aVar) && ((Long) interfaceC0649n0.mo3191a(aVar)).longValue() == j10) {
            return null;
        }
        C0647m1 m3185b0 = C0647m1.m3185b0(interfaceC0649n0);
        m3185b0.mo3178r(aVar, Long.valueOf(j10));
        return new C10214a(m3185b0);
    }

    /* renamed from: g */
    private static boolean m2760g(InterfaceC0644l2.b bVar, long j10, List<InterfaceC0644l2.b> list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (bVar != InterfaceC0644l2.b.STREAM_SHARING) {
            Map<Long, Set<InterfaceC0644l2.b>> map = f2603b;
            return map.containsKey(Long.valueOf(j10)) && map.get(Long.valueOf(j10)).contains(bVar);
        }
        Map<Long, Set<InterfaceC0644l2.b>> map2 = f2604c;
        if (!map2.containsKey(Long.valueOf(j10))) {
            return false;
        }
        Set<InterfaceC0644l2.b> set = map2.get(Long.valueOf(j10));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator<InterfaceC0644l2.b> it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m2761h(C0427d0 c0427d0) {
        long[] jArr;
        return (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) c0427d0.m2215a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r9 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        m2768o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r9 != false) goto L18;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m2762i(java.util.List<androidx.camera.core.impl.AbstractC0597a> r9, java.util.List<androidx.camera.core.impl.InterfaceC0640k2<?>> r10, java.util.Set<java.lang.Long> r11) {
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
            androidx.camera.core.impl.a r9 = (androidx.camera.core.impl.AbstractC0597a) r9
            androidx.camera.core.impl.n0 r1 = r9.mo2975e()
            androidx.camera.core.impl.n0$a<java.lang.Long> r6 = p298q.C10214a.f25246I
            boolean r1 = r1.mo3192b(r6)
            if (r1 != 0) goto L28
        L25:
            r1 = r4
            r9 = r5
            goto L40
        L28:
            androidx.camera.core.impl.n0 r9 = r9.mo2975e()
            java.lang.Object r9 = r9.mo3191a(r6)
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
            androidx.camera.core.impl.k2 r6 = (androidx.camera.core.impl.InterfaceC0640k2) r6
            androidx.camera.core.impl.n0$a<java.lang.Long> r7 = p298q.C10214a.f25246I
            boolean r8 = r6.mo3192b(r7)
            if (r8 != 0) goto L5f
            if (r9 == 0) goto L5d
        L5a:
            m2768o()
        L5d:
            r1 = r4
            goto L44
        L5f:
            java.lang.Object r6 = r6.mo3191a(r7)
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 != 0) goto L70
            if (r9 == 0) goto L5d
            goto L5a
        L70:
            if (r1 == 0) goto L75
            m2768o()
        L75:
            java.lang.Long r9 = java.lang.Long.valueOf(r6)
            r0.add(r9)
            r9 = r4
            goto L44
        L7e:
            if (r1 != 0) goto L87
            boolean r9 = m2755b(r11, r0)
            if (r9 == 0) goto L87
            goto L88
        L87:
            r4 = r5
        L88:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.C0560u2.m2762i(java.util.List, java.util.List, java.util.Set):boolean");
    }

    /* renamed from: j */
    private static boolean m2763j(InterfaceC0649n0 interfaceC0649n0, InterfaceC0644l2.b bVar) {
        if (((Boolean) interfaceC0649n0.mo3197g(InterfaceC0640k2.f2872y, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        InterfaceC0649n0.a<Integer> aVar = C0611d1.f2780H;
        return interfaceC0649n0.mo3192b(aVar) && C0516l3.m2552b(bVar, ((Integer) interfaceC0649n0.mo3191a(aVar)).intValue()) == 5;
    }

    /* renamed from: k */
    public static boolean m2764k(C0427d0 c0427d0, List<AbstractC0597a> list, Map<InterfaceC0640k2<?>, AbstractC0604b2> map, Map<AbstractC0597a, AbstractC0604b2> map2) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        ArrayList<InterfaceC0640k2<?>> arrayList = new ArrayList(map.keySet());
        Iterator<AbstractC0597a> it = list.iterator();
        while (it.hasNext()) {
            C0984h.m4833k(it.next().mo2975e());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0984h.m4833k(((AbstractC0604b2) C0984h.m4833k(map.get((InterfaceC0640k2) it2.next()))).mo2988d());
        }
        long[] jArr = (long[]) c0427d0.m2215a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
        if (jArr != null && jArr.length != 0) {
            HashSet hashSet = new HashSet();
            for (long j10 : jArr) {
                hashSet.add(Long.valueOf(j10));
            }
            if (m2762i(list, arrayList, hashSet)) {
                for (AbstractC0597a abstractC0597a : list) {
                    InterfaceC0649n0 mo2975e = abstractC0597a.mo2975e();
                    InterfaceC0649n0 m2759f = m2759f(mo2975e, ((Long) mo2975e.mo3191a(C10214a.f25246I)).longValue());
                    if (m2759f != null) {
                        map2.put(abstractC0597a, abstractC0597a.m2979i(m2759f));
                    }
                }
                for (InterfaceC0640k2<?> interfaceC0640k2 : arrayList) {
                    AbstractC0604b2 abstractC0604b2 = map.get(interfaceC0640k2);
                    InterfaceC0649n0 mo2988d = abstractC0604b2.mo2988d();
                    InterfaceC0649n0 m2759f2 = m2759f(mo2988d, ((Long) mo2988d.mo3191a(C10214a.f25246I)).longValue());
                    if (m2759f2 != null) {
                        map.put(interfaceC0640k2, abstractC0604b2.mo2990f().mo2994d(m2759f2).mo2991a());
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public static void m2765l(Map<InterfaceC0640k2<?>, AbstractC0604b2> map, Map<AbstractC0597a, AbstractC0604b2> map2, Map<Integer, AbstractC0597a> map3, Map<Integer, InterfaceC0640k2<?>> map4, List<AbstractC0612d2> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            long mo3032f = list.get(i10).mo3032f();
            if (map3.containsKey(Integer.valueOf(i10))) {
                AbstractC0597a abstractC0597a = map3.get(Integer.valueOf(i10));
                InterfaceC0649n0 m2759f = m2759f(abstractC0597a.mo2975e(), mo3032f);
                if (m2759f != null) {
                    map2.put(abstractC0597a, abstractC0597a.m2979i(m2759f));
                }
            } else {
                if (!map4.containsKey(Integer.valueOf(i10))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                InterfaceC0640k2<?> interfaceC0640k2 = map4.get(Integer.valueOf(i10));
                AbstractC0604b2 abstractC0604b2 = map.get(interfaceC0640k2);
                InterfaceC0649n0 m2759f2 = m2759f(abstractC0604b2.mo2988d(), mo3032f);
                if (m2759f2 != null) {
                    map.put(interfaceC0640k2, abstractC0604b2.mo2990f().mo2994d(m2759f2).mo2991a());
                }
            }
        }
    }

    /* renamed from: m */
    public static void m2766m(Collection<C0701y1> collection, Collection<InterfaceC0640k2<?>> collection2, Map<AbstractC0661r0, Long> map) {
        boolean z10;
        ArrayList arrayList = new ArrayList(collection2);
        Iterator<C0701y1> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            C0701y1 next = it.next();
            InterfaceC0649n0 m3382d = next.m3382d();
            InterfaceC0649n0.a<Long> aVar = f2602a;
            z10 = true;
            if (!m3382d.mo3192b(aVar) || next.m3389k().size() == 1) {
                if (next.m3382d().mo3192b(aVar)) {
                    break;
                }
            } else {
                C12029o0.m38640c("Camera2CameraImpl", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(next.m3389k().size())));
                return;
            }
        }
        if (z10) {
            int i10 = 0;
            for (C0701y1 c0701y1 : collection) {
                if (((InterfaceC0640k2) arrayList.get(i10)).mo2588N() == InterfaceC0644l2.b.METERING_REPEATING) {
                    map.put(c0701y1.m3389k().get(0), 1L);
                } else {
                    InterfaceC0649n0 m3382d2 = c0701y1.m3382d();
                    InterfaceC0649n0.a<Long> aVar2 = f2602a;
                    if (m3382d2.mo3192b(aVar2)) {
                        map.put(c0701y1.m3389k().get(0), (Long) c0701y1.m3382d().mo3191a(aVar2));
                    }
                }
                i10++;
            }
        }
    }

    /* renamed from: n */
    public static boolean m2767n(C0570w2.b bVar) {
        return bVar.mo2362a() == 0 && bVar.mo2363b() == 8;
    }

    /* renamed from: o */
    private static void m2768o() {
        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
    }
}
