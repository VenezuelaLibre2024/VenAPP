package s8;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import s8.e;

/* loaded from: classes.dex */
public interface e {

    /* loaded from: classes.dex */
    public interface a {

        /* renamed from: s8.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0420a {

            /* renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList<C0421a> f25214a = new CopyOnWriteArrayList<>();

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: s8.e$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0421a {

                /* renamed from: a, reason: collision with root package name */
                private final Handler f25215a;

                /* renamed from: b, reason: collision with root package name */
                private final a f25216b;

                /* renamed from: c, reason: collision with root package name */
                private boolean f25217c;

                public C0421a(Handler handler, a aVar) {
                    this.f25215a = handler;
                    this.f25216b = aVar;
                }

                public void d() {
                    this.f25217c = true;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void d(C0421a c0421a, int i10, long j10, long j11) {
                c0421a.f25216b.s(i10, j10, j11);
            }

            public void b(Handler handler, a aVar) {
                t8.a.e(handler);
                t8.a.e(aVar);
                e(aVar);
                this.f25214a.add(new C0421a(handler, aVar));
            }

            public void c(final int i10, final long j10, final long j11) {
                Iterator<C0421a> it = this.f25214a.iterator();
                while (it.hasNext()) {
                    final C0421a next = it.next();
                    if (!next.f25217c) {
                        next.f25215a.post(new Runnable() { // from class: s8.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                e.a.C0420a.d(e.a.C0420a.C0421a.this, i10, j10, j11);
                            }
                        });
                    }
                }
            }

            public void e(a aVar) {
                Iterator<C0421a> it = this.f25214a.iterator();
                while (it.hasNext()) {
                    C0421a next = it.next();
                    if (next.f25216b == aVar) {
                        next.d();
                        this.f25214a.remove(next);
                    }
                }
            }
        }

        void s(int i10, long j10, long j11);
    }

    default long b() {
        return -9223372036854775807L;
    }

    m0 d();

    void e(a aVar);

    long g();

    void h(Handler handler, a aVar);
}
