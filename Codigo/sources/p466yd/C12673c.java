package p466yd;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p382ud.C11544m;

/* renamed from: yd.c */
/* loaded from: classes.dex */
public class C12673c {

    /* renamed from: a */
    private List<C12674d> f34361a = new ArrayList();

    /* renamed from: b */
    private int f34362b = 0;

    /* renamed from: c */
    private int f34363c = 0;

    /* renamed from: yd.c$a */
    /* loaded from: classes.dex */
    class a implements Comparator<C12674d> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C12674d c12674d, C12674d c12674d2) {
            if (c12674d.m41707a() > c12674d2.m41707a()) {
                return -1;
            }
            return c12674d.m41707a() < c12674d2.m41707a() ? 1 : 0;
        }
    }

    /* renamed from: a */
    public void m41700a(View view, boolean z10) {
        C12674d c12674d = new C12674d(view, z10);
        c12674d.m41712f(this.f34362b, this.f34363c);
        this.f34361a.add(c12674d);
    }

    /* renamed from: b */
    public void m41701b(int i10) {
        float f10;
        ArrayList<C12674d> arrayList = new ArrayList();
        for (C12674d c12674d : this.f34361a) {
            if (c12674d.m41710d()) {
                arrayList.add(c12674d);
            }
        }
        Collections.sort(arrayList, new a());
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += ((C12674d) it.next()).m41707a();
        }
        if (arrayList.size() >= 6) {
            throw new IllegalStateException("VerticalViewGroupMeasure only supports up to 5 children");
        }
        float f11 = 1.0f - ((r1 - 1) * 0.2f);
        C11544m.m36185d("VVGM (minFrac, maxFrac)", 0.2f, f11);
        float f12 = 0.0f;
        for (C12674d c12674d2 : arrayList) {
            float m41707a = c12674d2.m41707a() / i11;
            if (m41707a > f11) {
                f12 += m41707a - f11;
                f10 = f11;
            } else {
                f10 = m41707a;
            }
            if (m41707a < 0.2f) {
                float min = Math.min(0.2f - m41707a, f12);
                f12 -= min;
                f10 = m41707a + min;
            }
            C11544m.m36185d("\t(desired, granted)", m41707a, f10);
            c12674d2.m41712f(this.f34362b, (int) (f10 * i10));
        }
    }

    /* renamed from: c */
    public int m41702c() {
        int i10 = 0;
        for (C12674d c12674d : this.f34361a) {
            if (!c12674d.m41710d()) {
                i10 += c12674d.m41707a();
            }
        }
        return i10;
    }

    /* renamed from: d */
    public int m41703d() {
        Iterator<C12674d> it = this.f34361a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().m41707a();
        }
        return i10;
    }

    /* renamed from: e */
    public List<C12674d> m41704e() {
        return this.f34361a;
    }

    /* renamed from: f */
    public void m41705f(int i10, int i11) {
        this.f34362b = i10;
        this.f34363c = i11;
        this.f34361a = new ArrayList();
    }
}
