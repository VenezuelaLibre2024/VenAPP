.class public final synthetic Lio/flutter/plugins/firebase/core/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$Result;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$Result;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/core/b;->a:Lio/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$Result;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/firebase/core/b;->a:Lio/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$Result;

    invoke-static {v0, p1}, Lio/flutter/plugins/firebase/core/FlutterFirebaseCorePlugin;->j(Lio/flutter/plugins/firebase/core/GeneratedAndroidFirebaseCore$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method