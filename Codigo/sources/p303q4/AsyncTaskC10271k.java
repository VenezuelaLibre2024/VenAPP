package p303q4;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;

/* renamed from: q4.k */
/* loaded from: classes.dex */
public final class AsyncTaskC10271k extends AsyncTask<String, Void, Boolean> {

    /* renamed from: a */
    private final String f25499a;

    /* renamed from: b */
    private final File f25500b;

    /* renamed from: c */
    private final a f25501c;

    /* renamed from: q4.k$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo30765a(File file);
    }

    public AsyncTaskC10271k(String uriStr, File destFile, a onSuccess) {
        C9322n.m27781e(uriStr, "uriStr");
        C9322n.m27781e(destFile, "destFile");
        C9322n.m27781e(onSuccess, "onSuccess");
        this.f25499a = uriStr;
        this.f25500b = destFile;
        this.f25501c = onSuccess;
    }

    /* renamed from: a */
    public Boolean m30763a(String... args) {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            if (C0033a.m107d(this)) {
                return null;
            }
            try {
                if (C0033a.m107d(this)) {
                    return null;
                }
                try {
                    C9322n.m27781e(args, "args");
                    try {
                        URL url = new URL(this.f25499a);
                        int contentLength = url.openConnection().getContentLength();
                        DataInputStream dataInputStream = new DataInputStream(url.openStream());
                        byte[] bArr = new byte[contentLength];
                        dataInputStream.readFully(bArr);
                        dataInputStream.close();
                        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f25500b));
                        dataOutputStream.write(bArr);
                        dataOutputStream.flush();
                        dataOutputStream.close();
                        return Boolean.TRUE;
                    } catch (Exception unused) {
                        return Boolean.FALSE;
                    }
                } catch (Throwable th2) {
                    C0033a.m105b(th2, this);
                    return null;
                }
            } catch (Throwable th3) {
                C0033a.m105b(th3, this);
                return null;
            }
        } catch (Throwable th4) {
            C0033a.m105b(th4, this);
            return null;
        }
    }

    /* renamed from: b */
    protected void m30764b(boolean z10) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            if (C0033a.m107d(this)) {
                return;
            }
            try {
                if (!C0033a.m107d(this) && z10) {
                    try {
                        this.f25501c.mo30765a(this.f25500b);
                    } catch (Throwable th2) {
                        C0033a.m105b(th2, this);
                    }
                }
            } catch (Throwable th3) {
                C0033a.m105b(th3, this);
            }
        } catch (Throwable th4) {
            C0033a.m105b(th4, this);
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Boolean doInBackground(String[] strArr) {
        if (C0033a.m107d(this)) {
            return null;
        }
        try {
            if (C0033a.m107d(this)) {
                return null;
            }
            try {
                if (C0033a.m107d(this)) {
                    return null;
                }
                try {
                    return m30763a(strArr);
                } catch (Throwable th2) {
                    C0033a.m105b(th2, this);
                    return null;
                }
            } catch (Throwable th3) {
                C0033a.m105b(th3, this);
                return null;
            }
        } catch (Throwable th4) {
            C0033a.m105b(th4, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        if (C0033a.m107d(this)) {
            return;
        }
        try {
            if (C0033a.m107d(this)) {
                return;
            }
            try {
                if (C0033a.m107d(this)) {
                    return;
                }
                try {
                    m30764b(bool.booleanValue());
                } catch (Throwable th2) {
                    C0033a.m105b(th2, this);
                }
            } catch (Throwable th3) {
                C0033a.m105b(th3, this);
            }
        } catch (Throwable th4) {
            C0033a.m105b(th4, this);
        }
    }
}
