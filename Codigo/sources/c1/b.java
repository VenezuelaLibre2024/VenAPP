package c1;

import android.text.Editable;
import androidx.emoji2.text.n;

/* loaded from: classes.dex */
final class b extends Editable.Factory {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f6781a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile Editable.Factory f6782b;

    /* renamed from: c, reason: collision with root package name */
    private static Class<?> f6783c;

    private b() {
        try {
            f6783c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f6782b == null) {
            synchronized (f6781a) {
                if (f6782b == null) {
                    f6782b = new b();
                }
            }
        }
        return f6782b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f6783c;
        return cls != null ? n.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
