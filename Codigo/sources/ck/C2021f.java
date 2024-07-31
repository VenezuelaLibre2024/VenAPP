package ck;

import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import uk.C11579f;

/* renamed from: ck.f */
/* loaded from: classes3.dex */
public final class C2021f implements Comparable<C2021f> {

    /* renamed from: e */
    public static final a f8069e = new a(null);

    /* renamed from: f */
    public static final C2021f f8070f = C2022g.m10332a();

    /* renamed from: a */
    private final int f8071a;

    /* renamed from: b */
    private final int f8072b;

    /* renamed from: c */
    private final int f8073c;

    /* renamed from: d */
    private final int f8074d;

    /* renamed from: ck.f$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C2021f(int i10, int i11, int i12) {
        this.f8071a = i10;
        this.f8072b = i11;
        this.f8073c = i12;
        this.f8074d = m10330h(i10, i11, i12);
    }

    /* renamed from: h */
    private final int m10330h(int i10, int i11, int i12) {
        boolean z10 = false;
        if (new C11579f(0, 255).m36274m(i10) && new C11579f(0, 255).m36274m(i11) && new C11579f(0, 255).m36274m(i12)) {
            z10 = true;
        }
        if (z10) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C2021f other) {
        C9322n.m27781e(other, "other");
        return this.f8074d - other.f8074d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C2021f c2021f = obj instanceof C2021f ? (C2021f) obj : null;
        return c2021f != null && this.f8074d == c2021f.f8074d;
    }

    public int hashCode() {
        return this.f8074d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f8071a);
        sb2.append('.');
        sb2.append(this.f8072b);
        sb2.append('.');
        sb2.append(this.f8073c);
        return sb2.toString();
    }
}
