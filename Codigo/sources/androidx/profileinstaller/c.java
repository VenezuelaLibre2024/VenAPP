package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.h;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f5038a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f5039b;

    /* renamed from: c, reason: collision with root package name */
    private final h.c f5040c;

    /* renamed from: e, reason: collision with root package name */
    private final File f5042e;

    /* renamed from: f, reason: collision with root package name */
    private final String f5043f;

    /* renamed from: g, reason: collision with root package name */
    private final String f5044g;

    /* renamed from: h, reason: collision with root package name */
    private final String f5045h;

    /* renamed from: j, reason: collision with root package name */
    private d[] f5047j;

    /* renamed from: k, reason: collision with root package name */
    private byte[] f5048k;

    /* renamed from: i, reason: collision with root package name */
    private boolean f5046i = false;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f5041d = d();

    public c(AssetManager assetManager, Executor executor, h.c cVar, String str, String str2, String str3, File file) {
        this.f5038a = assetManager;
        this.f5039b = executor;
        this.f5040c = cVar;
        this.f5043f = str;
        this.f5044g = str2;
        this.f5045h = str3;
        this.f5042e = file;
    }

    private c b(d[] dVarArr, byte[] bArr) {
        h.c cVar;
        int i10;
        InputStream h10;
        try {
            h10 = h(this.f5038a, this.f5045h);
        } catch (FileNotFoundException e10) {
            e = e10;
            cVar = this.f5040c;
            i10 = 9;
            cVar.a(i10, e);
            return null;
        } catch (IOException e11) {
            e = e11;
            cVar = this.f5040c;
            i10 = 7;
            cVar.a(i10, e);
            return null;
        } catch (IllegalStateException e12) {
            e = e12;
            this.f5047j = null;
            cVar = this.f5040c;
            i10 = 8;
            cVar.a(i10, e);
            return null;
        }
        if (h10 == null) {
            if (h10 != null) {
                h10.close();
            }
            return null;
        }
        try {
            this.f5047j = m.q(h10, m.o(h10, m.f5069b), bArr, dVarArr);
            h10.close();
            return this;
        } finally {
        }
    }

    private void c() {
        if (!this.f5046i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 33) {
            return null;
        }
        switch (i10) {
            case 24:
            case 25:
                return o.f5084e;
            case 26:
                return o.f5083d;
            case 27:
                return o.f5082c;
            case 28:
            case 29:
            case 30:
                return o.f5081b;
            case 31:
            case 32:
            case 33:
                return o.f5080a;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        h.c cVar;
        int i10;
        try {
            return h(assetManager, this.f5044g);
        } catch (FileNotFoundException e10) {
            e = e10;
            cVar = this.f5040c;
            i10 = 6;
            cVar.a(i10, e);
            return null;
        } catch (IOException e11) {
            e = e11;
            cVar = this.f5040c;
            i10 = 7;
            cVar.a(i10, e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i10, Object obj) {
        this.f5040c.a(i10, obj);
    }

    private InputStream h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f5040c.b(5, null);
            }
            return null;
        }
    }

    private d[] j(InputStream inputStream) {
        try {
            try {
                try {
                    d[] w10 = m.w(inputStream, m.o(inputStream, m.f5068a), this.f5043f);
                    try {
                        inputStream.close();
                        return w10;
                    } catch (IOException e10) {
                        this.f5040c.a(7, e10);
                        return w10;
                    }
                } catch (IOException e11) {
                    this.f5040c.a(7, e11);
                    inputStream.close();
                    return null;
                } catch (IllegalStateException e12) {
                    this.f5040c.a(8, e12);
                    inputStream.close();
                    return null;
                }
            } catch (Throwable th2) {
                try {
                    inputStream.close();
                } catch (IOException e13) {
                    this.f5040c.a(7, e13);
                }
                throw th2;
            }
        } catch (IOException e14) {
            this.f5040c.a(7, e14);
        }
    }

    private static boolean k() {
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

    private void l(final int i10, final Object obj) {
        this.f5039b.execute(new Runnable() { // from class: androidx.profileinstaller.b
            @Override // java.lang.Runnable
            public final void run() {
                c.this.g(i10, obj);
            }
        });
    }

    public boolean e() {
        if (this.f5041d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (this.f5042e.canWrite()) {
            this.f5046i = true;
            return true;
        }
        l(4, null);
        return false;
    }

    public c i() {
        c b10;
        c();
        if (this.f5041d == null) {
            return this;
        }
        InputStream f10 = f(this.f5038a);
        if (f10 != null) {
            this.f5047j = j(f10);
        }
        d[] dVarArr = this.f5047j;
        return (dVarArr == null || !k() || (b10 = b(dVarArr, this.f5041d)) == null) ? this : b10;
    }

    public c m() {
        h.c cVar;
        int i10;
        ByteArrayOutputStream byteArrayOutputStream;
        d[] dVarArr = this.f5047j;
        byte[] bArr = this.f5041d;
        if (dVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e10) {
                e = e10;
                cVar = this.f5040c;
                i10 = 7;
                cVar.a(i10, e);
                this.f5047j = null;
                return this;
            } catch (IllegalStateException e11) {
                e = e11;
                cVar = this.f5040c;
                i10 = 8;
                cVar.a(i10, e);
                this.f5047j = null;
                return this;
            }
            try {
                m.E(byteArrayOutputStream, bArr);
                if (!m.B(byteArrayOutputStream, bArr, dVarArr)) {
                    this.f5040c.a(5, null);
                    this.f5047j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f5048k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f5047j = null;
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

    public boolean n() {
        byte[] bArr = this.f5048k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f5042e);
                    try {
                        e.l(byteArrayInputStream, fileOutputStream);
                        l(1, null);
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
                l(6, e10);
                return false;
            } catch (IOException e11) {
                l(7, e11);
                return false;
            }
        } finally {
            this.f5048k = null;
            this.f5047j = null;
        }
    }
}
