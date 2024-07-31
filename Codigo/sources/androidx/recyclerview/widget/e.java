package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    static final ThreadLocal<e> f5397e = new ThreadLocal<>();

    /* renamed from: f, reason: collision with root package name */
    static Comparator<c> f5398f = new a();

    /* renamed from: b, reason: collision with root package name */
    long f5400b;

    /* renamed from: c, reason: collision with root package name */
    long f5401c;

    /* renamed from: a, reason: collision with root package name */
    ArrayList<RecyclerView> f5399a = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<c> f5402d = new ArrayList<>();

    /* loaded from: classes.dex */
    class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f5410d;
            if ((recyclerView == null) != (cVar2.f5410d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f5407a;
            if (z10 != cVar2.f5407a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f5408b - cVar.f5408b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f5409c - cVar2.f5409c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        int f5403a;

        /* renamed from: b, reason: collision with root package name */
        int f5404b;

        /* renamed from: c, reason: collision with root package name */
        int[] f5405c;

        /* renamed from: d, reason: collision with root package name */
        int f5406d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a() {
            int[] iArr = this.f5405c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f5406d = 0;
        }

        void b(RecyclerView recyclerView, boolean z10) {
            this.f5406d = 0;
            int[] iArr = this.f5405c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.n nVar = recyclerView.f5153w;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean c(int i10) {
            if (this.f5405c != null) {
                int i11 = this.f5406d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f5405c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        void d(int i10, int i11) {
            this.f5403a = i10;
            this.f5404b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f5407a;

        /* renamed from: b, reason: collision with root package name */
        public int f5408b;

        /* renamed from: c, reason: collision with root package name */
        public int f5409c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f5410d;

        /* renamed from: e, reason: collision with root package name */
        public int f5411e;

        c() {
        }

        public void a() {
            this.f5407a = false;
            this.f5408b = 0;
            this.f5409c = 0;
            this.f5410d = null;
            this.f5411e = 0;
        }
    }

    private void b() {
        c cVar;
        int size = this.f5399a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = this.f5399a.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f5142q0.b(recyclerView, false);
                i10 += recyclerView.f5142q0.f5406d;
            }
        }
        this.f5402d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = this.f5399a.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f5142q0;
                int abs = Math.abs(bVar.f5403a) + Math.abs(bVar.f5404b);
                for (int i14 = 0; i14 < bVar.f5406d * 2; i14 += 2) {
                    if (i12 >= this.f5402d.size()) {
                        cVar = new c();
                        this.f5402d.add(cVar);
                    } else {
                        cVar = this.f5402d.get(i12);
                    }
                    int[] iArr = bVar.f5405c;
                    int i15 = iArr[i14 + 1];
                    cVar.f5407a = i15 <= abs;
                    cVar.f5408b = abs;
                    cVar.f5409c = i15;
                    cVar.f5410d = recyclerView2;
                    cVar.f5411e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f5402d, f5398f);
    }

    private void c(c cVar, long j10) {
        RecyclerView.b0 i10 = i(cVar.f5410d, cVar.f5411e, cVar.f5407a ? Long.MAX_VALUE : j10);
        if (i10 == null || i10.f5172b == null || !i10.q() || i10.r()) {
            return;
        }
        h(i10.f5172b.get(), j10);
    }

    private void d(long j10) {
        for (int i10 = 0; i10 < this.f5402d.size(); i10++) {
            c cVar = this.f5402d.get(i10);
            if (cVar.f5410d == null) {
                return;
            }
            c(cVar, j10);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i10) {
        int g10 = recyclerView.f5128e.g();
        for (int i11 = 0; i11 < g10; i11++) {
            RecyclerView.b0 I = RecyclerView.I(recyclerView.f5128e.f(i11));
            if (I.f5173c == i10 && !I.r()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.O && recyclerView.f5128e.g() != 0) {
            recyclerView.n0();
        }
        b bVar = recyclerView.f5142q0;
        bVar.b(recyclerView, true);
        if (bVar.f5406d != 0) {
            try {
                androidx.core.os.l.a("RV Nested Prefetch");
                recyclerView.f5144r0.c(null);
                for (int i10 = 0; i10 < bVar.f5406d * 2; i10 += 2) {
                    i(recyclerView, bVar.f5405c[i10], j10);
                }
            } finally {
                androidx.core.os.l.b();
            }
        }
    }

    private RecyclerView.b0 i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.u uVar = recyclerView.f5122b;
        try {
            recyclerView.c0();
            RecyclerView.b0 A = uVar.A(i10, false, j10);
            if (A != null) {
                if (!A.q() || A.r()) {
                    uVar.a(A, false);
                } else {
                    uVar.t(A.f5171a);
                }
            }
            return A;
        } finally {
            recyclerView.e0(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f5399a.add(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f5400b == 0) {
            this.f5400b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f5142q0.d(i10, i11);
    }

    void g(long j10) {
        b();
        d(j10);
    }

    public void j(RecyclerView recyclerView) {
        this.f5399a.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            androidx.core.os.l.a("RV Prefetch");
            if (!this.f5399a.isEmpty()) {
                int size = this.f5399a.size();
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = this.f5399a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j10 = Math.max(recyclerView.getDrawingTime(), j10);
                    }
                }
                if (j10 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j10) + this.f5401c);
                }
            }
        } finally {
            this.f5400b = 0L;
            androidx.core.os.l.b();
        }
    }
}
