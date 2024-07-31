package gf;

import android.util.Log;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: f, reason: collision with root package name */
    private static final Runtime f16233f = Runtime.getRuntime();

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f16234a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f16235b;

    /* renamed from: c, reason: collision with root package name */
    private int f16236c = 0;

    /* renamed from: e, reason: collision with root package name */
    private boolean f16238e = true;

    /* renamed from: d, reason: collision with root package name */
    private boolean f16237d = false;

    public b(InputStream inputStream, int i10) {
        this.f16234a = inputStream;
        this.f16235b = new byte[i10];
    }

    private int g(int i10) {
        int max = Math.max(this.f16235b.length * 2, i10);
        Runtime runtime = f16233f;
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        if (!this.f16238e || max >= maxMemory) {
            Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing to conserve memory.");
        } else {
            try {
                byte[] bArr = new byte[max];
                System.arraycopy(this.f16235b, 0, bArr, 0, this.f16236c);
                this.f16235b = bArr;
            } catch (OutOfMemoryError unused) {
                Log.w("AdaptiveStreamBuffer", "Turning off adaptive buffer resizing due to low memory.");
                this.f16238e = false;
            }
        }
        return this.f16235b.length;
    }

    public int a(int i10) {
        int i11 = this.f16236c;
        int i12 = 0;
        if (i10 <= i11) {
            int i13 = i11 - i10;
            this.f16236c = i13;
            byte[] bArr = this.f16235b;
            System.arraycopy(bArr, i10, bArr, 0, i13);
            return i10;
        }
        this.f16236c = 0;
        while (i12 < i10) {
            int skip = (int) this.f16234a.skip(i10 - i12);
            if (skip > 0) {
                i12 += skip;
            } else if (skip != 0) {
                continue;
            } else {
                if (this.f16234a.read() == -1) {
                    break;
                }
                i12++;
            }
        }
        return i12;
    }

    public int b() {
        return this.f16236c;
    }

    public void c() {
        this.f16234a.close();
    }

    public int d(int i10) {
        if (i10 > this.f16235b.length) {
            i10 = Math.min(i10, g(i10));
        }
        while (true) {
            int i11 = this.f16236c;
            if (i11 >= i10) {
                break;
            }
            int read = this.f16234a.read(this.f16235b, i11, i10 - i11);
            if (read == -1) {
                this.f16237d = true;
                break;
            }
            this.f16236c += read;
        }
        return this.f16236c;
    }

    public byte[] e() {
        return this.f16235b;
    }

    public boolean f() {
        return this.f16237d;
    }
}
