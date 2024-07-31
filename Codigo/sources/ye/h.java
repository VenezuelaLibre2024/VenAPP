package ye;

import android.content.Context;
import pc.q;

/* loaded from: classes.dex */
public class h {

    /* loaded from: classes.dex */
    public interface a<T> {
        String a(T t10);
    }

    public static pc.c<?> b(String str, String str2) {
        return pc.c.l(f.a(str, str2), f.class);
    }

    public static pc.c<?> c(final String str, final a<Context> aVar) {
        return pc.c.m(f.class).b(q.j(Context.class)).f(new pc.g() { // from class: ye.g
            @Override // pc.g
            public final Object a(pc.d dVar) {
                f d10;
                d10 = h.d(str, aVar, dVar);
                return d10;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f d(String str, a aVar, pc.d dVar) {
        return f.a(str, aVar.a((Context) dVar.get(Context.class)));
    }
}
