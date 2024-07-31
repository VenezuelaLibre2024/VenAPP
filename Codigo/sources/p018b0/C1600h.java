package p018b0;

import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC0602b0;
import androidx.camera.core.impl.InterfaceC0619f1;
import androidx.camera.core.impl.InterfaceC0640k2;
import androidx.camera.core.impl.utils.C0672a;
import androidx.camera.core.impl.utils.C0674c;
import androidx.camera.core.impl.utils.C0675d;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p092f0.C7264d;
import p126h0.C7606a;
import p126h0.C7608c;
import p126h0.C7609d;
import p126h0.InterfaceC7607b;
import p407w.C12029o0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: b0.h */
/* loaded from: classes.dex */
public class C1600h {

    /* renamed from: a */
    private final InterfaceC0602b0 f6853a;

    /* renamed from: b */
    private final int f6854b;

    /* renamed from: c */
    private final int f6855c;

    /* renamed from: d */
    private final Rational f6856d;

    /* renamed from: e */
    private final boolean f6857e;

    /* renamed from: f */
    private final C1601i f6858f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1600h(InterfaceC0602b0 interfaceC0602b0, Size size) {
        this.f6853a = interfaceC0602b0;
        this.f6854b = interfaceC0602b0.mo2558a();
        this.f6855c = interfaceC0602b0.getLensFacing();
        Rational m8907h = size != null ? m8907h(size) : m8908i(interfaceC0602b0);
        this.f6856d = m8907h;
        boolean z10 = true;
        if (m8907h != null && m8907h.getNumerator() < m8907h.getDenominator()) {
            z10 = false;
        }
        this.f6857e = z10;
        this.f6858f = new C1601i(interfaceC0602b0, m8907h);
    }

    /* renamed from: a */
    private LinkedHashMap<Rational, List<Size>> m8900a(List<Size> list, C7606a c7606a) {
        return m8901b(m8913o(list), c7606a);
    }

    /* renamed from: b */
    private LinkedHashMap<Rational, List<Size>> m8901b(Map<Rational, List<Size>> map, C7606a c7606a) {
        Rational m8912n = m8912n(c7606a.m23114b(), this.f6857e);
        if (c7606a.m23113a() == 0) {
            Rational m8912n2 = m8912n(c7606a.m23114b(), this.f6857e);
            Iterator it = new ArrayList(map.keySet()).iterator();
            while (it.hasNext()) {
                Rational rational = (Rational) it.next();
                if (!rational.equals(m8912n2)) {
                    map.remove(rational);
                }
            }
        }
        ArrayList<Rational> arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList, new C0672a.a(m8912n, this.f6856d));
        LinkedHashMap<Rational, List<Size>> linkedHashMap = new LinkedHashMap<>();
        for (Rational rational2 : arrayList) {
            linkedHashMap.put(rational2, map.get(rational2));
        }
        return linkedHashMap;
    }

    /* renamed from: c */
    private List<Size> m8902c(List<Size> list, C7608c c7608c, int i10) {
        if (c7608c.m23116a() != 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(this.f6853a.mo2560c(i10));
        Collections.sort(arrayList, new C0675d(true));
        return arrayList;
    }

    /* renamed from: d */
    private static void m8903d(LinkedHashMap<Rational, List<Size>> linkedHashMap, Size size) {
        int m21736a = C7264d.m21736a(size);
        Iterator<Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            List<Size> list = linkedHashMap.get(it.next());
            ArrayList arrayList = new ArrayList();
            for (Size size2 : list) {
                if (C7264d.m21736a(size2) <= m21736a) {
                    arrayList.add(size2);
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    /* renamed from: e */
    private List<Size> m8904e(List<Size> list, InterfaceC7607b interfaceC7607b, int i10) {
        if (interfaceC7607b == null) {
            return list;
        }
        List<Size> m23115a = interfaceC7607b.m23115a(new ArrayList(list), C0674c.m3258a(C0674c.m3259b(i10), this.f6854b, this.f6855c == 1));
        if (list.containsAll(m23115a)) {
            return m23115a;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    /* renamed from: f */
    private static void m8905f(LinkedHashMap<Rational, List<Size>> linkedHashMap, C7609d c7609d) {
        if (c7609d == null) {
            return;
        }
        Iterator<Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            m8906g(linkedHashMap.get(it.next()), c7609d);
        }
    }

    /* renamed from: g */
    private static void m8906g(List<Size> list, C7609d c7609d) {
        if (list.isEmpty()) {
            return;
        }
        Integer valueOf = Integer.valueOf(c7609d.m23126b());
        if (c7609d.equals(C7609d.f17993c)) {
            return;
        }
        Size m23125a = c7609d.m23125a();
        int intValue = valueOf.intValue();
        if (intValue == 0) {
            m8917s(list, m23125a);
            return;
        }
        if (intValue == 1) {
            m8915q(list, m23125a, true);
            return;
        }
        if (intValue == 2) {
            m8915q(list, m23125a, false);
        } else if (intValue == 3) {
            m8916r(list, m23125a, true);
        } else {
            if (intValue != 4) {
                return;
            }
            m8916r(list, m23125a, false);
        }
    }

    /* renamed from: h */
    private Rational m8907h(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    /* renamed from: i */
    private Rational m8908i(InterfaceC0602b0 interfaceC0602b0) {
        List<Size> mo2563f = interfaceC0602b0.mo2563f(RecognitionOptions.QR_CODE);
        if (mo2563f.isEmpty()) {
            return null;
        }
        Size size = (Size) Collections.max(mo2563f, new C0675d());
        return new Rational(size.getWidth(), size.getHeight());
    }

    /* renamed from: j */
    private List<Size> m8909j(int i10, InterfaceC0619f1 interfaceC0619f1) {
        Size[] sizeArr;
        List<Pair<Integer, Size[]>> m3064k = interfaceC0619f1.m3064k(null);
        if (m3064k != null) {
            for (Pair<Integer, Size[]> pair : m3064k) {
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

    /* renamed from: k */
    private List<Size> m8910k(InterfaceC0640k2<?> interfaceC0640k2) {
        int mo3010n = interfaceC0640k2.mo3010n();
        List<Size> m8909j = m8909j(mo3010n, (InterfaceC0619f1) interfaceC0640k2);
        if (m8909j == null) {
            m8909j = this.f6853a.mo2563f(mo3010n);
        }
        ArrayList arrayList = new ArrayList(m8909j);
        Collections.sort(arrayList, new C0675d(true));
        if (arrayList.isEmpty()) {
            C12029o0.m38648k("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + mo3010n + ".");
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static List<Rational> m8911l(List<Size> list) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C0672a.f2938a);
        arrayList.add(C0672a.f2940c);
        for (Size size : list) {
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    }
                    if (C0672a.m3243a(size, (Rational) it.next())) {
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
    /* renamed from: n */
    public static Rational m8912n(int i10, boolean z10) {
        if (i10 != -1) {
            if (i10 == 0) {
                return z10 ? C0672a.f2938a : C0672a.f2939b;
            }
            if (i10 == 1) {
                return z10 ? C0672a.f2940c : C0672a.f2941d;
            }
            C12029o0.m38640c("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i10);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static Map<Rational, List<Size>> m8913o(List<Size> list) {
        HashMap hashMap = new HashMap();
        Iterator<Rational> it = m8911l(list).iterator();
        while (it.hasNext()) {
            hashMap.put(it.next(), new ArrayList());
        }
        for (Size size : list) {
            for (Rational rational : hashMap.keySet()) {
                if (C0672a.m3243a(size, rational)) {
                    ((List) hashMap.get(rational)).add(size);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: p */
    private List<Size> m8914p(InterfaceC0640k2<?> interfaceC0640k2) {
        C7608c m3065l = ((InterfaceC0619f1) interfaceC0640k2).m3065l();
        List<Size> m8910k = m8910k(interfaceC0640k2);
        if (!interfaceC0640k2.m3140I(false)) {
            m8910k = m8902c(m8910k, m3065l, interfaceC0640k2.mo3010n());
        }
        LinkedHashMap<Rational, List<Size>> m8900a = m8900a(m8910k, m3065l.m23117b());
        InterfaceC0619f1 interfaceC0619f1 = (InterfaceC0619f1) interfaceC0640k2;
        Size m3063i = interfaceC0619f1.m3063i(null);
        if (m3063i != null) {
            m8903d(m8900a, m3063i);
        }
        m8905f(m8900a, m3065l.m23119d());
        ArrayList arrayList = new ArrayList();
        Iterator<List<Size>> it = m8900a.values().iterator();
        while (it.hasNext()) {
            for (Size size : it.next()) {
                if (!arrayList.contains(size)) {
                    arrayList.add(size);
                }
            }
        }
        m3065l.m23118c();
        return m8904e(arrayList, null, interfaceC0619f1.m3057C(0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static void m8915q(List<Size> list, Size size, boolean z10) {
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

    /* renamed from: r */
    private static void m8916r(List<Size> list, Size size, boolean z10) {
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

    /* renamed from: s */
    private static void m8917s(List<Size> list, Size size) {
        boolean contains = list.contains(size);
        list.clear();
        if (contains) {
            list.add(size);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public List<Size> m8918m(InterfaceC0640k2<?> interfaceC0640k2) {
        InterfaceC0619f1 interfaceC0619f1 = (InterfaceC0619f1) interfaceC0640k2;
        List<Size> m3059H = interfaceC0619f1.m3059H(null);
        return m3059H != null ? m3059H : interfaceC0619f1.m3058E(null) == null ? this.f6858f.m8924f(m8910k(interfaceC0640k2), interfaceC0640k2) : m8914p(interfaceC0640k2);
    }
}
