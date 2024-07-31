package b0;

import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.b0;
import androidx.camera.core.impl.f1;
import androidx.camera.core.impl.k2;
import androidx.camera.core.impl.utils.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a */
    private final int f6001a;

    /* renamed from: b */
    private final int f6002b;

    /* renamed from: c */
    private final Rational f6003c;

    /* renamed from: d */
    private final boolean f6004d;

    public i(b0 b0Var, Rational rational) {
        this.f6001a = b0Var.a();
        this.f6002b = b0Var.getLensFacing();
        this.f6003c = rational;
        boolean z10 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z10 = false;
        }
        this.f6004d = z10;
    }

    private static Size a(Size size, int i10, int i11, int i12) {
        return (size == null || !e(i10, i11, i12)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    private static Rational b(Size size, List<Size> list) {
        if (size == null) {
            return null;
        }
        for (Rational rational : h.l(list)) {
            if (androidx.camera.core.impl.utils.a.a(size, rational)) {
                return rational;
            }
        }
        return new Rational(size.getWidth(), size.getHeight());
    }

    private Rational c(f1 f1Var, List<Size> list) {
        if (f1Var.y()) {
            return h.n(f1Var.B(), this.f6004d);
        }
        Size d10 = d(f1Var);
        if (d10 != null) {
            return b(d10, list);
        }
        return null;
    }

    private Size d(f1 f1Var) {
        return a(f1Var.M(null), f1Var.C(0), this.f6002b, this.f6001a);
    }

    private static boolean e(int i10, int i11, int i12) {
        int a10 = androidx.camera.core.impl.utils.c.a(androidx.camera.core.impl.utils.c.b(i10), i12, 1 == i11);
        return a10 == 90 || a10 == 270;
    }

    public List<Size> f(List<Size> list, k2<?> k2Var) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList<Size> arrayList = new ArrayList(list);
        Collections.sort(arrayList, new androidx.camera.core.impl.utils.d(true));
        ArrayList arrayList2 = new ArrayList();
        f1 f1Var = (f1) k2Var;
        Size i10 = f1Var.i(null);
        Size size = (Size) arrayList.get(0);
        if (i10 == null || f0.d.a(size) < f0.d.a(i10)) {
            i10 = size;
        }
        Size d10 = d(f1Var);
        Size size2 = f0.d.f14850c;
        int a10 = f0.d.a(size2);
        if (f0.d.a(i10) < a10) {
            size2 = f0.d.f14848a;
        } else if (d10 != null && f0.d.a(d10) < a10) {
            size2 = d10;
        }
        for (Size size3 : arrayList) {
            if (f0.d.a(size3) <= f0.d.a(i10) && f0.d.a(size3) >= f0.d.a(size2) && !arrayList2.contains(size3)) {
                arrayList2.add(size3);
            }
        }
        if (arrayList2.isEmpty()) {
            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + i10 + "\ninitial size list: " + arrayList);
        }
        Rational c10 = c(f1Var, arrayList2);
        if (d10 == null) {
            d10 = f1Var.J(null);
        }
        ArrayList arrayList3 = new ArrayList();
        new HashMap();
        if (c10 == null) {
            arrayList3.addAll(arrayList2);
            if (d10 != null) {
                h.q(arrayList3, d10, true);
            }
        } else {
            Map<Rational, List<Size>> o10 = h.o(arrayList2);
            if (d10 != null) {
                Iterator<Rational> it = o10.keySet().iterator();
                while (it.hasNext()) {
                    h.q(o10.get(it.next()), d10, true);
                }
            }
            ArrayList arrayList4 = new ArrayList(o10.keySet());
            Collections.sort(arrayList4, new a.C0027a(c10, this.f6003c));
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                for (Size size4 : o10.get((Rational) it2.next())) {
                    if (!arrayList3.contains(size4)) {
                        arrayList3.add(size4);
                    }
                }
            }
        }
        return arrayList3;
    }
}
