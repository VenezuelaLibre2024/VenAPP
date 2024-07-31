.class public final synthetic Lio/flutter/plugins/googlesignin/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;

.field public final synthetic b:Lcom/google/common/util/concurrent/f;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;Lcom/google/common/util/concurrent/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlesignin/a;->a:Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;

    iput-object p2, p0, Lio/flutter/plugins/googlesignin/a;->b:Lcom/google/common/util/concurrent/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/a;->a:Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;

    iget-object v1, p0, Lio/flutter/plugins/googlesignin/a;->b:Lcom/google/common/util/concurrent/f;

    invoke-static {v0, v1}, Lio/flutter/plugins/googlesignin/BackgroundTaskRunner;->b(Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;Lcom/google/common/util/concurrent/f;)V

    return-void
.end method
