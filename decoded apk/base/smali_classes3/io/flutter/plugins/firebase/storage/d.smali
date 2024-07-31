.class public final synthetic Lio/flutter/plugins/firebase/storage/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;

.field public final synthetic b:Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/storage/d;->a:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;

    iput-object p2, p0, Lio/flutter/plugins/firebase/storage/d;->b:Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/storage/d;->a:Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;

    iget-object v1, p0, Lio/flutter/plugins/firebase/storage/d;->b:Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;

    invoke-static {v0, v1, p1}, Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;->z(Lio/flutter/plugins/firebase/storage/FlutterFirebaseStoragePlugin;Lio/flutter/plugins/firebase/storage/GeneratedAndroidFirebaseStorage$Result;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
