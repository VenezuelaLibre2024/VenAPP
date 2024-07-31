package androidx.security.crypto;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import androidx.collection.C0732b;
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
import p179jb.C9020l;
import p179jb.C9021m;
import p179jb.C9022n;
import p179jb.InterfaceC9009a;
import p179jb.InterfaceC9013e;
import p201kb.C9215a;
import p293pb.C10126b;
import p309qb.C10415a;
import p419wb.C12133e;

/* renamed from: androidx.security.crypto.a */
/* loaded from: classes.dex */
public final class SharedPreferencesC1419a implements SharedPreferences {

    /* renamed from: a */
    final SharedPreferences f6282a;

    /* renamed from: b */
    final CopyOnWriteArrayList<SharedPreferences.OnSharedPreferenceChangeListener> f6283b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    final String f6284c;

    /* renamed from: d */
    final String f6285d;

    /* renamed from: e */
    final InterfaceC9009a f6286e;

    /* renamed from: f */
    final InterfaceC9013e f6287f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.security.crypto.a$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6288a;

        static {
            int[] iArr = new int[c.values().length];
            f6288a = iArr;
            try {
                iArr[c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6288a[c.INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6288a[c.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6288a[c.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6288a[c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6288a[c.STRING_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: androidx.security.crypto.a$b */
    /* loaded from: classes.dex */
    private static final class b implements SharedPreferences.Editor {

        /* renamed from: a */
        private final SharedPreferencesC1419a f6289a;

        /* renamed from: b */
        private final SharedPreferences.Editor f6290b;

        /* renamed from: d */
        private final AtomicBoolean f6292d = new AtomicBoolean(false);

        /* renamed from: c */
        private final List<String> f6291c = new CopyOnWriteArrayList();

        b(SharedPreferencesC1419a sharedPreferencesC1419a, SharedPreferences.Editor editor) {
            this.f6289a = sharedPreferencesC1419a;
            this.f6290b = editor;
        }

        /* renamed from: a */
        private void m8130a() {
            if (this.f6292d.getAndSet(false)) {
                for (String str : this.f6289a.getAll().keySet()) {
                    if (!this.f6291c.contains(str) && !this.f6289a.m8129g(str)) {
                        this.f6290b.remove(this.f6289a.m8127d(str));
                    }
                }
            }
        }

        /* renamed from: b */
        private void m8131b() {
            Iterator<SharedPreferences.OnSharedPreferenceChangeListener> it = this.f6289a.f6283b.iterator();
            while (it.hasNext()) {
                SharedPreferences.OnSharedPreferenceChangeListener next = it.next();
                Iterator<String> it2 = this.f6291c.iterator();
                while (it2.hasNext()) {
                    next.onSharedPreferenceChanged(this.f6289a, it2.next());
                }
            }
        }

        /* renamed from: c */
        private void m8132c(String str, byte[] bArr) {
            if (this.f6289a.m8129g(str)) {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
            this.f6291c.add(str);
            if (str == null) {
                str = "__NULL__";
            }
            try {
                Pair<String, String> m8128e = this.f6289a.m8128e(str, bArr);
                this.f6290b.putString((String) m8128e.first, (String) m8128e.second);
            } catch (GeneralSecurityException e10) {
                throw new SecurityException("Could not encrypt data: " + e10.getMessage(), e10);
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            m8130a();
            this.f6290b.apply();
            m8131b();
            this.f6291c.clear();
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.f6292d.set(true);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            m8130a();
            try {
                return this.f6290b.commit();
            } finally {
                m8131b();
                this.f6291c.clear();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z10) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(c.BOOLEAN.m8135i());
            allocate.put(z10 ? (byte) 1 : (byte) 0);
            m8132c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f10) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.FLOAT.m8135i());
            allocate.putFloat(f10);
            m8132c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i10) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(c.INT.m8135i());
            allocate.putInt(i10);
            m8132c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j10) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(c.LONG.m8135i());
            allocate.putLong(j10);
            m8132c(str, allocate.array());
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
            allocate.putInt(c.STRING.m8135i());
            allocate.putInt(length);
            allocate.put(bytes);
            m8132c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new C0732b<>();
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
            allocate.putInt(c.STRING_SET.m8135i());
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            m8132c(str, allocate.array());
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            if (!this.f6289a.m8129g(str)) {
                this.f6290b.remove(this.f6289a.m8127d(str));
                this.f6291c.add(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.security.crypto.a$c */
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

        /* renamed from: h */
        public static c m8134h(int i10) {
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

        /* renamed from: i */
        public int m8135i() {
            return this.mId;
        }
    }

    /* renamed from: androidx.security.crypto.a$d */
    /* loaded from: classes.dex */
    public enum d {
        AES256_SIV("AES256_SIV");

        private final String mDeterministicAeadKeyTemplateName;

        d(String str) {
            this.mDeterministicAeadKeyTemplateName = str;
        }

        /* renamed from: h */
        C9020l m8137h() {
            return C9021m.m26459a(this.mDeterministicAeadKeyTemplateName);
        }
    }

    /* renamed from: androidx.security.crypto.a$e */
    /* loaded from: classes.dex */
    public enum e {
        AES256_GCM("AES256_GCM");

        private final String mAeadKeyTemplateName;

        e(String str) {
            this.mAeadKeyTemplateName = str;
        }

        /* renamed from: h */
        C9020l m8139h() {
            return C9021m.m26459a(this.mAeadKeyTemplateName);
        }
    }

    SharedPreferencesC1419a(String str, String str2, SharedPreferences sharedPreferences, InterfaceC9009a interfaceC9009a, InterfaceC9013e interfaceC9013e) {
        this.f6284c = str;
        this.f6282a = sharedPreferences;
        this.f6285d = str2;
        this.f6286e = interfaceC9009a;
        this.f6287f = interfaceC9013e;
    }

    /* renamed from: a */
    public static SharedPreferences m8123a(Context context, String str, C1421c c1421c, d dVar, e eVar) {
        return m8124b(str, c1421c.m8141a(), context, dVar, eVar);
    }

    @Deprecated
    /* renamed from: b */
    public static SharedPreferences m8124b(String str, String str2, Context context, d dVar, e eVar) {
        C10126b.m30251a();
        C9215a.m27404b();
        Context applicationContext = context.getApplicationContext();
        C9022n m31202d = new C10415a.b().m31214l(dVar.m8137h()).m31216n(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str).m31215m("android-keystore://" + str2).m31213f().m31202d();
        C9022n m31202d2 = new C10415a.b().m31214l(eVar.m8139h()).m31216n(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str).m31215m("android-keystore://" + str2).m31213f().m31202d();
        return new SharedPreferencesC1419a(str, str2, applicationContext.getSharedPreferences(str, 0), (InterfaceC9009a) m31202d2.m26475k(InterfaceC9009a.class), (InterfaceC9013e) m31202d.m26475k(InterfaceC9013e.class));
    }

    /* renamed from: f */
    private Object m8125f(String str) {
        if (m8129g(str)) {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
        if (str == null) {
            str = "__NULL__";
        }
        try {
            String m8127d = m8127d(str);
            String string = this.f6282a.getString(m8127d, null);
            if (string == null) {
                return null;
            }
            ByteBuffer wrap = ByteBuffer.wrap(this.f6286e.mo26425b(C12133e.m38872a(string, 0), m8127d.getBytes(StandardCharsets.UTF_8)));
            wrap.position(0);
            int i10 = wrap.getInt();
            c m8134h = c.m8134h(i10);
            if (m8134h == null) {
                throw new SecurityException("Unknown type ID for encrypted pref value: " + i10);
            }
            switch (a.f6288a[m8134h.ordinal()]) {
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
                    C0732b c0732b = new C0732b();
                    while (wrap.hasRemaining()) {
                        int i12 = wrap.getInt();
                        ByteBuffer slice2 = wrap.slice();
                        slice2.limit(i12);
                        wrap.position(wrap.position() + i12);
                        c0732b.add(StandardCharsets.UTF_8.decode(slice2).toString());
                    }
                    if (c0732b.size() == 1 && "__NULL__".equals(c0732b.m3668n(0))) {
                        return null;
                    }
                    return c0732b;
                default:
                    throw new SecurityException("Unhandled type for encrypted pref value: " + m8134h);
            }
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not decrypt value. " + e10.getMessage(), e10);
        }
    }

    /* renamed from: c */
    String m8126c(String str) {
        try {
            String str2 = new String(this.f6287f.mo26432b(C12133e.m38872a(str, 0), this.f6284c.getBytes()), StandardCharsets.UTF_8);
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
        if (!m8129g(str)) {
            return this.f6282a.contains(m8127d(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    /* renamed from: d */
    String m8127d(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return C12133e.m38875d(this.f6287f.mo26431a(str.getBytes(StandardCharsets.UTF_8), this.f6284c.getBytes()));
        } catch (GeneralSecurityException e10) {
            throw new SecurityException("Could not encrypt key. " + e10.getMessage(), e10);
        }
    }

    /* renamed from: e */
    Pair<String, String> m8128e(String str, byte[] bArr) {
        String m8127d = m8127d(str);
        return new Pair<>(m8127d, C12133e.m38875d(this.f6286e.mo26424a(bArr, m8127d.getBytes(StandardCharsets.UTF_8))));
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new b(this, this.f6282a.edit());
    }

    /* renamed from: g */
    boolean m8129g(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : this.f6282a.getAll().entrySet()) {
            if (!m8129g(entry.getKey())) {
                String m8126c = m8126c(entry.getKey());
                hashMap.put(m8126c, m8125f(m8126c));
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z10) {
        Object m8125f = m8125f(str);
        return m8125f instanceof Boolean ? ((Boolean) m8125f).booleanValue() : z10;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f10) {
        Object m8125f = m8125f(str);
        return m8125f instanceof Float ? ((Float) m8125f).floatValue() : f10;
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i10) {
        Object m8125f = m8125f(str);
        return m8125f instanceof Integer ? ((Integer) m8125f).intValue() : i10;
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j10) {
        Object m8125f = m8125f(str);
        return m8125f instanceof Long ? ((Long) m8125f).longValue() : j10;
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object m8125f = m8125f(str);
        return m8125f instanceof String ? (String) m8125f : str2;
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        Object m8125f = m8125f(str);
        Set<String> c0732b = m8125f instanceof Set ? (Set) m8125f : new C0732b<>();
        return c0732b.size() > 0 ? c0732b : set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f6283b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f6283b.remove(onSharedPreferenceChangeListener);
    }
}
