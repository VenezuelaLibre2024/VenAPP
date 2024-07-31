package t8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import t8.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l0 implements o {

    /* renamed from: b, reason: collision with root package name */
    private static final List<b> f26699b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    private final Handler f26700a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements o.a {

        /* renamed from: a, reason: collision with root package name */
        private Message f26701a;

        /* renamed from: b, reason: collision with root package name */
        private l0 f26702b;

        private b() {
        }

        private void b() {
            this.f26701a = null;
            this.f26702b = null;
            l0.o(this);
        }

        @Override // t8.o.a
        public void a() {
            ((Message) t8.a.e(this.f26701a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) t8.a.e(this.f26701a));
            b();
            return sendMessageAtFrontOfQueue;
        }

        public b d(Message message, l0 l0Var) {
            this.f26701a = message;
            this.f26702b = l0Var;
            return this;
        }
    }

    public l0(Handler handler) {
        this.f26700a = handler;
    }

    private static b n() {
        b bVar;
        List<b> list = f26699b;
        synchronized (list) {
            bVar = list.isEmpty() ? new b() : list.remove(list.size() - 1);
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(b bVar) {
        List<b> list = f26699b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(bVar);
            }
        }
    }

    @Override // t8.o
    public o.a a(int i10) {
        return n().d(this.f26700a.obtainMessage(i10), this);
    }

    @Override // t8.o
    public boolean b(int i10) {
        return this.f26700a.hasMessages(i10);
    }

    @Override // t8.o
    public o.a c(int i10, int i11, int i12, Object obj) {
        return n().d(this.f26700a.obtainMessage(i10, i11, i12, obj), this);
    }

    @Override // t8.o
    public o.a d(int i10, Object obj) {
        return n().d(this.f26700a.obtainMessage(i10, obj), this);
    }

    @Override // t8.o
    public void e(Object obj) {
        this.f26700a.removeCallbacksAndMessages(obj);
    }

    @Override // t8.o
    public Looper f() {
        return this.f26700a.getLooper();
    }

    @Override // t8.o
    public o.a g(int i10, int i11, int i12) {
        return n().d(this.f26700a.obtainMessage(i10, i11, i12), this);
    }

    @Override // t8.o
    public boolean h(Runnable runnable) {
        return this.f26700a.post(runnable);
    }

    @Override // t8.o
    public boolean i(int i10) {
        return this.f26700a.sendEmptyMessage(i10);
    }

    @Override // t8.o
    public boolean j(int i10, long j10) {
        return this.f26700a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // t8.o
    public boolean k(o.a aVar) {
        return ((b) aVar).c(this.f26700a);
    }

    @Override // t8.o
    public void l(int i10) {
        this.f26700a.removeMessages(i10);
    }
}
