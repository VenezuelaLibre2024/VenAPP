package el;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f14805a = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f14806b = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_prev");

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f14807c = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* loaded from: classes3.dex */
    public static abstract class a extends el.b<s> {

        /* renamed from: b, reason: collision with root package name */
        public final s f14808b;

        /* renamed from: c, reason: collision with root package name */
        public s f14809c;

        public a(s sVar) {
            this.f14808b = sVar;
        }

        @Override // el.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(s sVar, Object obj) {
            boolean z10 = obj == null;
            s sVar2 = z10 ? this.f14808b : this.f14809c;
            if (sVar2 != null && androidx.concurrent.futures.b.a(s.f14805a, sVar, this, sVar2) && z10) {
                s sVar3 = this.f14808b;
                s sVar4 = this.f14809c;
                kotlin.jvm.internal.n.b(sVar4);
                sVar3.k(sVar4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (androidx.concurrent.futures.b.a(r4, r3, r2, ((el.b0) r5).f14758a) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final el.s i(el.a0 r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = el.s.f14806b
            java.lang.Object r0 = r0.get(r8)
            el.s r0 = (el.s) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = el.s.f14805a
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L20
            if (r0 != r2) goto L16
            return r2
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = el.s.f14806b
            boolean r0 = androidx.concurrent.futures.b.a(r1, r8, r0, r2)
            if (r0 != 0) goto L1f
            goto L0
        L1f:
            return r2
        L20:
            boolean r6 = r8.q()
            if (r6 == 0) goto L27
            return r1
        L27:
            if (r5 != r9) goto L2a
            return r2
        L2a:
            boolean r6 = r5 instanceof el.a0
            if (r6 == 0) goto L34
            el.a0 r5 = (el.a0) r5
            r5.a(r2)
            goto L0
        L34:
            boolean r6 = r5 instanceof el.b0
            if (r6 == 0) goto L50
            if (r3 == 0) goto L47
            el.b0 r5 = (el.b0) r5
            el.s r5 = r5.f14758a
            boolean r2 = androidx.concurrent.futures.b.a(r4, r3, r2, r5)
            if (r2 != 0) goto L45
            goto L0
        L45:
            r2 = r3
            goto La
        L47:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = el.s.f14806b
            java.lang.Object r2 = r4.get(r2)
            el.s r2 = (el.s) r2
            goto Lb
        L50:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.n.c(r5, r3)
            r3 = r5
            el.s r3 = (el.s) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: el.s.i(el.a0):el.s");
    }

    private final s j(s sVar) {
        while (sVar.q()) {
            sVar = (s) f14806b.get(sVar);
        }
        return sVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(s sVar) {
        s sVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14806b;
        do {
            sVar2 = (s) atomicReferenceFieldUpdater.get(sVar);
            if (l() != sVar) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f14806b, sVar, sVar2, this));
        if (q()) {
            sVar.i(null);
        }
    }

    private final b0 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14807c;
        b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0(this);
        atomicReferenceFieldUpdater.lazySet(this, b0Var2);
        return b0Var2;
    }

    public final boolean g(s sVar) {
        f14806b.lazySet(sVar, this);
        f14805a.lazySet(sVar, this);
        while (l() == this) {
            if (androidx.concurrent.futures.b.a(f14805a, this, this, sVar)) {
                sVar.k(this);
                return true;
            }
        }
        return false;
    }

    public final Object l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14805a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof a0)) {
                return obj;
            }
            ((a0) obj).a(this);
        }
    }

    public final s o() {
        return r.b(l());
    }

    public final s p() {
        s i10 = i(null);
        return i10 == null ? j((s) f14806b.get(this)) : i10;
    }

    public boolean q() {
        return l() instanceof b0;
    }

    public boolean r() {
        return s() == null;
    }

    public final s s() {
        Object l10;
        s sVar;
        do {
            l10 = l();
            if (l10 instanceof b0) {
                return ((b0) l10).f14758a;
            }
            if (l10 == this) {
                return (s) l10;
            }
            kotlin.jvm.internal.n.c(l10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            sVar = (s) l10;
        } while (!androidx.concurrent.futures.b.a(f14805a, this, l10, sVar.t()));
        sVar.i(null);
        return null;
    }

    public String toString() {
        return new kotlin.jvm.internal.r(this) { // from class: el.s.b
            @Override // vk.f
            public Object get() {
                return zk.o0.a(this.receiver);
            }
        } + '@' + zk.o0.b(this);
    }

    public final int u(s sVar, s sVar2, a aVar) {
        f14806b.lazySet(sVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14805a;
        atomicReferenceFieldUpdater.lazySet(sVar, sVar2);
        aVar.f14809c = sVar2;
        if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, sVar2, aVar)) {
            return aVar.a(this) == null ? 1 : 2;
        }
        return 0;
    }
}
