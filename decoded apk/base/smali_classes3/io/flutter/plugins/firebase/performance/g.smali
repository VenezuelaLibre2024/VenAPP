.class public final synthetic Lio/flutter/plugins/firebase/performance/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/flutter/plugin/common/MethodCall;

.field public final synthetic b:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/common/MethodCall;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/performance/g;->a:Lio/flutter/plugin/common/MethodCall;

    iput-object p2, p0, Lio/flutter/plugins/firebase/performance/g;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/performance/g;->a:Lio/flutter/plugin/common/MethodCall;

    iget-object v1, p0, Lio/flutter/plugins/firebase/performance/g;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/performance/FlutterFirebasePerformancePlugin;->f(Lio/flutter/plugin/common/MethodCall;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
