package com.google.crypto.tink.internal;

import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
public final class JsonParser {

    /* renamed from: a, reason: collision with root package name */
    private static final JsonElementTypeAdapter f11271a = new JsonElementTypeAdapter(null);

    /* loaded from: classes2.dex */
    private static final class JsonElementTypeAdapter extends TypeAdapter<com.google.gson.j> {
        private JsonElementTypeAdapter() {
        }

        /* synthetic */ JsonElementTypeAdapter(a aVar) {
            this();
        }

        private com.google.gson.j b(nf.a aVar, nf.b bVar) {
            int i10 = a.f11272a[bVar.ordinal()];
            if (i10 == 3) {
                String a02 = aVar.a0();
                if (JsonParser.a(a02)) {
                    return new com.google.gson.o(a02);
                }
                throw new IOException("illegal characters in string");
            }
            if (i10 == 4) {
                return new com.google.gson.o(new b(aVar.a0()));
            }
            if (i10 == 5) {
                return new com.google.gson.o(Boolean.valueOf(aVar.E()));
            }
            if (i10 == 6) {
                aVar.S();
                return com.google.gson.l.f13006a;
            }
            throw new IllegalStateException("Unexpected token: " + bVar);
        }

        private com.google.gson.j c(nf.a aVar, nf.b bVar) {
            int i10 = a.f11272a[bVar.ordinal()];
            if (i10 == 1) {
                aVar.a();
                return new com.google.gson.g();
            }
            if (i10 != 2) {
                return null;
            }
            aVar.b();
            return new com.google.gson.m();
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.google.gson.j read(nf.a aVar) {
            String str;
            nf.b h02 = aVar.h0();
            com.google.gson.j c10 = c(aVar, h02);
            if (c10 == null) {
                return b(aVar, h02);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            while (true) {
                if (aVar.q()) {
                    if (c10 instanceof com.google.gson.m) {
                        str = aVar.Q();
                        if (!JsonParser.a(str)) {
                            throw new IOException("illegal characters in string");
                        }
                    } else {
                        str = null;
                    }
                    nf.b h03 = aVar.h0();
                    com.google.gson.j c11 = c(aVar, h03);
                    boolean z10 = c11 != null;
                    if (c11 == null) {
                        c11 = b(aVar, h03);
                    }
                    if (c10 instanceof com.google.gson.g) {
                        ((com.google.gson.g) c10).p(c11);
                    } else {
                        com.google.gson.m mVar = (com.google.gson.m) c10;
                        if (mVar.s(str)) {
                            throw new IOException("duplicate key: " + str);
                        }
                        mVar.p(str, c11);
                    }
                    if (z10) {
                        arrayDeque.addLast(c10);
                        if (arrayDeque.size() > 100) {
                            throw new IOException("too many recursions");
                        }
                        c10 = c11;
                    } else {
                        continue;
                    }
                } else {
                    if (c10 instanceof com.google.gson.g) {
                        aVar.i();
                    } else {
                        aVar.j();
                    }
                    if (arrayDeque.isEmpty()) {
                        return c10;
                    }
                    c10 = (com.google.gson.j) arrayDeque.removeLast();
                }
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void write(nf.c cVar, com.google.gson.j jVar) {
            throw new UnsupportedOperationException("write is not supported");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11272a;

        static {
            int[] iArr = new int[nf.b.values().length];
            f11272a = iArr;
            try {
                iArr[nf.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11272a[nf.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11272a[nf.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11272a[nf.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11272a[nf.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f11272a[nf.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class b extends Number {

        /* renamed from: a, reason: collision with root package name */
        private final String f11273a;

        public b(String str) {
            this.f11273a = str;
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new NotSerializableException("serialization is not supported");
        }

        private Object writeReplace() {
            throw new NotSerializableException("serialization is not supported");
        }

        @Override // java.lang.Number
        public double doubleValue() {
            return Double.parseDouble(this.f11273a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f11273a.equals(((b) obj).f11273a);
            }
            return false;
        }

        @Override // java.lang.Number
        public float floatValue() {
            return Float.parseFloat(this.f11273a);
        }

        public int hashCode() {
            return this.f11273a.hashCode();
        }

        @Override // java.lang.Number
        public int intValue() {
            try {
                try {
                    return Integer.parseInt(this.f11273a);
                } catch (NumberFormatException unused) {
                    return new BigDecimal(this.f11273a).intValue();
                }
            } catch (NumberFormatException unused2) {
                return (int) Long.parseLong(this.f11273a);
            }
        }

        @Override // java.lang.Number
        public long longValue() {
            try {
                return Long.parseLong(this.f11273a);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f11273a).longValue();
            }
        }

        public String toString() {
            return this.f11273a;
        }
    }

    public static boolean a(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 != length) {
            char charAt = str.charAt(i10);
            i10++;
            if (Character.isSurrogate(charAt)) {
                if (Character.isLowSurrogate(charAt) || i10 == length || !Character.isLowSurrogate(str.charAt(i10))) {
                    return false;
                }
                i10++;
            }
        }
        return true;
    }
}
