package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0135a f7697f = new C0135a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final String f7698g = a.class.getCanonicalName();

    /* renamed from: h, reason: collision with root package name */
    public static a f7699h;

    /* renamed from: a, reason: collision with root package name */
    private String f7700a;

    /* renamed from: b, reason: collision with root package name */
    private long f7701b;

    /* renamed from: c, reason: collision with root package name */
    private String f7702c;

    /* renamed from: d, reason: collision with root package name */
    private String f7703d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7704e;

    /* renamed from: com.facebook.internal.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0135a {
        private C0135a() {
        }

        public /* synthetic */ C0135a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private final a a(a aVar) {
            aVar.f7701b = System.currentTimeMillis();
            a.f7699h = aVar;
            return aVar;
        }

        private final a b(Context context) {
            a c10 = c(context);
            if (c10 != null) {
                return c10;
            }
            a d10 = d(context);
            return d10 == null ? new a() : d10;
        }

        private final a c(Context context) {
            Object U;
            try {
                if (!g(context)) {
                    return null;
                }
                boolean z10 = false;
                Method M = n0.M("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
                if (M == null || (U = n0.U(null, M, context)) == null) {
                    return null;
                }
                Method L = n0.L(U.getClass(), "getId", new Class[0]);
                Method L2 = n0.L(U.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                if (L != null && L2 != null) {
                    a aVar = new a();
                    aVar.f7700a = (String) n0.U(U, L, new Object[0]);
                    Boolean bool = (Boolean) n0.U(U, L2, new Object[0]);
                    if (bool != null) {
                        z10 = bool.booleanValue();
                    }
                    aVar.f7704e = z10;
                    return aVar;
                }
                return null;
            } catch (Exception e10) {
                n0.j0("android_id", e10);
                return null;
            }
        }

        private final a d(Context context) {
            if (!g(context)) {
                return null;
            }
            c cVar = new c();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                try {
                    if (context.bindService(intent, cVar, 1)) {
                        b bVar = new b(cVar.a());
                        a aVar = new a();
                        aVar.f7700a = bVar.f2();
                        aVar.f7704e = bVar.g2();
                        return aVar;
                    }
                } catch (Exception e10) {
                    n0.j0("android_id", e10);
                } finally {
                    context.unbindService(cVar);
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        private final String f(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return packageManager.getInstallerPackageName(context.getPackageName());
        }

        private final boolean g(Context context) {
            Method M = n0.M("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (M == null) {
                return false;
            }
            Object U = n0.U(null, M, context);
            return (U instanceof Integer) && kotlin.jvm.internal.n.a(U, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0080 A[Catch: all -> 0x00f1, Exception -> 0x00f3, TryCatch #4 {Exception -> 0x00f3, all -> 0x00f1, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:11:0x0033, B:13:0x004e, B:16:0x005f, B:17:0x007a, B:19:0x0080, B:21:0x0085, B:23:0x008a, B:57:0x0067, B:61:0x00e9, B:62:0x00f0), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0085 A[Catch: all -> 0x00f1, Exception -> 0x00f3, TryCatch #4 {Exception -> 0x00f3, all -> 0x00f1, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:11:0x0033, B:13:0x004e, B:16:0x005f, B:17:0x007a, B:19:0x0080, B:21:0x0085, B:23:0x008a, B:57:0x0067, B:61:0x00e9, B:62:0x00f0), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008a A[Catch: all -> 0x00f1, Exception -> 0x00f3, TRY_LEAVE, TryCatch #4 {Exception -> 0x00f3, all -> 0x00f1, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:11:0x0033, B:13:0x004e, B:16:0x005f, B:17:0x007a, B:19:0x0080, B:21:0x0085, B:23:0x008a, B:57:0x0067, B:61:0x00e9, B:62:0x00f0), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0110  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.facebook.internal.a e(android.content.Context r13) {
            /*
                Method dump skipped, instructions count: 276
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.a.C0135a.e(android.content.Context):com.facebook.internal.a");
        }

        public final boolean h(Context context) {
            kotlin.jvm.internal.n.e(context, "context");
            a e10 = e(context);
            return e10 != null && e10.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements IInterface {

        /* renamed from: b, reason: collision with root package name */
        public static final C0136a f7705b = new C0136a(null);

        /* renamed from: a, reason: collision with root package name */
        private final IBinder f7706a;

        /* renamed from: com.facebook.internal.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0136a {
            private C0136a() {
            }

            public /* synthetic */ C0136a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public b(IBinder binder) {
            kotlin.jvm.internal.n.e(binder, "binder");
            this.f7706a = binder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f7706a;
        }

        public final String f2() {
            Parcel obtain = Parcel.obtain();
            kotlin.jvm.internal.n.d(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            kotlin.jvm.internal.n.d(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f7706a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final boolean g2() {
            Parcel obtain = Parcel.obtain();
            kotlin.jvm.internal.n.d(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            kotlin.jvm.internal.n.d(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.f7706a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f7707a = new AtomicBoolean(false);

        /* renamed from: b, reason: collision with root package name */
        private final BlockingQueue<IBinder> f7708b = new LinkedBlockingDeque();

        public final IBinder a() {
            if (!(!this.f7707a.compareAndSet(true, true))) {
                throw new IllegalStateException("Binder already consumed".toString());
            }
            IBinder take = this.f7708b.take();
            kotlin.jvm.internal.n.d(take, "queue.take()");
            return take;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f7708b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public final String h() {
        if (i4.e0.F() && i4.e0.k()) {
            return this.f7700a;
        }
        return null;
    }

    public final String i() {
        return this.f7703d;
    }

    public final String j() {
        return this.f7702c;
    }

    public final boolean k() {
        return this.f7704e;
    }
}
