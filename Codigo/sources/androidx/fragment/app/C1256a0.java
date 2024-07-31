package androidx.fragment.app;

import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.Writer;

/* renamed from: androidx.fragment.app.a0 */
/* loaded from: classes.dex */
final class C1256a0 extends Writer {

    /* renamed from: a */
    private final String f5281a;

    /* renamed from: b */
    private StringBuilder f5282b = new StringBuilder(RecognitionOptions.ITF);

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1256a0(String str) {
        this.f5281a = str;
    }

    /* renamed from: a */
    private void m6859a() {
        if (this.f5282b.length() > 0) {
            Log.d(this.f5281a, this.f5282b.toString());
            StringBuilder sb2 = this.f5282b;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m6859a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m6859a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                m6859a();
            } else {
                this.f5282b.append(c10);
            }
        }
    }
}
