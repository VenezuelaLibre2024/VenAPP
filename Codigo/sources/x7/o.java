package x7;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public interface o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f30645a = new a();

    /* loaded from: classes.dex */
    class a implements o {
        a() {
        }

        @Override // x7.o
        public long a() {
            throw new NoSuchElementException();
        }

        @Override // x7.o
        public long b() {
            throw new NoSuchElementException();
        }

        @Override // x7.o
        public boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
