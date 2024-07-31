.class public final synthetic Lio/flutter/plugins/firebase/installations/firebase_app_installations/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/firebase/installations/firebase_app_installations/FirebaseInstallationsPlugin;

.field public final synthetic b:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/installations/firebase_app_installations/FirebaseInstallationsPlugin;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/installations/firebase_app_installations/c;->a:Lio/flutter/plugins/firebase/installations/firebase_app_installations/FirebaseInstallationsPlugin;

    iput-object p2, p0, Lio/flutter/plugins/firebase/installations/firebase_app_installations/c;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/installations/firebase_app_installations/c;->a:Lio/flutter/plugins/firebase/installations/firebase_app_installations/FirebaseInstallationsPlugin;

    iget-object v1, p0, Lio/flutter/plugins/firebase/installations/firebase_app_installations/c;->b:Ljava/util/Map;

    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/installations/firebase_app_installations/FirebaseInstallationsPlugin;->b(Lio/flutter/plugins/firebase/installations/firebase_app_installations/FirebaseInstallationsPlugin;Ljava/util/Map;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
