.class Llh/a$a$d;
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
.field final synthetic a:Ljava/io/IOException;

.field final synthetic b:Llh/a$a;


# direct methods
.method constructor <init>(Llh/a$a;Ljava/io/IOException;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Llh/a$a$d;->b:Llh/a$a;

    iput-object p2, p0, Llh/a$a$d;->a:Ljava/io/IOException;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Llh/a$a$d;->b:Llh/a$a;

    iget-object v0, v0, Llh/a$a;->b:Lio/flutter/plugin/common/MethodChannel$Result;

    const-string v1, "Image could not be saved"

    iget-object v2, p0, Llh/a$a$d;->a:Ljava/io/IOException;

    const-string v3, "INVALID"

    invoke-interface {v0, v3, v1, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
