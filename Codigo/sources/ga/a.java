package ga;

import android.util.Log;
import com.google.android.gms.common.internal.j;
import java.util.Locale;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f16166a;

    /* renamed from: b, reason: collision with root package name */
    private final String f16167b;

    /* renamed from: c, reason: collision with root package name */
    private final j f16168c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16169d;

    public a(String str, String... strArr) {
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
        this.f16167b = sb2;
        this.f16166a = str;
        this.f16168c = new j(str);
        int i10 = 2;
        while (i10 <= 7 && !Log.isLoggable(this.f16166a, i10)) {
            i10++;
        }
        this.f16169d = i10;
    }

    public void a(String str, Object... objArr) {
        if (f(3)) {
            Log.d(this.f16166a, d(str, objArr));
        }
    }

    public void b(String str, Throwable th2, Object... objArr) {
        Log.e(this.f16166a, d(str, objArr), th2);
    }

    public void c(String str, Object... objArr) {
        Log.e(this.f16166a, d(str, objArr));
    }

    protected String d(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f16167b.concat(str);
    }

    public void e(String str, Object... objArr) {
        Log.i(this.f16166a, d(str, objArr));
    }

    public boolean f(int i10) {
        return this.f16169d <= i10;
    }

    public void g(String str, Object... objArr) {
        if (f(2)) {
            Log.v(this.f16166a, d(str, objArr));
        }
    }

    public void h(String str, Object... objArr) {
        Log.w(this.f16166a, d(str, objArr));
    }

    public void i(String str, Throwable th2, Object... objArr) {
        Log.wtf(this.f16166a, d(str, objArr), th2);
    }

    public void j(Throwable th2) {
        Log.wtf(this.f16166a, th2);
    }
}
