package q4;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;

/* loaded from: classes.dex */
public final class k extends AsyncTask<String, Void, Boolean> {

    /* renamed from: a, reason: collision with root package name */
    private final String f23531a;

    /* renamed from: b, reason: collision with root package name */
    private final File f23532b;

    /* renamed from: c, reason: collision with root package name */
    private final a f23533c;

    /* loaded from: classes.dex */
    public interface a {
        void a(File file);
    }

    public k(String uriStr, File destFile, a onSuccess) {
        kotlin.jvm.internal.n.e(uriStr, "uriStr");
        kotlin.jvm.internal.n.e(destFile, "destFile");
        kotlin.jvm.internal.n.e(onSuccess, "onSuccess");
        this.f23531a = uriStr;
        this.f23532b = destFile;
        this.f23533c = onSuccess;
    }

    public Boolean a(String... args) {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            if (a5.a.d(this)) {
                return null;
            }
            try {
                if (a5.a.d(this)) {
                    return null;
                }
                try {
                    kotlin.jvm.internal.n.e(args, "args");
                    try {
                        URL url = new URL(this.f23531a);
                        int contentLength = url.openConnection().getContentLength();
                        DataInputStream dataInputStream = new DataInputStream(url.openStream());
                        byte[] bArr = new byte[contentLength];
                        dataInputStream.readFully(bArr);
                        dataInputStream.close();
                        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f23532b));
                        dataOutputStream.write(bArr);
                        dataOutputStream.flush();
                        dataOutputStream.close();
                        return Boolean.TRUE;
                    } catch (Exception unused) {
                        return Boolean.FALSE;
                    }
                } catch (Throwable th2) {
                    a5.a.b(th2, this);
                    return null;
                }
            } catch (Throwable th3) {
                a5.a.b(th3, this);
                return null;
            }
        } catch (Throwable th4) {
            a5.a.b(th4, this);
            return null;
        }
    }

    protected void b(boolean z10) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            if (a5.a.d(this)) {
                return;
            }
            try {
                if (!a5.a.d(this) && z10) {
                    try {
                        this.f23533c.a(this.f23532b);
                    } catch (Throwable th2) {
                        a5.a.b(th2, this);
                    }
                }
            } catch (Throwable th3) {
                a5.a.b(th3, this);
            }
        } catch (Throwable th4) {
            a5.a.b(th4, this);
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Boolean doInBackground(String[] strArr) {
        if (a5.a.d(this)) {
            return null;
        }
        try {
            if (a5.a.d(this)) {
                return null;
            }
            try {
                if (a5.a.d(this)) {
                    return null;
                }
                try {
                    return a(strArr);
                } catch (Throwable th2) {
                    a5.a.b(th2, this);
                    return null;
                }
            } catch (Throwable th3) {
                a5.a.b(th3, this);
                return null;
            }
        } catch (Throwable th4) {
            a5.a.b(th4, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        if (a5.a.d(this)) {
            return;
        }
        try {
            if (a5.a.d(this)) {
                return;
            }
            try {
                if (a5.a.d(this)) {
                    return;
                }
                try {
                    b(bool.booleanValue());
                } catch (Throwable th2) {
                    a5.a.b(th2, this);
                }
            } catch (Throwable th3) {
                a5.a.b(th3, this);
            }
        } catch (Throwable th4) {
            a5.a.b(th4, this);
        }
    }
}
