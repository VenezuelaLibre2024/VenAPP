package p073e2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: e2.k */
/* loaded from: classes.dex */
public class C7107k {

    /* renamed from: a */
    private int f15814a;

    /* renamed from: b */
    private final List<String> f15815b;

    /* renamed from: c */
    private int f15816c;

    /* renamed from: e2.k$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private int f15817a = 0;

        /* renamed from: b */
        private final List<String> f15818b = new ArrayList();

        /* renamed from: c */
        private int f15819c = 1;

        /* renamed from: a */
        public a m20948a(int... iArr) {
            for (int i10 : iArr) {
                this.f15817a = i10 | this.f15817a;
            }
            return this;
        }

        /* renamed from: b */
        public a m20949b(String... strArr) {
            this.f15818b.addAll(Arrays.asList(strArr));
            return this;
        }

        /* renamed from: c */
        public C7107k m20950c() {
            return new C7107k(this.f15817a, this.f15818b, this.f15819c);
        }

        /* renamed from: d */
        public a m20951d(int i10) {
            this.f15819c = i10;
            return this;
        }
    }

    public C7107k(int i10, List<String> list, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f15815b = arrayList;
        this.f15814a = i10;
        arrayList.addAll(list);
        this.f15816c = i11;
    }

    /* renamed from: a */
    public List<String> m20945a() {
        return this.f15815b;
    }

    /* renamed from: b */
    public int m20946b() {
        return this.f15814a;
    }

    /* renamed from: c */
    public int m20947c() {
        return this.f15816c;
    }
}
