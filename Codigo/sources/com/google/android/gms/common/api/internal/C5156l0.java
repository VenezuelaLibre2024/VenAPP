package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.C0731a;
import ca.C1894b;
import ca.C1898d;
import ca.C1902f;
import com.google.android.gms.common.api.AbstractC5105e;
import com.google.android.gms.common.api.AbstractC5106f;
import com.google.android.gms.common.api.C5101a;
import com.google.android.gms.common.api.C5209s;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C5151k;
import com.google.android.gms.common.internal.C5256l0;
import com.google.android.gms.common.internal.C5270q;
import com.google.android.gms.common.internal.C5276s;
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
import la.C9457b;
import p102fa.C7322e;

/* renamed from: com.google.android.gms.common.api.internal.l0 */
/* loaded from: classes.dex */
public final class C5156l0 implements AbstractC5106f.a, AbstractC5106f.b {

    /* renamed from: b */
    private final C5101a.f f10515b;

    /* renamed from: c */
    private final C5115b f10516c;

    /* renamed from: d */
    private final C5116b0 f10517d;

    /* renamed from: r */
    private final int f10520r;

    /* renamed from: s */
    private final BinderC5160m1 f10521s;

    /* renamed from: t */
    private boolean f10522t;

    /* renamed from: x */
    final /* synthetic */ C5135g f10526x;

    /* renamed from: a */
    private final Queue f10514a = new LinkedList();

    /* renamed from: e */
    private final Set f10518e = new HashSet();

    /* renamed from: f */
    private final Map f10519f = new HashMap();

    /* renamed from: u */
    private final List f10523u = new ArrayList();

    /* renamed from: v */
    private C1894b f10524v = null;

    /* renamed from: w */
    private int f10525w = 0;

    public C5156l0(C5135g c5135g, AbstractC5105e abstractC5105e) {
        Handler handler;
        Context context;
        Handler handler2;
        this.f10526x = c5135g;
        handler = c5135g.f10465A;
        C5101a.f zab = abstractC5105e.zab(handler.getLooper(), this);
        this.f10515b = zab;
        this.f10516c = abstractC5105e.getApiKey();
        this.f10517d = new C5116b0();
        this.f10520r = abstractC5105e.zaa();
        if (!zab.requiresSignIn()) {
            this.f10521s = null;
            return;
        }
        context = c5135g.f10473r;
        handler2 = c5135g.f10465A;
        this.f10521s = abstractC5105e.zac(context, handler2);
    }

    /* renamed from: K */
    public static /* bridge */ /* synthetic */ boolean m13093K(C5156l0 c5156l0, boolean z10) {
        return c5156l0.m13106n(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private final C1898d m13094b(C1898d[] c1898dArr) {
        if (c1898dArr != null && c1898dArr.length != 0) {
            C1898d[] availableFeatures = this.f10515b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new C1898d[0];
            }
            C0731a c0731a = new C0731a(availableFeatures.length);
            for (C1898d c1898d : availableFeatures) {
                c0731a.put(c1898d.m10064u1(), Long.valueOf(c1898d.m10065v1()));
            }
            for (C1898d c1898d2 : c1898dArr) {
                Long l10 = (Long) c0731a.get(c1898d2.m10064u1());
                if (l10 == null || l10.longValue() < c1898d2.m10065v1()) {
                    return c1898d2;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private final void m13095c(C1894b c1894b) {
        Iterator it = this.f10518e.iterator();
        while (it.hasNext()) {
            ((C5199z1) it.next()).m13208b(this.f10516c, c1894b, C5270q.m13304b(c1894b, C1894b.f7890e) ? this.f10515b.getEndpointPackageName() : null);
        }
        this.f10518e.clear();
    }

    /* renamed from: d */
    public final void m13096d(Status status) {
        Handler handler;
        handler = this.f10526x.f10465A;
        C5276s.m13318d(handler);
        m13097e(status, null, false);
    }

    /* renamed from: e */
    private final void m13097e(Status status, Exception exc, boolean z10) {
        Handler handler;
        handler = this.f10526x.f10465A;
        C5276s.m13318d(handler);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f10514a.iterator();
        while (it.hasNext()) {
            AbstractC5196y1 abstractC5196y1 = (AbstractC5196y1) it.next();
            if (!z10 || abstractC5196y1.f10615a == 2) {
                if (status != null) {
                    abstractC5196y1.mo13166a(status);
                } else {
                    abstractC5196y1.mo13167b(exc);
                }
                it.remove();
            }
        }
    }

    /* renamed from: f */
    private final void m13098f() {
        ArrayList arrayList = new ArrayList(this.f10514a);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC5196y1 abstractC5196y1 = (AbstractC5196y1) arrayList.get(i10);
            if (!this.f10515b.isConnected()) {
                return;
            }
            if (m13104l(abstractC5196y1)) {
                this.f10514a.remove(abstractC5196y1);
            }
        }
    }

    /* renamed from: g */
    public final void m13099g() {
        m13114A();
        m13095c(C1894b.f7890e);
        m13103k();
        Iterator it = this.f10519f.values().iterator();
        while (it.hasNext()) {
            C5117b1 c5117b1 = (C5117b1) it.next();
            if (m13094b(c5117b1.f10436a.m13147c()) == null) {
                try {
                    c5117b1.f10436a.mo13024d(this.f10515b, new TaskCompletionSource<>());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.f10515b.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                }
            }
            it.remove();
        }
        m13098f();
        m13101i();
    }

    /* renamed from: h */
    public final void m13100h(int i10) {
        Handler handler;
        Handler handler2;
        long j10;
        Handler handler3;
        Handler handler4;
        long j11;
        C5256l0 c5256l0;
        m13114A();
        this.f10522t = true;
        this.f10517d.m13006e(i10, this.f10515b.getLastDisconnectMessage());
        C5135g c5135g = this.f10526x;
        handler = c5135g.f10465A;
        handler2 = c5135g.f10465A;
        Message obtain = Message.obtain(handler2, 9, this.f10516c);
        j10 = this.f10526x.f10467a;
        handler.sendMessageDelayed(obtain, j10);
        C5135g c5135g2 = this.f10526x;
        handler3 = c5135g2.f10465A;
        handler4 = c5135g2.f10465A;
        Message obtain2 = Message.obtain(handler4, 11, this.f10516c);
        j11 = this.f10526x.f10468b;
        handler3.sendMessageDelayed(obtain2, j11);
        c5256l0 = this.f10526x.f10475t;
        c5256l0.m13298c();
        Iterator it = this.f10519f.values().iterator();
        while (it.hasNext()) {
            ((C5117b1) it.next()).f10438c.run();
        }
    }

    /* renamed from: i */
    private final void m13101i() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j10;
        handler = this.f10526x.f10465A;
        handler.removeMessages(12, this.f10516c);
        C5135g c5135g = this.f10526x;
        handler2 = c5135g.f10465A;
        handler3 = c5135g.f10465A;
        Message obtainMessage = handler3.obtainMessage(12, this.f10516c);
        j10 = this.f10526x.f10469c;
        handler2.sendMessageDelayed(obtainMessage, j10);
    }

    /* renamed from: j */
    private final void m13102j(AbstractC5196y1 abstractC5196y1) {
        abstractC5196y1.mo13189d(this.f10517d, m13125M());
        try {
            abstractC5196y1.mo13168c(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.f10515b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    /* renamed from: k */
    private final void m13103k() {
        Handler handler;
        Handler handler2;
        if (this.f10522t) {
            handler = this.f10526x.f10465A;
            handler.removeMessages(11, this.f10516c);
            handler2 = this.f10526x.f10465A;
            handler2.removeMessages(9, this.f10516c);
            this.f10522t = false;
        }
    }

    /* renamed from: l */
    private final boolean m13104l(AbstractC5196y1 abstractC5196y1) {
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
        if (!(abstractC5196y1 instanceof AbstractC5183u0)) {
            m13102j(abstractC5196y1);
            return true;
        }
        AbstractC5183u0 abstractC5183u0 = (AbstractC5183u0) abstractC5196y1;
        C1898d m13094b = m13094b(abstractC5183u0.mo13188g(this));
        if (m13094b == null) {
            m13102j(abstractC5196y1);
            return true;
        }
        Log.w("GoogleApiManager", this.f10515b.getClass().getName() + " could not execute call because it requires feature (" + m13094b.m10064u1() + ", " + m13094b.m10065v1() + ").");
        z10 = this.f10526x.f10466B;
        if (!z10 || !abstractC5183u0.mo13187f(this)) {
            abstractC5183u0.mo13167b(new C5209s(m13094b));
            return true;
        }
        C5162n0 c5162n0 = new C5162n0(this.f10516c, m13094b, null);
        int indexOf = this.f10523u.indexOf(c5162n0);
        if (indexOf >= 0) {
            C5162n0 c5162n02 = (C5162n0) this.f10523u.get(indexOf);
            handler5 = this.f10526x.f10465A;
            handler5.removeMessages(15, c5162n02);
            C5135g c5135g = this.f10526x;
            handler6 = c5135g.f10465A;
            handler7 = c5135g.f10465A;
            Message obtain = Message.obtain(handler7, 15, c5162n02);
            j12 = this.f10526x.f10467a;
            handler6.sendMessageDelayed(obtain, j12);
            return false;
        }
        this.f10523u.add(c5162n0);
        C5135g c5135g2 = this.f10526x;
        handler = c5135g2.f10465A;
        handler2 = c5135g2.f10465A;
        Message obtain2 = Message.obtain(handler2, 15, c5162n0);
        j10 = this.f10526x.f10467a;
        handler.sendMessageDelayed(obtain2, j10);
        C5135g c5135g3 = this.f10526x;
        handler3 = c5135g3.f10465A;
        handler4 = c5135g3.f10465A;
        Message obtain3 = Message.obtain(handler4, 16, c5162n0);
        j11 = this.f10526x.f10468b;
        handler3.sendMessageDelayed(obtain3, j11);
        C1894b c1894b = new C1894b(2, null);
        if (m13105m(c1894b)) {
            return false;
        }
        this.f10526x.m13066h(c1894b, this.f10520r);
        return false;
    }

    /* renamed from: m */
    private final boolean m13105m(C1894b c1894b) {
        Object obj;
        C5120c0 c5120c0;
        Set set;
        C5120c0 c5120c02;
        obj = C5135g.f10463E;
        synchronized (obj) {
            C5135g c5135g = this.f10526x;
            c5120c0 = c5135g.f10479x;
            if (c5120c0 != null) {
                set = c5135g.f10480y;
                if (set.contains(this.f10516c)) {
                    c5120c02 = this.f10526x.f10479x;
                    c5120c02.m13030h(c1894b, this.f10520r);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: n */
    public final boolean m13106n(boolean z10) {
        Handler handler;
        handler = this.f10526x.f10465A;
        C5276s.m13318d(handler);
        if (!this.f10515b.isConnected() || this.f10519f.size() != 0) {
            return false;
        }
        if (!this.f10517d.m13008g()) {
            this.f10515b.disconnect("Timing out service connection.");
            return true;
        }
        if (z10) {
            m13101i();
        }
        return false;
    }

    /* renamed from: t */
    public static /* bridge */ /* synthetic */ C5115b m13108t(C5156l0 c5156l0) {
        return c5156l0.f10516c;
    }

    /* renamed from: v */
    public static /* bridge */ /* synthetic */ void m13109v(C5156l0 c5156l0, Status status) {
        c5156l0.m13096d(status);
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ void m13112y(C5156l0 c5156l0, C5162n0 c5162n0) {
        if (c5156l0.f10523u.contains(c5162n0) && !c5156l0.f10522t) {
            if (c5156l0.f10515b.isConnected()) {
                c5156l0.m13098f();
            } else {
                c5156l0.m13115B();
            }
        }
    }

    /* renamed from: z */
    public static /* bridge */ /* synthetic */ void m13113z(C5156l0 c5156l0, C5162n0 c5162n0) {
        Handler handler;
        Handler handler2;
        C1898d c1898d;
        C1898d[] mo13188g;
        if (c5156l0.f10523u.remove(c5162n0)) {
            handler = c5156l0.f10526x.f10465A;
            handler.removeMessages(15, c5162n0);
            handler2 = c5156l0.f10526x.f10465A;
            handler2.removeMessages(16, c5162n0);
            c1898d = c5162n0.f10547b;
            ArrayList arrayList = new ArrayList(c5156l0.f10514a.size());
            for (AbstractC5196y1 abstractC5196y1 : c5156l0.f10514a) {
                if ((abstractC5196y1 instanceof AbstractC5183u0) && (mo13188g = ((AbstractC5183u0) abstractC5196y1).mo13188g(c5156l0)) != null && C9457b.m28116b(mo13188g, c1898d)) {
                    arrayList.add(abstractC5196y1);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC5196y1 abstractC5196y12 = (AbstractC5196y1) arrayList.get(i10);
                c5156l0.f10514a.remove(abstractC5196y12);
                abstractC5196y12.mo13167b(new C5209s(c1898d));
            }
        }
    }

    /* renamed from: A */
    public final void m13114A() {
        Handler handler;
        handler = this.f10526x.f10465A;
        C5276s.m13318d(handler);
        this.f10524v = null;
    }

    /* renamed from: B */
    public final void m13115B() {
        Handler handler;
        C1894b c1894b;
        C5256l0 c5256l0;
        Context context;
        handler = this.f10526x.f10465A;
        C5276s.m13318d(handler);
        if (this.f10515b.isConnected() || this.f10515b.isConnecting()) {
            return;
        }
        try {
            C5135g c5135g = this.f10526x;
            c5256l0 = c5135g.f10475t;
            context = c5135g.f10473r;
            int m13297b = c5256l0.m13297b(context, this.f10515b);
            if (m13297b != 0) {
                C1894b c1894b2 = new C1894b(m13297b, null);
                Log.w("GoogleApiManager", "The service for " + this.f10515b.getClass().getName() + " is not available: " + c1894b2.toString());
                m13118E(c1894b2, null);
                return;
            }
            C5135g c5135g2 = this.f10526x;
            C5101a.f fVar = this.f10515b;
            C5168p0 c5168p0 = new C5168p0(c5135g2, fVar, this.f10516c);
            if (fVar.requiresSignIn()) {
                ((BinderC5160m1) C5276s.m13324j(this.f10521s)).m13140h2(c5168p0);
            }
            try {
                this.f10515b.connect(c5168p0);
            } catch (SecurityException e10) {
                e = e10;
                c1894b = new C1894b(10);
                m13118E(c1894b, e);
            }
        } catch (IllegalStateException e11) {
            e = e11;
            c1894b = new C1894b(10);
        }
    }

    /* renamed from: C */
    public final void m13116C(AbstractC5196y1 abstractC5196y1) {
        Handler handler;
        handler = this.f10526x.f10465A;
        C5276s.m13318d(handler);
        if (this.f10515b.isConnected()) {
            if (m13104l(abstractC5196y1)) {
                m13101i();
                return;
            } else {
                this.f10514a.add(abstractC5196y1);
                return;
            }
        }
        this.f10514a.add(abstractC5196y1);
        C1894b c1894b = this.f10524v;
        if (c1894b == null || !c1894b.m10053x1()) {
            m13115B();
        } else {
            m13118E(this.f10524v, null);
        }
    }

    /* renamed from: D */
    public final void m13117D() {
        this.f10525w++;
    }

    /* renamed from: E */
    public final void m13118E(C1894b c1894b, Exception exc) {
        Handler handler;
        C5256l0 c5256l0;
        boolean z10;
        Status m13038i;
        Status m13038i2;
        Status m13038i3;
        Handler handler2;
        Handler handler3;
        long j10;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.f10526x.f10465A;
        C5276s.m13318d(handler);
        BinderC5160m1 binderC5160m1 = this.f10521s;
        if (binderC5160m1 != null) {
            binderC5160m1.m13141i2();
        }
        m13114A();
        c5256l0 = this.f10526x.f10475t;
        c5256l0.m13298c();
        m13095c(c1894b);
        if ((this.f10515b instanceof C7322e) && c1894b.m10050u1() != 24) {
            this.f10526x.f10470d = true;
            C5135g c5135g = this.f10526x;
            handler5 = c5135g.f10465A;
            handler6 = c5135g.f10465A;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (c1894b.m10050u1() == 4) {
            status = C5135g.f10462D;
            m13096d(status);
            return;
        }
        if (this.f10514a.isEmpty()) {
            this.f10524v = c1894b;
            return;
        }
        if (exc != null) {
            handler4 = this.f10526x.f10465A;
            C5276s.m13318d(handler4);
            m13097e(null, exc, false);
            return;
        }
        z10 = this.f10526x.f10466B;
        if (!z10) {
            m13038i = C5135g.m13038i(this.f10516c, c1894b);
            m13096d(m13038i);
            return;
        }
        m13038i2 = C5135g.m13038i(this.f10516c, c1894b);
        m13097e(m13038i2, null, true);
        if (this.f10514a.isEmpty() || m13105m(c1894b) || this.f10526x.m13066h(c1894b, this.f10520r)) {
            return;
        }
        if (c1894b.m10050u1() == 18) {
            this.f10522t = true;
        }
        if (!this.f10522t) {
            m13038i3 = C5135g.m13038i(this.f10516c, c1894b);
            m13096d(m13038i3);
            return;
        }
        C5135g c5135g2 = this.f10526x;
        handler2 = c5135g2.f10465A;
        handler3 = c5135g2.f10465A;
        Message obtain = Message.obtain(handler3, 9, this.f10516c);
        j10 = this.f10526x.f10467a;
        handler2.sendMessageDelayed(obtain, j10);
    }

    /* renamed from: F */
    public final void m13119F(C1894b c1894b) {
        Handler handler;
        handler = this.f10526x.f10465A;
        C5276s.m13318d(handler);
        C5101a.f fVar = this.f10515b;
        fVar.disconnect("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(c1894b));
        m13118E(c1894b, null);
    }

    /* renamed from: G */
    public final void m13120G(C5199z1 c5199z1) {
        Handler handler;
        handler = this.f10526x.f10465A;
        C5276s.m13318d(handler);
        this.f10518e.add(c5199z1);
    }

    /* renamed from: H */
    public final void m13121H() {
        Handler handler;
        handler = this.f10526x.f10465A;
        C5276s.m13318d(handler);
        if (this.f10522t) {
            m13115B();
        }
    }

    /* renamed from: I */
    public final void m13122I() {
        Handler handler;
        handler = this.f10526x.f10465A;
        C5276s.m13318d(handler);
        m13096d(C5135g.f10461C);
        this.f10517d.m13007f();
        for (C5151k.a aVar : (C5151k.a[]) this.f10519f.keySet().toArray(new C5151k.a[0])) {
            m13116C(new C5193x1(aVar, new TaskCompletionSource()));
        }
        m13095c(new C1894b(4));
        if (this.f10515b.isConnected()) {
            this.f10515b.onUserSignOut(new C5152k0(this));
        }
    }

    /* renamed from: J */
    public final void m13123J() {
        Handler handler;
        C1902f c1902f;
        Context context;
        handler = this.f10526x.f10465A;
        C5276s.m13318d(handler);
        if (this.f10522t) {
            m13103k();
            C5135g c5135g = this.f10526x;
            c1902f = c5135g.f10474s;
            context = c5135g.f10473r;
            m13096d(c1902f.mo10071g(context) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f10515b.disconnect("Timing out connection while resuming.");
        }
    }

    /* renamed from: L */
    public final boolean m13124L() {
        return this.f10515b.isConnected();
    }

    /* renamed from: M */
    public final boolean m13125M() {
        return this.f10515b.requiresSignIn();
    }

    /* renamed from: a */
    public final boolean m13126a() {
        return m13106n(true);
    }

    /* renamed from: o */
    public final int m13127o() {
        return this.f10520r;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC5131f
    public final void onConnected(Bundle bundle) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f10526x.f10465A;
        if (myLooper == handler.getLooper()) {
            m13099g();
        } else {
            handler2 = this.f10526x.f10465A;
            handler2.post(new RunnableC5140h0(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC5161n
    public final void onConnectionFailed(C1894b c1894b) {
        m13118E(c1894b, null);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC5131f
    public final void onConnectionSuspended(int i10) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f10526x.f10465A;
        if (myLooper == handler.getLooper()) {
            m13100h(i10);
        } else {
            handler2 = this.f10526x.f10465A;
            handler2.post(new RunnableC5144i0(this, i10));
        }
    }

    /* renamed from: p */
    public final int m13128p() {
        return this.f10525w;
    }

    /* renamed from: q */
    public final C1894b m13129q() {
        Handler handler;
        handler = this.f10526x.f10465A;
        C5276s.m13318d(handler);
        return this.f10524v;
    }

    /* renamed from: s */
    public final C5101a.f m13130s() {
        return this.f10515b;
    }

    /* renamed from: u */
    public final Map m13131u() {
        return this.f10519f;
    }
}
