package p030bl;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.C9322n;
import p089el.AbstractC7217e0;

/* renamed from: bl.i */
/* loaded from: classes3.dex */
public final class C1815i<E> extends AbstractC7217e0<C1815i<E>> {

    /* renamed from: e */
    private final C1808b<E> f7716e;

    /* renamed from: f */
    private final AtomicReferenceArray f7717f;

    public C1815i(long j10, C1815i<E> c1815i, C1808b<E> c1808b, int i10) {
        super(j10, c1815i, i10);
        this.f7716e = c1808b;
        this.f7717f = new AtomicReferenceArray(C1809c.f7690b * 2);
    }

    /* renamed from: z */
    private final void m9806z(int i10, Object obj) {
        this.f7717f.lazySet(i10 * 2, obj);
    }

    /* renamed from: A */
    public final void m9807A(int i10, Object obj) {
        this.f7717f.set((i10 * 2) + 1, obj);
    }

    /* renamed from: B */
    public final void m9808B(int i10, E e10) {
        m9806z(i10, e10);
    }

    @Override // p089el.AbstractC7217e0
    /* renamed from: n */
    public int mo9809n() {
        return C1809c.f7690b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0063, code lost:
    
        m9812s(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0066, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0068, code lost:
    
        r4 = m9814u().f7678c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006e, code lost:
    
        if (r4 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0070, code lost:
    
        p089el.C7250z.m21688b(r4, r5, r6);
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
    @Override // p089el.AbstractC7217e0
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo9810o(int r4, java.lang.Throwable r5, p124gk.InterfaceC7587f r6) {
        /*
            r3 = this;
            int r5 = p030bl.C1809c.f7690b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.m9815v(r4)
        Le:
            java.lang.Object r1 = r3.m9816w(r4)
            boolean r2 = r1 instanceof p494zk.InterfaceC13041b3
            if (r2 != 0) goto L74
            boolean r2 = r1 instanceof p030bl.C1822p
            if (r2 == 0) goto L1b
            goto L74
        L1b:
            el.h0 r2 = p030bl.C1809c.m9770j()
            if (r1 == r2) goto L63
            el.h0 r2 = p030bl.C1809c.m9769i()
            if (r1 != r2) goto L28
            goto L63
        L28:
            el.h0 r2 = p030bl.C1809c.m9776p()
            if (r1 == r2) goto Le
            el.h0 r2 = p030bl.C1809c.m9777q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            el.h0 r4 = p030bl.C1809c.m9766f()
            if (r1 == r4) goto L62
            el.h0 r4 = p030bl.C1809c.f7692d
            if (r1 != r4) goto L40
            goto L62
        L40:
            el.h0 r4 = p030bl.C1809c.m9786z()
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
            r3.m9812s(r4)
            if (r0 == 0) goto L73
            bl.b r4 = r3.m9814u()
            ok.l<E, ck.v> r4 = r4.f7678c
            if (r4 == 0) goto L73
            p089el.C7250z.m21688b(r4, r5, r6)
        L73:
            return
        L74:
            if (r0 == 0) goto L7b
            el.h0 r2 = p030bl.C1809c.m9770j()
            goto L7f
        L7b:
            el.h0 r2 = p030bl.C1809c.m9769i()
        L7f:
            boolean r1 = r3.m9811r(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.m9812s(r4)
            r1 = r0 ^ 1
            r3.m9817x(r4, r1)
            if (r0 == 0) goto L9a
            bl.b r4 = r3.m9814u()
            ok.l<E, ck.v> r4 = r4.f7678c
            if (r4 == 0) goto L9a
            p089el.C7250z.m21688b(r4, r5, r6)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bl.C1815i.mo9810o(int, java.lang.Throwable, gk.f):void");
    }

    /* renamed from: r */
    public final boolean m9811r(int i10, Object obj, Object obj2) {
        return C1814h.m9805a(this.f7717f, (i10 * 2) + 1, obj, obj2);
    }

    /* renamed from: s */
    public final void m9812s(int i10) {
        m9806z(i10, null);
    }

    /* renamed from: t */
    public final Object m9813t(int i10, Object obj) {
        return this.f7717f.getAndSet((i10 * 2) + 1, obj);
    }

    /* renamed from: u */
    public final C1808b<E> m9814u() {
        C1808b<E> c1808b = this.f7716e;
        C9322n.m27778b(c1808b);
        return c1808b;
    }

    /* renamed from: v */
    public final E m9815v(int i10) {
        return (E) this.f7717f.get(i10 * 2);
    }

    /* renamed from: w */
    public final Object m9816w(int i10) {
        return this.f7717f.get((i10 * 2) + 1);
    }

    /* renamed from: x */
    public final void m9817x(int i10, boolean z10) {
        if (z10) {
            m9814u().m9742x0((this.f16188c * C1809c.f7690b) + i10);
        }
        m21566p();
    }

    /* renamed from: y */
    public final E m9818y(int i10) {
        E m9815v = m9815v(i10);
        m9812s(i10);
        return m9815v;
    }
}
