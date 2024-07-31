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

/* loaded from: classes.dex */
public abstract class c<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private ca.b zzB;
    private boolean zzC;
    private volatile m1 zzD;
    x1 zza;
    final Handler zzb;
    protected InterfaceC0149c zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final i zzn;
    private final ca.g zzo;
    private final Object zzp;
    private final Object zzq;
    private n zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private j1 zzu;
    private int zzv;
    private final a zzw;
    private final b zzx;
    private final int zzy;
    private final String zzz;
    private static final ca.d[] zze = new ca.d[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* loaded from: classes.dex */
    public interface a {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i10);
    }

    /* loaded from: classes.dex */
    public interface b {
        void onConnectionFailed(ca.b bVar);
    }

    /* renamed from: com.google.android.gms.common.internal.c$c */
    /* loaded from: classes.dex */
    public interface InterfaceC0149c {
        void c(ca.b bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public class d implements InterfaceC0149c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.c.InterfaceC0149c
        public final void c(ca.b bVar) {
            if (bVar.y1()) {
                c cVar = c.this;
                cVar.getRemoteService(null, cVar.getScopes());
            } else if (c.this.zzx != null) {
                c.this.zzx.onConnectionFailed(bVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a();
    }

    public c(Context context, Handler handler, i iVar, ca.g gVar, int i10, a aVar, b bVar) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        s.k(context, "Context must not be null");
        this.zzl = context;
        s.k(handler, "Handler must not be null");
        this.zzb = handler;
        this.zzm = handler.getLooper();
        s.k(iVar, "Supervisor must not be null");
        this.zzn = iVar;
        s.k(gVar, "API availability must not be null");
        this.zzo = gVar;
        this.zzy = i10;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.c.a r13, com.google.android.gms.common.internal.c.b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.i r3 = com.google.android.gms.common.internal.i.c(r10)
            ca.g r4 = ca.g.f()
            com.google.android.gms.common.internal.s.j(r13)
            com.google.android.gms.common.internal.s.j(r14)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.c.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.c$a, com.google.android.gms.common.internal.c$b, java.lang.String):void");
    }

    public c(Context context, Looper looper, i iVar, ca.g gVar, int i10, a aVar, b bVar, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        s.k(context, "Context must not be null");
        this.zzl = context;
        s.k(looper, "Looper must not be null");
        this.zzm = looper;
        s.k(iVar, "Supervisor must not be null");
        this.zzn = iVar;
        s.k(gVar, "API availability must not be null");
        this.zzo = gVar;
        this.zzb = new g1(this, looper);
        this.zzy = i10;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = str;
    }

    public static /* bridge */ /* synthetic */ void zzj(c cVar, m1 m1Var) {
        cVar.zzD = m1Var;
        if (cVar.usesClientTelemetry()) {
            f fVar = m1Var.f9605d;
            t.b().c(fVar == null ? null : fVar.z1());
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(c cVar, int i10) {
        int i11;
        int i12;
        synchronized (cVar.zzp) {
            i11 = cVar.zzv;
        }
        if (i11 == 3) {
            cVar.zzC = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = cVar.zzb;
        handler.sendMessage(handler.obtainMessage(i12, cVar.zzd.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean zzn(c cVar, int i10, int i11, IInterface iInterface) {
        synchronized (cVar.zzp) {
            if (cVar.zzv != i10) {
                return false;
            }
            cVar.zzp(i11, iInterface);
            return true;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException
        */
    static /* bridge */ /* synthetic */ boolean zzo(com.google.android.gms.common.internal.c r2) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.c.zzo(com.google.android.gms.common.internal.c):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzp(int i10, IInterface iInterface) {
        x1 x1Var;
        s.a((i10 == 4) == (iInterface != 0));
        synchronized (this.zzp) {
            this.zzv = i10;
            this.zzs = iInterface;
            if (i10 == 1) {
                j1 j1Var = this.zzu;
                if (j1Var != null) {
                    i iVar = this.zzn;
                    String b10 = this.zza.b();
                    s.j(b10);
                    iVar.g(b10, this.zza.a(), 4225, j1Var, zze(), this.zza.c());
                    this.zzu = null;
                }
            } else if (i10 == 2 || i10 == 3) {
                j1 j1Var2 = this.zzu;
                if (j1Var2 != null && (x1Var = this.zza) != null) {
                    Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + x1Var.b() + " on " + x1Var.a());
                    i iVar2 = this.zzn;
                    String b11 = this.zza.b();
                    s.j(b11);
                    iVar2.g(b11, this.zza.a(), 4225, j1Var2, zze(), this.zza.c());
                    this.zzd.incrementAndGet();
                }
                j1 j1Var3 = new j1(this, this.zzd.get());
                this.zzu = j1Var3;
                x1 x1Var2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new x1(getStartServicePackage(), getStartServiceAction(), false, 4225, getUseDynamicLookup()) : new x1(getContext().getPackageName(), getLocalStartServiceAction(), true, 4225, false);
                this.zza = x1Var2;
                if (x1Var2.c() && getMinApkVersion() < 17895000) {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.b())));
                }
                i iVar3 = this.zzn;
                String b12 = this.zza.b();
                s.j(b12);
                if (!iVar3.h(new q1(b12, this.zza.a(), 4225, this.zza.c()), j1Var3, zze(), getBindServiceExecutor())) {
                    Log.w("GmsClient", "unable to connect to service: " + this.zza.b() + " on " + this.zza.a());
                    zzl(16, null, this.zzd.get());
                }
            } else if (i10 == 4) {
                s.j(iInterface);
                onConnectedLocked(iInterface);
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int h10 = this.zzo.h(this.zzl, getMinApkVersion());
        if (h10 == 0) {
            connect(new d());
        } else {
            zzp(1, null);
            triggerNotAvailable(new d(), h10, null);
        }
    }

    protected final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(InterfaceC0149c interfaceC0149c) {
        s.k(interfaceC0149c, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC0149c;
        zzp(2, null);
    }

    public abstract T createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            int size = this.zzt.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((h1) this.zzt.get(i10)).d();
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
        n nVar;
        synchronized (this.zzp) {
            i10 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            nVar = this.zzr;
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
        if (nVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(nVar.asBinder())));
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
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) com.google.android.gms.common.api.d.a(this.zzi));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.zzj;
            append3.println(j12 + " " + simpleDateFormat.format(new Date(j12)));
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public ca.d[] getApiFeatures() {
        return zze;
    }

    public final ca.d[] getAvailableFeatures() {
        m1 m1Var = this.zzD;
        if (m1Var == null) {
            return null;
        }
        return m1Var.f9603b;
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
        x1 x1Var;
        if (!isConnected() || (x1Var = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return x1Var.a();
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
        return ca.g.f6974a;
    }

    public void getRemoteService(k kVar, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        int i10 = this.zzy;
        String str = this.zzA;
        int i11 = ca.g.f6974a;
        Scope[] scopeArr = g.f9560z;
        Bundle bundle = new Bundle();
        ca.d[] dVarArr = g.A;
        g gVar = new g(6, i10, i11, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        gVar.f9564d = this.zzl.getPackageName();
        gVar.f9567r = getServiceRequestExtraArgs;
        if (set != null) {
            gVar.f9566f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            gVar.f9568s = account;
            if (kVar != null) {
                gVar.f9565e = kVar.asBinder();
            }
        } else if (requiresAccount()) {
            gVar.f9568s = getAccount();
        }
        gVar.f9569t = zze;
        gVar.f9570u = getApiFeatures();
        if (usesClientTelemetry()) {
            gVar.f9573x = true;
        }
        try {
            synchronized (this.zzq) {
                n nVar = this.zzr;
                if (nVar != null) {
                    nVar.E0(new i1(this, this.zzd.get()), gVar);
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
            s.k(t10, "Client is connected but service is null");
        }
        return t10;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            n nVar = this.zzr;
            if (nVar == null) {
                return null;
            }
            return nVar.asBinder();
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    protected abstract String getStartServiceAction();

    protected String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public f getTelemetryConfiguration() {
        m1 m1Var = this.zzD;
        if (m1Var == null) {
            return null;
        }
        return m1Var.f9605d;
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

    public void onConnectionFailed(ca.b bVar) {
        this.zzi = bVar.u1();
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i10) {
        this.zzf = i10;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, new k1(this, i10, iBinder, bundle)));
    }

    public void onUserSignOut(e eVar) {
        eVar.a();
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

    protected void triggerNotAvailable(InterfaceC0149c interfaceC0149c, int i10, PendingIntent pendingIntent) {
        s.k(interfaceC0149c, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC0149c;
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

    public final void zzl(int i10, Bundle bundle, int i11) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, new l1(this, i10, null)));
    }
}
