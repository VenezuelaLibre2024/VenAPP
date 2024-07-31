package p363t8;

import java.util.Collections;
import java.util.PriorityQueue;

/* renamed from: t8.g0 */
/* loaded from: classes.dex */
public final class C11150g0 {

    /* renamed from: a */
    private final Object f28963a = new Object();

    /* renamed from: b */
    private final PriorityQueue<Integer> f28964b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c */
    private int f28965c = Integer.MIN_VALUE;

    /* renamed from: a */
    public void m34722a(int i10) {
        synchronized (this.f28963a) {
            this.f28964b.add(Integer.valueOf(i10));
            this.f28965c = Math.max(this.f28965c, i10);
        }
    }

    /* renamed from: b */
    public void m34723b(int i10) {
        synchronized (this.f28963a) {
            this.f28964b.remove(Integer.valueOf(i10));
            this.f28965c = this.f28964b.isEmpty() ? Integer.MIN_VALUE : ((Integer) C11172r0.m34928j(this.f28964b.peek())).intValue();
            this.f28963a.notifyAll();
        }
    }
}
