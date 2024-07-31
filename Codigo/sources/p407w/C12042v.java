package p407w;

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
import androidx.camera.core.impl.AbstractC0630i0;
import androidx.camera.core.impl.C0614e0;
import androidx.camera.core.impl.C0634j0;
import androidx.camera.core.impl.InterfaceC0598a0;
import androidx.camera.core.impl.InterfaceC0644l2;
import androidx.camera.core.impl.InterfaceC0702z;
import androidx.camera.core.impl.MetadataHolderService;
import androidx.camera.core.impl.utils.C0678g;
import androidx.concurrent.futures.C0742c;
import androidx.core.os.C0948g;
import androidx.core.util.C0984h;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import p002a0.C0009f;
import p407w.C12044w;

/* renamed from: w.v */
/* loaded from: classes.dex */
public final class C12042v {

    /* renamed from: o */
    private static final Object f32010o = new Object();

    /* renamed from: p */
    private static final SparseArray<Integer> f32011p = new SparseArray<>();

    /* renamed from: c */
    private final C12044w f32014c;

    /* renamed from: d */
    private final Executor f32015d;

    /* renamed from: e */
    private final Handler f32016e;

    /* renamed from: f */
    private final HandlerThread f32017f;

    /* renamed from: g */
    private InterfaceC0598a0 f32018g;

    /* renamed from: h */
    private InterfaceC0702z f32019h;

    /* renamed from: i */
    private InterfaceC0644l2 f32020i;

    /* renamed from: j */
    private Context f32021j;

    /* renamed from: k */
    private final InterfaceFutureC5920f<Void> f32022k;

    /* renamed from: n */
    private final Integer f32025n;

    /* renamed from: a */
    final C0614e0 f32012a = new C0614e0();

    /* renamed from: b */
    private final Object f32013b = new Object();

    /* renamed from: l */
    private a f32023l = a.UNINITIALIZED;

    /* renamed from: m */
    private InterfaceFutureC5920f<Void> f32024m = C0009f.m22h(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w.v$a */
    /* loaded from: classes.dex */
    public enum a {
        UNINITIALIZED,
        INITIALIZING,
        INITIALIZING_ERROR,
        INITIALIZED,
        SHUTDOWN
    }

    public C12042v(Context context, C12044w.b bVar) {
        if (bVar == null && (bVar = m38668g(context)) == null) {
            throw new IllegalStateException("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
        }
        this.f32014c = bVar.getCameraXConfig();
        Executor m38684X = this.f32014c.m38684X(null);
        Handler m38687a0 = this.f32014c.m38687a0(null);
        this.f32015d = m38684X == null ? new ExecutorC12024m() : m38684X;
        if (m38687a0 == null) {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f32017f = handlerThread;
            handlerThread.start();
            this.f32016e = C0948g.m4712a(handlerThread.getLooper());
        } else {
            this.f32017f = null;
            this.f32016e = m38687a0;
        }
        Integer num = (Integer) this.f32014c.mo3197g(C12044w.f32032M, null);
        this.f32025n = num;
        m38669j(num);
        this.f32022k = m38671l(context);
    }

    /* renamed from: g */
    private static C12044w.b m38668g(Context context) {
        ComponentCallbacks2 m3264b = C0678g.m3264b(context);
        if (m3264b instanceof C12044w.b) {
            return (C12044w.b) m3264b;
        }
        try {
            Context m3263a = C0678g.m3263a(context);
            Bundle bundle = m3263a.getPackageManager().getServiceInfo(new ComponentName(m3263a, (Class<?>) MetadataHolderService.class), 640).metaData;
            String string = bundle != null ? bundle.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
            if (string != null) {
                return (C12044w.b) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            C12029o0.m38640c("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
            return null;
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e10) {
            C12029o0.m38641d("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e10);
            return null;
        }
    }

    /* renamed from: j */
    private static void m38669j(Integer num) {
        synchronized (f32010o) {
            if (num == null) {
                return;
            }
            C0984h.m4828f(num.intValue(), 3, 6, "minLogLevel");
            SparseArray<Integer> sparseArray = f32011p;
            sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? 1 + sparseArray.get(num.intValue()).intValue() : 1));
            m38676q();
        }
    }

    /* renamed from: k */
    private void m38670k(final Executor executor, final long j10, final Context context, final C0742c.a<Void> aVar) {
        executor.execute(new Runnable() { // from class: w.t
            @Override // java.lang.Runnable
            public final void run() {
                C12042v.this.m38673n(context, executor, aVar, j10);
            }
        });
    }

    /* renamed from: l */
    private InterfaceFutureC5920f<Void> m38671l(final Context context) {
        InterfaceFutureC5920f<Void> m3752a;
        synchronized (this.f32013b) {
            C0984h.m4836n(this.f32023l == a.UNINITIALIZED, "CameraX.initInternal() should only be called once per instance");
            this.f32023l = a.INITIALIZING;
            m3752a = C0742c.m3752a(new C0742c.c() { // from class: w.s
                @Override // androidx.concurrent.futures.C0742c.c
                /* renamed from: a */
                public final Object mo14a(C0742c.a aVar) {
                    Object m38674o;
                    m38674o = C12042v.this.m38674o(context, aVar);
                    return m38674o;
                }
            });
        }
        return m3752a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m38672m(Executor executor, long j10, C0742c.a aVar) {
        m38670k(executor, j10, this.f32021j, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m38673n(Context context, final Executor executor, final C0742c.a aVar, final long j10) {
        try {
            Application m3264b = C0678g.m3264b(context);
            this.f32021j = m3264b;
            if (m3264b == null) {
                this.f32021j = C0678g.m3263a(context);
            }
            InterfaceC0598a0.a m38685Y = this.f32014c.m38685Y(null);
            if (m38685Y == null) {
                throw new C12027n0(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
            }
            AbstractC0630i0 m3100a = AbstractC0630i0.m3100a(this.f32015d, this.f32016e);
            C12030p m38683W = this.f32014c.m38683W(null);
            this.f32018g = m38685Y.mo2980a(this.f32021j, m3100a, m38683W);
            InterfaceC0702z.a m38686Z = this.f32014c.m38686Z(null);
            if (m38686Z == null) {
                throw new C12027n0(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
            }
            this.f32019h = m38686Z.mo3420a(this.f32021j, this.f32018g.mo2801c(), this.f32018g.mo2800b());
            InterfaceC0644l2.c m38688b0 = this.f32014c.m38688b0(null);
            if (m38688b0 == null) {
                throw new C12027n0(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
            }
            this.f32020i = m38688b0.mo3180a(this.f32021j);
            if (executor instanceof ExecutorC12024m) {
                ((ExecutorC12024m) executor).m38635c(this.f32018g);
            }
            this.f32012a.m3038b(this.f32018g);
            C0634j0.m3103a(this.f32021j, this.f32012a, m38683W);
            m38675p();
            aVar.m3756c(null);
        } catch (C0634j0.a | RuntimeException | C12027n0 e10) {
            if (SystemClock.elapsedRealtime() - j10 < 2500) {
                C12029o0.m38649l("CameraX", "Retry init. Start time " + j10 + " current time " + SystemClock.elapsedRealtime(), e10);
                C0948g.m4713b(this.f32016e, new Runnable() { // from class: w.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        C12042v.this.m38672m(executor, j10, aVar);
                    }
                }, "retry_token", 500L);
                return;
            }
            synchronized (this.f32013b) {
                this.f32023l = a.INITIALIZING_ERROR;
            }
            if (e10 instanceof C0634j0.a) {
                C12029o0.m38640c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                aVar.m3756c(null);
            } else if (e10 instanceof C12027n0) {
                aVar.m3758f(e10);
            } else {
                aVar.m3758f(new C12027n0(e10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m38674o(Context context, C0742c.a aVar) {
        m38670k(this.f32015d, SystemClock.elapsedRealtime(), context, aVar);
        return "CameraX initInternal";
    }

    /* renamed from: p */
    private void m38675p() {
        synchronized (this.f32013b) {
            this.f32023l = a.INITIALIZED;
        }
    }

    /* renamed from: q */
    private static void m38676q() {
        SparseArray<Integer> sparseArray = f32011p;
        if (sparseArray.size() == 0) {
            C12029o0.m38645h();
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
        C12029o0.m38646i(i10);
    }

    /* renamed from: d */
    public InterfaceC0702z m38677d() {
        InterfaceC0702z interfaceC0702z = this.f32019h;
        if (interfaceC0702z != null) {
            return interfaceC0702z;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    /* renamed from: e */
    public InterfaceC0598a0 m38678e() {
        InterfaceC0598a0 interfaceC0598a0 = this.f32018g;
        if (interfaceC0598a0 != null) {
            return interfaceC0598a0;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    /* renamed from: f */
    public C0614e0 m38679f() {
        return this.f32012a;
    }

    /* renamed from: h */
    public InterfaceC0644l2 m38680h() {
        InterfaceC0644l2 interfaceC0644l2 = this.f32020i;
        if (interfaceC0644l2 != null) {
            return interfaceC0644l2;
        }
        throw new IllegalStateException("CameraX not initialized yet.");
    }

    /* renamed from: i */
    public InterfaceFutureC5920f<Void> m38681i() {
        return this.f32022k;
    }
}
