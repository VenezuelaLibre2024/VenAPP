package androidx.security.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import jb.l;
import jb.m;
import jb.n;
import qb.a;

/* loaded from: classes.dex */
public final class a implements SharedPreferences {

    /* renamed from: a */
    final SharedPreferences f5457a;

    /* renamed from: b */
    final CopyOnWriteArrayList<SharedPreferences.OnSharedPreferenceChangeListener> f5458b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    final String f5459c;

    /* renamed from: d */
    final String f5460d;

    /* renamed from: e */
    final jb.a f5461e;

    /* renamed from: f */
    final jb.e f5462f;

    /* renamed from: androidx.security.crypto.a$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0084a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5463a;

        static {
            int[] iArr = new int[c.values().length];
            f5463a = iArr;
            try {
                iArr[c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5463a[c.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5463a[c.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5463a[c.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5463a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5463a[c.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements SharedPreferences.Editor {

        /* renamed from: a */
        private final a f5464a;

        /* renamed from: b */
        private final SharedPreferences.Editor f5465b;

        /* renamed from: d */
        private final AtomicBoolean f5467d = new AtomicBoolean(false);

        /* renamed from: c */
        private final List<String> f5466c = new CopyOnWriteArrayList();

        b(a aVar, SharedPreferences.Editor editor) {
            this.f5464a = aVar;
            this.f5465b = editor;
        }

        private void a() {
            if (this.f5467d.getAndSet(false)) {
                for (String str : this.f5464a.getAll().keySet()) {
                    if (!this.f5466c.contains(str) && !this.f5464a.g(str)) {
                        this.f5465b.remove(this.f5464a.d(str));
                    }
                }
            }
        }

        private void b() {
            Iterator<SharedPreferences.OnSharedPreferenceChangeListener> it = this.f5464a.f5458b.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener next = it.next();
                Iterator<String> it2 = this.f5466c.iterator();
                while (it2.hasNext()) {
                    next.onSharedPreferenceChanged(this.f5464a, it2.next());
                }
            }
        }

        private void c(String str, byte[] bArr) {
            if (this.f5464a.g(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.f5466c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                Pair<String, String> e10 = this.f5464a.e(str, bArr);
                this.f5465b.putString((String) e10.first, (String) e10.second);
            } catch (GeneralSecurityException e11) {
                throw new SecurityException("Could not encrypt data: " + e11.getMessage(), e11);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            a();
            this.f5465b.apply();
            b();
            this.f5466c.clear();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f5467d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            a();
            try {
                return this.f5465b.commit();
            } finally {
                b();
                this.f5466c.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z10) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(c.BOOLEAN.i());
            allocate.put(z10 ? (byte) 1 : (byte) 0);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f10) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.FLOAT.i());
            allocate.putFloat(f10);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i10) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.INT.i());
            allocate.putInt(i10);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j10) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(c.LONG.i());
            allocate.putLong(j10);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(c.STRING.i());
            allocate.putInt(length);
            allocate.put(bytes);
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new androidx.collection.b<>();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList(set.size());
            int size = set.size() * 4;
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                byte[] bytes = it.next().getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes);
                size += bytes.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(c.STRING_SET.i());
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.f5464a.g(str)) {
                this.f5465b.remove(this.f5464a.d(str));
                this.f5466c.add(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);

        private final int mId;

        c(int i10) {
            this.mId = i10;
        }

        public static c h(int i10) {
            if (i10 == 0) {
                return STRING;
            }
            if (i10 == 1) {
                return STRING_SET;
            }
            if (i10 == 2) {
                return INT;
            }
            if (i10 == 3) {
                return LONG;
            }
            if (i10 == 4) {
                return FLOAT;
            }
            if (i10 != 5) {
                return null;
            }
            return BOOLEAN;
        }

        public int i() {
            return this.mId;
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        AES256_SIV("AES256_SIV");

        private final String mDeterministicAeadKeyTemplateName;

        d(String str) {
            this.mDeterministicAeadKeyTemplateName = str;
        }

        l h() {
            return m.a(this.mDeterministicAeadKeyTemplateName);
        }
    }

    /* loaded from: classes.dex */
    public enum e {
        AES256_GCM("AES256_GCM");

        private final String mAeadKeyTemplateName;

        e(String str) {
            this.mAeadKeyTemplateName = str;
        }

        l h() {
            return m.a(this.mAeadKeyTemplateName);
        }
    }

    a(String str, String str2, SharedPreferences sharedPreferences, jb.a aVar, jb.e eVar) {
        this.f5459c = str;
        this.f5457a = sharedPreferences;
        this.f5460d = str2;
        this.f5461e = aVar;
        this.f5462f = eVar;
    }

    public static SharedPreferences a(Context context, String str, androidx.security.crypto.c cVar, d dVar, e eVar) {
        return b(str, cVar.a(), context, dVar, eVar);
    }

    @Deprecated
    public static SharedPreferences b(String str, String str2, Context context, d dVar, e eVar) {
        pb.b.a();
        kb.a.b();
        Context applicationContext = context.getApplicationContext();
        n d10 = new a.b().l(dVar.h()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str).m("android-keystore://" + str2).f().d();
        n d11 = new a.b().l(eVar.h()).n(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str).m("android-keystore://" + str2).f().d();
        return new a(str, str2, applicationContext.getSharedPreferences(str, 0), (jb.a) d11.k(jb.a.class), (jb.e) d10.k(jb.e.class));
    }

    private Object f(String str) {
        if (g(str)) {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String d10 = d(str);
            String string = this.f5457a.getString(d10, null);
            if (string == null) {
                return null;
            }
            ByteBuffer wrap = ByteBuffer.wrap(this.f5461e.b(wb.e.a(string, 0), d10.getBytes(StandardCharsets.UTF_8)));
            wrap.position(0);
            int i10 = wrap.getInt();
            c h10 = c.h(i10);
            if (h10 == null) {
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i10);
            }
            switch (C0084a.f5463a[h10.ordinal()]) {
                case 1:
                    int i11 = wrap.getInt();
                    ByteBuffer slice = wrap.slice();
                    wrap.limit(i11);
                    String charBuffer = StandardCharsets.UTF_8.decode(slice).toString();
                    if (charBuffer.equals("__NULL__")) {
                        return null;
                    }
                    return charBuffer;
                case 2:
                    return Integer.valueOf(wrap.getInt());
                case 3:
                    return Long.valueOf(wrap.getLong());
                case 4:
                    return Float.valueOf(wrap.getFloat());
                case 5:
                    return Boolean.valueOf(wrap.get() != 0);
                case 6:
                    androidx.collection.b bVar = new androidx.collection.b();
                    while (wrap.hasRemaining()) {
                        int i12 = wrap.getInt();
                        ByteBuffer slice2 = wrap.slice();
                        slice2.limit(i12);
                        wrap.position(wrap.position() + i12);
                        bVar.add(StandardCharsets.UTF_8.decode(slice2).toString());
                    }
                    if (bVar.size() == 1 && "__NULL__".equals(bVar.n(0))) {
                        return null;
                    }
                    return bVar;
                default:
                    throw new SecurityException("Unhandled type for encrypted pref value: " + h10);
            }
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not decrypt value. " + e10.getMessage(), e10);
        }
    }

    String c(String str) {
        try {
            String str2 = new String(this.f5462f.b(wb.e.a(str, 0), this.f5459c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not decrypt key. " + e10.getMessage(), e10);
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        if (!g(str)) {
            return this.f5457a.contains(d(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    String d(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return wb.e.d(this.f5462f.a(str.getBytes(StandardCharsets.UTF_8), this.f5459c.getBytes()));
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not encrypt key. " + e10.getMessage(), e10);
        }
    }

    Pair<String, String> e(String str, byte[] bArr) {
        String d10 = d(str);
        return new Pair<>(d10, wb.e.d(this.f5461e.a(bArr, d10.getBytes(StandardCharsets.UTF_8))));
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new b(this, this.f5457a.edit());
    }

    boolean g(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.f5457a.getAll().entrySet()) {
            if (!g(entry.getKey())) {
                String c10 = c(entry.getKey());
                hashMap.put(c10, f(c10));
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z10) {
        Object f10 = f(str);
        return f10 instanceof Boolean ? ((Boolean) f10).booleanValue() : z10;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f10) {
        Object f11 = f(str);
        return f11 instanceof Float ? ((Float) f11).floatValue() : f10;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i10) {
        Object f10 = f(str);
        return f10 instanceof Integer ? ((Integer) f10).intValue() : i10;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j10) {
        Object f10 = f(str);
        return f10 instanceof Long ? ((Long) f10).longValue() : j10;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object f10 = f(str);
        return f10 instanceof String ? (String) f10 : str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Object f10 = f(str);
        Set<String> bVar = f10 instanceof Set ? (Set) f10 : new androidx.collection.b<>();
        return bVar.size() > 0 ? bVar : set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f5458b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f5458b.remove(onSharedPreferenceChangeListener);
    }
}
