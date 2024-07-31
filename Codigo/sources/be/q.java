package be;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f6466a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f6467b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f6468c;

    public q(@dc.c Executor executor, @dc.a Executor executor2, @dc.b Executor executor3) {
        this.f6468c = executor;
        this.f6466a = executor2;
        this.f6467b = executor3;
    }

    @dc.a
    public Executor a() {
        return this.f6466a;
    }

    @dc.b
    public Executor b() {
        return this.f6467b;
    }

    @dc.c
    public Executor c() {
        return this.f6468c;
    }
}
