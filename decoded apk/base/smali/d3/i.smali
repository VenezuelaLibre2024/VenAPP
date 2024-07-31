.class public final synthetic Ld3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ld3/p;

.field public final synthetic b:Lio/flutter/plugin/common/MethodChannel$Result;


# direct methods
.method public synthetic constructor <init>(Ld3/p;Lio/flutter/plugin/common/MethodChannel$Result;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld3/i;->a:Ld3/p;

    iput-object p2, p0, Ld3/i;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ld3/i;->a:Ld3/p;

    iget-object v1, p0, Ld3/i;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-static {v0, v1}, Ld3/p;->c(Ld3/p;Lio/flutter/plugin/common/MethodChannel$Result;)V

    return-void
.end method
