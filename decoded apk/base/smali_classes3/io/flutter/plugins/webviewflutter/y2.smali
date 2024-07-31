.class public final synthetic Lio/flutter/plugins/webviewflutter/y2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/webviewflutter/InstanceManager;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/webviewflutter/InstanceManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/y2;->a:Lio/flutter/plugins/webviewflutter/InstanceManager;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/y2;->a:Lio/flutter/plugins/webviewflutter/InstanceManager;

    invoke-static {v0}, Lio/flutter/plugins/webviewflutter/InstanceManager;->a(Lio/flutter/plugins/webviewflutter/InstanceManager;)V

    return-void
.end method
