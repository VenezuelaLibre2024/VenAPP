package il;

import ck.C2037v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9319k;
import kotlin.jvm.internal.C9322n;
import p146hl.InterfaceC7754b;
import p280ok.InterfaceC10002p;
import p280ok.InterfaceC9998l;
import p494zk.InterfaceC13041b3;
import p494zk.InterfaceC13083m;

/* renamed from: il.d */
/* loaded from: classes3.dex */
public class C8011d {

    /* renamed from: c */
    private static final AtomicReferenceFieldUpdater f19494c = AtomicReferenceFieldUpdater.newUpdater(C8011d.class, Object.class, "head");

    /* renamed from: d */
    private static final AtomicLongFieldUpdater f19495d = AtomicLongFieldUpdater.newUpdater(C8011d.class, "deqIdx");

    /* renamed from: e */
    private static final AtomicReferenceFieldUpdater f19496e = AtomicReferenceFieldUpdater.newUpdater(C8011d.class, Object.class, "tail");

    /* renamed from: f */
    private static final AtomicLongFieldUpdater f19497f = AtomicLongFieldUpdater.newUpdater(C8011d.class, "enqIdx");

    /* renamed from: g */
    private static final AtomicIntegerFieldUpdater f19498g = AtomicIntegerFieldUpdater.newUpdater(C8011d.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a */
    private final int f19499a;

    /* renamed from: b */
    private final InterfaceC9998l<Throwable, C2037v> f19500b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: il.d$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a extends C9319k implements InterfaceC10002p<Long, C8013f, C8013f> {

        /* renamed from: a */
        public static final a f19501a = new a();

        a() {
            super(2, C8012e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        /* renamed from: a */
        public final C8013f m24620a(long j10, C8013f c8013f) {
            C8013f m24630h;
            m24630h = C8012e.m24630h(j10, c8013f);
            return m24630h;
        }

        @Override // p280ok.InterfaceC10002p
        public /* bridge */ /* synthetic */ C8013f invoke(Long l10, C8013f c8013f) {
            return m24620a(l10.longValue(), c8013f);
        }
    }

    /* renamed from: il.d$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC9323o implements InterfaceC9998l<Throwable, C2037v> {
        b() {
            super(1);
        }

        /* renamed from: a */
        public final void m24621a(Throwable th2) {
            C8011d.this.m24618i();
        }

        @Override // p280ok.InterfaceC9998l
        public /* bridge */ /* synthetic */ C2037v invoke(Throwable th2) {
            m24621a(th2);
            return C2037v.f8089a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: il.d$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class c extends C9319k implements InterfaceC10002p<Long, C8013f, C8013f> {

        /* renamed from: a */
        public static final c f19503a = new c();

        c() {
            super(2, C8012e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        /* renamed from: a */
        public final C8013f m24622a(long j10, C8013f c8013f) {
            C8013f m24630h;
            m24630h = C8012e.m24630h(j10, c8013f);
            return m24630h;
        }

        @Override // p280ok.InterfaceC10002p
        public /* bridge */ /* synthetic */ C8013f invoke(Long l10, C8013f c8013f) {
            return m24622a(l10.longValue(), c8013f);
        }
    }

    public C8011d(int i10, int i11) {
        this.f19499a = i10;
        if (!(i10 > 0)) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (!(i11 >= 0 && i11 <= i10)) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        C8013f c8013f = new C8013f(0L, null, 2);
        this.head = c8013f;
        this.tail = c8013f;
        this._availablePermits = i10 - i11;
        this.f19500b = new b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
    
        r10 = true;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m24611e(p494zk.InterfaceC13041b3 r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = il.C8011d.f19496e
            java.lang.Object r3 = r2.get(r0)
            il.f r3 = (il.C8013f) r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = il.C8011d.f19497f
            long r4 = r4.getAndIncrement(r0)
            il.d$a r6 = il.C8011d.a.f19501a
            int r7 = il.C8012e.m24628f()
            long r7 = (long) r7
            long r7 = r4 / r7
        L1b:
            java.lang.Object r9 = p089el.C7214d.m21549c(r3, r7, r6)
            boolean r10 = p089el.C7219f0.m21570c(r9)
            if (r10 != 0) goto L5e
            el.e0 r10 = p089el.C7219f0.m21569b(r9)
        L29:
            java.lang.Object r13 = r2.get(r0)
            el.e0 r13 = (p089el.AbstractC7217e0) r13
            long r14 = r13.f16188c
            long r11 = r10.f16188c
            int r11 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r11 < 0) goto L39
        L37:
            r10 = 1
            goto L51
        L39:
            boolean r11 = r10.m21567q()
            if (r11 != 0) goto L41
            r10 = 0
            goto L51
        L41:
            boolean r11 = androidx.concurrent.futures.C0741b.m3751a(r2, r0, r13, r10)
            if (r11 == 0) goto L54
            boolean r10 = r13.m21565m()
            if (r10 == 0) goto L37
            r13.m21563k()
            goto L37
        L51:
            if (r10 == 0) goto L1b
            goto L5e
        L54:
            boolean r11 = r10.m21565m()
            if (r11 == 0) goto L29
            r10.m21563k()
            goto L29
        L5e:
            el.e0 r2 = p089el.C7219f0.m21569b(r9)
            il.f r2 = (il.C8013f) r2
            int r3 = il.C8012e.m24628f()
            long r6 = (long) r3
            long r4 = r4 % r6
            int r3 = (int) r4
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r2.m24631r()
            r5 = 0
            boolean r4 = p030bl.C1814h.m9805a(r4, r3, r5, r1)
            if (r4 == 0) goto L7b
            r1.mo9751f(r2, r3)
            r1 = 1
            return r1
        L7b:
            el.h0 r4 = il.C8012e.m24627e()
            el.h0 r5 = il.C8012e.m24629g()
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r2.m24631r()
            boolean r2 = p030bl.C1814h.m9805a(r2, r3, r4, r5)
            if (r2 == 0) goto Lc9
            boolean r2 = r1 instanceof p494zk.InterfaceC13083m
            if (r2 == 0) goto La1
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"
            kotlin.jvm.internal.C9322n.m27779c(r1, r2)
            zk.m r1 = (p494zk.InterfaceC13083m) r1
            ck.v r2 = ck.C2037v.f8089a
            ok.l<java.lang.Throwable, ck.v> r3 = r0.f19500b
            r1.mo24599c(r2, r3)
        L9f:
            r1 = 1
            goto Lad
        La1:
            boolean r2 = r1 instanceof p146hl.InterfaceC7754b
            if (r2 == 0) goto Lae
            hl.b r1 = (p146hl.InterfaceC7754b) r1
            ck.v r2 = ck.C2037v.f8089a
            r1.mo23658a(r2)
            goto L9f
        Lad:
            return r1
        Lae:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "unexpected: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        Lc9:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: il.C8011d.m24611e(zk.b3):boolean");
    }

    /* renamed from: f */
    private final void m24612f() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        int i11;
        do {
            atomicIntegerFieldUpdater = f19498g;
            i10 = atomicIntegerFieldUpdater.get(this);
            i11 = this.f19499a;
            if (i10 <= i11) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, i11));
    }

    /* renamed from: g */
    private final int m24613g() {
        int andDecrement;
        do {
            andDecrement = f19498g.getAndDecrement(this);
        } while (andDecrement > this.f19499a);
        return andDecrement;
    }

    /* renamed from: k */
    private final boolean m24614k(Object obj) {
        if (!(obj instanceof InterfaceC13083m)) {
            if (obj instanceof InterfaceC7754b) {
                return ((InterfaceC7754b) obj).mo23659c(this, C2037v.f8089a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        C9322n.m27779c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC13083m interfaceC13083m = (InterfaceC13083m) obj;
        Object mo24602l = interfaceC13083m.mo24602l(C2037v.f8089a, null, this.f19500b);
        if (mo24602l == null) {
            return false;
        }
        interfaceC13083m.mo24603o(mo24602l);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        r9 = true;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m24615l() {
        /*
            r15 = this;
            r0 = r15
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = il.C8011d.f19494c
            java.lang.Object r2 = r1.get(r15)
            il.f r2 = (il.C8013f) r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = il.C8011d.f19495d
            long r3 = r3.getAndIncrement(r15)
            int r5 = il.C8012e.m24628f()
            long r5 = (long) r5
            long r5 = r3 / r5
            il.d$c r7 = il.C8011d.c.f19503a
        L18:
            java.lang.Object r8 = p089el.C7214d.m21549c(r2, r5, r7)
            boolean r9 = p089el.C7219f0.m21570c(r8)
            if (r9 != 0) goto L5b
            el.e0 r9 = p089el.C7219f0.m21569b(r8)
        L26:
            java.lang.Object r12 = r1.get(r15)
            el.e0 r12 = (p089el.AbstractC7217e0) r12
            long r13 = r12.f16188c
            long r10 = r9.f16188c
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 < 0) goto L36
        L34:
            r9 = 1
            goto L4e
        L36:
            boolean r10 = r9.m21567q()
            if (r10 != 0) goto L3e
            r9 = 0
            goto L4e
        L3e:
            boolean r10 = androidx.concurrent.futures.C0741b.m3751a(r1, r15, r12, r9)
            if (r10 == 0) goto L51
            boolean r9 = r12.m21565m()
            if (r9 == 0) goto L34
            r12.m21563k()
            goto L34
        L4e:
            if (r9 == 0) goto L18
            goto L5b
        L51:
            boolean r10 = r9.m21565m()
            if (r10 == 0) goto L26
            r9.m21563k()
            goto L26
        L5b:
            el.e0 r1 = p089el.C7219f0.m21569b(r8)
            il.f r1 = (il.C8013f) r1
            r1.m21557b()
            long r7 = r1.f16188c
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 <= 0) goto L6c
            r2 = 0
            return r2
        L6c:
            int r2 = il.C8012e.m24628f()
            long r5 = (long) r2
            long r3 = r3 % r5
            int r2 = (int) r3
            el.h0 r3 = il.C8012e.m24627e()
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.m24631r()
            java.lang.Object r3 = r4.getAndSet(r2, r3)
            if (r3 != 0) goto Laf
            int r3 = il.C8012e.m24626d()
            r10 = 0
        L86:
            if (r10 >= r3) goto L9c
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.m24631r()
            java.lang.Object r4 = r4.get(r2)
            el.h0 r5 = il.C8012e.m24629g()
            if (r4 != r5) goto L98
            r4 = 1
            return r4
        L98:
            r4 = 1
            int r10 = r10 + 1
            goto L86
        L9c:
            r4 = 1
            el.h0 r3 = il.C8012e.m24627e()
            el.h0 r5 = il.C8012e.m24624b()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r1.m24631r()
            boolean r1 = p030bl.C1814h.m9805a(r1, r2, r3, r5)
            r1 = r1 ^ r4
            return r1
        Laf:
            el.h0 r1 = il.C8012e.m24625c()
            if (r3 != r1) goto Lb7
            r1 = 0
            return r1
        Lb7:
            boolean r1 = r15.m24614k(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: il.C8011d.m24615l():boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final void m24616d(InterfaceC13083m<? super C2037v> interfaceC13083m) {
        while (m24613g() <= 0) {
            C9322n.m27779c(interfaceC13083m, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (m24611e((InterfaceC13041b3) interfaceC13083m)) {
                return;
            }
        }
        interfaceC13083m.mo24599c(C2037v.f8089a, this.f19500b);
    }

    /* renamed from: h */
    public int m24617h() {
        return Math.max(f19498g.get(this), 0);
    }

    /* renamed from: i */
    public void m24618i() {
        do {
            int andIncrement = f19498g.getAndIncrement(this);
            if (andIncrement >= this.f19499a) {
                m24612f();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f19499a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!m24615l());
    }

    /* renamed from: j */
    public boolean m24619j() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19498g;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 > this.f19499a) {
                m24612f();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }
}
