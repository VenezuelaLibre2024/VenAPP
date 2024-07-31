package p388ul;

import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: ul.a */
/* loaded from: classes3.dex */
public abstract class AbstractC11586a {

    /* renamed from: a */
    private final String f30130a;

    /* renamed from: b */
    private final boolean f30131b;

    /* renamed from: c */
    private C11589d f30132c;

    /* renamed from: d */
    private long f30133d;

    public AbstractC11586a(String name, boolean z10) {
        C9322n.m27781e(name, "name");
        this.f30130a = name;
        this.f30131b = z10;
        this.f30133d = -1L;
    }

    public /* synthetic */ AbstractC11586a(String str, boolean z10, int i10, C9315g c9315g) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }

    /* renamed from: a */
    public final boolean m36303a() {
        return this.f30131b;
    }

    /* renamed from: b */
    public final String m36304b() {
        return this.f30130a;
    }

    /* renamed from: c */
    public final long m36305c() {
        return this.f30133d;
    }

    /* renamed from: d */
    public final C11589d m36306d() {
        return this.f30132c;
    }

    /* renamed from: e */
    public final void m36307e(C11589d queue) {
        C9322n.m27781e(queue, "queue");
        C11589d c11589d = this.f30132c;
        if (c11589d == queue) {
            return;
        }
        if (!(c11589d == null)) {
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        this.f30132c = queue;
    }

    /* renamed from: f */
    public abstract long mo36308f();

    /* renamed from: g */
    public final void m36309g(long j10) {
        this.f30133d = j10;
    }

    public String toString() {
        return this.f30130a;
    }
}
