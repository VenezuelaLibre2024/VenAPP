package w;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.a0;
import androidx.camera.core.impl.j0;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.z;
import androidx.concurrent.futures.c;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import w.w;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: o */
    private static final Object f29555o = new Object();

    /* renamed from: p */
    private static final SparseArray<Integer> f29556p = new SparseArray<>();

    /* renamed from: c */
    private final w f29559c;

    /* renamed from: d */
    private final Executor f29560d;

    /* renamed from: e */
    private final Handler f29561e;

    /* renamed from: f */
    private final HandlerThread f29562f;

    /* renamed from: g */
    private androidx.camera.core.impl.a0 f29563g;

    /* renamed from: h */
    private androidx.camera.core.impl.z f29564h;

    /* renamed from: i */
    private l2 f29565i;

    /* renamed from: j */
    private Context f29566j;

    /* renamed from: k */
    private final com.google.common.util.concurrent.f<Void> f29567k;

    /* renamed from: n */
    private final Integer f29570n;

    /* renamed from: a */
    final androidx.camera.core.impl.e0 f29557a = new androidx.camera.core.impl.e0();

    /* renamed from: b */
    private final Object f29558b = new Object();

    /* renamed from: l */
    private a f29568l = a.UNINITIALIZED;

    /* renamed from: m */
    private com.google.common.util.concurrent.f<Void> f29569m = a0.f.h(null);

    /* loaded from: classes.dex */
    public enum a {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public v(Context context, w.b bVar) {
        if (bVar == null && (bVar = g(context)) == null) {
            throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
        }
        this.f29559c = bVar.getCameraXConfig();
        Executor X = this.f29559c.X(null);
        Handler a02 = this.f29559c.a0(null);
        this.f29560d = X == null ? new m() : X;
        if (a02 == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f29562f = handlerThread;
            handlerThread.start();
            this.f29561e = androidx.core.os.g.a(handlerThread.getLooper());
        } else {
            this.f29562f = null;
            this.f29561e = a02;
        }
        Integer num = (Integer) this.f29559c.g(w.M, null);
        this.f29570n = num;
        j(num);
        this.f29567k = l(context);
    }

    private static w.b g(Context context) {
        ComponentCallbacks2 b10 = androidx.camera.core.impl.utils.g.b(context);
        if (b10 instanceof w.b) {
            return (w.b) b10;
        }
        try {
            Context a10 = androidx.camera.core.impl.utils.g.a(context);
            Bundle bundle = a10.getPackageManager().getServiceInfo(new ComponentName(a10, (Class<?>) MetadataHolderService.class), 640).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (w.b) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            o0.c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e10) {
            o0.d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e10);
            return null;
        }
    }

    private static void j(Integer num) {
        synchronized (f29555o) {
            if (num == null) {
                return;
            }
            androidx.core.util.h.f(num.intValue(), 3, 6, "minLogLevel");
            SparseArray<Integer> sparseArray = f29556p;
            sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + sparseArray.get(num.intValue()).intValue() : 1));
            q();
        }
    }

    private void k(Executor executor, long j10, Context context, c.a<Void> aVar) {
        executor.execute(new Runnable() { // from class: w.t

            /* renamed from: b */
            public final /* synthetic */ Context f29542b;

            /* renamed from: c */
            public final /* synthetic */ Executor f29543c;

            /* renamed from: d */
            public final /* synthetic */ c.a f29544d;

            /* renamed from: e */
            public final /* synthetic */ long f29545e;

            public /* synthetic */ t(Context context2, Executor executor2, c.a aVar2, long j102) {
                r2 = context2;
                r3 = executor2;
                r4 = aVar2;
                r5 = j102;
            }

            @Override // java.lang.Runnable
            public final void run() {
                v.this.n(r2, r3, r4, r5);
            }
        });
    }

    private com.google.common.util.concurrent.f<Void> l(Context context) {
        com.google.common.util.concurrent.f<Void> a10;
        synchronized (this.f29558b) {
            androidx.core.util.h.n(this.f29568l == a.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.f29568l = a.INITIALIZING;
            a10 = androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: w.s

                /* renamed from: b */
                public final /* synthetic */ Context f29538b;

                public /* synthetic */ s(Context context2) {
                    r2 = context2;
                }

                @Override // androidx.concurrent.futures.c.InterfaceC0032c
                public final Object a(c.a aVar) {
                    Object o10;
                    o10 = v.this.o(r2, aVar);
                    return o10;
                }
            });
        }
        return a10;
    }

    public /* synthetic */ void m(Executor executor, long j10, c.a aVar) {
        k(executor, j10, this.f29566j, aVar);
    }

    public /* synthetic */ void n(Context context, Executor executor, c.a aVar, long j10) {
        try {
            Application b10 = androidx.camera.core.impl.utils.g.b(context);
            this.f29566j = b10;
            if (b10 == null) {
                this.f29566j = androidx.camera.core.impl.utils.g.a(context);
            }
            a0.a Y = this.f29559c.Y(null);
            if (Y == null) {
                throw new n0(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
            }
            androidx.camera.core.impl.i0 a10 = androidx.camera.core.impl.i0.a(this.f29560d, this.f29561e);
            p W = this.f29559c.W(null);
            this.f29563g = Y.a(this.f29566j, a10, W);
            z.a Z = this.f29559c.Z(null);
            if (Z == null) {
                throw new n0(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
            }
            this.f29564h = Z.a(this.f29566j, this.f29563g.c(), this.f29563g.b());
            l2.c b02 = this.f29559c.b0(null);
            if (b02 == null) {
                throw new n0(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
            }
            this.f29565i = b02.a(this.f29566j);
            if (executor instanceof m) {
                ((m) executor).c(this.f29563g);
            }
            this.f29557a.b(this.f29563g);
            androidx.camera.core.impl.j0.a(this.f29566j, this.f29557a, W);
            p();
            aVar.c(null);
        } catch (j0.a | RuntimeException | n0 e10) {
            if (SystemClock.elapsedRealtime() - j10 < 2500) {
                o0.l("CameraX", "Retry init. Start time " + j10 + " current time " + SystemClock.elapsedRealtime(), e10);
                androidx.core.os.g.b(this.f29561e, new Runnable() { // from class: w.u

                    /* renamed from: b */
                    public final /* synthetic */ Executor f29551b;

                    /* renamed from: c */
                    public final /* synthetic */ long f29552c;

                    /* renamed from: d */
                    public final /* synthetic */ c.a f29553d;

                    public /* synthetic */ u(Executor executor2, long j102, c.a aVar2) {
                        r2 = executor2;
                        r3 = j102;
                        r5 = aVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        v.this.m(r2, r3, r5);
                    }
                }, "retry_token", 500L);
                return;
            }
            synchronized (this.f29558b) {
                this.f29568l = a.INITIALIZING_ERROR;
            }
            if (e10 instanceof j0.a) {
                o0.c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                aVar2.c(null);
            } else if (e10 instanceof n0) {
                aVar2.f(e10);
            } else {
                aVar2.f(new n0(e10));
            }
        }
    }

    public /* synthetic */ Object o(Context context, c.a aVar) {
        k(this.f29560d, SystemClock.elapsedRealtime(), context, aVar);
        return "CameraX initInternal";
    }

    private void p() {
        synchronized (this.f29558b) {
            this.f29568l = a.INITIALIZED;
        }
    }

    private static void q() {
        SparseArray<Integer> sparseArray = f29556p;
        if (sparseArray.size() == 0) {
            o0.h();
            return;
        }
        int i10 = 3;
        if (sparseArray.get(3) == null) {
            i10 = 4;
            if (sparseArray.get(4) == null) {
                i10 = 5;
                if (sparseArray.get(5) == null) {
                    i10 = 6;
                    if (sparseArray.get(6) == null) {
                        return;
                    }
                }
            }
        }
        o0.i(i10);
    }

    public androidx.camera.core.impl.z d() {
        androidx.camera.core.impl.z zVar = this.f29564h;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public androidx.camera.core.impl.a0 e() {
        androidx.camera.core.impl.a0 a0Var = this.f29563g;
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public androidx.camera.core.impl.e0 f() {
        return this.f29557a;
    }

    public l2 h() {
        l2 l2Var = this.f29565i;
        if (l2Var != null) {
            return l2Var;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    public com.google.common.util.concurrent.f<Void> i() {
        return this.f29567k;
    }
}
