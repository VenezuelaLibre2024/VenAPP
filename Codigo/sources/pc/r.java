package pc;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class r extends s {

    /* renamed from: a, reason: collision with root package name */
    private final List<c<?>> f23022a;

    public r(List<c<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f23022a = list;
    }
}
