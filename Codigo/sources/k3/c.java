package k3;

import java.util.Queue;
import k3.m;

/* loaded from: classes.dex */
abstract class c<T extends m> {

    /* renamed from: a, reason: collision with root package name */
    private final Queue<T> f20283a = c4.l.f(20);

    abstract T a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public T b() {
        T poll = this.f20283a.poll();
        return poll == null ? a() : poll;
    }

    public void c(T t10) {
        if (this.f20283a.size() < 20) {
            this.f20283a.offer(t10);
        }
    }
}
