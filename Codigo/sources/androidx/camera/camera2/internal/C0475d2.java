package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.text.TextUtils;
import androidx.camera.camera2.internal.compat.C0427d0;
import androidx.camera.core.impl.AbstractC0597a;
import androidx.camera.core.impl.InterfaceC0640k2;
import androidx.core.util.C0984h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p320r.C10552a;
import p320r.C10553b;
import p407w.C12029o0;
import p407w.C12048y;

/* renamed from: androidx.camera.camera2.internal.d2 */
/* loaded from: classes.dex */
final class C0475d2 {

    /* renamed from: a */
    private final C0427d0 f2254a;

    /* renamed from: b */
    private final C10553b f2255b;

    /* renamed from: c */
    private final boolean f2256c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.d2$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        static C12048y m2325a(C0427d0 c0427d0) {
            Long l10 = (Long) c0427d0.m2215a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l10 != null) {
                return C10552a.m32037b(l10.longValue());
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0475d2(C0427d0 c0427d0) {
        this.f2254a = c0427d0;
        this.f2255b = C10553b.m32038a(c0427d0);
        int[] iArr = (int[]) c0427d0.m2215a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z10 = false;
        if (iArr != null) {
            int length = iArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (iArr[i10] == 18) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        this.f2256c = z10;
    }

    /* renamed from: a */
    private static boolean m2315a(C12048y c12048y, C12048y c12048y2) {
        C0984h.m4836n(c12048y2.m38703e(), "Fully specified range is not actually fully specified.");
        if (c12048y.m38701b() == 2 && c12048y2.m38701b() == 1) {
            return false;
        }
        if (c12048y.m38701b() == 2 || c12048y.m38701b() == 0 || c12048y.m38701b() == c12048y2.m38701b()) {
            return c12048y.m38700a() == 0 || c12048y.m38700a() == c12048y2.m38700a();
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m2316b(C12048y c12048y, C12048y c12048y2, Set<C12048y> set) {
        if (set.contains(c12048y2)) {
            return m2315a(c12048y, c12048y2);
        }
        C12029o0.m38638a("DynamicRangeResolver", String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", c12048y, c12048y2));
        return false;
    }

    /* renamed from: c */
    private static C12048y m2317c(C12048y c12048y, Collection<C12048y> collection, Set<C12048y> set) {
        if (c12048y.m38701b() == 1) {
            return null;
        }
        for (C12048y c12048y2 : collection) {
            C0984h.m4834l(c12048y2, "Fully specified DynamicRange cannot be null.");
            int m38701b = c12048y2.m38701b();
            C0984h.m4836n(c12048y2.m38703e(), "Fully specified DynamicRange must have fully defined encoding.");
            if (m38701b != 1 && m2316b(c12048y, c12048y2, set)) {
                return c12048y2;
            }
        }
        return null;
    }

    /* renamed from: e */
    private static boolean m2318e(C12048y c12048y) {
        return Objects.equals(c12048y, C12048y.f32039c);
    }

    /* renamed from: f */
    private static boolean m2319f(C12048y c12048y) {
        return c12048y.m38701b() == 2 || (c12048y.m38701b() != 0 && c12048y.m38700a() == 0) || (c12048y.m38701b() == 0 && c12048y.m38700a() != 0);
    }

    /* renamed from: h */
    private C12048y m2320h(C12048y c12048y, Set<C12048y> set, Set<C12048y> set2, Set<C12048y> set3, String str) {
        String format;
        C12048y c12048y2;
        if (c12048y.m38703e()) {
            if (set.contains(c12048y)) {
                return c12048y;
            }
            return null;
        }
        int m38701b = c12048y.m38701b();
        int m38700a = c12048y.m38700a();
        if (m38701b == 1 && m38700a == 0) {
            C12048y c12048y3 = C12048y.f32040d;
            if (set.contains(c12048y3)) {
                return c12048y3;
            }
            return null;
        }
        C12048y m2317c = m2317c(c12048y, set2, set);
        if (m2317c != null) {
            format = String.format("Resolved dynamic range for use case %s from existing attached surface.\n%s\n->\n%s", str, c12048y, m2317c);
        } else {
            m2317c = m2317c(c12048y, set3, set);
            if (m2317c != null) {
                format = String.format("Resolved dynamic range for use case %s from concurrently bound use case.\n%s\n->\n%s", str, c12048y, m2317c);
            } else {
                m2317c = C12048y.f32040d;
                if (!m2316b(c12048y, m2317c, set)) {
                    if (m38701b == 2 && (m38700a == 10 || m38700a == 0)) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        if (Build.VERSION.SDK_INT >= 33) {
                            c12048y2 = a.m2325a(this.f2254a);
                            if (c12048y2 != null) {
                                linkedHashSet.add(c12048y2);
                            }
                        } else {
                            c12048y2 = null;
                        }
                        linkedHashSet.add(C12048y.f32042f);
                        m2317c = m2317c(c12048y, linkedHashSet, set);
                        if (m2317c != null) {
                            Object[] objArr = new Object[4];
                            objArr[0] = str;
                            objArr[1] = m2317c.equals(c12048y2) ? "recommended" : "required";
                            objArr[2] = c12048y;
                            objArr[3] = m2317c;
                            format = String.format("Resolved dynamic range for use case %s from %s 10-bit supported dynamic range.\n%s\n->\n%s", objArr);
                        }
                    }
                    Iterator<C12048y> it = set.iterator();
                    while (it.hasNext()) {
                        m2317c = it.next();
                        C0984h.m4836n(m2317c.m38703e(), "Candidate dynamic range must be fully specified.");
                        if (!m2317c.equals(C12048y.f32040d) && m2315a(c12048y, m2317c)) {
                            format = String.format("Resolved dynamic range for use case %s from validated dynamic range constraints or supported HDR dynamic ranges.\n%s\n->\n%s", str, c12048y, m2317c);
                        }
                    }
                    return null;
                }
                format = String.format("Resolved dynamic range for use case %s to no compatible HDR dynamic ranges.\n%s\n->\n%s", str, c12048y, m2317c);
            }
        }
        C12029o0.m38638a("DynamicRangeResolver", format);
        return m2317c;
    }

    /* renamed from: i */
    private C12048y m2321i(Set<C12048y> set, Set<C12048y> set2, Set<C12048y> set3, InterfaceC0640k2<?> interfaceC0640k2, Set<C12048y> set4) {
        C12048y m3039G = interfaceC0640k2.m3039G();
        C12048y m2320h = m2320h(m3039G, set4, set2, set3, interfaceC0640k2.m8925P());
        if (m2320h == null) {
            throw new IllegalArgumentException(String.format("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  %s\nRequested dynamic range:\n  %s\nSupported dynamic ranges:\n  %s\nConstrained set of concurrent dynamic ranges:\n  %s", interfaceC0640k2.m8925P(), m3039G, TextUtils.join("\n  ", set), TextUtils.join("\n  ", set4)));
        }
        m2322j(set4, m2320h, this.f2255b);
        return m2320h;
    }

    /* renamed from: j */
    private static void m2322j(Set<C12048y> set, C12048y c12048y, C10553b c10553b) {
        C0984h.m4836n(!set.isEmpty(), "Cannot update already-empty constraints.");
        Set<C12048y> m32040b = c10553b.m32040b(c12048y);
        if (m32040b.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet(set);
        set.retainAll(m32040b);
        if (set.isEmpty()) {
            throw new IllegalArgumentException(String.format("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", c12048y, TextUtils.join("\n  ", m32040b), TextUtils.join("\n  ", hashSet)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m2323d() {
        return this.f2256c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Map<InterfaceC0640k2<?>, C12048y> m2324g(List<AbstractC0597a> list, List<InterfaceC0640k2<?>> list2, List<Integer> list3) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<AbstractC0597a> it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next().mo2973c());
        }
        Set<C12048y> m32041c = this.f2255b.m32041c();
        HashSet hashSet = new HashSet(m32041c);
        Iterator<C12048y> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            m2322j(hashSet, it2.next(), this.f2255b);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<Integer> it3 = list3.iterator();
        while (it3.hasNext()) {
            InterfaceC0640k2<?> interfaceC0640k2 = list2.get(it3.next().intValue());
            C12048y m3039G = interfaceC0640k2.m3039G();
            if (m2318e(m3039G)) {
                arrayList3.add(interfaceC0640k2);
            } else if (m2319f(m3039G)) {
                arrayList2.add(interfaceC0640k2);
            } else {
                arrayList.add(interfaceC0640k2);
            }
        }
        HashMap hashMap = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList<InterfaceC0640k2<?>> arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        for (InterfaceC0640k2<?> interfaceC0640k22 : arrayList4) {
            C12048y m2321i = m2321i(m32041c, linkedHashSet, linkedHashSet2, interfaceC0640k22, hashSet);
            hashMap.put(interfaceC0640k22, m2321i);
            if (!linkedHashSet.contains(m2321i)) {
                linkedHashSet2.add(m2321i);
            }
        }
        return hashMap;
    }
}
