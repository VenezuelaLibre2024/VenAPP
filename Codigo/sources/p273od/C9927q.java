package p273od;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: od.q */
/* loaded from: classes.dex */
public class C9927q {

    /* renamed from: a */
    private final SharedPreferences f24450a;

    public C9927q(Context context, String str) {
        this.f24450a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* renamed from: a */
    private synchronized void m29647a() {
        long j10 = this.f24450a.getLong("fire-count", 0L);
        String str = "";
        String str2 = null;
        for (Map.Entry<String, ?> entry : this.f24450a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str3 : (Set) entry.getValue()) {
                    if (str2 == null || str2.compareTo(str3) > 0) {
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f24450a.getStringSet(str, new HashSet()));
        hashSet.remove(str2);
        this.f24450a.edit().putStringSet(str, hashSet).putLong("fire-count", j10 - 1).commit();
    }

    /* renamed from: d */
    private synchronized String m29648d(long j10) {
        Instant instant;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j10));
        }
        instant = new Date(j10).toInstant();
        zoneOffset = ZoneOffset.UTC;
        atOffset = instant.atOffset(zoneOffset);
        localDateTime = atOffset.toLocalDateTime();
        dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        format = localDateTime.format(dateTimeFormatter);
        return format;
    }

    /* renamed from: e */
    private synchronized String m29649e(String str) {
        for (Map.Entry<String, ?> entry : this.f24450a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: h */
    private synchronized void m29650h(String str) {
        String m29649e = m29649e(str);
        if (m29649e == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.f24450a.getStringSet(m29649e, new HashSet()));
        hashSet.remove(str);
        (hashSet.isEmpty() ? this.f24450a.edit().remove(m29649e) : this.f24450a.edit().putStringSet(m29649e, hashSet)).commit();
    }

    /* renamed from: m */
    private synchronized void m29651m(String str, String str2) {
        m29650h(str2);
        HashSet hashSet = new HashSet(this.f24450a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f24450a.edit().putStringSet(str, hashSet).commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void m29652b() {
        SharedPreferences.Editor edit = this.f24450a.edit();
        int i10 = 0;
        for (Map.Entry<String, ?> entry : this.f24450a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Set set = (Set) entry.getValue();
                String m29648d = m29648d(System.currentTimeMillis());
                String key = entry.getKey();
                if (set.contains(m29648d)) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(m29648d);
                    i10++;
                    edit.putStringSet(key, hashSet);
                } else {
                    edit.remove(key);
                }
            }
        }
        if (i10 == 0) {
            edit.remove("fire-count");
        } else {
            edit.putLong("fire-count", i10);
        }
        edit.commit();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized List<AbstractC9928r> m29653c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f24450a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                HashSet hashSet = new HashSet((Set) entry.getValue());
                hashSet.remove(m29648d(System.currentTimeMillis()));
                if (!hashSet.isEmpty()) {
                    arrayList.add(AbstractC9928r.m29660a(entry.getKey(), new ArrayList(hashSet)));
                }
            }
        }
        m29659l(System.currentTimeMillis());
        return arrayList;
    }

    /* renamed from: f */
    synchronized boolean m29654f(long j10, long j11) {
        return m29648d(j10).equals(m29648d(j11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public synchronized void m29655g() {
        String m29648d = m29648d(System.currentTimeMillis());
        this.f24450a.edit().putString("last-used-date", m29648d).commit();
        m29650h(m29648d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public synchronized boolean m29656i(long j10) {
        return m29657j("fire-global", j10);
    }

    /* renamed from: j */
    synchronized boolean m29657j(String str, long j10) {
        if (!this.f24450a.contains(str)) {
            this.f24450a.edit().putLong(str, j10).commit();
            return true;
        }
        if (m29654f(this.f24450a.getLong(str, -1L), j10)) {
            return false;
        }
        this.f24450a.edit().putLong(str, j10).commit();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized void m29658k(long j10, String str) {
        String m29648d = m29648d(j10);
        if (this.f24450a.getString("last-used-date", "").equals(m29648d)) {
            String m29649e = m29649e(m29648d);
            if (m29649e == null) {
                return;
            }
            if (m29649e.equals(str)) {
                return;
            }
            m29651m(str, m29648d);
            return;
        }
        long j11 = this.f24450a.getLong("fire-count", 0L);
        if (j11 + 1 == 30) {
            m29647a();
            j11 = this.f24450a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f24450a.getStringSet(str, new HashSet()));
        hashSet.add(m29648d);
        this.f24450a.edit().putStringSet(str, hashSet).putLong("fire-count", j11 + 1).putString("last-used-date", m29648d).commit();
    }

    /* renamed from: l */
    synchronized void m29659l(long j10) {
        this.f24450a.edit().putLong("fire-global", j10).commit();
    }
}
