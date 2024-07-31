package wc;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import wc.g;

/* loaded from: classes.dex */
class h implements c {

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f29863d = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final File f29864a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29865b;

    /* renamed from: c, reason: collision with root package name */
    private g f29866c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements g.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f29867a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int[] f29868b;

        a(byte[] bArr, int[] iArr) {
            this.f29867a = bArr;
            this.f29868b = iArr;
        }

        @Override // wc.g.d
        public void a(InputStream inputStream, int i10) {
            try {
                inputStream.read(this.f29867a, this.f29868b[0], i10);
                int[] iArr = this.f29868b;
                iArr[0] = iArr[0] + i10;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f29870a;

        /* renamed from: b, reason: collision with root package name */
        public final int f29871b;

        b(byte[] bArr, int i10) {
            this.f29870a = bArr;
            this.f29871b = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(File file, int i10) {
        this.f29864a = file;
        this.f29865b = i10;
    }

    private void f(long j10, String str) {
        if (this.f29866c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i10 = this.f29865b / 4;
            if (str.length() > i10) {
                str = "..." + str.substring(str.length() - i10);
            }
            this.f29866c.g(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f29863d));
            while (!this.f29866c.q() && this.f29866c.U() > this.f29865b) {
                this.f29866c.O();
            }
        } catch (IOException e10) {
            sc.g.f().e("There was a problem writing to the Crashlytics log.", e10);
        }
    }

    private b g() {
        if (!this.f29864a.exists()) {
            return null;
        }
        h();
        g gVar = this.f29866c;
        if (gVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[gVar.U()];
        try {
            this.f29866c.n(new a(bArr, iArr));
        } catch (IOException e10) {
            sc.g.f().e("A problem occurred while reading the Crashlytics log file.", e10);
        }
        return new b(bArr, iArr[0]);
    }

    private void h() {
        if (this.f29866c == null) {
            try {
                this.f29866c = new g(this.f29864a);
            } catch (IOException e10) {
                sc.g.f().e("Could not open log file: " + this.f29864a, e10);
            }
        }
    }

    @Override // wc.c
    public void a() {
        vc.i.f(this.f29866c, "There was a problem closing the Crashlytics log file.");
        this.f29866c = null;
    }

    @Override // wc.c
    public String b() {
        byte[] c10 = c();
        if (c10 != null) {
            return new String(c10, f29863d);
        }
        return null;
    }

    @Override // wc.c
    public byte[] c() {
        b g10 = g();
        if (g10 == null) {
            return null;
        }
        int i10 = g10.f29871b;
        byte[] bArr = new byte[i10];
        System.arraycopy(g10.f29870a, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // wc.c
    public void d() {
        a();
        this.f29864a.delete();
    }

    @Override // wc.c
    public void e(long j10, String str) {
        h();
        f(j10, str);
    }
}
