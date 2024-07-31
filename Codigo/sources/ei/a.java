package ei;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import di.c;
import di.d;
import fi.e;
import fi.f;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class a extends AsyncTask<Void, Void, Throwable> {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<Context> f14684a;

    /* renamed from: b, reason: collision with root package name */
    private Bitmap f14685b;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f14686c;

    /* renamed from: d, reason: collision with root package name */
    private final RectF f14687d;

    /* renamed from: e, reason: collision with root package name */
    private float f14688e;

    /* renamed from: f, reason: collision with root package name */
    private float f14689f;

    /* renamed from: g, reason: collision with root package name */
    private final int f14690g;

    /* renamed from: h, reason: collision with root package name */
    private final int f14691h;

    /* renamed from: i, reason: collision with root package name */
    private final Bitmap.CompressFormat f14692i;

    /* renamed from: j, reason: collision with root package name */
    private final int f14693j;

    /* renamed from: k, reason: collision with root package name */
    private final String f14694k;

    /* renamed from: l, reason: collision with root package name */
    private final String f14695l;

    /* renamed from: m, reason: collision with root package name */
    private final Uri f14696m;

    /* renamed from: n, reason: collision with root package name */
    private final Uri f14697n;

    /* renamed from: o, reason: collision with root package name */
    private final c f14698o;

    /* renamed from: p, reason: collision with root package name */
    private final ci.a f14699p;

    /* renamed from: q, reason: collision with root package name */
    private int f14700q;

    /* renamed from: r, reason: collision with root package name */
    private int f14701r;

    /* renamed from: s, reason: collision with root package name */
    private int f14702s;

    /* renamed from: t, reason: collision with root package name */
    private int f14703t;

    public a(Context context, Bitmap bitmap, d dVar, di.b bVar, ci.a aVar) {
        this.f14684a = new WeakReference<>(context);
        this.f14685b = bitmap;
        this.f14686c = dVar.a();
        this.f14687d = dVar.c();
        this.f14688e = dVar.d();
        this.f14689f = dVar.b();
        this.f14690g = bVar.h();
        this.f14691h = bVar.i();
        this.f14692i = bVar.a();
        this.f14693j = bVar.b();
        this.f14694k = bVar.f();
        this.f14695l = bVar.g();
        this.f14696m = bVar.c();
        this.f14697n = bVar.d();
        this.f14698o = bVar.e();
        this.f14699p = aVar;
    }

    private void a(Context context) {
        boolean h10 = fi.a.h(this.f14696m);
        boolean h11 = fi.a.h(this.f14697n);
        if (h10 && h11) {
            f.b(context, this.f14700q, this.f14701r, this.f14696m, this.f14697n);
            return;
        }
        if (h10) {
            f.c(context, this.f14700q, this.f14701r, this.f14696m, this.f14695l);
        } else if (h11) {
            f.d(context, new androidx.exifinterface.media.a(this.f14694k), this.f14700q, this.f14701r, this.f14697n);
        } else {
            f.e(new androidx.exifinterface.media.a(this.f14694k), this.f14700q, this.f14701r, this.f14695l);
        }
    }

    private boolean b() {
        Context context = this.f14684a.get();
        if (context == null) {
            return false;
        }
        if (this.f14690g > 0 && this.f14691h > 0) {
            float width = this.f14686c.width() / this.f14688e;
            float height = this.f14686c.height() / this.f14688e;
            int i10 = this.f14690g;
            if (width > i10 || height > this.f14691h) {
                float min = Math.min(i10 / width, this.f14691h / height);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f14685b, Math.round(r3.getWidth() * min), Math.round(this.f14685b.getHeight() * min), false);
                Bitmap bitmap = this.f14685b;
                if (bitmap != createScaledBitmap) {
                    bitmap.recycle();
                }
                this.f14685b = createScaledBitmap;
                this.f14688e /= min;
            }
        }
        if (this.f14689f != 0.0f) {
            Matrix matrix = new Matrix();
            matrix.setRotate(this.f14689f, this.f14685b.getWidth() / 2, this.f14685b.getHeight() / 2);
            Bitmap bitmap2 = this.f14685b;
            Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), this.f14685b.getHeight(), matrix, true);
            Bitmap bitmap3 = this.f14685b;
            if (bitmap3 != createBitmap) {
                bitmap3.recycle();
            }
            this.f14685b = createBitmap;
        }
        this.f14702s = Math.round((this.f14686c.left - this.f14687d.left) / this.f14688e);
        this.f14703t = Math.round((this.f14686c.top - this.f14687d.top) / this.f14688e);
        this.f14700q = Math.round(this.f14686c.width() / this.f14688e);
        int round = Math.round(this.f14686c.height() / this.f14688e);
        this.f14701r = round;
        boolean f10 = f(this.f14700q, round);
        Log.i("BitmapCropTask", "Should crop: " + f10);
        if (!f10) {
            e.a(context, this.f14696m, this.f14697n);
            return false;
        }
        e(Bitmap.createBitmap(this.f14685b, this.f14702s, this.f14703t, this.f14700q, this.f14701r));
        if (!this.f14692i.equals(Bitmap.CompressFormat.JPEG)) {
            return true;
        }
        a(context);
        return true;
    }

    private void e(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream;
        OutputStream openOutputStream;
        Context context = this.f14684a.get();
        if (context == null) {
            return;
        }
        OutputStream outputStream = null;
        try {
            openOutputStream = context.getContentResolver().openOutputStream(this.f14697n);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e10) {
                e = e10;
                byteArrayOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = null;
            }
        } catch (IOException e11) {
            e = e11;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        try {
            bitmap.compress(this.f14692i, this.f14693j, byteArrayOutputStream);
            openOutputStream.write(byteArrayOutputStream.toByteArray());
            bitmap.recycle();
            fi.a.c(openOutputStream);
        } catch (IOException e12) {
            e = e12;
            outputStream = openOutputStream;
            try {
                Log.e("BitmapCropTask", e.getLocalizedMessage());
                fi.a.c(outputStream);
                fi.a.c(byteArrayOutputStream);
            } catch (Throwable th4) {
                th = th4;
                fi.a.c(outputStream);
                fi.a.c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            outputStream = openOutputStream;
            fi.a.c(outputStream);
            fi.a.c(byteArrayOutputStream);
            throw th;
        }
        fi.a.c(byteArrayOutputStream);
    }

    private boolean f(int i10, int i11) {
        int round = Math.round(Math.max(i10, i11) / 1000.0f) + 1;
        if (this.f14690g > 0 && this.f14691h > 0) {
            return true;
        }
        float f10 = round;
        return Math.abs(this.f14686c.left - this.f14687d.left) > f10 || Math.abs(this.f14686c.top - this.f14687d.top) > f10 || Math.abs(this.f14686c.bottom - this.f14687d.bottom) > f10 || Math.abs(this.f14686c.right - this.f14687d.right) > f10 || this.f14689f != 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Throwable doInBackground(Void... voidArr) {
        Bitmap bitmap = this.f14685b;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.f14687d.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        if (this.f14697n == null) {
            return new NullPointerException("ImageOutputUri is null");
        }
        try {
            b();
            this.f14685b = null;
            return null;
        } catch (Throwable th2) {
            return th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(Throwable th2) {
        ci.a aVar = this.f14699p;
        if (aVar != null) {
            if (th2 != null) {
                aVar.b(th2);
            } else {
                this.f14699p.a(fi.a.h(this.f14697n) ? this.f14697n : Uri.fromFile(new File(this.f14695l)), this.f14702s, this.f14703t, this.f14700q, this.f14701r);
            }
        }
    }
}
