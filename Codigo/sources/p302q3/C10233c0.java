package p302q3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p193k3.InterfaceC9141d;

/* renamed from: q3.c0 */
/* loaded from: classes.dex */
public final class C10233c0 {

    /* renamed from: a */
    private static final Paint f25387a = new Paint(6);

    /* renamed from: b */
    private static final Paint f25388b = new Paint(7);

    /* renamed from: c */
    private static final Paint f25389c;

    /* renamed from: d */
    private static final Set<String> f25390d;

    /* renamed from: e */
    private static final Lock f25391e;

    /* renamed from: q3.c0$a */
    /* loaded from: classes.dex */
    private static final class a implements Lock {
        a() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() {
        }

        @Override // java.util.concurrent.locks.Lock
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j10, TimeUnit timeUnit) {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f25390d = hashSet;
        f25391e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new a();
        Paint paint = new Paint(7);
        f25389c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: a */
    private static void m30594a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f25391e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f25387a);
            m30595b(canvas);
            lock.unlock();
        } catch (Throwable th2) {
            f25391e.unlock();
            throw th2;
        }
    }

    /* renamed from: b */
    private static void m30595b(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* renamed from: c */
    public static Lock m30596c() {
        return f25391e;
    }

    /* renamed from: d */
    public static int m30597d(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: e */
    private static Bitmap.Config m30598e(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: f */
    static void m30599f(int i10, Matrix matrix) {
        switch (i10) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
        matrix.postScale(-1.0f, 1.0f);
    }

    /* renamed from: g */
    public static boolean m30600g(int i10) {
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: h */
    public static Bitmap m30601h(InterfaceC9141d interfaceC9141d, Bitmap bitmap, int i10) {
        if (!m30600g(i10)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m30599f(i10, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap mo26951d = interfaceC9141d.mo26951d(Math.round(rectF.width()), Math.round(rectF.height()), m30598e(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        mo26951d.setHasAlpha(bitmap.hasAlpha());
        m30594a(bitmap, mo26951d, matrix);
        return mo26951d;
    }
}
