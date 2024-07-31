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
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;

/* renamed from: com.facebook.internal.f0 */
/* loaded from: classes.dex */
public abstract class AbstractServiceConnectionC4618f0 implements ServiceConnection {

    /* renamed from: a */
    private final Context f8718a;

    /* renamed from: b */
    private final Handler f8719b;

    /* renamed from: c */
    private b f8720c;

    /* renamed from: d */
    private boolean f8721d;

    /* renamed from: e */
    private Messenger f8722e;

    /* renamed from: f */
    private final int f8723f;

    /* renamed from: r */
    private final int f8724r;

    /* renamed from: s */
    private final String f8725s;

    /* renamed from: t */
    private final int f8726t;

    /* renamed from: u */
    private final String f8727u;

    /* renamed from: com.facebook.internal.f0$a */
    /* loaded from: classes.dex */
    public static final class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (C0033a.m107d(this)) {
                return;
            }
            try {
                if (C0033a.m107d(this)) {
                    return;
                }
                try {
                    C9322n.m27781e(message, "message");
                    AbstractServiceConnectionC4618f0.this.m11202d(message);
                } catch (Throwable th2) {
                    C0033a.m105b(th2, this);
                }
            } catch (Throwable th3) {
                C0033a.m105b(th3, this);
            }
        }
    }

    /* renamed from: com.facebook.internal.f0$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo11206a(Bundle bundle);
    }

    public AbstractServiceConnectionC4618f0(Context context, int i10, int i11, int i12, String applicationId, String str) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(applicationId, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.f8718a = applicationContext != null ? applicationContext : context;
        this.f8723f = i10;
        this.f8724r = i11;
        this.f8725s = applicationId;
        this.f8726t = i12;
        this.f8727u = str;
        this.f8719b = new a();
    }

    /* renamed from: a */
    private final void m11198a(Bundle bundle) {
        if (this.f8721d) {
            this.f8721d = false;
            b bVar = this.f8720c;
            if (bVar == null) {
                return;
            }
            bVar.mo11206a(bundle);
        }
    }

    /* renamed from: f */
    private final void m11199f() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f8725s);
        String str = this.f8727u;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        mo11203e(bundle);
        Message obtain = Message.obtain((Handler) null, this.f8723f);
        obtain.arg1 = this.f8726t;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f8719b);
        try {
            Messenger messenger = this.f8722e;
            if (messenger == null) {
                return;
            }
            messenger.send(obtain);
        } catch (RemoteException unused) {
            m11198a(null);
        }
    }

    /* renamed from: b */
    public final void m11200b() {
        this.f8721d = false;
    }

    /* renamed from: c */
    protected final Context m11201c() {
        return this.f8718a;
    }

    /* renamed from: d */
    protected final void m11202d(Message message) {
        C9322n.m27781e(message, "message");
        if (message.what == this.f8724r) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                data = null;
            }
            m11198a(data);
            try {
                this.f8718a.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* renamed from: e */
    protected abstract void mo11203e(Bundle bundle);

    /* renamed from: g */
    public final void m11204g(b bVar) {
        this.f8720c = bVar;
    }

    /* renamed from: h */
    public final boolean m11205h() {
        synchronized (this) {
            boolean z10 = false;
            if (this.f8721d) {
                return false;
            }
            C4616e0 c4616e0 = C4616e0.f8705a;
            if (C4616e0.m11173s(this.f8726t) == -1) {
                return false;
            }
            Intent m11166l = C4616e0.m11166l(m11201c());
            if (m11166l != null) {
                z10 = true;
                this.f8721d = true;
                m11201c().bindService(m11166l, this, 1);
            }
            return z10;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName name, IBinder service) {
        C9322n.m27781e(name, "name");
        C9322n.m27781e(service, "service");
        this.f8722e = new Messenger(service);
        m11199f();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName name) {
        C9322n.m27781e(name, "name");
        this.f8722e = null;
        try {
            this.f8718a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        m11198a(null);
    }
}
