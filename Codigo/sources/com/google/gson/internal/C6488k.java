package com.google.gson.internal;

import com.google.gson.AbstractC6494j;
import com.google.gson.C6495k;
import com.google.gson.C6496l;
import com.google.gson.C6502r;
import com.google.gson.internal.bind.TypeAdapters;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import nf.C9712a;
import nf.C9714c;
import nf.C9715d;

/* renamed from: com.google.gson.internal.k */
/* loaded from: classes2.dex */
public final class C6488k {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.gson.internal.k$a */
    /* loaded from: classes2.dex */
    public static final class a extends Writer {

        /* renamed from: a */
        private final Appendable f14260a;

        /* renamed from: b */
        private final C13197a f14261b = new C13197a();

        /* renamed from: com.google.gson.internal.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static class C13197a implements CharSequence {

            /* renamed from: a */
            char[] f14262a;

            C13197a() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i10) {
                return this.f14262a[i10];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f14262a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f14262a, i10, i11 - i10);
            }
        }

        a(Appendable appendable) {
            this.f14260a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(int i10) {
            this.f14260a.append((char) i10);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            C13197a c13197a = this.f14261b;
            c13197a.f14262a = cArr;
            this.f14260a.append(c13197a, i10, i11 + i10);
        }
    }

    /* renamed from: a */
    public static AbstractC6494j m18262a(C9712a c9712a) {
        boolean z10;
        try {
            try {
                c9712a.mo18212h0();
                z10 = false;
                try {
                    return TypeAdapters.f14144V.read(c9712a);
                } catch (EOFException e10) {
                    e = e10;
                    if (z10) {
                        return C6496l.f14280a;
                    }
                    throw new C6502r(e);
                }
            } catch (C9715d e11) {
                throw new C6502r(e11);
            } catch (IOException e12) {
                throw new C6495k(e12);
            } catch (NumberFormatException e13) {
                throw new C6502r(e13);
            }
        } catch (EOFException e14) {
            e = e14;
            z10 = true;
        }
    }

    /* renamed from: b */
    public static void m18263b(AbstractC6494j abstractC6494j, C9714c c9714c) {
        TypeAdapters.f14144V.write(c9714c, abstractC6494j);
    }

    /* renamed from: c */
    public static Writer m18264c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }
}
