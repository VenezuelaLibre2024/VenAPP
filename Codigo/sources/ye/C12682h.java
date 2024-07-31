package ye;

import android.content.Context;
import p294pc.C10132c;
import p294pc.C10150q;
import p294pc.InterfaceC10134d;
import p294pc.InterfaceC10140g;

/* renamed from: ye.h */
/* loaded from: classes.dex */
public class C12682h {

    /* renamed from: ye.h$a */
    /* loaded from: classes.dex */
    public interface a<T> {
        /* renamed from: a */
        String mo41728a(T t10);
    }

    /* renamed from: b */
    public static C10132c<?> m41725b(String str, String str2) {
        return C10132c.m30261l(AbstractC12680f.m41723a(str, str2), AbstractC12680f.class);
    }

    /* renamed from: c */
    public static C10132c<?> m41726c(final String str, final a<Context> aVar) {
        return C10132c.m30262m(AbstractC12680f.class).m30279b(C10150q.m30353j(Context.class)).m30283f(new InterfaceC10140g() { // from class: ye.g
            @Override // p294pc.InterfaceC10140g
            /* renamed from: a */
            public final Object mo9329a(InterfaceC10134d interfaceC10134d) {
                AbstractC12680f m41727d;
                m41727d = C12682h.m41727d(str, aVar, interfaceC10134d);
                return m41727d;
            }
        }).m30281d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ AbstractC12680f m41727d(String str, a aVar, InterfaceC10134d interfaceC10134d) {
        return AbstractC12680f.m41723a(str, aVar.mo41728a((Context) interfaceC10134d.get(Context.class)));
    }
}
