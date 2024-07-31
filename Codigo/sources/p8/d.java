package p8;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    private int f22881f;

    /* renamed from: h, reason: collision with root package name */
    private int f22883h;

    /* renamed from: o, reason: collision with root package name */
    private float f22890o;

    /* renamed from: a, reason: collision with root package name */
    private String f22876a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f22877b = "";

    /* renamed from: c, reason: collision with root package name */
    private Set<String> f22878c = Collections.emptySet();

    /* renamed from: d, reason: collision with root package name */
    private String f22879d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f22880e = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f22882g = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f22884i = false;

    /* renamed from: j, reason: collision with root package name */
    private int f22885j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f22886k = -1;

    /* renamed from: l, reason: collision with root package name */
    private int f22887l = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f22888m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f22889n = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f22891p = -1;

    /* renamed from: q, reason: collision with root package name */
    private boolean f22892q = false;

    private static int B(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public d A(boolean z10) {
        this.f22886k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f22884i) {
            return this.f22883h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f22892q;
    }

    public int c() {
        if (this.f22882g) {
            return this.f22881f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f22880e;
    }

    public float e() {
        return this.f22890o;
    }

    public int f() {
        return this.f22889n;
    }

    public int g() {
        return this.f22891p;
    }

    public int h(String str, String str2, Set<String> set, String str3) {
        if (this.f22876a.isEmpty() && this.f22877b.isEmpty() && this.f22878c.isEmpty() && this.f22879d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int B = B(B(B(0, this.f22876a, str, 1073741824), this.f22877b, str2, 2), this.f22879d, str3, 4);
        if (B == -1 || !set.containsAll(this.f22878c)) {
            return 0;
        }
        return B + (this.f22878c.size() * 4);
    }

    public int i() {
        int i10 = this.f22887l;
        if (i10 == -1 && this.f22888m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f22888m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f22884i;
    }

    public boolean k() {
        return this.f22882g;
    }

    public boolean l() {
        return this.f22885j == 1;
    }

    public boolean m() {
        return this.f22886k == 1;
    }

    public d n(int i10) {
        this.f22883h = i10;
        this.f22884i = true;
        return this;
    }

    public d o(boolean z10) {
        this.f22887l = z10 ? 1 : 0;
        return this;
    }

    public d p(boolean z10) {
        this.f22892q = z10;
        return this;
    }

    public d q(int i10) {
        this.f22881f = i10;
        this.f22882g = true;
        return this;
    }

    public d r(String str) {
        this.f22880e = str == null ? null : eb.c.e(str);
        return this;
    }

    public d s(float f10) {
        this.f22890o = f10;
        return this;
    }

    public d t(int i10) {
        this.f22889n = i10;
        return this;
    }

    public d u(boolean z10) {
        this.f22888m = z10 ? 1 : 0;
        return this;
    }

    public d v(int i10) {
        this.f22891p = i10;
        return this;
    }

    public void w(String[] strArr) {
        this.f22878c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f22876a = str;
    }

    public void y(String str) {
        this.f22877b = str;
    }

    public void z(String str) {
        this.f22879d = str;
    }
}
