package b0;

import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.b0;
import androidx.camera.core.impl.f1;
import androidx.camera.core.impl.k2;
import androidx.camera.core.impl.utils.a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import w.o0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final b0 f5995a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5996b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5997c;

    /* renamed from: d, reason: collision with root package name */
    private final Rational f5998d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f5999e;

    /* renamed from: f, reason: collision with root package name */
    private final i f6000f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(b0 b0Var, Size size) {
        this.f5995a = b0Var;
        this.f5996b = b0Var.a();
        this.f5997c = b0Var.getLensFacing();
        Rational h10 = size != null ? h(size) : i(b0Var);
        this.f5998d = h10;
        boolean z10 = true;
        if (h10 != null && h10.getNumerator() < h10.getDenominator()) {
            z10 = false;
        }
        this.f5999e = z10;
        this.f6000f = new i(b0Var, h10);
    }

    private LinkedHashMap<Rational, List<Size>> a(List<Size> list, h0.a aVar) {
        return b(o(list), aVar);
    }

    private LinkedHashMap<Rational, List<Size>> b(Map<Rational, List<Size>> map, h0.a aVar) {
        Rational n10 = n(aVar.b(), this.f5999e);
        if (aVar.a() == 0) {
            Rational n11 = n(aVar.b(), this.f5999e);
            Iterator it = new ArrayList(map.keySet()).iterator();
            while (it.hasNext()) {
                Rational rational = (Rational) it.next();
                if (!rational.equals(n11)) {
                    map.remove(rational);
                }
            }
        }
        ArrayList<Rational> arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList, new a.C0027a(n10, this.f5998d));
        LinkedHashMap<Rational, List<Size>> linkedHashMap = new LinkedHashMap<>();
        for (Rational rational2 : arrayList) {
            linkedHashMap.put(rational2, map.get(rational2));
        }
        return linkedHashMap;
    }

    private List<Size> c(List<Size> list, h0.c cVar, int i10) {
        if (cVar.a() != 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(this.f5995a.c(i10));
        Collections.sort(arrayList, new androidx.camera.core.impl.utils.d(true));
        return arrayList;
    }

    private static void d(LinkedHashMap<Rational, List<Size>> linkedHashMap, Size size) {
        int a10 = f0.d.a(size);
        Iterator<Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            List<Size> list = linkedHashMap.get(it.next());
            ArrayList arrayList = new ArrayList();
            for (Size size2 : list) {
                if (f0.d.a(size2) <= a10) {
                    arrayList.add(size2);
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    private List<Size> e(List<Size> list, h0.b bVar, int i10) {
        if (bVar == null) {
            return list;
        }
        List<Size> a10 = bVar.a(new ArrayList(list), androidx.camera.core.impl.utils.c.a(androidx.camera.core.impl.utils.c.b(i10), this.f5996b, this.f5997c == 1));
        if (list.containsAll(a10)) {
            return a10;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    private static void f(LinkedHashMap<Rational, List<Size>> linkedHashMap, h0.d dVar) {
        if (dVar == null) {
            return;
        }
        Iterator<Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            g(linkedHashMap.get(it.next()), dVar);
        }
    }

    private static void g(List<Size> list, h0.d dVar) {
        if (list.isEmpty()) {
            return;
        }
        Integer valueOf = Integer.valueOf(dVar.b());
        if (dVar.equals(h0.d.f16356c)) {
            return;
        }
        Size a10 = dVar.a();
        int intValue = valueOf.intValue();
        if (intValue == 0) {
            s(list, a10);
            return;
        }
        if (intValue == 1) {
            q(list, a10, true);
            return;
        }
        if (intValue == 2) {
            q(list, a10, false);
        } else if (intValue == 3) {
            r(list, a10, true);
        } else {
            if (intValue != 4) {
                return;
            }
            r(list, a10, false);
        }
    }

    private Rational h(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    private Rational i(b0 b0Var) {
        List<Size> f10 = b0Var.f(RecognitionOptions.QR_CODE);
        if (f10.isEmpty()) {
            return null;
        }
        Size size = (Size) Collections.max(f10, new androidx.camera.core.impl.utils.d());
        return new Rational(size.getWidth(), size.getHeight());
    }

    private List<Size> j(int i10, f1 f1Var) {
        Size[] sizeArr;
        List<Pair<Integer, Size[]>> k10 = f1Var.k(null);
        if (k10 != null) {
            for (Pair<Integer, Size[]> pair : k10) {
                if (((Integer) pair.first).intValue() == i10) {
                    sizeArr = (Size[]) pair.second;
                    break;
                }
            }
        }
        sizeArr = null;
        if (sizeArr == null) {
            return null;
        }
        return Arrays.asList(sizeArr);
    }

    private List<Size> k(k2<?> k2Var) {
        int n10 = k2Var.n();
        List<Size> j10 = j(n10, (f1) k2Var);
        if (j10 == null) {
            j10 = this.f5995a.f(n10);
        }
        ArrayList arrayList = new ArrayList(j10);
        Collections.sort(arrayList, new androidx.camera.core.impl.utils.d(true));
        if (arrayList.isEmpty()) {
            o0.k("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + n10 + ".");
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<Rational> l(List<Size> list) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.add(androidx.camera.core.impl.utils.a.f2594a);
        arrayList.add(androidx.camera.core.impl.utils.a.f2596c);
        for (Size size : list) {
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    if (androidx.camera.core.impl.utils.a.a(size, (Rational) it.next())) {
                        z10 = true;
                        break;
                    }
                }
                if (!z10) {
                    arrayList.add(rational);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Rational n(int i10, boolean z10) {
        if (i10 != -1) {
            if (i10 == 0) {
                return z10 ? androidx.camera.core.impl.utils.a.f2594a : androidx.camera.core.impl.utils.a.f2595b;
            }
            if (i10 == 1) {
                return z10 ? androidx.camera.core.impl.utils.a.f2596c : androidx.camera.core.impl.utils.a.f2597d;
            }
            o0.c("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i10);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<Rational, List<Size>> o(List<Size> list) {
        HashMap hashMap = new HashMap();
        Iterator<Rational> it = l(list).iterator();
        while (it.hasNext()) {
            hashMap.put(it.next(), new ArrayList());
        }
        for (Size size : list) {
            for (Rational rational : hashMap.keySet()) {
                if (androidx.camera.core.impl.utils.a.a(size, rational)) {
                    ((List) hashMap.get(rational)).add(size);
                }
            }
        }
        return hashMap;
    }

    private List<Size> p(k2<?> k2Var) {
        h0.c l10 = ((f1) k2Var).l();
        List<Size> k10 = k(k2Var);
        if (!k2Var.I(false)) {
            k10 = c(k10, l10, k2Var.n());
        }
        LinkedHashMap<Rational, List<Size>> a10 = a(k10, l10.b());
        f1 f1Var = (f1) k2Var;
        Size i10 = f1Var.i(null);
        if (i10 != null) {
            d(a10, i10);
        }
        f(a10, l10.d());
        ArrayList arrayList = new ArrayList();
        Iterator<List<Size>> it = a10.values().iterator();
        while (it.hasNext()) {
            for (Size size : it.next()) {
                if (!arrayList.contains(size)) {
                    arrayList.add(size);
                }
            }
        }
        l10.c();
        return e(arrayList, null, f1Var.C(0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void q(List<Size> list, Size size, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z10) {
            list.addAll(arrayList);
        }
    }

    private static void r(List<Size> list, Size size, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Size size2 = list.get(i10);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z10) {
            list.addAll(arrayList);
        }
    }

    private static void s(List<Size> list, Size size) {
        boolean contains = list.contains(size);
        list.clear();
        if (contains) {
            list.add(size);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Size> m(k2<?> k2Var) {
        f1 f1Var = (f1) k2Var;
        List<Size> H = f1Var.H(null);
        return H != null ? H : f1Var.E(null) == null ? this.f6000f.f(k(k2Var), k2Var) : p(k2Var);
    }
}
