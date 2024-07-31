package gf;

import android.util.Log;
import java.io.InputStream;

/* renamed from: gf.b */
/* loaded from: classes2.dex */
public class C7560b {

    /* renamed from: f */
    private static final Runtime f17870f = Runtime.getRuntime();

    /* renamed from: a */
    private final InputStream f17871a;

    /* renamed from: b */
    private byte[] f17872b;

    /* renamed from: c */
    private int f17873c = 0;

    /* renamed from: e */
    private boolean f17875e = true;

    /* renamed from: d */
    private boolean f17874d = false;

    public C7560b(InputStream inputStream, int i10) {
        this.f17871a = inputStream;
        this.f17872b = new byte[i10];
    }

    /* renamed from: g */
    private int m22949g(int i10) {
        int max = Math.max(this.f17872b.length * 2, i10);
        Runtime runtime = f17870f;
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        if (!this.f17875e || max >= maxMemory) {
            Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing to conserve memory.");
        } else {
            try {
                byte[] bArr = new byte[max];
                System.arraycopy(this.f17872b, 0, bArr, 0, this.f17873c);
                this.f17872b = bArr;
            } catch (OutOfMemoryError unused) {
                Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing due to low memory.");
                this.f17875e = false;
            }
        }
        return this.f17872b.length;
    }

    /* renamed from: a */
    public int m22950a(int i10) {
        int i11 = this.f17873c;
        int i12 = 0;
        if (i10 <= i11) {
            int i13 = i11 - i10;
            this.f17873c = i13;
            byte[] bArr = this.f17872b;
            System.arraycopy(bArr, i10, bArr, 0, i13);
            return i10;
        }
        this.f17873c = 0;
        while (i12 < i10) {
            int skip = (int) this.f17871a.skip(i10 - i12);
            if (skip > 0) {
                i12 += skip;
            } else if (skip != 0) {
                continue;
            } else {
                if (this.f17871a.read() == -1) {
                    break;
                }
                i12++;
            }
        }
        return i12;
    }

    /* renamed from: b */
    public int m22951b() {
        return this.f17873c;
    }

    /* renamed from: c */
    public void m22952c() {
        this.f17871a.close();
    }

    /* renamed from: d */
    public int m22953d(int i10) {
        if (i10 > this.f17872b.length) {
            i10 = Math.min(i10, m22949g(i10));
        }
        while (true) {
            int i11 = this.f17873c;
            if (i11 >= i10) {
                break;
            }
            int read = this.f17871a.read(this.f17872b, i11, i10 - i11);
            if (read == -1) {
                this.f17874d = true;
                break;
            }
            this.f17873c += read;
        }
        return this.f17873c;
    }

    /* renamed from: e */
    public byte[] m22954e() {
        return this.f17872b;
    }

    /* renamed from: f */
    public boolean m22955f() {
        return this.f17874d;
    }
}
