package p363t8;

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

/* renamed from: t8.z */
/* loaded from: classes.dex */
public final class C11181z {

    /* renamed from: e */
    private static C11181z f29105e;

    /* renamed from: a */
    private final Handler f29106a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private final CopyOnWriteArrayList<WeakReference<c>> f29107b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private final Object f29108c = new Object();

    /* renamed from: d */
    private int f29109d = 0;

    /* renamed from: t8.z$b */
    /* loaded from: classes.dex */
    private static final class b {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t8.z$b$a */
        /* loaded from: classes.dex */
        public static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a */
            private final C11181z f29110a;

            public a(C11181z c11181z) {
                this.f29110a = c11181z;
            }

            @Override // android.telephony.TelephonyCallback.DisplayInfoListener
            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType;
                overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f29110a.m35039k(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        /* renamed from: a */
        public static void m35042a(Context context, C11181z c11181z) {
            Executor mainExecutor;
            try {
                TelephonyManager telephonyManager = (TelephonyManager) C11137a.m34603e((TelephonyManager) context.getSystemService(Constants.SIGN_IN_METHOD_PHONE));
                a aVar = new a(c11181z);
                mainExecutor = context.getMainExecutor();
                telephonyManager.registerTelephonyCallback(mainExecutor, aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                c11181z.m35039k(5);
            }
        }
    }

    /* renamed from: t8.z$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo33044a(int i10);
    }

    /* renamed from: t8.z$d */
    /* loaded from: classes.dex */
    private final class d extends BroadcastReceiver {
        private d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int m35036g = C11181z.m35036g(context);
            if (C11172r0.f29040a < 31 || m35036g != 5) {
                C11181z.this.m35039k(m35036g);
            } else {
                b.m35042a(context, C11181z.this);
            }
        }
    }

    private C11181z(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    /* renamed from: d */
    public static synchronized C11181z m35034d(Context context) {
        C11181z c11181z;
        synchronized (C11181z.class) {
            if (f29105e == null) {
                f29105e = new C11181z(context);
            }
            c11181z = f29105e;
        }
        return c11181z;
    }

    /* renamed from: e */
    private static int m35035e(NetworkInfo networkInfo) {
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
                return C11172r0.f29040a >= 29 ? 9 : 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static int m35036g(Context context) {
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
                return m35035e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m35037h(c cVar) {
        cVar.mo33044a(m35040f());
    }

    /* renamed from: j */
    private void m35038j() {
        Iterator<WeakReference<c>> it = this.f29107b.iterator();
        while (it.hasNext()) {
            WeakReference<c> next = it.next();
            if (next.get() == null) {
                this.f29107b.remove(next);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m35039k(int i10) {
        synchronized (this.f29108c) {
            if (this.f29109d == i10) {
                return;
            }
            this.f29109d = i10;
            Iterator<WeakReference<c>> it = this.f29107b.iterator();
            while (it.hasNext()) {
                WeakReference<c> next = it.next();
                c cVar = next.get();
                if (cVar != null) {
                    cVar.mo33044a(i10);
                } else {
                    this.f29107b.remove(next);
                }
            }
        }
    }

    /* renamed from: f */
    public int m35040f() {
        int i10;
        synchronized (this.f29108c) {
            i10 = this.f29109d;
        }
        return i10;
    }

    /* renamed from: i */
    public void m35041i(final c cVar) {
        m35038j();
        this.f29107b.add(new WeakReference<>(cVar));
        this.f29106a.post(new Runnable() { // from class: t8.y
            @Override // java.lang.Runnable
            public final void run() {
                C11181z.this.m35037h(cVar);
            }
        });
    }
}
