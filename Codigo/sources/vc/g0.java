package vc;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f28805a = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f28806b = new AtomicInteger();

    public int a() {
        return this.f28806b.get();
    }

    public int b() {
        return this.f28805a.get();
    }

    public void c() {
        this.f28806b.getAndIncrement();
    }

    public void d() {
        this.f28805a.getAndIncrement();
    }

    public void e() {
        this.f28806b.set(0);
    }
}
