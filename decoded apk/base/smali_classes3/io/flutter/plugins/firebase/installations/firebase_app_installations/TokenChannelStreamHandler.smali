.class public Lio/flutter/plugins/firebase/installations/firebase_app_installations/TokenChannelStreamHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/EventChannel$StreamHandler;


# instance fields
.field private final firebaseInstallations:Lcom/google/firebase/installations/c;

.field private listener:Lge/a;


# direct methods
.method public constructor <init>(Lcom/google/firebase/installations/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/installations/firebase_app_installations/TokenChannelStreamHandler;->firebaseInstallations:Lcom/google/firebase/installations/c;

    return-void
.end method

.method public static synthetic a(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/firebase/installations/firebase_app_installations/TokenChannelStreamHandler;->lambda$createTokenEventListener$0(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/lang/String;)V

    return-void
.end method

.method private static synthetic lambda$createTokenEventListener$0(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "token"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0, v0}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method createTokenEventListener(Lio/flutter/plugin/common/EventChannel$EventSink;)Lge/a;
    .locals 1

    new-instance v0, Lio/flutter/plugins/firebase/installations/firebase_app_installations/h;

    invoke-direct {v0, p1}, Lio/flutter/plugins/firebase/installations/firebase_app_installations/h;-><init>(Lio/flutter/plugin/common/EventChannel$EventSink;)V

    return-object v0
.end method

.method public onCancel(Ljava/lang/Object;)V
    .locals 0

    iget-object p1, p0, Lio/flutter/plugins/firebase/installations/firebase_app_installations/TokenChannelStreamHandler;->listener:Lge/a;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lio/flutter/plugins/firebase/installations/firebase_app_installations/TokenChannelStreamHandler;->listener:Lge/a;

    :cond_0
    return-void
.end method

.method public onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 0

    invoke-virtual {p0, p2}, Lio/flutter/plugins/firebase/installations/firebase_app_installations/TokenChannelStreamHandler;->createTokenEventListener(Lio/flutter/plugin/common/EventChannel$EventSink;)Lge/a;

    move-result-object p1

    iput-object p1, p0, Lio/flutter/plugins/firebase/installations/firebase_app_installations/TokenChannelStreamHandler;->listener:Lge/a;

    iget-object p2, p0, Lio/flutter/plugins/firebase/installations/firebase_app_installations/TokenChannelStreamHandler;->firebaseInstallations:Lcom/google/firebase/installations/c;

    invoke-virtual {p2, p1}, Lcom/google/firebase/installations/c;->E(Lge/a;)Lge/b;

    return-void
.end method
