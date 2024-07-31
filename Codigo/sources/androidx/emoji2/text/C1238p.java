package androidx.emoji2.text;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.core.text.C0976n;
import java.util.stream.IntStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.emoji2.text.p */
/* loaded from: classes.dex */
public class C1238p implements Spannable {

    /* renamed from: a */
    private boolean f5137a = false;

    /* renamed from: b */
    private Spannable f5138b;

    /* renamed from: androidx.emoji2.text.p$a */
    /* loaded from: classes.dex */
    private static class a {
        /* renamed from: a */
        static IntStream m6726a(CharSequence charSequence) {
            return charSequence.chars();
        }

        /* renamed from: b */
        static IntStream m6727b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.emoji2.text.p$b */
    /* loaded from: classes.dex */
    public static class b {
        b() {
        }

        /* renamed from: a */
        boolean mo6728a(CharSequence charSequence) {
            return charSequence instanceof C0976n;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.emoji2.text.p$c */
    /* loaded from: classes.dex */
    public static class c extends b {
        c() {
        }

        @Override // androidx.emoji2.text.C1238p.b
        /* renamed from: a */
        boolean mo6728a(CharSequence charSequence) {
            return (charSequence instanceof PrecomputedText) || (charSequence instanceof C0976n);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1238p(Spannable spannable) {
        this.f5138b = spannable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1238p(CharSequence charSequence) {
        this.f5138b = new SpannableString(charSequence);
    }

    /* renamed from: a */
    private void m6723a() {
        Spannable spannable = this.f5138b;
        if (!this.f5137a && m6724c().mo6728a(spannable)) {
            this.f5138b = new SpannableString(spannable);
        }
        this.f5137a = true;
    }

    /* renamed from: c */
    static b m6724c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Spannable m6725b() {
        return this.f5138b;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        return this.f5138b.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.m6726a(this.f5138b);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.m6727b(this.f5138b);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f5138b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f5138b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f5138b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return (T[]) this.f5138b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f5138b.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f5138b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        m6723a();
        this.f5138b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        m6723a();
        this.f5138b.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return this.f5138b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f5138b.toString();
    }
}
