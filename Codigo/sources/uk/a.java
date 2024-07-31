package uk;

import dk.o;

/* loaded from: classes3.dex */
public class a implements Iterable<Character>, pk.a {

    /* renamed from: d, reason: collision with root package name */
    public static final C0450a f27777d = new C0450a(null);

    /* renamed from: a, reason: collision with root package name */
    private final char f27778a;

    /* renamed from: b, reason: collision with root package name */
    private final char f27779b;

    /* renamed from: c, reason: collision with root package name */
    private final int f27780c;

    /* renamed from: uk.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0450a {
        private C0450a() {
        }

        public /* synthetic */ C0450a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public a(char c10, char c11, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f27778a = c10;
        this.f27779b = (char) jk.c.c(c10, c11, i10);
        this.f27780c = i10;
    }

    public final char c() {
        return this.f27778a;
    }

    public final char d() {
        return this.f27779b;
    }

    @Override // java.lang.Iterable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public o iterator() {
        return new b(this.f27778a, this.f27779b, this.f27780c);
    }
}
