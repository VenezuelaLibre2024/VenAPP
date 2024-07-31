package vc;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: vc.g0 */
/* loaded from: classes.dex */
public final class C11836g0 {

    /* renamed from: a */
    private final AtomicInteger f31239a = new AtomicInteger();

    /* renamed from: b */
    private final AtomicInteger f31240b = new AtomicInteger();

    /* renamed from: a */
    public int m37708a() {
        return this.f31240b.get();
    }

    /* renamed from: b */
    public int m37709b() {
        return this.f31239a.get();
    }

    /* renamed from: c */
    public void m37710c() {
        this.f31240b.getAndIncrement();
    }

    /* renamed from: d */
    public void m37711d() {
        this.f31239a.getAndIncrement();
    }

    /* renamed from: e */
    public void m37712e() {
        this.f31240b.set(0);
    }
}
