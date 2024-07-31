.class Llh/a$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llh/a$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Llh/a$a;


# direct methods
.method constructor <init>(Llh/a$a;)V
    .locals 0

    iput-object p1, p0, Llh/a$a$b;->a:Llh/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Llh/a$a$b;->a:Llh/a$a;

    iget-object v0, v0, Llh/a$a;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    const-string v1, "Image source cannot be decoded"

    const/4 v2, 0x0

    const-string v3, "INVALID"

    invoke-interface {v0, v3, v1, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
