package xf;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.common.internal.s;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final yf.a f31237a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f31238b;

    /* renamed from: c, reason: collision with root package name */
    private final Point[] f31239c;

    /* renamed from: xf.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0524a {

        /* renamed from: a, reason: collision with root package name */
        private final int f31240a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f31241b;

        public C0524a(int i10, String[] strArr) {
            this.f31240a = i10;
            this.f31241b = strArr;
        }

        public String[] a() {
            return this.f31241b;
        }

        public int b() {
            return this.f31240a;
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f31242a;

        /* renamed from: b, reason: collision with root package name */
        private final int f31243b;

        /* renamed from: c, reason: collision with root package name */
        private final int f31244c;

        /* renamed from: d, reason: collision with root package name */
        private final int f31245d;

        /* renamed from: e, reason: collision with root package name */
        private final int f31246e;

        /* renamed from: f, reason: collision with root package name */
        private final int f31247f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f31248g;

        /* renamed from: h, reason: collision with root package name */
        private final String f31249h;

        public b(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, String str) {
            this.f31242a = i10;
            this.f31243b = i11;
            this.f31244c = i12;
            this.f31245d = i13;
            this.f31246e = i14;
            this.f31247f = i15;
            this.f31248g = z10;
            this.f31249h = str;
        }

        public String a() {
            return this.f31249h;
        }
    }

    /* loaded from: classes2.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f31250a;

        /* renamed from: b, reason: collision with root package name */
        private final String f31251b;

        /* renamed from: c, reason: collision with root package name */
        private final String f31252c;

        /* renamed from: d, reason: collision with root package name */
        private final String f31253d;

        /* renamed from: e, reason: collision with root package name */
        private final String f31254e;

        /* renamed from: f, reason: collision with root package name */
        private final b f31255f;

        /* renamed from: g, reason: collision with root package name */
        private final b f31256g;

        public c(String str, String str2, String str3, String str4, String str5, b bVar, b bVar2) {
            this.f31250a = str;
            this.f31251b = str2;
            this.f31252c = str3;
            this.f31253d = str4;
            this.f31254e = str5;
            this.f31255f = bVar;
            this.f31256g = bVar2;
        }

        public String a() {
            return this.f31251b;
        }

        public b b() {
            return this.f31256g;
        }

        public String c() {
            return this.f31252c;
        }

        public String d() {
            return this.f31253d;
        }

        public b e() {
            return this.f31255f;
        }

        public String f() {
            return this.f31254e;
        }

        public String g() {
            return this.f31250a;
        }
    }

    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final h f31257a;

        /* renamed from: b, reason: collision with root package name */
        private final String f31258b;

        /* renamed from: c, reason: collision with root package name */
        private final String f31259c;

        /* renamed from: d, reason: collision with root package name */
        private final List f31260d;

        /* renamed from: e, reason: collision with root package name */
        private final List f31261e;

        /* renamed from: f, reason: collision with root package name */
        private final List f31262f;

        /* renamed from: g, reason: collision with root package name */
        private final List f31263g;

        public d(h hVar, String str, String str2, List<i> list, List<f> list2, List<String> list3, List<C0524a> list4) {
            this.f31257a = hVar;
            this.f31258b = str;
            this.f31259c = str2;
            this.f31260d = list;
            this.f31261e = list2;
            this.f31262f = list3;
            this.f31263g = list4;
        }

        public List<C0524a> a() {
            return this.f31263g;
        }

        public List<f> b() {
            return this.f31261e;
        }

        public h c() {
            return this.f31257a;
        }

        public String d() {
            return this.f31258b;
        }

        public List<i> e() {
            return this.f31260d;
        }

        public String f() {
            return this.f31259c;
        }

        public List<String> g() {
            return this.f31262f;
        }
    }

    /* loaded from: classes2.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final String f31264a;

        /* renamed from: b, reason: collision with root package name */
        private final String f31265b;

        /* renamed from: c, reason: collision with root package name */
        private final String f31266c;

        /* renamed from: d, reason: collision with root package name */
        private final String f31267d;

        /* renamed from: e, reason: collision with root package name */
        private final String f31268e;

        /* renamed from: f, reason: collision with root package name */
        private final String f31269f;

        /* renamed from: g, reason: collision with root package name */
        private final String f31270g;

        /* renamed from: h, reason: collision with root package name */
        private final String f31271h;

        /* renamed from: i, reason: collision with root package name */
        private final String f31272i;

        /* renamed from: j, reason: collision with root package name */
        private final String f31273j;

        /* renamed from: k, reason: collision with root package name */
        private final String f31274k;

        /* renamed from: l, reason: collision with root package name */
        private final String f31275l;

        /* renamed from: m, reason: collision with root package name */
        private final String f31276m;

        /* renamed from: n, reason: collision with root package name */
        private final String f31277n;

        public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            this.f31264a = str;
            this.f31265b = str2;
            this.f31266c = str3;
            this.f31267d = str4;
            this.f31268e = str5;
            this.f31269f = str6;
            this.f31270g = str7;
            this.f31271h = str8;
            this.f31272i = str9;
            this.f31273j = str10;
            this.f31274k = str11;
            this.f31275l = str12;
            this.f31276m = str13;
            this.f31277n = str14;
        }

        public String a() {
            return this.f31270g;
        }

        public String b() {
            return this.f31271h;
        }

        public String c() {
            return this.f31269f;
        }

        public String d() {
            return this.f31272i;
        }

        public String e() {
            return this.f31276m;
        }

        public String f() {
            return this.f31264a;
        }

        public String g() {
            return this.f31275l;
        }

        public String h() {
            return this.f31265b;
        }

        public String i() {
            return this.f31268e;
        }

        public String j() {
            return this.f31274k;
        }

        public String k() {
            return this.f31277n;
        }

        public String l() {
            return this.f31267d;
        }

        public String m() {
            return this.f31273j;
        }

        public String n() {
            return this.f31266c;
        }
    }

    /* loaded from: classes2.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        private final int f31278a;

        /* renamed from: b, reason: collision with root package name */
        private final String f31279b;

        /* renamed from: c, reason: collision with root package name */
        private final String f31280c;

        /* renamed from: d, reason: collision with root package name */
        private final String f31281d;

        public f(int i10, String str, String str2, String str3) {
            this.f31278a = i10;
            this.f31279b = str;
            this.f31280c = str2;
            this.f31281d = str3;
        }

        public String a() {
            return this.f31279b;
        }

        public String b() {
            return this.f31281d;
        }

        public String c() {
            return this.f31280c;
        }

        public int d() {
            return this.f31278a;
        }
    }

    /* loaded from: classes2.dex */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        private final double f31282a;

        /* renamed from: b, reason: collision with root package name */
        private final double f31283b;

        public g(double d10, double d11) {
            this.f31282a = d10;
            this.f31283b = d11;
        }

        public double a() {
            return this.f31282a;
        }

        public double b() {
            return this.f31283b;
        }
    }

    /* loaded from: classes2.dex */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        private final String f31284a;

        /* renamed from: b, reason: collision with root package name */
        private final String f31285b;

        /* renamed from: c, reason: collision with root package name */
        private final String f31286c;

        /* renamed from: d, reason: collision with root package name */
        private final String f31287d;

        /* renamed from: e, reason: collision with root package name */
        private final String f31288e;

        /* renamed from: f, reason: collision with root package name */
        private final String f31289f;

        /* renamed from: g, reason: collision with root package name */
        private final String f31290g;

        public h(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f31284a = str;
            this.f31285b = str2;
            this.f31286c = str3;
            this.f31287d = str4;
            this.f31288e = str5;
            this.f31289f = str6;
            this.f31290g = str7;
        }

        public String a() {
            return this.f31287d;
        }

        public String b() {
            return this.f31284a;
        }

        public String c() {
            return this.f31289f;
        }

        public String d() {
            return this.f31288e;
        }

        public String e() {
            return this.f31286c;
        }

        public String f() {
            return this.f31285b;
        }

        public String g() {
            return this.f31290g;
        }
    }

    /* loaded from: classes2.dex */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        private final String f31291a;

        /* renamed from: b, reason: collision with root package name */
        private final int f31292b;

        public i(String str, int i10) {
            this.f31291a = str;
            this.f31292b = i10;
        }

        public String a() {
            return this.f31291a;
        }

        public int b() {
            return this.f31292b;
        }
    }

    /* loaded from: classes2.dex */
    public static class j {

        /* renamed from: a, reason: collision with root package name */
        private final String f31293a;

        /* renamed from: b, reason: collision with root package name */
        private final String f31294b;

        public j(String str, String str2) {
            this.f31293a = str;
            this.f31294b = str2;
        }

        public String a() {
            return this.f31293a;
        }

        public String b() {
            return this.f31294b;
        }
    }

    /* loaded from: classes2.dex */
    public static class k {

        /* renamed from: a, reason: collision with root package name */
        private final String f31295a;

        /* renamed from: b, reason: collision with root package name */
        private final String f31296b;

        public k(String str, String str2) {
            this.f31295a = str;
            this.f31296b = str2;
        }

        public String a() {
            return this.f31295a;
        }

        public String b() {
            return this.f31296b;
        }
    }

    /* loaded from: classes2.dex */
    public static class l {

        /* renamed from: a, reason: collision with root package name */
        private final String f31297a;

        /* renamed from: b, reason: collision with root package name */
        private final String f31298b;

        /* renamed from: c, reason: collision with root package name */
        private final int f31299c;

        public l(String str, String str2, int i10) {
            this.f31297a = str;
            this.f31298b = str2;
            this.f31299c = i10;
        }

        public int a() {
            return this.f31299c;
        }

        public String b() {
            return this.f31298b;
        }

        public String c() {
            return this.f31297a;
        }
    }

    public a(yf.a aVar, Matrix matrix) {
        this.f31237a = (yf.a) s.j(aVar);
        Rect e10 = aVar.e();
        if (e10 != null && matrix != null) {
            bg.b.c(e10, matrix);
        }
        this.f31238b = e10;
        Point[] k10 = aVar.k();
        if (k10 != null && matrix != null) {
            bg.b.b(k10, matrix);
        }
        this.f31239c = k10;
    }

    public Rect a() {
        return this.f31238b;
    }

    public c b() {
        return this.f31237a.a();
    }

    public d c() {
        return this.f31237a.i();
    }

    public Point[] d() {
        return this.f31239c;
    }

    public String e() {
        return this.f31237a.b();
    }

    public e f() {
        return this.f31237a.d();
    }

    public f g() {
        return this.f31237a.r();
    }

    public int h() {
        int format = this.f31237a.getFormat();
        if (format > 4096 || format == 0) {
            return -1;
        }
        return format;
    }

    public g i() {
        return this.f31237a.l();
    }

    public i j() {
        return this.f31237a.c();
    }

    public byte[] k() {
        byte[] j10 = this.f31237a.j();
        if (j10 != null) {
            return Arrays.copyOf(j10, j10.length);
        }
        return null;
    }

    public String l() {
        return this.f31237a.f();
    }

    public j m() {
        return this.f31237a.h();
    }

    public k n() {
        return this.f31237a.getUrl();
    }

    public int o() {
        return this.f31237a.g();
    }

    public l p() {
        return this.f31237a.m();
    }
}
