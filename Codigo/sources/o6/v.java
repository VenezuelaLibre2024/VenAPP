package o6;

import java.util.Iterator;
import java.util.concurrent.Executor;
import q6.b;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f22301a;

    /* renamed from: b, reason: collision with root package name */
    private final p6.d f22302b;

    /* renamed from: c, reason: collision with root package name */
    private final x f22303c;

    /* renamed from: d, reason: collision with root package name */
    private final q6.b f22304d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(Executor executor, p6.d dVar, x xVar, q6.b bVar) {
        this.f22301a = executor;
        this.f22302b = dVar;
        this.f22303c = xVar;
        this.f22304d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d() {
        Iterator<h6.p> it = this.f22302b.J().iterator();
        while (it.hasNext()) {
            this.f22303c.b(it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f22304d.b(new b.a() { // from class: o6.u
            @Override // q6.b.a
            public final Object n() {
                Object d10;
                d10 = v.this.d();
                return d10;
            }
        });
    }

    public void c() {
        this.f22301a.execute(new Runnable() { // from class: o6.t
            @Override // java.lang.Runnable
            public final void run() {
                v.this.e();
            }
        });
    }
}
