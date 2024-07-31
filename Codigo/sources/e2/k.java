package e2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private int f14442a;

    /* renamed from: b, reason: collision with root package name */
    private final List<String> f14443b;

    /* renamed from: c, reason: collision with root package name */
    private int f14444c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f14445a = 0;

        /* renamed from: b, reason: collision with root package name */
        private final List<String> f14446b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private int f14447c = 1;

        public a a(int... iArr) {
            for (int i10 : iArr) {
                this.f14445a = i10 | this.f14445a;
            }
            return this;
        }

        public a b(String... strArr) {
            this.f14446b.addAll(Arrays.asList(strArr));
            return this;
        }

        public k c() {
            return new k(this.f14445a, this.f14446b, this.f14447c);
        }

        public a d(int i10) {
            this.f14447c = i10;
            return this;
        }
    }

    public k(int i10, List<String> list, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f14443b = arrayList;
        this.f14442a = i10;
        arrayList.addAll(list);
        this.f14444c = i11;
    }

    public List<String> a() {
        return this.f14443b;
    }

    public int b() {
        return this.f14442a;
    }

    public int c() {
        return this.f14444c;
    }
}
