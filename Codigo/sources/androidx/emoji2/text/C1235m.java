package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.os.C0953l;
import androidx.core.util.C0984h;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import p019b1.C1606b;

/* renamed from: androidx.emoji2.text.m */
/* loaded from: classes.dex */
public final class C1235m {

    /* renamed from: a */
    private final C1606b f5126a;

    /* renamed from: b */
    private final char[] f5127b;

    /* renamed from: c */
    private final a f5128c = new a(RecognitionOptions.UPC_E);

    /* renamed from: d */
    private final Typeface f5129d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.emoji2.text.m$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final SparseArray<a> f5130a;

        /* renamed from: b */
        private C1229g f5131b;

        private a() {
            this(1);
        }

        a(int i10) {
            this.f5130a = new SparseArray<>(i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public a m6707a(int i10) {
            SparseArray<a> sparseArray = this.f5130a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public final C1229g m6708b() {
            return this.f5131b;
        }

        /* renamed from: c */
        void m6709c(C1229g c1229g, int i10, int i11) {
            a m6707a = m6707a(c1229g.m6653b(i10));
            if (m6707a == null) {
                m6707a = new a();
                this.f5130a.put(c1229g.m6653b(i10), m6707a);
            }
            if (i11 > i10) {
                m6707a.m6709c(c1229g, i10 + 1, i11);
            } else {
                m6707a.f5131b = c1229g;
            }
        }
    }

    private C1235m(Typeface typeface, C1606b c1606b) {
        this.f5129d = typeface;
        this.f5126a = c1606b;
        this.f5127b = new char[c1606b.m8943k() * 2];
        m6699a(c1606b);
    }

    /* renamed from: a */
    private void m6699a(C1606b c1606b) {
        int m8943k = c1606b.m8943k();
        for (int i10 = 0; i10 < m8943k; i10++) {
            C1229g c1229g = new C1229g(this, i10);
            Character.toChars(c1229g.m6657f(), this.f5127b, i10 * 2);
            m6706h(c1229g);
        }
    }

    /* renamed from: b */
    public static C1235m m6700b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            C0953l.m4733a("EmojiCompat.MetadataRepo.create");
            return new C1235m(typeface, C1234l.m6692b(byteBuffer));
        } finally {
            C0953l.m4734b();
        }
    }

    /* renamed from: c */
    public char[] m6701c() {
        return this.f5127b;
    }

    /* renamed from: d */
    public C1606b m6702d() {
        return this.f5126a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m6703e() {
        return this.f5126a.m8944l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public a m6704f() {
        return this.f5128c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Typeface m6705g() {
        return this.f5129d;
    }

    /* renamed from: h */
    void m6706h(C1229g c1229g) {
        C0984h.m4834l(c1229g, "emoji metadata cannot be null");
        C0984h.m4824b(c1229g.m6654c() > 0, "invalid metadata codepoint length");
        this.f5128c.m6709c(c1229g, 0, c1229g.m6654c() - 1);
    }
}
