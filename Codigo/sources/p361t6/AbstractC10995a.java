package p361t6;

import android.util.Pair;
import p361t6.AbstractC11018d4;
import p363t8.C11137a;
import p397v7.InterfaceC11738x0;

/* renamed from: t6.a */
/* loaded from: classes.dex */
public abstract class AbstractC10995a extends AbstractC11018d4 {

    /* renamed from: f */
    private final int f27971f;

    /* renamed from: r */
    private final InterfaceC11738x0 f27972r;

    /* renamed from: s */
    private final boolean f27973s;

    public AbstractC10995a(boolean z10, InterfaceC11738x0 interfaceC11738x0) {
        this.f27973s = z10;
        this.f27972r = interfaceC11738x0;
        this.f27971f = interfaceC11738x0.getLength();
    }

    /* renamed from: A */
    public static Object m33616A(Object obj) {
        return ((Pair) obj).second;
    }

    /* renamed from: B */
    public static Object m33617B(Object obj) {
        return ((Pair) obj).first;
    }

    /* renamed from: D */
    public static Object m33618D(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    /* renamed from: G */
    private int m33619G(int i10, boolean z10) {
        if (z10) {
            return this.f27972r.mo37099c(i10);
        }
        if (i10 < this.f27971f - 1) {
            return i10 + 1;
        }
        return -1;
    }

    /* renamed from: H */
    private int m33620H(int i10, boolean z10) {
        if (z10) {
            return this.f27972r.mo37098b(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    /* renamed from: C */
    protected abstract Object mo33621C(int i10);

    /* renamed from: E */
    protected abstract int mo33622E(int i10);

    /* renamed from: F */
    protected abstract int mo33623F(int i10);

    /* renamed from: I */
    protected abstract AbstractC11018d4 mo33624I(int i10);

    @Override // p361t6.AbstractC11018d4
    /* renamed from: f */
    public int mo33625f(boolean z10) {
        if (this.f27971f == 0) {
            return -1;
        }
        if (this.f27973s) {
            z10 = false;
        }
        int mo37102f = z10 ? this.f27972r.mo37102f() : 0;
        while (mo33624I(mo37102f).m34005v()) {
            mo37102f = m33619G(mo37102f, z10);
            if (mo37102f == -1) {
                return -1;
            }
        }
        return mo33623F(mo37102f) + mo33624I(mo37102f).mo33625f(z10);
    }

    @Override // p361t6.AbstractC11018d4
    /* renamed from: g */
    public final int mo11856g(Object obj) {
        int mo11856g;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object m33617B = m33617B(obj);
        Object m33616A = m33616A(obj);
        int mo33630x = mo33630x(m33617B);
        if (mo33630x == -1 || (mo11856g = mo33624I(mo33630x).mo11856g(m33616A)) == -1) {
            return -1;
        }
        return mo33622E(mo33630x) + mo11856g;
    }

    @Override // p361t6.AbstractC11018d4
    /* renamed from: h */
    public int mo33626h(boolean z10) {
        int i10 = this.f27971f;
        if (i10 == 0) {
            return -1;
        }
        if (this.f27973s) {
            z10 = false;
        }
        int mo37100d = z10 ? this.f27972r.mo37100d() : i10 - 1;
        while (mo33624I(mo37100d).m34005v()) {
            mo37100d = m33620H(mo37100d, z10);
            if (mo37100d == -1) {
                return -1;
            }
        }
        return mo33623F(mo37100d) + mo33624I(mo37100d).mo33626h(z10);
    }

    @Override // p361t6.AbstractC11018d4
    /* renamed from: j */
    public int mo33627j(int i10, int i11, boolean z10) {
        if (this.f27973s) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int mo33632z = mo33632z(i10);
        int mo33623F = mo33623F(mo33632z);
        int mo33627j = mo33624I(mo33632z).mo33627j(i10 - mo33623F, i11 != 2 ? i11 : 0, z10);
        if (mo33627j != -1) {
            return mo33623F + mo33627j;
        }
        int m33619G = m33619G(mo33632z, z10);
        while (m33619G != -1 && mo33624I(m33619G).m34005v()) {
            m33619G = m33619G(m33619G, z10);
        }
        if (m33619G != -1) {
            return mo33623F(m33619G) + mo33624I(m33619G).mo33625f(z10);
        }
        if (i11 == 2) {
            return mo33625f(z10);
        }
        return -1;
    }

    @Override // p361t6.AbstractC11018d4
    /* renamed from: l */
    public final AbstractC11018d4.b mo11857l(int i10, AbstractC11018d4.b bVar, boolean z10) {
        int mo33631y = mo33631y(i10);
        int mo33623F = mo33623F(mo33631y);
        mo33624I(mo33631y).mo11857l(i10 - mo33622E(mo33631y), bVar, z10);
        bVar.f28227c += mo33623F;
        if (z10) {
            bVar.f28226b = m33618D(mo33621C(mo33631y), C11137a.m34603e(bVar.f28226b));
        }
        return bVar;
    }

    @Override // p361t6.AbstractC11018d4
    /* renamed from: m */
    public final AbstractC11018d4.b mo33628m(Object obj, AbstractC11018d4.b bVar) {
        Object m33617B = m33617B(obj);
        Object m33616A = m33616A(obj);
        int mo33630x = mo33630x(m33617B);
        int mo33623F = mo33623F(mo33630x);
        mo33624I(mo33630x).mo33628m(m33616A, bVar);
        bVar.f28227c += mo33623F;
        bVar.f28226b = obj;
        return bVar;
    }

    @Override // p361t6.AbstractC11018d4
    /* renamed from: q */
    public int mo33629q(int i10, int i11, boolean z10) {
        if (this.f27973s) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int mo33632z = mo33632z(i10);
        int mo33623F = mo33623F(mo33632z);
        int mo33629q = mo33624I(mo33632z).mo33629q(i10 - mo33623F, i11 != 2 ? i11 : 0, z10);
        if (mo33629q != -1) {
            return mo33623F + mo33629q;
        }
        int m33620H = m33620H(mo33632z, z10);
        while (m33620H != -1 && mo33624I(m33620H).m34005v()) {
            m33620H = m33620H(m33620H, z10);
        }
        if (m33620H != -1) {
            return mo33623F(m33620H) + mo33624I(m33620H).mo33626h(z10);
        }
        if (i11 == 2) {
            return mo33626h(z10);
        }
        return -1;
    }

    @Override // p361t6.AbstractC11018d4
    /* renamed from: r */
    public final Object mo11859r(int i10) {
        int mo33631y = mo33631y(i10);
        return m33618D(mo33621C(mo33631y), mo33624I(mo33631y).mo11859r(i10 - mo33622E(mo33631y)));
    }

    @Override // p361t6.AbstractC11018d4
    /* renamed from: t */
    public final AbstractC11018d4.d mo11860t(int i10, AbstractC11018d4.d dVar, long j10) {
        int mo33632z = mo33632z(i10);
        int mo33623F = mo33623F(mo33632z);
        int mo33622E = mo33622E(mo33632z);
        mo33624I(mo33632z).mo11860t(i10 - mo33623F, dVar, j10);
        Object mo33621C = mo33621C(mo33632z);
        if (!AbstractC11018d4.d.f28236C.equals(dVar.f28255a)) {
            mo33621C = m33618D(mo33621C, dVar.f28255a);
        }
        dVar.f28255a = mo33621C;
        dVar.f28269z += mo33622E;
        dVar.f28253A += mo33622E;
        return dVar;
    }

    /* renamed from: x */
    protected abstract int mo33630x(Object obj);

    /* renamed from: y */
    protected abstract int mo33631y(int i10);

    /* renamed from: z */
    protected abstract int mo33632z(int i10);
}
