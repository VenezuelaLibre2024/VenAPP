package ga;

import android.util.Log;
import com.google.android.gms.common.internal.C5249j;
import java.util.Locale;

/* renamed from: ga.a */
/* loaded from: classes.dex */
public class C7533a {

    /* renamed from: a */
    private final String f17803a;

    /* renamed from: b */
    private final String f17804b;

    /* renamed from: c */
    private final C5249j f17805c;

    /* renamed from: d */
    private final int f17806d;

    public C7533a(String str, String... strArr) {
        String sb2;
        if (strArr.length == 0) {
            sb2 = "";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            for (String str2 : strArr) {
                if (sb3.length() > 1) {
                    sb3.append(",");
                }
                sb3.append(str2);
            }
            sb3.append("] ");
            sb2 = sb3.toString();
        }
        this.f17804b = sb2;
        this.f17803a = str;
        this.f17805c = new C5249j(str);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f17803a, i10)) {
            i10++;
        }
        this.f17806d = i10;
    }

    /* renamed from: a */
    public void m22869a(String str, Object... objArr) {
        if (m22874f(3)) {
            Log.d(this.f17803a, m22872d(str, objArr));
        }
    }

    /* renamed from: b */
    public void m22870b(String str, Throwable th2, Object... objArr) {
        Log.e(this.f17803a, m22872d(str, objArr), th2);
    }

    /* renamed from: c */
    public void m22871c(String str, Object... objArr) {
        Log.e(this.f17803a, m22872d(str, objArr));
    }

    /* renamed from: d */
    protected String m22872d(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f17804b.concat(str);
    }

    /* renamed from: e */
    public void m22873e(String str, Object... objArr) {
        Log.i(this.f17803a, m22872d(str, objArr));
    }

    /* renamed from: f */
    public boolean m22874f(int i10) {
        return this.f17806d <= i10;
    }

    /* renamed from: g */
    public void m22875g(String str, Object... objArr) {
        if (m22874f(2)) {
            Log.v(this.f17803a, m22872d(str, objArr));
        }
    }

    /* renamed from: h */
    public void m22876h(String str, Object... objArr) {
        Log.w(this.f17803a, m22872d(str, objArr));
    }

    /* renamed from: i */
    public void m22877i(String str, Throwable th2, Object... objArr) {
        Log.wtf(this.f17803a, m22872d(str, objArr), th2);
    }

    /* renamed from: j */
    public void m22878j(Throwable th2) {
        Log.wtf(this.f17803a, th2);
    }
}
