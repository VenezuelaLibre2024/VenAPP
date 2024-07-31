package p320r;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: r.w */
/* loaded from: classes.dex */
public final class C10574w {

    /* renamed from: a */
    private final c f26590a;

    /* renamed from: r.w$a */
    /* loaded from: classes.dex */
    private static final class a implements c {

        /* renamed from: a */
        private final SessionConfiguration f26591a;

        /* renamed from: b */
        private final List<C10557f> f26592b;

        a(int i10, List<C10557f> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i10, C10574w.m32084h(list), executor, stateCallback));
        }

        a(Object obj) {
            List outputConfigurations;
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f26591a = sessionConfiguration;
            outputConfigurations = sessionConfiguration.getOutputConfigurations();
            this.f26592b = Collections.unmodifiableList(C10574w.m32085i(outputConfigurations));
        }

        @Override // p320r.C10574w.c
        /* renamed from: a */
        public C10556e mo32094a() {
            InputConfiguration inputConfiguration;
            inputConfiguration = this.f26591a.getInputConfiguration();
            return C10556e.m32049b(inputConfiguration);
        }

        @Override // p320r.C10574w.c
        /* renamed from: b */
        public Executor mo32095b() {
            Executor executor;
            executor = this.f26591a.getExecutor();
            return executor;
        }

        @Override // p320r.C10574w.c
        /* renamed from: c */
        public CameraCaptureSession.StateCallback mo32096c() {
            CameraCaptureSession.StateCallback stateCallback;
            stateCallback = this.f26591a.getStateCallback();
            return stateCallback;
        }

        @Override // p320r.C10574w.c
        /* renamed from: d */
        public void mo32097d(C10556e c10556e) {
            this.f26591a.setInputConfiguration((InputConfiguration) c10556e.m32050a());
        }

        @Override // p320r.C10574w.c
        /* renamed from: e */
        public List<C10557f> mo32098e() {
            return this.f26592b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Objects.equals(this.f26591a, ((a) obj).f26591a);
            }
            return false;
        }

        @Override // p320r.C10574w.c
        /* renamed from: f */
        public Object mo32099f() {
            return this.f26591a;
        }

        @Override // p320r.C10574w.c
        /* renamed from: g */
        public int mo32100g() {
            int sessionType;
            sessionType = this.f26591a.getSessionType();
            return sessionType;
        }

        @Override // p320r.C10574w.c
        /* renamed from: h */
        public void mo32101h(CaptureRequest captureRequest) {
            this.f26591a.setSessionParameters(captureRequest);
        }

        public int hashCode() {
            int hashCode;
            hashCode = this.f26591a.hashCode();
            return hashCode;
        }
    }

    /* renamed from: r.w$b */
    /* loaded from: classes.dex */
    private static final class b implements c {

        /* renamed from: a */
        private final List<C10557f> f26593a;

        /* renamed from: b */
        private final CameraCaptureSession.StateCallback f26594b;

        /* renamed from: c */
        private final Executor f26595c;

        /* renamed from: d */
        private final int f26596d;

        /* renamed from: e */
        private C10556e f26597e = null;

        /* renamed from: f */
        private CaptureRequest f26598f = null;

        b(int i10, List<C10557f> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f26596d = i10;
            this.f26593a = Collections.unmodifiableList(new ArrayList(list));
            this.f26594b = stateCallback;
            this.f26595c = executor;
        }

        @Override // p320r.C10574w.c
        /* renamed from: a */
        public C10556e mo32094a() {
            return this.f26597e;
        }

        @Override // p320r.C10574w.c
        /* renamed from: b */
        public Executor mo32095b() {
            return this.f26595c;
        }

        @Override // p320r.C10574w.c
        /* renamed from: c */
        public CameraCaptureSession.StateCallback mo32096c() {
            return this.f26594b;
        }

        @Override // p320r.C10574w.c
        /* renamed from: d */
        public void mo32097d(C10556e c10556e) {
            if (this.f26596d == 1) {
                throw new UnsupportedOperationException("Method not supported for high speed session types");
            }
            this.f26597e = c10556e;
        }

        @Override // p320r.C10574w.c
        /* renamed from: e */
        public List<C10557f> mo32098e() {
            return this.f26593a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.f26597e, bVar.f26597e) && this.f26596d == bVar.f26596d && this.f26593a.size() == bVar.f26593a.size()) {
                    for (int i10 = 0; i10 < this.f26593a.size(); i10++) {
                        if (!this.f26593a.get(i10).equals(bVar.f26593a.get(i10))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // p320r.C10574w.c
        /* renamed from: f */
        public Object mo32099f() {
            return null;
        }

        @Override // p320r.C10574w.c
        /* renamed from: g */
        public int mo32100g() {
            return this.f26596d;
        }

        @Override // p320r.C10574w.c
        /* renamed from: h */
        public void mo32101h(CaptureRequest captureRequest) {
            this.f26598f = captureRequest;
        }

        public int hashCode() {
            int hashCode = this.f26593a.hashCode() ^ 31;
            int i10 = (hashCode << 5) - hashCode;
            C10556e c10556e = this.f26597e;
            int hashCode2 = (c10556e == null ? 0 : c10556e.hashCode()) ^ i10;
            return this.f26596d ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    /* renamed from: r.w$c */
    /* loaded from: classes.dex */
    private interface c {
        /* renamed from: a */
        C10556e mo32094a();

        /* renamed from: b */
        Executor mo32095b();

        /* renamed from: c */
        CameraCaptureSession.StateCallback mo32096c();

        /* renamed from: d */
        void mo32097d(C10556e c10556e);

        /* renamed from: e */
        List<C10557f> mo32098e();

        /* renamed from: f */
        Object mo32099f();

        /* renamed from: g */
        int mo32100g();

        /* renamed from: h */
        void mo32101h(CaptureRequest captureRequest);
    }

    public C10574w(int i10, List<C10557f> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        this.f26590a = Build.VERSION.SDK_INT < 28 ? new b(i10, list, executor, stateCallback) : new a(i10, list, executor, stateCallback);
    }

    /* renamed from: h */
    public static List<OutputConfiguration> m32084h(List<C10557f> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<C10557f> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) it.next().m32060h());
        }
        return arrayList;
    }

    /* renamed from: i */
    static List<C10557f> m32085i(List<OutputConfiguration> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<OutputConfiguration> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C10557f.m32052i(it.next()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public Executor m32086a() {
        return this.f26590a.mo32095b();
    }

    /* renamed from: b */
    public C10556e m32087b() {
        return this.f26590a.mo32094a();
    }

    /* renamed from: c */
    public List<C10557f> m32088c() {
        return this.f26590a.mo32098e();
    }

    /* renamed from: d */
    public int m32089d() {
        return this.f26590a.mo32100g();
    }

    /* renamed from: e */
    public CameraCaptureSession.StateCallback m32090e() {
        return this.f26590a.mo32096c();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10574w) {
            return this.f26590a.equals(((C10574w) obj).f26590a);
        }
        return false;
    }

    /* renamed from: f */
    public void m32091f(C10556e c10556e) {
        this.f26590a.mo32097d(c10556e);
    }

    /* renamed from: g */
    public void m32092g(CaptureRequest captureRequest) {
        this.f26590a.mo32101h(captureRequest);
    }

    public int hashCode() {
        return this.f26590a.hashCode();
    }

    /* renamed from: j */
    public Object m32093j() {
        return this.f26590a.mo32099f();
    }
}
