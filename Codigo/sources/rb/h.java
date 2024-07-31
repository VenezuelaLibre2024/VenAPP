package rb;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import jb.v;
import jb.w;
import jb.x;

/* loaded from: classes2.dex */
public class h implements w<g, g> {

    /* renamed from: a, reason: collision with root package name */
    private static final h f24877a = new h();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b implements g {

        /* renamed from: a, reason: collision with root package name */
        private final v<g> f24878a;

        private b(v<g> vVar) {
            this.f24878a = vVar;
        }
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d() {
        x.n(f24877a);
    }

    @Override // jb.w
    public Class<g> b() {
        return g.class;
    }

    @Override // jb.w
    public Class<g> c() {
        return g.class;
    }

    @Override // jb.w
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public g a(v<g> vVar) {
        if (vVar == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        }
        if (vVar.e() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator<List<v.c<g>>> it = vVar.c().iterator();
        while (it.hasNext()) {
            Iterator<v.c<g>> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
        }
        return new b(vVar);
    }
}
