package ba;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p200ka.C9214b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ba.q */
/* loaded from: classes.dex */
public final class ServiceConnectionC1705q implements ServiceConnection {

    /* renamed from: c */
    C1706r f7274c;

    /* renamed from: f */
    final /* synthetic */ C1711w f7277f;

    /* renamed from: a */
    int f7272a = 0;

    /* renamed from: b */
    final Messenger f7273b = new Messenger(new zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: ba.j
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            ServiceConnectionC1705q serviceConnectionC1705q = ServiceConnectionC1705q.this;
            int i10 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb2 = new StringBuilder(41);
                sb2.append("Received response to request: ");
                sb2.append(i10);
                Log.d("MessengerIpcClient", sb2.toString());
            }
            synchronized (serviceConnectionC1705q) {
                AbstractC1708t<?> abstractC1708t = serviceConnectionC1705q.f7276e.get(i10);
                if (abstractC1708t == null) {
                    StringBuilder sb3 = new StringBuilder(50);
                    sb3.append("Received response for unknown request: ");
                    sb3.append(i10);
                    Log.w("MessengerIpcClient", sb3.toString());
                    return true;
                }
                serviceConnectionC1705q.f7276e.remove(i10);
                serviceConnectionC1705q.m9304f();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    abstractC1708t.m9309c(new C1709u(4, "Not supported by GmsCore", null));
                    return true;
                }
                abstractC1708t.mo9307a(data);
                return true;
            }
        }
    }));

    /* renamed from: d */
    final Queue<AbstractC1708t<?>> f7275d = new ArrayDeque();

    /* renamed from: e */
    final SparseArray<AbstractC1708t<?>> f7276e = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ServiceConnectionC1705q(C1711w c1711w, C1704p c1704p) {
        this.f7277f = c1711w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void m9299a(int i10, String str) {
        m9300b(i10, str, null);
    }

    /* renamed from: b */
    final synchronized void m9300b(int i10, String str, Throwable th2) {
        Context context;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i11 = this.f7272a;
        if (i11 == 0) {
            throw new IllegalStateException();
        }
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                return;
            }
            this.f7272a = 4;
            return;
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.f7272a = 4;
        C9214b m27395b = C9214b.m27395b();
        context = this.f7277f.f7285a;
        m27395b.m27401c(context, this);
        C1709u c1709u = new C1709u(i10, str, th2);
        Iterator<AbstractC1708t<?>> it = this.f7275d.iterator();
        while (it.hasNext()) {
            it.next().m9309c(c1709u);
        }
        this.f7275d.clear();
        for (int i12 = 0; i12 < this.f7276e.size(); i12++) {
            this.f7276e.valueAt(i12).m9309c(c1709u);
        }
        this.f7276e.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m9301c() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.f7277f.f7286b;
        scheduledExecutorService.execute(new Runnable() { // from class: ba.l
            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC1708t<?> poll;
                ScheduledExecutorService scheduledExecutorService2;
                Context context;
                final ServiceConnectionC1705q serviceConnectionC1705q = ServiceConnectionC1705q.this;
                while (true) {
                    synchronized (serviceConnectionC1705q) {
                        if (serviceConnectionC1705q.f7272a != 2) {
                            return;
                        }
                        if (serviceConnectionC1705q.f7275d.isEmpty()) {
                            serviceConnectionC1705q.m9304f();
                            return;
                        }
                        poll = serviceConnectionC1705q.f7275d.poll();
                        serviceConnectionC1705q.f7276e.put(poll.f7280a, poll);
                        scheduledExecutorService2 = serviceConnectionC1705q.f7277f.f7286b;
                        scheduledExecutorService2.schedule(new Runnable() { // from class: ba.o
                            @Override // java.lang.Runnable
                            public final void run() {
                                ServiceConnectionC1705q.this.m9303e(poll.f7280a);
                            }
                        }, 30L, TimeUnit.SECONDS);
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(poll);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
                        sb2.append("Sending ");
                        sb2.append(valueOf);
                        Log.d("MessengerIpcClient", sb2.toString());
                    }
                    context = serviceConnectionC1705q.f7277f.f7285a;
                    Messenger messenger = serviceConnectionC1705q.f7273b;
                    Message obtain = Message.obtain();
                    obtain.what = poll.f7282c;
                    obtain.arg1 = poll.f7280a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.mo9308b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", poll.f7283d);
                    obtain.setData(bundle);
                    try {
                        serviceConnectionC1705q.f7274c.m9306a(obtain);
                    } catch (RemoteException e10) {
                        serviceConnectionC1705q.m9299a(2, e10.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void m9302d() {
        if (this.f7272a == 1) {
            m9299a(1, "Timed out while binding");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized void m9303e(int i10) {
        AbstractC1708t<?> abstractC1708t = this.f7276e.get(i10);
        if (abstractC1708t != null) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Timing out request: ");
            sb2.append(i10);
            Log.w("MessengerIpcClient", sb2.toString());
            this.f7276e.remove(i10);
            abstractC1708t.m9309c(new C1709u(3, "Timed out waiting for response", null));
            m9304f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final synchronized void m9304f() {
        Context context;
        if (this.f7272a == 2 && this.f7275d.isEmpty() && this.f7276e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f7272a = 3;
            C9214b m27395b = C9214b.m27395b();
            context = this.f7277f.f7285a;
            m27395b.m27401c(context, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final synchronized boolean m9305g(AbstractC1708t<?> abstractC1708t) {
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        int i10 = this.f7272a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f7275d.add(abstractC1708t);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            this.f7275d.add(abstractC1708t);
            m9301c();
            return true;
        }
        this.f7275d.add(abstractC1708t);
        C5276s.m13328n(this.f7272a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f7272a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            C9214b m27395b = C9214b.m27395b();
            context = this.f7277f.f7285a;
            if (m27395b.m27400a(context, intent, this, 1)) {
                scheduledExecutorService = this.f7277f.f7286b;
                scheduledExecutorService.schedule(new Runnable() { // from class: ba.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        ServiceConnectionC1705q.this.m9302d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                m9299a(0, "Unable to bind to service");
            }
        } catch (SecurityException e10) {
            m9300b(0, "Unable to bind to service", e10);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        scheduledExecutorService = this.f7277f.f7286b;
        scheduledExecutorService.execute(new Runnable() { // from class: ba.n
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC1705q serviceConnectionC1705q = ServiceConnectionC1705q.this;
                IBinder iBinder2 = iBinder;
                synchronized (serviceConnectionC1705q) {
                    try {
                        if (iBinder2 == null) {
                            serviceConnectionC1705q.m9299a(0, "Null service connection");
                            return;
                        }
                        try {
                            serviceConnectionC1705q.f7274c = new C1706r(iBinder2);
                            serviceConnectionC1705q.f7272a = 2;
                            serviceConnectionC1705q.m9301c();
                        } catch (RemoteException e10) {
                            serviceConnectionC1705q.m9299a(0, e10.getMessage());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ScheduledExecutorService scheduledExecutorService;
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        scheduledExecutorService = this.f7277f.f7286b;
        scheduledExecutorService.execute(new Runnable() { // from class: ba.k
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC1705q.this.m9299a(2, "Service disconnected");
            }
        });
    }
}
