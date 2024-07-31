package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.collection.C0732b;
import ca.C1894b;
import ca.C1902f;
import com.google.android.gms.common.api.AbstractC5105e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C5151k;
import com.google.android.gms.common.internal.AbstractC5246i;
import com.google.android.gms.common.internal.C5256l0;
import com.google.android.gms.common.internal.C5267p;
import com.google.android.gms.common.internal.C5279t;
import com.google.android.gms.common.internal.C5282u;
import com.google.android.gms.common.internal.C5288w;
import com.google.android.gms.common.internal.C5291x;
import com.google.android.gms.common.internal.InterfaceC5294y;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import la.C9465j;

/* renamed from: com.google.android.gms.common.api.internal.g */
/* loaded from: classes.dex */
public class C5135g implements Handler.Callback {

    /* renamed from: C */
    public static final Status f10461C = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: D */
    private static final Status f10462D = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: E */
    private static final Object f10463E = new Object();

    /* renamed from: F */
    private static C5135g f10464F;

    /* renamed from: A */
    private final Handler f10465A;

    /* renamed from: B */
    private volatile boolean f10466B;

    /* renamed from: e */
    private C5288w f10471e;

    /* renamed from: f */
    private InterfaceC5294y f10472f;

    /* renamed from: r */
    private final Context f10473r;

    /* renamed from: s */
    private final C1902f f10474s;

    /* renamed from: t */
    private final C5256l0 f10475t;

    /* renamed from: a */
    private long f10467a = 5000;

    /* renamed from: b */
    private long f10468b = 120000;

    /* renamed from: c */
    private long f10469c = 10000;

    /* renamed from: d */
    private boolean f10470d = false;

    /* renamed from: u */
    private final AtomicInteger f10476u = new AtomicInteger(1);

    /* renamed from: v */
    private final AtomicInteger f10477v = new AtomicInteger(0);

    /* renamed from: w */
    private final Map f10478w = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: x */
    private C5120c0 f10479x = null;

    /* renamed from: y */
    private final Set f10480y = new C0732b();

    /* renamed from: z */
    private final Set f10481z = new C0732b();

    private C5135g(Context context, Looper looper, C1902f c1902f) {
        this.f10466B = true;
        this.f10473r = context;
        zau zauVar = new zau(looper, this);
        this.f10465A = zauVar;
        this.f10474s = c1902f;
        this.f10475t = new C5256l0(c1902f);
        if (C9465j.m28143a(context)) {
            this.f10466B = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    /* renamed from: a */
    public static void m13036a() {
        synchronized (f10463E) {
            C5135g c5135g = f10464F;
            if (c5135g != null) {
                c5135g.f10477v.incrementAndGet();
                Handler handler = c5135g.f10465A;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static Status m13038i(C5115b c5115b, C1894b c1894b) {
        return new Status(c1894b, "API: " + c5115b.m13000b() + " is not available on this device. Connection failed with: " + String.valueOf(c1894b));
    }

    /* renamed from: j */
    private final C5156l0 m13039j(AbstractC5105e abstractC5105e) {
        C5115b apiKey = abstractC5105e.getApiKey();
        C5156l0 c5156l0 = (C5156l0) this.f10478w.get(apiKey);
        if (c5156l0 == null) {
            c5156l0 = new C5156l0(this, abstractC5105e);
            this.f10478w.put(apiKey, c5156l0);
        }
        if (c5156l0.m13125M()) {
            this.f10481z.add(apiKey);
        }
        c5156l0.m13115B();
        return c5156l0;
    }

    /* renamed from: k */
    private final InterfaceC5294y m13040k() {
        if (this.f10472f == null) {
            this.f10472f = C5291x.m13360a(this.f10473r);
        }
        return this.f10472f;
    }

    /* renamed from: l */
    private final void m13041l() {
        C5288w c5288w = this.f10471e;
        if (c5288w != null) {
            if (c5288w.m13357u1() > 0 || m13065g()) {
                m13040k().mo13365a(c5288w);
            }
            this.f10471e = null;
        }
    }

    /* renamed from: m */
    private final void m13042m(TaskCompletionSource taskCompletionSource, int i10, AbstractC5105e abstractC5105e) {
        C5189w0 m13200a;
        if (i10 == 0 || (m13200a = C5189w0.m13200a(this, i10, abstractC5105e.getApiKey())) == null) {
            return;
        }
        Task task = taskCompletionSource.getTask();
        final Handler handler = this.f10465A;
        handler.getClass();
        task.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.f0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, m13200a);
    }

    /* renamed from: y */
    public static C5135g m13052y(Context context) {
        C5135g c5135g;
        synchronized (f10463E) {
            if (f10464F == null) {
                f10464F = new C5135g(context.getApplicationContext(), AbstractC5246i.m13272d().getLooper(), C1902f.m10067n());
            }
            c5135g = f10464F;
        }
        return c5135g;
    }

    /* renamed from: A */
    public final Task m13054A(AbstractC5105e abstractC5105e) {
        C5124d0 c5124d0 = new C5124d0(abstractC5105e.getApiKey());
        Handler handler = this.f10465A;
        handler.sendMessage(handler.obtainMessage(14, c5124d0));
        return c5124d0.m13023b().getTask();
    }

    /* renamed from: B */
    public final Task m13055B(AbstractC5105e abstractC5105e, AbstractC5167p abstractC5167p, AbstractC5194y abstractC5194y, Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m13042m(taskCompletionSource, abstractC5167p.m13148e(), abstractC5105e);
        C5187v1 c5187v1 = new C5187v1(new C5117b1(abstractC5167p, abstractC5194y, runnable), taskCompletionSource);
        Handler handler = this.f10465A;
        handler.sendMessage(handler.obtainMessage(8, new C5113a1(c5187v1, this.f10477v.get(), abstractC5105e)));
        return taskCompletionSource.getTask();
    }

    /* renamed from: C */
    public final Task m13056C(AbstractC5105e abstractC5105e, C5151k.a aVar, int i10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m13042m(taskCompletionSource, i10, abstractC5105e);
        C5193x1 c5193x1 = new C5193x1(aVar, taskCompletionSource);
        Handler handler = this.f10465A;
        handler.sendMessage(handler.obtainMessage(13, new C5113a1(c5193x1, this.f10477v.get(), abstractC5105e)));
        return taskCompletionSource.getTask();
    }

    /* renamed from: H */
    public final void m13057H(AbstractC5105e abstractC5105e, int i10, AbstractC5123d abstractC5123d) {
        C5184u1 c5184u1 = new C5184u1(i10, abstractC5123d);
        Handler handler = this.f10465A;
        handler.sendMessage(handler.obtainMessage(4, new C5113a1(c5184u1, this.f10477v.get(), abstractC5105e)));
    }

    /* renamed from: I */
    public final void m13058I(AbstractC5105e abstractC5105e, int i10, AbstractC5188w abstractC5188w, TaskCompletionSource taskCompletionSource, InterfaceC5182u interfaceC5182u) {
        m13042m(taskCompletionSource, abstractC5188w.m13192d(), abstractC5105e);
        C5190w1 c5190w1 = new C5190w1(i10, abstractC5188w, taskCompletionSource, interfaceC5182u);
        Handler handler = this.f10465A;
        handler.sendMessage(handler.obtainMessage(4, new C5113a1(c5190w1, this.f10477v.get(), abstractC5105e)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public final void m13059J(C5267p c5267p, int i10, long j10, int i11) {
        Handler handler = this.f10465A;
        handler.sendMessage(handler.obtainMessage(18, new C5192x0(c5267p, i10, j10, i11)));
    }

    /* renamed from: K */
    public final void m13060K(C1894b c1894b, int i10) {
        if (m13066h(c1894b, i10)) {
            return;
        }
        Handler handler = this.f10465A;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, c1894b));
    }

    /* renamed from: b */
    public final void m13061b() {
        Handler handler = this.f10465A;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: c */
    public final void m13062c(AbstractC5105e abstractC5105e) {
        Handler handler = this.f10465A;
        handler.sendMessage(handler.obtainMessage(7, abstractC5105e));
    }

    /* renamed from: d */
    public final void m13063d(C5120c0 c5120c0) {
        synchronized (f10463E) {
            if (this.f10479x != c5120c0) {
                this.f10479x = c5120c0;
                this.f10480y.clear();
            }
            this.f10480y.addAll(c5120c0.m13021i());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m13064e(C5120c0 c5120c0) {
        synchronized (f10463E) {
            if (this.f10479x == c5120c0) {
                this.f10479x = null;
                this.f10480y.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean m13065g() {
        if (this.f10470d) {
            return false;
        }
        C5282u m13342a = C5279t.m13341b().m13342a();
        if (m13342a != null && !m13342a.m13346w1()) {
            return false;
        }
        int m13296a = this.f10475t.m13296a(this.f10473r, 203400000);
        return m13296a == -1 || m13296a == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean m13066h(C1894b c1894b, int i10) {
        return this.f10474s.m10085x(this.f10473r, c1894b, i10);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        TaskCompletionSource m13023b;
        Boolean valueOf;
        C5115b c5115b;
        C5115b c5115b2;
        C5115b c5115b3;
        C5115b c5115b4;
        int i10 = message.what;
        C5156l0 c5156l0 = null;
        switch (i10) {
            case 1:
                this.f10469c = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f10465A.removeMessages(12);
                for (C5115b c5115b5 : this.f10478w.keySet()) {
                    Handler handler = this.f10465A;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c5115b5), this.f10469c);
                }
                return true;
            case 2:
                C5199z1 c5199z1 = (C5199z1) message.obj;
                Iterator it = c5199z1.m13207a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C5115b c5115b6 = (C5115b) it.next();
                        C5156l0 c5156l02 = (C5156l0) this.f10478w.get(c5115b6);
                        if (c5156l02 == null) {
                            c5199z1.m13208b(c5115b6, new C1894b(13), null);
                        } else if (c5156l02.m13124L()) {
                            c5199z1.m13208b(c5115b6, C1894b.f7890e, c5156l02.m13130s().getEndpointPackageName());
                        } else {
                            C1894b m13129q = c5156l02.m13129q();
                            if (m13129q != null) {
                                c5199z1.m13208b(c5115b6, m13129q, null);
                            } else {
                                c5156l02.m13120G(c5199z1);
                                c5156l02.m13115B();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (C5156l0 c5156l03 : this.f10478w.values()) {
                    c5156l03.m13114A();
                    c5156l03.m13115B();
                }
                return true;
            case 4:
            case 8:
            case 13:
                C5113a1 c5113a1 = (C5113a1) message.obj;
                C5156l0 c5156l04 = (C5156l0) this.f10478w.get(c5113a1.f10427c.getApiKey());
                if (c5156l04 == null) {
                    c5156l04 = m13039j(c5113a1.f10427c);
                }
                if (!c5156l04.m13125M() || this.f10477v.get() == c5113a1.f10426b) {
                    c5156l04.m13116C(c5113a1.f10425a);
                } else {
                    c5113a1.f10425a.mo13166a(f10461C);
                    c5156l04.m13122I();
                }
                return true;
            case 5:
                int i11 = message.arg1;
                C1894b c1894b = (C1894b) message.obj;
                Iterator it2 = this.f10478w.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C5156l0 c5156l05 = (C5156l0) it2.next();
                        if (c5156l05.m13127o() == i11) {
                            c5156l0 = c5156l05;
                        }
                    }
                }
                if (c5156l0 == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                } else if (c1894b.m10050u1() == 13) {
                    C5156l0.m13109v(c5156l0, new Status(17, "Error resolution was canceled by the user, original error message: " + this.f10474s.mo10070e(c1894b.m10050u1()) + ": " + c1894b.m10051v1()));
                } else {
                    C5156l0.m13109v(c5156l0, m13038i(C5156l0.m13108t(c5156l0), c1894b));
                }
                return true;
            case 6:
                if (this.f10473r.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C5119c.m13011c((Application) this.f10473r.getApplicationContext());
                    ComponentCallbacks2C5119c.m13010b().m13013a(new C5136g0(this));
                    if (!ComponentCallbacks2C5119c.m13010b().m13015e(true)) {
                        this.f10469c = 300000L;
                    }
                }
                return true;
            case 7:
                m13039j((AbstractC5105e) message.obj);
                return true;
            case 9:
                if (this.f10478w.containsKey(message.obj)) {
                    ((C5156l0) this.f10478w.get(message.obj)).m13121H();
                }
                return true;
            case 10:
                Iterator it3 = this.f10481z.iterator();
                while (it3.hasNext()) {
                    C5156l0 c5156l06 = (C5156l0) this.f10478w.remove((C5115b) it3.next());
                    if (c5156l06 != null) {
                        c5156l06.m13122I();
                    }
                }
                this.f10481z.clear();
                return true;
            case 11:
                if (this.f10478w.containsKey(message.obj)) {
                    ((C5156l0) this.f10478w.get(message.obj)).m13123J();
                }
                return true;
            case 12:
                if (this.f10478w.containsKey(message.obj)) {
                    ((C5156l0) this.f10478w.get(message.obj)).m13126a();
                }
                return true;
            case 14:
                C5124d0 c5124d0 = (C5124d0) message.obj;
                C5115b m13022a = c5124d0.m13022a();
                if (this.f10478w.containsKey(m13022a)) {
                    boolean m13093K = C5156l0.m13093K((C5156l0) this.f10478w.get(m13022a), false);
                    m13023b = c5124d0.m13023b();
                    valueOf = Boolean.valueOf(m13093K);
                } else {
                    m13023b = c5124d0.m13023b();
                    valueOf = Boolean.FALSE;
                }
                m13023b.setResult(valueOf);
                return true;
            case 15:
                C5162n0 c5162n0 = (C5162n0) message.obj;
                Map map = this.f10478w;
                c5115b = c5162n0.f10546a;
                if (map.containsKey(c5115b)) {
                    Map map2 = this.f10478w;
                    c5115b2 = c5162n0.f10546a;
                    C5156l0.m13112y((C5156l0) map2.get(c5115b2), c5162n0);
                }
                return true;
            case 16:
                C5162n0 c5162n02 = (C5162n0) message.obj;
                Map map3 = this.f10478w;
                c5115b3 = c5162n02.f10546a;
                if (map3.containsKey(c5115b3)) {
                    Map map4 = this.f10478w;
                    c5115b4 = c5162n02.f10546a;
                    C5156l0.m13113z((C5156l0) map4.get(c5115b4), c5162n02);
                }
                return true;
            case 17:
                m13041l();
                return true;
            case 18:
                C5192x0 c5192x0 = (C5192x0) message.obj;
                if (c5192x0.f10610c == 0) {
                    m13040k().mo13365a(new C5288w(c5192x0.f10609b, Arrays.asList(c5192x0.f10608a)));
                } else {
                    C5288w c5288w = this.f10471e;
                    if (c5288w != null) {
                        List m13358v1 = c5288w.m13358v1();
                        if (c5288w.m13357u1() != c5192x0.f10609b || (m13358v1 != null && m13358v1.size() >= c5192x0.f10611d)) {
                            this.f10465A.removeMessages(17);
                            m13041l();
                        } else {
                            this.f10471e.m13359w1(c5192x0.f10608a);
                        }
                    }
                    if (this.f10471e == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c5192x0.f10608a);
                        this.f10471e = new C5288w(c5192x0.f10609b, arrayList);
                        Handler handler2 = this.f10465A;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), c5192x0.f10610c);
                    }
                }
                return true;
            case 19:
                this.f10470d = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
    }

    /* renamed from: n */
    public final int m13067n() {
        return this.f10476u.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final C5156l0 m13068x(C5115b c5115b) {
        return (C5156l0) this.f10478w.get(c5115b);
    }
}
