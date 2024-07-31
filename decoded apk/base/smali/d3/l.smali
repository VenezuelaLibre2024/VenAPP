.class public final synthetic Ld3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ld3/p;

.field public final synthetic b:Lio/flutter/plugin/common/MethodChannel$Result;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ld3/p;Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld3/l;->a:Ld3/p;

    iput-object p2, p0, Ld3/l;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    iput-object p3, p0, Ld3/l;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ld3/l;->a:Ld3/p;

    iget-object v1, p0, Ld3/l;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    iget-object v2, p0, Ld3/l;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld3/p;->j(Ld3/p;Lio/flutter/plugin/common/MethodChannel$Result;Ljava/lang/String;)V

    return-void
.end method
