package p277oh;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

/* renamed from: oh.b */
/* loaded from: classes3.dex */
public class ServiceC9946b extends Service {

    /* renamed from: a */
    private static final Binder f24501a = new Binder();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return f24501a;
    }
}
