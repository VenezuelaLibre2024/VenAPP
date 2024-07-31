package p345s2;

import com.arthenica.ffmpegkit.C2087s;
import com.arthenica.ffmpegkit.FFmpegKitConfig;
import io.flutter.plugin.common.MethodChannel;

/* renamed from: s2.n */
/* loaded from: classes.dex */
public class RunnableC10781n implements Runnable {

    /* renamed from: a */
    private final C2087s f27230a;

    /* renamed from: b */
    private final int f27231b;

    /* renamed from: c */
    private final C10772e f27232c;

    /* renamed from: d */
    private final MethodChannel.Result f27233d;

    public RunnableC10781n(C2087s c2087s, int i10, C10772e c10772e, MethodChannel.Result result) {
        this.f27230a = c2087s;
        this.f27231b = i10;
        this.f27232c = c10772e;
        this.f27233d = result;
    }

    @Override // java.lang.Runnable
    public void run() {
        FFmpegKitConfig.m10418D(this.f27230a, this.f27231b);
        this.f27232c.m32763m(this.f27233d, null);
    }
}
