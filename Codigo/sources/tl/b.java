package tl;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import ql.a0;
import ql.c0;
import ql.t;
import rl.d;
import wl.c;
import xk.p;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final a f26978c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final a0 f26979a;

    /* renamed from: b, reason: collision with root package name */
    private final c0 f26980b;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final boolean a(c0 response, a0 request) {
            n.e(response, "response");
            n.e(request, "request");
            int g10 = response.g();
            if (g10 != 200 && g10 != 410 && g10 != 414 && g10 != 501 && g10 != 203 && g10 != 204) {
                if (g10 != 307) {
                    if (g10 != 308 && g10 != 404 && g10 != 405) {
                        switch (g10) {
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
                if (c0.n(response, "Expires", null, 2, null) == null && response.b().d() == -1 && !response.b().c() && !response.b().b()) {
                    return false;
                }
            }
            return (response.b().i() || request.b().i()) ? false : true;
        }
    }

    /* renamed from: tl.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0442b {

        /* renamed from: a, reason: collision with root package name */
        private final long f26981a;

        /* renamed from: b, reason: collision with root package name */
        private final a0 f26982b;

        /* renamed from: c, reason: collision with root package name */
        private final c0 f26983c;

        /* renamed from: d, reason: collision with root package name */
        private Date f26984d;

        /* renamed from: e, reason: collision with root package name */
        private String f26985e;

        /* renamed from: f, reason: collision with root package name */
        private Date f26986f;

        /* renamed from: g, reason: collision with root package name */
        private String f26987g;

        /* renamed from: h, reason: collision with root package name */
        private Date f26988h;

        /* renamed from: i, reason: collision with root package name */
        private long f26989i;

        /* renamed from: j, reason: collision with root package name */
        private long f26990j;

        /* renamed from: k, reason: collision with root package name */
        private String f26991k;

        /* renamed from: l, reason: collision with root package name */
        private int f26992l;

        public C0442b(long j10, a0 request, c0 c0Var) {
            boolean r10;
            boolean r11;
            boolean r12;
            boolean r13;
            boolean r14;
            n.e(request, "request");
            this.f26981a = j10;
            this.f26982b = request;
            this.f26983c = c0Var;
            this.f26992l = -1;
            if (c0Var != null) {
                this.f26989i = c0Var.Q();
                this.f26990j = c0Var.I();
                t o10 = c0Var.o();
                int size = o10.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    String d10 = o10.d(i10);
                    String l10 = o10.l(i10);
                    r10 = p.r(d10, "Date", true);
                    if (r10) {
                        this.f26984d = c.a(l10);
                        this.f26985e = l10;
                    } else {
                        r11 = p.r(d10, "Expires", true);
                        if (r11) {
                            this.f26988h = c.a(l10);
                        } else {
                            r12 = p.r(d10, "Last-Modified", true);
                            if (r12) {
                                this.f26986f = c.a(l10);
                                this.f26987g = l10;
                            } else {
                                r13 = p.r(d10, "ETag", true);
                                if (r13) {
                                    this.f26991k = l10;
                                } else {
                                    r14 = p.r(d10, "Age", true);
                                    if (r14) {
                                        this.f26992l = d.V(l10, -1);
                                    }
                                }
                            }
                        }
                    }
                    i10 = i11;
                }
            }
        }

        private final long a() {
            Date date = this.f26984d;
            long max = date != null ? Math.max(0L, this.f26990j - date.getTime()) : 0L;
            int i10 = this.f26992l;
            if (i10 != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i10));
            }
            long j10 = this.f26990j;
            return max + (j10 - this.f26989i) + (this.f26981a - j10);
        }

        private final b c() {
            String str;
            if (this.f26983c == null) {
                return new b(this.f26982b, null);
            }
            if ((!this.f26982b.f() || this.f26983c.j() != null) && b.f26978c.a(this.f26983c, this.f26982b)) {
                ql.d b10 = this.f26982b.b();
                if (b10.h() || e(this.f26982b)) {
                    return new b(this.f26982b, null);
                }
                ql.d b11 = this.f26983c.b();
                long a10 = a();
                long d10 = d();
                if (b10.d() != -1) {
                    d10 = Math.min(d10, TimeUnit.SECONDS.toMillis(b10.d()));
                }
                long j10 = 0;
                long millis = b10.f() != -1 ? TimeUnit.SECONDS.toMillis(b10.f()) : 0L;
                if (!b11.g() && b10.e() != -1) {
                    j10 = TimeUnit.SECONDS.toMillis(b10.e());
                }
                if (!b11.h()) {
                    long j11 = millis + a10;
                    if (j11 < j10 + d10) {
                        c0.a B = this.f26983c.B();
                        if (j11 >= d10) {
                            B.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (a10 > 86400000 && f()) {
                            B.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new b(null, B.c());
                    }
                }
                String str2 = this.f26991k;
                if (str2 != null) {
                    str = "If-None-Match";
                } else {
                    if (this.f26986f != null) {
                        str2 = this.f26987g;
                    } else {
                        if (this.f26984d == null) {
                            return new b(this.f26982b, null);
                        }
                        str2 = this.f26985e;
                    }
                    str = "If-Modified-Since";
                }
                t.a k10 = this.f26982b.e().k();
                n.b(str2);
                k10.c(str, str2);
                return new b(this.f26982b.h().e(k10.e()).b(), this.f26983c);
            }
            return new b(this.f26982b, null);
        }

        private final long d() {
            Long valueOf;
            c0 c0Var = this.f26983c;
            n.b(c0Var);
            if (c0Var.b().d() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.d());
            }
            Date date = this.f26988h;
            if (date != null) {
                Date date2 = this.f26984d;
                valueOf = date2 != null ? Long.valueOf(date2.getTime()) : null;
                long time = date.getTime() - (valueOf == null ? this.f26990j : valueOf.longValue());
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f26986f == null || this.f26983c.O().i().n() != null) {
                return 0L;
            }
            Date date3 = this.f26984d;
            valueOf = date3 != null ? Long.valueOf(date3.getTime()) : null;
            long longValue = valueOf == null ? this.f26989i : valueOf.longValue();
            Date date4 = this.f26986f;
            n.b(date4);
            long time2 = longValue - date4.getTime();
            if (time2 > 0) {
                return time2 / 10;
            }
            return 0L;
        }

        private final boolean e(a0 a0Var) {
            return (a0Var.d("If-Modified-Since") == null && a0Var.d("If-None-Match") == null) ? false : true;
        }

        private final boolean f() {
            c0 c0Var = this.f26983c;
            n.b(c0Var);
            return c0Var.b().d() == -1 && this.f26988h == null;
        }

        public final b b() {
            b c10 = c();
            return (c10.b() == null || !this.f26982b.b().k()) ? c10 : new b(null, null);
        }
    }

    public b(a0 a0Var, c0 c0Var) {
        this.f26979a = a0Var;
        this.f26980b = c0Var;
    }

    public final c0 a() {
        return this.f26980b;
    }

    public final a0 b() {
        return this.f26979a;
    }
}
