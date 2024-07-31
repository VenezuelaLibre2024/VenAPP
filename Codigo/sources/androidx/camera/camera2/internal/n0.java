package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Size;
import androidx.camera.camera2.internal.n0;
import androidx.lifecycle.LiveData;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import w.q;

/* loaded from: classes.dex */
public final class n0 implements androidx.camera.core.impl.b0 {

    /* renamed from: a */
    private final String f2115a;

    /* renamed from: b */
    private final androidx.camera.camera2.internal.compat.d0 f2116b;

    /* renamed from: c */
    private final v.h f2117c;

    /* renamed from: e */
    private u f2119e;

    /* renamed from: h */
    private final a<w.q> f2122h;

    /* renamed from: j */
    private final androidx.camera.core.impl.t1 f2124j;

    /* renamed from: k */
    private final androidx.camera.core.impl.x0 f2125k;

    /* renamed from: l */
    private final androidx.camera.camera2.internal.compat.r0 f2126l;

    /* renamed from: d */
    private final Object f2118d = new Object();

    /* renamed from: f */
    private a<Integer> f2120f = null;

    /* renamed from: g */
    private a<w.k1> f2121g = null;

    /* renamed from: i */
    private List<Pair<androidx.camera.core.impl.k, Executor>> f2123i = null;

    /* loaded from: classes.dex */
    public static class a<T> extends androidx.lifecycle.p<T> {

        /* renamed from: b */
        private LiveData<T> f2127b;

        /* renamed from: c */
        private final T f2128c;

        a(T t10) {
            this.f2128c = t10;
        }

        @Override // androidx.lifecycle.p
        public <S> void b(LiveData<S> liveData, androidx.lifecycle.s<? super S> sVar) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        void d(LiveData<T> liveData) {
            LiveData<T> liveData2 = this.f2127b;
            if (liveData2 != null) {
                super.c(liveData2);
            }
            this.f2127b = liveData;
            super.b(liveData, new androidx.lifecycle.s() { // from class: androidx.camera.camera2.internal.m0
                public /* synthetic */ m0() {
                }

                @Override // androidx.lifecycle.s
                public final void a(Object obj) {
                    n0.a.this.setValue(obj);
                }
            });
        }

        @Override // androidx.lifecycle.LiveData
        public T getValue() {
            LiveData<T> liveData = this.f2127b;
            return liveData == null ? this.f2128c : liveData.getValue();
        }
    }

    public n0(String str, androidx.camera.camera2.internal.compat.r0 r0Var) {
        String str2 = (String) androidx.core.util.h.k(str);
        this.f2115a = str2;
        this.f2126l = r0Var;
        androidx.camera.camera2.internal.compat.d0 c10 = r0Var.c(str2);
        this.f2116b = c10;
        this.f2117c = new v.h(this);
        this.f2124j = s.g.a(str, c10);
        this.f2125k = new h1(str);
        this.f2122h = new a<>(w.q.a(q.b.CLOSED));
    }

    private void p() {
        q();
    }

    private void q() {
        String str;
        int n10 = n();
        if (n10 == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (n10 == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (n10 == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (n10 == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (n10 != 4) {
            str = "Unknown value: " + n10;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        w.o0.e("Camera2CameraInfo", "Device Level: " + str);
    }

    @Override // w.o
    public int a() {
        return i(0);
    }

    @Override // androidx.camera.core.impl.b0
    public String b() {
        return this.f2115a;
    }

    @Override // androidx.camera.core.impl.b0
    public List<Size> c(int i10) {
        Size[] a10 = this.f2116b.b().a(i10);
        return a10 != null ? Arrays.asList(a10) : Collections.emptyList();
    }

    @Override // w.o
    public boolean d() {
        androidx.camera.camera2.internal.compat.d0 d0Var = this.f2116b;
        Objects.requireNonNull(d0Var);
        return t.g.a(new l0(d0Var));
    }

    @Override // androidx.camera.core.impl.b0
    public androidx.camera.core.impl.t1 e() {
        return this.f2124j;
    }

    @Override // androidx.camera.core.impl.b0
    public List<Size> f(int i10) {
        Size[] b10 = this.f2116b.b().b(i10);
        return b10 != null ? Arrays.asList(b10) : Collections.emptyList();
    }

    @Override // w.o
    public LiveData<Integer> g() {
        synchronized (this.f2118d) {
            u uVar = this.f2119e;
            if (uVar == null) {
                if (this.f2120f == null) {
                    this.f2120f = new a<>(0);
                }
                return this.f2120f;
            }
            a<Integer> aVar = this.f2120f;
            if (aVar != null) {
                return aVar;
            }
            return uVar.E().f();
        }
    }

    @Override // w.o
    public int getLensFacing() {
        Integer num = (Integer) this.f2116b.a(CameraCharacteristics.LENS_FACING);
        androidx.core.util.h.b(num != null, "Unable to get the lens facing of the camera.");
        return k2.a(num.intValue());
    }

    @Override // w.o
    public int i(int i10) {
        return androidx.camera.core.impl.utils.c.a(androidx.camera.core.impl.utils.c.b(i10), m(), 1 == getLensFacing());
    }

    @Override // w.o
    public LiveData<w.k1> j() {
        synchronized (this.f2118d) {
            u uVar = this.f2119e;
            if (uVar == null) {
                if (this.f2121g == null) {
                    this.f2121g = new a<>(u3.g(this.f2116b));
                }
                return this.f2121g;
            }
            a<w.k1> aVar = this.f2121g;
            if (aVar != null) {
                return aVar;
            }
            return uVar.G().i();
        }
    }

    public v.h k() {
        return this.f2117c;
    }

    public androidx.camera.camera2.internal.compat.d0 l() {
        return this.f2116b;
    }

    int m() {
        Integer num = (Integer) this.f2116b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        androidx.core.util.h.k(num);
        return num.intValue();
    }

    public int n() {
        Integer num = (Integer) this.f2116b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        androidx.core.util.h.k(num);
        return num.intValue();
    }

    public void o(u uVar) {
        synchronized (this.f2118d) {
            this.f2119e = uVar;
            a<w.k1> aVar = this.f2121g;
            if (aVar != null) {
                aVar.d(uVar.G().i());
            }
            a<Integer> aVar2 = this.f2120f;
            if (aVar2 != null) {
                aVar2.d(this.f2119e.E().f());
            }
            List<Pair<androidx.camera.core.impl.k, Executor>> list = this.f2123i;
            if (list != null) {
                for (Pair<androidx.camera.core.impl.k, Executor> pair : list) {
                    this.f2119e.u((Executor) pair.second, (androidx.camera.core.impl.k) pair.first);
                }
                this.f2123i = null;
            }
        }
        p();
    }

    public void r(LiveData<w.q> liveData) {
        this.f2122h.d(liveData);
    }
}
