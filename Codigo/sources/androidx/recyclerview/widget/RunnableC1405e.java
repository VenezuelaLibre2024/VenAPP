package androidx.recyclerview.widget;

import androidx.core.os.C0953l;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.e */
/* loaded from: classes.dex */
public final class RunnableC1405e implements Runnable {

    /* renamed from: e */
    static final ThreadLocal<RunnableC1405e> f6222e = new ThreadLocal<>();

    /* renamed from: f */
    static Comparator<c> f6223f = new a();

    /* renamed from: b */
    long f6225b;

    /* renamed from: c */
    long f6226c;

    /* renamed from: a */
    ArrayList<RecyclerView> f6224a = new ArrayList<>();

    /* renamed from: d */
    private ArrayList<c> f6227d = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.e$a */
    /* loaded from: classes.dex */
    class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f6235d;
            if ((recyclerView == null) != (cVar2.f6235d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f6232a;
            if (z10 != cVar2.f6232a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f6233b - cVar.f6233b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f6234c - cVar2.f6234c;
            if (i11 != 0) {
                return i11;
            }
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.e$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        int f6228a;

        /* renamed from: b */
        int f6229b;

        /* renamed from: c */
        int[] f6230c;

        /* renamed from: d */
        int f6231d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m8050a() {
            int[] iArr = this.f6230c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f6231d = 0;
        }

        /* renamed from: b */
        void m8051b(RecyclerView recyclerView, boolean z10) {
            this.f6231d = 0;
            int[] iArr = this.f6230c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC1382n abstractC1382n = recyclerView.f5962w;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean m8052c(int i10) {
            if (this.f6230c != null) {
                int i11 = this.f6231d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f6230c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: d */
        void m8053d(int i10, int i11) {
            this.f6228a = i10;
            this.f6229b = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.e$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public boolean f6232a;

        /* renamed from: b */
        public int f6233b;

        /* renamed from: c */
        public int f6234c;

        /* renamed from: d */
        public RecyclerView f6235d;

        /* renamed from: e */
        public int f6236e;

        c() {
        }

        /* renamed from: a */
        public void m8054a() {
            this.f6232a = false;
            this.f6233b = 0;
            this.f6234c = 0;
            this.f6235d = null;
            this.f6236e = 0;
        }
    }

    /* renamed from: b */
    private void m8039b() {
        c cVar;
        int size = this.f6224a.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = this.f6224a.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f5951q0.m8051b(recyclerView, false);
                i10 += recyclerView.f5951q0.f6231d;
            }
        }
        this.f6227d.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = this.f6224a.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f5951q0;
                int abs = Math.abs(bVar.f6228a) + Math.abs(bVar.f6229b);
                for (int i14 = 0; i14 < bVar.f6231d * 2; i14 += 2) {
                    if (i12 >= this.f6227d.size()) {
                        cVar = new c();
                        this.f6227d.add(cVar);
                    } else {
                        cVar = this.f6227d.get(i12);
                    }
                    int[] iArr = bVar.f6230c;
                    int i15 = iArr[i14 + 1];
                    cVar.f6232a = i15 <= abs;
                    cVar.f6233b = abs;
                    cVar.f6234c = i15;
                    cVar.f6235d = recyclerView2;
                    cVar.f6236e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f6227d, f6223f);
    }

    /* renamed from: c */
    private void m8040c(c cVar, long j10) {
        RecyclerView.AbstractC1370b0 m8044i = m8044i(cVar.f6235d, cVar.f6236e, cVar.f6232a ? Long.MAX_VALUE : j10);
        if (m8044i == null || m8044i.f5981b == null || !m8044i.m7755q() || m8044i.m7756r()) {
            return;
        }
        m8043h(m8044i.f5981b.get(), j10);
    }

    /* renamed from: d */
    private void m8041d(long j10) {
        for (int i10 = 0; i10 < this.f6227d.size(); i10++) {
            c cVar = this.f6227d.get(i10);
            if (cVar.f6235d == null) {
                return;
            }
            m8040c(cVar, j10);
            cVar.m8054a();
        }
    }

    /* renamed from: e */
    static boolean m8042e(RecyclerView recyclerView, int i10) {
        int m7997g = recyclerView.f5937e.m7997g();
        for (int i11 = 0; i11 < m7997g; i11++) {
            RecyclerView.AbstractC1370b0 m7640I = RecyclerView.m7640I(recyclerView.f5937e.m7996f(i11));
            if (m7640I.f5982c == i10 && !m7640I.m7756r()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m8043h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f5920O && recyclerView.f5937e.m7997g() != 0) {
            recyclerView.m7705n0();
        }
        b bVar = recyclerView.f5951q0;
        bVar.m8051b(recyclerView, true);
        if (bVar.f6231d != 0) {
            try {
                C0953l.m4733a("RV Nested Prefetch");
                recyclerView.f5953r0.m7922c(null);
                for (int i10 = 0; i10 < bVar.f6231d * 2; i10 += 2) {
                    m8044i(recyclerView, bVar.f6230c[i10], j10);
                }
            } finally {
                C0953l.m4734b();
            }
        }
    }

    /* renamed from: i */
    private RecyclerView.AbstractC1370b0 m8044i(RecyclerView recyclerView, int i10, long j10) {
        if (m8042e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.C1389u c1389u = recyclerView.f5931b;
        try {
            recyclerView.m7691c0();
            RecyclerView.AbstractC1370b0 m7885A = c1389u.m7885A(i10, false, j10);
            if (m7885A != null) {
                if (!m7885A.m7755q() || m7885A.m7756r()) {
                    c1389u.m7890a(m7885A, false);
                } else {
                    c1389u.m7909t(m7885A.f5980a);
                }
            }
            return m7885A;
        } finally {
            recyclerView.m7695e0(false);
        }
    }

    /* renamed from: a */
    public void m8045a(RecyclerView recyclerView) {
        this.f6224a.add(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m8046f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f6225b == 0) {
            this.f6225b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f5951q0.m8053d(i10, i11);
    }

    /* renamed from: g */
    void m8047g(long j10) {
        m8039b();
        m8041d(j10);
    }

    /* renamed from: j */
    public void m8048j(RecyclerView recyclerView) {
        this.f6224a.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C0953l.m4733a("RV Prefetch");
            if (!this.f6224a.isEmpty()) {
                int size = this.f6224a.size();
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = this.f6224a.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j10 = Math.max(recyclerView.getDrawingTime(), j10);
                    }
                }
                if (j10 != 0) {
                    m8047g(TimeUnit.MILLISECONDS.toNanos(j10) + this.f6226c);
                }
            }
        } finally {
            this.f6225b = 0L;
            C0953l.m4734b();
        }
    }
}
