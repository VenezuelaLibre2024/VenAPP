package p266o6;

import java.util.Map;
import p098f6.EnumC7300d;
import p266o6.AbstractC9798f;
import p327r6.InterfaceC10625a;

/* renamed from: o6.b */
/* loaded from: classes.dex */
final class C9794b extends AbstractC9798f {

    /* renamed from: a */
    private final InterfaceC10625a f24174a;

    /* renamed from: b */
    private final Map<EnumC7300d, AbstractC9798f.b> f24175b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9794b(InterfaceC10625a interfaceC10625a, Map<EnumC7300d, AbstractC9798f.b> map) {
        if (interfaceC10625a == null) {
            throw new NullPointerException("Null clock");
        }
        this.f24174a = interfaceC10625a;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f24175b = map;
    }

    @Override // p266o6.AbstractC9798f
    /* renamed from: e */
    InterfaceC10625a mo29428e() {
        return this.f24174a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9798f)) {
            return false;
        }
        AbstractC9798f abstractC9798f = (AbstractC9798f) obj;
        return this.f24174a.equals(abstractC9798f.mo29428e()) && this.f24175b.equals(abstractC9798f.mo29429h());
    }

    @Override // p266o6.AbstractC9798f
    /* renamed from: h */
    Map<EnumC7300d, AbstractC9798f.b> mo29429h() {
        return this.f24175b;
    }

    public int hashCode() {
        return ((this.f24174a.hashCode() ^ 1000003) * 1000003) ^ this.f24175b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f24174a + ", values=" + this.f24175b + "}";
    }
}
