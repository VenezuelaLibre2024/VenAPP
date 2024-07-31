package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import ca.C1894b;
import ca.C1898d;
import ca.C1904g;
import com.google.android.gms.common.api.C5104d;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.c */
/* loaded from: classes.dex */
public abstract class AbstractC5228c<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private C1894b zzB;
    private boolean zzC;
    private volatile C5260m1 zzD;
    C5293x1 zza;
    final Handler zzb;
    protected c zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final AbstractC5246i zzn;
    private final C1904g zzo;
    private final Object zzp;
    private final Object zzq;
    private InterfaceC5261n zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private ServiceConnectionC5251j1 zzu;
    private int zzv;
    private final a zzw;
    private final b zzx;
    private final int zzy;
    private final String zzz;
    private static final C1898d[] zze = new C1898d[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* renamed from: com.google.android.gms.common.internal.c$a */
    /* loaded from: classes.dex */
    public interface a {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i10);
    }

    /* renamed from: com.google.android.gms.common.internal.c$b */
    /* loaded from: classes.dex */
    public interface b {
        void onConnectionFailed(C1894b c1894b);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: c */
        void mo13155c(C1894b c1894b);
    }

    /* renamed from: com.google.android.gms.common.internal.c$d */
    /* loaded from: classes.dex */
    protected class d implements c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.AbstractC5228c.c
        /* renamed from: c */
        public final void mo13155c(C1894b c1894b) {
            if (c1894b.m10054y1()) {
                AbstractC5228c abstractC5228c = AbstractC5228c.this;
                abstractC5228c.getRemoteService(null, abstractC5228c.getScopes());
            } else if (AbstractC5228c.this.zzx != null) {
                AbstractC5228c.this.zzx.onConnectionFailed(c1894b);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.c$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: a */
        void mo13086a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5228c(Context context, Handler handler, AbstractC5246i abstractC5246i, C1904g c1904g, int i10, a aVar, b bVar) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        C5276s.m13325k(context, "Context must not be null");
        this.zzl = context;
        C5276s.m13325k(handler, "Handler must not be null");
        this.zzb = handler;
        this.zzm = handler.getLooper();
        C5276s.m13325k(abstractC5246i, "Supervisor must not be null");
        this.zzn = abstractC5246i;
        C5276s.m13325k(c1904g, "API availability must not be null");
        this.zzo = c1904g;
        this.zzy = i10;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC5228c(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.AbstractC5228c.a r13, com.google.android.gms.common.internal.AbstractC5228c.b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.i r3 = com.google.android.gms.common.internal.AbstractC5246i.m13271c(r10)
            ca.g r4 = ca.C1904g.m10086f()
            com.google.android.gms.common.internal.C5276s.m13324j(r13)
            com.google.android.gms.common.internal.C5276s.m13324j(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.AbstractC5228c.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.c$a, com.google.android.gms.common.internal.c$b, java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5228c(Context context, Looper looper, AbstractC5246i abstractC5246i, C1904g c1904g, int i10, a aVar, b bVar, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        C5276s.m13325k(context, "Context must not be null");
        this.zzl = context;
        C5276s.m13325k(looper, "Looper must not be null");
        this.zzm = looper;
        C5276s.m13325k(abstractC5246i, "Supervisor must not be null");
        this.zzn = abstractC5246i;
        C5276s.m13325k(c1904g, "API availability must not be null");
        this.zzo = c1904g;
        this.zzb = new HandlerC5242g1(this, looper);
        this.zzy = i10;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzj(AbstractC5228c abstractC5228c, C5260m1 c5260m1) {
        abstractC5228c.zzD = c5260m1;
        if (abstractC5228c.usesClientTelemetry()) {
            C5237f c5237f = c5260m1.f10720d;
            C5279t.m13341b().m13343c(c5237f == null ? null : c5237f.m13252z1());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void zzk(AbstractC5228c abstractC5228c, int i10) {
        int i11;
        int i12;
        synchronized (abstractC5228c.zzp) {
            i11 = abstractC5228c.zzv;
        }
        if (i11 == 3) {
            abstractC5228c.zzC = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = abstractC5228c.zzb;
        handler.sendMessage(handler.obtainMessage(i12, abstractC5228c.zzd.get(), 16));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ boolean zzn(AbstractC5228c abstractC5228c, int i10, int i11, IInterface iInterface) {
        synchronized (abstractC5228c.zzp) {
            if (abstractC5228c.zzv != i10) {
                return false;
            }
            abstractC5228c.zzp(i11, iInterface);
            return true;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException
        */
    static /* bridge */ /* synthetic */ boolean zzo(com.google.android.gms.common.internal.AbstractC5228c r2) {
        /*
            boolean r0 = r2.zzC
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.getServiceDescriptor()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.getLocalStartServiceAction()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.getServiceDescriptor()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.AbstractC5228c.zzo(com.google.android.gms.common.internal.c):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzp(int i10, IInterface iInterface) {
        C5293x1 c5293x1;
        C5276s.m13315a((i10 == 4) == (iInterface != 0));
        synchronized (this.zzp) {
            this.zzv = i10;
            this.zzs = iInterface;
            if (i10 == 1) {
                ServiceConnectionC5251j1 serviceConnectionC5251j1 = this.zzu;
                if (serviceConnectionC5251j1 != null) {
                    AbstractC5246i abstractC5246i = this.zzn;
                    String m13363b = this.zza.m13363b();
                    C5276s.m13324j(m13363b);
                    abstractC5246i.m13276g(m13363b, this.zza.m13362a(), 4225, serviceConnectionC5251j1, zze(), this.zza.m13364c());
                    this.zzu = null;
                }
            } else if (i10 == 2 || i10 == 3) {
                ServiceConnectionC5251j1 serviceConnectionC5251j12 = this.zzu;
                if (serviceConnectionC5251j12 != null && (c5293x1 = this.zza) != null) {
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + c5293x1.m13363b() + " on " + c5293x1.m13362a());
                    AbstractC5246i abstractC5246i2 = this.zzn;
                    String m13363b2 = this.zza.m13363b();
                    C5276s.m13324j(m13363b2);
                    abstractC5246i2.m13276g(m13363b2, this.zza.m13362a(), 4225, serviceConnectionC5251j12, zze(), this.zza.m13364c());
                    this.zzd.incrementAndGet();
                }
                ServiceConnectionC5251j1 serviceConnectionC5251j13 = new ServiceConnectionC5251j1(this, this.zzd.get());
                this.zzu = serviceConnectionC5251j13;
                C5293x1 c5293x12 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new C5293x1(getStartServicePackage(), getStartServiceAction(), false, 4225, getUseDynamicLookup()) : new C5293x1(getContext().getPackageName(), getLocalStartServiceAction(), true, 4225, false);
                this.zza = c5293x12;
                if (c5293x12.m13364c() && getMinApkVersion() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.m13363b())));
                }
                AbstractC5246i abstractC5246i3 = this.zzn;
                String m13363b3 = this.zza.m13363b();
                C5276s.m13324j(m13363b3);
                if (!abstractC5246i3.mo13277h(new C5272q1(m13363b3, this.zza.m13362a(), 4225, this.zza.m13364c()), serviceConnectionC5251j13, zze(), getBindServiceExecutor())) {
                    Log.w("GmsClient", "unable to connect to service: " + this.zza.m13363b() + " on " + this.zza.m13362a());
                    zzl(16, null, this.zzd.get());
                }
            } else if (i10 == 4) {
                C5276s.m13324j(iInterface);
                onConnectedLocked(iInterface);
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int mo10072h = this.zzo.mo10072h(this.zzl, getMinApkVersion());
        if (mo10072h == 0) {
            connect(new d());
        } else {
            zzp(1, null);
            triggerNotAvailable(new d(), mo10072h, null);
        }
    }

    protected final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(c cVar) {
        C5276s.m13325k(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        zzp(2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract T createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            int size = this.zzt.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC5245h1) this.zzt.get(i10)).m13268d();
            }
            this.zzt.clear();
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i10;
        IInterface iInterface;
        InterfaceC5261n interfaceC5261n;
        synchronized (this.zzp) {
            i10 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            interfaceC5261n = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        printWriter.print(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC5261n == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(interfaceC5261n.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.zzh;
            append.println(j10 + " " + simpleDateFormat.format(new Date(j10)));
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.zzf;
            printWriter.append((CharSequence) (i11 != 1 ? i11 != 2 ? i11 != 3 ? String.valueOf(i11) : "CAUSE_DEAD_OBJECT_EXCEPTION" : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED"));
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.zzg;
            append2.println(j11 + " " + simpleDateFormat.format(new Date(j11)));
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) C5104d.m12979a(this.zzi));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.zzj;
            append3.println(j12 + " " + simpleDateFormat.format(new Date(j12)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public C1898d[] getApiFeatures() {
        return zze;
    }

    public final C1898d[] getAvailableFeatures() {
        C5260m1 c5260m1 = this.zzD;
        if (c5260m1 == null) {
            return null;
        }
        return c5260m1.f10718b;
    }

    protected Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        C5293x1 c5293x1;
        if (!isConnected() || (c5293x1 = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return c5293x1.m13362a();
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    protected Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    protected String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return C1904g.f7923a;
    }

    public void getRemoteService(InterfaceC5252k interfaceC5252k, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        int i10 = this.zzy;
        String str = this.zzA;
        int i11 = C1904g.f7923a;
        Scope[] scopeArr = C5240g.f10675z;
        Bundle bundle = new Bundle();
        C1898d[] c1898dArr = C5240g.f10674A;
        C5240g c5240g = new C5240g(6, i10, i11, null, null, scopeArr, bundle, null, c1898dArr, c1898dArr, true, 0, false, str);
        c5240g.f10679d = this.zzl.getPackageName();
        c5240g.f10682r = getServiceRequestExtraArgs;
        if (set != null) {
            c5240g.f10681f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            c5240g.f10683s = account;
            if (interfaceC5252k != null) {
                c5240g.f10680e = interfaceC5252k.asBinder();
            }
        } else if (requiresAccount()) {
            c5240g.f10683s = getAccount();
        }
        c5240g.f10684t = zze;
        c5240g.f10685u = getApiFeatures();
        if (usesClientTelemetry()) {
            c5240g.f10688x = true;
        }
        try {
            synchronized (this.zzq) {
                InterfaceC5261n interfaceC5261n = this.zzr;
                if (interfaceC5261n != null) {
                    interfaceC5261n.mo13299E0(new BinderC5248i1(this, this.zzd.get()), c5240g);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            triggerConnectionSuspended(3);
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    protected Set<Scope> getScopes() {
        return Collections.emptySet();
    }

    public final T getService() {
        T t10;
        synchronized (this.zzp) {
            if (this.zzv == 5) {
                throw new DeadObjectException();
            }
            checkConnected();
            t10 = (T) this.zzs;
            C5276s.m13325k(t10, "Client is connected but service is null");
        }
        return t10;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            InterfaceC5261n interfaceC5261n = this.zzr;
            if (interfaceC5261n == null) {
                return null;
            }
            return interfaceC5261n.asBinder();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    protected abstract String getStartServiceAction();

    protected String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public C5237f getTelemetryConfiguration() {
        C5260m1 c5260m1 = this.zzD;
        if (c5260m1 == null) {
            return null;
        }
        return c5260m1.f10720d;
    }

    protected boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean isConnected() {
        boolean z10;
        synchronized (this.zzp) {
            z10 = this.zzv == 4;
        }
        return z10;
    }

    public boolean isConnecting() {
        boolean z10;
        synchronized (this.zzp) {
            int i10 = this.zzv;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    protected void onConnectedLocked(T t10) {
        this.zzh = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onConnectionFailed(C1894b c1894b) {
        this.zzi = c1894b.m10050u1();
        this.zzj = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onConnectionSuspended(int i10) {
        this.zzf = i10;
        this.zzg = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, new C5254k1(this, i10, iBinder, bundle)));
    }

    public void onUserSignOut(e eVar) {
        eVar.mo13086a();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i10) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.zzd.get(), i10));
    }

    protected void triggerNotAvailable(c cVar, int i10, PendingIntent pendingIntent) {
        C5276s.m13325k(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, this.zzd.get(), i10, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    protected final String zze() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzl(int i10, Bundle bundle, int i11) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, new C5257l1(this, i10, null)));
    }
}
