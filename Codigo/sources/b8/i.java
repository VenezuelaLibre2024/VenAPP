package b8;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i implements u7.a<i> {

    /* renamed from: a, reason: collision with root package name */
    public final String f6279a;

    /* renamed from: b, reason: collision with root package name */
    public final List<String> f6280b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6281c;

    /* JADX INFO: Access modifiers changed from: protected */
    public i(String str, List<String> list, boolean z10) {
        this.f6279a = str;
        this.f6280b = Collections.unmodifiableList(list);
        this.f6281c = z10;
    }
}
