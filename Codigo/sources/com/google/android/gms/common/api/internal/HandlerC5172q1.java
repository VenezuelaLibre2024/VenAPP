package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC5109i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.internal.base.zau;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.q1 */
/* loaded from: classes.dex */
public final class HandlerC5172q1 extends zau {

    /* renamed from: a */
    final /* synthetic */ C5178s1 f10575a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC5172q1(C5178s1 c5178s1, Looper looper) {
        super(looper);
        this.f10575a = c5178s1;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        C5178s1 c5178s1;
        Status m13074a;
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
        AbstractC5109i abstractC5109i = (AbstractC5109i) message.obj;
        obj = this.f10575a.f10583e;
        synchronized (obj) {
            c5178s1 = this.f10575a.f10580b;
            C5178s1 c5178s12 = (C5178s1) C5276s.m13324j(c5178s1);
            if (abstractC5109i == null) {
                m13074a = new Status(13, "Transform returned null");
            } else if (abstractC5109i instanceof C5145i1) {
                m13074a = ((C5145i1) abstractC5109i).m13074a();
            } else {
                c5178s12.m13186j(abstractC5109i);
            }
            c5178s12.m13179k(m13074a);
        }
    }
}
