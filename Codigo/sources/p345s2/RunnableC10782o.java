package p345s2;

import android.util.Log;
import io.flutter.plugin.common.MethodChannel;
import java.io.IOException;

/* renamed from: s2.o */
/* loaded from: classes.dex */
public class RunnableC10782o implements Runnable {

    /* renamed from: a */
    private final String f27234a;

    /* renamed from: b */
    private final String f27235b;

    /* renamed from: c */
    private final C10772e f27236c;

    /* renamed from: d */
    private final MethodChannel.Result f27237d;

    public RunnableC10782o(String str, String str2, C10772e c10772e, MethodChannel.Result result) {
        this.f27234a = str;
        this.f27235b = str2;
        this.f27236c = c10772e;
        this.f27237d = result;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            String str = "cat " + this.f27234a + " > " + this.f27235b;
            Log.d("ffmpeg-kit-flutter", String.format("Starting copy %s to pipe %s operation.", this.f27234a, this.f27235b));
            long currentTimeMillis = System.currentTimeMillis();
            int waitFor = Runtime.getRuntime().exec(new String[]{"sh", "-c", str}).waitFor();
            Log.d("ffmpeg-kit-flutter", String.format("Copying %s to pipe %s operation completed with rc %d in %d seconds.", this.f27234a, this.f27235b, Integer.valueOf(waitFor), Long.valueOf((System.currentTimeMillis() - currentTimeMillis) / 1000)));
            this.f27236c.m32763m(this.f27237d, Integer.valueOf(waitFor));
        } catch (IOException | InterruptedException e10) {
            Log.e("ffmpeg-kit-flutter", String.format("Copy %s to pipe %s failed with error.", this.f27234a, this.f27235b), e10);
            this.f27236c.m32759e(this.f27237d, "WRITE_TO_PIPE_FAILED", e10.getMessage());
        }
    }
}
