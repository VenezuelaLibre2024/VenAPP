package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Size;
import androidx.camera.camera2.internal.C0523n0;
import androidx.camera.camera2.internal.compat.C0427d0;
import androidx.camera.camera2.internal.compat.C0455r0;
import androidx.camera.core.impl.AbstractC0637k;
import androidx.camera.core.impl.C0668t1;
import androidx.camera.core.impl.InterfaceC0602b0;
import androidx.camera.core.impl.InterfaceC0697x0;
import androidx.camera.core.impl.utils.C0674c;
import androidx.core.util.C0984h;
import androidx.lifecycle.C1318p;
import androidx.lifecycle.InterfaceC1321s;
import androidx.lifecycle.LiveData;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p342s.C10740g;
import p354t.C10942g;
import p389v.C11598h;
import p407w.AbstractC12032q;
import p407w.C12029o0;
import p407w.InterfaceC12021k1;

/* renamed from: androidx.camera.camera2.internal.n0 */
/* loaded from: classes.dex */
public final class C0523n0 implements InterfaceC0602b0 {

    /* renamed from: a */
    private final String f2435a;

    /* renamed from: b */
    private final C0427d0 f2436b;

    /* renamed from: c */
    private final C11598h f2437c;

    /* renamed from: e */
    private C0557u f2439e;

    /* renamed from: h */
    private final a<AbstractC12032q> f2442h;

    /* renamed from: j */
    private final C0668t1 f2444j;

    /* renamed from: k */
    private final InterfaceC0697x0 f2445k;

    /* renamed from: l */
    private final C0455r0 f2446l;

    /* renamed from: d */
    private final Object f2438d = new Object();

    /* renamed from: f */
    private a<Integer> f2440f = null;

    /* renamed from: g */
    private a<InterfaceC12021k1> f2441g = null;

    /* renamed from: i */
    private List<Pair<AbstractC0637k, Executor>> f2443i = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.n0$a */
    /* loaded from: classes.dex */
    public static class a<T> extends C1318p<T> {

        /* renamed from: b */
        private LiveData<T> f2447b;

        /* renamed from: c */
        private final T f2448c;

        a(T t10) {
            this.f2448c = t10;
        }

        @Override // androidx.lifecycle.C1318p
        /* renamed from: b */
        public <S> void mo2573b(LiveData<S> liveData, InterfaceC1321s<? super S> interfaceC1321s) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        void m2574d(LiveData<T> liveData) {
            LiveData<T> liveData2 = this.f2447b;
            if (liveData2 != null) {
                super.m7375c(liveData2);
            }
            this.f2447b = liveData;
            super.mo2573b(liveData, new InterfaceC1321s() { // from class: androidx.camera.camera2.internal.m0
                @Override // androidx.lifecycle.InterfaceC1321s
                /* renamed from: a */
                public final void mo2553a(Object obj) {
                    C0523n0.a.this.setValue(obj);
                }
            });
        }

        @Override // androidx.lifecycle.LiveData
        public T getValue() {
            LiveData<T> liveData = this.f2447b;
            return liveData == null ? this.f2448c : liveData.getValue();
        }
    }

    public C0523n0(String str, C0455r0 c0455r0) {
        String str2 = (String) C0984h.m4833k(str);
        this.f2435a = str2;
        this.f2446l = c0455r0;
        C0427d0 m2276c = c0455r0.m2276c(str2);
        this.f2436b = m2276c;
        this.f2437c = new C11598h(this);
        this.f2444j = C10740g.m32685a(str, m2276c);
        this.f2445k = new C0494h1(str);
        this.f2442h = new a<>(AbstractC12032q.m38659a(AbstractC12032q.b.CLOSED));
    }

    /* renamed from: p */
    private void m2556p() {
        m2557q();
    }

    /* renamed from: q */
    private void m2557q() {
        String str;
        int m2570n = m2570n();
        if (m2570n == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (m2570n == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (m2570n == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (m2570n == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (m2570n != 4) {
            str = "Unknown value: " + m2570n;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        C12029o0.m38642e("Camera2CameraInfo", "Device Level: " + str);
    }

    @Override // p407w.InterfaceC12028o
    /* renamed from: a */
    public int mo2558a() {
        return mo2565i(0);
    }

    @Override // androidx.camera.core.impl.InterfaceC0602b0
    /* renamed from: b */
    public String mo2559b() {
        return this.f2435a;
    }

    @Override // androidx.camera.core.impl.InterfaceC0602b0
    /* renamed from: c */
    public List<Size> mo2560c(int i10) {
        Size[] m2307a = this.f2436b.m2216b().m2307a(i10);
        return m2307a != null ? Arrays.asList(m2307a) : Collections.emptyList();
    }

    @Override // p407w.InterfaceC12028o
    /* renamed from: d */
    public boolean mo2561d() {
        C0427d0 c0427d0 = this.f2436b;
        Objects.requireNonNull(c0427d0);
        return C10942g.m33414a(new C0513l0(c0427d0));
    }

    @Override // androidx.camera.core.impl.InterfaceC0602b0
    /* renamed from: e */
    public C0668t1 mo2562e() {
        return this.f2444j;
    }

    @Override // androidx.camera.core.impl.InterfaceC0602b0
    /* renamed from: f */
    public List<Size> mo2563f(int i10) {
        Size[] m2308b = this.f2436b.m2216b().m2308b(i10);
        return m2308b != null ? Arrays.asList(m2308b) : Collections.emptyList();
    }

    @Override // p407w.InterfaceC12028o
    /* renamed from: g */
    public LiveData<Integer> mo2564g() {
        synchronized (this.f2438d) {
            C0557u c0557u = this.f2439e;
            if (c0557u == null) {
                if (this.f2440f == null) {
                    this.f2440f = new a<>(0);
                }
                return this.f2440f;
            }
            a<Integer> aVar = this.f2440f;
            if (aVar != null) {
                return aVar;
            }
            return c0557u.m2710E().m2608f();
        }
    }

    @Override // p407w.InterfaceC12028o
    public int getLensFacing() {
        Integer num = (Integer) this.f2436b.m2215a(CameraCharacteristics.LENS_FACING);
        C0984h.m4824b(num != null, "Unable to get the lens facing of the camera.");
        return C0510k2.m2543a(num.intValue());
    }

    @Override // p407w.InterfaceC12028o
    /* renamed from: i */
    public int mo2565i(int i10) {
        return C0674c.m3258a(C0674c.m3259b(i10), m2569m(), 1 == getLensFacing());
    }

    @Override // p407w.InterfaceC12028o
    /* renamed from: j */
    public LiveData<InterfaceC12021k1> mo2566j() {
        synchronized (this.f2438d) {
            C0557u c0557u = this.f2439e;
            if (c0557u == null) {
                if (this.f2441g == null) {
                    this.f2441g = new a<>(C0561u3.m2774g(this.f2436b));
                }
                return this.f2441g;
            }
            a<InterfaceC12021k1> aVar = this.f2441g;
            if (aVar != null) {
                return aVar;
            }
            return c0557u.m2712G().m2784i();
        }
    }

    /* renamed from: k */
    public C11598h m2567k() {
        return this.f2437c;
    }

    /* renamed from: l */
    public C0427d0 m2568l() {
        return this.f2436b;
    }

    /* renamed from: m */
    int m2569m() {
        Integer num = (Integer) this.f2436b.m2215a(CameraCharacteristics.SENSOR_ORIENTATION);
        C0984h.m4833k(num);
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public int m2570n() {
        Integer num = (Integer) this.f2436b.m2215a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        C0984h.m4833k(num);
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m2571o(C0557u c0557u) {
        synchronized (this.f2438d) {
            this.f2439e = c0557u;
            a<InterfaceC12021k1> aVar = this.f2441g;
            if (aVar != null) {
                aVar.m2574d(c0557u.m2712G().m2784i());
            }
            a<Integer> aVar2 = this.f2440f;
            if (aVar2 != null) {
                aVar2.m2574d(this.f2439e.m2710E().m2608f());
            }
            List<Pair<AbstractC0637k, Executor>> list = this.f2443i;
            if (list != null) {
                for (Pair<AbstractC0637k, Executor> pair : list) {
                    this.f2439e.m2737u((Executor) pair.second, (AbstractC0637k) pair.first);
                }
                this.f2443i = null;
            }
        }
        m2556p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m2572r(LiveData<AbstractC12032q> liveData) {
        this.f2442h.m2574d(liveData);
    }
}
