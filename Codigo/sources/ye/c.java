package ye;

import java.util.Iterator;
import java.util.Set;
import pc.q;

/* loaded from: classes.dex */
public class c implements i {

    /* renamed from: a, reason: collision with root package name */
    private final String f31835a;

    /* renamed from: b, reason: collision with root package name */
    private final d f31836b;

    c(Set<f> set, d dVar) {
        this.f31835a = e(set);
        this.f31836b = dVar;
    }

    public static pc.c<i> c() {
        return pc.c.c(i.class).b(q.n(f.class)).f(new pc.g() { // from class: ye.b
            @Override // pc.g
            public final Object a(pc.d dVar) {
                i d10;
                d10 = c.d(dVar);
                return d10;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i d(pc.d dVar) {
        return new c(dVar.c(f.class), d.a());
    }

    private static String e(Set<f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb2.append(next.b());
            sb2.append('/');
            sb2.append(next.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // ye.i
    public String a() {
        if (this.f31836b.b().isEmpty()) {
            return this.f31835a;
        }
        return this.f31835a + ' ' + e(this.f31836b.b());
    }
}
