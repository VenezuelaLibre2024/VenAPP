package x3;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f30369a = new ArrayList();

    public synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.f30369a.add(imageHeaderParser);
    }

    public synchronized List<ImageHeaderParser> b() {
        return this.f30369a;
    }
}
