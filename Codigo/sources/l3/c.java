package l3;

import c4.k;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, a> f20883a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final b f20884b = new b();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Lock f20885a = new ReentrantLock();

        /* renamed from: b, reason: collision with root package name */
        int f20886b;

        a() {
        }
    }

    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Queue<a> f20887a = new ArrayDeque();

        b() {
        }

        a a() {
            a poll;
            synchronized (this.f20887a) {
                poll = this.f20887a.poll();
            }
            return poll == null ? new a() : poll;
        }

        void b(a aVar) {
            synchronized (this.f20887a) {
                if (this.f20887a.size() < 10) {
                    this.f20887a.offer(aVar);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        a aVar;
        synchronized (this) {
            aVar = this.f20883a.get(str);
            if (aVar == null) {
                aVar = this.f20884b.a();
                this.f20883a.put(str, aVar);
            }
            aVar.f20886b++;
        }
        aVar.f20885a.lock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        a aVar;
        synchronized (this) {
            aVar = (a) k.d(this.f20883a.get(str));
            int i10 = aVar.f20886b;
            if (i10 < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f20886b);
            }
            int i11 = i10 - 1;
            aVar.f20886b = i11;
            if (i11 == 0) {
                a remove = this.f20883a.remove(str);
                if (!remove.equals(aVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                }
                this.f20884b.b(remove);
            }
        }
        aVar.f20885a.unlock();
    }
}
