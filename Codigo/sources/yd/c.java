package yd;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import ud.m;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private List<d> f31825a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private int f31826b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f31827c = 0;

    /* loaded from: classes.dex */
    class a implements Comparator<d> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            if (dVar.a() > dVar2.a()) {
                return -1;
            }
            return dVar.a() < dVar2.a() ? 1 : 0;
        }
    }

    public void a(View view, boolean z10) {
        d dVar = new d(view, z10);
        dVar.f(this.f31826b, this.f31827c);
        this.f31825a.add(dVar);
    }

    public void b(int i10) {
        float f10;
        ArrayList<d> arrayList = new ArrayList();
        for (d dVar : this.f31825a) {
            if (dVar.d()) {
                arrayList.add(dVar);
            }
        }
        Collections.sort(arrayList, new a());
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += ((d) it.next()).a();
        }
        if (arrayList.size() >= 6) {
            throw new IllegalStateException("VerticalViewGroupMeasure only supports up to 5 children");
        }
        float f11 = 1.0f - ((r1 - 1) * 0.2f);
        m.d("VVGM (minFrac, maxFrac)", 0.2f, f11);
        float f12 = 0.0f;
        for (d dVar2 : arrayList) {
            float a10 = dVar2.a() / i11;
            if (a10 > f11) {
                f12 += a10 - f11;
                f10 = f11;
            } else {
                f10 = a10;
            }
            if (a10 < 0.2f) {
                float min = Math.min(0.2f - a10, f12);
                f12 -= min;
                f10 = a10 + min;
            }
            m.d("\t(desired, granted)", a10, f10);
            dVar2.f(this.f31826b, (int) (f10 * i10));
        }
    }

    public int c() {
        int i10 = 0;
        for (d dVar : this.f31825a) {
            if (!dVar.d()) {
                i10 += dVar.a();
            }
        }
        return i10;
    }

    public int d() {
        Iterator<d> it = this.f31825a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().a();
        }
        return i10;
    }

    public List<d> e() {
        return this.f31825a;
    }

    public void f(int i10, int i11) {
        this.f31826b = i10;
        this.f31827c = i11;
        this.f31825a = new ArrayList();
    }
}
