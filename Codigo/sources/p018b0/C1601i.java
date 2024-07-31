package p018b0;

import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC0602b0;
import androidx.camera.core.impl.InterfaceC0619f1;
import androidx.camera.core.impl.InterfaceC0640k2;
import androidx.camera.core.impl.utils.C0672a;
import androidx.camera.core.impl.utils.C0674c;
import androidx.camera.core.impl.utils.C0675d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p092f0.C7264d;

/* renamed from: b0.i */
/* loaded from: classes.dex */
class C1601i {

    /* renamed from: a */
    private final int f6859a;

    /* renamed from: b */
    private final int f6860b;

    /* renamed from: c */
    private final Rational f6861c;

    /* renamed from: d */
    private final boolean f6862d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1601i(InterfaceC0602b0 interfaceC0602b0, Rational rational) {
        this.f6859a = interfaceC0602b0.mo2558a();
        this.f6860b = interfaceC0602b0.getLensFacing();
        this.f6861c = rational;
        boolean z10 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z10 = false;
        }
        this.f6862d = z10;
    }

    /* renamed from: a */
    private static Size m8919a(Size size, int i10, int i11, int i12) {
        return (size == null || !m8923e(i10, i11, i12)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    /* renamed from: b */
    private static Rational m8920b(Size size, List<Size> list) {
        if (size == null) {
            return null;
        }
        for (Rational rational : C1600h.m8911l(list)) {
            if (C0672a.m3243a(size, rational)) {
                return rational;
            }
        }
        return new Rational(size.getWidth(), size.getHeight());
    }

    /* renamed from: c */
    private Rational m8921c(InterfaceC0619f1 interfaceC0619f1, List<Size> list) {
        if (interfaceC0619f1.m3067y()) {
            return C1600h.m8912n(interfaceC0619f1.m3056B(), this.f6862d);
        }
        Size m8922d = m8922d(interfaceC0619f1);
        if (m8922d != null) {
            return m8920b(m8922d, list);
        }
        return null;
    }

    /* renamed from: d */
    private Size m8922d(InterfaceC0619f1 interfaceC0619f1) {
        return m8919a(interfaceC0619f1.m3061M(null), interfaceC0619f1.m3057C(0), this.f6860b, this.f6859a);
    }

    /* renamed from: e */
    private static boolean m8923e(int i10, int i11, int i12) {
        int m3258a = C0674c.m3258a(C0674c.m3259b(i10), i12, 1 == i11);
        return m3258a == 90 || m3258a == 270;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public List<Size> m8924f(List<Size> list, InterfaceC0640k2<?> interfaceC0640k2) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList<Size> arrayList = new ArrayList(list);
        Collections.sort(arrayList, new C0675d(true));
        ArrayList arrayList2 = new ArrayList();
        InterfaceC0619f1 interfaceC0619f1 = (InterfaceC0619f1) interfaceC0640k2;
        Size m3063i = interfaceC0619f1.m3063i(null);
        Size size = (Size) arrayList.get(0);
        if (m3063i == null || C7264d.m21736a(size) < C7264d.m21736a(m3063i)) {
            m3063i = size;
        }
        Size m8922d = m8922d(interfaceC0619f1);
        Size size2 = C7264d.f16273c;
        int m21736a = C7264d.m21736a(size2);
        if (C7264d.m21736a(m3063i) < m21736a) {
            size2 = C7264d.f16271a;
        } else if (m8922d != null && C7264d.m21736a(m8922d) < m21736a) {
            size2 = m8922d;
        }
        for (Size size3 : arrayList) {
            if (C7264d.m21736a(size3) <= C7264d.m21736a(m3063i) && C7264d.m21736a(size3) >= C7264d.m21736a(size2) && !arrayList2.contains(size3)) {
                arrayList2.add(size3);
            }
        }
        if (arrayList2.isEmpty()) {
            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + m3063i + "\ninitial size list: " + arrayList);
        }
        Rational m8921c = m8921c(interfaceC0619f1, arrayList2);
        if (m8922d == null) {
            m8922d = interfaceC0619f1.m3060J(null);
        }
        ArrayList arrayList3 = new ArrayList();
        new HashMap();
        if (m8921c == null) {
            arrayList3.addAll(arrayList2);
            if (m8922d != null) {
                C1600h.m8915q(arrayList3, m8922d, true);
            }
        } else {
            Map<Rational, List<Size>> m8913o = C1600h.m8913o(arrayList2);
            if (m8922d != null) {
                Iterator<Rational> it = m8913o.keySet().iterator();
                while (it.hasNext()) {
                    C1600h.m8915q(m8913o.get(it.next()), m8922d, true);
                }
            }
            ArrayList arrayList4 = new ArrayList(m8913o.keySet());
            Collections.sort(arrayList4, new C0672a.a(m8921c, this.f6861c));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                for (Size size4 : m8913o.get((Rational) it2.next())) {
                    if (!arrayList3.contains(size4)) {
                        arrayList3.add(size4);
                    }
                }
            }
        }
        return arrayList3;
    }
}
