package p291p8;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p082eb.C7147c;

/* renamed from: p8.d */
/* loaded from: classes.dex */
public final class C10114d {

    /* renamed from: f */
    private int f24814f;

    /* renamed from: h */
    private int f24816h;

    /* renamed from: o */
    private float f24823o;

    /* renamed from: a */
    private String f24809a = "";

    /* renamed from: b */
    private String f24810b = "";

    /* renamed from: c */
    private Set<String> f24811c = Collections.emptySet();

    /* renamed from: d */
    private String f24812d = "";

    /* renamed from: e */
    private String f24813e = null;

    /* renamed from: g */
    private boolean f24815g = false;

    /* renamed from: i */
    private boolean f24817i = false;

    /* renamed from: j */
    private int f24818j = -1;

    /* renamed from: k */
    private int f24819k = -1;

    /* renamed from: l */
    private int f24820l = -1;

    /* renamed from: m */
    private int f24821m = -1;

    /* renamed from: n */
    private int f24822n = -1;

    /* renamed from: p */
    private int f24824p = -1;

    /* renamed from: q */
    private boolean f24825q = false;

    /* renamed from: B */
    private static int m30168B(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    /* renamed from: A */
    public C10114d m30169A(boolean z10) {
        this.f24819k = z10 ? 1 : 0;
        return this;
    }

    /* renamed from: a */
    public int m30170a() {
        if (this.f24817i) {
            return this.f24816h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    /* renamed from: b */
    public boolean m30171b() {
        return this.f24825q;
    }

    /* renamed from: c */
    public int m30172c() {
        if (this.f24815g) {
            return this.f24814f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    /* renamed from: d */
    public String m30173d() {
        return this.f24813e;
    }

    /* renamed from: e */
    public float m30174e() {
        return this.f24823o;
    }

    /* renamed from: f */
    public int m30175f() {
        return this.f24822n;
    }

    /* renamed from: g */
    public int m30176g() {
        return this.f24824p;
    }

    /* renamed from: h */
    public int m30177h(String str, String str2, Set<String> set, String str3) {
        if (this.f24809a.isEmpty() && this.f24810b.isEmpty() && this.f24811c.isEmpty() && this.f24812d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int m30168B = m30168B(m30168B(m30168B(0, this.f24809a, str, 1073741824), this.f24810b, str2, 2), this.f24812d, str3, 4);
        if (m30168B == -1 || !set.containsAll(this.f24811c)) {
            return 0;
        }
        return m30168B + (this.f24811c.size() * 4);
    }

    /* renamed from: i */
    public int m30178i() {
        int i10 = this.f24820l;
        if (i10 == -1 && this.f24821m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f24821m == 1 ? 2 : 0);
    }

    /* renamed from: j */
    public boolean m30179j() {
        return this.f24817i;
    }

    /* renamed from: k */
    public boolean m30180k() {
        return this.f24815g;
    }

    /* renamed from: l */
    public boolean m30181l() {
        return this.f24818j == 1;
    }

    /* renamed from: m */
    public boolean m30182m() {
        return this.f24819k == 1;
    }

    /* renamed from: n */
    public C10114d m30183n(int i10) {
        this.f24816h = i10;
        this.f24817i = true;
        return this;
    }

    /* renamed from: o */
    public C10114d m30184o(boolean z10) {
        this.f24820l = z10 ? 1 : 0;
        return this;
    }

    /* renamed from: p */
    public C10114d m30185p(boolean z10) {
        this.f24825q = z10;
        return this;
    }

    /* renamed from: q */
    public C10114d m30186q(int i10) {
        this.f24814f = i10;
        this.f24815g = true;
        return this;
    }

    /* renamed from: r */
    public C10114d m30187r(String str) {
        this.f24813e = str == null ? null : C7147c.m21253e(str);
        return this;
    }

    /* renamed from: s */
    public C10114d m30188s(float f10) {
        this.f24823o = f10;
        return this;
    }

    /* renamed from: t */
    public C10114d m30189t(int i10) {
        this.f24822n = i10;
        return this;
    }

    /* renamed from: u */
    public C10114d m30190u(boolean z10) {
        this.f24821m = z10 ? 1 : 0;
        return this;
    }

    /* renamed from: v */
    public C10114d m30191v(int i10) {
        this.f24824p = i10;
        return this;
    }

    /* renamed from: w */
    public void m30192w(String[] strArr) {
        this.f24811c = new HashSet(Arrays.asList(strArr));
    }

    /* renamed from: x */
    public void m30193x(String str) {
        this.f24809a = str;
    }

    /* renamed from: y */
    public void m30194y(String str) {
        this.f24810b = str;
    }

    /* renamed from: z */
    public void m30195z(String str) {
        this.f24812d = str;
    }
}
