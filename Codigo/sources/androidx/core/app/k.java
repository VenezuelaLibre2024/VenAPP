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

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final b f3509a;

    /* loaded from: classes.dex */
    private static class a extends b {

        /* renamed from: e, reason: collision with root package name */
        private static HandlerThread f3510e;

        /* renamed from: f, reason: collision with root package name */
        private static Handler f3511f;

        /* renamed from: a, reason: collision with root package name */
        int f3512a;

        /* renamed from: b, reason: collision with root package name */
        SparseIntArray[] f3513b = new SparseIntArray[9];

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList<WeakReference<Activity>> f3514c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        Window.OnFrameMetricsAvailableListener f3515d = new WindowOnFrameMetricsAvailableListenerC0037a();

        /* renamed from: androidx.core.app.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class WindowOnFrameMetricsAvailableListenerC0037a implements Window.OnFrameMetricsAvailableListener {
            WindowOnFrameMetricsAvailableListenerC0037a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                a aVar = a.this;
                if ((aVar.f3512a & 1) != 0) {
                    aVar.e(aVar.f3513b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f3512a & 2) != 0) {
                    aVar2.e(aVar2.f3513b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f3512a & 4) != 0) {
                    aVar3.e(aVar3.f3513b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f3512a & 8) != 0) {
                    aVar4.e(aVar4.f3513b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f3512a & 16) != 0) {
                    aVar5.e(aVar5.f3513b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f3512a & 64) != 0) {
                    aVar6.e(aVar6.f3513b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f3512a & 32) != 0) {
                    aVar7.e(aVar7.f3513b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f3512a & RecognitionOptions.ITF) != 0) {
                    aVar8.e(aVar8.f3513b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f3512a & RecognitionOptions.QR_CODE) != 0) {
                    aVar9.e(aVar9.f3513b[8], frameMetrics.getMetric(2));
                }
            }
        }

        a(int i10) {
            this.f3512a = i10;
        }

        @Override // androidx.core.app.k.b
        public void a(Activity activity) {
            if (f3510e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f3510e = handlerThread;
                handlerThread.start();
                f3511f = new Handler(f3510e.getLooper());
            }
            for (int i10 = 0; i10 <= 8; i10++) {
                SparseIntArray[] sparseIntArrayArr = this.f3513b;
                if (sparseIntArrayArr[i10] == null && (this.f3512a & (1 << i10)) != 0) {
                    sparseIntArrayArr[i10] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f3515d, f3511f);
            this.f3514c.add(new WeakReference<>(activity));
        }

        @Override // androidx.core.app.k.b
        public SparseIntArray[] b() {
            return this.f3513b;
        }

        @Override // androidx.core.app.k.b
        public SparseIntArray[] c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f3514c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.f3514c.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f3515d);
            return this.f3513b;
        }

        @Override // androidx.core.app.k.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f3513b;
            this.f3513b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        void e(SparseIntArray sparseIntArray, long j10) {
            if (sparseIntArray != null) {
                int i10 = (int) ((500000 + j10) / 1000000);
                if (j10 >= 0) {
                    sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    private static class b {
        b() {
        }

        public void a(Activity activity) {
            throw null;
        }

        public SparseIntArray[] b() {
            throw null;
        }

        public SparseIntArray[] c(Activity activity) {
            throw null;
        }

        public SparseIntArray[] d() {
            throw null;
        }
    }

    public k() {
        this(1);
    }

    public k(int i10) {
        this.f3509a = new a(i10);
    }

    public void a(Activity activity) {
        this.f3509a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.f3509a.b();
    }

    public SparseIntArray[] c(Activity activity) {
        return this.f3509a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.f3509a.d();
    }
}
