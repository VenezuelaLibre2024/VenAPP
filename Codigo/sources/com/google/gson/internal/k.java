package com.google.gson.internal;

import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.r;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes2.dex */
public final class k {

    /* loaded from: classes2.dex */
    public static final class a extends Writer {

        /* renamed from: a */
        private final Appendable f12986a;

        /* renamed from: b */
        private final C0184a f12987b = new C0184a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.gson.internal.k$a$a */
        /* loaded from: classes2.dex */
        public static class C0184a implements CharSequence {

            /* renamed from: a */
            char[] f12988a;

            C0184a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i10) {
                return this.f12988a[i10];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f12988a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f12988a, i10, i11 - i10);
            }
        }

        a(Appendable appendable) {
            this.f12986a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(int i10) {
            this.f12986a.append((char) i10);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            C0184a c0184a = this.f12987b;
            c0184a.f12988a = cArr;
            this.f12986a.append(c0184a, i10, i11 + i10);
        }
    }

    public static com.google.gson.j a(nf.a aVar) {
        boolean z10;
        try {
            try {
                aVar.h0();
                z10 = false;
                try {
                    return TypeAdapters.V.read(aVar);
                } catch (EOFException e10) {
                    e = e10;
                    if (z10) {
                        return com.google.gson.l.f13006a;
                    }
                    throw new r(e);
                }
            } catch (nf.d e11) {
                throw new r(e11);
            } catch (IOException e12) {
                throw new com.google.gson.k(e12);
            } catch (NumberFormatException e13) {
                throw new r(e13);
            }
        } catch (EOFException e14) {
            e = e14;
            z10 = true;
        }
    }

    public static void b(com.google.gson.j jVar, nf.c cVar) {
        TypeAdapters.V.write(cVar, jVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }
}
