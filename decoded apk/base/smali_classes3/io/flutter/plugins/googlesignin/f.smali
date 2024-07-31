.class public final synthetic Lio/flutter/plugins/googlesignin/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/googlesignin/Messages$Result;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/googlesignin/Messages$Result;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlesignin/f;->a:Lio/flutter/plugins/googlesignin/Messages$Result;

    return-void
.end method


# virtual methods
.method public final run(Ljava/util/concurrent/Future;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/f;->a:Lio/flutter/plugins/googlesignin/Messages$Result;

    invoke-static {v0, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->m(Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/util/concurrent/Future;)V

    return-void
.end method
