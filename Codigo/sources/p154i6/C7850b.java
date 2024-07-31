package p154i6;

import p154i6.AbstractC7855g;

/* renamed from: i6.b */
/* loaded from: classes.dex */
final class C7850b extends AbstractC7855g {

    /* renamed from: a */
    private final AbstractC7855g.a f18823a;

    /* renamed from: b */
    private final long f18824b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7850b(AbstractC7855g.a aVar, long j10) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f18823a = aVar;
        this.f18824b = j10;
    }

    @Override // p154i6.AbstractC7855g
    /* renamed from: b */
    public long mo24149b() {
        return this.f18824b;
    }

    @Override // p154i6.AbstractC7855g
    /* renamed from: c */
    public AbstractC7855g.a mo24150c() {
        return this.f18823a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7855g)) {
            return false;
        }
        AbstractC7855g abstractC7855g = (AbstractC7855g) obj;
        return this.f18823a.equals(abstractC7855g.mo24150c()) && this.f18824b == abstractC7855g.mo24149b();
    }

    public int hashCode() {
        int hashCode = (this.f18823a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f18824b;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f18823a + ", nextRequestWaitMillis=" + this.f18824b + "}";
    }
}
