package p482z7;

import p082eb.C7155k;

/* renamed from: z7.b */
/* loaded from: classes.dex */
public final class C12810b {

    /* renamed from: a */
    public final String f34906a;

    /* renamed from: b */
    public final String f34907b;

    /* renamed from: c */
    public final int f34908c;

    /* renamed from: d */
    public final int f34909d;

    public C12810b(String str, String str2, int i10, int i11) {
        this.f34906a = str;
        this.f34907b = str2;
        this.f34908c = i10;
        this.f34909d = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12810b)) {
            return false;
        }
        C12810b c12810b = (C12810b) obj;
        return this.f34908c == c12810b.f34908c && this.f34909d == c12810b.f34909d && C7155k.m21289a(this.f34906a, c12810b.f34906a) && C7155k.m21289a(this.f34907b, c12810b.f34907b);
    }

    public int hashCode() {
        return C7155k.m21290b(this.f34906a, this.f34907b, Integer.valueOf(this.f34908c), Integer.valueOf(this.f34909d));
    }
}
