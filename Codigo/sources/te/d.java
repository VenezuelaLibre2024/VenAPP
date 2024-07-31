package te;

import java.util.Iterator;
import java.util.Map;
import xe.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    private static final re.a f26882b = re.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final m f26883a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(m mVar) {
        this.f26883a = mVar;
    }

    private boolean g(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                e.d(entry.getKey(), entry.getValue());
            } catch (IllegalArgumentException e10) {
                f26882b.j(e10.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    private boolean h(m mVar) {
        return i(mVar, 0);
    }

    private boolean i(m mVar, int i10) {
        re.a aVar;
        StringBuilder sb2;
        String sb3;
        if (mVar == null) {
            return false;
        }
        if (i10 <= 1) {
            for (Map.Entry<String, Long> entry : mVar.t0().entrySet()) {
                if (!l(entry.getKey())) {
                    aVar = f26882b;
                    sb2 = new StringBuilder();
                    sb2.append("invalid CounterId:");
                    sb2.append(entry.getKey());
                } else if (!m(entry.getValue())) {
                    aVar = f26882b;
                    sb2 = new StringBuilder();
                    sb2.append("invalid CounterValue:");
                    sb2.append(entry.getValue());
                }
                sb3 = sb2.toString();
            }
            Iterator<m> it = mVar.B0().iterator();
            while (it.hasNext()) {
                if (!i(it.next(), i10 + 1)) {
                    return false;
                }
            }
            return true;
        }
        aVar = f26882b;
        sb3 = "Exceed MAX_SUBTRACE_DEEP:1";
        aVar.j(sb3);
        return false;
    }

    private boolean j(m mVar) {
        if (mVar.s0() > 0) {
            return true;
        }
        Iterator<m> it = mVar.B0().iterator();
        while (it.hasNext()) {
            if (it.next().s0() > 0) {
                return true;
            }
        }
        return false;
    }

    private boolean k(m mVar) {
        return mVar.z0().startsWith("_st_");
    }

    private boolean l(String str) {
        re.a aVar;
        String str2;
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            aVar = f26882b;
            str2 = "counterId is empty";
        } else {
            if (trim.length() <= 100) {
                return true;
            }
            aVar = f26882b;
            str2 = "counterId exceeded max length 100";
        }
        aVar.j(str2);
        return false;
    }

    private boolean m(Long l10) {
        return l10 != null;
    }

    private boolean n(m mVar) {
        Long l10 = mVar.t0().get(com.google.firebase.perf.util.b.FRAMES_TOTAL.toString());
        return l10 != null && l10.compareTo((Long) 0L) > 0;
    }

    private boolean o(m mVar, int i10) {
        if (mVar == null) {
            f26882b.j("TraceMetric is null");
            return false;
        }
        if (i10 > 1) {
            f26882b.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        if (!q(mVar.z0())) {
            f26882b.j("invalid TraceId:" + mVar.z0());
            return false;
        }
        if (!p(mVar)) {
            f26882b.j("invalid TraceDuration:" + mVar.w0());
            return false;
        }
        if (!mVar.C0()) {
            f26882b.j("clientStartTimeUs is null.");
            return false;
        }
        if (!k(mVar) || n(mVar)) {
            Iterator<m> it = mVar.B0().iterator();
            while (it.hasNext()) {
                if (!o(it.next(), i10 + 1)) {
                    return false;
                }
            }
            return g(mVar.u0());
        }
        f26882b.j("non-positive totalFrames in screen trace " + mVar.z0());
        return false;
    }

    private boolean p(m mVar) {
        return mVar != null && mVar.w0() > 0;
    }

    private boolean q(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        return !trim.isEmpty() && trim.length() <= 100;
    }

    @Override // te.e
    public boolean c() {
        re.a aVar;
        StringBuilder sb2;
        String str;
        if (!o(this.f26883a, 0)) {
            aVar = f26882b;
            sb2 = new StringBuilder();
            str = "Invalid Trace:";
        } else {
            if (!j(this.f26883a) || h(this.f26883a)) {
                return true;
            }
            aVar = f26882b;
            sb2 = new StringBuilder();
            str = "Invalid Counters for Trace:";
        }
        sb2.append(str);
        sb2.append(this.f26883a.z0());
        aVar.j(sb2.toString());
        return false;
    }
}
