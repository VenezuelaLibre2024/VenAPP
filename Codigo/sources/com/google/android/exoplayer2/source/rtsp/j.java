package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import com.google.android.exoplayer2.source.rtsp.j;
import com.google.android.exoplayer2.source.rtsp.m;
import com.google.android.exoplayer2.source.rtsp.n;
import com.google.android.exoplayer2.source.rtsp.s;
import com.google.android.exoplayer2.source.rtsp.u;
import com.google.common.collect.w;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.SocketFactory;
import t6.b3;
import t8.r0;

/* loaded from: classes.dex */
public final class j implements Closeable {
    private boolean A;
    private boolean B;
    private boolean C;

    /* renamed from: a */
    private final f f8357a;

    /* renamed from: b */
    private final e f8358b;

    /* renamed from: c */
    private final String f8359c;

    /* renamed from: d */
    private final SocketFactory f8360d;

    /* renamed from: e */
    private final boolean f8361e;

    /* renamed from: t */
    private Uri f8365t;

    /* renamed from: v */
    private u.a f8367v;

    /* renamed from: w */
    private String f8368w;

    /* renamed from: x */
    private b f8369x;

    /* renamed from: y */
    private i f8370y;

    /* renamed from: f */
    private final ArrayDeque<n.d> f8362f = new ArrayDeque<>();

    /* renamed from: r */
    private final SparseArray<x> f8363r = new SparseArray<>();

    /* renamed from: s */
    private final d f8364s = new d();

    /* renamed from: u */
    private s f8366u = new s(new c());
    private long D = -9223372036854775807L;

    /* renamed from: z */
    private int f8371z = -1;

    /* loaded from: classes.dex */
    public final class b implements Runnable, Closeable {

        /* renamed from: a */
        private final Handler f8372a = r0.w();

        /* renamed from: b */
        private final long f8373b;

        /* renamed from: c */
        private boolean f8374c;

        public b(long j10) {
            this.f8373b = j10;
        }

        public void a() {
            if (this.f8374c) {
                return;
            }
            this.f8374c = true;
            this.f8372a.postDelayed(this, this.f8373b);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f8374c = false;
            this.f8372a.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f8364s.e(j.this.f8365t, j.this.f8368w);
            this.f8372a.postDelayed(this, this.f8373b);
        }
    }

    /* loaded from: classes.dex */
    public final class c implements s.d {

        /* renamed from: a */
        private final Handler f8376a = r0.w();

        public c() {
        }

        /* renamed from: e */
        public void h(List<String> list) {
            j.this.I0(list);
            if (u.d(list)) {
                g(list);
            } else {
                f(list);
            }
        }

        private void f(List<String> list) {
            j.this.f8364s.d(Integer.parseInt((String) t8.a.e(u.j(list).f8462c.d("CSeq"))));
        }

        private void g(List<String> list) {
            int i10;
            com.google.common.collect.w<b0> v10;
            y k10 = u.k(list);
            int parseInt = Integer.parseInt((String) t8.a.e(k10.f8465b.d("CSeq")));
            x xVar = (x) j.this.f8363r.get(parseInt);
            if (xVar == null) {
                return;
            }
            j.this.f8363r.remove(parseInt);
            int i11 = xVar.f8461b;
            try {
                i10 = k10.f8464a;
            } catch (b3 e10) {
                j.this.D0(new RtspMediaSource.c(e10));
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
                        i(new l(i10, d0.b(k10.f8466c)));
                        return;
                    case 4:
                        j(new v(i10, u.i(k10.f8465b.d("Public"))));
                        return;
                    case 5:
                        k();
                        return;
                    case 6:
                        String d10 = k10.f8465b.d("Range");
                        z d11 = d10 == null ? z.f8467c : z.d(d10);
                        try {
                            String d12 = k10.f8465b.d("RTP-Info");
                            v10 = d12 == null ? com.google.common.collect.w.v() : b0.a(d12, j.this.f8365t);
                        } catch (b3 unused) {
                            v10 = com.google.common.collect.w.v();
                        }
                        l(new w(k10.f8464a, d11, v10));
                        return;
                    case 10:
                        String d13 = k10.f8465b.d("Session");
                        String d14 = k10.f8465b.d("Transport");
                        if (d13 == null || d14 == null) {
                            throw b3.c("Missing mandatory session or transport header", null);
                        }
                        m(new a0(k10.f8464a, u.l(d13), d14));
                        return;
                    default:
                        throw new IllegalStateException();
                }
                j.this.D0(new RtspMediaSource.c(e10));
                return;
            }
            if (i10 != 401) {
                if (i10 == 301 || i10 == 302) {
                    if (j.this.f8371z != -1) {
                        j.this.f8371z = 0;
                    }
                    String d15 = k10.f8465b.d("Location");
                    if (d15 == null) {
                        j.this.f8357a.b("Redirection without new location.", null);
                        return;
                    }
                    Uri parse = Uri.parse(d15);
                    j.this.f8365t = u.o(parse);
                    j.this.f8367v = u.m(parse);
                    j.this.f8364s.c(j.this.f8365t, j.this.f8368w);
                    return;
                }
            } else if (j.this.f8367v != null && !j.this.B) {
                com.google.common.collect.w<String> e11 = k10.f8465b.e("WWW-Authenticate");
                if (e11.isEmpty()) {
                    throw b3.c("Missing WWW-Authenticate header in a 401 response.", null);
                }
                for (int i12 = 0; i12 < e11.size(); i12++) {
                    j.this.f8370y = u.n(e11.get(i12));
                    if (j.this.f8370y.f8353a == 2) {
                        break;
                    }
                }
                j.this.f8364s.b();
                j.this.B = true;
                return;
            }
            j jVar = j.this;
            String s10 = u.s(i11);
            int i13 = k10.f8464a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(s10).length() + 12);
            sb2.append(s10);
            sb2.append(" ");
            sb2.append(i13);
            jVar.D0(new RtspMediaSource.c(sb2.toString()));
        }

        private void i(l lVar) {
            z zVar = z.f8467c;
            String str = lVar.f8384b.f8285a.get("range");
            if (str != null) {
                try {
                    zVar = z.d(str);
                } catch (b3 e10) {
                    j.this.f8357a.b("SDP format error.", e10);
                    return;
                }
            }
            com.google.common.collect.w<r> z02 = j.z0(lVar.f8384b, j.this.f8365t);
            if (z02.isEmpty()) {
                j.this.f8357a.b("No playable track.", null);
            } else {
                j.this.f8357a.g(zVar, z02);
                j.this.A = true;
            }
        }

        private void j(v vVar) {
            if (j.this.f8369x != null) {
                return;
            }
            if (j.T0(vVar.f8456b)) {
                j.this.f8364s.c(j.this.f8365t, j.this.f8368w);
            } else {
                j.this.f8357a.b("DESCRIBE not supported.", null);
            }
        }

        private void k() {
            t8.a.g(j.this.f8371z == 2);
            j.this.f8371z = 1;
            j.this.C = false;
            if (j.this.D != -9223372036854775807L) {
                j jVar = j.this;
                jVar.a1(r0.a1(jVar.D));
            }
        }

        private void l(w wVar) {
            t8.a.g(j.this.f8371z == 1);
            j.this.f8371z = 2;
            if (j.this.f8369x == null) {
                j jVar = j.this;
                jVar.f8369x = new b(30000L);
                j.this.f8369x.a();
            }
            j.this.D = -9223372036854775807L;
            j.this.f8358b.f(r0.C0(wVar.f8458b.f8469a), wVar.f8459c);
        }

        private void m(a0 a0Var) {
            t8.a.g(j.this.f8371z != -1);
            j.this.f8371z = 1;
            j.this.f8368w = a0Var.f8277b.f8453a;
            j.this.B0();
        }

        @Override // com.google.android.exoplayer2.source.rtsp.s.d
        public void c(List<String> list) {
            this.f8376a.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.k

                /* renamed from: b */
                public final /* synthetic */ List f8382b;

                public /* synthetic */ k(List list2) {
                    r2 = list2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    j.c.this.h(r2);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public final class d {

        /* renamed from: a */
        private int f8378a;

        /* renamed from: b */
        private x f8379b;

        private d() {
        }

        /* synthetic */ d(j jVar, a aVar) {
            this();
        }

        private x a(int i10, String str, Map<String, String> map, Uri uri) {
            String str2 = j.this.f8359c;
            int i11 = this.f8378a;
            this.f8378a = i11 + 1;
            m.b bVar = new m.b(str2, str, i11);
            if (j.this.f8370y != null) {
                t8.a.i(j.this.f8367v);
                try {
                    bVar.b("Authorization", j.this.f8370y.a(j.this.f8367v, uri, i10));
                } catch (b3 e10) {
                    j.this.D0(new RtspMediaSource.c(e10));
                }
            }
            bVar.d(map);
            return new x(uri, i10, bVar.e(), "");
        }

        private void h(x xVar) {
            int parseInt = Integer.parseInt((String) t8.a.e(xVar.f8462c.d("CSeq")));
            t8.a.g(j.this.f8363r.get(parseInt) == null);
            j.this.f8363r.append(parseInt, xVar);
            com.google.common.collect.w<String> p10 = u.p(xVar);
            j.this.I0(p10);
            j.this.f8366u.i(p10);
            this.f8379b = xVar;
        }

        private void i(y yVar) {
            com.google.common.collect.w<String> q10 = u.q(yVar);
            j.this.I0(q10);
            j.this.f8366u.i(q10);
        }

        public void b() {
            t8.a.i(this.f8379b);
            com.google.common.collect.x<String, String> b10 = this.f8379b.f8462c.b();
            HashMap hashMap = new HashMap();
            for (String str : b10.keySet()) {
                if (!str.equals("CSeq") && !str.equals("User-Agent") && !str.equals("Session") && !str.equals("Authorization")) {
                    hashMap.put(str, (String) com.google.common.collect.e0.d(b10.p(str)));
                }
            }
            h(a(this.f8379b.f8461b, j.this.f8368w, hashMap, this.f8379b.f8460a));
        }

        public void c(Uri uri, String str) {
            h(a(2, str, com.google.common.collect.y.k(), uri));
        }

        public void d(int i10) {
            i(new y(405, new m.b(j.this.f8359c, j.this.f8368w, i10).e()));
            this.f8378a = Math.max(this.f8378a, i10 + 1);
        }

        public void e(Uri uri, String str) {
            h(a(4, str, com.google.common.collect.y.k(), uri));
        }

        public void f(Uri uri, String str) {
            t8.a.g(j.this.f8371z == 2);
            h(a(5, str, com.google.common.collect.y.k(), uri));
            j.this.C = true;
        }

        public void g(Uri uri, long j10, String str) {
            boolean z10 = true;
            if (j.this.f8371z != 1 && j.this.f8371z != 2) {
                z10 = false;
            }
            t8.a.g(z10);
            h(a(6, str, com.google.common.collect.y.l("Range", z.b(j10)), uri));
        }

        public void j(Uri uri, String str, String str2) {
            j.this.f8371z = 0;
            h(a(10, str2, com.google.common.collect.y.l("Transport", str), uri));
        }

        public void k(Uri uri, String str) {
            if (j.this.f8371z == -1 || j.this.f8371z == 0) {
                return;
            }
            j.this.f8371z = 0;
            h(a(12, str, com.google.common.collect.y.k(), uri));
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void c(RtspMediaSource.c cVar);

        void e();

        void f(long j10, com.google.common.collect.w<b0> wVar);
    }

    /* loaded from: classes.dex */
    public interface f {
        void b(String str, Throwable th2);

        void g(z zVar, com.google.common.collect.w<r> wVar);
    }

    public j(f fVar, e eVar, String str, Uri uri, SocketFactory socketFactory, boolean z10) {
        this.f8357a = fVar;
        this.f8358b = eVar;
        this.f8359c = str;
        this.f8360d = socketFactory;
        this.f8361e = z10;
        this.f8365t = u.o(uri);
        this.f8367v = u.m(uri);
    }

    public void B0() {
        n.d pollFirst = this.f8362f.pollFirst();
        if (pollFirst == null) {
            this.f8358b.e();
        } else {
            this.f8364s.j(pollFirst.c(), pollFirst.d(), this.f8368w);
        }
    }

    public void D0(Throwable th2) {
        RtspMediaSource.c cVar = th2 instanceof RtspMediaSource.c ? (RtspMediaSource.c) th2 : new RtspMediaSource.c(th2);
        if (this.A) {
            this.f8358b.c(cVar);
        } else {
            this.f8357a.b(eb.u.e(th2.getMessage()), th2);
        }
    }

    private Socket F0(Uri uri) {
        t8.a.a(uri.getHost() != null);
        return this.f8360d.createSocket((String) t8.a.e(uri.getHost()), uri.getPort() > 0 ? uri.getPort() : 554);
    }

    public void I0(List<String> list) {
        if (this.f8361e) {
            t8.s.b("RtspClient", eb.h.g("\n").d(list));
        }
    }

    public static boolean T0(List<Integer> list) {
        return list.isEmpty() || list.contains(2);
    }

    public static com.google.common.collect.w<r> z0(c0 c0Var, Uri uri) {
        w.a aVar = new w.a();
        for (int i10 = 0; i10 < c0Var.f8286b.size(); i10++) {
            com.google.android.exoplayer2.source.rtsp.a aVar2 = c0Var.f8286b.get(i10);
            if (h.b(aVar2)) {
                aVar.a(new r(aVar2, uri));
            }
        }
        return aVar.k();
    }

    public int H0() {
        return this.f8371z;
    }

    public void J0(int i10, s.b bVar) {
        this.f8366u.g(i10, bVar);
    }

    public void L0() {
        try {
            close();
            s sVar = new s(new c());
            this.f8366u = sVar;
            sVar.f(F0(this.f8365t));
            this.f8368w = null;
            this.B = false;
            this.f8370y = null;
        } catch (IOException e10) {
            this.f8358b.c(new RtspMediaSource.c(e10));
        }
    }

    public void R0(long j10) {
        if (this.f8371z == 2 && !this.C) {
            this.f8364s.f(this.f8365t, (String) t8.a.e(this.f8368w));
        }
        this.D = j10;
    }

    public void W0(List<n.d> list) {
        this.f8362f.addAll(list);
        B0();
    }

    public void Y0() {
        try {
            this.f8366u.f(F0(this.f8365t));
            this.f8364s.e(this.f8365t, this.f8368w);
        } catch (IOException e10) {
            r0.n(this.f8366u);
            throw e10;
        }
    }

    public void a1(long j10) {
        this.f8364s.g(this.f8365t, j10, (String) t8.a.e(this.f8368w));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b bVar = this.f8369x;
        if (bVar != null) {
            bVar.close();
            this.f8369x = null;
            this.f8364s.k(this.f8365t, (String) t8.a.e(this.f8368w));
        }
        this.f8366u.close();
    }
}
