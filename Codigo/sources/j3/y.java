package j3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
class y {

    /* renamed from: a, reason: collision with root package name */
    private boolean f19728a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f19729b = new Handler(Looper.getMainLooper(), new a());

    /* loaded from: classes.dex */
    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((v) message.obj).q();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(v<?> vVar, boolean z10) {
        if (!this.f19728a && !z10) {
            this.f19728a = true;
            vVar.q();
            this.f19728a = false;
        }
        this.f19729b.obtainMessage(1, vVar).sendToTarget();
    }
}
