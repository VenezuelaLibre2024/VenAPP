package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.text.TextUtils;
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

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: a */
    private final androidx.camera.camera2.internal.compat.d0 f1951a;

    /* renamed from: b */
    private final r.b f1952b;

    /* renamed from: c */
    private final boolean f1953c;

    /* loaded from: classes.dex */
    public static final class a {
        static w.y a(androidx.camera.camera2.internal.compat.d0 d0Var) {
            Long l10 = (Long) d0Var.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l10 != null) {
                return r.a.b(l10.longValue());
            }
            return null;
        }
    }

    public d2(androidx.camera.camera2.internal.compat.d0 d0Var) {
        this.f1951a = d0Var;
        this.f1952b = r.b.a(d0Var);
        int[] iArr = (int[]) d0Var.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
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
        this.f1953c = z10;
    }

    private static boolean a(w.y yVar, w.y yVar2) {
        androidx.core.util.h.n(yVar2.e(), "Fully specified range is not actually fully specified.");
        if (yVar.b() == 2 && yVar2.b() == 1) {
            return false;
        }
        if (yVar.b() == 2 || yVar.b() == 0 || yVar.b() == yVar2.b()) {
            return yVar.a() == 0 || yVar.a() == yVar2.a();
        }
        return false;
    }

    private static boolean b(w.y yVar, w.y yVar2, Set<w.y> set) {
        if (set.contains(yVar2)) {
            return a(yVar, yVar2);
        }
        w.o0.a("DynamicRangeResolver", String.format("Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  %s\nCandidate dynamic range:\n  %s", yVar, yVar2));
        return false;
    }

    private static w.y c(w.y yVar, Collection<w.y> collection, Set<w.y> set) {
        if (yVar.b() == 1) {
            return null;
        }
        for (w.y yVar2 : collection) {
            androidx.core.util.h.l(yVar2, "Fully specified DynamicRange cannot be null.");
            int b10 = yVar2.b();
            androidx.core.util.h.n(yVar2.e(), "Fully specified DynamicRange must have fully defined encoding.");
            if (b10 != 1 && b(yVar, yVar2, set)) {
                return yVar2;
            }
        }
        return null;
    }

    private static boolean e(w.y yVar) {
        return Objects.equals(yVar, w.y.f29576c);
    }

    private static boolean f(w.y yVar) {
        return yVar.b() == 2 || (yVar.b() != 0 && yVar.a() == 0) || (yVar.b() == 0 && yVar.a() != 0);
    }

    private w.y h(w.y yVar, Set<w.y> set, Set<w.y> set2, Set<w.y> set3, String str) {
        String format;
        w.y yVar2;
        if (yVar.e()) {
            if (set.contains(yVar)) {
                return yVar;
            }
            return null;
        }
        int b10 = yVar.b();
        int a10 = yVar.a();
        if (b10 == 1 && a10 == 0) {
            w.y yVar3 = w.y.f29577d;
            if (set.contains(yVar3)) {
                return yVar3;
            }
            return null;
        }
        w.y c10 = c(yVar, set2, set);
        if (c10 != null) {
            format = String.format("Resolved dynamic range for use case %s from existing attached surface.\n%s\n->\n%s", str, yVar, c10);
        } else {
            c10 = c(yVar, set3, set);
            if (c10 != null) {
                format = String.format("Resolved dynamic range for use case %s from concurrently bound use case.\n%s\n->\n%s", str, yVar, c10);
            } else {
                c10 = w.y.f29577d;
                if (!b(yVar, c10, set)) {
                    if (b10 == 2 && (a10 == 10 || a10 == 0)) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        if (Build.VERSION.SDK_INT >= 33) {
                            yVar2 = a.a(this.f1951a);
                            if (yVar2 != null) {
                                linkedHashSet.add(yVar2);
                            }
                        } else {
                            yVar2 = null;
                        }
                        linkedHashSet.add(w.y.f29579f);
                        c10 = c(yVar, linkedHashSet, set);
                        if (c10 != null) {
                            Object[] objArr = new Object[4];
                            objArr[0] = str;
                            objArr[1] = c10.equals(yVar2) ? "recommended" : "required";
                            objArr[2] = yVar;
                            objArr[3] = c10;
                            format = String.format("Resolved dynamic range for use case %s from %s 10-bit supported dynamic range.\n%s\n->\n%s", objArr);
                        }
                    }
                    Iterator<w.y> it = set.iterator();
                    while (it.hasNext()) {
                        c10 = it.next();
                        androidx.core.util.h.n(c10.e(), "Candidate dynamic range must be fully specified.");
                        if (!c10.equals(w.y.f29577d) && a(yVar, c10)) {
                            format = String.format("Resolved dynamic range for use case %s from validated dynamic range constraints or supported HDR dynamic ranges.\n%s\n->\n%s", str, yVar, c10);
                        }
                    }
                    return null;
                }
                format = String.format("Resolved dynamic range for use case %s to no compatible HDR dynamic ranges.\n%s\n->\n%s", str, yVar, c10);
            }
        }
        w.o0.a("DynamicRangeResolver", format);
        return c10;
    }

    private w.y i(Set<w.y> set, Set<w.y> set2, Set<w.y> set3, androidx.camera.core.impl.k2<?> k2Var, Set<w.y> set4) {
        w.y G = k2Var.G();
        w.y h10 = h(G, set4, set2, set3, k2Var.P());
        if (h10 == null) {
            throw new IllegalArgumentException(String.format("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  %s\nRequested dynamic range:\n  %s\nSupported dynamic ranges:\n  %s\nConstrained set of concurrent dynamic ranges:\n  %s", k2Var.P(), G, TextUtils.join("\n  ", set), TextUtils.join("\n  ", set4)));
        }
        j(set4, h10, this.f1952b);
        return h10;
    }

    private static void j(Set<w.y> set, w.y yVar, r.b bVar) {
        androidx.core.util.h.n(!set.isEmpty(), "Cannot update already-empty constraints.");
        Set<w.y> b10 = bVar.b(yVar);
        if (b10.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet(set);
        set.retainAll(b10);
        if (set.isEmpty()) {
            throw new IllegalArgumentException(String.format("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  %s\nConstraints:\n  %s\nExisting constraints:\n  %s", yVar, TextUtils.join("\n  ", b10), TextUtils.join("\n  ", hashSet)));
        }
    }

    public boolean d() {
        return this.f1953c;
    }

    public Map<androidx.camera.core.impl.k2<?>, w.y> g(List<androidx.camera.core.impl.a> list, List<androidx.camera.core.impl.k2<?>> list2, List<Integer> list3) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<androidx.camera.core.impl.a> it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next().c());
        }
        Set<w.y> c10 = this.f1952b.c();
        HashSet hashSet = new HashSet(c10);
        Iterator<w.y> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            j(hashSet, it2.next(), this.f1952b);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<Integer> it3 = list3.iterator();
        while (it3.hasNext()) {
            androidx.camera.core.impl.k2<?> k2Var = list2.get(it3.next().intValue());
            w.y G = k2Var.G();
            if (e(G)) {
                arrayList3.add(k2Var);
            } else if (f(G)) {
                arrayList2.add(k2Var);
            } else {
                arrayList.add(k2Var);
            }
        }
        HashMap hashMap = new HashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList<androidx.camera.core.impl.k2<?>> arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        for (androidx.camera.core.impl.k2<?> k2Var2 : arrayList4) {
            w.y i10 = i(c10, linkedHashSet, linkedHashSet2, k2Var2, hashSet);
            hashMap.put(k2Var2, i10);
            if (!linkedHashSet.contains(i10)) {
                linkedHashSet2.add(i10);
            }
        }
        return hashMap;
    }
}
