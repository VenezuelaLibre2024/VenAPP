package p452y;

import android.util.Log;
import androidx.camera.core.AbstractC0592e;
import androidx.camera.core.InterfaceC0710o;
import androidx.camera.core.impl.utils.C0688q;
import androidx.core.util.C0980d;
import androidx.core.util.C0984h;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p002a0.C0009f;
import p002a0.InterfaceC0006c;
import p407w.C12008g0;
import p407w.C12029o0;
import p452y.AbstractC12573v0;
import p474z.C12747a;

/* renamed from: y.r0 */
/* loaded from: classes.dex */
public class C12565r0 implements AbstractC0592e.a, AbstractC12573v0.a {

    /* renamed from: b */
    final InterfaceC12562q f34079b;

    /* renamed from: c */
    C12564r f34080c;

    /* renamed from: d */
    private C12547i0 f34081d;

    /* renamed from: e */
    private final List<C12547i0> f34082e;

    /* renamed from: a */
    final Deque<AbstractC12573v0> f34078a = new ArrayDeque();

    /* renamed from: f */
    boolean f34083f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y.r0$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC0006c<Void> {

        /* renamed from: a */
        final /* synthetic */ C12548j f34084a;

        a(C12548j c12548j) {
            this.f34084a = c12548j;
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: a */
        public void mo8a(Throwable th2) {
            if (this.f34084a.m41213b()) {
                return;
            }
            if (th2 instanceof C12008g0) {
                C12565r0.this.f34080c.m41259j((C12008g0) th2);
            } else {
                C12565r0.this.f34080c.m41259j(new C12008g0(2, "Failed to submit capture request", th2));
            }
            C12565r0.this.f34079b.mo3463c();
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            C12565r0.this.f34079b.mo3463c();
        }
    }

    public C12565r0(InterfaceC12562q interfaceC12562q) {
        C0688q.m3339a();
        this.f34079b = interfaceC12562q;
        this.f34082e = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m41264h() {
        this.f34081d = null;
        m41271g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m41265i(C12547i0 c12547i0) {
        this.f34082e.remove(c12547i0);
    }

    /* renamed from: m */
    private InterfaceFutureC5920f<Void> m41266m(C12548j c12548j) {
        C0688q.m3339a();
        this.f34079b.mo3462b();
        InterfaceFutureC5920f<Void> mo3461a = this.f34079b.mo3461a(c12548j.m41212a());
        C0009f.m16b(mo3461a, new a(c12548j), C12747a.m42283d());
        return mo3461a;
    }

    /* renamed from: n */
    private void m41267n(final C12547i0 c12547i0) {
        C0984h.m4835m(!m41270f());
        this.f34081d = c12547i0;
        c12547i0.m41209l().addListener(new Runnable() { // from class: y.o0
            @Override // java.lang.Runnable
            public final void run() {
                C12565r0.this.m41264h();
            }
        }, C12747a.m42280a());
        this.f34082e.add(c12547i0);
        c12547i0.m41210m().addListener(new Runnable() { // from class: y.p0
            @Override // java.lang.Runnable
            public final void run() {
                C12565r0.this.m41265i(c12547i0);
            }
        }, C12747a.m42280a());
    }

    @Override // androidx.camera.core.AbstractC0592e.a
    /* renamed from: a */
    public void mo2902a(InterfaceC0710o interfaceC0710o) {
        C12747a.m42283d().execute(new Runnable() { // from class: y.q0
            @Override // java.lang.Runnable
            public final void run() {
                C12565r0.this.m41271g();
            }
        });
    }

    @Override // p452y.AbstractC12573v0.a
    /* renamed from: b */
    public void mo41268b(AbstractC12573v0 abstractC12573v0) {
        C0688q.m3339a();
        C12029o0.m38638a("TakePictureManager", "Add a new request for retrying.");
        this.f34078a.addFirst(abstractC12573v0);
        m41271g();
    }

    /* renamed from: e */
    public void m41269e() {
        C0688q.m3339a();
        C12008g0 c12008g0 = new C12008g0(3, "Camera is closed.", null);
        Iterator<AbstractC12573v0> it = this.f34078a.iterator();
        while (it.hasNext()) {
            it.next().m41313r(c12008g0);
        }
        this.f34078a.clear();
        Iterator it2 = new ArrayList(this.f34082e).iterator();
        while (it2.hasNext()) {
            ((C12547i0) it2.next()).m41207i(c12008g0);
        }
    }

    /* renamed from: f */
    boolean m41270f() {
        return this.f34081d != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m41271g() {
        C0688q.m3339a();
        Log.d("TakePictureManager", "Issue the next TakePictureRequest.");
        if (m41270f()) {
            Log.d("TakePictureManager", "There is already a request in-flight.");
            return;
        }
        if (this.f34083f) {
            Log.d("TakePictureManager", "The class is paused.");
            return;
        }
        if (this.f34080c.m41258h() == 0) {
            Log.d("TakePictureManager", "Too many acquire images. Close image to be able to process next.");
            return;
        }
        AbstractC12573v0 poll = this.f34078a.poll();
        if (poll == null) {
            Log.d("TakePictureManager", "No new request.");
            return;
        }
        C12547i0 c12547i0 = new C12547i0(poll, this);
        m41267n(c12547i0);
        C0980d<C12548j, C12541f0> m41255e = this.f34080c.m41255e(poll, c12547i0, c12547i0.m41209l());
        C12548j c12548j = m41255e.f4539a;
        Objects.requireNonNull(c12548j);
        C12541f0 c12541f0 = m41255e.f4540b;
        Objects.requireNonNull(c12541f0);
        this.f34080c.m41261l(c12541f0);
        c12547i0.m41211r(m41266m(c12548j));
    }

    /* renamed from: j */
    public void m41272j() {
        C0688q.m3339a();
        this.f34083f = true;
        C12547i0 c12547i0 = this.f34081d;
        if (c12547i0 != null) {
            c12547i0.m41208j();
        }
    }

    /* renamed from: k */
    public void m41273k() {
        C0688q.m3339a();
        this.f34083f = false;
        m41271g();
    }

    /* renamed from: l */
    public void m41274l(C12564r c12564r) {
        C0688q.m3339a();
        this.f34080c = c12564r;
        c12564r.m41260k(this);
    }
}
