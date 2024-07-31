.class public Lio/flutter/plugins/firebase/appcheck/TokenChannelStreamHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/EventChannel$StreamHandler;


# instance fields
.field private final firebaseAppCheck:Lec/e;

.field private listener:Lec/e$a;


# direct methods
.method public constructor <init>(Lec/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/appcheck/TokenChannelStreamHandler;->firebaseAppCheck:Lec/e;

    return-void
.end method

.method public static synthetic a(Lio/flutter/plugin/common/EventChannel$EventSink;Lec/c;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/plugins/firebase/appcheck/TokenChannelStreamHandler;->lambda$onListen$0(Lio/flutter/plugin/common/EventChannel$EventSink;Lec/c;)V

    return-void
.end method

.method private static synthetic lambda$onListen$0(Lio/flutter/plugin/common/EventChannel$EventSink;Lec/c;)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "token"

    invoke-virtual {p1}, Lec/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0, v0}, Lio/flutter/plugin/common/EventChannel$EventSink;->success(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public onCancel(Ljava/lang/Object;)V
    .locals 1

    iget-object p1, p0, Lio/flutter/plugins/firebase/appcheck/TokenChannelStreamHandler;->listener:Lec/e$a;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lio/flutter/plugins/firebase/appcheck/TokenChannelStreamHandler;->firebaseAppCheck:Lec/e;

    invoke-virtual {v0, p1}, Lec/e;->h(Lec/e$a;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lio/flutter/plugins/firebase/appcheck/TokenChannelStreamHandler;->listener:Lec/e$a;

    :cond_0
    return-void
.end method

.method public onListen(Ljava/lang/Object;Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 0

    new-instance p1, Lio/flutter/plugins/firebase/appcheck/i;

    invoke-direct {p1, p2}, Lio/flutter/plugins/firebase/appcheck/i;-><init>(Lio/flutter/plugin/common/EventChannel$EventSink;)V

    iput-object p1, p0, Lio/flutter/plugins/firebase/appcheck/TokenChannelStreamHandler;->listener:Lec/e$a;

    iget-object p2, p0, Lio/flutter/plugins/firebase/appcheck/TokenChannelStreamHandler;->firebaseAppCheck:Lec/e;

    invoke-virtual {p2, p1}, Lec/e;->c(Lec/e$a;)V

    return-void
.end method
