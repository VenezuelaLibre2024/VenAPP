package uk;

import dk.f0;

/* loaded from: classes3.dex */
public class g implements Iterable<Long>, pk.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f27797d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f27798a;

    /* renamed from: b, reason: collision with root package name */
    private final long f27799b;

    /* renamed from: c, reason: collision with root package name */
    private final long f27800c;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public g(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f27798a = j10;
        this.f27799b = jk.c.d(j10, j11, j12);
        this.f27800c = j12;
    }

    public final long c() {
        return this.f27798a;
    }

    public final long d() {
        return this.f27799b;
    }

    @Override // java.lang.Iterable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public f0 iterator() {
        return new h(this.f27798a, this.f27799b, this.f27800c);
    }
}
