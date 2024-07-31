package uk;

import dk.e0;

/* loaded from: classes3.dex */
public class d implements Iterable<Integer>, pk.a {

    /* renamed from: d */
    public static final a f27787d = new a(null);

    /* renamed from: a */
    private final int f27788a;

    /* renamed from: b */
    private final int f27789b;

    /* renamed from: c */
    private final int f27790c;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final d a(int i10, int i11, int i12) {
            return new d(i10, i11, i12);
        }
    }

    public d(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f27788a = i10;
        this.f27789b = jk.c.c(i10, i11, i12);
        this.f27790c = i12;
    }

    public final int c() {
        return this.f27788a;
    }

    public final int d() {
        return this.f27789b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (this.f27788a != dVar.f27788a || this.f27789b != dVar.f27789b || this.f27790c != dVar.f27790c) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f27790c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f27788a * 31) + this.f27789b) * 31) + this.f27790c;
    }

    public boolean isEmpty() {
        if (this.f27790c > 0) {
            if (this.f27788a > this.f27789b) {
                return true;
            }
        } else if (this.f27788a < this.f27789b) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    /* renamed from: k */
    public e0 iterator() {
        return new e(this.f27788a, this.f27789b, this.f27790c);
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f27790c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f27788a);
            sb2.append("..");
            sb2.append(this.f27789b);
            sb2.append(" step ");
            i10 = this.f27790c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f27788a);
            sb2.append(" downTo ");
            sb2.append(this.f27789b);
            sb2.append(" step ");
            i10 = -this.f27790c;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
