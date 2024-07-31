package p119g7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p363t8.C11146e0;

/* renamed from: g7.a */
/* loaded from: classes.dex */
abstract class AbstractC7465a {

    /* renamed from: a */
    public final int f17453a;

    /* renamed from: g7.a$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC7465a {

        /* renamed from: b */
        public final long f17454b;

        /* renamed from: c */
        public final List<b> f17455c;

        /* renamed from: d */
        public final List<a> f17456d;

        public a(int i10, long j10) {
            super(i10);
            this.f17454b = j10;
            this.f17455c = new ArrayList();
            this.f17456d = new ArrayList();
        }

        /* renamed from: d */
        public void m22593d(a aVar) {
            this.f17456d.add(aVar);
        }

        /* renamed from: e */
        public void m22594e(b bVar) {
            this.f17455c.add(bVar);
        }

        /* renamed from: f */
        public a m22595f(int i10) {
            int size = this.f17456d.size();
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = this.f17456d.get(i11);
                if (aVar.f17453a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: g */
        public b m22596g(int i10) {
            int size = this.f17455c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f17455c.get(i11);
                if (bVar.f17453a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // p119g7.AbstractC7465a
        public String toString() {
            return AbstractC7465a.m22590a(this.f17453a) + " leaves: " + Arrays.toString(this.f17455c.toArray()) + " containers: " + Arrays.toString(this.f17456d.toArray());
        }
    }

    /* renamed from: g7.a$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC7465a {

        /* renamed from: b */
        public final C11146e0 f17457b;

        public b(int i10, C11146e0 c11146e0) {
            super(i10);
            this.f17457b = c11146e0;
        }
    }

    public AbstractC7465a(int i10) {
        this.f17453a = i10;
    }

    /* renamed from: a */
    public static String m22590a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    /* renamed from: b */
    public static int m22591b(int i10) {
        return i10 & 16777215;
    }

    /* renamed from: c */
    public static int m22592c(int i10) {
        return (i10 >> 24) & 255;
    }

    public String toString() {
        return m22590a(this.f17453a);
    }
}
