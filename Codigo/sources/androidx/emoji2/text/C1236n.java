package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import androidx.core.util.C0984h;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.emoji2.text.n */
/* loaded from: classes.dex */
public final class C1236n extends SpannableStringBuilder {

    /* renamed from: a */
    private final Class<?> f5132a;

    /* renamed from: b */
    private final List<a> f5133b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.emoji2.text.n$a */
    /* loaded from: classes.dex */
    public static class a implements TextWatcher, SpanWatcher {

        /* renamed from: a */
        final Object f5134a;

        /* renamed from: b */
        private final AtomicInteger f5135b = new AtomicInteger(0);

        a(Object obj) {
            this.f5134a = obj;
        }

        /* renamed from: b */
        private boolean m6719b(Object obj) {
            return obj instanceof AbstractC1231i;
        }

        /* renamed from: a */
        final void m6720a() {
            this.f5135b.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f5134a).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f5134a).beforeTextChanged(charSequence, i10, i11, i12);
        }

        /* renamed from: c */
        final void m6721c() {
            this.f5135b.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f5135b.get() <= 0 || !m6719b(obj)) {
                ((SpanWatcher) this.f5134a).onSpanAdded(spannable, obj, i10, i11);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i10, int i11, int i12, int i13) {
            int i14;
            int i15;
            if (this.f5135b.get() <= 0 || !m6719b(obj)) {
                if (Build.VERSION.SDK_INT < 28) {
                    if (i10 > i11) {
                        i10 = 0;
                    }
                    if (i12 > i13) {
                        i14 = i10;
                        i15 = 0;
                        ((SpanWatcher) this.f5134a).onSpanChanged(spannable, obj, i14, i11, i15, i13);
                    }
                }
                i14 = i10;
                i15 = i12;
                ((SpanWatcher) this.f5134a).onSpanChanged(spannable, obj, i14, i11, i15, i13);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i10, int i11) {
            if (this.f5135b.get() <= 0 || !m6719b(obj)) {
                ((SpanWatcher) this.f5134a).onSpanRemoved(spannable, obj, i10, i11);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            ((TextWatcher) this.f5134a).onTextChanged(charSequence, i10, i11, i12);
        }
    }

    C1236n(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        this.f5133b = new ArrayList();
        C0984h.m4834l(cls, "watcherClass cannot be null");
        this.f5132a = cls;
    }

    C1236n(Class<?> cls, CharSequence charSequence, int i10, int i11) {
        super(charSequence, i10, i11);
        this.f5133b = new ArrayList();
        C0984h.m4834l(cls, "watcherClass cannot be null");
        this.f5132a = cls;
    }

    /* renamed from: b */
    private void m6710b() {
        for (int i10 = 0; i10 < this.f5133b.size(); i10++) {
            this.f5133b.get(i10).m6720a();
        }
    }

    /* renamed from: c */
    public static C1236n m6711c(Class<?> cls, CharSequence charSequence) {
        return new C1236n(cls, charSequence);
    }

    /* renamed from: e */
    private void m6712e() {
        for (int i10 = 0; i10 < this.f5133b.size(); i10++) {
            this.f5133b.get(i10).onTextChanged(this, 0, length(), length());
        }
    }

    /* renamed from: f */
    private a m6713f(Object obj) {
        for (int i10 = 0; i10 < this.f5133b.size(); i10++) {
            a aVar = this.f5133b.get(i10);
            if (aVar.f5134a == obj) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: g */
    private boolean m6714g(Class<?> cls) {
        return this.f5132a == cls;
    }

    /* renamed from: h */
    private boolean m6715h(Object obj) {
        return obj != null && m6714g(obj.getClass());
    }

    /* renamed from: i */
    private void m6716i() {
        for (int i10 = 0; i10 < this.f5133b.size(); i10++) {
            this.f5133b.get(i10).m6721c();
        }
    }

    /* renamed from: a */
    public void m6717a() {
        m6710b();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c10) {
        super.append(c10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence, int i10, int i11) {
        super.append(charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i10) {
        super.append(charSequence, obj, i10);
        return this;
    }

    /* renamed from: d */
    public void m6718d() {
        m6716i();
        m6712e();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder delete(int i10, int i11) {
        super.delete(i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        a m6713f;
        if (m6715h(obj) && (m6713f = m6713f(obj)) != null) {
            obj = m6713f;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        a m6713f;
        if (m6715h(obj) && (m6713f = m6713f(obj)) != null) {
            obj = m6713f;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        a m6713f;
        if (m6715h(obj) && (m6713f = m6713f(obj)) != null) {
            obj = m6713f;
        }
        return super.getSpanStart(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        if (!m6714g(cls)) {
            return (T[]) super.getSpans(i10, i11, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i10, i11, a.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, aVarArr.length));
        for (int i12 = 0; i12 < aVarArr.length; i12++) {
            tArr[i12] = aVarArr[i12].f5134a;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i10, CharSequence charSequence) {
        super.insert(i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i10, CharSequence charSequence, int i11, int i12) {
        super.insert(i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i10, int i11, Class cls) {
        if (cls == null || m6714g(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        a aVar;
        if (m6715h(obj)) {
            aVar = m6713f(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f5133b.remove(aVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence) {
        m6710b();
        super.replace(i10, i11, charSequence);
        m6716i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        m6710b();
        super.replace(i10, i11, charSequence, i12, i13);
        m6716i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (m6715h(obj)) {
            a aVar = new a(obj);
            this.f5133b.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i10, i11, i12);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int i10, int i11) {
        return new C1236n(this.f5132a, this, i10, i11);
    }
}
