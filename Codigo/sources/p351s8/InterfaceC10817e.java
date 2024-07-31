package p351s8;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p351s8.InterfaceC10817e;
import p363t8.C11137a;

/* renamed from: s8.e */
/* loaded from: classes.dex */
public interface InterfaceC10817e {

    /* renamed from: s8.e$a */
    /* loaded from: classes.dex */
    public interface a {

        /* renamed from: s8.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C13248a {

            /* renamed from: a */
            private final CopyOnWriteArrayList<C13249a> f27333a = new CopyOnWriteArrayList<>();

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: s8.e$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C13249a {

                /* renamed from: a */
                private final Handler f27334a;

                /* renamed from: b */
                private final a f27335b;

                /* renamed from: c */
                private boolean f27336c;

                public C13249a(Handler handler, a aVar) {
                    this.f27334a = handler;
                    this.f27335b = aVar;
                }

                /* renamed from: d */
                public void m32971d() {
                    this.f27336c = true;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: d */
            public static /* synthetic */ void m32964d(C13249a c13249a, int i10, long j10, long j11) {
                c13249a.f27335b.mo32962s(i10, j10, j11);
            }

            /* renamed from: b */
            public void m32965b(Handler handler, a aVar) {
                C11137a.m34603e(handler);
                C11137a.m34603e(aVar);
                m32967e(aVar);
                this.f27333a.add(new C13249a(handler, aVar));
            }

            /* renamed from: c */
            public void m32966c(final int i10, final long j10, final long j11) {
                Iterator<C13249a> it = this.f27333a.iterator();
                while (it.hasNext()) {
                    final C13249a next = it.next();
                    if (!next.f27336c) {
                        next.f27334a.post(new Runnable() { // from class: s8.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                InterfaceC10817e.a.C13248a.m32964d(InterfaceC10817e.a.C13248a.C13249a.this, i10, j10, j11);
                            }
                        });
                    }
                }
            }

            /* renamed from: e */
            public void m32967e(a aVar) {
                Iterator<C13249a> it = this.f27333a.iterator();
                while (it.hasNext()) {
                    C13249a next = it.next();
                    if (next.f27335b == aVar) {
                        next.m32971d();
                        this.f27333a.remove(next);
                    }
                }
            }
        }

        /* renamed from: s */
        void mo32962s(int i10, long j10, long j11);
    }

    /* renamed from: b */
    default long m32957b() {
        return -9223372036854775807L;
    }

    /* renamed from: d */
    InterfaceC10834m0 mo32958d();

    /* renamed from: e */
    void mo32959e(a aVar);

    /* renamed from: g */
    long mo32960g();

    /* renamed from: h */
    void mo32961h(Handler handler, a aVar);
}
