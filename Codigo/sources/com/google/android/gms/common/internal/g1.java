package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.internal.common.zzi;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g1 extends zzi {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f9578a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(c cVar, Looper looper) {
        super(looper);
        this.f9578a = cVar;
    }

    private static final void a(Message message) {
        h1 h1Var = (h1) message.obj;
        h1Var.b();
        h1Var.e();
    }

    private static final boolean b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        c.a aVar;
        c.a aVar2;
        ca.b bVar;
        ca.b bVar2;
        boolean z10;
        if (this.f9578a.zzd.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !this.f9578a.enableLocalFallback()) || message.what == 5)) && !this.f9578a.isConnecting()) {
            a(message);
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            this.f9578a.zzB = new ca.b(message.arg2);
            if (c.zzo(this.f9578a)) {
                c cVar = this.f9578a;
                z10 = cVar.zzC;
                if (!z10) {
                    cVar.zzp(3, null);
                    return;
                }
            }
            c cVar2 = this.f9578a;
            bVar2 = cVar2.zzB;
            ca.b bVar3 = bVar2 != null ? cVar2.zzB : new ca.b(8);
            this.f9578a.zzc.c(bVar3);
            this.f9578a.onConnectionFailed(bVar3);
            return;
        }
        if (i11 == 5) {
            c cVar3 = this.f9578a;
            bVar = cVar3.zzB;
            ca.b bVar4 = bVar != null ? cVar3.zzB : new ca.b(8);
            this.f9578a.zzc.c(bVar4);
            this.f9578a.onConnectionFailed(bVar4);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            ca.b bVar5 = new ca.b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f9578a.zzc.c(bVar5);
            this.f9578a.onConnectionFailed(bVar5);
            return;
        }
        if (i11 == 6) {
            this.f9578a.zzp(5, null);
            c cVar4 = this.f9578a;
            aVar = cVar4.zzw;
            if (aVar != null) {
                aVar2 = cVar4.zzw;
                aVar2.onConnectionSuspended(message.arg2);
            }
            this.f9578a.onConnectionSuspended(message.arg2);
            c.zzn(this.f9578a, 5, 1, null);
            return;
        }
        if (i11 == 2 && !this.f9578a.isConnected()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((h1) message.obj).c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}
