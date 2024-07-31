package ye;

import java.util.Iterator;
import java.util.Set;
import p294pc.C10132c;
import p294pc.C10150q;
import p294pc.InterfaceC10134d;
import p294pc.InterfaceC10140g;

/* renamed from: ye.c */
/* loaded from: classes.dex */
public class C12677c implements InterfaceC12683i {

    /* renamed from: a */
    private final String f34371a;

    /* renamed from: b */
    private final C12678d f34372b;

    C12677c(Set<AbstractC12680f> set, C12678d c12678d) {
        this.f34371a = m41718e(set);
        this.f34372b = c12678d;
    }

    /* renamed from: c */
    public static C10132c<InterfaceC12683i> m41716c() {
        return C10132c.m30257c(InterfaceC12683i.class).m30279b(C10150q.m30357n(AbstractC12680f.class)).m30283f(new InterfaceC10140g() { // from class: ye.b
            @Override // p294pc.InterfaceC10140g
            /* renamed from: a */
            public final Object mo9329a(InterfaceC10134d interfaceC10134d) {
                InterfaceC12683i m41717d;
                m41717d = C12677c.m41717d(interfaceC10134d);
                return m41717d;
            }
        }).m30281d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ InterfaceC12683i m41717d(InterfaceC10134d interfaceC10134d) {
        return new C12677c(interfaceC10134d.m30296c(AbstractC12680f.class), C12678d.m41720a());
    }

    /* renamed from: e */
    private static String m41718e(Set<AbstractC12680f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<AbstractC12680f> it = set.iterator();
        while (it.hasNext()) {
            AbstractC12680f next = it.next();
            sb2.append(next.mo41713b());
            sb2.append('/');
            sb2.append(next.mo41714c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // ye.InterfaceC12683i
    /* renamed from: a */
    public String mo41719a() {
        if (this.f34372b.m41721b().isEmpty()) {
            return this.f34371a;
        }
        return this.f34371a + ' ' + m41718e(this.f34372b.m41721b());
    }
}
