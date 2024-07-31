package oh;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

/* loaded from: classes3.dex */
public class b extends Service {

    /* renamed from: a, reason: collision with root package name */
    private static final Binder f22568a = new Binder();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return f22568a;
    }
}
