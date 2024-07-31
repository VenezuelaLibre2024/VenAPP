package androidx.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.C0427d0;
import androidx.camera.core.AbstractC0718w;
import androidx.camera.core.impl.AbstractC0661r0;
import androidx.camera.core.impl.C0627h1;
import androidx.camera.core.impl.C0647m1;
import androidx.camera.core.impl.C0701y1;
import androidx.camera.core.impl.InterfaceC0640k2;
import androidx.camera.core.impl.InterfaceC0644l2;
import androidx.camera.core.impl.InterfaceC0649n0;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p002a0.C0009f;
import p002a0.InterfaceC0006c;
import p354t.C10954s;
import p407w.C12029o0;
import p474z.C12747a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.n2 */
/* loaded from: classes.dex */
public class C0525n2 {

    /* renamed from: a */
    private AbstractC0661r0 f2450a;

    /* renamed from: b */
    private C0701y1 f2451b;

    /* renamed from: d */
    private final Size f2453d;

    /* renamed from: f */
    private final c f2455f;

    /* renamed from: e */
    private final C10954s f2454e = new C10954s();

    /* renamed from: c */
    private final b f2452c = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.n2$a */
    /* loaded from: classes.dex */
    public class a implements InterfaceC0006c<Void> {

        /* renamed from: a */
        final /* synthetic */ Surface f2456a;

        /* renamed from: b */
        final /* synthetic */ SurfaceTexture f2457b;

        a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f2456a = surface;
            this.f2457b = surfaceTexture;
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: a */
        public void mo8a(Throwable th2) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th2);
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
            this.f2456a.release();
            this.f2457b.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.camera.camera2.internal.n2$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC0640k2<AbstractC0718w> {

        /* renamed from: G */
        private final InterfaceC0649n0 f2459G;

        b() {
            C0647m1 m3184a0 = C0647m1.m3184a0();
            m3184a0.mo3178r(InterfaceC0640k2.f2867t, new C0504j1());
            this.f2459G = m3184a0;
        }

        @Override // androidx.camera.core.impl.InterfaceC0640k2
        /* renamed from: N */
        public InterfaceC0644l2.b mo2588N() {
            return InterfaceC0644l2.b.METERING_REPEATING;
        }

        @Override // androidx.camera.core.impl.InterfaceC0671u1
        /* renamed from: m */
        public InterfaceC0649n0 mo2589m() {
            return this.f2459G;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.n2$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo2590a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0525n2(C0427d0 c0427d0, C0416c2 c0416c2, c cVar) {
        this.f2455f = cVar;
        Size m2579f = m2579f(c0427d0, c0416c2);
        this.f2453d = m2579f;
        C12029o0.m38638a("MeteringRepeating", "MeteringSession SurfaceTexture size: " + m2579f);
        this.f2451b = m2583d();
    }

    /* renamed from: f */
    private Size m2579f(C0427d0 c0427d0, C0416c2 c0416c2) {
        Size[] m2308b = c0427d0.m2216b().m2308b(34);
        if (m2308b == null) {
            C12029o0.m38640c("MeteringRepeating", "Can not get output size list.");
            return new Size(0, 0);
        }
        Size[] m33435a = this.f2454e.m33435a(m2308b);
        List asList = Arrays.asList(m33435a);
        Collections.sort(asList, new Comparator() { // from class: androidx.camera.camera2.internal.m2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m2581j;
                m2581j = C0525n2.m2581j((Size) obj, (Size) obj2);
                return m2581j;
            }
        });
        Size m2198f = c0416c2.m2198f();
        long min = Math.min(m2198f.getWidth() * m2198f.getHeight(), 307200L);
        int length = m33435a.length;
        Size size = null;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Size size2 = m33435a[i10];
            long width = size2.getWidth() * size2.getHeight();
            if (width == min) {
                return size2;
            }
            if (width <= min) {
                i10++;
                size = size2;
            } else if (size != null) {
                return size;
            }
        }
        return (Size) asList.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m2580i(C0701y1 c0701y1, C0701y1.f fVar) {
        this.f2451b = m2583d();
        c cVar = this.f2455f;
        if (cVar != null) {
            cVar.mo2590a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ int m2581j(Size size, Size size2) {
        return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m2582c() {
        C12029o0.m38638a("MeteringRepeating", "MeteringRepeating clear!");
        AbstractC0661r0 abstractC0661r0 = this.f2450a;
        if (abstractC0661r0 != null) {
            abstractC0661r0.m3223d();
        }
        this.f2450a = null;
    }

    /* renamed from: d */
    C0701y1 m2583d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(this.f2453d.getWidth(), this.f2453d.getHeight());
        Surface surface = new Surface(surfaceTexture);
        C0701y1.b m3391p = C0701y1.b.m3391p(this.f2452c, this.f2453d);
        m3391p.m3410t(1);
        C0627h1 c0627h1 = new C0627h1(surface);
        this.f2450a = c0627h1;
        C0009f.m16b(c0627h1.m3230k(), new a(surface, surfaceTexture), C12747a.m42280a());
        m3391p.m3403l(this.f2450a);
        m3391p.m3397f(new C0701y1.c() { // from class: androidx.camera.camera2.internal.l2
            @Override // androidx.camera.core.impl.C0701y1.c
            /* renamed from: a */
            public final void mo2550a(C0701y1 c0701y1, C0701y1.f fVar) {
                C0525n2.this.m2580i(c0701y1, fVar);
            }
        });
        return m3391p.m3406o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public String m2584e() {
        return "MeteringRepeating";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C0701y1 m2585g() {
        return this.f2451b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public InterfaceC0640k2<?> m2586h() {
        return this.f2452c;
    }
}
