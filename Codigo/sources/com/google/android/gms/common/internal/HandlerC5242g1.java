package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import ca.C1894b;
import com.google.android.gms.common.internal.AbstractC5228c;
import com.google.android.gms.internal.common.zzi;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.g1 */
/* loaded from: classes.dex */
public final class HandlerC5242g1 extends zzi {

    /* renamed from: a */
    final /* synthetic */ AbstractC5228c f10693a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC5242g1(AbstractC5228c abstractC5228c, Looper looper) {
        super(looper);
        this.f10693a = abstractC5228c;
    }

    /* renamed from: a */
    private static final void m13263a(Message message) {
        AbstractC5245h1 abstractC5245h1 = (AbstractC5245h1) message.obj;
        abstractC5245h1.mo13266b();
        abstractC5245h1.m13269e();
    }

    /* renamed from: b */
    private static final boolean m13264b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC5228c.a aVar;
        AbstractC5228c.a aVar2;
        C1894b c1894b;
        C1894b c1894b2;
        boolean z10;
        if (this.f10693a.zzd.get() != message.arg1) {
            if (m13264b(message)) {
                m13263a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !this.f10693a.enableLocalFallback()) || message.what == 5)) && !this.f10693a.isConnecting()) {
            m13263a(message);
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            this.f10693a.zzB = new C1894b(message.arg2);
            if (AbstractC5228c.zzo(this.f10693a)) {
                AbstractC5228c abstractC5228c = this.f10693a;
                z10 = abstractC5228c.zzC;
                if (!z10) {
                    abstractC5228c.zzp(3, null);
                    return;
                }
            }
            AbstractC5228c abstractC5228c2 = this.f10693a;
            c1894b2 = abstractC5228c2.zzB;
            C1894b c1894b3 = c1894b2 != null ? abstractC5228c2.zzB : new C1894b(8);
            this.f10693a.zzc.mo13155c(c1894b3);
            this.f10693a.onConnectionFailed(c1894b3);
            return;
        }
        if (i11 == 5) {
            AbstractC5228c abstractC5228c3 = this.f10693a;
            c1894b = abstractC5228c3.zzB;
            C1894b c1894b4 = c1894b != null ? abstractC5228c3.zzB : new C1894b(8);
            this.f10693a.zzc.mo13155c(c1894b4);
            this.f10693a.onConnectionFailed(c1894b4);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            C1894b c1894b5 = new C1894b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f10693a.zzc.mo13155c(c1894b5);
            this.f10693a.onConnectionFailed(c1894b5);
            return;
        }
        if (i11 == 6) {
            this.f10693a.zzp(5, null);
            AbstractC5228c abstractC5228c4 = this.f10693a;
            aVar = abstractC5228c4.zzw;
            if (aVar != null) {
                aVar2 = abstractC5228c4.zzw;
                aVar2.onConnectionSuspended(message.arg2);
            }
            this.f10693a.onConnectionSuspended(message.arg2);
            AbstractC5228c.zzn(this.f10693a, 5, 1, null);
            return;
        }
        if (i11 == 2 && !this.f10693a.isConnected()) {
            m13263a(message);
            return;
        }
        if (m13264b(message)) {
            ((AbstractC5245h1) message.obj).m13267c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
