package gm;

import java.io.Serializable;
import java.io.Writer;

/* renamed from: gm.a */
/* loaded from: classes3.dex */
public class C7603a extends Writer implements Serializable {
    private static final long serialVersionUID = -146927496096066153L;

    /* renamed from: a */
    private final StringBuilder f17981a;

    public C7603a(int i10) {
        this.f17981a = new StringBuilder(i10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) {
        this.f17981a.append(c10);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.f17981a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i10, int i11) {
        this.f17981a.append(charSequence, i10, i11);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public String toString() {
        return this.f17981a.toString();
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.f17981a.append(str);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        if (cArr != null) {
            this.f17981a.append(cArr, i10, i11);
        }
    }
}
