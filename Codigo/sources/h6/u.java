package h6;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public class u implements t {

    /* renamed from: e, reason: collision with root package name */
    private static volatile v f16460e;

    /* renamed from: a, reason: collision with root package name */
    private final r6.a f16461a;

    /* renamed from: b, reason: collision with root package name */
    private final r6.a f16462b;

    /* renamed from: c, reason: collision with root package name */
    private final n6.e f16463c;

    /* renamed from: d, reason: collision with root package name */
    private final o6.r f16464d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(r6.a aVar, r6.a aVar2, n6.e eVar, o6.r rVar, o6.v vVar) {
        this.f16461a = aVar;
        this.f16462b = aVar2;
        this.f16463c = eVar;
        this.f16464d = rVar;
        vVar.c();
    }

    private i b(o oVar) {
        return i.a().i(this.f16461a.a()).k(this.f16462b.a()).j(oVar.g()).h(new h(oVar.b(), oVar.d())).g(oVar.c().a()).d();
    }

    public static u c() {
        v vVar = f16460e;
        if (vVar != null) {
            return vVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<f6.b> d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(f6.b.b("proto"));
    }

    public static void f(Context context) {
        if (f16460e == null) {
            synchronized (u.class) {
                if (f16460e == null) {
                    f16460e = e.e().a(context).build();
                }
            }
        }
    }

    @Override // h6.t
    public void a(o oVar, f6.h hVar) {
        this.f16463c.a(oVar.f().f(oVar.c().c()), b(oVar), hVar);
    }

    public o6.r e() {
        return this.f16464d;
    }

    public f6.g g(f fVar) {
        return new q(d(fVar), p.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
