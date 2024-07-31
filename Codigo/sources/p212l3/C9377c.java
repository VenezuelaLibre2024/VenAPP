package p212l3;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p036c4.C1870k;

/* renamed from: l3.c */
/* loaded from: classes.dex */
final class C9377c {

    /* renamed from: a */
    private final Map<String, a> f22705a = new HashMap();

    /* renamed from: b */
    private final b f22706b = new b();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l3.c$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Lock f22707a = new ReentrantLock();

        /* renamed from: b */
        int f22708b;

        a() {
        }
    }

    /* renamed from: l3.c$b */
    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a */
        private final Queue<a> f22709a = new ArrayDeque();

        b() {
        }

        /* renamed from: a */
        a m27896a() {
            a poll;
            synchronized (this.f22709a) {
                poll = this.f22709a.poll();
            }
            return poll == null ? new a() : poll;
        }

        /* renamed from: b */
        void m27897b(a aVar) {
            synchronized (this.f22709a) {
                if (this.f22709a.size() < 10) {
                    this.f22709a.offer(aVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m27894a(String str) {
        a aVar;
        synchronized (this) {
            aVar = this.f22705a.get(str);
            if (aVar == null) {
                aVar = this.f22706b.m27896a();
                this.f22705a.put(str, aVar);
            }
            aVar.f22708b++;
        }
        aVar.f22707a.lock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m27895b(String str) {
        a aVar;
        synchronized (this) {
            aVar = (a) C1870k.m9950d(this.f22705a.get(str));
            int i10 = aVar.f22708b;
            if (i10 < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f22708b);
            }
            int i11 = i10 - 1;
            aVar.f22708b = i11;
            if (i11 == 0) {
                a remove = this.f22705a.remove(str);
                if (!remove.equals(aVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                }
                this.f22706b.m27897b(remove);
            }
        }
        aVar.f22707a.unlock();
    }
}
