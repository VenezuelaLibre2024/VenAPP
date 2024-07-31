.class public final synthetic Lio/flutter/plugins/firebase/appcheck/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec/e$a;


# instance fields
.field public final synthetic a:Lio/flutter/plugin/common/EventChannel$EventSink;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/common/EventChannel$EventSink;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/appcheck/i;->a:Lio/flutter/plugin/common/EventChannel$EventSink;

    return-void
.end method


# virtual methods
.method public final a(Lec/c;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/firebase/appcheck/i;->a:Lio/flutter/plugin/common/EventChannel$EventSink;

    invoke-static {v0, p1}, Lio/flutter/plugins/firebase/appcheck/TokenChannelStreamHandler;->a(Lio/flutter/plugin/common/EventChannel$EventSink;Lec/c;)V

    return-void
.end method
