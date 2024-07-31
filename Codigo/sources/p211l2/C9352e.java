package p211l2;

import android.os.Build;
import androidx.work.C1522b;
import androidx.work.impl.InterfaceC1579t;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.List;
import kotlin.jvm.internal.C9322n;
import p094f2.C7269b;
import p192k2.C9132u;

/* renamed from: l2.e */
/* loaded from: classes.dex */
public final class C9352e {
    /* renamed from: a */
    public static final C9132u m27854a(C9132u workSpec) {
        C9132u m26894d;
        C9322n.m27781e(workSpec, "workSpec");
        C7269b c7269b = workSpec.f22014j;
        String str = workSpec.f22007c;
        if (C9322n.m27777a(str, ConstraintTrackingWorker.class.getName())) {
            return workSpec;
        }
        if (!c7269b.m21746f() && !c7269b.m21749i()) {
            return workSpec;
        }
        C1522b m8538a = new C1522b.a().m8540c(workSpec.f22009e).m8545h("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str).m8538a();
        C9322n.m27780d(m8538a, "Builder().putAll(workSpe…ame)\n            .build()");
        String name = ConstraintTrackingWorker.class.getName();
        C9322n.m27780d(name, "name");
        m26894d = workSpec.m26894d((r45 & 1) != 0 ? workSpec.f22005a : null, (r45 & 2) != 0 ? workSpec.f22006b : null, (r45 & 4) != 0 ? workSpec.f22007c : name, (r45 & 8) != 0 ? workSpec.f22008d : null, (r45 & 16) != 0 ? workSpec.f22009e : m8538a, (r45 & 32) != 0 ? workSpec.f22010f : null, (r45 & 64) != 0 ? workSpec.f22011g : 0L, (r45 & RecognitionOptions.ITF) != 0 ? workSpec.f22012h : 0L, (r45 & RecognitionOptions.QR_CODE) != 0 ? workSpec.f22013i : 0L, (r45 & RecognitionOptions.UPC_A) != 0 ? workSpec.f22014j : null, (r45 & RecognitionOptions.UPC_E) != 0 ? workSpec.f22015k : 0, (r45 & RecognitionOptions.PDF417) != 0 ? workSpec.f22016l : null, (r45 & RecognitionOptions.AZTEC) != 0 ? workSpec.f22017m : 0L, (r45 & 8192) != 0 ? workSpec.f22018n : 0L, (r45 & 16384) != 0 ? workSpec.f22019o : 0L, (r45 & RecognitionOptions.TEZ_CODE) != 0 ? workSpec.f22020p : 0L, (r45 & 65536) != 0 ? workSpec.f22021q : false, (131072 & r45) != 0 ? workSpec.f22022r : null, (r45 & 262144) != 0 ? workSpec.f22023s : 0, (r45 & 524288) != 0 ? workSpec.f22024t : 0);
        return m26894d;
    }

    /* renamed from: b */
    public static final C9132u m27855b(List<? extends InterfaceC1579t> schedulers, C9132u workSpec) {
        C9322n.m27781e(schedulers, "schedulers");
        C9322n.m27781e(workSpec, "workSpec");
        return Build.VERSION.SDK_INT < 26 ? m27854a(workSpec) : workSpec;
    }
}
