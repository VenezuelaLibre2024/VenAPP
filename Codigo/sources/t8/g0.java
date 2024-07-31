package t8;

import java.util.Collections;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f26667a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final PriorityQueue<Integer> f26668b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c, reason: collision with root package name */
    private int f26669c = Integer.MIN_VALUE;

    public void a(int i10) {
        synchronized (this.f26667a) {
            this.f26668b.add(Integer.valueOf(i10));
            this.f26669c = Math.max(this.f26669c, i10);
        }
    }

    public void b(int i10) {
        synchronized (this.f26667a) {
            this.f26668b.remove(Integer.valueOf(i10));
            this.f26669c = this.f26668b.isEmpty() ? Integer.MIN_VALUE : ((Integer) r0.j(this.f26668b.peek())).intValue();
            this.f26667a.notifyAll();
        }
    }
}
