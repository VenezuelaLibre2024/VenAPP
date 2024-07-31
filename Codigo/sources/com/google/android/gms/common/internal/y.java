package com.google.android.gms.common.internal;

import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.RestrictedInheritance;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", explanation = "Use canonical fakes instead.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes.dex */
public interface y {
    Task<Void> a(w wVar);
}
