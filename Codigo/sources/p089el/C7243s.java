package p089el;

import androidx.concurrent.futures.C0741b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C9322n;
import kotlin.jvm.internal.C9326r;
import p494zk.C13092o0;

/* renamed from: el.s */
/* loaded from: classes3.dex */
public class C7243s {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f16228a = AtomicReferenceFieldUpdater.newUpdater(C7243s.class, Object.class, "_next");

    /* renamed from: b */
    private static final AtomicReferenceFieldUpdater f16229b = AtomicReferenceFieldUpdater.newUpdater(C7243s.class, Object.class, "_prev");

    /* renamed from: c */
    private static final AtomicReferenceFieldUpdater f16230c = AtomicReferenceFieldUpdater.newUpdater(C7243s.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* renamed from: el.s$a */
    /* loaded from: classes3.dex */
    public static abstract class a extends AbstractC7210b<C7243s> {

        /* renamed from: b */
        public final C7243s f16231b;

        /* renamed from: c */
        public C7243s f16232c;

        public a(C7243s c7243s) {
            this.f16231b = c7243s;
        }

        @Override // p089el.AbstractC7210b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo21541b(C7243s c7243s, Object obj) {
            boolean z10 = obj == null;
            C7243s c7243s2 = z10 ? this.f16231b : this.f16232c;
            if (c7243s2 != null && C0741b.m3751a(C7243s.f16228a, c7243s, this, c7243s2) && z10) {
                C7243s c7243s3 = this.f16231b;
                C7243s c7243s4 = this.f16232c;
                C9322n.m27778b(c7243s4);
                c7243s3.m21650k(c7243s4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (androidx.concurrent.futures.C0741b.m3751a(r4, r3, r2, ((p089el.C7211b0) r5).f16181a) != false) goto L26;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final p089el.C7243s m21648i(p089el.AbstractC7209a0 r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p089el.C7243s.f16229b
            java.lang.Object r0 = r0.get(r8)
            el.s r0 = (p089el.C7243s) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = p089el.C7243s.f16228a
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L20
            if (r0 != r2) goto L16
            return r2
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p089el.C7243s.f16229b
            boolean r0 = androidx.concurrent.futures.C0741b.m3751a(r1, r8, r0, r2)
            if (r0 != 0) goto L1f
            goto L0
        L1f:
            return r2
        L20:
            boolean r6 = r8.mo21643q()
            if (r6 == 0) goto L27
            return r1
        L27:
            if (r5 != r9) goto L2a
            return r2
        L2a:
            boolean r6 = r5 instanceof p089el.AbstractC7209a0
            if (r6 == 0) goto L34
            el.a0 r5 = (p089el.AbstractC7209a0) r5
            r5.mo21539a(r2)
            goto L0
        L34:
            boolean r6 = r5 instanceof p089el.C7211b0
            if (r6 == 0) goto L50
            if (r3 == 0) goto L47
            el.b0 r5 = (p089el.C7211b0) r5
            el.s r5 = r5.f16181a
            boolean r2 = androidx.concurrent.futures.C0741b.m3751a(r4, r3, r2, r5)
            if (r2 != 0) goto L45
            goto L0
        L45:
            r2 = r3
            goto La
        L47:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = p089el.C7243s.f16229b
            java.lang.Object r2 = r4.get(r2)
            el.s r2 = (p089el.C7243s) r2
            goto Lb
        L50:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.C9322n.m27779c(r5, r3)
            r3 = r5
            el.s r3 = (p089el.C7243s) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: p089el.C7243s.m21648i(el.a0):el.s");
    }

    /* renamed from: j */
    private final C7243s m21649j(C7243s c7243s) {
        while (c7243s.mo21643q()) {
            c7243s = (C7243s) f16229b.get(c7243s);
        }
        return c7243s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final void m21650k(C7243s c7243s) {
        C7243s c7243s2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16229b;
        do {
            c7243s2 = (C7243s) atomicReferenceFieldUpdater.get(c7243s);
            if (m21653l() != c7243s) {
                return;
            }
        } while (!C0741b.m3751a(f16229b, c7243s, c7243s2, this));
        if (mo21643q()) {
            c7243s.m21648i(null);
        }
    }

    /* renamed from: t */
    private final C7211b0 m21651t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16230c;
        C7211b0 c7211b0 = (C7211b0) atomicReferenceFieldUpdater.get(this);
        if (c7211b0 != null) {
            return c7211b0;
        }
        C7211b0 c7211b02 = new C7211b0(this);
        atomicReferenceFieldUpdater.lazySet(this, c7211b02);
        return c7211b02;
    }

    /* renamed from: g */
    public final boolean m21652g(C7243s c7243s) {
        f16229b.lazySet(c7243s, this);
        f16228a.lazySet(c7243s, this);
        while (m21653l() == this) {
            if (C0741b.m3751a(f16228a, this, this, c7243s)) {
                c7243s.m21650k(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public final Object m21653l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16228a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AbstractC7209a0)) {
                return obj;
            }
            ((AbstractC7209a0) obj).mo21539a(this);
        }
    }

    /* renamed from: o */
    public final C7243s m21654o() {
        return C7242r.m21645b(m21653l());
    }

    /* renamed from: p */
    public final C7243s m21655p() {
        C7243s m21648i = m21648i(null);
        return m21648i == null ? m21649j((C7243s) f16229b.get(this)) : m21648i;
    }

    /* renamed from: q */
    public boolean mo21643q() {
        return m21653l() instanceof C7211b0;
    }

    /* renamed from: r */
    public boolean m21656r() {
        return m21657s() == null;
    }

    /* renamed from: s */
    public final C7243s m21657s() {
        Object m21653l;
        C7243s c7243s;
        do {
            m21653l = m21653l();
            if (m21653l instanceof C7211b0) {
                return ((C7211b0) m21653l).f16181a;
            }
            if (m21653l == this) {
                return (C7243s) m21653l;
            }
            C9322n.m27779c(m21653l, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            c7243s = (C7243s) m21653l;
        } while (!C0741b.m3751a(f16228a, this, m21653l, c7243s.m21651t()));
        c7243s.m21648i(null);
        return null;
    }

    public String toString() {
        return new C9326r(this) { // from class: el.s.b
            @Override // p405vk.InterfaceC11969f
            public Object get() {
                return C13092o0.m43273a(this.receiver);
            }
        } + '@' + C13092o0.m43274b(this);
    }

    /* renamed from: u */
    public final int m21658u(C7243s c7243s, C7243s c7243s2, a aVar) {
        f16229b.lazySet(c7243s, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16228a;
        atomicReferenceFieldUpdater.lazySet(c7243s, c7243s2);
        aVar.f16232c = c7243s2;
        if (C0741b.m3751a(atomicReferenceFieldUpdater, this, c7243s2, aVar)) {
            return aVar.mo21539a(this) == null ? 1 : 2;
        }
        return 0;
    }
}
