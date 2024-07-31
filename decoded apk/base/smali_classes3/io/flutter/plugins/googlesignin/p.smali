.class public final synthetic Lio/flutter/plugins/googlesignin/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlesignin/p;->a:Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;

    return-void
.end method


# virtual methods
.method public final onMessage(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlesignin/p;->a:Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;

    invoke-static {v0, p1, p2}, Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;->a(Lio/flutter/plugins/googlesignin/Messages$GoogleSignInApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void
.end method
