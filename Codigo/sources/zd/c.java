package zd;

import android.text.TextUtils;
import cc.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final cc.a f32562a;

    /* renamed from: b, reason: collision with root package name */
    private final ij.a<String> f32563b;

    /* renamed from: c, reason: collision with root package name */
    private a.InterfaceC0120a f32564c;

    /* loaded from: classes.dex */
    private class a implements dj.h<String> {
        a() {
        }

        @Override // dj.h
        public void a(dj.g<String> gVar) {
            l2.a("Subscribing to analytics events.");
            c cVar = c.this;
            cVar.f32564c = cVar.f32562a.b("fiam", new i0(gVar));
        }
    }

    public c(cc.a aVar) {
        this.f32562a = aVar;
        ij.a<String> C = dj.f.e(new a(), dj.a.BUFFER).C();
        this.f32563b = C;
        C.K();
    }

    static Set<String> c(pf.e eVar) {
        HashSet hashSet = new HashSet();
        Iterator<of.c> it = eVar.f0().iterator();
        while (it.hasNext()) {
            for (qd.h hVar : it.next().i0()) {
                if (!TextUtils.isEmpty(hVar.b0().d0())) {
                    hashSet.add(hVar.b0().d0());
                }
            }
        }
        if (hashSet.size() > 50) {
            l2.c("Too many contextual triggers defined - limiting to 50");
        }
        return hashSet;
    }

    public ij.a<String> d() {
        return this.f32563b;
    }

    public void e(pf.e eVar) {
        Set<String> c10 = c(eVar);
        l2.a("Updating contextual triggers for the following analytics events: " + c10);
        this.f32564c.a(c10);
    }
}
