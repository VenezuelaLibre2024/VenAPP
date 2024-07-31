package p249n6;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import p098f6.InterfaceC7304h;
import p132h6.AbstractC7639i;
import p132h6.AbstractC7646p;
import p132h6.C7651u;
import p154i6.InterfaceC7853e;
import p154i6.InterfaceC7861m;
import p266o6.InterfaceC9816x;
import p289p6.InterfaceC10067d;
import p305q6.InterfaceC10278b;

/* renamed from: n6.c */
/* loaded from: classes.dex */
public class C9665c implements InterfaceC9667e {

    /* renamed from: f */
    private static final Logger f23743f = Logger.getLogger(C7651u.class.getName());

    /* renamed from: a */
    private final InterfaceC9816x f23744a;

    /* renamed from: b */
    private final Executor f23745b;

    /* renamed from: c */
    private final InterfaceC7853e f23746c;

    /* renamed from: d */
    private final InterfaceC10067d f23747d;

    /* renamed from: e */
    private final InterfaceC10278b f23748e;

    public C9665c(Executor executor, InterfaceC7853e interfaceC7853e, InterfaceC9816x interfaceC9816x, InterfaceC10067d interfaceC10067d, InterfaceC10278b interfaceC10278b) {
        this.f23745b = executor;
        this.f23746c = interfaceC7853e;
        this.f23744a = interfaceC9816x;
        this.f23747d = interfaceC10067d;
        this.f23748e = interfaceC10278b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m28967d(AbstractC7646p abstractC7646p, AbstractC7639i abstractC7639i) {
        this.f23747d.mo30025V(abstractC7646p, abstractC7639i);
        this.f23744a.mo29439b(abstractC7646p, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m28968e(final AbstractC7646p abstractC7646p, InterfaceC7304h interfaceC7304h, AbstractC7639i abstractC7639i) {
        try {
            InterfaceC7861m interfaceC7861m = this.f23746c.get(abstractC7646p.mo23191b());
            if (interfaceC7861m == null) {
                String format = String.format("Transport backend '%s' is not registered", abstractC7646p.mo23191b());
                f23743f.warning(format);
                interfaceC7304h.mo9335a(new IllegalArgumentException(format));
            } else {
                final AbstractC7639i mo11801a = interfaceC7861m.mo11801a(abstractC7639i);
                this.f23748e.mo30126b(new InterfaceC10278b.a() { // from class: n6.b
                    @Override // p305q6.InterfaceC10278b.a
                    /* renamed from: n */
                    public final Object mo28964n() {
                        Object m28967d;
                        m28967d = C9665c.this.m28967d(abstractC7646p, mo11801a);
                        return m28967d;
                    }
                });
                interfaceC7304h.mo9335a(null);
            }
        } catch (Exception e10) {
            f23743f.warning("Error scheduling event " + e10.getMessage());
            interfaceC7304h.mo9335a(e10);
        }
    }

    @Override // p249n6.InterfaceC9667e
    /* renamed from: a */
    public void mo28969a(final AbstractC7646p abstractC7646p, final AbstractC7639i abstractC7639i, final InterfaceC7304h interfaceC7304h) {
        this.f23745b.execute(new Runnable() { // from class: n6.a
            @Override // java.lang.Runnable
            public final void run() {
                C9665c.this.m28968e(abstractC7646p, interfaceC7304h, abstractC7639i);
            }
        });
    }
}
