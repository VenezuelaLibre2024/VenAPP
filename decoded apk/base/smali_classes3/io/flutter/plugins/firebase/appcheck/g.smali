.class public final synthetic Lio/flutter/plugins/firebase/appcheck/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/firebase/appcheck/FlutterFirebaseAppCheckPlugin;

.field public final synthetic b:Ljava/util/Map;

.field public final synthetic c:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/appcheck/FlutterFirebaseAppCheckPlugin;Ljava/util/Map;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/appcheck/g;->a:Lio/flutter/plugins/firebase/appcheck/FlutterFirebaseAppCheckPlugin;

    iput-object p2, p0, Lio/flutter/plugins/firebase/appcheck/g;->b:Ljava/util/Map;

    iput-object p3, p0, Lio/flutter/plugins/firebase/appcheck/g;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/firebase/appcheck/g;->a:Lio/flutter/plugins/firebase/appcheck/FlutterFirebaseAppCheckPlugin;

    iget-object v1, p0, Lio/flutter/plugins/firebase/appcheck/g;->b:Ljava/util/Map;

    iget-object v2, p0, Lio/flutter/plugins/firebase/appcheck/g;->c:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1, v2}, Lio/flutter/plugins/firebase/appcheck/FlutterFirebaseAppCheckPlugin;->c(Lio/flutter/plugins/firebase/appcheck/FlutterFirebaseAppCheckPlugin;Ljava/util/Map;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method