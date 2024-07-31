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
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q implements ServiceConnection {

    /* renamed from: c, reason: collision with root package name */
    r f6352c;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ w f6355f;

    /* renamed from: a, reason: collision with root package name */
    int f6350a = 0;

    /* renamed from: b, reason: collision with root package name */
    final Messenger f6351b = new Messenger(new zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: ba.j
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            q qVar = q.this;
            int i10 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb2 = new StringBuilder(41);
                sb2.append("Received response to request: ");
                sb2.append(i10);
                Log.d("MessengerIpcClient", sb2.toString());
            }
            synchronized (qVar) {
                t<?> tVar = qVar.f6354e.get(i10);
                if (tVar == null) {
                    StringBuilder sb3 = new StringBuilder(50);
                    sb3.append("Received response for unknown request: ");
                    sb3.append(i10);
                    Log.w("MessengerIpcClient", sb3.toString());
                    return true;
                }
                qVar.f6354e.remove(i10);
                qVar.f();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    tVar.c(new u(4, "Not supported by GmsCore", null));
                    return true;
                }
                tVar.a(data);
                return true;
            }
        }
    }));

    /* renamed from: d, reason: collision with root package name */
    final Queue<t<?>> f6353d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    final SparseArray<t<?>> f6354e = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ q(w wVar, p pVar) {
        this.f6355f = wVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(int i10, String str) {
        b(i10, str, null);
    }

    final synchronized void b(int i10, String str, Throwable th2) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i11 = this.f6350a;
        if (i11 == 0) {
            throw new IllegalStateException();
        }
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                return;
            }
            this.f6350a = 4;
            return;
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.f6350a = 4;
        ka.b.b().c(w.a(this.f6355f), this);
        u uVar = new u(i10, str, th2);
        Iterator<t<?>> it = this.f6353d.iterator();
        while (it.hasNext()) {
            it.next().c(uVar);
        }
        this.f6353d.clear();
        for (int i12 = 0; i12 < this.f6354e.size(); i12++) {
            this.f6354e.valueAt(i12).c(uVar);
        }
        this.f6354e.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        w.e(this.f6355f).execute(new Runnable() { // from class: ba.l
            @Override // java.lang.Runnable
            public final void run() {
                final t<?> poll;
                final q qVar = q.this;
                while (true) {
                    synchronized (qVar) {
                        if (qVar.f6350a != 2) {
                            return;
                        }
                        if (qVar.f6353d.isEmpty()) {
                            qVar.f();
                            return;
                        } else {
                            poll = qVar.f6353d.poll();
                            qVar.f6354e.put(poll.f6358a, poll);
                            w.e(qVar.f6355f).schedule(new Runnable() { // from class: ba.o
                                @Override // java.lang.Runnable
                                public final void run() {
                                    q.this.e(poll.f6358a);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(poll);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
                        sb2.append("Sending ");
                        sb2.append(valueOf);
                        Log.d("MessengerIpcClient", sb2.toString());
                    }
                    Context a10 = w.a(qVar.f6355f);
                    Messenger messenger = qVar.f6351b;
                    Message obtain = Message.obtain();
                    obtain.what = poll.f6360c;
                    obtain.arg1 = poll.f6358a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.b());
                    bundle.putString("pkg", a10.getPackageName());
                    bundle.putBundle("data", poll.f6361d);
                    obtain.setData(bundle);
                    try {
                        qVar.f6352c.a(obtain);
                    } catch (RemoteException e10) {
                        qVar.a(2, e10.getMessage());
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d() {
        if (this.f6350a == 1) {
            a(1, "Timed out while binding");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(int i10) {
        t<?> tVar = this.f6354e.get(i10);
        if (tVar != null) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Timing out request: ");
            sb2.append(i10);
            Log.w("MessengerIpcClient", sb2.toString());
            this.f6354e.remove(i10);
            tVar.c(new u(3, "Timed out waiting for response", null));
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void f() {
        if (this.f6350a == 2 && this.f6353d.isEmpty() && this.f6354e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f6350a = 3;
            ka.b.b().c(w.a(this.f6355f), this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean g(t<?> tVar) {
        int i10 = this.f6350a;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f6353d.add(tVar);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            this.f6353d.add(tVar);
            c();
            return true;
        }
        this.f6353d.add(tVar);
        com.google.android.gms.common.internal.s.n(this.f6350a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f6350a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (ka.b.b().a(w.a(this.f6355f), intent, this, 1)) {
                w.e(this.f6355f).schedule(new Runnable() { // from class: ba.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        q.this.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e10) {
            b(0, "Unable to bind to service", e10);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        w.e(this.f6355f).execute(new Runnable() { // from class: ba.n
            @Override // java.lang.Runnable
            public final void run() {
                q qVar = q.this;
                IBinder iBinder2 = iBinder;
                synchronized (qVar) {
                    try {
                        if (iBinder2 == null) {
                            qVar.a(0, "Null service connection");
                            return;
                        }
                        try {
                            qVar.f6352c = new r(iBinder2);
                            qVar.f6350a = 2;
                            qVar.c();
                        } catch (RemoteException e10) {
                            qVar.a(0, e10.getMessage());
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
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        w.e(this.f6355f).execute(new Runnable() { // from class: ba.k
            @Override // java.lang.Runnable
            public final void run() {
                q.this.a(2, "Service disconnected");
            }
        });
    }
}
