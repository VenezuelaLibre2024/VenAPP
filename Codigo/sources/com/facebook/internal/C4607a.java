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
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p152i4.C7799e0;

/* renamed from: com.facebook.internal.a */
/* loaded from: classes.dex */
public final class C4607a {

    /* renamed from: f */
    public static final a f8672f = new a(null);

    /* renamed from: g */
    private static final String f8673g = C4607a.class.getCanonicalName();

    /* renamed from: h */
    public static C4607a f8674h;

    /* renamed from: a */
    private String f8675a;

    /* renamed from: b */
    private long f8676b;

    /* renamed from: c */
    private String f8677c;

    /* renamed from: d */
    private String f8678d;

    /* renamed from: e */
    private boolean f8679e;

    /* renamed from: com.facebook.internal.a$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        private final C4607a m11108a(C4607a c4607a) {
            c4607a.f8676b = System.currentTimeMillis();
            C4607a.f8674h = c4607a;
            return c4607a;
        }

        /* renamed from: b */
        private final C4607a m11109b(Context context) {
            C4607a m11110c = m11110c(context);
            if (m11110c != null) {
                return m11110c;
            }
            C4607a m11111d = m11111d(context);
            return m11111d == null ? new C4607a() : m11111d;
        }

        /* renamed from: c */
        private final C4607a m11110c(Context context) {
            Object m11287U;
            try {
                if (!m11113g(context)) {
                    return null;
                }
                boolean z10 = false;
                Method m11280M = C4634n0.m11280M("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
                if (m11280M == null || (m11287U = C4634n0.m11287U(null, m11280M, context)) == null) {
                    return null;
                }
                Method m11279L = C4634n0.m11279L(m11287U.getClass(), "getId", new Class[0]);
                Method m11279L2 = C4634n0.m11279L(m11287U.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                if (m11279L != null && m11279L2 != null) {
                    C4607a c4607a = new C4607a();
                    c4607a.f8675a = (String) C4634n0.m11287U(m11287U, m11279L, new Object[0]);
                    Boolean bool = (Boolean) C4634n0.m11287U(m11287U, m11279L2, new Object[0]);
                    if (bool != null) {
                        z10 = bool.booleanValue();
                    }
                    c4607a.f8679e = z10;
                    return c4607a;
                }
                return null;
            } catch (Exception e10) {
                C4634n0.m11312j0("android_id", e10);
                return null;
            }
        }

        /* renamed from: d */
        private final C4607a m11111d(Context context) {
            if (!m11113g(context)) {
                return null;
            }
            c cVar = new c();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                try {
                    if (context.bindService(intent, cVar, 1)) {
                        b bVar = new b(cVar.m11118a());
                        C4607a c4607a = new C4607a();
                        c4607a.f8675a = bVar.m11116f2();
                        c4607a.f8679e = bVar.m11117g2();
                        return c4607a;
                    }
                } catch (Exception e10) {
                    C4634n0.m11312j0("android_id", e10);
                } finally {
                    context.unbindService(cVar);
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        /* renamed from: f */
        private final String m11112f(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return packageManager.getInstallerPackageName(context.getPackageName());
        }

        /* renamed from: g */
        private final boolean m11113g(Context context) {
            Method m11280M = C4634n0.m11280M("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (m11280M == null) {
                return false;
            }
            Object m11287U = C4634n0.m11287U(null, m11280M, context);
            return (m11287U instanceof Integer) && C9322n.m27777a(m11287U, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0080 A[Catch: all -> 0x00f1, Exception -> 0x00f3, TryCatch #4 {Exception -> 0x00f3, all -> 0x00f1, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:11:0x0033, B:13:0x004e, B:16:0x005f, B:17:0x007a, B:19:0x0080, B:21:0x0085, B:23:0x008a, B:57:0x0067, B:61:0x00e9, B:62:0x00f0), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0085 A[Catch: all -> 0x00f1, Exception -> 0x00f3, TryCatch #4 {Exception -> 0x00f3, all -> 0x00f1, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:11:0x0033, B:13:0x004e, B:16:0x005f, B:17:0x007a, B:19:0x0080, B:21:0x0085, B:23:0x008a, B:57:0x0067, B:61:0x00e9, B:62:0x00f0), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008a A[Catch: all -> 0x00f1, Exception -> 0x00f3, TRY_LEAVE, TryCatch #4 {Exception -> 0x00f3, all -> 0x00f1, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:11:0x0033, B:13:0x004e, B:16:0x005f, B:17:0x007a, B:19:0x0080, B:21:0x0085, B:23:0x008a, B:57:0x0067, B:61:0x00e9, B:62:0x00f0), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0110  */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.facebook.internal.C4607a m11114e(android.content.Context r13) {
            /*
                Method dump skipped, instructions count: 276
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C4607a.a.m11114e(android.content.Context):com.facebook.internal.a");
        }

        /* renamed from: h */
        public final boolean m11115h(Context context) {
            C9322n.m27781e(context, "context");
            C4607a m11114e = m11114e(context);
            return m11114e != null && m11114e.m11107k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.internal.a$b */
    /* loaded from: classes.dex */
    public static final class b implements IInterface {

        /* renamed from: b */
        public static final a f8680b = new a(null);

        /* renamed from: a */
        private final IBinder f8681a;

        /* renamed from: com.facebook.internal.a$b$a */
        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9315g c9315g) {
                this();
            }
        }

        public b(IBinder binder) {
            C9322n.m27781e(binder, "binder");
            this.f8681a = binder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f8681a;
        }

        /* renamed from: f2 */
        public final String m11116f2() {
            Parcel obtain = Parcel.obtain();
            C9322n.m27780d(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            C9322n.m27780d(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f8681a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* renamed from: g2 */
        public final boolean m11117g2() {
            Parcel obtain = Parcel.obtain();
            C9322n.m27780d(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            C9322n.m27780d(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.f8681a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.internal.a$c */
    /* loaded from: classes.dex */
    public static final class c implements ServiceConnection {

        /* renamed from: a */
        private final AtomicBoolean f8682a = new AtomicBoolean(false);

        /* renamed from: b */
        private final BlockingQueue<IBinder> f8683b = new LinkedBlockingDeque();

        /* renamed from: a */
        public final IBinder m11118a() {
            if (!(!this.f8682a.compareAndSet(true, true))) {
                throw new IllegalStateException("Binder already consumed".toString());
            }
            IBinder take = this.f8683b.take();
            C9322n.m27780d(take, "queue.take()");
            return take;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f8683b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: h */
    public final String m11104h() {
        if (C7799e0.m23833F() && C7799e0.m23859k()) {
            return this.f8675a;
        }
        return null;
    }

    /* renamed from: i */
    public final String m11105i() {
        return this.f8678d;
    }

    /* renamed from: j */
    public final String m11106j() {
        return this.f8677c;
    }

    /* renamed from: k */
    public final boolean m11107k() {
        return this.f8679e;
    }
}
