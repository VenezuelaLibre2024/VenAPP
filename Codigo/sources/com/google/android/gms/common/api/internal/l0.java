package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes.dex */
public final class l0 implements f.a, f.b {

    /* renamed from: b */
    private final a.f f9401b;

    /* renamed from: c */
    private final b f9402c;

    /* renamed from: d */
    private final b0 f9403d;

    /* renamed from: r */
    private final int f9406r;

    /* renamed from: s */
    private final m1 f9407s;

    /* renamed from: t */
    private boolean f9408t;

    /* renamed from: x */
    final /* synthetic */ g f9412x;

    /* renamed from: a */
    private final Queue f9400a = new LinkedList();

    /* renamed from: e */
    private final Set f9404e = new HashSet();

    /* renamed from: f */
    private final Map f9405f = new HashMap();

    /* renamed from: u */
    private final List f9409u = new ArrayList();

    /* renamed from: v */
    private ca.b f9410v = null;

    /* renamed from: w */
    private int f9411w = 0;

    public l0(g gVar, com.google.android.gms.common.api.e eVar) {
        Handler handler;
        Context context;
        Handler handler2;
        this.f9412x = gVar;
        handler = gVar.A;
        a.f zab = eVar.zab(handler.getLooper(), this);
        this.f9401b = zab;
        this.f9402c = eVar.getApiKey();
        this.f9403d = new b0();
        this.f9406r = eVar.zaa();
        if (!zab.requiresSignIn()) {
            this.f9407s = null;
            return;
        }
        context = gVar.f9359r;
        handler2 = gVar.A;
        this.f9407s = eVar.zac(context, handler2);
    }

    public static /* bridge */ /* synthetic */ boolean K(l0 l0Var, boolean z10) {
        return l0Var.n(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ca.d b(ca.d[] dVarArr) {
        if (dVarArr != null && dVarArr.length != 0) {
            ca.d[] availableFeatures = this.f9401b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new ca.d[0];
            }
            androidx.collection.a aVar = new androidx.collection.a(availableFeatures.length);
            for (ca.d dVar : availableFeatures) {
                aVar.put(dVar.u1(), Long.valueOf(dVar.v1()));
            }
            for (ca.d dVar2 : dVarArr) {
                Long l10 = (Long) aVar.get(dVar2.u1());
                if (l10 == null || l10.longValue() < dVar2.v1()) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    private final void c(ca.b bVar) {
        Iterator it = this.f9404e.iterator();
        while (it.hasNext()) {
            ((z1) it.next()).b(this.f9402c, bVar, com.google.android.gms.common.internal.q.b(bVar, ca.b.f6941e) ? this.f9401b.getEndpointPackageName() : null);
        }
        this.f9404e.clear();
    }

    public final void d(Status status) {
        Handler handler;
        handler = this.f9412x.A;
        com.google.android.gms.common.internal.s.d(handler);
        e(status, null, false);
    }

    private final void e(Status status, Exception exc, boolean z10) {
        Handler handler;
        handler = this.f9412x.A;
        com.google.android.gms.common.internal.s.d(handler);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f9400a.iterator();
        while (it.hasNext()) {
            y1 y1Var = (y1) it.next();
            if (!z10 || y1Var.f9501a == 2) {
                if (status != null) {
                    y1Var.a(status);
                } else {
                    y1Var.b(exc);
                }
                it.remove();
            }
        }
    }

    private final void f() {
        ArrayList arrayList = new ArrayList(this.f9400a);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            y1 y1Var = (y1) arrayList.get(i10);
            if (!this.f9401b.isConnected()) {
                return;
            }
            if (l(y1Var)) {
                this.f9400a.remove(y1Var);
            }
        }
    }

    public final void g() {
        A();
        c(ca.b.f6941e);
        k();
        Iterator it = this.f9405f.values().iterator();
        while (it.hasNext()) {
            b1 b1Var = (b1) it.next();
            if (b(b1Var.f9328a.c()) == null) {
                try {
                    b1Var.f9328a.d(this.f9401b, new TaskCompletionSource<>());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.f9401b.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                }
            }
            it.remove();
        }
        f();
        i();
    }

    public final void h(int i10) {
        Handler handler;
        Handler handler2;
        long j10;
        Handler handler3;
        Handler handler4;
        long j11;
        com.google.android.gms.common.internal.l0 l0Var;
        A();
        this.f9408t = true;
        this.f9403d.e(i10, this.f9401b.getLastDisconnectMessage());
        g gVar = this.f9412x;
        handler = gVar.A;
        handler2 = gVar.A;
        Message obtain = Message.obtain(handler2, 9, this.f9402c);
        j10 = this.f9412x.f9353a;
        handler.sendMessageDelayed(obtain, j10);
        g gVar2 = this.f9412x;
        handler3 = gVar2.A;
        handler4 = gVar2.A;
        Message obtain2 = Message.obtain(handler4, 11, this.f9402c);
        j11 = this.f9412x.f9354b;
        handler3.sendMessageDelayed(obtain2, j11);
        l0Var = this.f9412x.f9361t;
        l0Var.c();
        Iterator it = this.f9405f.values().iterator();
        while (it.hasNext()) {
            ((b1) it.next()).f9330c.run();
        }
    }

    private final void i() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j10;
        handler = this.f9412x.A;
        handler.removeMessages(12, this.f9402c);
        g gVar = this.f9412x;
        handler2 = gVar.A;
        handler3 = gVar.A;
        Message obtainMessage = handler3.obtainMessage(12, this.f9402c);
        j10 = this.f9412x.f9355c;
        handler2.sendMessageDelayed(obtainMessage, j10);
    }

    private final void j(y1 y1Var) {
        y1Var.d(this.f9403d, M());
        try {
            y1Var.c(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.f9401b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void k() {
        Handler handler;
        Handler handler2;
        if (this.f9408t) {
            handler = this.f9412x.A;
            handler.removeMessages(11, this.f9402c);
            handler2 = this.f9412x.A;
            handler2.removeMessages(9, this.f9402c);
            this.f9408t = false;
        }
    }

    private final boolean l(y1 y1Var) {
        boolean z10;
        Handler handler;
        Handler handler2;
        long j10;
        Handler handler3;
        Handler handler4;
        long j11;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        long j12;
        if (!(y1Var instanceof u0)) {
            j(y1Var);
            return true;
        }
        u0 u0Var = (u0) y1Var;
        ca.d b10 = b(u0Var.g(this));
        if (b10 == null) {
            j(y1Var);
            return true;
        }
        Log.w("GoogleApiManager", this.f9401b.getClass().getName() + " could not execute call because it requires feature (" + b10.u1() + ", " + b10.v1() + ").");
        z10 = this.f9412x.B;
        if (!z10 || !u0Var.f(this)) {
            u0Var.b(new com.google.android.gms.common.api.s(b10));
            return true;
        }
        n0 n0Var = new n0(this.f9402c, b10, null);
        int indexOf = this.f9409u.indexOf(n0Var);
        if (indexOf >= 0) {
            n0 n0Var2 = (n0) this.f9409u.get(indexOf);
            handler5 = this.f9412x.A;
            handler5.removeMessages(15, n0Var2);
            g gVar = this.f9412x;
            handler6 = gVar.A;
            handler7 = gVar.A;
            Message obtain = Message.obtain(handler7, 15, n0Var2);
            j12 = this.f9412x.f9353a;
            handler6.sendMessageDelayed(obtain, j12);
            return false;
        }
        this.f9409u.add(n0Var);
        g gVar2 = this.f9412x;
        handler = gVar2.A;
        handler2 = gVar2.A;
        Message obtain2 = Message.obtain(handler2, 15, n0Var);
        j10 = this.f9412x.f9353a;
        handler.sendMessageDelayed(obtain2, j10);
        g gVar3 = this.f9412x;
        handler3 = gVar3.A;
        handler4 = gVar3.A;
        Message obtain3 = Message.obtain(handler4, 16, n0Var);
        j11 = this.f9412x.f9354b;
        handler3.sendMessageDelayed(obtain3, j11);
        ca.b bVar = new ca.b(2, null);
        if (m(bVar)) {
            return false;
        }
        this.f9412x.h(bVar, this.f9406r);
        return false;
    }

    private final boolean m(ca.b bVar) {
        Object obj;
        c0 c0Var;
        Set set;
        c0 c0Var2;
        obj = g.E;
        synchronized (obj) {
            g gVar = this.f9412x;
            c0Var = gVar.f9365x;
            if (c0Var != null) {
                set = gVar.f9366y;
                if (set.contains(this.f9402c)) {
                    c0Var2 = this.f9412x.f9365x;
                    c0Var2.h(bVar, this.f9406r);
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean n(boolean z10) {
        Handler handler;
        handler = this.f9412x.A;
        com.google.android.gms.common.internal.s.d(handler);
        if (!this.f9401b.isConnected() || this.f9405f.size() != 0) {
            return false;
        }
        if (!this.f9403d.g()) {
            this.f9401b.disconnect("Timing out service connection.");
            return true;
        }
        if (z10) {
            i();
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ b t(l0 l0Var) {
        return l0Var.f9402c;
    }

    public static /* bridge */ /* synthetic */ void v(l0 l0Var, Status status) {
        l0Var.d(status);
    }

    public static /* bridge */ /* synthetic */ void y(l0 l0Var, n0 n0Var) {
        if (l0Var.f9409u.contains(n0Var) && !l0Var.f9408t) {
            if (l0Var.f9401b.isConnected()) {
                l0Var.f();
            } else {
                l0Var.B();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void z(l0 l0Var, n0 n0Var) {
        Handler handler;
        Handler handler2;
        ca.d dVar;
        ca.d[] g10;
        if (l0Var.f9409u.remove(n0Var)) {
            handler = l0Var.f9412x.A;
            handler.removeMessages(15, n0Var);
            handler2 = l0Var.f9412x.A;
            handler2.removeMessages(16, n0Var);
            dVar = n0Var.f9433b;
            ArrayList arrayList = new ArrayList(l0Var.f9400a.size());
            for (y1 y1Var : l0Var.f9400a) {
                if ((y1Var instanceof u0) && (g10 = ((u0) y1Var).g(l0Var)) != null && la.b.b(g10, dVar)) {
                    arrayList.add(y1Var);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                y1 y1Var2 = (y1) arrayList.get(i10);
                l0Var.f9400a.remove(y1Var2);
                y1Var2.b(new com.google.android.gms.common.api.s(dVar));
            }
        }
    }

    public final void A() {
        Handler handler;
        handler = this.f9412x.A;
        com.google.android.gms.common.internal.s.d(handler);
        this.f9410v = null;
    }

    public final void B() {
        Handler handler;
        ca.b bVar;
        com.google.android.gms.common.internal.l0 l0Var;
        Context context;
        handler = this.f9412x.A;
        com.google.android.gms.common.internal.s.d(handler);
        if (this.f9401b.isConnected() || this.f9401b.isConnecting()) {
            return;
        }
        try {
            g gVar = this.f9412x;
            l0Var = gVar.f9361t;
            context = gVar.f9359r;
            int b10 = l0Var.b(context, this.f9401b);
            if (b10 != 0) {
                ca.b bVar2 = new ca.b(b10, null);
                Log.w("GoogleApiManager", "The service for " + this.f9401b.getClass().getName() + " is not available: " + bVar2.toString());
                E(bVar2, null);
                return;
            }
            g gVar2 = this.f9412x;
            a.f fVar = this.f9401b;
            p0 p0Var = new p0(gVar2, fVar, this.f9402c);
            if (fVar.requiresSignIn()) {
                ((m1) com.google.android.gms.common.internal.s.j(this.f9407s)).h2(p0Var);
            }
            try {
                this.f9401b.connect(p0Var);
            } catch (SecurityException e10) {
                e = e10;
                bVar = new ca.b(10);
                E(bVar, e);
            }
        } catch (IllegalStateException e11) {
            e = e11;
            bVar = new ca.b(10);
        }
    }

    public final void C(y1 y1Var) {
        Handler handler;
        handler = this.f9412x.A;
        com.google.android.gms.common.internal.s.d(handler);
        if (this.f9401b.isConnected()) {
            if (l(y1Var)) {
                i();
                return;
            } else {
                this.f9400a.add(y1Var);
                return;
            }
        }
        this.f9400a.add(y1Var);
        ca.b bVar = this.f9410v;
        if (bVar == null || !bVar.x1()) {
            B();
        } else {
            E(this.f9410v, null);
        }
    }

    public final void D() {
        this.f9411w++;
    }

    public final void E(ca.b bVar, Exception exc) {
        Handler handler;
        com.google.android.gms.common.internal.l0 l0Var;
        boolean z10;
        Status i10;
        Status i11;
        Status i12;
        Handler handler2;
        Handler handler3;
        long j10;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.f9412x.A;
        com.google.android.gms.common.internal.s.d(handler);
        m1 m1Var = this.f9407s;
        if (m1Var != null) {
            m1Var.i2();
        }
        A();
        l0Var = this.f9412x.f9361t;
        l0Var.c();
        c(bVar);
        if ((this.f9401b instanceof fa.e) && bVar.u1() != 24) {
            this.f9412x.f9356d = true;
            g gVar = this.f9412x;
            handler5 = gVar.A;
            handler6 = gVar.A;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (bVar.u1() == 4) {
            status = g.D;
            d(status);
            return;
        }
        if (this.f9400a.isEmpty()) {
            this.f9410v = bVar;
            return;
        }
        if (exc != null) {
            handler4 = this.f9412x.A;
            com.google.android.gms.common.internal.s.d(handler4);
            e(null, exc, false);
            return;
        }
        z10 = this.f9412x.B;
        if (!z10) {
            i10 = g.i(this.f9402c, bVar);
            d(i10);
            return;
        }
        i11 = g.i(this.f9402c, bVar);
        e(i11, null, true);
        if (this.f9400a.isEmpty() || m(bVar) || this.f9412x.h(bVar, this.f9406r)) {
            return;
        }
        if (bVar.u1() == 18) {
            this.f9408t = true;
        }
        if (!this.f9408t) {
            i12 = g.i(this.f9402c, bVar);
            d(i12);
            return;
        }
        g gVar2 = this.f9412x;
        handler2 = gVar2.A;
        handler3 = gVar2.A;
        Message obtain = Message.obtain(handler3, 9, this.f9402c);
        j10 = this.f9412x.f9353a;
        handler2.sendMessageDelayed(obtain, j10);
    }

    public final void F(ca.b bVar) {
        Handler handler;
        handler = this.f9412x.A;
        com.google.android.gms.common.internal.s.d(handler);
        a.f fVar = this.f9401b;
        fVar.disconnect("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(bVar));
        E(bVar, null);
    }

    public final void G(z1 z1Var) {
        Handler handler;
        handler = this.f9412x.A;
        com.google.android.gms.common.internal.s.d(handler);
        this.f9404e.add(z1Var);
    }

    public final void H() {
        Handler handler;
        handler = this.f9412x.A;
        com.google.android.gms.common.internal.s.d(handler);
        if (this.f9408t) {
            B();
        }
    }

    public final void I() {
        Handler handler;
        handler = this.f9412x.A;
        com.google.android.gms.common.internal.s.d(handler);
        d(g.C);
        this.f9403d.f();
        for (k.a aVar : (k.a[]) this.f9405f.keySet().toArray(new k.a[0])) {
            C(new x1(aVar, new TaskCompletionSource()));
        }
        c(new ca.b(4));
        if (this.f9401b.isConnected()) {
            this.f9401b.onUserSignOut(new k0(this));
        }
    }

    public final void J() {
        Handler handler;
        ca.f fVar;
        Context context;
        handler = this.f9412x.A;
        com.google.android.gms.common.internal.s.d(handler);
        if (this.f9408t) {
            k();
            g gVar = this.f9412x;
            fVar = gVar.f9360s;
            context = gVar.f9359r;
            d(fVar.g(context) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f9401b.disconnect("Timing out connection while resuming.");
        }
    }

    public final boolean L() {
        return this.f9401b.isConnected();
    }

    public final boolean M() {
        return this.f9401b.requiresSignIn();
    }

    public final boolean a() {
        return n(true);
    }

    public final int o() {
        return this.f9406r;
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void onConnected(Bundle bundle) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f9412x.A;
        if (myLooper == handler.getLooper()) {
            g();
        } else {
            handler2 = this.f9412x.A;
            handler2.post(new h0(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final void onConnectionFailed(ca.b bVar) {
        E(bVar, null);
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void onConnectionSuspended(int i10) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f9412x.A;
        if (myLooper == handler.getLooper()) {
            h(i10);
        } else {
            handler2 = this.f9412x.A;
            handler2.post(new i0(this, i10));
        }
    }

    public final int p() {
        return this.f9411w;
    }

    public final ca.b q() {
        Handler handler;
        handler = this.f9412x.A;
        com.google.android.gms.common.internal.s.d(handler);
        return this.f9410v;
    }

    public final a.f s() {
        return this.f9401b;
    }

    public final Map u() {
        return this.f9405f;
    }
}
