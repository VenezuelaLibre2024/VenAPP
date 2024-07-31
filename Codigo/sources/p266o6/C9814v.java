package p266o6;

import java.util.Iterator;
import java.util.concurrent.Executor;
import p132h6.AbstractC7646p;
import p289p6.InterfaceC10067d;
import p305q6.InterfaceC10278b;

/* renamed from: o6.v */
/* loaded from: classes.dex */
public class C9814v {

    /* renamed from: a */
    private final Executor f24234a;

    /* renamed from: b */
    private final InterfaceC10067d f24235b;

    /* renamed from: c */
    private final InterfaceC9816x f24236c;

    /* renamed from: d */
    private final InterfaceC10278b f24237d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9814v(Executor executor, InterfaceC10067d interfaceC10067d, InterfaceC9816x interfaceC9816x, InterfaceC10278b interfaceC10278b) {
        this.f24234a = executor;
        this.f24235b = interfaceC10067d;
        this.f24236c = interfaceC9816x;
        this.f24237d = interfaceC10278b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m29480d() {
        Iterator<AbstractC7646p> it = this.f24235b.mo30023J().iterator();
        while (it.hasNext()) {
            this.f24236c.mo29439b(it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m29481e() {
        this.f24237d.mo30126b(new InterfaceC10278b.a() { // from class: o6.u
            @Override // p305q6.InterfaceC10278b.a
            /* renamed from: n */
            public final Object mo28964n() {
                Object m29480d;
                m29480d = C9814v.this.m29480d();
                return m29480d;
            }
        });
    }

    /* renamed from: c */
    public void m29482c() {
        this.f24234a.execute(new Runnable() { // from class: o6.t
            @Override // java.lang.Runnable
            public final void run() {
                C9814v.this.m29481e();
            }
        });
    }
}
