.class public final synthetic Lio/flutter/plugins/googlesignin/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/googlesignin/BackgroundTaskRunner$Callback;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

.field public final synthetic b:Lio/flutter/plugins/googlesignin/Messages$Result;

.field public final synthetic c:Ljava/lang/Boolean;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Boolean;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlesignin/h;->a:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

    iput-object p2, p0, Lio/flutter/plugins/googlesignin/h;->b:Lio/flutter/plugins/googlesignin/Messages$Result;

    iput-object p3, p0, Lio/flutter/plugins/googlesignin/h;->c:Ljava/lang/Boolean;

    iput-object p4, p0, Lio/flutter/plugins/googlesignin/h;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run(Ljava/util/concurrent/Future;)V
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/h;->a:Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;

    iget-object v1, p0, Lio/flutter/plugins/googlesignin/h;->b:Lio/flutter/plugins/googlesignin/Messages$Result;

    iget-object v2, p0, Lio/flutter/plugins/googlesignin/h;->c:Ljava/lang/Boolean;

    iget-object v3, p0, Lio/flutter/plugins/googlesignin/h;->d:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, p1}, Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;->p(Lio/flutter/plugins/googlesignin/GoogleSignInPlugin$Delegate;Lio/flutter/plugins/googlesignin/Messages$Result;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/concurrent/Future;)V

    return-void
.end method
