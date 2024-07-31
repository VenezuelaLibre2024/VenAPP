package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.g;
import com.google.gson.internal.f;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.o;
import com.google.gson.r;
import com.google.gson.v;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import nf.c;

/* loaded from: classes2.dex */
public final class TypeAdapters {
    public static final TypeAdapter<BigInteger> A;
    public static final TypeAdapter<f> B;
    public static final v C;
    public static final TypeAdapter<StringBuilder> D;
    public static final v E;
    public static final TypeAdapter<StringBuffer> F;
    public static final v G;
    public static final TypeAdapter<URL> H;
    public static final v I;
    public static final TypeAdapter<URI> J;
    public static final v K;
    public static final TypeAdapter<InetAddress> L;
    public static final v M;
    public static final TypeAdapter<UUID> N;
    public static final v O;
    public static final TypeAdapter<Currency> P;
    public static final v Q;
    public static final TypeAdapter<Calendar> R;
    public static final v S;
    public static final TypeAdapter<Locale> T;
    public static final v U;
    public static final TypeAdapter<j> V;
    public static final v W;
    public static final v X;

    /* renamed from: a */
    public static final TypeAdapter<Class> f12881a;

    /* renamed from: b */
    public static final v f12882b;

    /* renamed from: c */
    public static final TypeAdapter<BitSet> f12883c;

    /* renamed from: d */
    public static final v f12884d;

    /* renamed from: e */
    public static final TypeAdapter<Boolean> f12885e;

    /* renamed from: f */
    public static final TypeAdapter<Boolean> f12886f;

    /* renamed from: g */
    public static final v f12887g;

    /* renamed from: h */
    public static final TypeAdapter<Number> f12888h;

    /* renamed from: i */
    public static final v f12889i;

    /* renamed from: j */
    public static final TypeAdapter<Number> f12890j;

    /* renamed from: k */
    public static final v f12891k;

    /* renamed from: l */
    public static final TypeAdapter<Number> f12892l;

    /* renamed from: m */
    public static final v f12893m;

    /* renamed from: n */
    public static final TypeAdapter<AtomicInteger> f12894n;

    /* renamed from: o */
    public static final v f12895o;

    /* renamed from: p */
    public static final TypeAdapter<AtomicBoolean> f12896p;

    /* renamed from: q */
    public static final v f12897q;

    /* renamed from: r */
    public static final TypeAdapter<AtomicIntegerArray> f12898r;

    /* renamed from: s */
    public static final v f12899s;

    /* renamed from: t */
    public static final TypeAdapter<Number> f12900t;

    /* renamed from: u */
    public static final TypeAdapter<Number> f12901u;

    /* renamed from: v */
    public static final TypeAdapter<Number> f12902v;

    /* renamed from: w */
    public static final TypeAdapter<Character> f12903w;

    /* renamed from: x */
    public static final v f12904x;

    /* renamed from: y */
    public static final TypeAdapter<String> f12905y;

    /* renamed from: z */
    public static final TypeAdapter<BigDecimal> f12906z;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$1 */
    /* loaded from: classes2.dex */
    class AnonymousClass1 extends TypeAdapter<Class> {
        AnonymousClass1() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Class read(nf.a aVar) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$10 */
    /* loaded from: classes2.dex */
    class AnonymousClass10 extends TypeAdapter<AtomicIntegerArray> {
        AnonymousClass10() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public AtomicIntegerArray read(nf.a aVar) {
            ArrayList arrayList = new ArrayList();
            aVar.a();
            while (aVar.q()) {
                try {
                    arrayList.add(Integer.valueOf(aVar.I()));
                } catch (NumberFormatException e10) {
                    throw new r(e10);
                }
            }
            aVar.i();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, AtomicIntegerArray atomicIntegerArray) {
            cVar.e();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.c0(atomicIntegerArray.get(i10));
            }
            cVar.i();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$11 */
    /* loaded from: classes2.dex */
    class AnonymousClass11 extends TypeAdapter<Number> {
        AnonymousClass11() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Number read(nf.a aVar) {
            if (aVar.h0() == nf.b.NULL) {
                aVar.S();
                return null;
            }
            try {
                return Long.valueOf(aVar.O());
            } catch (NumberFormatException e10) {
                throw new r(e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, Number number) {
            cVar.i0(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$12 */
    /* loaded from: classes2.dex */
    class AnonymousClass12 extends TypeAdapter<Number> {
        AnonymousClass12() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Number read(nf.a aVar) {
            if (aVar.h0() != nf.b.NULL) {
                return Float.valueOf((float) aVar.H());
            }
            aVar.S();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, Number number) {
            cVar.i0(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$13 */
    /* loaded from: classes2.dex */
    class AnonymousClass13 extends TypeAdapter<Number> {
        AnonymousClass13() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Number read(nf.a aVar) {
            if (aVar.h0() != nf.b.NULL) {
                return Double.valueOf(aVar.H());
            }
            aVar.S();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, Number number) {
            cVar.i0(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$14 */
    /* loaded from: classes2.dex */
    class AnonymousClass14 extends TypeAdapter<Character> {
        AnonymousClass14() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Character read(nf.a aVar) {
            if (aVar.h0() == nf.b.NULL) {
                aVar.S();
                return null;
            }
            String a02 = aVar.a0();
            if (a02.length() == 1) {
                return Character.valueOf(a02.charAt(0));
            }
            throw new r("Expecting character, got: " + a02 + "; at " + aVar.o());
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, Character ch2) {
            cVar.j0(ch2 == null ? null : String.valueOf(ch2));
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$15 */
    /* loaded from: classes2.dex */
    class AnonymousClass15 extends TypeAdapter<String> {
        AnonymousClass15() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public String read(nf.a aVar) {
            nf.b h02 = aVar.h0();
            if (h02 != nf.b.NULL) {
                return h02 == nf.b.BOOLEAN ? Boolean.toString(aVar.E()) : aVar.a0();
            }
            aVar.S();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, String str) {
            cVar.j0(str);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$16 */
    /* loaded from: classes2.dex */
    class AnonymousClass16 extends TypeAdapter<BigDecimal> {
        AnonymousClass16() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public BigDecimal read(nf.a aVar) {
            if (aVar.h0() == nf.b.NULL) {
                aVar.S();
                return null;
            }
            String a02 = aVar.a0();
            try {
                return new BigDecimal(a02);
            } catch (NumberFormatException e10) {
                throw new r("Failed parsing '" + a02 + "' as BigDecimal; at path " + aVar.o(), e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, BigDecimal bigDecimal) {
            cVar.i0(bigDecimal);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$17 */
    /* loaded from: classes2.dex */
    class AnonymousClass17 extends TypeAdapter<BigInteger> {
        AnonymousClass17() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public BigInteger read(nf.a aVar) {
            if (aVar.h0() == nf.b.NULL) {
                aVar.S();
                return null;
            }
            String a02 = aVar.a0();
            try {
                return new BigInteger(a02);
            } catch (NumberFormatException e10) {
                throw new r("Failed parsing '" + a02 + "' as BigInteger; at path " + aVar.o(), e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, BigInteger bigInteger) {
            cVar.i0(bigInteger);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$18 */
    /* loaded from: classes2.dex */
    class AnonymousClass18 extends TypeAdapter<f> {
        AnonymousClass18() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public f read(nf.a aVar) {
            if (aVar.h0() != nf.b.NULL) {
                return new f(aVar.a0());
            }
            aVar.S();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, f fVar) {
            cVar.i0(fVar);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$19 */
    /* loaded from: classes2.dex */
    class AnonymousClass19 extends TypeAdapter<StringBuilder> {
        AnonymousClass19() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public StringBuilder read(nf.a aVar) {
            if (aVar.h0() != nf.b.NULL) {
                return new StringBuilder(aVar.a0());
            }
            aVar.S();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, StringBuilder sb2) {
            cVar.j0(sb2 == null ? null : sb2.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$2 */
    /* loaded from: classes2.dex */
    class AnonymousClass2 extends TypeAdapter<BitSet> {
        AnonymousClass2() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public BitSet read(nf.a aVar) {
            BitSet bitSet = new BitSet();
            aVar.a();
            nf.b h02 = aVar.h0();
            int i10 = 0;
            while (h02 != nf.b.END_ARRAY) {
                int i11 = a.f12925a[h02.ordinal()];
                boolean z10 = true;
                if (i11 == 1 || i11 == 2) {
                    int I = aVar.I();
                    if (I == 0) {
                        z10 = false;
                    } else if (I != 1) {
                        throw new r("Invalid bitset value " + I + ", expected 0 or 1; at path " + aVar.o());
                    }
                } else {
                    if (i11 != 3) {
                        throw new r("Invalid bitset value type: " + h02 + "; at path " + aVar.f0());
                    }
                    z10 = aVar.E();
                }
                if (z10) {
                    bitSet.set(i10);
                }
                i10++;
                h02 = aVar.h0();
            }
            aVar.i();
            return bitSet;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, BitSet bitSet) {
            cVar.e();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                cVar.c0(bitSet.get(i10) ? 1L : 0L);
            }
            cVar.i();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$20 */
    /* loaded from: classes2.dex */
    class AnonymousClass20 extends TypeAdapter<StringBuffer> {
        AnonymousClass20() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public StringBuffer read(nf.a aVar) {
            if (aVar.h0() != nf.b.NULL) {
                return new StringBuffer(aVar.a0());
            }
            aVar.S();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, StringBuffer stringBuffer) {
            cVar.j0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$21 */
    /* loaded from: classes2.dex */
    class AnonymousClass21 extends TypeAdapter<URL> {
        AnonymousClass21() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public URL read(nf.a aVar) {
            if (aVar.h0() == nf.b.NULL) {
                aVar.S();
                return null;
            }
            String a02 = aVar.a0();
            if ("null".equals(a02)) {
                return null;
            }
            return new URL(a02);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, URL url) {
            cVar.j0(url == null ? null : url.toExternalForm());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$22 */
    /* loaded from: classes2.dex */
    class AnonymousClass22 extends TypeAdapter<URI> {
        AnonymousClass22() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public URI read(nf.a aVar) {
            if (aVar.h0() == nf.b.NULL) {
                aVar.S();
                return null;
            }
            try {
                String a02 = aVar.a0();
                if ("null".equals(a02)) {
                    return null;
                }
                return new URI(a02);
            } catch (URISyntaxException e10) {
                throw new k(e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, URI uri) {
            cVar.j0(uri == null ? null : uri.toASCIIString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$23 */
    /* loaded from: classes2.dex */
    class AnonymousClass23 extends TypeAdapter<InetAddress> {
        AnonymousClass23() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public InetAddress read(nf.a aVar) {
            if (aVar.h0() != nf.b.NULL) {
                return InetAddress.getByName(aVar.a0());
            }
            aVar.S();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, InetAddress inetAddress) {
            cVar.j0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$24 */
    /* loaded from: classes2.dex */
    class AnonymousClass24 extends TypeAdapter<UUID> {
        AnonymousClass24() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public UUID read(nf.a aVar) {
            if (aVar.h0() == nf.b.NULL) {
                aVar.S();
                return null;
            }
            String a02 = aVar.a0();
            try {
                return UUID.fromString(a02);
            } catch (IllegalArgumentException e10) {
                throw new r("Failed parsing '" + a02 + "' as UUID; at path " + aVar.o(), e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, UUID uuid) {
            cVar.j0(uuid == null ? null : uuid.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$25 */
    /* loaded from: classes2.dex */
    class AnonymousClass25 extends TypeAdapter<Currency> {
        AnonymousClass25() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Currency read(nf.a aVar) {
            String a02 = aVar.a0();
            try {
                return Currency.getInstance(a02);
            } catch (IllegalArgumentException e10) {
                throw new r("Failed parsing '" + a02 + "' as Currency; at path " + aVar.o(), e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, Currency currency) {
            cVar.j0(currency.getCurrencyCode());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$26 */
    /* loaded from: classes2.dex */
    class AnonymousClass26 extends TypeAdapter<Calendar> {
        AnonymousClass26() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Calendar read(nf.a aVar) {
            if (aVar.h0() == nf.b.NULL) {
                aVar.S();
                return null;
            }
            aVar.b();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (aVar.h0() != nf.b.END_OBJECT) {
                String Q = aVar.Q();
                int I = aVar.I();
                if ("year".equals(Q)) {
                    i10 = I;
                } else if ("month".equals(Q)) {
                    i11 = I;
                } else if ("dayOfMonth".equals(Q)) {
                    i12 = I;
                } else if ("hourOfDay".equals(Q)) {
                    i13 = I;
                } else if ("minute".equals(Q)) {
                    i14 = I;
                } else if ("second".equals(Q)) {
                    i15 = I;
                }
            }
            aVar.j();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, Calendar calendar) {
            if (calendar == null) {
                cVar.B();
                return;
            }
            cVar.f();
            cVar.r("year");
            cVar.c0(calendar.get(1));
            cVar.r("month");
            cVar.c0(calendar.get(2));
            cVar.r("dayOfMonth");
            cVar.c0(calendar.get(5));
            cVar.r("hourOfDay");
            cVar.c0(calendar.get(11));
            cVar.r("minute");
            cVar.c0(calendar.get(12));
            cVar.r("second");
            cVar.c0(calendar.get(13));
            cVar.j();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$27 */
    /* loaded from: classes2.dex */
    class AnonymousClass27 extends TypeAdapter<Locale> {
        AnonymousClass27() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Locale read(nf.a aVar) {
            if (aVar.h0() == nf.b.NULL) {
                aVar.S();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.a0(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, Locale locale) {
            cVar.j0(locale == null ? null : locale.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$28 */
    /* loaded from: classes2.dex */
    class AnonymousClass28 extends TypeAdapter<j> {
        AnonymousClass28() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public j read(nf.a aVar) {
            if (aVar instanceof com.google.gson.internal.bind.a) {
                return ((com.google.gson.internal.bind.a) aVar).R0();
            }
            switch (a.f12925a[aVar.h0().ordinal()]) {
                case 1:
                    return new o(new f(aVar.a0()));
                case 2:
                    return new o(aVar.a0());
                case 3:
                    return new o(Boolean.valueOf(aVar.E()));
                case 4:
                    aVar.S();
                    return l.f13006a;
                case 5:
                    g gVar = new g();
                    aVar.a();
                    while (aVar.q()) {
                        gVar.p(read(aVar));
                    }
                    aVar.i();
                    return gVar;
                case 6:
                    m mVar = new m();
                    aVar.b();
                    while (aVar.q()) {
                        mVar.p(aVar.Q(), read(aVar));
                    }
                    aVar.j();
                    return mVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, j jVar) {
            if (jVar == null || jVar.m()) {
                cVar.B();
                return;
            }
            if (jVar.o()) {
                o f10 = jVar.f();
                if (f10.v()) {
                    cVar.i0(f10.s());
                    return;
                } else if (f10.t()) {
                    cVar.m0(f10.p());
                    return;
                } else {
                    cVar.j0(f10.k());
                    return;
                }
            }
            if (jVar.l()) {
                cVar.e();
                Iterator<j> it = jVar.c().iterator();
                while (it.hasNext()) {
                    write(cVar, it.next());
                }
                cVar.i();
                return;
            }
            if (!jVar.n()) {
                throw new IllegalArgumentException("Couldn't write " + jVar.getClass());
            }
            cVar.f();
            for (Map.Entry<String, j> entry : jVar.d().q()) {
                cVar.r(entry.getKey());
                write(cVar, entry.getValue());
            }
            cVar.j();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$29 */
    /* loaded from: classes2.dex */
    class AnonymousClass29 implements v {
        AnonymousClass29() {
        }

        @Override // com.google.gson.v
        public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new EnumTypeAdapter(rawType);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$3 */
    /* loaded from: classes2.dex */
    class AnonymousClass3 extends TypeAdapter<Boolean> {
        AnonymousClass3() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Boolean read(nf.a aVar) {
            nf.b h02 = aVar.h0();
            if (h02 != nf.b.NULL) {
                return h02 == nf.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.a0())) : Boolean.valueOf(aVar.E());
            }
            aVar.S();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, Boolean bool) {
            cVar.h0(bool);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$30 */
    /* loaded from: classes2.dex */
    class AnonymousClass30 implements v {

        /* renamed from: a */
        final /* synthetic */ com.google.gson.reflect.a f12907a;

        /* renamed from: b */
        final /* synthetic */ TypeAdapter f12908b;

        @Override // com.google.gson.v
        public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.equals(this.f12907a)) {
                return this.f12908b;
            }
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$31 */
    /* loaded from: classes2.dex */
    public class AnonymousClass31 implements v {

        /* renamed from: a */
        final /* synthetic */ Class f12909a;

        /* renamed from: b */
        final /* synthetic */ TypeAdapter f12910b;

        AnonymousClass31(Class cls, TypeAdapter typeAdapter) {
            r1 = cls;
            r2 = typeAdapter;
        }

        @Override // com.google.gson.v
        public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            if (aVar.getRawType() == r1) {
                return r2;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + r1.getName() + ",adapter=" + r2 + "]";
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$32 */
    /* loaded from: classes2.dex */
    public class AnonymousClass32 implements v {

        /* renamed from: a */
        final /* synthetic */ Class f12911a;

        /* renamed from: b */
        final /* synthetic */ Class f12912b;

        /* renamed from: c */
        final /* synthetic */ TypeAdapter f12913c;

        AnonymousClass32(Class cls, Class cls2, TypeAdapter typeAdapter) {
            r1 = cls;
            r2 = cls2;
            r3 = typeAdapter;
        }

        @Override // com.google.gson.v
        public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (rawType == r1 || rawType == r2) {
                return r3;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + r2.getName() + "+" + r1.getName() + ",adapter=" + r3 + "]";
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$33 */
    /* loaded from: classes2.dex */
    public class AnonymousClass33 implements v {

        /* renamed from: a */
        final /* synthetic */ Class f12914a;

        /* renamed from: b */
        final /* synthetic */ Class f12915b;

        /* renamed from: c */
        final /* synthetic */ TypeAdapter f12916c;

        AnonymousClass33(Class cls, Class cls2, TypeAdapter typeAdapter) {
            r1 = cls;
            r2 = cls2;
            r3 = typeAdapter;
        }

        @Override // com.google.gson.v
        public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
            Class<? super T> rawType = aVar.getRawType();
            if (rawType == r1 || rawType == r2) {
                return r3;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + r1.getName() + "+" + r2.getName() + ",adapter=" + r3 + "]";
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$34 */
    /* loaded from: classes2.dex */
    public class AnonymousClass34 implements v {

        /* renamed from: a */
        final /* synthetic */ Class f12917a;

        /* renamed from: b */
        final /* synthetic */ TypeAdapter f12918b;

        /* renamed from: com.google.gson.internal.bind.TypeAdapters$34$1 */
        /* loaded from: classes2.dex */
        class AnonymousClass1<T1> extends TypeAdapter<T1> {

            /* renamed from: a */
            final /* synthetic */ Class f12919a;

            AnonymousClass1(Class cls) {
                r2 = cls;
            }

            @Override // com.google.gson.TypeAdapter
            public T1 read(nf.a aVar) {
                T1 t12 = (T1) r2.read(aVar);
                if (t12 == null || r2.isInstance(t12)) {
                    return t12;
                }
                throw new r("Expected a " + r2.getName() + " but was " + t12.getClass().getName() + "; at path " + aVar.o());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(c cVar, T1 t12) {
                r2.write(cVar, t12);
            }
        }

        AnonymousClass34(Class cls, TypeAdapter typeAdapter) {
            r1 = cls;
            r2 = typeAdapter;
        }

        @Override // com.google.gson.v
        public <T2> TypeAdapter<T2> create(Gson gson, com.google.gson.reflect.a<T2> aVar) {
            Class<? super T2> rawType = aVar.getRawType();
            if (r1.isAssignableFrom(rawType)) {
                return new TypeAdapter<T1>() { // from class: com.google.gson.internal.bind.TypeAdapters.34.1

                    /* renamed from: a */
                    final /* synthetic */ Class f12919a;

                    AnonymousClass1(Class rawType2) {
                        r2 = rawType2;
                    }

                    @Override // com.google.gson.TypeAdapter
                    public T1 read(nf.a aVar2) {
                        T1 t12 = (T1) r2.read(aVar2);
                        if (t12 == null || r2.isInstance(t12)) {
                            return t12;
                        }
                        throw new r("Expected a " + r2.getName() + " but was " + t12.getClass().getName() + "; at path " + aVar2.o());
                    }

                    @Override // com.google.gson.TypeAdapter
                    public void write(c cVar, T1 t12) {
                        r2.write(cVar, t12);
                    }
                };
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + r1.getName() + ",adapter=" + r2 + "]";
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$4 */
    /* loaded from: classes2.dex */
    class AnonymousClass4 extends TypeAdapter<Boolean> {
        AnonymousClass4() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Boolean read(nf.a aVar) {
            if (aVar.h0() != nf.b.NULL) {
                return Boolean.valueOf(aVar.a0());
            }
            aVar.S();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, Boolean bool) {
            cVar.j0(bool == null ? "null" : bool.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$5 */
    /* loaded from: classes2.dex */
    class AnonymousClass5 extends TypeAdapter<Number> {
        AnonymousClass5() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Number read(nf.a aVar) {
            if (aVar.h0() == nf.b.NULL) {
                aVar.S();
                return null;
            }
            try {
                int I = aVar.I();
                if (I <= 255 && I >= -128) {
                    return Byte.valueOf((byte) I);
                }
                throw new r("Lossy conversion from " + I + " to byte; at path " + aVar.o());
            } catch (NumberFormatException e10) {
                throw new r(e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, Number number) {
            cVar.i0(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$6 */
    /* loaded from: classes2.dex */
    class AnonymousClass6 extends TypeAdapter<Number> {
        AnonymousClass6() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Number read(nf.a aVar) {
            if (aVar.h0() == nf.b.NULL) {
                aVar.S();
                return null;
            }
            try {
                int I = aVar.I();
                if (I <= 65535 && I >= -32768) {
                    return Short.valueOf((short) I);
                }
                throw new r("Lossy conversion from " + I + " to short; at path " + aVar.o());
            } catch (NumberFormatException e10) {
                throw new r(e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, Number number) {
            cVar.i0(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$7 */
    /* loaded from: classes2.dex */
    class AnonymousClass7 extends TypeAdapter<Number> {
        AnonymousClass7() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Number read(nf.a aVar) {
            if (aVar.h0() == nf.b.NULL) {
                aVar.S();
                return null;
            }
            try {
                return Integer.valueOf(aVar.I());
            } catch (NumberFormatException e10) {
                throw new r(e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, Number number) {
            cVar.i0(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$8 */
    /* loaded from: classes2.dex */
    class AnonymousClass8 extends TypeAdapter<AtomicInteger> {
        AnonymousClass8() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public AtomicInteger read(nf.a aVar) {
            try {
                return new AtomicInteger(aVar.I());
            } catch (NumberFormatException e10) {
                throw new r(e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, AtomicInteger atomicInteger) {
            cVar.c0(atomicInteger.get());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$9 */
    /* loaded from: classes2.dex */
    class AnonymousClass9 extends TypeAdapter<AtomicBoolean> {
        AnonymousClass9() {
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public AtomicBoolean read(nf.a aVar) {
            return new AtomicBoolean(aVar.E());
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, AtomicBoolean atomicBoolean) {
            cVar.m0(atomicBoolean.get());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {

        /* renamed from: a */
        private final Map<String, T> f12921a = new HashMap();

        /* renamed from: b */
        private final Map<T, String> f12922b = new HashMap();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a implements PrivilegedAction<Field[]> {

            /* renamed from: a */
            final /* synthetic */ Class f12923a;

            a(Class cls) {
                this.f12923a = cls;
            }

            @Override // java.security.PrivilegedAction
            /* renamed from: a */
            public Field[] run() {
                Field[] declaredFields = this.f12923a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        public EnumTypeAdapter(Class<T> cls) {
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r42 = (Enum) field.get(null);
                    String name = r42.name();
                    kf.c cVar = (kf.c) field.getAnnotation(kf.c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String str : cVar.alternate()) {
                            this.f12921a.put(str, r42);
                        }
                    }
                    this.f12921a.put(name, r42);
                    this.f12922b.put(r42, name);
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public T read(nf.a aVar) {
            if (aVar.h0() != nf.b.NULL) {
                return this.f12921a.get(aVar.a0());
            }
            aVar.S();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(c cVar, T t10) {
            cVar.j0(t10 == null ? null : this.f12922b.get(t10));
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12925a;

        static {
            int[] iArr = new int[nf.b.values().length];
            f12925a = iArr;
            try {
                iArr[nf.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12925a[nf.b.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12925a[nf.b.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12925a[nf.b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12925a[nf.b.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12925a[nf.b.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12925a[nf.b.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12925a[nf.b.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12925a[nf.b.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12925a[nf.b.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static {
        TypeAdapter<Class> nullSafe = new TypeAdapter<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
            AnonymousClass1() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Class read(nf.a aVar) {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, Class cls) {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }
        }.nullSafe();
        f12881a = nullSafe;
        f12882b = a(Class.class, nullSafe);
        TypeAdapter<BitSet> nullSafe2 = new TypeAdapter<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
            AnonymousClass2() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public BitSet read(nf.a aVar) {
                BitSet bitSet = new BitSet();
                aVar.a();
                nf.b h02 = aVar.h0();
                int i10 = 0;
                while (h02 != nf.b.END_ARRAY) {
                    int i11 = a.f12925a[h02.ordinal()];
                    boolean z10 = true;
                    if (i11 == 1 || i11 == 2) {
                        int I2 = aVar.I();
                        if (I2 == 0) {
                            z10 = false;
                        } else if (I2 != 1) {
                            throw new r("Invalid bitset value " + I2 + ", expected 0 or 1; at path " + aVar.o());
                        }
                    } else {
                        if (i11 != 3) {
                            throw new r("Invalid bitset value type: " + h02 + "; at path " + aVar.f0());
                        }
                        z10 = aVar.E();
                    }
                    if (z10) {
                        bitSet.set(i10);
                    }
                    i10++;
                    h02 = aVar.h0();
                }
                aVar.i();
                return bitSet;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, BitSet bitSet) {
                cVar.e();
                int length = bitSet.length();
                for (int i10 = 0; i10 < length; i10++) {
                    cVar.c0(bitSet.get(i10) ? 1L : 0L);
                }
                cVar.i();
            }
        }.nullSafe();
        f12883c = nullSafe2;
        f12884d = a(BitSet.class, nullSafe2);
        AnonymousClass3 anonymousClass3 = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            AnonymousClass3() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Boolean read(nf.a aVar) {
                nf.b h02 = aVar.h0();
                if (h02 != nf.b.NULL) {
                    return h02 == nf.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.a0())) : Boolean.valueOf(aVar.E());
                }
                aVar.S();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, Boolean bool) {
                cVar.h0(bool);
            }
        };
        f12885e = anonymousClass3;
        f12886f = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            AnonymousClass4() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Boolean read(nf.a aVar) {
                if (aVar.h0() != nf.b.NULL) {
                    return Boolean.valueOf(aVar.a0());
                }
                aVar.S();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, Boolean bool) {
                cVar.j0(bool == null ? "null" : bool.toString());
            }
        };
        f12887g = b(Boolean.TYPE, Boolean.class, anonymousClass3);
        AnonymousClass5 anonymousClass5 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            AnonymousClass5() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(nf.a aVar) {
                if (aVar.h0() == nf.b.NULL) {
                    aVar.S();
                    return null;
                }
                try {
                    int I2 = aVar.I();
                    if (I2 <= 255 && I2 >= -128) {
                        return Byte.valueOf((byte) I2);
                    }
                    throw new r("Lossy conversion from " + I2 + " to byte; at path " + aVar.o());
                } catch (NumberFormatException e10) {
                    throw new r(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, Number number) {
                cVar.i0(number);
            }
        };
        f12888h = anonymousClass5;
        f12889i = b(Byte.TYPE, Byte.class, anonymousClass5);
        AnonymousClass6 anonymousClass6 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            AnonymousClass6() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(nf.a aVar) {
                if (aVar.h0() == nf.b.NULL) {
                    aVar.S();
                    return null;
                }
                try {
                    int I2 = aVar.I();
                    if (I2 <= 65535 && I2 >= -32768) {
                        return Short.valueOf((short) I2);
                    }
                    throw new r("Lossy conversion from " + I2 + " to short; at path " + aVar.o());
                } catch (NumberFormatException e10) {
                    throw new r(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, Number number) {
                cVar.i0(number);
            }
        };
        f12890j = anonymousClass6;
        f12891k = b(Short.TYPE, Short.class, anonymousClass6);
        AnonymousClass7 anonymousClass7 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            AnonymousClass7() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(nf.a aVar) {
                if (aVar.h0() == nf.b.NULL) {
                    aVar.S();
                    return null;
                }
                try {
                    return Integer.valueOf(aVar.I());
                } catch (NumberFormatException e10) {
                    throw new r(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, Number number) {
                cVar.i0(number);
            }
        };
        f12892l = anonymousClass7;
        f12893m = b(Integer.TYPE, Integer.class, anonymousClass7);
        TypeAdapter<AtomicInteger> nullSafe3 = new TypeAdapter<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            AnonymousClass8() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public AtomicInteger read(nf.a aVar) {
                try {
                    return new AtomicInteger(aVar.I());
                } catch (NumberFormatException e10) {
                    throw new r(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, AtomicInteger atomicInteger) {
                cVar.c0(atomicInteger.get());
            }
        }.nullSafe();
        f12894n = nullSafe3;
        f12895o = a(AtomicInteger.class, nullSafe3);
        TypeAdapter<AtomicBoolean> nullSafe4 = new TypeAdapter<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            AnonymousClass9() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public AtomicBoolean read(nf.a aVar) {
                return new AtomicBoolean(aVar.E());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, AtomicBoolean atomicBoolean) {
                cVar.m0(atomicBoolean.get());
            }
        }.nullSafe();
        f12896p = nullSafe4;
        f12897q = a(AtomicBoolean.class, nullSafe4);
        TypeAdapter<AtomicIntegerArray> nullSafe5 = new TypeAdapter<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            AnonymousClass10() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public AtomicIntegerArray read(nf.a aVar) {
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.q()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.I()));
                    } catch (NumberFormatException e10) {
                        throw new r(e10);
                    }
                }
                aVar.i();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, AtomicIntegerArray atomicIntegerArray) {
                cVar.e();
                int length = atomicIntegerArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    cVar.c0(atomicIntegerArray.get(i10));
                }
                cVar.i();
            }
        }.nullSafe();
        f12898r = nullSafe5;
        f12899s = a(AtomicIntegerArray.class, nullSafe5);
        f12900t = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            AnonymousClass11() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(nf.a aVar) {
                if (aVar.h0() == nf.b.NULL) {
                    aVar.S();
                    return null;
                }
                try {
                    return Long.valueOf(aVar.O());
                } catch (NumberFormatException e10) {
                    throw new r(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, Number number) {
                cVar.i0(number);
            }
        };
        f12901u = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            AnonymousClass12() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(nf.a aVar) {
                if (aVar.h0() != nf.b.NULL) {
                    return Float.valueOf((float) aVar.H());
                }
                aVar.S();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, Number number) {
                cVar.i0(number);
            }
        };
        f12902v = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            AnonymousClass13() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(nf.a aVar) {
                if (aVar.h0() != nf.b.NULL) {
                    return Double.valueOf(aVar.H());
                }
                aVar.S();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, Number number) {
                cVar.i0(number);
            }
        };
        AnonymousClass14 anonymousClass14 = new TypeAdapter<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            AnonymousClass14() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Character read(nf.a aVar) {
                if (aVar.h0() == nf.b.NULL) {
                    aVar.S();
                    return null;
                }
                String a02 = aVar.a0();
                if (a02.length() == 1) {
                    return Character.valueOf(a02.charAt(0));
                }
                throw new r("Expecting character, got: " + a02 + "; at " + aVar.o());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, Character ch2) {
                cVar.j0(ch2 == null ? null : String.valueOf(ch2));
            }
        };
        f12903w = anonymousClass14;
        f12904x = b(Character.TYPE, Character.class, anonymousClass14);
        AnonymousClass15 anonymousClass15 = new TypeAdapter<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            AnonymousClass15() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public String read(nf.a aVar) {
                nf.b h02 = aVar.h0();
                if (h02 != nf.b.NULL) {
                    return h02 == nf.b.BOOLEAN ? Boolean.toString(aVar.E()) : aVar.a0();
                }
                aVar.S();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, String str) {
                cVar.j0(str);
            }
        };
        f12905y = anonymousClass15;
        f12906z = new TypeAdapter<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            AnonymousClass16() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public BigDecimal read(nf.a aVar) {
                if (aVar.h0() == nf.b.NULL) {
                    aVar.S();
                    return null;
                }
                String a02 = aVar.a0();
                try {
                    return new BigDecimal(a02);
                } catch (NumberFormatException e10) {
                    throw new r("Failed parsing '" + a02 + "' as BigDecimal; at path " + aVar.o(), e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, BigDecimal bigDecimal) {
                cVar.i0(bigDecimal);
            }
        };
        A = new TypeAdapter<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            AnonymousClass17() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public BigInteger read(nf.a aVar) {
                if (aVar.h0() == nf.b.NULL) {
                    aVar.S();
                    return null;
                }
                String a02 = aVar.a0();
                try {
                    return new BigInteger(a02);
                } catch (NumberFormatException e10) {
                    throw new r("Failed parsing '" + a02 + "' as BigInteger; at path " + aVar.o(), e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, BigInteger bigInteger) {
                cVar.i0(bigInteger);
            }
        };
        B = new TypeAdapter<f>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            AnonymousClass18() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public f read(nf.a aVar) {
                if (aVar.h0() != nf.b.NULL) {
                    return new f(aVar.a0());
                }
                aVar.S();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, f fVar) {
                cVar.i0(fVar);
            }
        };
        C = a(String.class, anonymousClass15);
        AnonymousClass19 anonymousClass19 = new TypeAdapter<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            AnonymousClass19() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public StringBuilder read(nf.a aVar) {
                if (aVar.h0() != nf.b.NULL) {
                    return new StringBuilder(aVar.a0());
                }
                aVar.S();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, StringBuilder sb2) {
                cVar.j0(sb2 == null ? null : sb2.toString());
            }
        };
        D = anonymousClass19;
        E = a(StringBuilder.class, anonymousClass19);
        AnonymousClass20 anonymousClass20 = new TypeAdapter<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            AnonymousClass20() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public StringBuffer read(nf.a aVar) {
                if (aVar.h0() != nf.b.NULL) {
                    return new StringBuffer(aVar.a0());
                }
                aVar.S();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, StringBuffer stringBuffer) {
                cVar.j0(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        F = anonymousClass20;
        G = a(StringBuffer.class, anonymousClass20);
        AnonymousClass21 anonymousClass21 = new TypeAdapter<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            AnonymousClass21() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public URL read(nf.a aVar) {
                if (aVar.h0() == nf.b.NULL) {
                    aVar.S();
                    return null;
                }
                String a02 = aVar.a0();
                if ("null".equals(a02)) {
                    return null;
                }
                return new URL(a02);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, URL url) {
                cVar.j0(url == null ? null : url.toExternalForm());
            }
        };
        H = anonymousClass21;
        I = a(URL.class, anonymousClass21);
        AnonymousClass22 anonymousClass22 = new TypeAdapter<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            AnonymousClass22() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public URI read(nf.a aVar) {
                if (aVar.h0() == nf.b.NULL) {
                    aVar.S();
                    return null;
                }
                try {
                    String a02 = aVar.a0();
                    if ("null".equals(a02)) {
                        return null;
                    }
                    return new URI(a02);
                } catch (URISyntaxException e10) {
                    throw new k(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, URI uri) {
                cVar.j0(uri == null ? null : uri.toASCIIString());
            }
        };
        J = anonymousClass22;
        K = a(URI.class, anonymousClass22);
        AnonymousClass23 anonymousClass23 = new TypeAdapter<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            AnonymousClass23() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public InetAddress read(nf.a aVar) {
                if (aVar.h0() != nf.b.NULL) {
                    return InetAddress.getByName(aVar.a0());
                }
                aVar.S();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, InetAddress inetAddress) {
                cVar.j0(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        L = anonymousClass23;
        M = d(InetAddress.class, anonymousClass23);
        AnonymousClass24 anonymousClass24 = new TypeAdapter<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            AnonymousClass24() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public UUID read(nf.a aVar) {
                if (aVar.h0() == nf.b.NULL) {
                    aVar.S();
                    return null;
                }
                String a02 = aVar.a0();
                try {
                    return UUID.fromString(a02);
                } catch (IllegalArgumentException e10) {
                    throw new r("Failed parsing '" + a02 + "' as UUID; at path " + aVar.o(), e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, UUID uuid) {
                cVar.j0(uuid == null ? null : uuid.toString());
            }
        };
        N = anonymousClass24;
        O = a(UUID.class, anonymousClass24);
        TypeAdapter<Currency> nullSafe6 = new TypeAdapter<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            AnonymousClass25() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Currency read(nf.a aVar) {
                String a02 = aVar.a0();
                try {
                    return Currency.getInstance(a02);
                } catch (IllegalArgumentException e10) {
                    throw new r("Failed parsing '" + a02 + "' as Currency; at path " + aVar.o(), e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, Currency currency) {
                cVar.j0(currency.getCurrencyCode());
            }
        }.nullSafe();
        P = nullSafe6;
        Q = a(Currency.class, nullSafe6);
        AnonymousClass26 anonymousClass26 = new TypeAdapter<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            AnonymousClass26() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Calendar read(nf.a aVar) {
                if (aVar.h0() == nf.b.NULL) {
                    aVar.S();
                    return null;
                }
                aVar.b();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (aVar.h0() != nf.b.END_OBJECT) {
                    String Q2 = aVar.Q();
                    int I2 = aVar.I();
                    if ("year".equals(Q2)) {
                        i10 = I2;
                    } else if ("month".equals(Q2)) {
                        i11 = I2;
                    } else if ("dayOfMonth".equals(Q2)) {
                        i12 = I2;
                    } else if ("hourOfDay".equals(Q2)) {
                        i13 = I2;
                    } else if ("minute".equals(Q2)) {
                        i14 = I2;
                    } else if ("second".equals(Q2)) {
                        i15 = I2;
                    }
                }
                aVar.j();
                return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, Calendar calendar) {
                if (calendar == null) {
                    cVar.B();
                    return;
                }
                cVar.f();
                cVar.r("year");
                cVar.c0(calendar.get(1));
                cVar.r("month");
                cVar.c0(calendar.get(2));
                cVar.r("dayOfMonth");
                cVar.c0(calendar.get(5));
                cVar.r("hourOfDay");
                cVar.c0(calendar.get(11));
                cVar.r("minute");
                cVar.c0(calendar.get(12));
                cVar.r("second");
                cVar.c0(calendar.get(13));
                cVar.j();
            }
        };
        R = anonymousClass26;
        S = c(Calendar.class, GregorianCalendar.class, anonymousClass26);
        AnonymousClass27 anonymousClass27 = new TypeAdapter<Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            AnonymousClass27() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Locale read(nf.a aVar) {
                if (aVar.h0() == nf.b.NULL) {
                    aVar.S();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.a0(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, Locale locale) {
                cVar.j0(locale == null ? null : locale.toString());
            }
        };
        T = anonymousClass27;
        U = a(Locale.class, anonymousClass27);
        AnonymousClass28 anonymousClass28 = new TypeAdapter<j>() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            AnonymousClass28() {
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public j read(nf.a aVar) {
                if (aVar instanceof com.google.gson.internal.bind.a) {
                    return ((com.google.gson.internal.bind.a) aVar).R0();
                }
                switch (a.f12925a[aVar.h0().ordinal()]) {
                    case 1:
                        return new o(new f(aVar.a0()));
                    case 2:
                        return new o(aVar.a0());
                    case 3:
                        return new o(Boolean.valueOf(aVar.E()));
                    case 4:
                        aVar.S();
                        return l.f13006a;
                    case 5:
                        g gVar = new g();
                        aVar.a();
                        while (aVar.q()) {
                            gVar.p(read(aVar));
                        }
                        aVar.i();
                        return gVar;
                    case 6:
                        m mVar = new m();
                        aVar.b();
                        while (aVar.q()) {
                            mVar.p(aVar.Q(), read(aVar));
                        }
                        aVar.j();
                        return mVar;
                    default:
                        throw new IllegalArgumentException();
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(c cVar, j jVar) {
                if (jVar == null || jVar.m()) {
                    cVar.B();
                    return;
                }
                if (jVar.o()) {
                    o f10 = jVar.f();
                    if (f10.v()) {
                        cVar.i0(f10.s());
                        return;
                    } else if (f10.t()) {
                        cVar.m0(f10.p());
                        return;
                    } else {
                        cVar.j0(f10.k());
                        return;
                    }
                }
                if (jVar.l()) {
                    cVar.e();
                    Iterator<j> it = jVar.c().iterator();
                    while (it.hasNext()) {
                        write(cVar, it.next());
                    }
                    cVar.i();
                    return;
                }
                if (!jVar.n()) {
                    throw new IllegalArgumentException("Couldn't write " + jVar.getClass());
                }
                cVar.f();
                for (Map.Entry<String, j> entry : jVar.d().q()) {
                    cVar.r(entry.getKey());
                    write(cVar, entry.getValue());
                }
                cVar.j();
            }
        };
        V = anonymousClass28;
        W = d(j.class, anonymousClass28);
        X = new v() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            AnonymousClass29() {
            }

            @Override // com.google.gson.v
            public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new EnumTypeAdapter(rawType);
            }
        };
    }

    public static <TT> v a(Class<TT> cls, TypeAdapter<TT> typeAdapter) {
        return new v() { // from class: com.google.gson.internal.bind.TypeAdapters.31

            /* renamed from: a */
            final /* synthetic */ Class f12909a;

            /* renamed from: b */
            final /* synthetic */ TypeAdapter f12910b;

            AnonymousClass31(Class cls2, TypeAdapter typeAdapter2) {
                r1 = cls2;
                r2 = typeAdapter2;
            }

            @Override // com.google.gson.v
            public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + r1.getName() + ",adapter=" + r2 + "]";
            }
        };
    }

    public static <TT> v b(Class<TT> cls, Class<TT> cls2, TypeAdapter<? super TT> typeAdapter) {
        return new v() { // from class: com.google.gson.internal.bind.TypeAdapters.32

            /* renamed from: a */
            final /* synthetic */ Class f12911a;

            /* renamed from: b */
            final /* synthetic */ Class f12912b;

            /* renamed from: c */
            final /* synthetic */ TypeAdapter f12913c;

            AnonymousClass32(Class cls3, Class cls22, TypeAdapter typeAdapter2) {
                r1 = cls3;
                r2 = cls22;
                r3 = typeAdapter2;
            }

            @Override // com.google.gson.v
            public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType == r1 || rawType == r2) {
                    return r3;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + r2.getName() + "+" + r1.getName() + ",adapter=" + r3 + "]";
            }
        };
    }

    public static <TT> v c(Class<TT> cls, Class<? extends TT> cls2, TypeAdapter<? super TT> typeAdapter) {
        return new v() { // from class: com.google.gson.internal.bind.TypeAdapters.33

            /* renamed from: a */
            final /* synthetic */ Class f12914a;

            /* renamed from: b */
            final /* synthetic */ Class f12915b;

            /* renamed from: c */
            final /* synthetic */ TypeAdapter f12916c;

            AnonymousClass33(Class cls3, Class cls22, TypeAdapter typeAdapter2) {
                r1 = cls3;
                r2 = cls22;
                r3 = typeAdapter2;
            }

            @Override // com.google.gson.v
            public <T> TypeAdapter<T> create(Gson gson, com.google.gson.reflect.a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType == r1 || rawType == r2) {
                    return r3;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + r1.getName() + "+" + r2.getName() + ",adapter=" + r3 + "]";
            }
        };
    }

    public static <T1> v d(Class<T1> cls, TypeAdapter<T1> typeAdapter) {
        return new v() { // from class: com.google.gson.internal.bind.TypeAdapters.34

            /* renamed from: a */
            final /* synthetic */ Class f12917a;

            /* renamed from: b */
            final /* synthetic */ TypeAdapter f12918b;

            /* renamed from: com.google.gson.internal.bind.TypeAdapters$34$1 */
            /* loaded from: classes2.dex */
            class AnonymousClass1<T1> extends TypeAdapter<T1> {

                /* renamed from: a */
                final /* synthetic */ Class f12919a;

                AnonymousClass1(Class rawType2) {
                    r2 = rawType2;
                }

                @Override // com.google.gson.TypeAdapter
                public T1 read(nf.a aVar2) {
                    T1 t12 = (T1) r2.read(aVar2);
                    if (t12 == null || r2.isInstance(t12)) {
                        return t12;
                    }
                    throw new r("Expected a " + r2.getName() + " but was " + t12.getClass().getName() + "; at path " + aVar2.o());
                }

                @Override // com.google.gson.TypeAdapter
                public void write(c cVar, T1 t12) {
                    r2.write(cVar, t12);
                }
            }

            AnonymousClass34(Class cls2, TypeAdapter typeAdapter2) {
                r1 = cls2;
                r2 = typeAdapter2;
            }

            @Override // com.google.gson.v
            public <T2> TypeAdapter<T2> create(Gson gson, com.google.gson.reflect.a<T2> aVar) {
                Class rawType2 = aVar.getRawType();
                if (r1.isAssignableFrom(rawType2)) {
                    return new TypeAdapter<T1>() { // from class: com.google.gson.internal.bind.TypeAdapters.34.1

                        /* renamed from: a */
                        final /* synthetic */ Class f12919a;

                        AnonymousClass1(Class rawType22) {
                            r2 = rawType22;
                        }

                        @Override // com.google.gson.TypeAdapter
                        public T1 read(nf.a aVar2) {
                            T1 t12 = (T1) r2.read(aVar2);
                            if (t12 == null || r2.isInstance(t12)) {
                                return t12;
                            }
                            throw new r("Expected a " + r2.getName() + " but was " + t12.getClass().getName() + "; at path " + aVar2.o());
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(c cVar, T1 t12) {
                            r2.write(cVar, t12);
                        }
                    };
                }
                return null;
            }

            public String toString() {
                return "Factory[typeHierarchy=" + r1.getName() + ",adapter=" + r2 + "]";
            }
        };
    }
}
