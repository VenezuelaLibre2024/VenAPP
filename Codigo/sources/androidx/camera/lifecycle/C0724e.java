package androidx.camera.lifecycle;

import android.content.Context;
import androidx.camera.core.AbstractC0718w;
import androidx.camera.core.impl.C0700y0;
import androidx.camera.core.impl.InterfaceC0606c0;
import androidx.camera.core.impl.InterfaceC0669u;
import androidx.camera.core.impl.utils.C0678g;
import androidx.camera.core.impl.utils.C0688q;
import androidx.concurrent.futures.C0742c;
import androidx.core.util.C0984h;
import androidx.lifecycle.InterfaceC1310k;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p002a0.C0007d;
import p002a0.C0009f;
import p002a0.InterfaceC0004a;
import p002a0.InterfaceC0006c;
import p018b0.C1597e;
import p227m.InterfaceC9531a;
import p407w.AbstractC12019k;
import p407w.C12018j1;
import p407w.C12030p;
import p407w.C12042v;
import p407w.C12044w;
import p407w.InterfaceC12013i;
import p407w.InterfaceC12026n;
import p407w.InterfaceC12028o;
import p474z.C12747a;

/* renamed from: androidx.camera.lifecycle.e */
/* loaded from: classes.dex */
public final class C0724e {

    /* renamed from: h */
    private static final C0724e f3141h = new C0724e();

    /* renamed from: c */
    private InterfaceFutureC5920f<C12042v> f3144c;

    /* renamed from: f */
    private C12042v f3147f;

    /* renamed from: g */
    private Context f3148g;

    /* renamed from: a */
    private final Object f3142a = new Object();

    /* renamed from: b */
    private C12044w.b f3143b = null;

    /* renamed from: d */
    private InterfaceFutureC5920f<Void> f3145d = C0009f.m22h(null);

    /* renamed from: e */
    private final LifecycleCameraRepository f3146e = new LifecycleCameraRepository();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.lifecycle.e$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC0006c<Void> {

        /* renamed from: a */
        final /* synthetic */ C0742c.a f3149a;

        /* renamed from: b */
        final /* synthetic */ C12042v f3150b;

        a(C0742c.a aVar, C12042v c12042v) {
            this.f3149a = aVar;
            this.f3150b = c12042v;
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: a */
        public void mo8a(Throwable th2) {
            this.f3149a.m3758f(th2);
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            this.f3149a.m3756c(this.f3150b);
        }
    }

    private C0724e() {
    }

    /* renamed from: g */
    private int m3602g() {
        C12042v c12042v = this.f3147f;
        if (c12042v == null) {
            return 0;
        }
        return c12042v.m38678e().mo2802d().mo35289b();
    }

    /* renamed from: h */
    public static InterfaceFutureC5920f<C0724e> m3603h(final Context context) {
        C0984h.m4833k(context);
        return C0009f.m29o(f3141h.m3604i(context), new InterfaceC9531a() { // from class: androidx.camera.lifecycle.b
            @Override // p227m.InterfaceC9531a
            public final Object apply(Object obj) {
                C0724e m3605j;
                m3605j = C0724e.m3605j(context, (C12042v) obj);
                return m3605j;
            }
        }, C12747a.m42280a());
    }

    /* renamed from: i */
    private InterfaceFutureC5920f<C12042v> m3604i(Context context) {
        synchronized (this.f3142a) {
            InterfaceFutureC5920f<C12042v> interfaceFutureC5920f = this.f3144c;
            if (interfaceFutureC5920f != null) {
                return interfaceFutureC5920f;
            }
            final C12042v c12042v = new C12042v(context, this.f3143b);
            InterfaceFutureC5920f<C12042v> m3752a = C0742c.m3752a(new C0742c.c() { // from class: androidx.camera.lifecycle.c
                @Override // androidx.concurrent.futures.C0742c.c
                /* renamed from: a */
                public final Object mo14a(C0742c.a aVar) {
                    Object m3607l;
                    m3607l = C0724e.this.m3607l(c12042v, aVar);
                    return m3607l;
                }
            });
            this.f3144c = m3752a;
            return m3752a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ C0724e m3605j(Context context, C12042v c12042v) {
        C0724e c0724e = f3141h;
        c0724e.m3609n(c12042v);
        c0724e.m3610o(C0678g.m3263a(context));
        return c0724e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Object m3607l(final C12042v c12042v, C0742c.a aVar) {
        synchronized (this.f3142a) {
            C0009f.m16b(C0007d.m9a(this.f3145d).m13e(new InterfaceC0004a() { // from class: androidx.camera.lifecycle.d
                @Override // p002a0.InterfaceC0004a
                public final InterfaceFutureC5920f apply(Object obj) {
                    InterfaceFutureC5920f m38681i;
                    m38681i = C12042v.this.m38681i();
                    return m38681i;
                }
            }, C12747a.m42280a()), new a(aVar, c12042v), C12747a.m42280a());
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    /* renamed from: m */
    private void m3608m(int i10) {
        C12042v c12042v = this.f3147f;
        if (c12042v == null) {
            return;
        }
        c12042v.m38678e().mo2802d().mo35290c(i10);
    }

    /* renamed from: n */
    private void m3609n(C12042v c12042v) {
        this.f3147f = c12042v;
    }

    /* renamed from: o */
    private void m3610o(Context context) {
        this.f3148g = context;
    }

    /* renamed from: d */
    InterfaceC12013i m3611d(InterfaceC1310k interfaceC1310k, C12030p c12030p, C12018j1 c12018j1, List<AbstractC12019k> list, AbstractC0718w... abstractC0718wArr) {
        InterfaceC0669u interfaceC0669u;
        InterfaceC0669u mo3360c;
        C0688q.m3339a();
        C12030p.a m38655c = C12030p.a.m38655c(c12030p);
        int length = abstractC0718wArr.length;
        int i10 = 0;
        while (true) {
            interfaceC0669u = null;
            if (i10 >= length) {
                break;
            }
            C12030p m3139F = abstractC0718wArr[i10].m3556i().m3139F(null);
            if (m3139F != null) {
                Iterator<InterfaceC12026n> it = m3139F.m38652c().iterator();
                while (it.hasNext()) {
                    m38655c.m38656a(it.next());
                }
            }
            i10++;
        }
        LinkedHashSet<InterfaceC0606c0> m38650a = m38655c.m38657b().m38650a(this.f3147f.m38679f().m3037a());
        if (m38650a.isEmpty()) {
            throw new IllegalArgumentException("Provided camera selector unable to resolve a camera for the given use case");
        }
        LifecycleCamera m3589c = this.f3146e.m3589c(interfaceC1310k, C1597e.m8883x(m38650a));
        Collection<LifecycleCamera> m3590e = this.f3146e.m3590e();
        for (AbstractC0718w abstractC0718w : abstractC0718wArr) {
            for (LifecycleCamera lifecycleCamera : m3590e) {
                if (lifecycleCamera.m3578p(abstractC0718w) && lifecycleCamera != m3589c) {
                    throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", abstractC0718w));
                }
            }
        }
        if (m3589c == null) {
            m3589c = this.f3146e.m3588b(interfaceC1310k, new C1597e(m38650a, this.f3147f.m38678e().mo2802d(), this.f3147f.m38677d(), this.f3147f.m38680h()));
        }
        Iterator<InterfaceC12026n> it2 = c12030p.m38652c().iterator();
        while (it2.hasNext()) {
            InterfaceC12026n next = it2.next();
            if (next.m38637a() != InterfaceC12026n.f31979a && (mo3360c = C0700y0.m3378a(next.m38637a()).mo3360c(m3589c.mo2999b(), this.f3148g)) != null) {
                if (interfaceC0669u != null) {
                    throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                }
                interfaceC0669u = mo3360c;
            }
        }
        m3589c.m3575l(interfaceC0669u);
        if (abstractC0718wArr.length == 0) {
            return m3589c;
        }
        this.f3146e.m3587a(m3589c, c12018j1, list, Arrays.asList(abstractC0718wArr), this.f3147f.m38678e().mo2802d());
        return m3589c;
    }

    /* renamed from: e */
    public InterfaceC12013i m3612e(InterfaceC1310k interfaceC1310k, C12030p c12030p, AbstractC0718w... abstractC0718wArr) {
        if (m3602g() == 2) {
            throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
        }
        m3608m(1);
        return m3611d(interfaceC1310k, c12030p, null, Collections.emptyList(), abstractC0718wArr);
    }

    /* renamed from: f */
    public List<InterfaceC12028o> m3613f() {
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC0606c0> it = this.f3147f.m38679f().m3037a().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo2999b());
        }
        return arrayList;
    }

    /* renamed from: p */
    public void m3614p() {
        C0688q.m3339a();
        m3608m(0);
        this.f3146e.m3593k();
    }
}
