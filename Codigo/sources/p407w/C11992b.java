package p407w;

import p407w.AbstractC12032q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w.b */
/* loaded from: classes.dex */
public final class C11992b extends AbstractC12032q {

    /* renamed from: a */
    private final AbstractC12032q.b f31890a;

    /* renamed from: b */
    private final AbstractC12032q.a f31891b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11992b(AbstractC12032q.b bVar, AbstractC12032q.a aVar) {
        if (bVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f31890a = bVar;
        this.f31891b = aVar;
    }

    @Override // p407w.AbstractC12032q
    /* renamed from: c */
    public AbstractC12032q.a mo38570c() {
        return this.f31891b;
    }

    @Override // p407w.AbstractC12032q
    /* renamed from: d */
    public AbstractC12032q.b mo38571d() {
        return this.f31890a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12032q)) {
            return false;
        }
        AbstractC12032q abstractC12032q = (AbstractC12032q) obj;
        if (this.f31890a.equals(abstractC12032q.mo38571d())) {
            AbstractC12032q.a aVar = this.f31891b;
            AbstractC12032q.a mo38570c = abstractC12032q.mo38570c();
            if (aVar == null) {
                if (mo38570c == null) {
                    return true;
                }
            } else if (aVar.equals(mo38570c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f31890a.hashCode() ^ 1000003) * 1000003;
        AbstractC12032q.a aVar = this.f31891b;
        return hashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "CameraState{type=" + this.f31890a + ", error=" + this.f31891b + "}";
    }
}
