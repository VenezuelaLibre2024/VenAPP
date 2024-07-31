package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class f0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7743a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f7744b;

    /* renamed from: c, reason: collision with root package name */
    private b f7745c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7746d;

    /* renamed from: e, reason: collision with root package name */
    private Messenger f7747e;

    /* renamed from: f, reason: collision with root package name */
    private final int f7748f;

    /* renamed from: r, reason: collision with root package name */
    private final int f7749r;

    /* renamed from: s, reason: collision with root package name */
    private final String f7750s;

    /* renamed from: t, reason: collision with root package name */
    private final int f7751t;

    /* renamed from: u, reason: collision with root package name */
    private final String f7752u;

    /* loaded from: classes.dex */
    public static final class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (a5.a.d(this)) {
                return;
            }
            try {
                if (a5.a.d(this)) {
                    return;
                }
                try {
                    kotlin.jvm.internal.n.e(message, "message");
                    f0.this.d(message);
                } catch (Throwable th2) {
                    a5.a.b(th2, this);
                }
            } catch (Throwable th3) {
                a5.a.b(th3, this);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Bundle bundle);
    }

    public f0(Context context, int i10, int i11, int i12, String applicationId, String str) {
        kotlin.jvm.internal.n.e(context, "context");
        kotlin.jvm.internal.n.e(applicationId, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.f7743a = applicationContext != null ? applicationContext : context;
        this.f7748f = i10;
        this.f7749r = i11;
        this.f7750s = applicationId;
        this.f7751t = i12;
        this.f7752u = str;
        this.f7744b = new a();
    }

    private final void a(Bundle bundle) {
        if (this.f7746d) {
            this.f7746d = false;
            b bVar = this.f7745c;
            if (bVar == null) {
                return;
            }
            bVar.a(bundle);
        }
    }

    private final void f() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f7750s);
        String str = this.f7752u;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        e(bundle);
        Message obtain = Message.obtain((Handler) null, this.f7748f);
        obtain.arg1 = this.f7751t;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f7744b);
        try {
            Messenger messenger = this.f7747e;
            if (messenger == null) {
                return;
            }
            messenger.send(obtain);
        } catch (RemoteException unused) {
            a(null);
        }
    }

    public final void b() {
        this.f7746d = false;
    }

    protected final Context c() {
        return this.f7743a;
    }

    protected final void d(Message message) {
        kotlin.jvm.internal.n.e(message, "message");
        if (message.what == this.f7749r) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                data = null;
            }
            a(data);
            try {
                this.f7743a.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    protected abstract void e(Bundle bundle);

    public final void g(b bVar) {
        this.f7745c = bVar;
    }

    public final boolean h() {
        synchronized (this) {
            boolean z10 = false;
            if (this.f7746d) {
                return false;
            }
            e0 e0Var = e0.f7730a;
            if (e0.s(this.f7751t) == -1) {
                return false;
            }
            Intent l10 = e0.l(c());
            if (l10 != null) {
                z10 = true;
                this.f7746d = true;
                c().bindService(l10, this, 1);
            }
            return z10;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName name, IBinder service) {
        kotlin.jvm.internal.n.e(name, "name");
        kotlin.jvm.internal.n.e(service, "service");
        this.f7747e = new Messenger(service);
        f();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName name) {
        kotlin.jvm.internal.n.e(name, "name");
        this.f7747e = null;
        try {
            this.f7743a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
