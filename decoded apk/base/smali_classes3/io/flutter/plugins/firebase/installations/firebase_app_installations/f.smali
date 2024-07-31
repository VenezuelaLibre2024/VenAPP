.class public final synthetic Lio/flutter/plugins/firebase/installations/firebase_app_installations/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lio/flutter/plugins/firebase/installations/firebase_app_installations/FirebaseInstallationsPlugin;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
