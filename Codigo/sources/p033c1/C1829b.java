package p033c1;

import android.text.Editable;
import androidx.emoji2.text.C1236n;

/* renamed from: c1.b */
/* loaded from: classes.dex */
final class C1829b extends Editable.Factory {

    /* renamed from: a */
    private static final Object f7730a = new Object();

    /* renamed from: b */
    private static volatile Editable.Factory f7731b;

    /* renamed from: c */
    private static Class<?> f7732c;

    private C1829b() {
        try {
            f7732c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C1829b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f7731b == null) {
            synchronized (f7730a) {
                if (f7731b == null) {
                    f7731b = new C1829b();
                }
            }
        }
        return f7731b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f7732c;
        return cls != null ? C1236n.m6711c(cls, charSequence) : super.newEditable(charSequence);
    }
}
