package uk;

import dk.AbstractC7008f0;
import kotlin.jvm.internal.C9315g;
import p187jk.C9082c;
import pk.InterfaceC10201a;

/* renamed from: uk.g */
/* loaded from: classes3.dex */
public class C11580g implements Iterable<Long>, InterfaceC10201a {

    /* renamed from: d */
    public static final a f30120d = new a(null);

    /* renamed from: a */
    private final long f30121a;

    /* renamed from: b */
    private final long f30122b;

    /* renamed from: c */
    private final long f30123c;

    /* renamed from: uk.g$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C11580g(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f30121a = j10;
        this.f30122b = C9082c.m26688d(j10, j11, j12);
        this.f30123c = j12;
    }

    /* renamed from: c */
    public final long m36278c() {
        return this.f30121a;
    }

    /* renamed from: d */
    public final long m36279d() {
        return this.f30122b;
    }

    @Override // java.lang.Iterable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public AbstractC7008f0 iterator() {
        return new C11581h(this.f30121a, this.f30122b, this.f30123c);
    }
}
