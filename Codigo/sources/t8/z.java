package t8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import io.flutter.plugins.firebase.auth.Constants;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: e, reason: collision with root package name */
    private static z f26809e;

    /* renamed from: a, reason: collision with root package name */
    private final Handler f26810a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<WeakReference<c>> f26811b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final Object f26812c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private int f26813d = 0;

    /* loaded from: classes.dex */
    private static final class b {

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes.dex */
        public static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a, reason: collision with root package name */
            private final z f26814a;

            public a(z zVar) {
                this.f26814a = zVar;
            }

            @Override // android.telephony.TelephonyCallback.DisplayInfoListener
            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType;
                overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f26814a.k(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, z zVar) {
            Executor mainExecutor;
            try {
                TelephonyManager telephonyManager = (TelephonyManager) t8.a.e((TelephonyManager) context.getSystemService(Constants.SIGN_IN_METHOD_PHONE));
                a aVar = new a(zVar);
                mainExecutor = context.getMainExecutor();
                telephonyManager.registerTelephonyCallback(mainExecutor, aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                zVar.k(5);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(int i10);
    }

    /* loaded from: classes.dex */
    private final class d extends BroadcastReceiver {
        private d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int g10 = z.g(context);
            if (r0.f26744a < 31 || g10 != 5) {
                z.this.k(g10);
            } else {
                b.a(context, z.this);
            }
        }
    }

    private z(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    public static synchronized z d(Context context) {
        z zVar;
        synchronized (z.class) {
            if (f26809e == null) {
                f26809e = new z(context);
            }
            zVar = f26809e;
        }
        return zVar;
    }

    private static int e(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return r0.f26744a >= 29 ? 9 : 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(c cVar) {
        cVar.a(f());
    }

    private void j() {
        Iterator<WeakReference<c>> it = this.f26811b.iterator();
        while (it.hasNext()) {
            WeakReference<c> next = it.next();
            if (next.get() == null) {
                this.f26811b.remove(next);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(int i10) {
        synchronized (this.f26812c) {
            if (this.f26813d == i10) {
                return;
            }
            this.f26813d = i10;
            Iterator<WeakReference<c>> it = this.f26811b.iterator();
            while (it.hasNext()) {
                WeakReference<c> next = it.next();
                c cVar = next.get();
                if (cVar != null) {
                    cVar.a(i10);
                } else {
                    this.f26811b.remove(next);
                }
            }
        }
    }

    public int f() {
        int i10;
        synchronized (this.f26812c) {
            i10 = this.f26813d;
        }
        return i10;
    }

    public void i(final c cVar) {
        j();
        this.f26811b.add(new WeakReference<>(cVar));
        this.f26810a.post(new Runnable() { // from class: t8.y
            @Override // java.lang.Runnable
            public final void run() {
                z.this.h(cVar);
            }
        });
    }
}
