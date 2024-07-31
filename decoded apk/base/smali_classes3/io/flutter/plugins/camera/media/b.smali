.class public final synthetic Lio/flutter/plugins/camera/media/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/flutter/plugin/common/EventChannel$EventSink;

.field public final synthetic b:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/camera/media/b;->a:Lio/flutter/plugin/common/EventChannel$EventSink;

    iput-object p2, p0, Lio/flutter/plugins/camera/media/b;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/media/b;->a:Lio/flutter/plugin/common/EventChannel$EventSink;

    iget-object v1, p0, Lio/flutter/plugins/camera/media/b;->b:Ljava/util/Map;

    invoke-static {v0, v1}, Lio/flutter/plugins/camera/media/ImageStreamReader;->a(Lio/flutter/plugin/common/EventChannel$EventSink;Ljava/util/Map;)V

    return-void
.end method
