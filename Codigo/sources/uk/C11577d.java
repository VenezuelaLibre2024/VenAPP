package uk;

import dk.AbstractC7006e0;
import kotlin.jvm.internal.C9315g;
import p187jk.C9082c;
import pk.InterfaceC10201a;

/* renamed from: uk.d */
/* loaded from: classes3.dex */
public class C11577d implements Iterable<Integer>, InterfaceC10201a {

    /* renamed from: d */
    public static final a f30110d = new a(null);

    /* renamed from: a */
    private final int f30111a;

    /* renamed from: b */
    private final int f30112b;

    /* renamed from: c */
    private final int f30113c;

    /* renamed from: uk.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C11577d m36272a(int i10, int i11, int i12) {
            return new C11577d(i10, i11, i12);
        }
    }

    public C11577d(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f30111a = i10;
        this.f30112b = C9082c.m26687c(i10, i11, i12);
        this.f30113c = i12;
    }

    /* renamed from: c */
    public final int m36268c() {
        return this.f30111a;
    }

    /* renamed from: d */
    public final int m36269d() {
        return this.f30112b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C11577d) {
            if (!isEmpty() || !((C11577d) obj).isEmpty()) {
                C11577d c11577d = (C11577d) obj;
                if (this.f30111a != c11577d.f30111a || this.f30112b != c11577d.f30112b || this.f30113c != c11577d.f30113c) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m36270f() {
        return this.f30113c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f30111a * 31) + this.f30112b) * 31) + this.f30113c;
    }

    public boolean isEmpty() {
        if (this.f30113c > 0) {
            if (this.f30111a > this.f30112b) {
                return true;
            }
        } else if (this.f30111a < this.f30112b) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC7006e0 iterator() {
        return new C11578e(this.f30111a, this.f30112b, this.f30113c);
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f30113c > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f30111a);
            sb2.append("..");
            sb2.append(this.f30112b);
            sb2.append(" step ");
            i10 = this.f30113c;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f30111a);
            sb2.append(" downTo ");
            sb2.append(this.f30112b);
            sb2.append(" step ");
            i10 = -this.f30113c;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
