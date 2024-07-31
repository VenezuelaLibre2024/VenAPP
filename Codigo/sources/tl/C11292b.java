package tl;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p319ql.C10521a0;
import p319ql.C10525c0;
import p319ql.C10526d;
import p319ql.C10545t;
import p341rl.C10727d;
import p428wl.C12240c;
import p450xk.C12524p;

/* renamed from: tl.b */
/* loaded from: classes3.dex */
public final class C11292b {

    /* renamed from: c */
    public static final a f29280c = new a(null);

    /* renamed from: a */
    private final C10521a0 f29281a;

    /* renamed from: b */
    private final C10525c0 f29282b;

    /* renamed from: tl.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final boolean m35280a(C10525c0 response, C10521a0 request) {
            C9322n.m27781e(response, "response");
            C9322n.m27781e(request, "request");
            int m31645g = response.m31645g();
            if (m31645g != 200 && m31645g != 410 && m31645g != 414 && m31645g != 501 && m31645g != 203 && m31645g != 204) {
                if (m31645g != 307) {
                    if (m31645g != 308 && m31645g != 404 && m31645g != 405) {
                        switch (m31645g) {
                            case 300:
                            case 301:
                                break;
                            case 302:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (C10525c0.m31634n(response, "Expires", null, 2, null) == null && response.m31642b().m31688d() == -1 && !response.m31642b().m31687c() && !response.m31642b().m31686b()) {
                    return false;
                }
            }
            return (response.m31642b().m31693i() || request.m31601b().m31693i()) ? false : true;
        }
    }

    /* renamed from: tl.b$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final long f29283a;

        /* renamed from: b */
        private final C10521a0 f29284b;

        /* renamed from: c */
        private final C10525c0 f29285c;

        /* renamed from: d */
        private Date f29286d;

        /* renamed from: e */
        private String f29287e;

        /* renamed from: f */
        private Date f29288f;

        /* renamed from: g */
        private String f29289g;

        /* renamed from: h */
        private Date f29290h;

        /* renamed from: i */
        private long f29291i;

        /* renamed from: j */
        private long f29292j;

        /* renamed from: k */
        private String f29293k;

        /* renamed from: l */
        private int f29294l;

        public b(long j10, C10521a0 request, C10525c0 c10525c0) {
            boolean m41037r;
            boolean m41037r2;
            boolean m41037r3;
            boolean m41037r4;
            boolean m41037r5;
            C9322n.m27781e(request, "request");
            this.f29283a = j10;
            this.f29284b = request;
            this.f29285c = c10525c0;
            this.f29294l = -1;
            if (c10525c0 != null) {
                this.f29291i = c10525c0.m31640Q();
                this.f29292j = c10525c0.m31638I();
                C10545t m31649o = c10525c0.m31649o();
                int size = m31649o.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    String m31846d = m31649o.m31846d(i10);
                    String m31849l = m31649o.m31849l(i10);
                    m41037r = C12524p.m41037r(m31846d, "Date", true);
                    if (m41037r) {
                        this.f29286d = C12240c.m39392a(m31849l);
                        this.f29287e = m31849l;
                    } else {
                        m41037r2 = C12524p.m41037r(m31846d, "Expires", true);
                        if (m41037r2) {
                            this.f29290h = C12240c.m39392a(m31849l);
                        } else {
                            m41037r3 = C12524p.m41037r(m31846d, "Last-Modified", true);
                            if (m41037r3) {
                                this.f29288f = C12240c.m39392a(m31849l);
                                this.f29289g = m31849l;
                            } else {
                                m41037r4 = C12524p.m41037r(m31846d, "ETag", true);
                                if (m41037r4) {
                                    this.f29293k = m31849l;
                                } else {
                                    m41037r5 = C12524p.m41037r(m31846d, "Age", true);
                                    if (m41037r5) {
                                        this.f29294l = C10727d.m32636V(m31849l, -1);
                                    }
                                }
                            }
                        }
                    }
                    i10 = i11;
                }
            }
        }

        /* renamed from: a */
        private final long m35281a() {
            Date date = this.f29286d;
            long max = date != null ? Math.max(0L, this.f29292j - date.getTime()) : 0L;
            int i10 = this.f29294l;
            if (i10 != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i10));
            }
            long j10 = this.f29292j;
            return max + (j10 - this.f29291i) + (this.f29283a - j10);
        }

        /* renamed from: c */
        private final C11292b m35282c() {
            String str;
            if (this.f29285c == null) {
                return new C11292b(this.f29284b, null);
            }
            if ((!this.f29284b.m31605f() || this.f29285c.m31647j() != null) && C11292b.f29280c.m35280a(this.f29285c, this.f29284b)) {
                C10526d m31601b = this.f29284b.m31601b();
                if (m31601b.m31692h() || m35284e(this.f29284b)) {
                    return new C11292b(this.f29284b, null);
                }
                C10526d m31642b = this.f29285c.m31642b();
                long m35281a = m35281a();
                long m35283d = m35283d();
                if (m31601b.m31688d() != -1) {
                    m35283d = Math.min(m35283d, TimeUnit.SECONDS.toMillis(m31601b.m31688d()));
                }
                long j10 = 0;
                long millis = m31601b.m31690f() != -1 ? TimeUnit.SECONDS.toMillis(m31601b.m31690f()) : 0L;
                if (!m31642b.m31691g() && m31601b.m31689e() != -1) {
                    j10 = TimeUnit.SECONDS.toMillis(m31601b.m31689e());
                }
                if (!m31642b.m31692h()) {
                    long j11 = millis + m35281a;
                    if (j11 < j10 + m35283d) {
                        C10525c0.a m31635B = this.f29285c.m31635B();
                        if (j11 >= m35283d) {
                            m31635B.m31661a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (m35281a > 86400000 && m35285f()) {
                            m31635B.m31661a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new C11292b(null, m31635B.m31663c());
                    }
                }
                String str2 = this.f29293k;
                if (str2 != null) {
                    str = "If-None-Match";
                } else {
                    if (this.f29288f != null) {
                        str2 = this.f29289g;
                    } else {
                        if (this.f29286d == null) {
                            return new C11292b(this.f29284b, null);
                        }
                        str2 = this.f29287e;
                    }
                    str = "If-Modified-Since";
                }
                C10545t.a m31848k = this.f29284b.m31604e().m31848k();
                C9322n.m27778b(str2);
                m31848k.m31853c(str, str2);
                return new C11292b(this.f29284b.m31607h().m31613e(m31848k.m31855e()).m31610b(), this.f29285c);
            }
            return new C11292b(this.f29284b, null);
        }

        /* renamed from: d */
        private final long m35283d() {
            Long valueOf;
            C10525c0 c10525c0 = this.f29285c;
            C9322n.m27778b(c10525c0);
            if (c10525c0.m31642b().m31688d() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.m31688d());
            }
            Date date = this.f29290h;
            if (date != null) {
                Date date2 = this.f29286d;
                valueOf = date2 != null ? Long.valueOf(date2.getTime()) : null;
                long time = date.getTime() - (valueOf == null ? this.f29292j : valueOf.longValue());
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f29288f == null || this.f29285c.m31639O().m31608i().m31879n() != null) {
                return 0L;
            }
            Date date3 = this.f29286d;
            valueOf = date3 != null ? Long.valueOf(date3.getTime()) : null;
            long longValue = valueOf == null ? this.f29291i : valueOf.longValue();
            Date date4 = this.f29288f;
            C9322n.m27778b(date4);
            long time2 = longValue - date4.getTime();
            if (time2 > 0) {
                return time2 / 10;
            }
            return 0L;
        }

        /* renamed from: e */
        private final boolean m35284e(C10521a0 c10521a0) {
            return (c10521a0.m31603d("If-Modified-Since") == null && c10521a0.m31603d("If-None-Match") == null) ? false : true;
        }

        /* renamed from: f */
        private final boolean m35285f() {
            C10525c0 c10525c0 = this.f29285c;
            C9322n.m27778b(c10525c0);
            return c10525c0.m31642b().m31688d() == -1 && this.f29290h == null;
        }

        /* renamed from: b */
        public final C11292b m35286b() {
            C11292b m35282c = m35282c();
            return (m35282c.m35279b() == null || !this.f29284b.m31601b().m31695k()) ? m35282c : new C11292b(null, null);
        }
    }

    public C11292b(C10521a0 c10521a0, C10525c0 c10525c0) {
        this.f29281a = c10521a0;
        this.f29282b = c10525c0;
    }

    /* renamed from: a */
    public final C10525c0 m35278a() {
        return this.f29282b;
    }

    /* renamed from: b */
    public final C10521a0 m35279b() {
        return this.f29281a;
    }
}
