package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class u1 implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ v1 f9656a;

    public /* synthetic */ u1(v1 v1Var, t1 t1Var) {
        this.f9656a = v1Var;
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
            hashMap = this.f9656a.f9659f;
            synchronized (hashMap) {
                q1 q1Var = (q1) message.obj;
                hashMap2 = this.f9656a.f9659f;
                s1 s1Var = (s1) hashMap2.get(q1Var);
                if (s1Var != null && s1Var.i()) {
                    if (s1Var.j()) {
                        s1Var.g("GmsClientSupervisor");
                    }
                    hashMap3 = this.f9656a.f9659f;
                    hashMap3.remove(q1Var);
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        hashMap4 = this.f9656a.f9659f;
        synchronized (hashMap4) {
            q1 q1Var2 = (q1) message.obj;
            hashMap5 = this.f9656a.f9659f;
            s1 s1Var2 = (s1) hashMap5.get(q1Var2);
            if (s1Var2 != null && s1Var2.a() == 3) {
                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(q1Var2), new Exception());
                ComponentName b10 = s1Var2.b();
                if (b10 == null) {
                    b10 = q1Var2.a();
                }
                if (b10 == null) {
                    String c10 = q1Var2.c();
                    s.j(c10);
                    b10 = new ComponentName(c10, "unknown");
                }
                s1Var2.onServiceDisconnected(b10);
            }
        }
        return true;
    }
}
