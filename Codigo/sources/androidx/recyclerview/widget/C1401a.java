package androidx.recyclerview.widget;

import androidx.core.util.C0982f;
import androidx.core.util.InterfaceC0981e;
import androidx.recyclerview.widget.C1407g;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.a */
/* loaded from: classes.dex */
public final class C1401a implements C1407g.a {

    /* renamed from: a */
    private InterfaceC0981e<b> f6119a;

    /* renamed from: b */
    final ArrayList<b> f6120b;

    /* renamed from: c */
    final ArrayList<b> f6121c;

    /* renamed from: d */
    final a f6122d;

    /* renamed from: e */
    Runnable f6123e;

    /* renamed from: f */
    final boolean f6124f;

    /* renamed from: g */
    final C1407g f6125g;

    /* renamed from: h */
    private int f6126h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo7773a(int i10, int i11);

        /* renamed from: b */
        void mo7774b(b bVar);

        /* renamed from: c */
        void mo7775c(b bVar);

        /* renamed from: d */
        void mo7776d(int i10, int i11);

        /* renamed from: e */
        void mo7777e(int i10, int i11, Object obj);

        /* renamed from: f */
        RecyclerView.AbstractC1370b0 mo7778f(int i10);

        /* renamed from: g */
        void mo7779g(int i10, int i11);

        /* renamed from: h */
        void mo7780h(int i10, int i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        int f6127a;

        /* renamed from: b */
        int f6128b;

        /* renamed from: c */
        Object f6129c;

        /* renamed from: d */
        int f6130d;

        b(int i10, int i11, int i12, Object obj) {
            this.f6127a = i10;
            this.f6128b = i11;
            this.f6130d = i12;
            this.f6129c = obj;
        }

        /* renamed from: a */
        String m7989a() {
            int i10 = this.f6127a;
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
            int i10 = this.f6127a;
            if (i10 != bVar.f6127a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f6130d - this.f6128b) == 1 && this.f6130d == bVar.f6128b && this.f6128b == bVar.f6130d) {
                return true;
            }
            if (this.f6130d != bVar.f6130d || this.f6128b != bVar.f6128b) {
                return false;
            }
            Object obj2 = this.f6129c;
            Object obj3 = bVar.f6129c;
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
            return (((this.f6127a * 31) + this.f6128b) * 31) + this.f6130d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m7989a() + ",s:" + this.f6128b + "c:" + this.f6130d + ",p:" + this.f6129c + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1401a(a aVar) {
        this(aVar, false);
    }

    C1401a(a aVar, boolean z10) {
        this.f6119a = new C0982f(30);
        this.f6120b = new ArrayList<>();
        this.f6121c = new ArrayList<>();
        this.f6126h = 0;
        this.f6122d = aVar;
        this.f6124f = z10;
        this.f6125g = new C1407g(this);
    }

    /* renamed from: c */
    private void m7968c(b bVar) {
        m7974q(bVar);
    }

    /* renamed from: d */
    private void m7969d(b bVar) {
        m7974q(bVar);
    }

    /* renamed from: f */
    private void m7970f(b bVar) {
        boolean z10;
        char c10;
        int i10 = bVar.f6128b;
        int i11 = bVar.f6130d + i10;
        char c11 = 65535;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f6122d.mo7778f(i12) != null || m7972h(i12)) {
                if (c11 == 0) {
                    m7973k(mo7976a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 1;
            } else {
                if (c11 == 1) {
                    m7974q(mo7976a(2, i10, i13, null));
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
        if (i13 != bVar.f6130d) {
            mo7977b(bVar);
            bVar = mo7976a(2, i10, i13, null);
        }
        if (c11 == 0) {
            m7973k(bVar);
        } else {
            m7974q(bVar);
        }
    }

    /* renamed from: g */
    private void m7971g(b bVar) {
        int i10 = bVar.f6128b;
        int i11 = bVar.f6130d + i10;
        int i12 = 0;
        boolean z10 = -1;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f6122d.mo7778f(i10) != null || m7972h(i10)) {
                if (!z10) {
                    m7973k(mo7976a(4, i13, i12, bVar.f6129c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = true;
            } else {
                if (z10) {
                    m7974q(mo7976a(4, i13, i12, bVar.f6129c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = false;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f6130d) {
            Object obj = bVar.f6129c;
            mo7977b(bVar);
            bVar = mo7976a(4, i13, i12, obj);
        }
        if (z10) {
            m7974q(bVar);
        } else {
            m7973k(bVar);
        }
    }

    /* renamed from: h */
    private boolean m7972h(int i10) {
        int size = this.f6121c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f6121c.get(i11);
            int i12 = bVar.f6127a;
            if (i12 == 8) {
                if (m7983n(bVar.f6130d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f6128b;
                int i14 = bVar.f6130d + i13;
                while (i13 < i14) {
                    if (m7983n(i13, i11 + 1) == i10) {
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

    /* renamed from: k */
    private void m7973k(b bVar) {
        int i10;
        int i11 = bVar.f6127a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m7975u = m7975u(bVar.f6128b, i11);
        int i12 = bVar.f6128b;
        int i13 = bVar.f6127a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f6130d; i15++) {
            int m7975u2 = m7975u(bVar.f6128b + (i10 * i15), bVar.f6127a);
            int i16 = bVar.f6127a;
            if (i16 == 2 ? m7975u2 == m7975u : i16 == 4 && m7975u2 == m7975u + 1) {
                i14++;
            } else {
                b mo7976a = mo7976a(i16, m7975u, i14, bVar.f6129c);
                m7981l(mo7976a, i12);
                mo7977b(mo7976a);
                if (bVar.f6127a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                m7975u = m7975u2;
            }
        }
        Object obj = bVar.f6129c;
        mo7977b(bVar);
        if (i14 > 0) {
            b mo7976a2 = mo7976a(bVar.f6127a, m7975u, i14, obj);
            m7981l(mo7976a2, i12);
            mo7977b(mo7976a2);
        }
    }

    /* renamed from: q */
    private void m7974q(b bVar) {
        this.f6121c.add(bVar);
        int i10 = bVar.f6127a;
        if (i10 == 1) {
            this.f6122d.mo7779g(bVar.f6128b, bVar.f6130d);
            return;
        }
        if (i10 == 2) {
            this.f6122d.mo7776d(bVar.f6128b, bVar.f6130d);
            return;
        }
        if (i10 == 4) {
            this.f6122d.mo7777e(bVar.f6128b, bVar.f6130d, bVar.f6129c);
        } else {
            if (i10 == 8) {
                this.f6122d.mo7773a(bVar.f6128b, bVar.f6130d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: u */
    private int m7975u(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        for (int size = this.f6121c.size() - 1; size >= 0; size--) {
            b bVar = this.f6121c.get(size);
            int i18 = bVar.f6127a;
            if (i18 == 8) {
                int i19 = bVar.f6128b;
                int i20 = bVar.f6130d;
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
                            bVar.f6128b = i19 + 1;
                            i15 = i20 + 1;
                        } else if (i11 == 2) {
                            bVar.f6128b = i19 - 1;
                            i15 = i20 - 1;
                        }
                        bVar.f6130d = i15;
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
                    bVar.f6130d = i17;
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
                    bVar.f6128b = i16;
                    i10--;
                }
            } else {
                int i21 = bVar.f6128b;
                if (i21 > i10) {
                    if (i11 == 1) {
                        i12 = i21 + 1;
                    } else if (i11 == 2) {
                        i12 = i21 - 1;
                    }
                    bVar.f6128b = i12;
                } else if (i18 == 1) {
                    i10 -= bVar.f6130d;
                } else if (i18 == 2) {
                    i10 += bVar.f6130d;
                }
            }
        }
        for (int size2 = this.f6121c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f6121c.get(size2);
            if (bVar2.f6127a == 8) {
                int i22 = bVar2.f6130d;
                if (i22 != bVar2.f6128b && i22 >= 0) {
                }
                this.f6121c.remove(size2);
                mo7977b(bVar2);
            } else {
                if (bVar2.f6130d > 0) {
                }
                this.f6121c.remove(size2);
                mo7977b(bVar2);
            }
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.C1407g.a
    /* renamed from: a */
    public b mo7976a(int i10, int i11, int i12, Object obj) {
        b mo4821b = this.f6119a.mo4821b();
        if (mo4821b == null) {
            return new b(i10, i11, i12, obj);
        }
        mo4821b.f6127a = i10;
        mo4821b.f6128b = i11;
        mo4821b.f6130d = i12;
        mo4821b.f6129c = obj;
        return mo4821b;
    }

    @Override // androidx.recyclerview.widget.C1407g.a
    /* renamed from: b */
    public void mo7977b(b bVar) {
        if (this.f6124f) {
            return;
        }
        bVar.f6129c = null;
        this.f6119a.mo4820a(bVar);
    }

    /* renamed from: e */
    public int m7978e(int i10) {
        int size = this.f6120b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f6120b.get(i11);
            int i12 = bVar.f6127a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f6128b;
                    if (i13 <= i10) {
                        int i14 = bVar.f6130d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f6128b;
                    if (i15 == i10) {
                        i10 = bVar.f6130d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f6130d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f6128b <= i10) {
                i10 += bVar.f6130d;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m7979i() {
        int size = this.f6121c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f6122d.mo7775c(this.f6121c.get(i10));
        }
        m7987s(this.f6121c);
        this.f6126h = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m7980j() {
        m7979i();
        int size = this.f6120b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f6120b.get(i10);
            int i11 = bVar.f6127a;
            if (i11 == 1) {
                this.f6122d.mo7775c(bVar);
                this.f6122d.mo7779g(bVar.f6128b, bVar.f6130d);
            } else if (i11 == 2) {
                this.f6122d.mo7775c(bVar);
                this.f6122d.mo7780h(bVar.f6128b, bVar.f6130d);
            } else if (i11 == 4) {
                this.f6122d.mo7775c(bVar);
                this.f6122d.mo7777e(bVar.f6128b, bVar.f6130d, bVar.f6129c);
            } else if (i11 == 8) {
                this.f6122d.mo7775c(bVar);
                this.f6122d.mo7773a(bVar.f6128b, bVar.f6130d);
            }
            Runnable runnable = this.f6123e;
            if (runnable != null) {
                runnable.run();
            }
        }
        m7987s(this.f6120b);
        this.f6126h = 0;
    }

    /* renamed from: l */
    void m7981l(b bVar, int i10) {
        this.f6122d.mo7774b(bVar);
        int i11 = bVar.f6127a;
        if (i11 == 2) {
            this.f6122d.mo7780h(i10, bVar.f6130d);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f6122d.mo7777e(i10, bVar.f6130d, bVar.f6129c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int m7982m(int i10) {
        return m7983n(i10, 0);
    }

    /* renamed from: n */
    int m7983n(int i10, int i11) {
        int size = this.f6121c.size();
        while (i11 < size) {
            b bVar = this.f6121c.get(i11);
            int i12 = bVar.f6127a;
            if (i12 == 8) {
                int i13 = bVar.f6128b;
                if (i13 == i10) {
                    i10 = bVar.f6130d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f6130d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f6128b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f6130d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f6130d;
                }
            }
            i11++;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean m7984o(int i10) {
        return (i10 & this.f6126h) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean m7985p() {
        return this.f6120b.size() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m7986r() {
        this.f6125g.m8058b(this.f6120b);
        int size = this.f6120b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f6120b.get(i10);
            int i11 = bVar.f6127a;
            if (i11 == 1) {
                m7968c(bVar);
            } else if (i11 == 2) {
                m7970f(bVar);
            } else if (i11 == 4) {
                m7971g(bVar);
            } else if (i11 == 8) {
                m7969d(bVar);
            }
            Runnable runnable = this.f6123e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f6120b.clear();
    }

    /* renamed from: s */
    void m7987s(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            mo7977b(list.get(i10));
        }
        list.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m7988t() {
        m7987s(this.f6120b);
        m7987s(this.f6121c);
        this.f6126h = 0;
    }
}
