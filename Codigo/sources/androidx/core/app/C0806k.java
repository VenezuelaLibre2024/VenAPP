package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.k */
/* loaded from: classes.dex */
public class C0806k {

    /* renamed from: a */
    private final b f4160a;

    /* renamed from: androidx.core.app.k$a */
    /* loaded from: classes.dex */
    private static class a extends b {

        /* renamed from: e */
        private static HandlerThread f4161e;

        /* renamed from: f */
        private static Handler f4162f;

        /* renamed from: a */
        int f4163a;

        /* renamed from: b */
        SparseIntArray[] f4164b = new SparseIntArray[9];

        /* renamed from: c */
        private final ArrayList<WeakReference<Activity>> f4165c = new ArrayList<>();

        /* renamed from: d */
        Window.OnFrameMetricsAvailableListener f4166d = new WindowOnFrameMetricsAvailableListenerC13156a();

        /* renamed from: androidx.core.app.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class WindowOnFrameMetricsAvailableListenerC13156a implements Window.OnFrameMetricsAvailableListener {
            WindowOnFrameMetricsAvailableListenerC13156a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                a aVar = a.this;
                if ((aVar.f4163a & 1) != 0) {
                    aVar.m4055e(aVar.f4164b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f4163a & 2) != 0) {
                    aVar2.m4055e(aVar2.f4164b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f4163a & 4) != 0) {
                    aVar3.m4055e(aVar3.f4164b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f4163a & 8) != 0) {
                    aVar4.m4055e(aVar4.f4164b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f4163a & 16) != 0) {
                    aVar5.m4055e(aVar5.f4164b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f4163a & 64) != 0) {
                    aVar6.m4055e(aVar6.f4164b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f4163a & 32) != 0) {
                    aVar7.m4055e(aVar7.f4164b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f4163a & RecognitionOptions.ITF) != 0) {
                    aVar8.m4055e(aVar8.f4164b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f4163a & RecognitionOptions.QR_CODE) != 0) {
                    aVar9.m4055e(aVar9.f4164b[8], frameMetrics.getMetric(2));
                }
            }
        }

        a(int i10) {
            this.f4163a = i10;
        }

        @Override // androidx.core.app.C0806k.b
        /* renamed from: a */
        public void mo4051a(Activity activity) {
            if (f4161e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f4161e = handlerThread;
                handlerThread.start();
                f4162f = new Handler(f4161e.getLooper());
            }
            for (int i10 = 0; i10 <= 8; i10++) {
                SparseIntArray[] sparseIntArrayArr = this.f4164b;
                if (sparseIntArrayArr[i10] == null && (this.f4163a & (1 << i10)) != 0) {
                    sparseIntArrayArr[i10] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f4166d, f4162f);
            this.f4165c.add(new WeakReference<>(activity));
        }

        @Override // androidx.core.app.C0806k.b
        /* renamed from: b */
        public SparseIntArray[] mo4052b() {
            return this.f4164b;
        }

        @Override // androidx.core.app.C0806k.b
        /* renamed from: c */
        public SparseIntArray[] mo4053c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f4165c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.f4165c.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f4166d);
            return this.f4164b;
        }

        @Override // androidx.core.app.C0806k.b
        /* renamed from: d */
        public SparseIntArray[] mo4054d() {
            SparseIntArray[] sparseIntArrayArr = this.f4164b;
            this.f4164b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        /* renamed from: e */
        void m4055e(SparseIntArray sparseIntArray, long j10) {
            if (sparseIntArray != null) {
                int i10 = (int) ((500000 + j10) / 1000000);
                if (j10 >= 0) {
                    sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
                }
            }
        }
    }

    /* renamed from: androidx.core.app.k$b */
    /* loaded from: classes.dex */
    private static class b {
        b() {
        }

        /* renamed from: a */
        public void mo4051a(Activity activity) {
            throw null;
        }

        /* renamed from: b */
        public SparseIntArray[] mo4052b() {
            throw null;
        }

        /* renamed from: c */
        public SparseIntArray[] mo4053c(Activity activity) {
            throw null;
        }

        /* renamed from: d */
        public SparseIntArray[] mo4054d() {
            throw null;
        }
    }

    public C0806k() {
        this(1);
    }

    public C0806k(int i10) {
        this.f4160a = new a(i10);
    }

    /* renamed from: a */
    public void m4047a(Activity activity) {
        this.f4160a.mo4051a(activity);
    }

    /* renamed from: b */
    public SparseIntArray[] m4048b() {
        return this.f4160a.mo4052b();
    }

    /* renamed from: c */
    public SparseIntArray[] m4049c(Activity activity) {
        return this.f4160a.mo4053c(activity);
    }

    /* renamed from: d */
    public SparseIntArray[] m4050d() {
        return this.f4160a.mo4054d();
    }
}
