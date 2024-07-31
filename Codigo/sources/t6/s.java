package t6;

/* loaded from: classes.dex */
final class s implements t8.u {

    /* renamed from: a, reason: collision with root package name */
    private final t8.j0 f26451a;

    /* renamed from: b, reason: collision with root package name */
    private final a f26452b;

    /* renamed from: c, reason: collision with root package name */
    private q3 f26453c;

    /* renamed from: d, reason: collision with root package name */
    private t8.u f26454d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f26455e = true;

    /* renamed from: f, reason: collision with root package name */
    private boolean f26456f;

    /* loaded from: classes.dex */
    public interface a {
        void onPlaybackParametersChanged(i3 i3Var);
    }

    public s(a aVar, t8.d dVar) {
        this.f26452b = aVar;
        this.f26451a = new t8.j0(dVar);
    }

    private boolean f(boolean z10) {
        q3 q3Var = this.f26453c;
        return q3Var == null || q3Var.e() || (!this.f26453c.d() && (z10 || this.f26453c.i()));
    }

    private void j(boolean z10) {
        if (f(z10)) {
            this.f26455e = true;
            if (this.f26456f) {
                this.f26451a.d();
                return;
            }
            return;
        }
        t8.u uVar = (t8.u) t8.a.e(this.f26454d);
        long w10 = uVar.w();
        if (this.f26455e) {
            if (w10 < this.f26451a.w()) {
                this.f26451a.e();
                return;
            } else {
                this.f26455e = false;
                if (this.f26456f) {
                    this.f26451a.d();
                }
            }
        }
        this.f26451a.a(w10);
        i3 c10 = uVar.c();
        if (c10.equals(this.f26451a.c())) {
            return;
        }
        this.f26451a.b(c10);
        this.f26452b.onPlaybackParametersChanged(c10);
    }

    public void a(q3 q3Var) {
        if (q3Var == this.f26453c) {
            this.f26454d = null;
            this.f26453c = null;
            this.f26455e = true;
        }
    }

    @Override // t8.u
    public void b(i3 i3Var) {
        t8.u uVar = this.f26454d;
        if (uVar != null) {
            uVar.b(i3Var);
            i3Var = this.f26454d.c();
        }
        this.f26451a.b(i3Var);
    }

    @Override // t8.u
    public i3 c() {
        t8.u uVar = this.f26454d;
        return uVar != null ? uVar.c() : this.f26451a.c();
    }

    public void d(q3 q3Var) {
        t8.u uVar;
        t8.u E = q3Var.E();
        if (E == null || E == (uVar = this.f26454d)) {
            return;
        }
        if (uVar != null) {
            throw x.i(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f26454d = E;
        this.f26453c = q3Var;
        E.b(this.f26451a.c());
    }

    public void e(long j10) {
        this.f26451a.a(j10);
    }

    public void g() {
        this.f26456f = true;
        this.f26451a.d();
    }

    public void h() {
        this.f26456f = false;
        this.f26451a.e();
    }

    public long i(boolean z10) {
        j(z10);
        return w();
    }

    @Override // t8.u
    public long w() {
        return this.f26455e ? this.f26451a.w() : ((t8.u) t8.a.e(this.f26454d)).w();
    }
}
