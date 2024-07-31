package p193k3;

import java.util.Queue;
import p036c4.C1871l;
import p193k3.InterfaceC9150m;

/* renamed from: k3.c */
/* loaded from: classes.dex */
abstract class AbstractC9140c<T extends InterfaceC9150m> {

    /* renamed from: a */
    private final Queue<T> f22065a = C1871l.m9957f(20);

    /* renamed from: a */
    abstract T mo26945a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public T m26946b() {
        T poll = this.f22065a.poll();
        return poll == null ? mo26945a() : poll;
    }

    /* renamed from: c */
    public void m26947c(T t10) {
        if (this.f22065a.size() < 20) {
            this.f22065a.offer(t10);
        }
    }
}
