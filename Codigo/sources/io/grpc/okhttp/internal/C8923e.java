package io.grpc.okhttp.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: io.grpc.okhttp.internal.e */
/* loaded from: classes3.dex */
public final class C8923e {

    /* renamed from: a */
    private final String[] f21188a;

    /* renamed from: io.grpc.okhttp.internal.e$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final List<String> f21189a = new ArrayList(20);

        /* renamed from: d */
        private void m26066d(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            }
            if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (charAt <= 31 || charAt >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str));
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("value == null");
            }
            int length2 = str2.length();
            for (int i11 = 0; i11 < length2; i11++) {
                char charAt2 = str2.charAt(i11);
                if (charAt2 <= 31 || charAt2 >= 127) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(charAt2), Integer.valueOf(i11), str2));
                }
            }
        }

        /* renamed from: b */
        b m26067b(String str, String str2) {
            this.f21189a.add(str);
            this.f21189a.add(str2.trim());
            return this;
        }

        /* renamed from: c */
        public C8923e m26068c() {
            return new C8923e(this);
        }

        /* renamed from: e */
        public b m26069e(String str) {
            int i10 = 0;
            while (i10 < this.f21189a.size()) {
                if (str.equalsIgnoreCase(this.f21189a.get(i10))) {
                    this.f21189a.remove(i10);
                    this.f21189a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }

        /* renamed from: f */
        public b m26070f(String str, String str2) {
            m26066d(str, str2);
            m26069e(str);
            m26067b(str, str2);
            return this;
        }
    }

    private C8923e(b bVar) {
        this.f21188a = (String[]) bVar.f21189a.toArray(new String[bVar.f21189a.size()]);
    }

    /* renamed from: a */
    public String m26062a(int i10) {
        int i11 = i10 * 2;
        if (i11 < 0) {
            return null;
        }
        String[] strArr = this.f21188a;
        if (i11 >= strArr.length) {
            return null;
        }
        return strArr[i11];
    }

    /* renamed from: b */
    public int m26063b() {
        return this.f21188a.length / 2;
    }

    /* renamed from: c */
    public String m26064c(int i10) {
        int i11 = (i10 * 2) + 1;
        if (i11 < 0) {
            return null;
        }
        String[] strArr = this.f21188a;
        if (i11 >= strArr.length) {
            return null;
        }
        return strArr[i11];
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int m26063b = m26063b();
        for (int i10 = 0; i10 < m26063b; i10++) {
            sb2.append(m26062a(i10));
            sb2.append(": ");
            sb2.append(m26064c(i10));
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
