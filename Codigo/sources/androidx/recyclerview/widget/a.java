package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a implements g.a {

    /* renamed from: a, reason: collision with root package name */
    private androidx.core.util.e<b> f5299a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<b> f5300b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<b> f5301c;

    /* renamed from: d, reason: collision with root package name */
    final InterfaceC0079a f5302d;

    /* renamed from: e, reason: collision with root package name */
    Runnable f5303e;

    /* renamed from: f, reason: collision with root package name */
    final boolean f5304f;

    /* renamed from: g, reason: collision with root package name */
    final g f5305g;

    /* renamed from: h, reason: collision with root package name */
    private int f5306h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0079a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(b bVar);

        void d(int i10, int i11);

        void e(int i10, int i11, Object obj);

        RecyclerView.b0 f(int i10);

        void g(int i10, int i11);

        void h(int i10, int i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        int f5307a;

        /* renamed from: b, reason: collision with root package name */
        int f5308b;

        /* renamed from: c, reason: collision with root package name */
        Object f5309c;

        /* renamed from: d, reason: collision with root package name */
        int f5310d;

        b(int i10, int i11, int i12, Object obj) {
            this.f5307a = i10;
            this.f5308b = i11;
            this.f5310d = i12;
            this.f5309c = obj;
        }

        String a() {
            int i10 = this.f5307a;
            return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f5307a;
            if (i10 != bVar.f5307a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f5310d - this.f5308b) == 1 && this.f5310d == bVar.f5308b && this.f5308b == bVar.f5310d) {
                return true;
            }
            if (this.f5310d != bVar.f5310d || this.f5308b != bVar.f5308b) {
                return false;
            }
            Object obj2 = this.f5309c;
            Object obj3 = bVar.f5309c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f5307a * 31) + this.f5308b) * 31) + this.f5310d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f5308b + "c:" + this.f5310d + ",p:" + this.f5309c + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(InterfaceC0079a interfaceC0079a) {
        this(interfaceC0079a, false);
    }

    a(InterfaceC0079a interfaceC0079a, boolean z10) {
        this.f5299a = new androidx.core.util.f(30);
        this.f5300b = new ArrayList<>();
        this.f5301c = new ArrayList<>();
        this.f5306h = 0;
        this.f5302d = interfaceC0079a;
        this.f5304f = z10;
        this.f5305g = new g(this);
    }

    private void c(b bVar) {
        q(bVar);
    }

    private void d(b bVar) {
        q(bVar);
    }

    private void f(b bVar) {
        boolean z10;
        char c10;
        int i10 = bVar.f5308b;
        int i11 = bVar.f5310d + i10;
        char c11 = 65535;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f5302d.f(i12) != null || h(i12)) {
                if (c11 == 0) {
                    k(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 1;
            } else {
                if (c11 == 1) {
                    q(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            c11 = c10;
        }
        if (i13 != bVar.f5310d) {
            b(bVar);
            bVar = a(2, i10, i13, null);
        }
        if (c11 == 0) {
            k(bVar);
        } else {
            q(bVar);
        }
    }

    private void g(b bVar) {
        int i10 = bVar.f5308b;
        int i11 = bVar.f5310d + i10;
        int i12 = 0;
        boolean z10 = -1;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f5302d.f(i10) != null || h(i10)) {
                if (!z10) {
                    k(a(4, i13, i12, bVar.f5309c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = true;
            } else {
                if (z10) {
                    q(a(4, i13, i12, bVar.f5309c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = false;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f5310d) {
            Object obj = bVar.f5309c;
            b(bVar);
            bVar = a(4, i13, i12, obj);
        }
        if (z10) {
            q(bVar);
        } else {
            k(bVar);
        }
    }

    private boolean h(int i10) {
        int size = this.f5301c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f5301c.get(i11);
            int i12 = bVar.f5307a;
            if (i12 == 8) {
                if (n(bVar.f5310d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f5308b;
                int i14 = bVar.f5310d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i10;
        int i11 = bVar.f5307a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int u10 = u(bVar.f5308b, i11);
        int i12 = bVar.f5308b;
        int i13 = bVar.f5307a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f5310d; i15++) {
            int u11 = u(bVar.f5308b + (i10 * i15), bVar.f5307a);
            int i16 = bVar.f5307a;
            if (i16 == 2 ? u11 == u10 : i16 == 4 && u11 == u10 + 1) {
                i14++;
            } else {
                b a10 = a(i16, u10, i14, bVar.f5309c);
                l(a10, i12);
                b(a10);
                if (bVar.f5307a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                u10 = u11;
            }
        }
        Object obj = bVar.f5309c;
        b(bVar);
        if (i14 > 0) {
            b a11 = a(bVar.f5307a, u10, i14, obj);
            l(a11, i12);
            b(a11);
        }
    }

    private void q(b bVar) {
        this.f5301c.add(bVar);
        int i10 = bVar.f5307a;
        if (i10 == 1) {
            this.f5302d.g(bVar.f5308b, bVar.f5310d);
            return;
        }
        if (i10 == 2) {
            this.f5302d.d(bVar.f5308b, bVar.f5310d);
            return;
        }
        if (i10 == 4) {
            this.f5302d.e(bVar.f5308b, bVar.f5310d, bVar.f5309c);
        } else {
            if (i10 == 8) {
                this.f5302d.a(bVar.f5308b, bVar.f5310d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int u(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        for (int size = this.f5301c.size() - 1; size >= 0; size--) {
            b bVar = this.f5301c.get(size);
            int i18 = bVar.f5307a;
            if (i18 == 8) {
                int i19 = bVar.f5308b;
                int i20 = bVar.f5310d;
                if (i19 < i20) {
                    i14 = i19;
                    i13 = i20;
                } else {
                    i13 = i19;
                    i14 = i20;
                }
                if (i10 < i14 || i10 > i13) {
                    if (i10 < i19) {
                        if (i11 == 1) {
                            bVar.f5308b = i19 + 1;
                            i15 = i20 + 1;
                        } else if (i11 == 2) {
                            bVar.f5308b = i19 - 1;
                            i15 = i20 - 1;
                        }
                        bVar.f5310d = i15;
                    }
                } else if (i14 == i19) {
                    if (i11 == 1) {
                        i17 = i20 + 1;
                    } else {
                        if (i11 == 2) {
                            i17 = i20 - 1;
                        }
                        i10++;
                    }
                    bVar.f5310d = i17;
                    i10++;
                } else {
                    if (i11 == 1) {
                        i16 = i19 + 1;
                    } else {
                        if (i11 == 2) {
                            i16 = i19 - 1;
                        }
                        i10--;
                    }
                    bVar.f5308b = i16;
                    i10--;
                }
            } else {
                int i21 = bVar.f5308b;
                if (i21 > i10) {
                    if (i11 == 1) {
                        i12 = i21 + 1;
                    } else if (i11 == 2) {
                        i12 = i21 - 1;
                    }
                    bVar.f5308b = i12;
                } else if (i18 == 1) {
                    i10 -= bVar.f5310d;
                } else if (i18 == 2) {
                    i10 += bVar.f5310d;
                }
            }
        }
        for (int size2 = this.f5301c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f5301c.get(size2);
            if (bVar2.f5307a == 8) {
                int i22 = bVar2.f5310d;
                if (i22 != bVar2.f5308b && i22 >= 0) {
                }
                this.f5301c.remove(size2);
                b(bVar2);
            } else {
                if (bVar2.f5310d > 0) {
                }
                this.f5301c.remove(size2);
                b(bVar2);
            }
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.g.a
    public b a(int i10, int i11, int i12, Object obj) {
        b b10 = this.f5299a.b();
        if (b10 == null) {
            return new b(i10, i11, i12, obj);
        }
        b10.f5307a = i10;
        b10.f5308b = i11;
        b10.f5310d = i12;
        b10.f5309c = obj;
        return b10;
    }

    @Override // androidx.recyclerview.widget.g.a
    public void b(b bVar) {
        if (this.f5304f) {
            return;
        }
        bVar.f5309c = null;
        this.f5299a.a(bVar);
    }

    public int e(int i10) {
        int size = this.f5300b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f5300b.get(i11);
            int i12 = bVar.f5307a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f5308b;
                    if (i13 <= i10) {
                        int i14 = bVar.f5310d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f5308b;
                    if (i15 == i10) {
                        i10 = bVar.f5310d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f5310d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f5308b <= i10) {
                i10 += bVar.f5310d;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i() {
        int size = this.f5301c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f5302d.c(this.f5301c.get(i10));
        }
        s(this.f5301c);
        this.f5306h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        i();
        int size = this.f5300b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f5300b.get(i10);
            int i11 = bVar.f5307a;
            if (i11 == 1) {
                this.f5302d.c(bVar);
                this.f5302d.g(bVar.f5308b, bVar.f5310d);
            } else if (i11 == 2) {
                this.f5302d.c(bVar);
                this.f5302d.h(bVar.f5308b, bVar.f5310d);
            } else if (i11 == 4) {
                this.f5302d.c(bVar);
                this.f5302d.e(bVar.f5308b, bVar.f5310d, bVar.f5309c);
            } else if (i11 == 8) {
                this.f5302d.c(bVar);
                this.f5302d.a(bVar.f5308b, bVar.f5310d);
            }
            Runnable runnable = this.f5303e;
            if (runnable != null) {
                runnable.run();
            }
        }
        s(this.f5300b);
        this.f5306h = 0;
    }

    void l(b bVar, int i10) {
        this.f5302d.b(bVar);
        int i11 = bVar.f5307a;
        if (i11 == 2) {
            this.f5302d.h(i10, bVar.f5310d);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f5302d.e(i10, bVar.f5310d, bVar.f5309c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m(int i10) {
        return n(i10, 0);
    }

    int n(int i10, int i11) {
        int size = this.f5301c.size();
        while (i11 < size) {
            b bVar = this.f5301c.get(i11);
            int i12 = bVar.f5307a;
            if (i12 == 8) {
                int i13 = bVar.f5308b;
                if (i13 == i10) {
                    i10 = bVar.f5310d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f5310d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f5308b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f5310d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f5310d;
                }
            }
            i11++;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o(int i10) {
        return (i10 & this.f5306h) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        return this.f5300b.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        this.f5305g.b(this.f5300b);
        int size = this.f5300b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f5300b.get(i10);
            int i11 = bVar.f5307a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f5303e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f5300b.clear();
    }

    void s(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b(list.get(i10));
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t() {
        s(this.f5300b);
        s(this.f5301c);
        this.f5306h = 0;
    }
}
