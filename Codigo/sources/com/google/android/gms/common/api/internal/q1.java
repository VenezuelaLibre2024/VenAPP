package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q1 extends zau {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s1 f9461a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(s1 s1Var, Looper looper) {
        super(looper);
        this.f9461a = s1Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        s1 s1Var;
        Status a10;
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 == 1) {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
            Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i10);
            return;
        }
        com.google.android.gms.common.api.i iVar = (com.google.android.gms.common.api.i) message.obj;
        obj = this.f9461a.f9469e;
        synchronized (obj) {
            s1Var = this.f9461a.f9466b;
            s1 s1Var2 = (s1) com.google.android.gms.common.internal.s.j(s1Var);
            if (iVar == null) {
                a10 = new Status(13, "Transform returned null");
            } else if (iVar instanceof i1) {
                a10 = ((i1) iVar).a();
            } else {
                s1Var2.j(iVar);
            }
            s1Var2.k(a10);
        }
    }
}
