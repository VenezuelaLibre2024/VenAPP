package uk;

import dk.AbstractC7025o;
import kotlin.jvm.internal.C9315g;
import p187jk.C9082c;
import pk.InterfaceC10201a;

/* renamed from: uk.a */
/* loaded from: classes3.dex */
public class C11574a implements Iterable<Character>, InterfaceC10201a {

    /* renamed from: d */
    public static final a f30100d = new a(null);

    /* renamed from: a */
    private final char f30101a;

    /* renamed from: b */
    private final char f30102b;

    /* renamed from: c */
    private final int f30103c;

    /* renamed from: uk.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C11574a(char c10, char c11, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f30101a = c10;
        this.f30102b = (char) C9082c.m26687c(c10, c11, i10);
        this.f30103c = i10;
    }

    /* renamed from: c */
    public final char m36265c() {
        return this.f30101a;
    }

    /* renamed from: d */
    public final char m36266d() {
        return this.f30102b;
    }

    @Override // java.lang.Iterable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public AbstractC7025o iterator() {
        return new C11575b(this.f30101a, this.f30102b, this.f30103c);
    }
}
