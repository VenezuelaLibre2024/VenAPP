package z7;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f32394a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32395b;

    /* renamed from: c, reason: collision with root package name */
    public final List<a> f32396c;

    /* renamed from: d, reason: collision with root package name */
    public final List<f> f32397d;

    /* renamed from: e, reason: collision with root package name */
    public final e f32398e;

    public g(String str, long j10, List<a> list, List<f> list2) {
        this(str, j10, list, list2, null);
    }

    public g(String str, long j10, List<a> list, List<f> list2, e eVar) {
        this.f32394a = str;
        this.f32395b = j10;
        this.f32396c = Collections.unmodifiableList(list);
        this.f32397d = Collections.unmodifiableList(list2);
        this.f32398e = eVar;
    }

    public int a(int i10) {
        int size = this.f32396c.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f32396c.get(i11).f32350b == i10) {
                return i11;
            }
        }
        return -1;
    }
}
