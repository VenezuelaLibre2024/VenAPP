package p289p6;

import p132h6.AbstractC7639i;
import p132h6.AbstractC7646p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p6.b */
/* loaded from: classes.dex */
public final class C10063b extends AbstractC10081k {

    /* renamed from: a */
    private final long f24722a;

    /* renamed from: b */
    private final AbstractC7646p f24723b;

    /* renamed from: c */
    private final AbstractC7639i f24724c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10063b(long j10, AbstractC7646p abstractC7646p, AbstractC7639i abstractC7639i) {
        this.f24722a = j10;
        if (abstractC7646p == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f24723b = abstractC7646p;
        if (abstractC7639i == null) {
            throw new NullPointerException("Null event");
        }
        this.f24724c = abstractC7639i;
    }

    @Override // p289p6.AbstractC10081k
    /* renamed from: b */
    public AbstractC7639i mo30017b() {
        return this.f24724c;
    }

    @Override // p289p6.AbstractC10081k
    /* renamed from: c */
    public long mo30018c() {
        return this.f24722a;
    }

    @Override // p289p6.AbstractC10081k
    /* renamed from: d */
    public AbstractC7646p mo30019d() {
        return this.f24723b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10081k)) {
            return false;
        }
        AbstractC10081k abstractC10081k = (AbstractC10081k) obj;
        return this.f24722a == abstractC10081k.mo30018c() && this.f24723b.equals(abstractC10081k.mo30019d()) && this.f24724c.equals(abstractC10081k.mo30017b());
    }

    public int hashCode() {
        long j10 = this.f24722a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f24723b.hashCode()) * 1000003) ^ this.f24724c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f24722a + ", transportContext=" + this.f24723b + ", event=" + this.f24724c + "}";
    }
}
