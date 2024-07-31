.class public final synthetic Lio/flutter/plugins/firebase/appcheck/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/firebase/appcheck/FlutterFirebaseAppCheckPlugin;

.field public final synthetic b:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/appcheck/FlutterFirebaseAppCheckPlugin;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/appcheck/f;->a:Lio/flutter/plugins/firebase/appcheck/FlutterFirebaseAppCheckPlugin;

    iput-object p2, p0, Lio/flutter/plugins/firebase/appcheck/f;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/appcheck/f;->a:Lio/flutter/plugins/firebase/appcheck/FlutterFirebaseAppCheckPlugin;

    iget-object v1, p0, Lio/flutter/plugins/firebase/appcheck/f;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-static {v0, v1, p1}, Lio/flutter/plugins/firebase/appcheck/FlutterFirebaseAppCheckPlugin;->a(Lio/flutter/plugins/firebase/appcheck/FlutterFirebaseAppCheckPlugin;Lio/flutter/plugin/common/MethodChannel$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
