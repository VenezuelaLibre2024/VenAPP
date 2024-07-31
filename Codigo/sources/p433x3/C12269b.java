package p433x3;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* renamed from: x3.b */
/* loaded from: classes.dex */
public final class C12269b {

    /* renamed from: a */
    private final List<ImageHeaderParser> f32881a = new ArrayList();

    /* renamed from: a */
    public synchronized void m39502a(ImageHeaderParser imageHeaderParser) {
        this.f32881a.add(imageHeaderParser);
    }

    /* renamed from: b */
    public synchronized List<ImageHeaderParser> m39503b() {
        return this.f32881a;
    }
}
