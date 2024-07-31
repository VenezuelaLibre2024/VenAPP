package p232m4;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import p007a5.C0033a;
import p450xk.C12511c;
import p450xk.C12514f;

/* renamed from: m4.d */
/* loaded from: classes.dex */
public final class C9543d {

    /* renamed from: a */
    public static final C9543d f23239a = new C9543d();

    private C9543d() {
    }

    /* renamed from: a */
    private final boolean m28403a(TextView textView) {
        int i10;
        int m40959d;
        if (C0033a.m107d(this)) {
            return false;
        }
        try {
            String m40970b = new C12514f("\\s").m40970b(C9545f.m28424k(textView), "");
            int length = m40970b.length();
            if (length >= 12 && length <= 19) {
                int i11 = length - 1;
                if (i11 >= 0) {
                    boolean z10 = false;
                    i10 = 0;
                    while (true) {
                        int i12 = i11 - 1;
                        char charAt = m40970b.charAt(i11);
                        if (!Character.isDigit(charAt)) {
                            return false;
                        }
                        m40959d = C12511c.m40959d(charAt);
                        if (z10 && (m40959d = m40959d * 2) > 9) {
                            m40959d = (m40959d % 10) + 1;
                        }
                        i10 += m40959d;
                        z10 = !z10;
                        if (i12 < 0) {
                            break;
                        }
                        i11 = i12;
                    }
                } else {
                    i10 = 0;
                }
                return i10 % 10 == 0;
            }
            return false;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return false;
        }
    }

    /* renamed from: b */
    private final boolean m28404b(TextView textView) {
        if (C0033a.m107d(this)) {
            return false;
        }
        try {
            boolean z10 = true;
            if (textView.getInputType() == 32) {
                return true;
            }
            String m28424k = C9545f.m28424k(textView);
            if (m28424k == null) {
                return false;
            }
            if (m28424k.length() != 0) {
                z10 = false;
            }
            if (z10) {
                return false;
            }
            return Patterns.EMAIL_ADDRESS.matcher(m28424k).matches();
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return false;
        }
    }

    /* renamed from: c */
    private final boolean m28405c(TextView textView) {
        if (C0033a.m107d(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return false;
        }
    }

    /* renamed from: d */
    private final boolean m28406d(TextView textView) {
        if (C0033a.m107d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 96;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return false;
        }
    }

    /* renamed from: e */
    private final boolean m28407e(TextView textView) {
        if (C0033a.m107d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 3;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return false;
        }
    }

    /* renamed from: f */
    private final boolean m28408f(TextView textView) {
        if (C0033a.m107d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 112;
        } catch (Throwable th2) {
            C0033a.m105b(th2, this);
            return false;
        }
    }

    /* renamed from: g */
    public static final boolean m28409g(View view) {
        if (C0033a.m107d(C9543d.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            C9543d c9543d = f23239a;
            if (!c9543d.m28405c((TextView) view) && !c9543d.m28403a((TextView) view) && !c9543d.m28406d((TextView) view) && !c9543d.m28408f((TextView) view) && !c9543d.m28407e((TextView) view)) {
                if (!c9543d.m28404b((TextView) view)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9543d.class);
            return false;
        }
    }
}
