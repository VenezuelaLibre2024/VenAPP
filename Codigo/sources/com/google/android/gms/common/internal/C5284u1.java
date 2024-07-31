package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.u1 */
/* loaded from: classes.dex */
public final class C5284u1 implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ C5287v1 f10771a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C5284u1(C5287v1 c5287v1, C5281t1 c5281t1) {
        this.f10771a = c5287v1;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i10 = message.what;
        if (i10 == 0) {
            hashMap = this.f10771a.f10774f;
            synchronized (hashMap) {
                C5272q1 c5272q1 = (C5272q1) message.obj;
                hashMap2 = this.f10771a.f10774f;
                ServiceConnectionC5278s1 serviceConnectionC5278s1 = (ServiceConnectionC5278s1) hashMap2.get(c5272q1);
                if (serviceConnectionC5278s1 != null && serviceConnectionC5278s1.m13339i()) {
                    if (serviceConnectionC5278s1.m13340j()) {
                        serviceConnectionC5278s1.m13337g("GmsClientSupervisor");
                    }
                    hashMap3 = this.f10771a.f10774f;
                    hashMap3.remove(c5272q1);
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        hashMap4 = this.f10771a.f10774f;
        synchronized (hashMap4) {
            C5272q1 c5272q12 = (C5272q1) message.obj;
            hashMap5 = this.f10771a.f10774f;
            ServiceConnectionC5278s1 serviceConnectionC5278s12 = (ServiceConnectionC5278s1) hashMap5.get(c5272q12);
            if (serviceConnectionC5278s12 != null && serviceConnectionC5278s12.m13331a() == 3) {
                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(c5272q12), new Exception());
                ComponentName m13332b = serviceConnectionC5278s12.m13332b();
                if (m13332b == null) {
                    m13332b = c5272q12.m13308a();
                }
                if (m13332b == null) {
                    String m13310c = c5272q12.m13310c();
                    C5276s.m13324j(m13310c);
                    m13332b = new ComponentName(m13310c, "unknown");
                }
                serviceConnectionC5278s12.onServiceDisconnected(m13332b);
            }
        }
        return true;
    }
}
