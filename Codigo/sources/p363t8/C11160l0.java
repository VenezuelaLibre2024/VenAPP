package p363t8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import p363t8.InterfaceC11165o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: t8.l0 */
/* loaded from: classes.dex */
public final class C11160l0 implements InterfaceC11165o {

    /* renamed from: b */
    private static final List<b> f28995b = new ArrayList(50);

    /* renamed from: a */
    private final Handler f28996a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t8.l0$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC11165o.a {

        /* renamed from: a */
        private Message f28997a;

        /* renamed from: b */
        private C11160l0 f28998b;

        private b() {
        }

        /* renamed from: b */
        private void m34783b() {
            this.f28997a = null;
            this.f28998b = null;
            C11160l0.m34770o(this);
        }

        @Override // p363t8.InterfaceC11165o.a
        /* renamed from: a */
        public void mo34784a() {
            ((Message) C11137a.m34603e(this.f28997a)).sendToTarget();
            m34783b();
        }

        /* renamed from: c */
        public boolean m34785c(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) C11137a.m34603e(this.f28997a));
            m34783b();
            return sendMessageAtFrontOfQueue;
        }

        /* renamed from: d */
        public b m34786d(Message message, C11160l0 c11160l0) {
            this.f28997a = message;
            this.f28998b = c11160l0;
            return this;
        }
    }

    public C11160l0(Handler handler) {
        this.f28996a = handler;
    }

    /* renamed from: n */
    private static b m34769n() {
        b bVar;
        List<b> list = f28995b;
        synchronized (list) {
            bVar = list.isEmpty() ? new b() : list.remove(list.size() - 1);
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static void m34770o(b bVar) {
        List<b> list = f28995b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(bVar);
            }
        }
    }

    @Override // p363t8.InterfaceC11165o
    /* renamed from: a */
    public InterfaceC11165o.a mo34771a(int i10) {
        return m34769n().m34786d(this.f28996a.obtainMessage(i10), this);
    }

    @Override // p363t8.InterfaceC11165o
    /* renamed from: b */
    public boolean mo34772b(int i10) {
        return this.f28996a.hasMessages(i10);
    }

    @Override // p363t8.InterfaceC11165o
    /* renamed from: c */
    public InterfaceC11165o.a mo34773c(int i10, int i11, int i12, Object obj) {
        return m34769n().m34786d(this.f28996a.obtainMessage(i10, i11, i12, obj), this);
    }

    @Override // p363t8.InterfaceC11165o
    /* renamed from: d */
    public InterfaceC11165o.a mo34774d(int i10, Object obj) {
        return m34769n().m34786d(this.f28996a.obtainMessage(i10, obj), this);
    }

    @Override // p363t8.InterfaceC11165o
    /* renamed from: e */
    public void mo34775e(Object obj) {
        this.f28996a.removeCallbacksAndMessages(obj);
    }

    @Override // p363t8.InterfaceC11165o
    /* renamed from: f */
    public Looper mo34776f() {
        return this.f28996a.getLooper();
    }

    @Override // p363t8.InterfaceC11165o
    /* renamed from: g */
    public InterfaceC11165o.a mo34777g(int i10, int i11, int i12) {
        return m34769n().m34786d(this.f28996a.obtainMessage(i10, i11, i12), this);
    }

    @Override // p363t8.InterfaceC11165o
    /* renamed from: h */
    public boolean mo34778h(Runnable runnable) {
        return this.f28996a.post(runnable);
    }

    @Override // p363t8.InterfaceC11165o
    /* renamed from: i */
    public boolean mo34779i(int i10) {
        return this.f28996a.sendEmptyMessage(i10);
    }

    @Override // p363t8.InterfaceC11165o
    /* renamed from: j */
    public boolean mo34780j(int i10, long j10) {
        return this.f28996a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // p363t8.InterfaceC11165o
    /* renamed from: k */
    public boolean mo34781k(InterfaceC11165o.a aVar) {
        return ((b) aVar).m34785c(this.f28996a);
    }

    @Override // p363t8.InterfaceC11165o
    /* renamed from: l */
    public void mo34782l(int i10) {
        this.f28996a.removeMessages(i10);
    }
}
