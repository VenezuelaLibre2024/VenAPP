.class public final synthetic Lio/flutter/plugins/firebase/installations/firebase_app_installations/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lge/a;


# instance fields
.field public final synthetic a:Lio/flutter/plugin/common/EventChannel$EventSink;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/installations/firebase_app_installations/h;->a:Lio/flutter/plugin/common/EventChannel$EventSink;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/firebase/installations/firebase_app_installations/h;->a:Lio/flutter/plugin/common/EventChannel$EventSink;

    invoke-static {v0, p1}, Lio/flutter/plugins/firebase/installations/firebase_app_installations/TokenChannelStreamHandler;->a(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/lang/String;)V

    return-void
.end method
