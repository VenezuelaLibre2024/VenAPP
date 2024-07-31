package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.rtsp.C4742j;
import com.google.android.exoplayer2.source.rtsp.C4745m;
import com.google.android.exoplayer2.source.rtsp.C4746n;
import com.google.android.exoplayer2.source.rtsp.C4751s;
import com.google.android.exoplayer2.source.rtsp.C4753u;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.common.collect.AbstractC5907w;
import com.google.common.collect.AbstractC5911y;
import com.google.common.collect.C5867e0;
import com.google.common.collect.C5909x;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.SocketFactory;
import p082eb.C7152h;
import p082eb.C7165u;
import p361t6.C11005b3;
import p363t8.C11137a;
import p363t8.C11172r0;
import p363t8.C11173s;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.source.rtsp.j */
/* loaded from: classes.dex */
public final class C4742j implements Closeable {

    /* renamed from: A */
    private boolean f9401A;

    /* renamed from: B */
    private boolean f9402B;

    /* renamed from: C */
    private boolean f9403C;

    /* renamed from: a */
    private final f f9405a;

    /* renamed from: b */
    private final e f9406b;

    /* renamed from: c */
    private final String f9407c;

    /* renamed from: d */
    private final SocketFactory f9408d;

    /* renamed from: e */
    private final boolean f9409e;

    /* renamed from: t */
    private Uri f9413t;

    /* renamed from: v */
    private C4753u.a f9415v;

    /* renamed from: w */
    private String f9416w;

    /* renamed from: x */
    private b f9417x;

    /* renamed from: y */
    private C4741i f9418y;

    /* renamed from: f */
    private final ArrayDeque<C4746n.d> f9410f = new ArrayDeque<>();

    /* renamed from: r */
    private final SparseArray<C4756x> f9411r = new SparseArray<>();

    /* renamed from: s */
    private final d f9412s = new d();

    /* renamed from: u */
    private C4751s f9414u = new C4751s(new c());

    /* renamed from: D */
    private long f9404D = -9223372036854775807L;

    /* renamed from: z */
    private int f9419z = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.source.rtsp.j$b */
    /* loaded from: classes.dex */
    public final class b implements Runnable, Closeable {

        /* renamed from: a */
        private final Handler f9420a = C11172r0.m34954w();

        /* renamed from: b */
        private final long f9421b;

        /* renamed from: c */
        private boolean f9422c;

        public b(long j10) {
            this.f9421b = j10;
        }

        /* renamed from: a */
        public void m12100a() {
            if (this.f9422c) {
                return;
            }
            this.f9422c = true;
            this.f9420a.postDelayed(this, this.f9421b);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f9422c = false;
            this.f9420a.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C4742j.this.f9412s.m12118e(C4742j.this.f9413t, C4742j.this.f9416w);
            this.f9420a.postDelayed(this, this.f9421b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.source.rtsp.j$c */
    /* loaded from: classes.dex */
    public final class c implements C4751s.d {

        /* renamed from: a */
        private final Handler f9424a = C11172r0.m34954w();

        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void m12105h(List<String> list) {
            C4742j.this.m12065I0(list);
            if (C4753u.m12232d(list)) {
                m12104g(list);
            } else {
                m12103f(list);
            }
        }

        /* renamed from: f */
        private void m12103f(List<String> list) {
            C4742j.this.f9412s.m12117d(Integer.parseInt((String) C11137a.m34603e(C4753u.m12238j(list).f9517c.m12131d("CSeq"))));
        }

        /* renamed from: g */
        private void m12104g(List<String> list) {
            int i10;
            AbstractC5907w<C4728b0> m15081v;
            C4757y m12239k = C4753u.m12239k(list);
            int parseInt = Integer.parseInt((String) C11137a.m34603e(m12239k.f9520b.m12131d("CSeq")));
            C4756x c4756x = (C4756x) C4742j.this.f9411r.get(parseInt);
            if (c4756x == null) {
                return;
            }
            C4742j.this.f9411r.remove(parseInt);
            int i11 = c4756x.f9516b;
            try {
                i10 = m12239k.f9519a;
            } catch (C11005b3 e10) {
                C4742j.this.m12060D0(new RtspMediaSource.C4724c(e10));
                return;
            }
            if (i10 == 200) {
                switch (i11) {
                    case 1:
                    case 3:
                    case 7:
                    case 8:
                    case 9:
                    case 11:
                    case 12:
                        return;
                    case 2:
                        m12106i(new C4744l(i10, C4732d0.m12037b(m12239k.f9521c)));
                        return;
                    case 4:
                        m12107j(new C4754v(i10, C4753u.m12237i(m12239k.f9520b.m12131d("Public"))));
                        return;
                    case 5:
                        m12108k();
                        return;
                    case 6:
                        String m12131d = m12239k.f9520b.m12131d("Range");
                        C4758z m12249d = m12131d == null ? C4758z.f9522c : C4758z.m12249d(m12131d);
                        try {
                            String m12131d2 = m12239k.f9520b.m12131d("RTP-Info");
                            m15081v = m12131d2 == null ? AbstractC5907w.m15081v() : C4728b0.m12002a(m12131d2, C4742j.this.f9413t);
                        } catch (C11005b3 unused) {
                            m15081v = AbstractC5907w.m15081v();
                        }
                        m12109l(new C4755w(m12239k.f9519a, m12249d, m15081v));
                        return;
                    case 10:
                        String m12131d3 = m12239k.f9520b.m12131d("Session");
                        String m12131d4 = m12239k.f9520b.m12131d("Transport");
                        if (m12131d3 == null || m12131d4 == null) {
                            throw C11005b3.m33717c("Missing mandatory session or transport header", null);
                        }
                        m12110m(new C4726a0(m12239k.f9519a, C4753u.m12240l(m12131d3), m12131d4));
                        return;
                    default:
                        throw new IllegalStateException();
                }
                C4742j.this.m12060D0(new RtspMediaSource.C4724c(e10));
                return;
            }
            if (i10 != 401) {
                if (i10 == 301 || i10 == 302) {
                    if (C4742j.this.f9419z != -1) {
                        C4742j.this.f9419z = 0;
                    }
                    String m12131d5 = m12239k.f9520b.m12131d("Location");
                    if (m12131d5 == null) {
                        C4742j.this.f9405a.mo12126b("Redirection without new location.", null);
                        return;
                    }
                    Uri parse = Uri.parse(m12131d5);
                    C4742j.this.f9413t = C4753u.m12243o(parse);
                    C4742j.this.f9415v = C4753u.m12241m(parse);
                    C4742j.this.f9412s.m12116c(C4742j.this.f9413t, C4742j.this.f9416w);
                    return;
                }
            } else if (C4742j.this.f9415v != null && !C4742j.this.f9402B) {
                AbstractC5907w<String> m12132e = m12239k.f9520b.m12132e("WWW-Authenticate");
                if (m12132e.isEmpty()) {
                    throw C11005b3.m33717c("Missing WWW-Authenticate header in a 401 response.", null);
                }
                for (int i12 = 0; i12 < m12132e.size(); i12++) {
                    C4742j.this.f9418y = C4753u.m12242n(m12132e.get(i12));
                    if (C4742j.this.f9418y.f9397a == 2) {
                        break;
                    }
                }
                C4742j.this.f9412s.m12115b();
                C4742j.this.f9402B = true;
                return;
            }
            C4742j c4742j = C4742j.this;
            String m12247s = C4753u.m12247s(i11);
            int i13 = m12239k.f9519a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(m12247s).length() + 12);
            sb2.append(m12247s);
            sb2.append(" ");
            sb2.append(i13);
            c4742j.m12060D0(new RtspMediaSource.C4724c(sb2.toString()));
        }

        /* renamed from: i */
        private void m12106i(C4744l c4744l) {
            C4758z c4758z = C4758z.f9522c;
            String str = c4744l.f9432b.f9329a.get("range");
            if (str != null) {
                try {
                    c4758z = C4758z.m12249d(str);
                } catch (C11005b3 e10) {
                    C4742j.this.f9405a.mo12126b("SDP format error.", e10);
                    return;
                }
            }
            AbstractC5907w<C4750r> m12092z0 = C4742j.m12092z0(c4744l.f9432b, C4742j.this.f9413t);
            if (m12092z0.isEmpty()) {
                C4742j.this.f9405a.mo12126b("No playable track.", null);
            } else {
                C4742j.this.f9405a.mo12127g(c4758z, m12092z0);
                C4742j.this.f9401A = true;
            }
        }

        /* renamed from: j */
        private void m12107j(C4754v c4754v) {
            if (C4742j.this.f9417x != null) {
                return;
            }
            if (C4742j.m12070T0(c4754v.f9511b)) {
                C4742j.this.f9412s.m12116c(C4742j.this.f9413t, C4742j.this.f9416w);
            } else {
                C4742j.this.f9405a.mo12126b("DESCRIBE not supported.", null);
            }
        }

        /* renamed from: k */
        private void m12108k() {
            C11137a.m34605g(C4742j.this.f9419z == 2);
            C4742j.this.f9419z = 1;
            C4742j.this.f9403C = false;
            if (C4742j.this.f9404D != -9223372036854775807L) {
                C4742j c4742j = C4742j.this;
                c4742j.m12099a1(C11172r0.m34910a1(c4742j.f9404D));
            }
        }

        /* renamed from: l */
        private void m12109l(C4755w c4755w) {
            C11137a.m34605g(C4742j.this.f9419z == 1);
            C4742j.this.f9419z = 2;
            if (C4742j.this.f9417x == null) {
                C4742j c4742j = C4742j.this;
                c4742j.f9417x = new b(30000L);
                C4742j.this.f9417x.m12100a();
            }
            C4742j.this.f9404D = -9223372036854775807L;
            C4742j.this.f9406b.mo12125f(C11172r0.m34861C0(c4755w.f9513b.f9524a), c4755w.f9514c);
        }

        /* renamed from: m */
        private void m12110m(C4726a0 c4726a0) {
            C11137a.m34605g(C4742j.this.f9419z != -1);
            C4742j.this.f9419z = 1;
            C4742j.this.f9416w = c4726a0.f9321b.f9508a;
            C4742j.this.m12059B0();
        }

        @Override // com.google.android.exoplayer2.source.rtsp.C4751s.d
        /* renamed from: c */
        public void mo12111c(final List<String> list) {
            this.f9424a.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.k
                @Override // java.lang.Runnable
                public final void run() {
                    C4742j.c.this.m12105h(list);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.source.rtsp.j$d */
    /* loaded from: classes.dex */
    public final class d {

        /* renamed from: a */
        private int f9426a;

        /* renamed from: b */
        private C4756x f9427b;

        private d() {
        }

        /* renamed from: a */
        private C4756x m12112a(int i10, String str, Map<String, String> map, Uri uri) {
            String str2 = C4742j.this.f9407c;
            int i11 = this.f9426a;
            this.f9426a = i11 + 1;
            C4745m.b bVar = new C4745m.b(str2, str, i11);
            if (C4742j.this.f9418y != null) {
                C11137a.m34607i(C4742j.this.f9415v);
                try {
                    bVar.m12134b("Authorization", C4742j.this.f9418y.m12057a(C4742j.this.f9415v, uri, i10));
                } catch (C11005b3 e10) {
                    C4742j.this.m12060D0(new RtspMediaSource.C4724c(e10));
                }
            }
            bVar.m12136d(map);
            return new C4756x(uri, i10, bVar.m12137e(), "");
        }

        /* renamed from: h */
        private void m12113h(C4756x c4756x) {
            int parseInt = Integer.parseInt((String) C11137a.m34603e(c4756x.f9517c.m12131d("CSeq")));
            C11137a.m34605g(C4742j.this.f9411r.get(parseInt) == null);
            C4742j.this.f9411r.append(parseInt, c4756x);
            AbstractC5907w<String> m12244p = C4753u.m12244p(c4756x);
            C4742j.this.m12065I0(m12244p);
            C4742j.this.f9414u.m12213i(m12244p);
            this.f9427b = c4756x;
        }

        /* renamed from: i */
        private void m12114i(C4757y c4757y) {
            AbstractC5907w<String> m12245q = C4753u.m12245q(c4757y);
            C4742j.this.m12065I0(m12245q);
            C4742j.this.f9414u.m12213i(m12245q);
        }

        /* renamed from: b */
        public void m12115b() {
            C11137a.m34607i(this.f9427b);
            C5909x<String, String> m12130b = this.f9427b.f9517c.m12130b();
            HashMap hashMap = new HashMap();
            for (String str : m12130b.keySet()) {
                if (!str.equals("CSeq") && !str.equals("User-Agent") && !str.equals("Session") && !str.equals("Authorization")) {
                    hashMap.put(str, (String) C5867e0.m14838d(m12130b.mo14739p(str)));
                }
            }
            m12113h(m12112a(this.f9427b.f9516b, C4742j.this.f9416w, hashMap, this.f9427b.f9515a));
        }

        /* renamed from: c */
        public void m12116c(Uri uri, String str) {
            m12113h(m12112a(2, str, AbstractC5911y.m15111k(), uri));
        }

        /* renamed from: d */
        public void m12117d(int i10) {
            m12114i(new C4757y(405, new C4745m.b(C4742j.this.f9407c, C4742j.this.f9416w, i10).m12137e()));
            this.f9426a = Math.max(this.f9426a, i10 + 1);
        }

        /* renamed from: e */
        public void m12118e(Uri uri, String str) {
            m12113h(m12112a(4, str, AbstractC5911y.m15111k(), uri));
        }

        /* renamed from: f */
        public void m12119f(Uri uri, String str) {
            C11137a.m34605g(C4742j.this.f9419z == 2);
            m12113h(m12112a(5, str, AbstractC5911y.m15111k(), uri));
            C4742j.this.f9403C = true;
        }

        /* renamed from: g */
        public void m12120g(Uri uri, long j10, String str) {
            boolean z10 = true;
            if (C4742j.this.f9419z != 1 && C4742j.this.f9419z != 2) {
                z10 = false;
            }
            C11137a.m34605g(z10);
            m12113h(m12112a(6, str, AbstractC5911y.m15112l("Range", C4758z.m12248b(j10)), uri));
        }

        /* renamed from: j */
        public void m12121j(Uri uri, String str, String str2) {
            C4742j.this.f9419z = 0;
            m12113h(m12112a(10, str2, AbstractC5911y.m15112l("Transport", str), uri));
        }

        /* renamed from: k */
        public void m12122k(Uri uri, String str) {
            if (C4742j.this.f9419z == -1 || C4742j.this.f9419z == 0) {
                return;
            }
            C4742j.this.f9419z = 0;
            m12113h(m12112a(12, str, AbstractC5911y.m15111k(), uri));
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.rtsp.j$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: c */
        void mo12123c(RtspMediaSource.C4724c c4724c);

        /* renamed from: e */
        void mo12124e();

        /* renamed from: f */
        void mo12125f(long j10, AbstractC5907w<C4728b0> abstractC5907w);
    }

    /* renamed from: com.google.android.exoplayer2.source.rtsp.j$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: b */
        void mo12126b(String str, Throwable th2);

        /* renamed from: g */
        void mo12127g(C4758z c4758z, AbstractC5907w<C4750r> abstractC5907w);
    }

    public C4742j(f fVar, e eVar, String str, Uri uri, SocketFactory socketFactory, boolean z10) {
        this.f9405a = fVar;
        this.f9406b = eVar;
        this.f9407c = str;
        this.f9408d = socketFactory;
        this.f9409e = z10;
        this.f9413t = C4753u.m12243o(uri);
        this.f9415v = C4753u.m12241m(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B0 */
    public void m12059B0() {
        C4746n.d pollFirst = this.f9410f.pollFirst();
        if (pollFirst == null) {
            this.f9406b.mo12124e();
        } else {
            this.f9412s.m12121j(pollFirst.m12189c(), pollFirst.m12190d(), this.f9416w);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D0 */
    public void m12060D0(Throwable th2) {
        RtspMediaSource.C4724c c4724c = th2 instanceof RtspMediaSource.C4724c ? (RtspMediaSource.C4724c) th2 : new RtspMediaSource.C4724c(th2);
        if (this.f9401A) {
            this.f9406b.mo12123c(c4724c);
        } else {
            this.f9405a.mo12126b(C7165u.m21352e(th2.getMessage()), th2);
        }
    }

    /* renamed from: F0 */
    private Socket m12062F0(Uri uri) {
        C11137a.m34599a(uri.getHost() != null);
        return this.f9408d.createSocket((String) C11137a.m34603e(uri.getHost()), uri.getPort() > 0 ? uri.getPort() : 554);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I0 */
    public void m12065I0(List<String> list) {
        if (this.f9409e) {
            C11173s.m34963b("RtspClient", C7152h.m21265g("\n").m21269d(list));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T0 */
    public static boolean m12070T0(List<Integer> list) {
        return list.isEmpty() || list.contains(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public static AbstractC5907w<C4750r> m12092z0(C4730c0 c4730c0, Uri uri) {
        AbstractC5907w.a aVar = new AbstractC5907w.a();
        for (int i10 = 0; i10 < c4730c0.f9330b.size(); i10++) {
            C4725a c4725a = c4730c0.f9330b.get(i10);
            if (C4739h.m12054b(c4725a)) {
                aVar.mo14724a(new C4750r(c4725a, uri));
            }
        }
        return aVar.m15094k();
    }

    /* renamed from: H0 */
    public int m12093H0() {
        return this.f9419z;
    }

    /* renamed from: J0 */
    public void m12094J0(int i10, C4751s.b bVar) {
        this.f9414u.m12212g(i10, bVar);
    }

    /* renamed from: L0 */
    public void m12095L0() {
        try {
            close();
            C4751s c4751s = new C4751s(new c());
            this.f9414u = c4751s;
            c4751s.m12211f(m12062F0(this.f9413t));
            this.f9416w = null;
            this.f9402B = false;
            this.f9418y = null;
        } catch (IOException e10) {
            this.f9406b.mo12123c(new RtspMediaSource.C4724c(e10));
        }
    }

    /* renamed from: R0 */
    public void m12096R0(long j10) {
        if (this.f9419z == 2 && !this.f9403C) {
            this.f9412s.m12119f(this.f9413t, (String) C11137a.m34603e(this.f9416w));
        }
        this.f9404D = j10;
    }

    /* renamed from: W0 */
    public void m12097W0(List<C4746n.d> list) {
        this.f9410f.addAll(list);
        m12059B0();
    }

    /* renamed from: Y0 */
    public void m12098Y0() {
        try {
            this.f9414u.m12211f(m12062F0(this.f9413t));
            this.f9412s.m12118e(this.f9413t, this.f9416w);
        } catch (IOException e10) {
            C11172r0.m34936n(this.f9414u);
            throw e10;
        }
    }

    /* renamed from: a1 */
    public void m12099a1(long j10) {
        this.f9412s.m12120g(this.f9413t, j10, (String) C11137a.m34603e(this.f9416w));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b bVar = this.f9417x;
        if (bVar != null) {
            bVar.close();
            this.f9417x = null;
            this.f9412s.m12122k(this.f9413t, (String) C11137a.m34603e(this.f9416w));
        }
        this.f9414u.close();
    }
}
