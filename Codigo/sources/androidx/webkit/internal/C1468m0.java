package androidx.webkit.internal;

import android.content.Context;
import android.util.TypedValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: androidx.webkit.internal.m0 */
/* loaded from: classes.dex */
public class C1468m0 {

    /* renamed from: a */
    private Context f6456a;

    public C1468m0(Context context) {
        this.f6456a = context;
    }

    /* renamed from: a */
    public static String m8389a(File file) {
        String canonicalPath = file.getCanonicalPath();
        if (canonicalPath.endsWith("/")) {
            return canonicalPath;
        }
        return canonicalPath + "/";
    }

    /* renamed from: b */
    public static File m8390b(File file, String str) {
        String m8389a = m8389a(file);
        String canonicalPath = new File(file, str).getCanonicalPath();
        if (canonicalPath.startsWith(m8389a)) {
            return new File(canonicalPath);
        }
        return null;
    }

    /* renamed from: c */
    public static File m8391c(Context context) {
        return C1440d.m8297e(context);
    }

    /* renamed from: d */
    private int m8392d(String str, String str2) {
        return this.f6456a.getResources().getIdentifier(str2, str, this.f6456a.getPackageName());
    }

    /* renamed from: e */
    private int m8393e(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f6456a.getResources().getValue(i10, typedValue, true);
        return typedValue.type;
    }

    /* renamed from: f */
    public static String m8394f(String str) {
        String m8430a = C1486s0.m8430a(str);
        return m8430a == null ? "text/plain" : m8430a;
    }

    /* renamed from: g */
    private static InputStream m8395g(String str, InputStream inputStream) {
        return str.endsWith(".svgz") ? new GZIPInputStream(inputStream) : inputStream;
    }

    /* renamed from: i */
    public static InputStream m8396i(File file) {
        return m8395g(file.getPath(), new FileInputStream(file));
    }

    /* renamed from: k */
    private static String m8397k(String str) {
        return (str.length() <= 1 || str.charAt(0) != '/') ? str : str.substring(1);
    }

    /* renamed from: h */
    public InputStream m8398h(String str) {
        String m8397k = m8397k(str);
        return m8395g(m8397k, this.f6456a.getAssets().open(m8397k, 2));
    }

    /* renamed from: j */
    public InputStream m8399j(String str) {
        String m8397k = m8397k(str);
        String[] split = m8397k.split("/", -1);
        if (split.length != 2) {
            throw new IllegalArgumentException("Incorrect resource path: " + m8397k);
        }
        String str2 = split[0];
        String str3 = split[1];
        int lastIndexOf = str3.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str3 = str3.substring(0, lastIndexOf);
        }
        int m8392d = m8392d(str2, str3);
        int m8393e = m8393e(m8392d);
        if (m8393e == 3) {
            return m8395g(m8397k, this.f6456a.getResources().openRawResource(m8392d));
        }
        throw new IOException(String.format("Expected %s resource to be of TYPE_STRING but was %d", m8397k, Integer.valueOf(m8393e)));
    }
}
