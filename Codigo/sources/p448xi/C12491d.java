package p448xi;

import dm.C7061e;

/* renamed from: xi.d */
/* loaded from: classes3.dex */
public final class C12491d {

    /* renamed from: d */
    public static final C7061e f33837d = C7061e.m20753l(":status");

    /* renamed from: e */
    public static final C7061e f33838e = C7061e.m20753l(":method");

    /* renamed from: f */
    public static final C7061e f33839f = C7061e.m20753l(":path");

    /* renamed from: g */
    public static final C7061e f33840g = C7061e.m20753l(":scheme");

    /* renamed from: h */
    public static final C7061e f33841h = C7061e.m20753l(":authority");

    /* renamed from: i */
    public static final C7061e f33842i = C7061e.m20753l(":host");

    /* renamed from: j */
    public static final C7061e f33843j = C7061e.m20753l(":version");

    /* renamed from: a */
    public final C7061e f33844a;

    /* renamed from: b */
    public final C7061e f33845b;

    /* renamed from: c */
    final int f33846c;

    public C12491d(C7061e c7061e, C7061e c7061e2) {
        this.f33844a = c7061e;
        this.f33845b = c7061e2;
        this.f33846c = c7061e.m20756B() + 32 + c7061e2.m20756B();
    }

    public C12491d(C7061e c7061e, String str) {
        this(c7061e, C7061e.m20753l(str));
    }

    public C12491d(String str, String str2) {
        this(C7061e.m20753l(str), C7061e.m20753l(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12491d)) {
            return false;
        }
        C12491d c12491d = (C12491d) obj;
        return this.f33844a.equals(c12491d.f33844a) && this.f33845b.equals(c12491d.f33845b);
    }

    public int hashCode() {
        return ((527 + this.f33844a.hashCode()) * 31) + this.f33845b.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", this.f33844a.m20760F(), this.f33845b.m20760F());
    }
}
