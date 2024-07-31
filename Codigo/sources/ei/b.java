package ei;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import di.c;
import dm.d;
import dm.l;
import dm.v;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import ql.a0;
import ql.c0;
import ql.y;

/* loaded from: classes3.dex */
public class b extends AsyncTask<Void, Void, a> {

    /* renamed from: a */
    private final WeakReference<Context> f14704a;

    /* renamed from: b */
    private Uri f14705b;

    /* renamed from: c */
    private Uri f14706c;

    /* renamed from: d */
    private final int f14707d;

    /* renamed from: e */
    private final int f14708e;

    /* renamed from: f */
    private final ci.b f14709f;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        Bitmap f14710a;

        /* renamed from: b */
        c f14711b;

        /* renamed from: c */
        Exception f14712c;

        public a(Bitmap bitmap, c cVar) {
            this.f14710a = bitmap;
            this.f14711b = cVar;
        }

        public a(Exception exc) {
            this.f14712c = exc;
        }
    }

    public b(Context context, Uri uri, Uri uri2, int i10, int i11, ci.b bVar) {
        this.f14704a = new WeakReference<>(context);
        this.f14705b = uri;
        this.f14706c = uri2;
        this.f14707d = i10;
        this.f14708e = i11;
        this.f14709f = bVar;
    }

    private boolean a(Bitmap bitmap, BitmapFactory.Options options) {
        if ((bitmap != null ? bitmap.getByteCount() : 0) <= 104857600) {
            return false;
        }
        options.inSampleSize *= 2;
        return true;
    }

    private void c(Uri uri, Uri uri2) {
        Closeable closeable;
        c0 c0Var;
        Log.d("BitmapWorkerTask", "downloadFile");
        if (uri2 == null) {
            throw new NullPointerException("Output Uri is null - cannot download image");
        }
        Context context = this.f14704a.get();
        if (context == null) {
            throw new NullPointerException("Context is null");
        }
        y a10 = bi.a.f6522b.a();
        d dVar = null;
        try {
            c0 n10 = a10.w(new a0.a().o(uri.toString()).b()).n();
            try {
                d f10 = n10.a().f();
                try {
                    OutputStream openOutputStream = context.getContentResolver().openOutputStream(uri2);
                    if (openOutputStream == null) {
                        throw new NullPointerException("OutputStream for given output Uri is null");
                    }
                    v d10 = l.d(openOutputStream);
                    f10.Y(d10);
                    fi.a.c(f10);
                    fi.a.c(d10);
                    fi.a.c(n10.a());
                    a10.l().a();
                    this.f14705b = this.f14706c;
                } catch (Throwable th2) {
                    th = th2;
                    c0Var = n10;
                    closeable = null;
                    dVar = f10;
                    fi.a.c(dVar);
                    fi.a.c(closeable);
                    if (c0Var != null) {
                        fi.a.c(c0Var.a());
                    }
                    a10.l().a();
                    this.f14705b = this.f14706c;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                c0Var = n10;
                closeable = null;
            }
        } catch (Throwable th4) {
            th = th4;
            closeable = null;
            c0Var = null;
        }
    }

    private void e() {
        String scheme = this.f14705b.getScheme();
        Log.d("BitmapWorkerTask", "Uri scheme: " + scheme);
        if ("http".equals(scheme) || "https".equals(scheme)) {
            try {
                c(this.f14705b, this.f14706c);
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

    @Override // android.os.AsyncTask
    /* renamed from: b */
    public a doInBackground(Void... voidArr) {
        InputStream openInputStream;
        Context context = this.f14704a.get();
        if (context == null) {
            return new a(new NullPointerException("context is null"));
        }
        if (this.f14705b == null) {
            return new a(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            e();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inSampleSize = fi.a.a(options, this.f14707d, this.f14708e);
            boolean z10 = false;
            options.inJustDecodeBounds = false;
            Bitmap bitmap = null;
            while (!z10) {
                try {
                    openInputStream = context.getContentResolver().openInputStream(this.f14705b);
                    try {
                        bitmap = BitmapFactory.decodeStream(openInputStream, null, options);
                    } finally {
                        fi.a.c(openInputStream);
                    }
                } catch (IOException e10) {
                    Log.e("BitmapWorkerTask", "doInBackground: ImageDecoder.createSource: ", e10);
                    return new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f14705b + "]", e10));
                } catch (OutOfMemoryError e11) {
                    Log.e("BitmapWorkerTask", "doInBackground: BitmapFactory.decodeFileDescriptor: ", e11);
                    options.inSampleSize *= 2;
                }
                if (options.outWidth == -1 || options.outHeight == -1) {
                    return new a(new IllegalArgumentException("Bounds for bitmap could not be retrieved from the Uri: [" + this.f14705b + "]"));
                }
                fi.a.c(openInputStream);
                if (!a(bitmap, options)) {
                    z10 = true;
                }
            }
            if (bitmap == null) {
                return new a(new IllegalArgumentException("Bitmap could not be decoded from the Uri: [" + this.f14705b + "]"));
            }
            int g10 = fi.a.g(context, this.f14705b);
            int e12 = fi.a.e(g10);
            int f10 = fi.a.f(g10);
            c cVar = new c(g10, e12, f10);
            Matrix matrix = new Matrix();
            if (e12 != 0) {
                matrix.preRotate(e12);
            }
            if (f10 != 1) {
                matrix.postScale(f10, 1.0f);
            }
            return !matrix.isIdentity() ? new a(fi.a.i(bitmap, matrix), cVar) : new a(bitmap, cVar);
        } catch (IOException | NullPointerException e13) {
            return new a(e13);
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: d */
    public void onPostExecute(a aVar) {
        Exception exc = aVar.f14712c;
        if (exc == null) {
            this.f14709f.a(aVar.f14710a, aVar.f14711b, this.f14705b, this.f14706c);
        } else {
            this.f14709f.onFailure(exc);
        }
    }
}
