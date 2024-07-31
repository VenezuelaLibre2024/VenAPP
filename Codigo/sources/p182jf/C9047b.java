package p182jf;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import p294pc.C10132c;
import p294pc.InterfaceC10134d;
import p294pc.InterfaceC10140g;
import p294pc.InterfaceC10142i;

/* renamed from: jf.b */
/* loaded from: classes2.dex */
public class C9047b implements InterfaceC10142i {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ Object m26556c(String str, C10132c c10132c, InterfaceC10134d interfaceC10134d) {
        try {
            C9048c.m26559b(str);
            return c10132c.m30267h().mo9329a(interfaceC10134d);
        } finally {
            C9048c.m26558a();
        }
    }

    @Override // p294pc.InterfaceC10142i
    /* renamed from: a */
    public List<C10132c<?>> mo26557a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C10132c<?> c10132c : componentRegistrar.getComponents()) {
            final String m30268i = c10132c.m30268i();
            if (m30268i != null) {
                c10132c = c10132c.m30274t(new InterfaceC10140g() { // from class: jf.a
                    @Override // p294pc.InterfaceC10140g
                    /* renamed from: a */
                    public final Object mo9329a(InterfaceC10134d interfaceC10134d) {
                        Object m26556c;
                        m26556c = C9047b.m26556c(m30268i, c10132c, interfaceC10134d);
                        return m26556c;
                    }
                });
            }
            arrayList.add(c10132c);
        }
        return arrayList;
    }
}
