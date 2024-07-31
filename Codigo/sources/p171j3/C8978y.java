package p171j3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: j3.y */
/* loaded from: classes.dex */
class C8978y {

    /* renamed from: a */
    private boolean f21507a;

    /* renamed from: b */
    private final Handler f21508b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: j3.y$a */
    /* loaded from: classes.dex */
    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((InterfaceC8975v) message.obj).mo26310q();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m26337a(InterfaceC8975v<?> interfaceC8975v, boolean z10) {
        if (!this.f21507a && !z10) {
            this.f21507a = true;
            interfaceC8975v.mo26310q();
            this.f21507a = false;
        }
        this.f21508b.obtainMessage(1, interfaceC8975v).sendToTarget();
    }
}
