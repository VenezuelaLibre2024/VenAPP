package l2;

import android.os.Build;
import androidx.work.b;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.List;

/* loaded from: classes.dex */
public final class e {
    public static final k2.u a(k2.u workSpec) {
        k2.u d10;
        kotlin.jvm.internal.n.e(workSpec, "workSpec");
        f2.b bVar = workSpec.f20232j;
        String str = workSpec.f20225c;
        if (kotlin.jvm.internal.n.a(str, ConstraintTrackingWorker.class.getName())) {
            return workSpec;
        }
        if (!bVar.f() && !bVar.i()) {
            return workSpec;
        }
        androidx.work.b a10 = new b.a().c(workSpec.f20227e).h("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str).a();
        kotlin.jvm.internal.n.d(a10, "Builder().putAll(workSpe…ame)\n            .build()");
        String name = ConstraintTrackingWorker.class.getName();
        kotlin.jvm.internal.n.d(name, "name");
        d10 = workSpec.d((r45 & 1) != 0 ? workSpec.f20223a : null, (r45 & 2) != 0 ? workSpec.f20224b : null, (r45 & 4) != 0 ? workSpec.f20225c : name, (r45 & 8) != 0 ? workSpec.f20226d : null, (r45 & 16) != 0 ? workSpec.f20227e : a10, (r45 & 32) != 0 ? workSpec.f20228f : null, (r45 & 64) != 0 ? workSpec.f20229g : 0L, (r45 & RecognitionOptions.ITF) != 0 ? workSpec.f20230h : 0L, (r45 & RecognitionOptions.QR_CODE) != 0 ? workSpec.f20231i : 0L, (r45 & RecognitionOptions.UPC_A) != 0 ? workSpec.f20232j : null, (r45 & RecognitionOptions.UPC_E) != 0 ? workSpec.f20233k : 0, (r45 & RecognitionOptions.PDF417) != 0 ? workSpec.f20234l : null, (r45 & RecognitionOptions.AZTEC) != 0 ? workSpec.f20235m : 0L, (r45 & 8192) != 0 ? workSpec.f20236n : 0L, (r45 & 16384) != 0 ? workSpec.f20237o : 0L, (r45 & RecognitionOptions.TEZ_CODE) != 0 ? workSpec.f20238p : 0L, (r45 & 65536) != 0 ? workSpec.f20239q : false, (131072 & r45) != 0 ? workSpec.f20240r : null, (r45 & 262144) != 0 ? workSpec.f20241s : 0, (r45 & 524288) != 0 ? workSpec.f20242t : 0);
        return d10;
    }

    public static final k2.u b(List<? extends androidx.work.impl.t> schedulers, k2.u workSpec) {
        kotlin.jvm.internal.n.e(schedulers, "schedulers");
        kotlin.jvm.internal.n.e(workSpec, "workSpec");
        return Build.VERSION.SDK_INT < 26 ? a(workSpec) : workSpec;
    }
}
