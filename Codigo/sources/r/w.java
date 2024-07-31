package r;

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

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a */
    private final c f24476a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a implements c {

        /* renamed from: a */
        private final SessionConfiguration f24477a;

        /* renamed from: b */
        private final List<f> f24478b;

        a(int i10, List<f> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i10, w.h(list), executor, stateCallback));
        }

        a(Object obj) {
            List outputConfigurations;
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f24477a = sessionConfiguration;
            outputConfigurations = sessionConfiguration.getOutputConfigurations();
            this.f24478b = Collections.unmodifiableList(w.i(outputConfigurations));
        }

        @Override // r.w.c
        public e a() {
            InputConfiguration inputConfiguration;
            inputConfiguration = this.f24477a.getInputConfiguration();
            return e.b(inputConfiguration);
        }

        @Override // r.w.c
        public Executor b() {
            Executor executor;
            executor = this.f24477a.getExecutor();
            return executor;
        }

        @Override // r.w.c
        public CameraCaptureSession.StateCallback c() {
            CameraCaptureSession.StateCallback stateCallback;
            stateCallback = this.f24477a.getStateCallback();
            return stateCallback;
        }

        @Override // r.w.c
        public void d(e eVar) {
            this.f24477a.setInputConfiguration((InputConfiguration) eVar.a());
        }

        @Override // r.w.c
        public List<f> e() {
            return this.f24478b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Objects.equals(this.f24477a, ((a) obj).f24477a);
            }
            return false;
        }

        @Override // r.w.c
        public Object f() {
            return this.f24477a;
        }

        @Override // r.w.c
        public int g() {
            int sessionType;
            sessionType = this.f24477a.getSessionType();
            return sessionType;
        }

        @Override // r.w.c
        public void h(CaptureRequest captureRequest) {
            this.f24477a.setSessionParameters(captureRequest);
        }

        public int hashCode() {
            int hashCode;
            hashCode = this.f24477a.hashCode();
            return hashCode;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements c {

        /* renamed from: a */
        private final List<f> f24479a;

        /* renamed from: b */
        private final CameraCaptureSession.StateCallback f24480b;

        /* renamed from: c */
        private final Executor f24481c;

        /* renamed from: d */
        private final int f24482d;

        /* renamed from: e */
        private e f24483e = null;

        /* renamed from: f */
        private CaptureRequest f24484f = null;

        b(int i10, List<f> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f24482d = i10;
            this.f24479a = Collections.unmodifiableList(new ArrayList(list));
            this.f24480b = stateCallback;
            this.f24481c = executor;
        }

        @Override // r.w.c
        public e a() {
            return this.f24483e;
        }

        @Override // r.w.c
        public Executor b() {
            return this.f24481c;
        }

        @Override // r.w.c
        public CameraCaptureSession.StateCallback c() {
            return this.f24480b;
        }

        @Override // r.w.c
        public void d(e eVar) {
            if (this.f24482d == 1) {
                throw new UnsupportedOperationException("Method not supported for high speed session types");
            }
            this.f24483e = eVar;
        }

        @Override // r.w.c
        public List<f> e() {
            return this.f24479a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.f24483e, bVar.f24483e) && this.f24482d == bVar.f24482d && this.f24479a.size() == bVar.f24479a.size()) {
                    for (int i10 = 0; i10 < this.f24479a.size(); i10++) {
                        if (!this.f24479a.get(i10).equals(bVar.f24479a.get(i10))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // r.w.c
        public Object f() {
            return null;
        }

        @Override // r.w.c
        public int g() {
            return this.f24482d;
        }

        @Override // r.w.c
        public void h(CaptureRequest captureRequest) {
            this.f24484f = captureRequest;
        }

        public int hashCode() {
            int hashCode = this.f24479a.hashCode() ^ 31;
            int i10 = (hashCode << 5) - hashCode;
            e eVar = this.f24483e;
            int hashCode2 = (eVar == null ? 0 : eVar.hashCode()) ^ i10;
            return this.f24482d ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        e a();

        Executor b();

        CameraCaptureSession.StateCallback c();

        void d(e eVar);

        List<f> e();

        Object f();

        int g();

        void h(CaptureRequest captureRequest);
    }

    public w(int i10, List<f> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        this.f24476a = Build.VERSION.SDK_INT < 28 ? new b(i10, list, executor, stateCallback) : new a(i10, list, executor, stateCallback);
    }

    public static List<OutputConfiguration> h(List<f> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<f> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) it.next().h());
        }
        return arrayList;
    }

    static List<f> i(List<OutputConfiguration> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<OutputConfiguration> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f.i(it.next()));
        }
        return arrayList;
    }

    public Executor a() {
        return this.f24476a.b();
    }

    public e b() {
        return this.f24476a.a();
    }

    public List<f> c() {
        return this.f24476a.e();
    }

    public int d() {
        return this.f24476a.g();
    }

    public CameraCaptureSession.StateCallback e() {
        return this.f24476a.c();
    }

    public boolean equals(Object obj) {
        if (obj instanceof w) {
            return this.f24476a.equals(((w) obj).f24476a);
        }
        return false;
    }

    public void f(e eVar) {
        this.f24476a.d(eVar);
    }

    public void g(CaptureRequest captureRequest) {
        this.f24476a.h(captureRequest);
    }

    public int hashCode() {
        return this.f24476a.hashCode();
    }

    public Object j() {
        return this.f24476a.f();
    }
}
