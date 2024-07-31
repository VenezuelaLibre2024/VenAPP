package p351s8;

import java.util.ArrayList;
import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: s8.f */
/* loaded from: classes.dex */
public abstract class AbstractC10819f implements InterfaceC10827j {

    /* renamed from: a */
    private final boolean f27357a;

    /* renamed from: b */
    private final ArrayList<InterfaceC10834m0> f27358b = new ArrayList<>(1);

    /* renamed from: c */
    private int f27359c;

    /* renamed from: d */
    private C10835n f27360d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC10819f(boolean z10) {
        this.f27357a = z10;
    }

    @Override // p351s8.InterfaceC10827j
    /* renamed from: l */
    public final void mo161l(InterfaceC10834m0 interfaceC10834m0) {
        C11137a.m34603e(interfaceC10834m0);
        if (this.f27358b.contains(interfaceC10834m0)) {
            return;
        }
        this.f27358b.add(interfaceC10834m0);
        this.f27359c++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public final void m32994r(int i10) {
        C10835n c10835n = (C10835n) C11172r0.m34928j(this.f27360d);
        for (int i11 = 0; i11 < this.f27359c; i11++) {
            this.f27358b.get(i11).mo33020a(this, c10835n, this.f27357a, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final void m32995s() {
        C10835n c10835n = (C10835n) C11172r0.m34928j(this.f27360d);
        for (int i10 = 0; i10 < this.f27359c; i10++) {
            this.f27358b.get(i10).mo33021c(this, c10835n, this.f27357a);
        }
        this.f27360d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final void m32996t(C10835n c10835n) {
        for (int i10 = 0; i10 < this.f27359c; i10++) {
            this.f27358b.get(i10).mo33022f(this, c10835n, this.f27357a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final void m32997u(C10835n c10835n) {
        this.f27360d = c10835n;
        for (int i10 = 0; i10 < this.f27359c; i10++) {
            this.f27358b.get(i10).mo33023i(this, c10835n, this.f27357a);
        }
    }
}
