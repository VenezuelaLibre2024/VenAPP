package p086ei;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import bi.C1789a;
import ci.InterfaceC2009b;
import dm.C7068l;
import dm.InterfaceC7060d;
import dm.InterfaceC7078v;
import fi.C7356a;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import p068di.C6974c;
import p319ql.C10521a0;
import p319ql.C10525c0;
import p319ql.C10550y;

/* renamed from: ei.b */
/* loaded from: classes3.dex */
public class AsyncTaskC7196b extends AsyncTask<Void, Void, a> {

    /* renamed from: a */
    private final WeakReference<Context> f16127a;

    /* renamed from: b */
    private Uri f16128b;

    /* renamed from: c */
    private Uri f16129c;

    /* renamed from: d */
    private final int f16130d;

    /* renamed from: e */
    private final int f16131e;

    /* renamed from: f */
    private final InterfaceC2009b f16132f;

    /* renamed from: ei.b$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        Bitmap f16133a;

        /* renamed from: b */
        C6974c f16134b;

        /* renamed from: c */
        Exception f16135c;

        public a(Bitmap bitmap, C6974c c6974c) {
            this.f16133a = bitmap;
            this.f16134b = c6974c;
        }

        public a(Exception exc) {
            this.f16135c = exc;
        }
    }

    public AsyncTaskC7196b(Context context, Uri uri, Uri uri2, int i10, int i11, InterfaceC2009b interfaceC2009b) {
        this.f16127a = new WeakReference<>(context);
        this.f16128b = uri;
        this.f16129c = uri2;
        this.f16130d = i10;
        this.f16131e = i11;
        this.f16132f = interfaceC2009b;
    }

    /* renamed from: a */
    private boolean m21445a(Bitmap bitmap, BitmapFactory.Options options) {
        if ((bitmap != null ? bitmap.getByteCount() : 0) <= 104857600) {
            return false;
        }
        options.inSampleSize *= 2;
        return true;
    }

    /* renamed from: c */
    private void m21446c(Uri uri, Uri uri2) {
        Closeable closeable;
        C10525c0 c10525c0;
        Log.d("BitmapWorkerTask", "downloadFile");
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot download image");
        }
        Context context = this.f16127a.get();
        if (context == null) {
            throw new NullPointerException("Context is null");
        }
        C10550y m9547a = C1789a.f7444b.m9547a();
        InterfaceC7060d interfaceC7060d = null;
        try {
            C10525c0 mo31714n = m9547a.m31991w(new C10521a0.a().m31623o(uri.toString()).m31610b()).mo31714n();
            try {
                InterfaceC7060d mo31707f = mo31714n.m31641a().mo31707f();
                try {
                    OutputStream openOutputStream = context.getContentResolver().openOutputStream(uri2);
                    if (openOutputStream == null) {
                        throw new NullPointerException("OutputStream for given output Uri is null");
                    }
                    InterfaceC7078v m20805d = C7068l.m20805d(openOutputStream);
                    mo31707f.mo20710Y(m20805d);
                    C7356a.m22191c(mo31707f);
                    C7356a.m22191c(m20805d);
                    C7356a.m22191c(mo31714n.m31641a());
                    m9547a.m31982l().m31796a();
                    this.f16128b = this.f16129c;
                } catch (Throwable th2) {
                    th = th2;
                    c10525c0 = mo31714n;
                    closeable = null;
                    interfaceC7060d = mo31707f;
                    C7356a.m22191c(interfaceC7060d);
                    C7356a.m22191c(closeable);
                    if (c10525c0 != null) {
                        C7356a.m22191c(c10525c0.m31641a());
                    }
                    m9547a.m31982l().m31796a();
                    this.f16128b = this.f16129c;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                c10525c0 = mo31714n;
                closeable = null;
            }
        } catch (Throwable th4) {
            th = th4;
            closeable = null;
            c10525c0 = null;
        }
    }

    /* renamed from: e */
    private void m21447e() {
        String scheme = this.f16128b.getScheme();
        Log.d("BitmapWorkerTask", "Uri scheme: " + scheme);
        if ("http".equals(scheme) || "https".equals(scheme)) {
            try {
                m21446c(this.f16128b, this.f16129c);
                return;
            } catch (IOException | NullPointerException e10) {
                Log.e("BitmapWorkerTask", "Downloading failed", e10);
                throw e10;
            }
        }
        if (Constants.FILE.equals(scheme) || "content".equals(scheme)) {
            return;
        }
        Log.e("BitmapWorkerTask", "Invalid Uri scheme " + scheme);
        throw new IllegalArgumentException("Invalid Uri scheme" + scheme);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a doInBackground(Void... voidArr) {
        InputStream openInputStream;
        Context context = this.f16127a.get();
        if (context == null) {
            return new a(new NullPointerException("context is null"));
        }
        if (this.f16128b == null) {
            return new a(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            m21447e();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inSampleSize = C7356a.m22189a(options, this.f16130d, this.f16131e);
            boolean z10 = false;
            options.inJustDecodeBounds = false;
            Bitmap bitmap = null;
            while (!z10) {
                try {
                    openInputStream = context.getContentResolver().openInputStream(this.f16128b);
                    try {
                        bitmap = BitmapFactory.decodeStream(openInputStream, null, options);
                    } finally {
                        C7356a.m22191c(openInputStream);
                    }
                } catch (IOException e10) {
                    Log.e("BitmapWorkerTask", "doInBackground: ImageDecoder.createSource: ", e10);
                    return new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f16128b + "]", e10));
                } catch (OutOfMemoryError e11) {
                    Log.e("BitmapWorkerTask", "doInBackground: BitmapFactory.decodeFileDescriptor: ", e11);
                    options.inSampleSize *= 2;
                }
                if (options.outWidth == -1 || options.outHeight == -1) {
                    return new a(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.f16128b + "]"));
                }
                C7356a.m22191c(openInputStream);
                if (!m21445a(bitmap, options)) {
                    z10 = true;
                }
            }
            if (bitmap == null) {
                return new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f16128b + "]"));
            }
            int m22195g = C7356a.m22195g(context, this.f16128b);
            int m22193e = C7356a.m22193e(m22195g);
            int m22194f = C7356a.m22194f(m22195g);
            C6974c c6974c = new C6974c(m22195g, m22193e, m22194f);
            Matrix matrix = new Matrix();
            if (m22193e != 0) {
                matrix.preRotate(m22193e);
            }
            if (m22194f != 1) {
                matrix.postScale(m22194f, 1.0f);
            }
            return !matrix.isIdentity() ? new a(C7356a.m22197i(bitmap, matrix), c6974c) : new a(bitmap, c6974c);
        } catch (IOException | NullPointerException e12) {
            return new a(e12);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(a aVar) {
        Exception exc = aVar.f16135c;
        if (exc == null) {
            this.f16132f.mo10306a(aVar.f16133a, aVar.f16134b, this.f16128b, this.f16129c);
        } else {
            this.f16132f.onFailure(exc);
        }
    }
}
