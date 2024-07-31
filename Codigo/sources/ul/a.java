package ul;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f27807a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f27808b;

    /* renamed from: c, reason: collision with root package name */
    private d f27809c;

    /* renamed from: d, reason: collision with root package name */
    private long f27810d;

    public a(String name, boolean z10) {
        n.e(name, "name");
        this.f27807a = name;
        this.f27808b = z10;
        this.f27810d = -1L;
    }

    public /* synthetic */ a(String str, boolean z10, int i10, g gVar) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }

    public final boolean a() {
        return this.f27808b;
    }

    public final String b() {
        return this.f27807a;
    }

    public final long c() {
        return this.f27810d;
    }

    public final d d() {
        return this.f27809c;
    }

    public final void e(d queue) {
        n.e(queue, "queue");
        d dVar = this.f27809c;
        if (dVar == queue) {
            return;
        }
        if (!(dVar == null)) {
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        this.f27809c = queue;
    }

    public abstract long f();

    public final void g(long j10) {
        this.f27810d = j10;
    }

    public String toString() {
        return this.f27807a;
    }
}
