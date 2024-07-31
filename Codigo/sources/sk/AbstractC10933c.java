package sk;

import java.io.Serializable;
import kotlin.jvm.internal.C9315g;
import p187jk.C9081b;

/* renamed from: sk.c */
/* loaded from: classes3.dex */
public abstract class AbstractC10933c {

    /* renamed from: a */
    public static final a f27828a = new a(null);

    /* renamed from: b */
    private static final AbstractC10933c f27829b = C9081b.f21767a.mo26684b();

    /* renamed from: sk.c$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC10933c implements Serializable {

        /* renamed from: sk.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private static final class C13253a implements Serializable {

            /* renamed from: a */
            public static final C13253a f27830a = new C13253a();
            private static final long serialVersionUID = 0;

            private C13253a() {
            }

            private final Object readResolve() {
                return AbstractC10933c.f27828a;
            }
        }

        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        private final Object writeReplace() {
            return C13253a.f27830a;
        }

        @Override // sk.AbstractC10933c
        /* renamed from: b */
        public int mo33396b(int i10) {
            return AbstractC10933c.f27829b.mo33396b(i10);
        }

        @Override // sk.AbstractC10933c
        /* renamed from: c */
        public int mo33397c() {
            return AbstractC10933c.f27829b.mo33397c();
        }

        @Override // sk.AbstractC10933c
        /* renamed from: d */
        public int mo33398d(int i10) {
            return AbstractC10933c.f27829b.mo33398d(i10);
        }

        @Override // sk.AbstractC10933c
        /* renamed from: e */
        public int mo33402e(int i10, int i11) {
            return AbstractC10933c.f27829b.mo33402e(i10, i11);
        }
    }

    /* renamed from: b */
    public abstract int mo33396b(int i10);

    /* renamed from: c */
    public abstract int mo33397c();

    /* renamed from: d */
    public abstract int mo33398d(int i10);

    /* renamed from: e */
    public int mo33402e(int i10, int i11) {
        int mo33397c;
        int i12;
        int i13;
        int mo33397c2;
        boolean z10;
        C10934d.m33404b(i10, i11);
        int i14 = i11 - i10;
        if (i14 > 0 || i14 == Integer.MIN_VALUE) {
            if (((-i14) & i14) == i14) {
                i13 = mo33396b(C10934d.m33405c(i14));
                return i10 + i13;
            }
            do {
                mo33397c = mo33397c() >>> 1;
                i12 = mo33397c % i14;
            } while ((mo33397c - i12) + (i14 - 1) < 0);
            i13 = i12;
            return i10 + i13;
        }
        do {
            mo33397c2 = mo33397c();
            z10 = false;
            if (i10 <= mo33397c2 && mo33397c2 < i11) {
                z10 = true;
            }
        } while (!z10);
        return mo33397c2;
    }
}
