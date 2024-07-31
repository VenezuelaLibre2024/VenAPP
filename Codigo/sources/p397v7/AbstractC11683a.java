package p397v7;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p351s8.InterfaceC10834m0;
import p361t6.AbstractC11018d4;
import p363t8.C11137a;
import p376u6.C11391m3;
import p397v7.InterfaceC11684a0;
import p397v7.InterfaceC11705h0;
import p436x6.InterfaceC12329u;

/* renamed from: v7.a */
/* loaded from: classes.dex */
public abstract class AbstractC11683a implements InterfaceC11684a0 {

    /* renamed from: a */
    private final ArrayList<InterfaceC11684a0.c> f30605a = new ArrayList<>(1);

    /* renamed from: b */
    private final HashSet<InterfaceC11684a0.c> f30606b = new HashSet<>(1);

    /* renamed from: c */
    private final InterfaceC11705h0.a f30607c = new InterfaceC11705h0.a();

    /* renamed from: d */
    private final InterfaceC12329u.a f30608d = new InterfaceC12329u.a();

    /* renamed from: e */
    private Looper f30609e;

    /* renamed from: f */
    private AbstractC11018d4 f30610f;

    /* renamed from: r */
    private C11391m3 f30611r;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: A */
    public final C11391m3 m36800A() {
        return (C11391m3) C11137a.m34607i(this.f30611r);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: B */
    public final boolean m36801B() {
        return !this.f30606b.isEmpty();
    }

    /* renamed from: C */
    protected abstract void mo11833C(InterfaceC10834m0 interfaceC10834m0);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D */
    public final void m36802D(AbstractC11018d4 abstractC11018d4) {
        this.f30610f = abstractC11018d4;
        Iterator<InterfaceC11684a0.c> it = this.f30605a.iterator();
        while (it.hasNext()) {
            it.next().mo34304a(this, abstractC11018d4);
        }
    }

    /* renamed from: E */
    protected abstract void mo11834E();

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: a */
    public final void mo36803a(InterfaceC11684a0.c cVar, InterfaceC10834m0 interfaceC10834m0, C11391m3 c11391m3) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f30609e;
        C11137a.m34599a(looper == null || looper == myLooper);
        this.f30611r = c11391m3;
        AbstractC11018d4 abstractC11018d4 = this.f30610f;
        this.f30605a.add(cVar);
        if (this.f30609e == null) {
            this.f30609e = myLooper;
            this.f30606b.add(cVar);
            mo11833C(interfaceC10834m0);
        } else if (abstractC11018d4 != null) {
            mo36806f(cVar);
            cVar.mo34304a(this, abstractC11018d4);
        }
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: b */
    public final void mo36804b(InterfaceC11684a0.c cVar) {
        this.f30605a.remove(cVar);
        if (!this.f30605a.isEmpty()) {
            mo36805c(cVar);
            return;
        }
        this.f30609e = null;
        this.f30610f = null;
        this.f30611r = null;
        this.f30606b.clear();
        mo11834E();
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: c */
    public final void mo36805c(InterfaceC11684a0.c cVar) {
        boolean z10 = !this.f30606b.isEmpty();
        this.f30606b.remove(cVar);
        if (z10 && this.f30606b.isEmpty()) {
            mo36816y();
        }
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: f */
    public final void mo36806f(InterfaceC11684a0.c cVar) {
        C11137a.m34603e(this.f30609e);
        boolean isEmpty = this.f30606b.isEmpty();
        this.f30606b.add(cVar);
        if (isEmpty) {
            mo36817z();
        }
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: g */
    public final void mo36807g(InterfaceC11705h0 interfaceC11705h0) {
        this.f30607c.m36883C(interfaceC11705h0);
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: j */
    public final void mo36808j(Handler handler, InterfaceC11705h0 interfaceC11705h0) {
        C11137a.m34603e(handler);
        C11137a.m34603e(interfaceC11705h0);
        this.f30607c.m36887g(handler, interfaceC11705h0);
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: q */
    public final void mo36809q(InterfaceC12329u interfaceC12329u) {
        this.f30608d.m39873t(interfaceC12329u);
    }

    @Override // p397v7.InterfaceC11684a0
    /* renamed from: s */
    public final void mo36810s(Handler handler, InterfaceC12329u interfaceC12329u) {
        C11137a.m34603e(handler);
        C11137a.m34603e(interfaceC12329u);
        this.f30608d.m39866g(handler, interfaceC12329u);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public final InterfaceC12329u.a m36811t(int i10, InterfaceC11684a0.b bVar) {
        return this.f30608d.m39874u(i10, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final InterfaceC12329u.a m36812u(InterfaceC11684a0.b bVar) {
        return this.f30608d.m39874u(0, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public final InterfaceC11705h0.a m36813v(int i10, InterfaceC11684a0.b bVar, long j10) {
        return this.f30607c.m36886F(i10, bVar, j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public final InterfaceC11705h0.a m36814w(InterfaceC11684a0.b bVar) {
        return this.f30607c.m36886F(0, bVar, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public final InterfaceC11705h0.a m36815x(InterfaceC11684a0.b bVar, long j10) {
        C11137a.m34603e(bVar);
        return this.f30607c.m36886F(0, bVar, j10);
    }

    /* renamed from: y */
    protected void mo36816y() {
    }

    /* renamed from: z */
    protected void mo36817z() {
    }
}
