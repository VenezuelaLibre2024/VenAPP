package x6;

import android.net.Uri;
import com.google.common.collect.h1;
import java.util.Map;
import s8.j;
import s8.s;
import t6.c2;
import t8.r0;
import x6.h;

/* loaded from: classes.dex */
public final class l implements x {

    /* renamed from: a, reason: collision with root package name */
    private final Object f30532a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private c2.f f30533b;

    /* renamed from: c, reason: collision with root package name */
    private v f30534c;

    /* renamed from: d, reason: collision with root package name */
    private j.a f30535d;

    /* renamed from: e, reason: collision with root package name */
    private String f30536e;

    private v b(c2.f fVar) {
        j.a aVar = this.f30535d;
        if (aVar == null) {
            aVar = new s.b().e(this.f30536e);
        }
        Uri uri = fVar.f25919c;
        j0 j0Var = new j0(uri == null ? null : uri.toString(), fVar.f25924h, aVar);
        h1<Map.Entry<String, String>> it = fVar.f25921e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            j0Var.e(next.getKey(), next.getValue());
        }
        h a10 = new h.b().e(fVar.f25917a, i0.f30521d).b(fVar.f25922f).c(fVar.f25923g).d(hb.e.l(fVar.f25926j)).a(j0Var);
        a10.F(0, fVar.c());
        return a10;
    }

    @Override // x6.x
    public v a(c2 c2Var) {
        v vVar;
        t8.a.e(c2Var.f25880b);
        c2.f fVar = c2Var.f25880b.f25955c;
        if (fVar == null || r0.f26744a < 18) {
            return v.f30571a;
        }
        synchronized (this.f30532a) {
            if (!r0.c(fVar, this.f30533b)) {
                this.f30533b = fVar;
                this.f30534c = b(fVar);
            }
            vVar = (v) t8.a.e(this.f30534c);
        }
        return vVar;
    }
}
