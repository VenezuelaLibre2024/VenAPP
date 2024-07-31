.class public final synthetic Lyh/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lio/flutter/plugin/common/MethodCall;

.field public final synthetic b:Lio/flutter/plugin/common/MethodChannel$Result;

.field public final synthetic c:Lyh/i;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;Lyh/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyh/w;->a:Lio/flutter/plugin/common/MethodCall;

    iput-object p2, p0, Lyh/w;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    iput-object p3, p0, Lyh/w;->c:Lyh/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lyh/w;->a:Lio/flutter/plugin/common/MethodCall;

    iget-object v1, p0, Lyh/w;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    iget-object v2, p0, Lyh/w;->c:Lyh/i;

    invoke-static {v0, v1, v2}, Lyh/b0;->f(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;Lyh/i;)V

    return-void
.end method
