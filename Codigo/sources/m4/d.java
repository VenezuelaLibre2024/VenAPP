package m4;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public static final d f21385a = new d();

    private d() {
    }

    private final boolean a(TextView textView) {
        int i10;
        int d10;
        if (a5.a.d(this)) {
            return false;
        }
        try {
            String b10 = new xk.f("\\s").b(f.k(textView), "");
            int length = b10.length();
            if (length >= 12 && length <= 19) {
                int i11 = length - 1;
                if (i11 >= 0) {
                    boolean z10 = false;
                    i10 = 0;
                    while (true) {
                        int i12 = i11 - 1;
                        char charAt = b10.charAt(i11);
                        if (!Character.isDigit(charAt)) {
                            return false;
                        }
                        d10 = xk.c.d(charAt);
                        if (z10 && (d10 = d10 * 2) > 9) {
                            d10 = (d10 % 10) + 1;
                        }
                        i10 += d10;
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
            a5.a.b(th2, this);
            return false;
        }
    }

    private final boolean b(TextView textView) {
        if (a5.a.d(this)) {
            return false;
        }
        try {
            boolean z10 = true;
            if (textView.getInputType() == 32) {
                return true;
            }
            String k10 = f.k(textView);
            if (k10 == null) {
                return false;
            }
            if (k10.length() != 0) {
                z10 = false;
            }
            if (z10) {
                return false;
            }
            return Patterns.EMAIL_ADDRESS.matcher(k10).matches();
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return false;
        }
    }

    private final boolean c(TextView textView) {
        if (a5.a.d(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return false;
        }
    }

    private final boolean d(TextView textView) {
        if (a5.a.d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 96;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return false;
        }
    }

    private final boolean e(TextView textView) {
        if (a5.a.d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 3;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return false;
        }
    }

    private final boolean f(TextView textView) {
        if (a5.a.d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 112;
        } catch (Throwable th2) {
            a5.a.b(th2, this);
            return false;
        }
    }

    public static final boolean g(View view) {
        if (a5.a.d(d.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            d dVar = f21385a;
            if (!dVar.c((TextView) view) && !dVar.a((TextView) view) && !dVar.d((TextView) view) && !dVar.f((TextView) view) && !dVar.e((TextView) view)) {
                if (!dVar.b((TextView) view)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th2) {
            a5.a.b(th2, d.class);
            return false;
        }
    }
}
