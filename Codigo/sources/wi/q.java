package wi;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final d f30157a;

    /* renamed from: b, reason: collision with root package name */
    private final xi.c f30158b;

    /* renamed from: c, reason: collision with root package name */
    private int f30159c = 65535;

    /* renamed from: d, reason: collision with root package name */
    private final c f30160d = new c(0, 65535, null);

    /* loaded from: classes3.dex */
    public interface b {
        void b(int i10);
    }

    /* loaded from: classes3.dex */
    public final class c {

        /* renamed from: b, reason: collision with root package name */
        private Runnable f30162b;

        /* renamed from: c, reason: collision with root package name */
        private final int f30163c;

        /* renamed from: d, reason: collision with root package name */
        private int f30164d;

        /* renamed from: e, reason: collision with root package name */
        private int f30165e;

        /* renamed from: f, reason: collision with root package name */
        private final b f30166f;

        /* renamed from: a, reason: collision with root package name */
        private final dm.b f30161a = new dm.b();

        /* renamed from: g, reason: collision with root package name */
        private boolean f30167g = false;

        c(int i10, int i11, b bVar) {
            this.f30163c = i10;
            this.f30164d = i11;
            this.f30166f = bVar;
        }

        void a(int i10) {
            this.f30165e += i10;
        }

        int b() {
            return this.f30165e;
        }

        void c() {
            this.f30165e = 0;
        }

        void d(dm.b bVar, int i10, boolean z10) {
            this.f30161a.K0(bVar, i10);
            this.f30167g |= z10;
        }

        boolean e() {
            return this.f30161a.size() > 0;
        }

        int f(int i10) {
            if (i10 <= 0 || a.e.API_PRIORITY_OTHER - i10 >= this.f30164d) {
                int i11 = this.f30164d + i10;
                this.f30164d = i11;
                return i11;
            }
            throw new IllegalArgumentException("Window size overflow for stream: " + this.f30163c);
        }

        int g() {
            return Math.max(0, Math.min(this.f30164d, (int) this.f30161a.size()));
        }

        int h() {
            return g() - this.f30165e;
        }

        int i() {
            return this.f30164d;
        }

        int j() {
            return Math.min(this.f30164d, q.this.f30160d.i());
        }

        void k(dm.b bVar, int i10, boolean z10) {
            do {
                int min = Math.min(i10, q.this.f30158b.p0());
                int i11 = -min;
                q.this.f30160d.f(i11);
                f(i11);
                try {
                    q.this.f30158b.X0(bVar.size() == ((long) min) && z10, this.f30163c, bVar, min);
                    this.f30166f.b(min);
                    i10 -= min;
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            } while (i10 > 0);
        }

        int l(int i10, e eVar) {
            Runnable runnable;
            int min = Math.min(i10, j());
            int i11 = 0;
            while (e() && min > 0) {
                if (min >= this.f30161a.size()) {
                    i11 += (int) this.f30161a.size();
                    dm.b bVar = this.f30161a;
                    k(bVar, (int) bVar.size(), this.f30167g);
                } else {
                    i11 += min;
                    k(this.f30161a, min, false);
                }
                eVar.b();
                min = Math.min(i10 - i11, j());
            }
            if (!e() && (runnable = this.f30162b) != null) {
                runnable.run();
                this.f30162b = null;
            }
            return i11;
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        c[] a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        int f30169a;

        private e() {
        }

        boolean a() {
            return this.f30169a > 0;
        }

        void b() {
            this.f30169a++;
        }
    }

    public q(d dVar, xi.c cVar) {
        this.f30157a = (d) eb.o.p(dVar, "transport");
        this.f30158b = (xi.c) eb.o.p(cVar, "frameWriter");
    }

    public c c(b bVar, int i10) {
        return new c(i10, this.f30159c, (b) eb.o.p(bVar, "stream"));
    }

    public void d(boolean z10, c cVar, dm.b bVar, boolean z11) {
        eb.o.p(bVar, "source");
        int j10 = cVar.j();
        boolean e10 = cVar.e();
        int size = (int) bVar.size();
        if (e10 || j10 < size) {
            if (!e10 && j10 > 0) {
                cVar.k(bVar, j10, false);
            }
            cVar.d(bVar, (int) bVar.size(), z10);
        } else {
            cVar.k(bVar, size, z10);
        }
        if (z11) {
            e();
        }
    }

    public void e() {
        try {
            this.f30158b.flush();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean f(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Invalid initial window size: " + i10);
        }
        int i11 = i10 - this.f30159c;
        this.f30159c = i10;
        for (c cVar : this.f30157a.a()) {
            cVar.f(i11);
        }
        return i11 > 0;
    }

    public int g(c cVar, int i10) {
        if (cVar == null) {
            int f10 = this.f30160d.f(i10);
            h();
            return f10;
        }
        int f11 = cVar.f(i10);
        e eVar = new e();
        cVar.l(cVar.j(), eVar);
        if (eVar.a()) {
            e();
        }
        return f11;
    }

    public void h() {
        int i10;
        c[] a10 = this.f30157a.a();
        Collections.shuffle(Arrays.asList(a10));
        int i11 = this.f30160d.i();
        int length = a10.length;
        while (true) {
            i10 = 0;
            if (length <= 0 || i11 <= 0) {
                break;
            }
            int ceil = (int) Math.ceil(i11 / length);
            for (int i12 = 0; i12 < length && i11 > 0; i12++) {
                c cVar = a10[i12];
                int min = Math.min(i11, Math.min(cVar.h(), ceil));
                if (min > 0) {
                    cVar.a(min);
                    i11 -= min;
                }
                if (cVar.h() > 0) {
                    a10[i10] = cVar;
                    i10++;
                }
            }
            length = i10;
        }
        e eVar = new e();
        c[] a11 = this.f30157a.a();
        int length2 = a11.length;
        while (i10 < length2) {
            c cVar2 = a11[i10];
            cVar2.l(cVar2.b(), eVar);
            cVar2.c();
            i10++;
        }
        if (eVar.a()) {
            e();
        }
    }
}
