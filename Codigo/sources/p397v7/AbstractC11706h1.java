package p397v7;

import p351s8.InterfaceC10834m0;
import p361t6.AbstractC11018d4;
import p361t6.C11010c2;
import p397v7.InterfaceC11684a0;

/* renamed from: v7.h1 */
/* loaded from: classes.dex */
public abstract class AbstractC11706h1 extends AbstractC11701g<Void> {

    /* renamed from: w */
    private static final Void f30717w = null;

    /* renamed from: v */
    protected final InterfaceC11684a0 f30718v;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11706h1(InterfaceC11684a0 interfaceC11684a0) {
        this.f30718v = interfaceC11684a0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p397v7.AbstractC11701g, p397v7.AbstractC11683a
    /* renamed from: C */
    public final void mo11833C(InterfaceC10834m0 interfaceC10834m0) {
        super.mo11833C(interfaceC10834m0);
        mo36908V();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p397v7.AbstractC11701g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final InterfaceC11684a0.b mo36861G(Void r12, InterfaceC11684a0.b bVar) {
        return mo36901N(bVar);
    }

    /* renamed from: N */
    protected InterfaceC11684a0.b mo36901N(InterfaceC11684a0.b bVar) {
        return bVar;
    }

    /* renamed from: O */
    protected long m36902O(long j10) {
        return j10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p397v7.AbstractC11701g
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final long mo36862H(Void r12, long j10) {
        return m36902O(j10);
    }

    /* renamed from: Q */
    protected int m36904Q(int i10) {
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p397v7.AbstractC11701g
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final int mo36863I(Void r12, int i10) {
        return m36904Q(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p397v7.AbstractC11701g
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final void m36860J(Void r12, InterfaceC11684a0 interfaceC11684a0, AbstractC11018d4 abstractC11018d4) {
        mo36852T(abstractC11018d4);
    }

    /* renamed from: T */
    protected abstract void mo36852T(AbstractC11018d4 abstractC11018d4);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U */
    public final void m36907U() {
        m36865L(f30717w, this.f30718v);
    }

    /* renamed from: V */
    protected void mo36908V() {
        m36907U();
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: d */
    public C11010c2 mo11842d() {
        return this.f30718v.mo11842d();
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: o */
    public boolean mo36818o() {
        return this.f30718v.mo36818o();
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: p */
    public AbstractC11018d4 mo36819p() {
        return this.f30718v.mo36819p();
    }
}
