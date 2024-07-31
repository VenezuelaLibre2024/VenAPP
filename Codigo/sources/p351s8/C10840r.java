package p351s8;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p351s8.C10841s;
import p351s8.InterfaceC10827j;
import p363t8.C11137a;
import p363t8.C11172r0;
import p363t8.C11173s;

/* renamed from: s8.r */
/* loaded from: classes.dex */
public final class C10840r implements InterfaceC10827j {

    /* renamed from: a */
    private final Context f27472a;

    /* renamed from: b */
    private final List<InterfaceC10834m0> f27473b = new ArrayList();

    /* renamed from: c */
    private final InterfaceC10827j f27474c;

    /* renamed from: d */
    private InterfaceC10827j f27475d;

    /* renamed from: e */
    private InterfaceC10827j f27476e;

    /* renamed from: f */
    private InterfaceC10827j f27477f;

    /* renamed from: g */
    private InterfaceC10827j f27478g;

    /* renamed from: h */
    private InterfaceC10827j f27479h;

    /* renamed from: i */
    private InterfaceC10827j f27480i;

    /* renamed from: j */
    private InterfaceC10827j f27481j;

    /* renamed from: k */
    private InterfaceC10827j f27482k;

    /* renamed from: s8.r$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC10827j.a {

        /* renamed from: a */
        private final Context f27483a;

        /* renamed from: b */
        private final InterfaceC10827j.a f27484b;

        /* renamed from: c */
        private InterfaceC10834m0 f27485c;

        public a(Context context) {
            this(context, new C10841s.b());
        }

        public a(Context context, InterfaceC10827j.a aVar) {
            this.f27483a = context.getApplicationContext();
            this.f27484b = aVar;
        }

        @Override // p351s8.InterfaceC10827j.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10840r mo33002a() {
            C10840r c10840r = new C10840r(this.f27483a, this.f27484b.mo33002a());
            InterfaceC10834m0 interfaceC10834m0 = this.f27485c;
            if (interfaceC10834m0 != null) {
                c10840r.mo161l(interfaceC10834m0);
            }
            return c10840r;
        }
    }

    public C10840r(Context context, InterfaceC10827j interfaceC10827j) {
        this.f27472a = context.getApplicationContext();
        this.f27474c = (InterfaceC10827j) C11137a.m34603e(interfaceC10827j);
    }

    /* renamed from: h */
    private void m33055h(InterfaceC10827j interfaceC10827j) {
        for (int i10 = 0; i10 < this.f27473b.size(); i10++) {
            interfaceC10827j.mo161l(this.f27473b.get(i10));
        }
    }

    /* renamed from: r */
    private InterfaceC10827j m33056r() {
        if (this.f27476e == null) {
            C10813c c10813c = new C10813c(this.f27472a);
            this.f27476e = c10813c;
            m33055h(c10813c);
        }
        return this.f27476e;
    }

    /* renamed from: s */
    private InterfaceC10827j m33057s() {
        if (this.f27477f == null) {
            C10821g c10821g = new C10821g(this.f27472a);
            this.f27477f = c10821g;
            m33055h(c10821g);
        }
        return this.f27477f;
    }

    /* renamed from: t */
    private InterfaceC10827j m33058t() {
        if (this.f27480i == null) {
            C10825i c10825i = new C10825i();
            this.f27480i = c10825i;
            m33055h(c10825i);
        }
        return this.f27480i;
    }

    /* renamed from: u */
    private InterfaceC10827j m33059u() {
        if (this.f27475d == null) {
            C10845w c10845w = new C10845w();
            this.f27475d = c10845w;
            m33055h(c10845w);
        }
        return this.f27475d;
    }

    /* renamed from: v */
    private InterfaceC10827j m33060v() {
        if (this.f27481j == null) {
            C10824h0 c10824h0 = new C10824h0(this.f27472a);
            this.f27481j = c10824h0;
            m33055h(c10824h0);
        }
        return this.f27481j;
    }

    /* renamed from: w */
    private InterfaceC10827j m33061w() {
        if (this.f27478g == null) {
            try {
                InterfaceC10827j interfaceC10827j = (InterfaceC10827j) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f27478g = interfaceC10827j;
                m33055h(interfaceC10827j);
            } catch (ClassNotFoundException unused) {
                C11173s.m34970i("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f27478g == null) {
                this.f27478g = this.f27474c;
            }
        }
        return this.f27478g;
    }

    /* renamed from: x */
    private InterfaceC10827j m33062x() {
        if (this.f27479h == null) {
            C10836n0 c10836n0 = new C10836n0();
            this.f27479h = c10836n0;
            m33055h(c10836n0);
        }
        return this.f27479h;
    }

    /* renamed from: y */
    private void m33063y(InterfaceC10827j interfaceC10827j, InterfaceC10834m0 interfaceC10834m0) {
        if (interfaceC10827j != null) {
            interfaceC10827j.mo161l(interfaceC10834m0);
        }
    }

    @Override // p351s8.InterfaceC10827j
    public void close() {
        InterfaceC10827j interfaceC10827j = this.f27482k;
        if (interfaceC10827j != null) {
            try {
                interfaceC10827j.close();
            } finally {
                this.f27482k = null;
            }
        }
    }

    @Override // p351s8.InterfaceC10827j
    /* renamed from: e */
    public Map<String, List<String>> mo159e() {
        InterfaceC10827j interfaceC10827j = this.f27482k;
        return interfaceC10827j == null ? Collections.emptyMap() : interfaceC10827j.mo159e();
    }

    @Override // p351s8.InterfaceC10827j
    public Uri getUri() {
        InterfaceC10827j interfaceC10827j = this.f27482k;
        if (interfaceC10827j == null) {
            return null;
        }
        return interfaceC10827j.getUri();
    }

    @Override // p351s8.InterfaceC10827j
    /* renamed from: l */
    public void mo161l(InterfaceC10834m0 interfaceC10834m0) {
        C11137a.m34603e(interfaceC10834m0);
        this.f27474c.mo161l(interfaceC10834m0);
        this.f27473b.add(interfaceC10834m0);
        m33063y(this.f27475d, interfaceC10834m0);
        m33063y(this.f27476e, interfaceC10834m0);
        m33063y(this.f27477f, interfaceC10834m0);
        m33063y(this.f27478g, interfaceC10834m0);
        m33063y(this.f27479h, interfaceC10834m0);
        m33063y(this.f27480i, interfaceC10834m0);
        m33063y(this.f27481j, interfaceC10834m0);
    }

    @Override // p351s8.InterfaceC10827j
    /* renamed from: o */
    public long mo162o(C10835n c10835n) {
        InterfaceC10827j m33057s;
        C11137a.m34605g(this.f27482k == null);
        String scheme = c10835n.f27407a.getScheme();
        if (C11172r0.m34955w0(c10835n.f27407a)) {
            String path = c10835n.f27407a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                m33057s = m33059u();
            }
            m33057s = m33056r();
        } else {
            if (!"asset".equals(scheme)) {
                m33057s = "content".equals(scheme) ? m33057s() : "rtmp".equals(scheme) ? m33061w() : "udp".equals(scheme) ? m33062x() : "data".equals(scheme) ? m33058t() : ("rawresource".equals(scheme) || "android.resource".equals(scheme)) ? m33060v() : this.f27474c;
            }
            m33057s = m33056r();
        }
        this.f27482k = m33057s;
        return this.f27482k.mo162o(c10835n);
    }

    @Override // p351s8.InterfaceC10823h
    public int read(byte[] bArr, int i10, int i11) {
        return ((InterfaceC10827j) C11137a.m34603e(this.f27482k)).read(bArr, i10, i11);
    }
}
