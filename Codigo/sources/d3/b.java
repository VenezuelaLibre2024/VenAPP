package d3;

import java.io.IOException;
import ql.b0;
import ql.w;

/* loaded from: classes.dex */
public class b extends b0 {

    /* renamed from: b, reason: collision with root package name */
    protected final b0 f13707b;

    /* renamed from: c, reason: collision with root package name */
    protected final d3.a f13708c;

    /* renamed from: d, reason: collision with root package name */
    protected final String f13709d;

    /* renamed from: e, reason: collision with root package name */
    protected a f13710e;

    /* loaded from: classes.dex */
    protected static class a extends dm.f {

        /* renamed from: b, reason: collision with root package name */
        private long f13711b;

        /* renamed from: c, reason: collision with root package name */
        private final b f13712c;

        public a(b bVar, dm.v vVar) {
            super(vVar);
            this.f13712c = bVar;
        }

        @Override // dm.f, dm.v
        public void K0(dm.b bVar, long j10) {
            try {
                super.K0(bVar, j10);
                long j11 = this.f13711b + j10;
                this.f13711b = j11;
                b bVar2 = this.f13712c;
                if (bVar2 != null) {
                    bVar2.h(j11, bVar2.a());
                }
            } catch (IOException e10) {
                b bVar3 = this.f13712c;
                if (bVar3 != null) {
                    bVar3.g(e10);
                }
            }
        }
    }

    public b(b0 b0Var, String str, d3.a aVar) {
        this.f13707b = b0Var;
        this.f13709d = str;
        this.f13708c = aVar;
    }

    @Override // ql.b0
    public long a() {
        return this.f13707b.a();
    }

    @Override // ql.b0
    public w b() {
        return this.f13707b.b();
    }

    @Override // ql.b0
    public void f(dm.c cVar) {
        try {
            a aVar = new a(this, cVar);
            this.f13710e = aVar;
            dm.c a10 = dm.l.a(aVar);
            this.f13707b.f(a10);
            a10.flush();
        } catch (IOException e10) {
            g(e10);
        }
    }

    public void g(Exception exc) {
        d3.a aVar = this.f13708c;
        if (aVar != null) {
            aVar.a(this.f13709d, "upload_task_error", exc.toString());
        }
    }

    public void h(long j10, long j11) {
        d3.a aVar = this.f13708c;
        if (aVar != null) {
            aVar.c(this.f13709d, j10, j11);
        }
    }
}
