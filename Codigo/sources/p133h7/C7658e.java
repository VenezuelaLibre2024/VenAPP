package p133h7;

import java.util.Arrays;
import p363t8.C11137a;
import p363t8.C11146e0;
import p459y6.C12624n;
import p459y6.InterfaceC12622l;

/* renamed from: h7.e */
/* loaded from: classes.dex */
final class C7658e {

    /* renamed from: a */
    private final C7659f f18130a = new C7659f();

    /* renamed from: b */
    private final C11146e0 f18131b = new C11146e0(new byte[65025], 0);

    /* renamed from: c */
    private int f18132c = -1;

    /* renamed from: d */
    private int f18133d;

    /* renamed from: e */
    private boolean f18134e;

    /* renamed from: a */
    private int m23263a(int i10) {
        int i11;
        int i12 = 0;
        this.f18133d = 0;
        do {
            int i13 = this.f18133d;
            int i14 = i10 + i13;
            C7659f c7659f = this.f18130a;
            if (i14 >= c7659f.f18141g) {
                break;
            }
            int[] iArr = c7659f.f18144j;
            this.f18133d = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    /* renamed from: b */
    public C7659f m23264b() {
        return this.f18130a;
    }

    /* renamed from: c */
    public C11146e0 m23265c() {
        return this.f18131b;
    }

    /* renamed from: d */
    public boolean m23266d(InterfaceC12622l interfaceC12622l) {
        int i10;
        C11137a.m34605g(interfaceC12622l != null);
        if (this.f18134e) {
            this.f18134e = false;
            this.f18131b.m34673Q(0);
        }
        while (!this.f18134e) {
            if (this.f18132c < 0) {
                if (!this.f18130a.m23271c(interfaceC12622l) || !this.f18130a.m23269a(interfaceC12622l, true)) {
                    return false;
                }
                C7659f c7659f = this.f18130a;
                int i11 = c7659f.f18142h;
                if ((c7659f.f18136b & 1) == 1 && this.f18131b.m34684g() == 0) {
                    i11 += m23263a(0);
                    i10 = this.f18133d + 0;
                } else {
                    i10 = 0;
                }
                if (!C12624n.m41568e(interfaceC12622l, i11)) {
                    return false;
                }
                this.f18132c = i10;
            }
            int m23263a = m23263a(this.f18132c);
            int i12 = this.f18132c + this.f18133d;
            if (m23263a > 0) {
                C11146e0 c11146e0 = this.f18131b;
                c11146e0.m34681c(c11146e0.m34684g() + m23263a);
                if (!C12624n.m41567d(interfaceC12622l, this.f18131b.m34682e(), this.f18131b.m34684g(), m23263a)) {
                    return false;
                }
                C11146e0 c11146e02 = this.f18131b;
                c11146e02.m34676T(c11146e02.m34684g() + m23263a);
                this.f18134e = this.f18130a.f18144j[i12 + (-1)] != 255;
            }
            if (i12 == this.f18130a.f18141g) {
                i12 = -1;
            }
            this.f18132c = i12;
        }
        return true;
    }

    /* renamed from: e */
    public void m23267e() {
        this.f18130a.m23270b();
        this.f18131b.m34673Q(0);
        this.f18132c = -1;
        this.f18134e = false;
    }

    /* renamed from: f */
    public void m23268f() {
        if (this.f18131b.m34682e().length == 65025) {
            return;
        }
        C11146e0 c11146e0 = this.f18131b;
        c11146e0.m34675S(Arrays.copyOf(c11146e0.m34682e(), Math.max(65025, this.f18131b.m34684g())), this.f18131b.m34684g());
    }
}
