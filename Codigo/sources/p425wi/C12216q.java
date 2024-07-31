package p425wi;

import com.google.android.gms.common.api.C5101a;
import dm.C7056b;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import p082eb.C7159o;
import p448xi.InterfaceC12490c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wi.q */
/* loaded from: classes3.dex */
public class C12216q {

    /* renamed from: a */
    private final d f32669a;

    /* renamed from: b */
    private final InterfaceC12490c f32670b;

    /* renamed from: c */
    private int f32671c = 65535;

    /* renamed from: d */
    private final c f32672d = new c(0, 65535, null);

    /* renamed from: wi.q$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: b */
        void m39327b(int i10);
    }

    /* renamed from: wi.q$c */
    /* loaded from: classes3.dex */
    public final class c {

        /* renamed from: b */
        private Runnable f32674b;

        /* renamed from: c */
        private final int f32675c;

        /* renamed from: d */
        private int f32676d;

        /* renamed from: e */
        private int f32677e;

        /* renamed from: f */
        private final b f32678f;

        /* renamed from: a */
        private final C7056b f32673a = new C7056b();

        /* renamed from: g */
        private boolean f32679g = false;

        c(int i10, int i11, b bVar) {
            this.f32675c = i10;
            this.f32676d = i11;
            this.f32678f = bVar;
        }

        /* renamed from: a */
        void m39328a(int i10) {
            this.f32677e += i10;
        }

        /* renamed from: b */
        int m39329b() {
            return this.f32677e;
        }

        /* renamed from: c */
        void m39330c() {
            this.f32677e = 0;
        }

        /* renamed from: d */
        void m39331d(C7056b c7056b, int i10, boolean z10) {
            this.f32673a.mo19710K0(c7056b, i10);
            this.f32679g |= z10;
        }

        /* renamed from: e */
        boolean m39332e() {
            return this.f32673a.size() > 0;
        }

        /* renamed from: f */
        int m39333f(int i10) {
            if (i10 <= 0 || C5101a.e.API_PRIORITY_OTHER - i10 >= this.f32676d) {
                int i11 = this.f32676d + i10;
                this.f32676d = i11;
                return i11;
            }
            throw new IllegalArgumentException("Window size overflow for stream: " + this.f32675c);
        }

        /* renamed from: g */
        int m39334g() {
            return Math.max(0, Math.min(this.f32676d, (int) this.f32673a.size()));
        }

        /* renamed from: h */
        int m39335h() {
            return m39334g() - this.f32677e;
        }

        /* renamed from: i */
        int m39336i() {
            return this.f32676d;
        }

        /* renamed from: j */
        int m39337j() {
            return Math.min(this.f32676d, C12216q.this.f32672d.m39336i());
        }

        /* renamed from: k */
        void m39338k(C7056b c7056b, int i10, boolean z10) {
            do {
                int min = Math.min(i10, C12216q.this.f32670b.mo39175p0());
                int i11 = -min;
                C12216q.this.f32672d.m39333f(i11);
                m39333f(i11);
                try {
                    C12216q.this.f32670b.mo39173X0(c7056b.size() == ((long) min) && z10, this.f32675c, c7056b, min);
                    this.f32678f.m39327b(min);
                    i10 -= min;
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            } while (i10 > 0);
        }

        /* renamed from: l */
        int m39339l(int i10, e eVar) {
            Runnable runnable;
            int min = Math.min(i10, m39337j());
            int i11 = 0;
            while (m39332e() && min > 0) {
                if (min >= this.f32673a.size()) {
                    i11 += (int) this.f32673a.size();
                    C7056b c7056b = this.f32673a;
                    m39338k(c7056b, (int) c7056b.size(), this.f32679g);
                } else {
                    i11 += min;
                    m39338k(this.f32673a, min, false);
                }
                eVar.m39341b();
                min = Math.min(i10 - i11, m39337j());
            }
            if (!m39332e() && (runnable = this.f32674b) != null) {
                runnable.run();
                this.f32674b = null;
            }
            return i11;
        }
    }

    /* renamed from: wi.q$d */
    /* loaded from: classes3.dex */
    public interface d {
        /* renamed from: a */
        c[] mo39272a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wi.q$e */
    /* loaded from: classes3.dex */
    public static final class e {

        /* renamed from: a */
        int f32681a;

        private e() {
        }

        /* renamed from: a */
        boolean m39340a() {
            return this.f32681a > 0;
        }

        /* renamed from: b */
        void m39341b() {
            this.f32681a++;
        }
    }

    public C12216q(d dVar, InterfaceC12490c interfaceC12490c) {
        this.f32669a = (d) C7159o.m21313p(dVar, "transport");
        this.f32670b = (InterfaceC12490c) C7159o.m21313p(interfaceC12490c, "frameWriter");
    }

    /* renamed from: c */
    public c m39321c(b bVar, int i10) {
        return new c(i10, this.f32671c, (b) C7159o.m21313p(bVar, "stream"));
    }

    /* renamed from: d */
    public void m39322d(boolean z10, c cVar, C7056b c7056b, boolean z11) {
        C7159o.m21313p(c7056b, "source");
        int m39337j = cVar.m39337j();
        boolean m39332e = cVar.m39332e();
        int size = (int) c7056b.size();
        if (m39332e || m39337j < size) {
            if (!m39332e && m39337j > 0) {
                cVar.m39338k(c7056b, m39337j, false);
            }
            cVar.m39331d(c7056b, (int) c7056b.size(), z10);
        } else {
            cVar.m39338k(c7056b, size, z10);
        }
        if (z11) {
            m39323e();
        }
    }

    /* renamed from: e */
    public void m39323e() {
        try {
            this.f32670b.flush();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: f */
    public boolean m39324f(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Invalid initial window size: " + i10);
        }
        int i11 = i10 - this.f32671c;
        this.f32671c = i10;
        for (c cVar : this.f32669a.mo39272a()) {
            cVar.m39333f(i11);
        }
        return i11 > 0;
    }

    /* renamed from: g */
    public int m39325g(c cVar, int i10) {
        if (cVar == null) {
            int m39333f = this.f32672d.m39333f(i10);
            m39326h();
            return m39333f;
        }
        int m39333f2 = cVar.m39333f(i10);
        e eVar = new e();
        cVar.m39339l(cVar.m39337j(), eVar);
        if (eVar.m39340a()) {
            m39323e();
        }
        return m39333f2;
    }

    /* renamed from: h */
    public void m39326h() {
        int i10;
        c[] mo39272a = this.f32669a.mo39272a();
        Collections.shuffle(Arrays.asList(mo39272a));
        int m39336i = this.f32672d.m39336i();
        int length = mo39272a.length;
        while (true) {
            i10 = 0;
            if (length <= 0 || m39336i <= 0) {
                break;
            }
            int ceil = (int) Math.ceil(m39336i / length);
            for (int i11 = 0; i11 < length && m39336i > 0; i11++) {
                c cVar = mo39272a[i11];
                int min = Math.min(m39336i, Math.min(cVar.m39335h(), ceil));
                if (min > 0) {
                    cVar.m39328a(min);
                    m39336i -= min;
                }
                if (cVar.m39335h() > 0) {
                    mo39272a[i10] = cVar;
                    i10++;
                }
            }
            length = i10;
        }
        e eVar = new e();
        c[] mo39272a2 = this.f32669a.mo39272a();
        int length2 = mo39272a2.length;
        while (i10 < length2) {
            c cVar2 = mo39272a2[i10];
            cVar2.m39339l(cVar2.m39329b(), eVar);
            cVar2.m39330c();
            i10++;
        }
        if (eVar.m39340a()) {
            m39323e();
        }
    }
}
