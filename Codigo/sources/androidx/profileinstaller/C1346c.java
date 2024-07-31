package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.C1351h;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: androidx.profileinstaller.c */
/* loaded from: classes.dex */
public class C1346c {

    /* renamed from: a */
    private final AssetManager f5792a;

    /* renamed from: b */
    private final Executor f5793b;

    /* renamed from: c */
    private final C1351h.c f5794c;

    /* renamed from: e */
    private final File f5796e;

    /* renamed from: f */
    private final String f5797f;

    /* renamed from: g */
    private final String f5798g;

    /* renamed from: h */
    private final String f5799h;

    /* renamed from: j */
    private C1347d[] f5801j;

    /* renamed from: k */
    private byte[] f5802k;

    /* renamed from: i */
    private boolean f5800i = false;

    /* renamed from: d */
    private final byte[] f5795d = m7487d();

    public C1346c(AssetManager assetManager, Executor executor, C1351h.c cVar, String str, String str2, String str3, File file) {
        this.f5792a = assetManager;
        this.f5793b = executor;
        this.f5794c = cVar;
        this.f5797f = str;
        this.f5798g = str2;
        this.f5799h = str3;
        this.f5796e = file;
    }

    /* renamed from: b */
    private C1346c m7485b(C1347d[] c1347dArr, byte[] bArr) {
        C1351h.c cVar;
        int i10;
        InputStream m7490h;
        try {
            m7490h = m7490h(this.f5792a, this.f5799h);
        } catch (FileNotFoundException e10) {
            e = e10;
            cVar = this.f5794c;
            i10 = 9;
            cVar.mo7465a(i10, e);
            return null;
        } catch (IOException e11) {
            e = e11;
            cVar = this.f5794c;
            i10 = 7;
            cVar.mo7465a(i10, e);
            return null;
        } catch (IllegalStateException e12) {
            e = e12;
            this.f5801j = null;
            cVar = this.f5794c;
            i10 = 8;
            cVar.mo7465a(i10, e);
            return null;
        }
        if (m7490h == null) {
            if (m7490h != null) {
                m7490h.close();
            }
            return null;
        }
        try {
            this.f5801j = C1356m.m7561q(m7490h, C1356m.m7559o(m7490h, C1356m.f5823b), bArr, c1347dArr);
            m7490h.close();
            return this;
        } finally {
        }
    }

    /* renamed from: c */
    private void m7486c() {
        if (!this.f5800i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    /* renamed from: d */
    private static byte[] m7487d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 33) {
            return null;
        }
        switch (i10) {
            case 24:
            case 25:
                return C1358o.f5838e;
            case 26:
                return C1358o.f5837d;
            case 27:
                return C1358o.f5836c;
            case 28:
            case 29:
            case 30:
                return C1358o.f5835b;
            case 31:
            case 32:
            case 33:
                return C1358o.f5834a;
            default:
                return null;
        }
    }

    /* renamed from: f */
    private InputStream m7488f(AssetManager assetManager) {
        C1351h.c cVar;
        int i10;
        try {
            return m7490h(assetManager, this.f5798g);
        } catch (FileNotFoundException e10) {
            e = e10;
            cVar = this.f5794c;
            i10 = 6;
            cVar.mo7465a(i10, e);
            return null;
        } catch (IOException e11) {
            e = e11;
            cVar = this.f5794c;
            i10 = 7;
            cVar.mo7465a(i10, e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m7489g(int i10, Object obj) {
        this.f5794c.mo7465a(i10, obj);
    }

    /* renamed from: h */
    private InputStream m7490h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f5794c.mo7466b(5, null);
            }
            return null;
        }
    }

    /* renamed from: j */
    private C1347d[] m7491j(InputStream inputStream) {
        try {
            try {
                try {
                    C1347d[] m7567w = C1356m.m7567w(inputStream, C1356m.m7559o(inputStream, C1356m.f5822a), this.f5797f);
                    try {
                        inputStream.close();
                        return m7567w;
                    } catch (IOException e10) {
                        this.f5794c.mo7465a(7, e10);
                        return m7567w;
                    }
                } catch (IOException e11) {
                    this.f5794c.mo7465a(7, e11);
                    inputStream.close();
                    return null;
                } catch (IllegalStateException e12) {
                    this.f5794c.mo7465a(8, e12);
                    inputStream.close();
                    return null;
                }
            } catch (Throwable th2) {
                try {
                    inputStream.close();
                } catch (IOException e13) {
                    this.f5794c.mo7465a(7, e13);
                }
                throw th2;
            }
        } catch (IOException e14) {
            this.f5794c.mo7465a(7, e14);
        }
    }

    /* renamed from: k */
    private static boolean m7492k() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 33) {
            return false;
        }
        if (i10 != 24 && i10 != 25) {
            switch (i10) {
                case 31:
                case 32:
                case 33:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    private void m7493l(final int i10, final Object obj) {
        this.f5793b.execute(new Runnable() { // from class: androidx.profileinstaller.b
            @Override // java.lang.Runnable
            public final void run() {
                C1346c.this.m7489g(i10, obj);
            }
        });
    }

    /* renamed from: e */
    public boolean m7494e() {
        if (this.f5795d == null) {
            m7493l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (this.f5796e.canWrite()) {
            this.f5800i = true;
            return true;
        }
        m7493l(4, null);
        return false;
    }

    /* renamed from: i */
    public C1346c m7495i() {
        C1346c m7485b;
        m7486c();
        if (this.f5795d == null) {
            return this;
        }
        InputStream m7488f = m7488f(this.f5792a);
        if (m7488f != null) {
            this.f5801j = m7491j(m7488f);
        }
        C1347d[] c1347dArr = this.f5801j;
        return (c1347dArr == null || !m7492k() || (m7485b = m7485b(c1347dArr, this.f5795d)) == null) ? this : m7485b;
    }

    /* renamed from: m */
    public C1346c m7496m() {
        C1351h.c cVar;
        int i10;
        ByteArrayOutputStream byteArrayOutputStream;
        C1347d[] c1347dArr = this.f5801j;
        byte[] bArr = this.f5795d;
        if (c1347dArr != null && bArr != null) {
            m7486c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e10) {
                e = e10;
                cVar = this.f5794c;
                i10 = 7;
                cVar.mo7465a(i10, e);
                this.f5801j = null;
                return this;
            } catch (IllegalStateException e11) {
                e = e11;
                cVar = this.f5794c;
                i10 = 8;
                cVar.mo7465a(i10, e);
                this.f5801j = null;
                return this;
            }
            try {
                C1356m.m7534E(byteArrayOutputStream, bArr);
                if (!C1356m.m7531B(byteArrayOutputStream, bArr, c1347dArr)) {
                    this.f5794c.mo7465a(5, null);
                    this.f5801j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f5802k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f5801j = null;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return this;
    }

    /* renamed from: n */
    public boolean m7497n() {
        byte[] bArr = this.f5802k;
        if (bArr == null) {
            return false;
        }
        m7486c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f5796e);
                    try {
                        C1348e.m7509l(byteArrayInputStream, fileOutputStream);
                        m7493l(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e10) {
                m7493l(6, e10);
                return false;
            } catch (IOException e11) {
                m7493l(7, e11);
                return false;
            }
        } finally {
            this.f5802k = null;
            this.f5801j = null;
        }
    }
}
