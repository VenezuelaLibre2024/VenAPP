package n6;

import h6.p;
import h6.u;
import i6.m;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import o6.x;
import q6.b;

/* loaded from: classes.dex */
public class c implements e {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f21810f = Logger.getLogger(u.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final x f21811a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f21812b;

    /* renamed from: c, reason: collision with root package name */
    private final i6.e f21813c;

    /* renamed from: d, reason: collision with root package name */
    private final p6.d f21814d;

    /* renamed from: e, reason: collision with root package name */
    private final q6.b f21815e;

    public c(Executor executor, i6.e eVar, x xVar, p6.d dVar, q6.b bVar) {
        this.f21812b = executor;
        this.f21813c = eVar;
        this.f21811a = xVar;
        this.f21814d = dVar;
        this.f21815e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(p pVar, h6.i iVar) {
        this.f21814d.V(pVar, iVar);
        this.f21811a.b(pVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final p pVar, f6.h hVar, h6.i iVar) {
        try {
            m mVar = this.f21813c.get(pVar.b());
            if (mVar == null) {
                String format = String.format("Transport backend '%s' is not registered", pVar.b());
                f21810f.warning(format);
                hVar.a(new IllegalArgumentException(format));
            } else {
                final h6.i a10 = mVar.a(iVar);
                this.f21815e.b(new b.a() { // from class: n6.b
                    @Override // q6.b.a
                    public final Object n() {
                        Object d10;
                        d10 = c.this.d(pVar, a10);
                        return d10;
                    }
                });
                hVar.a(null);
            }
        } catch (Exception e10) {
            f21810f.warning("Error scheduling event " + e10.getMessage());
            hVar.a(e10);
        }
    }

    @Override // n6.e
    public void a(final p pVar, final h6.i iVar, final f6.h hVar) {
        this.f21812b.execute(new Runnable() { // from class: n6.a
            @Override // java.lang.Runnable
            public final void run() {
                c.this.e(pVar, hVar, iVar);
            }
        });
    }
}
