package p367te;

import android.content.Context;
import com.google.firebase.perf.util.EnumC6328b;
import com.google.firebase.perf.util.EnumC6329c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p444xe.C12476i;
import re.C10696a;

/* renamed from: te.e */
/* loaded from: classes.dex */
public abstract class AbstractC11251e {
    /* renamed from: a */
    private static List<AbstractC11251e> m35158a(C12476i c12476i, Context context) {
        ArrayList arrayList = new ArrayList();
        if (c12476i.mo40677m()) {
            arrayList.add(new C11250d(c12476i.mo40678p()));
        }
        if (c12476i.mo40675j()) {
            arrayList.add(new C11249c(c12476i.mo40676k(), context));
        }
        if (c12476i.m40673h0()) {
            arrayList.add(new C11247a(c12476i.m40672g0()));
        }
        if (c12476i.mo40674i()) {
            arrayList.add(new C11248b(c12476i.mo40679q()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m35159b(C12476i c12476i, Context context) {
        List<AbstractC11251e> m35158a = m35158a(c12476i, context);
        if (m35158a.isEmpty()) {
            C10696a.m32565e().m32566a("No validators found for PerfMetric.");
            return false;
        }
        Iterator<AbstractC11251e> it = m35158a.iterator();
        while (it.hasNext()) {
            if (!it.next().mo35134c()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static void m35160d(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Attribute key must not be null or empty");
        }
        if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        }
        if (str.length() > 40) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute key length must not exceed %d characters", 40));
        }
        if (str2.length() > 100) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute value length must not exceed %d characters", 100));
        }
        if (!str.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
            throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
        }
    }

    /* renamed from: e */
    public static String m35161e(String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (EnumC6328b enumC6328b : EnumC6328b.values()) {
            if (enumC6328b.toString().equals(str)) {
                return null;
            }
        }
        return "Metric name must not start with '_'";
    }

    /* renamed from: f */
    public static String m35162f(String str) {
        if (str == null) {
            return "Trace name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Trace name must not exceed %d characters", 100);
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (EnumC6329c enumC6329c : EnumC6329c.values()) {
            if (enumC6329c.toString().equals(str)) {
                return null;
            }
        }
        if (str.startsWith("_st_")) {
            return null;
        }
        return "Trace name must not start with '_'";
    }

    /* renamed from: c */
    public abstract boolean mo35134c();
}
