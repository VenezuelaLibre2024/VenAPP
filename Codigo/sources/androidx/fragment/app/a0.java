package androidx.fragment.app;

import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.Writer;

/* loaded from: classes.dex */
final class a0 extends Writer {

    /* renamed from: a, reason: collision with root package name */
    private final String f4544a;

    /* renamed from: b, reason: collision with root package name */
    private StringBuilder f4545b = new StringBuilder(RecognitionOptions.ITF);

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(String str) {
        this.f4544a = str;
    }

    private void a() {
        if (this.f4545b.length() > 0) {
            Log.d(this.f4544a, this.f4545b.toString());
            StringBuilder sb2 = this.f4545b;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.f4545b.append(c10);
            }
        }
    }
}
