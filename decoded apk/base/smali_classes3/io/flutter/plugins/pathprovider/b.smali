.class public final synthetic Lio/flutter/plugins/pathprovider/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugin/common/BasicMessageChannel$MessageHandler;


# instance fields
.field public final synthetic a:Lio/flutter/plugins/pathprovider/Messages$PathProviderApi;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/pathprovider/Messages$PathProviderApi;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/pathprovider/b;->a:Lio/flutter/plugins/pathprovider/Messages$PathProviderApi;

    return-void
.end method


# virtual methods
.method public final onMessage(Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/pathprovider/b;->a:Lio/flutter/plugins/pathprovider/Messages$PathProviderApi;

    invoke-static {v0, p1, p2}, Lio/flutter/plugins/pathprovider/Messages$PathProviderApi;->b(Lio/flutter/plugins/pathprovider/Messages$PathProviderApi;Ljava/lang/Object;Lio/flutter/plugin/common/BasicMessageChannel$Reply;)V

    return-void
.end method
