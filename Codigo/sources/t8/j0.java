package t8;

import t6.i3;

/* loaded from: classes.dex */
public final class j0 implements u {

    /* renamed from: a, reason: collision with root package name */
    private final d f26691a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f26692b;

    /* renamed from: c, reason: collision with root package name */
    private long f26693c;

    /* renamed from: d, reason: collision with root package name */
    private long f26694d;

    /* renamed from: e, reason: collision with root package name */
    private i3 f26695e = i3.f26200d;

    public j0(d dVar) {
        this.f26691a = dVar;
    }

    public void a(long j10) {
        this.f26693c = j10;
        if (this.f26692b) {
            this.f26694d = this.f26691a.b();
        }
    }

    @Override // t8.u
    public void b(i3 i3Var) {
        if (this.f26692b) {
            a(w());
        }
        this.f26695e = i3Var;
    }

    @Override // t8.u
    public i3 c() {
        return this.f26695e;
    }

    public void d() {
        if (this.f26692b) {
            return;
        }
        this.f26694d = this.f26691a.b();
        this.f26692b = true;
    }

    public void e() {
        if (this.f26692b) {
            a(w());
            this.f26692b = false;
        }
    }

    @Override // t8.u
    public long w() {
        long j10 = this.f26693c;
        if (!this.f26692b) {
            return j10;
        }
        long b10 = this.f26691a.b() - this.f26694d;
        i3 i3Var = this.f26695e;
        return j10 + (i3Var.f26204a == 1.0f ? r0.C0(b10) : i3Var.c(b10));
    }
}
