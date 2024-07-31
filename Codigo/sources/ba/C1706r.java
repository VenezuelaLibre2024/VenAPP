package ba;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: ba.r */
/* loaded from: classes.dex */
final class C1706r {

    /* renamed from: a */
    private final Messenger f7278a;

    /* renamed from: b */
    private final C1696h f7279b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1706r(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f7278a = new Messenger(iBinder);
            this.f7279b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f7279b = new C1696h(iBinder);
            this.f7278a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m9306a(Message message) {
        Messenger messenger = this.f7278a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        C1696h c1696h = this.f7279b;
        if (c1696h == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        c1696h.m9298b(message);
    }
}
