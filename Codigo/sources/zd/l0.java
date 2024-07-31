package zd;

import java.util.concurrent.TimeUnit;
import pf.g;

/* loaded from: classes.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    private final g.b f32667a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(g.b bVar) {
        this.f32667a = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pf.e a(pf.d dVar) {
        return ((g.b) this.f32667a.d(30000L, TimeUnit.MILLISECONDS)).h(dVar);
    }
}
