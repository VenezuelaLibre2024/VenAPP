package p132h6;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import p098f6.C7298b;
import p098f6.InterfaceC7303g;
import p098f6.InterfaceC7304h;
import p249n6.InterfaceC9667e;
import p266o6.C9810r;
import p266o6.C9814v;
import p327r6.InterfaceC10625a;

/* renamed from: h6.u */
/* loaded from: classes.dex */
public class C7651u implements InterfaceC7650t {

    /* renamed from: e */
    private static volatile AbstractC7652v f18097e;

    /* renamed from: a */
    private final InterfaceC10625a f18098a;

    /* renamed from: b */
    private final InterfaceC10625a f18099b;

    /* renamed from: c */
    private final InterfaceC9667e f18100c;

    /* renamed from: d */
    private final C9810r f18101d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7651u(InterfaceC10625a interfaceC10625a, InterfaceC10625a interfaceC10625a2, InterfaceC9667e interfaceC9667e, C9810r c9810r, C9814v c9814v) {
        this.f18098a = interfaceC10625a;
        this.f18099b = interfaceC10625a2;
        this.f18100c = interfaceC9667e;
        this.f18101d = c9810r;
        c9814v.m29482c();
    }

    /* renamed from: b */
    private AbstractC7639i m23232b(AbstractC7645o abstractC7645o) {
        return AbstractC7639i.m23206a().mo23177i(this.f18098a.mo32385a()).mo23179k(this.f18099b.mo32385a()).mo23178j(abstractC7645o.mo23184g()).mo23176h(new C7638h(abstractC7645o.mo23180b(), abstractC7645o.m23224d())).mo23175g(abstractC7645o.mo23181c().mo21875a()).mo23172d();
    }

    /* renamed from: c */
    public static C7651u m23233c() {
        AbstractC7652v abstractC7652v = f18097e;
        if (abstractC7652v != null) {
            return abstractC7652v.mo23201b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    private static Set<C7298b> m23234d(InterfaceC7636f interfaceC7636f) {
        return interfaceC7636f instanceof InterfaceC7637g ? Collections.unmodifiableSet(((InterfaceC7637g) interfaceC7636f).mo11784a()) : Collections.singleton(C7298b.m21878b("proto"));
    }

    /* renamed from: f */
    public static void m23235f(Context context) {
        if (f18097e == null) {
            synchronized (C7651u.class) {
                if (f18097e == null) {
                    f18097e = C7635e.m23198e().mo23202a(context).build();
                }
            }
        }
    }

    @Override // p132h6.InterfaceC7650t
    /* renamed from: a */
    public void mo23231a(AbstractC7645o abstractC7645o, InterfaceC7304h interfaceC7304h) {
        this.f18100c.mo28969a(abstractC7645o.mo23183f().m23227f(abstractC7645o.mo23181c().mo21877c()), m23232b(abstractC7645o), interfaceC7304h);
    }

    /* renamed from: e */
    public C9810r m23236e() {
        return this.f18101d;
    }

    /* renamed from: g */
    public InterfaceC7303g m23237g(InterfaceC7636f interfaceC7636f) {
        return new C7647q(m23234d(interfaceC7636f), AbstractC7646p.m23225a().mo23195b(interfaceC7636f.getName()).mo23196c(interfaceC7636f.getExtras()).mo23194a(), this);
    }
}
