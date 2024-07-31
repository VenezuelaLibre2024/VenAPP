package p420wc;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import p420wc.C12154g;
import sc.C10889g;
import vc.C11839i;

/* renamed from: wc.h */
/* loaded from: classes.dex */
class C12155h implements InterfaceC12150c {

    /* renamed from: d */
    private static final Charset f32328d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final File f32329a;

    /* renamed from: b */
    private final int f32330b;

    /* renamed from: c */
    private C12154g f32331c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wc.h$a */
    /* loaded from: classes.dex */
    public class a implements C12154g.d {

        /* renamed from: a */
        final /* synthetic */ byte[] f32332a;

        /* renamed from: b */
        final /* synthetic */ int[] f32333b;

        a(byte[] bArr, int[] iArr) {
            this.f32332a = bArr;
            this.f32333b = iArr;
        }

        @Override // p420wc.C12154g.d
        /* renamed from: a */
        public void mo38982a(InputStream inputStream, int i10) {
            try {
                inputStream.read(this.f32332a, this.f32333b[0], i10);
                int[] iArr = this.f32333b;
                iArr[0] = iArr[0] + i10;
            } finally {
                inputStream.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wc.h$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final byte[] f32335a;

        /* renamed from: b */
        public final int f32336b;

        b(byte[] bArr, int i10) {
            this.f32335a = bArr;
            this.f32336b = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12155h(File file, int i10) {
        this.f32329a = file;
        this.f32330b = i10;
    }

    /* renamed from: f */
    private void m38983f(long j10, String str) {
        if (this.f32331c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i10 = this.f32330b / 4;
            if (str.length() > i10) {
                str = "..." + str.substring(str.length() - i10);
            }
            this.f32331c.m38977g(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f32328d));
            while (!this.f32331c.m38981q() && this.f32331c.m38976U() > this.f32330b) {
                this.f32331c.m38975O();
            }
        } catch (IOException e10) {
            C10889g.m33216f().m33220e("There was a problem writing to the Crashlytics log.", e10);
        }
    }

    /* renamed from: g */
    private b m38984g() {
        if (!this.f32329a.exists()) {
            return null;
        }
        m38985h();
        C12154g c12154g = this.f32331c;
        if (c12154g == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[c12154g.m38976U()];
        try {
            this.f32331c.m38980n(new a(bArr, iArr));
        } catch (IOException e10) {
            C10889g.m33216f().m33220e("A problem occurred while reading the Crashlytics log file.", e10);
        }
        return new b(bArr, iArr[0]);
    }

    /* renamed from: h */
    private void m38985h() {
        if (this.f32331c == null) {
            try {
                this.f32331c = new C12154g(this.f32329a);
            } catch (IOException e10) {
                C10889g.m33216f().m33220e("Could not open log file: " + this.f32329a, e10);
            }
        }
    }

    @Override // p420wc.InterfaceC12150c
    /* renamed from: a */
    public void mo38920a() {
        C11839i.m37725f(this.f32331c, "There was a problem closing the Crashlytics log file.");
        this.f32331c = null;
    }

    @Override // p420wc.InterfaceC12150c
    /* renamed from: b */
    public String mo38921b() {
        byte[] mo38922c = mo38922c();
        if (mo38922c != null) {
            return new String(mo38922c, f32328d);
        }
        return null;
    }

    @Override // p420wc.InterfaceC12150c
    /* renamed from: c */
    public byte[] mo38922c() {
        b m38984g = m38984g();
        if (m38984g == null) {
            return null;
        }
        int i10 = m38984g.f32336b;
        byte[] bArr = new byte[i10];
        System.arraycopy(m38984g.f32335a, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // p420wc.InterfaceC12150c
    /* renamed from: d */
    public void mo38923d() {
        mo38920a();
        this.f32329a.delete();
    }

    @Override // p420wc.InterfaceC12150c
    /* renamed from: e */
    public void mo38924e(long j10, String str) {
        m38985h();
        m38983f(j10, str);
    }
}
