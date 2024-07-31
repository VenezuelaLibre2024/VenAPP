package bl;

import ck.v;
import el.q0;
import el.z;
import kotlin.jvm.internal.y;
import zk.b3;

/* loaded from: classes3.dex */
public class l<E> extends b<E> {

    /* renamed from: n */
    private final int f6769n;

    /* renamed from: o */
    private final a f6770o;

    public l(int i10, a aVar, ok.l<? super E, v> lVar) {
        super(i10, lVar);
        this.f6769n = i10;
        this.f6770o = aVar;
        if (!(aVar != a.SUSPEND)) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + y.b(b.class).c() + " instead").toString());
        }
        if (i10 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i10 + " was specified").toString());
    }

    private final Object A0(E e10, boolean z10) {
        return this.f6770o == a.DROP_LATEST ? y0(e10, z10) : z0(e10);
    }

    private final Object y0(E e10, boolean z10) {
        ok.l<E, v> lVar;
        q0 d10;
        Object a10 = super.a(e10);
        if (g.i(a10) || g.h(a10)) {
            return a10;
        }
        if (!z10 || (lVar = this.f6729c) == null || (d10 = z.d(lVar, e10, null, 2, null)) == null) {
            return g.f6763b.c(v.f7137a);
        }
        throw d10;
    }

    private final Object z0(E e10) {
        i iVar;
        Object obj = c.f6743d;
        i iVar2 = (i) b.f6723i.get(this);
        while (true) {
            long andIncrement = b.f6719e.getAndIncrement(this);
            long j10 = andIncrement & 1152921504606846975L;
            boolean S = S(andIncrement);
            int i10 = c.f6741b;
            long j11 = j10 / i10;
            int i11 = (int) (j10 % i10);
            if (iVar2.f14765c != j11) {
                i C = C(j11, iVar2);
                if (C != null) {
                    iVar = C;
                } else if (S) {
                    return g.f6763b.a(H());
                }
            } else {
                iVar = iVar2;
            }
            int t02 = t0(iVar, i11, e10, j10, obj, S);
            if (t02 == 0) {
                iVar.b();
                return g.f6763b.c(v.f7137a);
            }
            if (t02 == 1) {
                return g.f6763b.c(v.f7137a);
            }
            if (t02 == 2) {
                if (S) {
                    iVar.p();
                    return g.f6763b.a(H());
                }
                b3 b3Var = obj instanceof b3 ? (b3) obj : null;
                if (b3Var != null) {
                    f0(b3Var, iVar, i11);
                }
                y((iVar.f14765c * i10) + i11);
                return g.f6763b.c(v.f7137a);
            }
            if (t02 == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (t02 == 4) {
                if (j10 < G()) {
                    iVar.b();
                }
                return g.f6763b.a(H());
            }
            if (t02 == 5) {
                iVar.b();
            }
            iVar2 = iVar;
        }
    }

    @Override // bl.b
    protected boolean T() {
        return this.f6770o == a.DROP_OLDEST;
    }

    @Override // bl.b, bl.o
    public Object a(E e10) {
        return A0(e10, false);
    }
}
