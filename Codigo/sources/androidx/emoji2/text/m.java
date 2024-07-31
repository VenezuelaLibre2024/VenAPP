package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    private final b1.b f4415a;

    /* renamed from: b */
    private final char[] f4416b;

    /* renamed from: c */
    private final a f4417c = new a(RecognitionOptions.UPC_E);

    /* renamed from: d */
    private final Typeface f4418d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private final SparseArray<a> f4419a;

        /* renamed from: b */
        private g f4420b;

        private a() {
            this(1);
        }

        a(int i10) {
            this.f4419a = new SparseArray<>(i10);
        }

        public a a(int i10) {
            SparseArray<a> sparseArray = this.f4419a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i10);
        }

        public final g b() {
            return this.f4420b;
        }

        void c(g gVar, int i10, int i11) {
            a a10 = a(gVar.b(i10));
            if (a10 == null) {
                a10 = new a();
                this.f4419a.put(gVar.b(i10), a10);
            }
            if (i11 > i10) {
                a10.c(gVar, i10 + 1, i11);
            } else {
                a10.f4420b = gVar;
            }
        }
    }

    private m(Typeface typeface, b1.b bVar) {
        this.f4418d = typeface;
        this.f4415a = bVar;
        this.f4416b = new char[bVar.k() * 2];
        a(bVar);
    }

    private void a(b1.b bVar) {
        int k10 = bVar.k();
        for (int i10 = 0; i10 < k10; i10++) {
            g gVar = new g(this, i10);
            Character.toChars(gVar.f(), this.f4416b, i10 * 2);
            h(gVar);
        }
    }

    public static m b(Typeface typeface, ByteBuffer byteBuffer) {
        try {
            androidx.core.os.l.a("EmojiCompat.MetadataRepo.create");
            return new m(typeface, l.b(byteBuffer));
        } finally {
            androidx.core.os.l.b();
        }
    }

    public char[] c() {
        return this.f4416b;
    }

    public b1.b d() {
        return this.f4415a;
    }

    public int e() {
        return this.f4415a.l();
    }

    public a f() {
        return this.f4417c;
    }

    public Typeface g() {
        return this.f4418d;
    }

    void h(g gVar) {
        androidx.core.util.h.l(gVar, "emoji metadata cannot be null");
        androidx.core.util.h.b(gVar.c() > 0, "invalid metadata codepoint length");
        this.f4417c.c(gVar, 0, gVar.c() - 1);
    }
}
