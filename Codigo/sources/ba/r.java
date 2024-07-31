package ba;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Messenger f6356a;

    /* renamed from: b, reason: collision with root package name */
    private final h f6357b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f6356a = new Messenger(iBinder);
            this.f6357b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f6357b = new h(iBinder);
            this.f6356a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Message message) {
        Messenger messenger = this.f6356a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        h hVar = this.f6357b;
        if (hVar == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        hVar.b(message);
    }
}
