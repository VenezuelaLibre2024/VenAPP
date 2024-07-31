package bl;

import el.e0;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes3.dex */
public final class i<E> extends e0<i<E>> {

    /* renamed from: e, reason: collision with root package name */
    private final b<E> f6767e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReferenceArray f6768f;

    public i(long j10, i<E> iVar, b<E> bVar, int i10) {
        super(j10, iVar, i10);
        this.f6767e = bVar;
        this.f6768f = new AtomicReferenceArray(c.f6741b * 2);
    }

    private final void z(int i10, Object obj) {
        this.f6768f.lazySet(i10 * 2, obj);
    }

    public final void A(int i10, Object obj) {
        this.f6768f.set((i10 * 2) + 1, obj);
    }

    public final void B(int i10, E e10) {
        z(i10, e10);
    }

    @Override // el.e0
    public int n() {
        return c.f6741b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0063, code lost:
    
        s(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0066, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0068, code lost:
    
        r4 = u().f6729c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006e, code lost:
    
        if (r4 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0070, code lost:
    
        el.z.b(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // el.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o(int r4, java.lang.Throwable r5, gk.f r6) {
        /*
            r3 = this;
            int r5 = bl.c.f6741b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.v(r4)
        Le:
            java.lang.Object r1 = r3.w(r4)
            boolean r2 = r1 instanceof zk.b3
            if (r2 != 0) goto L74
            boolean r2 = r1 instanceof bl.p
            if (r2 == 0) goto L1b
            goto L74
        L1b:
            el.h0 r2 = bl.c.j()
            if (r1 == r2) goto L63
            el.h0 r2 = bl.c.i()
            if (r1 != r2) goto L28
            goto L63
        L28:
            el.h0 r2 = bl.c.p()
            if (r1 == r2) goto Le
            el.h0 r2 = bl.c.q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            el.h0 r4 = bl.c.f()
            if (r1 == r4) goto L62
            el.h0 r4 = bl.c.f6743d
            if (r1 != r4) goto L40
            goto L62
        L40:
            el.h0 r4 = bl.c.z()
            if (r1 != r4) goto L47
            return
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            return
        L63:
            r3.s(r4)
            if (r0 == 0) goto L73
            bl.b r4 = r3.u()
            ok.l<E, ck.v> r4 = r4.f6729c
            if (r4 == 0) goto L73
            el.z.b(r4, r5, r6)
        L73:
            return
        L74:
            if (r0 == 0) goto L7b
            el.h0 r2 = bl.c.j()
            goto L7f
        L7b:
            el.h0 r2 = bl.c.i()
        L7f:
            boolean r1 = r3.r(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.s(r4)
            r1 = r0 ^ 1
            r3.x(r4, r1)
            if (r0 == 0) goto L9a
            bl.b r4 = r3.u()
            ok.l<E, ck.v> r4 = r4.f6729c
            if (r4 == 0) goto L9a
            el.z.b(r4, r5, r6)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bl.i.o(int, java.lang.Throwable, gk.f):void");
    }

    public final boolean r(int i10, Object obj, Object obj2) {
        return h.a(this.f6768f, (i10 * 2) + 1, obj, obj2);
    }

    public final void s(int i10) {
        z(i10, null);
    }

    public final Object t(int i10, Object obj) {
        return this.f6768f.getAndSet((i10 * 2) + 1, obj);
    }

    public final b<E> u() {
        b<E> bVar = this.f6767e;
        kotlin.jvm.internal.n.b(bVar);
        return bVar;
    }

    public final E v(int i10) {
        return (E) this.f6768f.get(i10 * 2);
    }

    public final Object w(int i10) {
        return this.f6768f.get((i10 * 2) + 1);
    }

    public final void x(int i10, boolean z10) {
        if (z10) {
            u().x0((this.f14765c * c.f6741b) + i10);
        }
        p();
    }

    public final E y(int i10) {
        E v10 = v(i10);
        s(i10);
        return v10;
    }
}
