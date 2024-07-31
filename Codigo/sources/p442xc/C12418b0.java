package p442xc;

import p442xc.AbstractC12428g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xc.b0 */
/* loaded from: classes.dex */
public final class C12418b0 extends AbstractC12428g0 {

    /* renamed from: a */
    private final AbstractC12428g0.a f33467a;

    /* renamed from: b */
    private final AbstractC12428g0.c f33468b;

    /* renamed from: c */
    private final AbstractC12428g0.b f33469c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12418b0(AbstractC12428g0.a aVar, AbstractC12428g0.c cVar, AbstractC12428g0.b bVar) {
        if (aVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.f33467a = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null osData");
        }
        this.f33468b = cVar;
        if (bVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.f33469c = bVar;
    }

    @Override // p442xc.AbstractC12428g0
    /* renamed from: a */
    public AbstractC12428g0.a mo40125a() {
        return this.f33467a;
    }

    @Override // p442xc.AbstractC12428g0
    /* renamed from: c */
    public AbstractC12428g0.b mo40126c() {
        return this.f33469c;
    }

    @Override // p442xc.AbstractC12428g0
    /* renamed from: d */
    public AbstractC12428g0.c mo40127d() {
        return this.f33468b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12428g0)) {
            return false;
        }
        AbstractC12428g0 abstractC12428g0 = (AbstractC12428g0) obj;
        return this.f33467a.equals(abstractC12428g0.mo40125a()) && this.f33468b.equals(abstractC12428g0.mo40127d()) && this.f33469c.equals(abstractC12428g0.mo40126c());
    }

    public int hashCode() {
        return ((((this.f33467a.hashCode() ^ 1000003) * 1000003) ^ this.f33468b.hashCode()) * 1000003) ^ this.f33469c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f33467a + ", osData=" + this.f33468b + ", deviceData=" + this.f33469c + "}";
    }
}
