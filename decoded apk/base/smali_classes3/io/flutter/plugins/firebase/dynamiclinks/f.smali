.class public final synthetic Lio/flutter/plugins/firebase/dynamiclinks/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/firebase/dynamiclinks/FlutterFirebaseDynamicLinksPlugin;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lfd/b;

.field public final synthetic d:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/dynamiclinks/FlutterFirebaseDynamicLinksPlugin;Ljava/lang/String;Lfd/b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/dynamiclinks/f;->a:Lio/flutter/plugins/firebase/dynamiclinks/FlutterFirebaseDynamicLinksPlugin;

    iput-object p2, p0, Lio/flutter/plugins/firebase/dynamiclinks/f;->b:Ljava/lang/String;

    iput-object p3, p0, Lio/flutter/plugins/firebase/dynamiclinks/f;->c:Lfd/b;

    iput-object p4, p0, Lio/flutter/plugins/firebase/dynamiclinks/f;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/firebase/dynamiclinks/f;->a:Lio/flutter/plugins/firebase/dynamiclinks/FlutterFirebaseDynamicLinksPlugin;

    iget-object v1, p0, Lio/flutter/plugins/firebase/dynamiclinks/f;->b:Ljava/lang/String;

    iget-object v2, p0, Lio/flutter/plugins/firebase/dynamiclinks/f;->c:Lfd/b;

    iget-object v3, p0, Lio/flutter/plugins/firebase/dynamiclinks/f;->d:Lcom/google/android/gms/tasks/TaskCompletionSource;

    invoke-static {v0, v1, v2, v3}, Lio/flutter/plugins/firebase/dynamiclinks/FlutterFirebaseDynamicLinksPlugin;->e(Lio/flutter/plugins/firebase/dynamiclinks/FlutterFirebaseDynamicLinksPlugin;Ljava/lang/String;Lfd/b;Lcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
