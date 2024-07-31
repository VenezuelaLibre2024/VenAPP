package p351s8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import p351s8.C10830k0;

/* renamed from: s8.k0 */
/* loaded from: classes.dex */
public class C10830k0 {

    /* renamed from: h */
    private static final Comparator<b> f27385h = new Comparator() { // from class: s8.i0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m33008g;
            m33008g = C10830k0.m33008g((C10830k0.b) obj, (C10830k0.b) obj2);
            return m33008g;
        }
    };

    /* renamed from: i */
    private static final Comparator<b> f27386i = new Comparator() { // from class: s8.j0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m33009h;
            m33009h = C10830k0.m33009h((C10830k0.b) obj, (C10830k0.b) obj2);
            return m33009h;
        }
    };

    /* renamed from: a */
    private final int f27387a;

    /* renamed from: e */
    private int f27391e;

    /* renamed from: f */
    private int f27392f;

    /* renamed from: g */
    private int f27393g;

    /* renamed from: c */
    private final b[] f27389c = new b[5];

    /* renamed from: b */
    private final ArrayList<b> f27388b = new ArrayList<>();

    /* renamed from: d */
    private int f27390d = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s8.k0$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public int f27394a;

        /* renamed from: b */
        public int f27395b;

        /* renamed from: c */
        public float f27396c;

        private b() {
        }
    }

    public C10830k0(int i10) {
        this.f27387a = i10;
    }

    /* renamed from: d */
    private void m33006d() {
        if (this.f27390d != 1) {
            Collections.sort(this.f27388b, f27385h);
            this.f27390d = 1;
        }
    }

    /* renamed from: e */
    private void m33007e() {
        if (this.f27390d != 0) {
            Collections.sort(this.f27388b, f27386i);
            this.f27390d = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ int m33008g(b bVar, b bVar2) {
        return bVar.f27394a - bVar2.f27394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ int m33009h(b bVar, b bVar2) {
        return Float.compare(bVar.f27396c, bVar2.f27396c);
    }

    /* renamed from: c */
    public void m33010c(int i10, float f10) {
        b bVar;
        int i11;
        b bVar2;
        int i12;
        m33006d();
        int i13 = this.f27393g;
        if (i13 > 0) {
            b[] bVarArr = this.f27389c;
            int i14 = i13 - 1;
            this.f27393g = i14;
            bVar = bVarArr[i14];
        } else {
            bVar = new b();
        }
        int i15 = this.f27391e;
        this.f27391e = i15 + 1;
        bVar.f27394a = i15;
        bVar.f27395b = i10;
        bVar.f27396c = f10;
        this.f27388b.add(bVar);
        int i16 = this.f27392f + i10;
        while (true) {
            this.f27392f = i16;
            while (true) {
                int i17 = this.f27392f;
                int i18 = this.f27387a;
                if (i17 <= i18) {
                    return;
                }
                i11 = i17 - i18;
                bVar2 = this.f27388b.get(0);
                i12 = bVar2.f27395b;
                if (i12 <= i11) {
                    this.f27392f -= i12;
                    this.f27388b.remove(0);
                    int i19 = this.f27393g;
                    if (i19 < 5) {
                        b[] bVarArr2 = this.f27389c;
                        this.f27393g = i19 + 1;
                        bVarArr2[i19] = bVar2;
                    }
                }
            }
            bVar2.f27395b = i12 - i11;
            i16 = this.f27392f - i11;
        }
    }

    /* renamed from: f */
    public float m33011f(float f10) {
        m33007e();
        float f11 = f10 * this.f27392f;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f27388b.size(); i11++) {
            b bVar = this.f27388b.get(i11);
            i10 += bVar.f27395b;
            if (i10 >= f11) {
                return bVar.f27396c;
            }
        }
        if (this.f27388b.isEmpty()) {
            return Float.NaN;
        }
        return this.f27388b.get(r5.size() - 1).f27396c;
    }

    /* renamed from: i */
    public void m33012i() {
        this.f27388b.clear();
        this.f27390d = -1;
        this.f27391e = 0;
        this.f27392f = 0;
    }
}
