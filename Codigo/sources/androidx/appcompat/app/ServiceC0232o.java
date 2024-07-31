package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* renamed from: androidx.appcompat.app.o */
/* loaded from: classes.dex */
public final class ServiceC0232o extends Service {

    /* renamed from: androidx.appcompat.app.o$a */
    /* loaded from: classes.dex */
    private static class a {
        /* renamed from: a */
        static int m1101a() {
            return RecognitionOptions.UPC_A;
        }
    }

    /* renamed from: a */
    public static ServiceInfo m1100a(Context context) {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) ServiceC0232o.class), a.m1101a() | RecognitionOptions.ITF);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException();
    }
}
