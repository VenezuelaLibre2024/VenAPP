package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p200ka.C9214b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.v1 */
/* loaded from: classes.dex */
public final class C5287v1 extends AbstractC5246i {

    /* renamed from: f */
    private final HashMap f10774f = new HashMap();

    /* renamed from: g */
    private final Context f10775g;

    /* renamed from: h */
    private volatile Handler f10776h;

    /* renamed from: i */
    private final C5284u1 f10777i;

    /* renamed from: j */
    private final C9214b f10778j;

    /* renamed from: k */
    private final long f10779k;

    /* renamed from: l */
    private final long f10780l;

    /* renamed from: m */
    private volatile Executor f10781m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5287v1(Context context, Looper looper, Executor executor) {
        C5284u1 c5284u1 = new C5284u1(this, null);
        this.f10777i = c5284u1;
        this.f10775g = context.getApplicationContext();
        this.f10776h = new zzi(looper, c5284u1);
        this.f10778j = C9214b.m27395b();
        this.f10779k = 5000L;
        this.f10780l = 300000L;
        this.f10781m = executor;
    }

    @Override // com.google.android.gms.common.internal.AbstractC5246i
    /* renamed from: f */
    protected final void mo13275f(C5272q1 c5272q1, ServiceConnection serviceConnection, String str) {
        C5276s.m13325k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f10774f) {
            ServiceConnectionC5278s1 serviceConnectionC5278s1 = (ServiceConnectionC5278s1) this.f10774f.get(c5272q1);
            if (serviceConnectionC5278s1 == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: " + c5272q1.toString());
            }
            if (!serviceConnectionC5278s1.m13338h(serviceConnection)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + c5272q1.toString());
            }
            serviceConnectionC5278s1.m13336f(serviceConnection, str);
            if (serviceConnectionC5278s1.m13339i()) {
                this.f10776h.sendMessageDelayed(this.f10776h.obtainMessage(0, c5272q1), this.f10779k);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC5246i
    /* renamed from: h */
    public final boolean mo13277h(C5272q1 c5272q1, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean m13340j;
        C5276s.m13325k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f10774f) {
            ServiceConnectionC5278s1 serviceConnectionC5278s1 = (ServiceConnectionC5278s1) this.f10774f.get(c5272q1);
            if (executor == null) {
                executor = this.f10781m;
            }
            if (serviceConnectionC5278s1 == null) {
                serviceConnectionC5278s1 = new ServiceConnectionC5278s1(this, c5272q1);
                serviceConnectionC5278s1.m13334d(serviceConnection, serviceConnection, str);
                serviceConnectionC5278s1.m13335e(str, executor);
                this.f10774f.put(c5272q1, serviceConnectionC5278s1);
            } else {
                this.f10776h.removeMessages(0, c5272q1);
                if (serviceConnectionC5278s1.m13338h(serviceConnection)) {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + c5272q1.toString());
                }
                serviceConnectionC5278s1.m13334d(serviceConnection, serviceConnection, str);
                int m13331a = serviceConnectionC5278s1.m13331a();
                if (m13331a == 1) {
                    serviceConnection.onServiceConnected(serviceConnectionC5278s1.m13332b(), serviceConnectionC5278s1.m13333c());
                } else if (m13331a == 2) {
                    serviceConnectionC5278s1.m13335e(str, executor);
                }
            }
            m13340j = serviceConnectionC5278s1.m13340j();
        }
        return m13340j;
    }
}
