package p482z7;

import java.util.Collections;
import java.util.List;

/* renamed from: z7.g */
/* loaded from: classes.dex */
public class C12815g {

    /* renamed from: a */
    public final String f34945a;

    /* renamed from: b */
    public final long f34946b;

    /* renamed from: c */
    public final List<C12809a> f34947c;

    /* renamed from: d */
    public final List<C12814f> f34948d;

    /* renamed from: e */
    public final C12813e f34949e;

    public C12815g(String str, long j10, List<C12809a> list, List<C12814f> list2) {
        this(str, j10, list, list2, null);
    }

    public C12815g(String str, long j10, List<C12809a> list, List<C12814f> list2, C12813e c12813e) {
        this.f34945a = str;
        this.f34946b = j10;
        this.f34947c = Collections.unmodifiableList(list);
        this.f34948d = Collections.unmodifiableList(list2);
        this.f34949e = c12813e;
    }

    /* renamed from: a */
    public int m42538a(int i10) {
        int size = this.f34947c.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f34947c.get(i11).f34901b == i10) {
                return i11;
            }
        }
        return -1;
    }
}
